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

package org.goodreturn.service.persistence;

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

import org.goodreturn.NoSuchTeamLenderLoanException;

import org.goodreturn.model.TeamLenderLoan;
import org.goodreturn.model.impl.TeamLenderLoanImpl;
import org.goodreturn.model.impl.TeamLenderLoanModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the team lender loan service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author gilaa004
 * @see TeamLenderLoanPersistence
 * @see TeamLenderLoanUtil
 * @generated
 */
public class TeamLenderLoanPersistenceImpl extends BasePersistenceImpl<TeamLenderLoan>
	implements TeamLenderLoanPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TeamLenderLoanUtil} to access the team lender loan persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TeamLenderLoanImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TeamLenderLoanModelImpl.ENTITY_CACHE_ENABLED,
			TeamLenderLoanModelImpl.FINDER_CACHE_ENABLED,
			TeamLenderLoanImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TeamLenderLoanModelImpl.ENTITY_CACHE_ENABLED,
			TeamLenderLoanModelImpl.FINDER_CACHE_ENABLED,
			TeamLenderLoanImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TeamLenderLoanModelImpl.ENTITY_CACHE_ENABLED,
			TeamLenderLoanModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the team lender loan in the entity cache if it is enabled.
	 *
	 * @param teamLenderLoan the team lender loan
	 */
	public void cacheResult(TeamLenderLoan teamLenderLoan) {
		EntityCacheUtil.putResult(TeamLenderLoanModelImpl.ENTITY_CACHE_ENABLED,
			TeamLenderLoanImpl.class, teamLenderLoan.getPrimaryKey(),
			teamLenderLoan);

		teamLenderLoan.resetOriginalValues();
	}

	/**
	 * Caches the team lender loans in the entity cache if it is enabled.
	 *
	 * @param teamLenderLoans the team lender loans
	 */
	public void cacheResult(List<TeamLenderLoan> teamLenderLoans) {
		for (TeamLenderLoan teamLenderLoan : teamLenderLoans) {
			if (EntityCacheUtil.getResult(
						TeamLenderLoanModelImpl.ENTITY_CACHE_ENABLED,
						TeamLenderLoanImpl.class, teamLenderLoan.getPrimaryKey()) == null) {
				cacheResult(teamLenderLoan);
			}
			else {
				teamLenderLoan.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all team lender loans.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(TeamLenderLoanImpl.class.getName());
		}

		EntityCacheUtil.clearCache(TeamLenderLoanImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the team lender loan.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TeamLenderLoan teamLenderLoan) {
		EntityCacheUtil.removeResult(TeamLenderLoanModelImpl.ENTITY_CACHE_ENABLED,
			TeamLenderLoanImpl.class, teamLenderLoan.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<TeamLenderLoan> teamLenderLoans) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TeamLenderLoan teamLenderLoan : teamLenderLoans) {
			EntityCacheUtil.removeResult(TeamLenderLoanModelImpl.ENTITY_CACHE_ENABLED,
				TeamLenderLoanImpl.class, teamLenderLoan.getPrimaryKey());
		}
	}

	/**
	 * Creates a new team lender loan with the primary key. Does not add the team lender loan to the database.
	 *
	 * @param account_Id the primary key for the new team lender loan
	 * @return the new team lender loan
	 */
	public TeamLenderLoan create(long account_Id) {
		TeamLenderLoan teamLenderLoan = new TeamLenderLoanImpl();

		teamLenderLoan.setNew(true);
		teamLenderLoan.setPrimaryKey(account_Id);

		return teamLenderLoan;
	}

	/**
	 * Removes the team lender loan with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param account_Id the primary key of the team lender loan
	 * @return the team lender loan that was removed
	 * @throws org.goodreturn.NoSuchTeamLenderLoanException if a team lender loan with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TeamLenderLoan remove(long account_Id)
		throws NoSuchTeamLenderLoanException, SystemException {
		return remove(Long.valueOf(account_Id));
	}

	/**
	 * Removes the team lender loan with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the team lender loan
	 * @return the team lender loan that was removed
	 * @throws org.goodreturn.NoSuchTeamLenderLoanException if a team lender loan with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TeamLenderLoan remove(Serializable primaryKey)
		throws NoSuchTeamLenderLoanException, SystemException {
		Session session = null;

		try {
			session = openSession();

			TeamLenderLoan teamLenderLoan = (TeamLenderLoan)session.get(TeamLenderLoanImpl.class,
					primaryKey);

			if (teamLenderLoan == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTeamLenderLoanException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(teamLenderLoan);
		}
		catch (NoSuchTeamLenderLoanException nsee) {
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
	protected TeamLenderLoan removeImpl(TeamLenderLoan teamLenderLoan)
		throws SystemException {
		teamLenderLoan = toUnwrappedModel(teamLenderLoan);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, teamLenderLoan);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(teamLenderLoan);

		return teamLenderLoan;
	}

	@Override
	public TeamLenderLoan updateImpl(
		org.goodreturn.model.TeamLenderLoan teamLenderLoan, boolean merge)
		throws SystemException {
		teamLenderLoan = toUnwrappedModel(teamLenderLoan);

		boolean isNew = teamLenderLoan.isNew();

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, teamLenderLoan, merge);

			teamLenderLoan.setNew(false);
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

		EntityCacheUtil.putResult(TeamLenderLoanModelImpl.ENTITY_CACHE_ENABLED,
			TeamLenderLoanImpl.class, teamLenderLoan.getPrimaryKey(),
			teamLenderLoan);

		return teamLenderLoan;
	}

	protected TeamLenderLoan toUnwrappedModel(TeamLenderLoan teamLenderLoan) {
		if (teamLenderLoan instanceof TeamLenderLoanImpl) {
			return teamLenderLoan;
		}

		TeamLenderLoanImpl teamLenderLoanImpl = new TeamLenderLoanImpl();

		teamLenderLoanImpl.setNew(teamLenderLoan.isNew());
		teamLenderLoanImpl.setPrimaryKey(teamLenderLoan.getPrimaryKey());

		teamLenderLoanImpl.setAccount_Id(teamLenderLoan.getAccount_Id());

		return teamLenderLoanImpl;
	}

	/**
	 * Returns the team lender loan with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the team lender loan
	 * @return the team lender loan
	 * @throws com.liferay.portal.NoSuchModelException if a team lender loan with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TeamLenderLoan findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the team lender loan with the primary key or throws a {@link org.goodreturn.NoSuchTeamLenderLoanException} if it could not be found.
	 *
	 * @param account_Id the primary key of the team lender loan
	 * @return the team lender loan
	 * @throws org.goodreturn.NoSuchTeamLenderLoanException if a team lender loan with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TeamLenderLoan findByPrimaryKey(long account_Id)
		throws NoSuchTeamLenderLoanException, SystemException {
		TeamLenderLoan teamLenderLoan = fetchByPrimaryKey(account_Id);

		if (teamLenderLoan == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + account_Id);
			}

			throw new NoSuchTeamLenderLoanException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				account_Id);
		}

		return teamLenderLoan;
	}

	/**
	 * Returns the team lender loan with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the team lender loan
	 * @return the team lender loan, or <code>null</code> if a team lender loan with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TeamLenderLoan fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the team lender loan with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param account_Id the primary key of the team lender loan
	 * @return the team lender loan, or <code>null</code> if a team lender loan with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TeamLenderLoan fetchByPrimaryKey(long account_Id)
		throws SystemException {
		TeamLenderLoan teamLenderLoan = (TeamLenderLoan)EntityCacheUtil.getResult(TeamLenderLoanModelImpl.ENTITY_CACHE_ENABLED,
				TeamLenderLoanImpl.class, account_Id);

		if (teamLenderLoan == _nullTeamLenderLoan) {
			return null;
		}

		if (teamLenderLoan == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				teamLenderLoan = (TeamLenderLoan)session.get(TeamLenderLoanImpl.class,
						Long.valueOf(account_Id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (teamLenderLoan != null) {
					cacheResult(teamLenderLoan);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(TeamLenderLoanModelImpl.ENTITY_CACHE_ENABLED,
						TeamLenderLoanImpl.class, account_Id,
						_nullTeamLenderLoan);
				}

				closeSession(session);
			}
		}

		return teamLenderLoan;
	}

	/**
	 * Returns all the team lender loans.
	 *
	 * @return the team lender loans
	 * @throws SystemException if a system exception occurred
	 */
	public List<TeamLenderLoan> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the team lender loans.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of team lender loans
	 * @param end the upper bound of the range of team lender loans (not inclusive)
	 * @return the range of team lender loans
	 * @throws SystemException if a system exception occurred
	 */
	public List<TeamLenderLoan> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the team lender loans.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of team lender loans
	 * @param end the upper bound of the range of team lender loans (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of team lender loans
	 * @throws SystemException if a system exception occurred
	 */
	public List<TeamLenderLoan> findAll(int start, int end,
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

		List<TeamLenderLoan> list = (List<TeamLenderLoan>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TEAMLENDERLOAN);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TEAMLENDERLOAN.concat(TeamLenderLoanModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<TeamLenderLoan>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<TeamLenderLoan>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Removes all the team lender loans from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (TeamLenderLoan teamLenderLoan : findAll()) {
			remove(teamLenderLoan);
		}
	}

	/**
	 * Returns the number of team lender loans.
	 *
	 * @return the number of team lender loans
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_TEAMLENDERLOAN);

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
	 * Initializes the team lender loan persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.goodreturn.model.TeamLenderLoan")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<TeamLenderLoan>> listenersList = new ArrayList<ModelListener<TeamLenderLoan>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<TeamLenderLoan>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(TeamLenderLoanImpl.class.getName());
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
	private static final String _SQL_SELECT_TEAMLENDERLOAN = "SELECT teamLenderLoan FROM TeamLenderLoan teamLenderLoan";
	private static final String _SQL_COUNT_TEAMLENDERLOAN = "SELECT COUNT(teamLenderLoan) FROM TeamLenderLoan teamLenderLoan";
	private static final String _ORDER_BY_ENTITY_ALIAS = "teamLenderLoan.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TeamLenderLoan exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(TeamLenderLoanPersistenceImpl.class);
	private static TeamLenderLoan _nullTeamLenderLoan = new TeamLenderLoanImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<TeamLenderLoan> toCacheModel() {
				return _nullTeamLenderLoanCacheModel;
			}
		};

	private static CacheModel<TeamLenderLoan> _nullTeamLenderLoanCacheModel = new CacheModel<TeamLenderLoan>() {
			public TeamLenderLoan toEntityModel() {
				return _nullTeamLenderLoan;
			}
		};
}