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

import com.test.NoSuchSupplementary_TableException;

import com.test.model.Supplementary_Table;
import com.test.model.impl.Supplementary_TableImpl;
import com.test.model.impl.Supplementary_TableModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the supplementary_ table service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author gilaa004
 * @see Supplementary_TablePersistence
 * @see Supplementary_TableUtil
 * @generated
 */
public class Supplementary_TablePersistenceImpl extends BasePersistenceImpl<Supplementary_Table>
	implements Supplementary_TablePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link Supplementary_TableUtil} to access the supplementary_ table persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = Supplementary_TableImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(Supplementary_TableModelImpl.ENTITY_CACHE_ENABLED,
			Supplementary_TableModelImpl.FINDER_CACHE_ENABLED,
			Supplementary_TableImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(Supplementary_TableModelImpl.ENTITY_CACHE_ENABLED,
			Supplementary_TableModelImpl.FINDER_CACHE_ENABLED,
			Supplementary_TableImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(Supplementary_TableModelImpl.ENTITY_CACHE_ENABLED,
			Supplementary_TableModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the supplementary_ table in the entity cache if it is enabled.
	 *
	 * @param supplementary_Table the supplementary_ table
	 */
	public void cacheResult(Supplementary_Table supplementary_Table) {
		EntityCacheUtil.putResult(Supplementary_TableModelImpl.ENTITY_CACHE_ENABLED,
			Supplementary_TableImpl.class, supplementary_Table.getPrimaryKey(),
			supplementary_Table);

		supplementary_Table.resetOriginalValues();
	}

	/**
	 * Caches the supplementary_ tables in the entity cache if it is enabled.
	 *
	 * @param supplementary_Tables the supplementary_ tables
	 */
	public void cacheResult(List<Supplementary_Table> supplementary_Tables) {
		for (Supplementary_Table supplementary_Table : supplementary_Tables) {
			if (EntityCacheUtil.getResult(
						Supplementary_TableModelImpl.ENTITY_CACHE_ENABLED,
						Supplementary_TableImpl.class,
						supplementary_Table.getPrimaryKey()) == null) {
				cacheResult(supplementary_Table);
			}
			else {
				supplementary_Table.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all supplementary_ tables.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(Supplementary_TableImpl.class.getName());
		}

		EntityCacheUtil.clearCache(Supplementary_TableImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the supplementary_ table.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Supplementary_Table supplementary_Table) {
		EntityCacheUtil.removeResult(Supplementary_TableModelImpl.ENTITY_CACHE_ENABLED,
			Supplementary_TableImpl.class, supplementary_Table.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Supplementary_Table> supplementary_Tables) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Supplementary_Table supplementary_Table : supplementary_Tables) {
			EntityCacheUtil.removeResult(Supplementary_TableModelImpl.ENTITY_CACHE_ENABLED,
				Supplementary_TableImpl.class,
				supplementary_Table.getPrimaryKey());
		}
	}

	/**
	 * Creates a new supplementary_ table with the primary key. Does not add the supplementary_ table to the database.
	 *
	 * @param table_Id the primary key for the new supplementary_ table
	 * @return the new supplementary_ table
	 */
	public Supplementary_Table create(long table_Id) {
		Supplementary_Table supplementary_Table = new Supplementary_TableImpl();

		supplementary_Table.setNew(true);
		supplementary_Table.setPrimaryKey(table_Id);

		return supplementary_Table;
	}

	/**
	 * Removes the supplementary_ table with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param table_Id the primary key of the supplementary_ table
	 * @return the supplementary_ table that was removed
	 * @throws com.test.NoSuchSupplementary_TableException if a supplementary_ table with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Supplementary_Table remove(long table_Id)
		throws NoSuchSupplementary_TableException, SystemException {
		return remove(Long.valueOf(table_Id));
	}

	/**
	 * Removes the supplementary_ table with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the supplementary_ table
	 * @return the supplementary_ table that was removed
	 * @throws com.test.NoSuchSupplementary_TableException if a supplementary_ table with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Supplementary_Table remove(Serializable primaryKey)
		throws NoSuchSupplementary_TableException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Supplementary_Table supplementary_Table = (Supplementary_Table)session.get(Supplementary_TableImpl.class,
					primaryKey);

			if (supplementary_Table == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSupplementary_TableException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(supplementary_Table);
		}
		catch (NoSuchSupplementary_TableException nsee) {
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
	protected Supplementary_Table removeImpl(
		Supplementary_Table supplementary_Table) throws SystemException {
		supplementary_Table = toUnwrappedModel(supplementary_Table);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, supplementary_Table);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(supplementary_Table);

		return supplementary_Table;
	}

	@Override
	public Supplementary_Table updateImpl(
		com.test.model.Supplementary_Table supplementary_Table, boolean merge)
		throws SystemException {
		supplementary_Table = toUnwrappedModel(supplementary_Table);

		boolean isNew = supplementary_Table.isNew();

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, supplementary_Table, merge);

			supplementary_Table.setNew(false);
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

		EntityCacheUtil.putResult(Supplementary_TableModelImpl.ENTITY_CACHE_ENABLED,
			Supplementary_TableImpl.class, supplementary_Table.getPrimaryKey(),
			supplementary_Table);

		return supplementary_Table;
	}

	protected Supplementary_Table toUnwrappedModel(
		Supplementary_Table supplementary_Table) {
		if (supplementary_Table instanceof Supplementary_TableImpl) {
			return supplementary_Table;
		}

		Supplementary_TableImpl supplementary_TableImpl = new Supplementary_TableImpl();

		supplementary_TableImpl.setNew(supplementary_Table.isNew());
		supplementary_TableImpl.setPrimaryKey(supplementary_Table.getPrimaryKey());

		supplementary_TableImpl.setTable_Id(supplementary_Table.getTable_Id());

		return supplementary_TableImpl;
	}

	/**
	 * Returns the supplementary_ table with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the supplementary_ table
	 * @return the supplementary_ table
	 * @throws com.liferay.portal.NoSuchModelException if a supplementary_ table with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Supplementary_Table findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the supplementary_ table with the primary key or throws a {@link com.test.NoSuchSupplementary_TableException} if it could not be found.
	 *
	 * @param table_Id the primary key of the supplementary_ table
	 * @return the supplementary_ table
	 * @throws com.test.NoSuchSupplementary_TableException if a supplementary_ table with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Supplementary_Table findByPrimaryKey(long table_Id)
		throws NoSuchSupplementary_TableException, SystemException {
		Supplementary_Table supplementary_Table = fetchByPrimaryKey(table_Id);

		if (supplementary_Table == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + table_Id);
			}

			throw new NoSuchSupplementary_TableException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				table_Id);
		}

		return supplementary_Table;
	}

	/**
	 * Returns the supplementary_ table with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the supplementary_ table
	 * @return the supplementary_ table, or <code>null</code> if a supplementary_ table with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Supplementary_Table fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the supplementary_ table with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param table_Id the primary key of the supplementary_ table
	 * @return the supplementary_ table, or <code>null</code> if a supplementary_ table with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Supplementary_Table fetchByPrimaryKey(long table_Id)
		throws SystemException {
		Supplementary_Table supplementary_Table = (Supplementary_Table)EntityCacheUtil.getResult(Supplementary_TableModelImpl.ENTITY_CACHE_ENABLED,
				Supplementary_TableImpl.class, table_Id);

		if (supplementary_Table == _nullSupplementary_Table) {
			return null;
		}

		if (supplementary_Table == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				supplementary_Table = (Supplementary_Table)session.get(Supplementary_TableImpl.class,
						Long.valueOf(table_Id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (supplementary_Table != null) {
					cacheResult(supplementary_Table);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(Supplementary_TableModelImpl.ENTITY_CACHE_ENABLED,
						Supplementary_TableImpl.class, table_Id,
						_nullSupplementary_Table);
				}

				closeSession(session);
			}
		}

		return supplementary_Table;
	}

	/**
	 * Returns all the supplementary_ tables.
	 *
	 * @return the supplementary_ tables
	 * @throws SystemException if a system exception occurred
	 */
	public List<Supplementary_Table> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the supplementary_ tables.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of supplementary_ tables
	 * @param end the upper bound of the range of supplementary_ tables (not inclusive)
	 * @return the range of supplementary_ tables
	 * @throws SystemException if a system exception occurred
	 */
	public List<Supplementary_Table> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the supplementary_ tables.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of supplementary_ tables
	 * @param end the upper bound of the range of supplementary_ tables (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of supplementary_ tables
	 * @throws SystemException if a system exception occurred
	 */
	public List<Supplementary_Table> findAll(int start, int end,
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

		List<Supplementary_Table> list = (List<Supplementary_Table>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_SUPPLEMENTARY_TABLE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SUPPLEMENTARY_TABLE.concat(Supplementary_TableModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<Supplementary_Table>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<Supplementary_Table>)QueryUtil.list(q,
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
	 * Removes all the supplementary_ tables from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (Supplementary_Table supplementary_Table : findAll()) {
			remove(supplementary_Table);
		}
	}

	/**
	 * Returns the number of supplementary_ tables.
	 *
	 * @return the number of supplementary_ tables
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_SUPPLEMENTARY_TABLE);

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
	 * Initializes the supplementary_ table persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.test.model.Supplementary_Table")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Supplementary_Table>> listenersList = new ArrayList<ModelListener<Supplementary_Table>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Supplementary_Table>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(Supplementary_TableImpl.class.getName());
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
	private static final String _SQL_SELECT_SUPPLEMENTARY_TABLE = "SELECT supplementary_Table FROM Supplementary_Table supplementary_Table";
	private static final String _SQL_COUNT_SUPPLEMENTARY_TABLE = "SELECT COUNT(supplementary_Table) FROM Supplementary_Table supplementary_Table";
	private static final String _ORDER_BY_ENTITY_ALIAS = "supplementary_Table.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Supplementary_Table exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(Supplementary_TablePersistenceImpl.class);
	private static Supplementary_Table _nullSupplementary_Table = new Supplementary_TableImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Supplementary_Table> toCacheModel() {
				return _nullSupplementary_TableCacheModel;
			}
		};

	private static CacheModel<Supplementary_Table> _nullSupplementary_TableCacheModel =
		new CacheModel<Supplementary_Table>() {
			public Supplementary_Table toEntityModel() {
				return _nullSupplementary_Table;
			}
		};
}