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

package com.test.service.persistence;

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

import com.test.NoSuchTeamException;

import com.test.model.Team;
import com.test.model.impl.TeamImpl;
import com.test.model.impl.TeamModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the team service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author gilaa004
 * @see TeamPersistence
 * @see TeamUtil
 * @generated
 */
public class TeamPersistenceImpl extends BasePersistenceImpl<Team>
	implements TeamPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TeamUtil} to access the team persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TeamImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TeamModelImpl.ENTITY_CACHE_ENABLED,
			TeamModelImpl.FINDER_CACHE_ENABLED, TeamImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TeamModelImpl.ENTITY_CACHE_ENABLED,
			TeamModelImpl.FINDER_CACHE_ENABLED, TeamImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TeamModelImpl.ENTITY_CACHE_ENABLED,
			TeamModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the team in the entity cache if it is enabled.
	 *
	 * @param team the team
	 */
	public void cacheResult(Team team) {
		EntityCacheUtil.putResult(TeamModelImpl.ENTITY_CACHE_ENABLED,
			TeamImpl.class, team.getPrimaryKey(), team);

		team.resetOriginalValues();
	}

	/**
	 * Caches the teams in the entity cache if it is enabled.
	 *
	 * @param teams the teams
	 */
	public void cacheResult(List<Team> teams) {
		for (Team team : teams) {
			if (EntityCacheUtil.getResult(TeamModelImpl.ENTITY_CACHE_ENABLED,
						TeamImpl.class, team.getPrimaryKey()) == null) {
				cacheResult(team);
			}
			else {
				team.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all teams.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(TeamImpl.class.getName());
		}

		EntityCacheUtil.clearCache(TeamImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the team.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Team team) {
		EntityCacheUtil.removeResult(TeamModelImpl.ENTITY_CACHE_ENABLED,
			TeamImpl.class, team.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Team> teams) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Team team : teams) {
			EntityCacheUtil.removeResult(TeamModelImpl.ENTITY_CACHE_ENABLED,
				TeamImpl.class, team.getPrimaryKey());
		}
	}

	/**
	 * Creates a new team with the primary key. Does not add the team to the database.
	 *
	 * @param team_Id the primary key for the new team
	 * @return the new team
	 */
	public Team create(long team_Id) {
		Team team = new TeamImpl();

		team.setNew(true);
		team.setPrimaryKey(team_Id);

		return team;
	}

	/**
	 * Removes the team with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param team_Id the primary key of the team
	 * @return the team that was removed
	 * @throws com.test.NoSuchTeamException if a team with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Team remove(long team_Id)
		throws NoSuchTeamException, SystemException {
		return remove(Long.valueOf(team_Id));
	}

	/**
	 * Removes the team with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the team
	 * @return the team that was removed
	 * @throws com.test.NoSuchTeamException if a team with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Team remove(Serializable primaryKey)
		throws NoSuchTeamException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Team team = (Team)session.get(TeamImpl.class, primaryKey);

			if (team == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTeamException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(team);
		}
		catch (NoSuchTeamException nsee) {
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
	protected Team removeImpl(Team team) throws SystemException {
		team = toUnwrappedModel(team);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, team);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(team);

		return team;
	}

	@Override
	public Team updateImpl(com.test.model.Team team, boolean merge)
		throws SystemException {
		team = toUnwrappedModel(team);

		boolean isNew = team.isNew();

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, team, merge);

			team.setNew(false);
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

		EntityCacheUtil.putResult(TeamModelImpl.ENTITY_CACHE_ENABLED,
			TeamImpl.class, team.getPrimaryKey(), team);

		return team;
	}

	protected Team toUnwrappedModel(Team team) {
		if (team instanceof TeamImpl) {
			return team;
		}

		TeamImpl teamImpl = new TeamImpl();

		teamImpl.setNew(team.isNew());
		teamImpl.setPrimaryKey(team.getPrimaryKey());

		teamImpl.setTeam_Id(team.getTeam_Id());
		teamImpl.setTeam_Name(team.getTeam_Name());
		teamImpl.setAmount_Lent(team.getAmount_Lent());

		return teamImpl;
	}

	/**
	 * Returns the team with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the team
	 * @return the team
	 * @throws com.liferay.portal.NoSuchModelException if a team with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Team findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the team with the primary key or throws a {@link com.test.NoSuchTeamException} if it could not be found.
	 *
	 * @param team_Id the primary key of the team
	 * @return the team
	 * @throws com.test.NoSuchTeamException if a team with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Team findByPrimaryKey(long team_Id)
		throws NoSuchTeamException, SystemException {
		Team team = fetchByPrimaryKey(team_Id);

		if (team == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + team_Id);
			}

			throw new NoSuchTeamException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				team_Id);
		}

		return team;
	}

	/**
	 * Returns the team with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the team
	 * @return the team, or <code>null</code> if a team with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Team fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the team with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param team_Id the primary key of the team
	 * @return the team, or <code>null</code> if a team with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Team fetchByPrimaryKey(long team_Id) throws SystemException {
		Team team = (Team)EntityCacheUtil.getResult(TeamModelImpl.ENTITY_CACHE_ENABLED,
				TeamImpl.class, team_Id);

		if (team == _nullTeam) {
			return null;
		}

		if (team == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				team = (Team)session.get(TeamImpl.class, Long.valueOf(team_Id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (team != null) {
					cacheResult(team);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(TeamModelImpl.ENTITY_CACHE_ENABLED,
						TeamImpl.class, team_Id, _nullTeam);
				}

				closeSession(session);
			}
		}

		return team;
	}

	/**
	 * Returns all the teams.
	 *
	 * @return the teams
	 * @throws SystemException if a system exception occurred
	 */
	public List<Team> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the teams.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of teams
	 * @param end the upper bound of the range of teams (not inclusive)
	 * @return the range of teams
	 * @throws SystemException if a system exception occurred
	 */
	public List<Team> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the teams.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of teams
	 * @param end the upper bound of the range of teams (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of teams
	 * @throws SystemException if a system exception occurred
	 */
	public List<Team> findAll(int start, int end,
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

		List<Team> list = (List<Team>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TEAM);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TEAM.concat(TeamModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<Team>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);
				}
				else {
					list = (List<Team>)QueryUtil.list(q, getDialect(), start,
							end);
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
	 * Removes all the teams from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (Team team : findAll()) {
			remove(team);
		}
	}

	/**
	 * Returns the number of teams.
	 *
	 * @return the number of teams
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_TEAM);

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
	 * Initializes the team persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.test.model.Team")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Team>> listenersList = new ArrayList<ModelListener<Team>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Team>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(TeamImpl.class.getName());
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
	private static final String _SQL_SELECT_TEAM = "SELECT team FROM Team team";
	private static final String _SQL_COUNT_TEAM = "SELECT COUNT(team) FROM Team team";
	private static final String _ORDER_BY_ENTITY_ALIAS = "team.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Team exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(TeamPersistenceImpl.class);
	private static Team _nullTeam = new TeamImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Team> toCacheModel() {
				return _nullTeamCacheModel;
			}
		};

	private static CacheModel<Team> _nullTeamCacheModel = new CacheModel<Team>() {
			public Team toEntityModel() {
				return _nullTeam;
			}
		};
}