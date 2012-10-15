/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package org.GoodReturn.service.persistence;

import com.liferay.portal.NoSuchModelException;
import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.BatchSessionUtil;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import org.GoodReturn.NoSuchTeamLenderException;

import org.GoodReturn.model.TeamLender;
import org.GoodReturn.model.impl.TeamLenderImpl;
import org.GoodReturn.model.impl.TeamLenderModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the team lender service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author gilaa004
 * @see TeamLenderPersistence
 * @see TeamLenderUtil
 * @generated
 */
public class TeamLenderPersistenceImpl extends BasePersistenceImpl<TeamLender>
	implements TeamLenderPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TeamLenderUtil} to access the team lender persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TeamLenderImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TeamLenderModelImpl.ENTITY_CACHE_ENABLED,
			TeamLenderModelImpl.FINDER_CACHE_ENABLED, TeamLenderImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TeamLenderModelImpl.ENTITY_CACHE_ENABLED,
			TeamLenderModelImpl.FINDER_CACHE_ENABLED, TeamLenderImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TeamLenderModelImpl.ENTITY_CACHE_ENABLED,
			TeamLenderModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the team lender in the entity cache if it is enabled.
	 *
	 * @param teamLender the team lender
	 */
	public void cacheResult(TeamLender teamLender) {
		EntityCacheUtil.putResult(TeamLenderModelImpl.ENTITY_CACHE_ENABLED,
			TeamLenderImpl.class, teamLender.getPrimaryKey(), teamLender);

		teamLender.resetOriginalValues();
	}

	/**
	 * Caches the team lenders in the entity cache if it is enabled.
	 *
	 * @param teamLenders the team lenders
	 */
	public void cacheResult(List<TeamLender> teamLenders) {
		for (TeamLender teamLender : teamLenders) {
			if (EntityCacheUtil.getResult(
						TeamLenderModelImpl.ENTITY_CACHE_ENABLED,
						TeamLenderImpl.class, teamLender.getPrimaryKey()) == null) {
				cacheResult(teamLender);
			}
			else {
				teamLender.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all team lenders.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(TeamLenderImpl.class.getName());
		}

		EntityCacheUtil.clearCache(TeamLenderImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the team lender.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TeamLender teamLender) {
		EntityCacheUtil.removeResult(TeamLenderModelImpl.ENTITY_CACHE_ENABLED,
			TeamLenderImpl.class, teamLender.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<TeamLender> teamLenders) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TeamLender teamLender : teamLenders) {
			EntityCacheUtil.removeResult(TeamLenderModelImpl.ENTITY_CACHE_ENABLED,
				TeamLenderImpl.class, teamLender.getPrimaryKey());
		}
	}

	/**
	 * Creates a new team lender with the primary key. Does not add the team lender to the database.
	 *
	 * @param teamlender_Id the primary key for the new team lender
	 * @return the new team lender
	 */
	public TeamLender create(long teamlender_Id) {
		TeamLender teamLender = new TeamLenderImpl();

		teamLender.setNew(true);
		teamLender.setPrimaryKey(teamlender_Id);

		return teamLender;
	}

	/**
	 * Removes the team lender with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param teamlender_Id the primary key of the team lender
	 * @return the team lender that was removed
	 * @throws org.GoodReturn.NoSuchTeamLenderException if a team lender with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TeamLender remove(long teamlender_Id)
		throws NoSuchTeamLenderException, SystemException {
		return remove(Long.valueOf(teamlender_Id));
	}

	/**
	 * Removes the team lender with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the team lender
	 * @return the team lender that was removed
	 * @throws org.GoodReturn.NoSuchTeamLenderException if a team lender with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TeamLender remove(Serializable primaryKey)
		throws NoSuchTeamLenderException, SystemException {
		Session session = null;

		try {
			session = openSession();

			TeamLender teamLender = (TeamLender)session.get(TeamLenderImpl.class,
					primaryKey);

			if (teamLender == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTeamLenderException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(teamLender);
		}
		catch (NoSuchTeamLenderException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected TeamLender removeImpl(TeamLender teamLender)
		throws SystemException {
		teamLender = toUnwrappedModel(teamLender);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, teamLender);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(teamLender);

		return teamLender;
	}

	@Override
	public TeamLender updateImpl(org.GoodReturn.model.TeamLender teamLender,
		boolean merge) throws SystemException {
		teamLender = toUnwrappedModel(teamLender);

		boolean isNew = teamLender.isNew();

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, teamLender, merge);

			teamLender.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(TeamLenderModelImpl.ENTITY_CACHE_ENABLED,
			TeamLenderImpl.class, teamLender.getPrimaryKey(), teamLender);

		return teamLender;
	}

	protected TeamLender toUnwrappedModel(TeamLender teamLender) {
		if (teamLender instanceof TeamLenderImpl) {
			return teamLender;
		}

		TeamLenderImpl teamLenderImpl = new TeamLenderImpl();

		teamLenderImpl.setNew(teamLender.isNew());
		teamLenderImpl.setPrimaryKey(teamLender.getPrimaryKey());

		teamLenderImpl.setTeamlender_Id(teamLender.getTeamlender_Id());

		return teamLenderImpl;
	}

	/**
	 * Returns the team lender with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the team lender
	 * @return the team lender
	 * @throws com.liferay.portal.NoSuchModelException if a team lender with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TeamLender findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the team lender with the primary key or throws a {@link org.GoodReturn.NoSuchTeamLenderException} if it could not be found.
	 *
	 * @param teamlender_Id the primary key of the team lender
	 * @return the team lender
	 * @throws org.GoodReturn.NoSuchTeamLenderException if a team lender with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TeamLender findByPrimaryKey(long teamlender_Id)
		throws NoSuchTeamLenderException, SystemException {
		TeamLender teamLender = fetchByPrimaryKey(teamlender_Id);

		if (teamLender == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + teamlender_Id);
			}

			throw new NoSuchTeamLenderException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				teamlender_Id);
		}

		return teamLender;
	}

	/**
	 * Returns the team lender with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the team lender
	 * @return the team lender, or <code>null</code> if a team lender with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TeamLender fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the team lender with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param teamlender_Id the primary key of the team lender
	 * @return the team lender, or <code>null</code> if a team lender with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TeamLender fetchByPrimaryKey(long teamlender_Id)
		throws SystemException {
		TeamLender teamLender = (TeamLender)EntityCacheUtil.getResult(TeamLenderModelImpl.ENTITY_CACHE_ENABLED,
				TeamLenderImpl.class, teamlender_Id);

		if (teamLender == _nullTeamLender) {
			return null;
		}

		if (teamLender == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				teamLender = (TeamLender)session.get(TeamLenderImpl.class,
						Long.valueOf(teamlender_Id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (teamLender != null) {
					cacheResult(teamLender);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(TeamLenderModelImpl.ENTITY_CACHE_ENABLED,
						TeamLenderImpl.class, teamlender_Id, _nullTeamLender);
				}

				closeSession(session);
			}
		}

		return teamLender;
	}

	/**
	 * Returns all the team lenders.
	 *
	 * @return the team lenders
	 * @throws SystemException if a system exception occurred
	 */
	public List<TeamLender> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the team lenders.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of team lenders
	 * @param end the upper bound of the range of team lenders (not inclusive)
	 * @return the range of team lenders
	 * @throws SystemException if a system exception occurred
	 */
	public List<TeamLender> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the team lenders.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of team lenders
	 * @param end the upper bound of the range of team lenders (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of team lenders
	 * @throws SystemException if a system exception occurred
	 */
	public List<TeamLender> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = new Object[] { start, end, orderByComparator };

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<TeamLender> list = (List<TeamLender>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TEAMLENDER);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TEAMLENDER.concat(TeamLenderModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<TeamLender>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<TeamLender>)QueryUtil.list(q, getDialect(),
							start, end);
				}
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(finderPath, finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(finderPath, finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the team lenders from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (TeamLender teamLender : findAll()) {
			remove(teamLender);
		}
	}

	/**
	 * Returns the number of team lenders.
	 *
	 * @return the number of team lenders
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_TEAMLENDER);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the team lender persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.GoodReturn.model.TeamLender")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<TeamLender>> listenersList = new ArrayList<ModelListener<TeamLender>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<TeamLender>)InstanceFactory.newInstance(
							listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(TeamLenderImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@BeanReference(type = BorrowerPersistence.class)
	protected BorrowerPersistence borrowerPersistence;
	@BeanReference(type = Gift_CertificatePersistence.class)
	protected Gift_CertificatePersistence gift_CertificatePersistence;
	@BeanReference(type = LenderPersistence.class)
	protected LenderPersistence lenderPersistence;
	@BeanReference(type = PersonPersistence.class)
	protected PersonPersistence personPersistence;
	@BeanReference(type = StoryPersistence.class)
	protected StoryPersistence storyPersistence;
	@BeanReference(type = Supplementary_TablePersistence.class)
	protected Supplementary_TablePersistence supplementary_TablePersistence;
	@BeanReference(type = TeamPersistence.class)
	protected TeamPersistence teamPersistence;
	@BeanReference(type = TeamLenderPersistence.class)
	protected TeamLenderPersistence teamLenderPersistence;
	@BeanReference(type = TeamLenderLoanPersistence.class)
	protected TeamLenderLoanPersistence teamLenderLoanPersistence;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private static final String _SQL_SELECT_TEAMLENDER = "SELECT teamLender FROM TeamLender teamLender";
	private static final String _SQL_COUNT_TEAMLENDER = "SELECT COUNT(teamLender) FROM TeamLender teamLender";
	private static final String _ORDER_BY_ENTITY_ALIAS = "teamLender.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TeamLender exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(TeamLenderPersistenceImpl.class);
	private static TeamLender _nullTeamLender = new TeamLenderImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<TeamLender> toCacheModel() {
				return _nullTeamLenderCacheModel;
			}
		};

	private static CacheModel<TeamLender> _nullTeamLenderCacheModel = new CacheModel<TeamLender>() {
			public TeamLender toEntityModel() {
				return _nullTeamLender;
			}
		};
}