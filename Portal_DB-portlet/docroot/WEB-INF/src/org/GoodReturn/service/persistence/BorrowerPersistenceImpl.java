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
import com.liferay.portal.kernel.dao.jdbc.MappingSqlQuery;
import com.liferay.portal.kernel.dao.jdbc.MappingSqlQueryFactoryUtil;
import com.liferay.portal.kernel.dao.jdbc.RowMapper;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
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

import org.goodreturn.NoSuchBorrowerException;

import org.goodreturn.model.Borrower;
import org.goodreturn.model.impl.BorrowerImpl;
import org.goodreturn.model.impl.BorrowerModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the borrower service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author gilaa004
 * @see BorrowerPersistence
 * @see BorrowerUtil
 * @generated
 */
public class BorrowerPersistenceImpl extends BasePersistenceImpl<Borrower>
	implements BorrowerPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link BorrowerUtil} to access the borrower persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = BorrowerImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(BorrowerModelImpl.ENTITY_CACHE_ENABLED,
			BorrowerModelImpl.FINDER_CACHE_ENABLED, BorrowerImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(BorrowerModelImpl.ENTITY_CACHE_ENABLED,
			BorrowerModelImpl.FINDER_CACHE_ENABLED, BorrowerImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(BorrowerModelImpl.ENTITY_CACHE_ENABLED,
			BorrowerModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the borrower in the entity cache if it is enabled.
	 *
	 * @param borrower the borrower
	 */
	public void cacheResult(Borrower borrower) {
		EntityCacheUtil.putResult(BorrowerModelImpl.ENTITY_CACHE_ENABLED,
			BorrowerImpl.class, borrower.getPrimaryKey(), borrower);

		borrower.resetOriginalValues();
	}

	/**
	 * Caches the borrowers in the entity cache if it is enabled.
	 *
	 * @param borrowers the borrowers
	 */
	public void cacheResult(List<Borrower> borrowers) {
		for (Borrower borrower : borrowers) {
			if (EntityCacheUtil.getResult(
						BorrowerModelImpl.ENTITY_CACHE_ENABLED,
						BorrowerImpl.class, borrower.getPrimaryKey()) == null) {
				cacheResult(borrower);
			}
			else {
				borrower.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all borrowers.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(BorrowerImpl.class.getName());
		}

		EntityCacheUtil.clearCache(BorrowerImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the borrower.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Borrower borrower) {
		EntityCacheUtil.removeResult(BorrowerModelImpl.ENTITY_CACHE_ENABLED,
			BorrowerImpl.class, borrower.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Borrower> borrowers) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Borrower borrower : borrowers) {
			EntityCacheUtil.removeResult(BorrowerModelImpl.ENTITY_CACHE_ENABLED,
				BorrowerImpl.class, borrower.getPrimaryKey());
		}
	}

	/**
	 * Creates a new borrower with the primary key. Does not add the borrower to the database.
	 *
	 * @param abacus_Borrower_Id the primary key for the new borrower
	 * @return the new borrower
	 */
	public Borrower create(long abacus_Borrower_Id) {
		Borrower borrower = new BorrowerImpl();

		borrower.setNew(true);
		borrower.setPrimaryKey(abacus_Borrower_Id);

		return borrower;
	}

	/**
	 * Removes the borrower with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param abacus_Borrower_Id the primary key of the borrower
	 * @return the borrower that was removed
	 * @throws org.goodreturn.NoSuchBorrowerException if a borrower with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Borrower remove(long abacus_Borrower_Id)
		throws NoSuchBorrowerException, SystemException {
		return remove(Long.valueOf(abacus_Borrower_Id));
	}

	/**
	 * Removes the borrower with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the borrower
	 * @return the borrower that was removed
	 * @throws org.goodreturn.NoSuchBorrowerException if a borrower with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Borrower remove(Serializable primaryKey)
		throws NoSuchBorrowerException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Borrower borrower = (Borrower)session.get(BorrowerImpl.class,
					primaryKey);

			if (borrower == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchBorrowerException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(borrower);
		}
		catch (NoSuchBorrowerException nsee) {
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
	protected Borrower removeImpl(Borrower borrower) throws SystemException {
		borrower = toUnwrappedModel(borrower);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, borrower);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(borrower);

		return borrower;
	}

	@Override
	public Borrower updateImpl(org.goodreturn.model.Borrower borrower,
		boolean merge) throws SystemException {
		borrower = toUnwrappedModel(borrower);

		boolean isNew = borrower.isNew();

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, borrower, merge);

			borrower.setNew(false);
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

		EntityCacheUtil.putResult(BorrowerModelImpl.ENTITY_CACHE_ENABLED,
			BorrowerImpl.class, borrower.getPrimaryKey(), borrower);

		return borrower;
	}

	protected Borrower toUnwrappedModel(Borrower borrower) {
		if (borrower instanceof BorrowerImpl) {
			return borrower;
		}

		BorrowerImpl borrowerImpl = new BorrowerImpl();

		borrowerImpl.setNew(borrower.isNew());
		borrowerImpl.setPrimaryKey(borrower.getPrimaryKey());

		borrowerImpl.setAbacus_Borrower_Id(borrower.getAbacus_Borrower_Id());
		borrowerImpl.setWrite_Off_Date(borrower.getWrite_Off_Date());
		borrowerImpl.setPhone(borrower.getPhone());
		borrowerImpl.setWait_Time(borrower.getWait_Time());
		borrowerImpl.setCountry(borrower.getCountry());
		borrowerImpl.setAmount_Needed(borrower.getAmount_Needed());
		borrowerImpl.setAmount_Needed_AUD(borrower.getAmount_Needed_AUD());
		borrowerImpl.setType_Of_Person(borrower.getType_Of_Person());
		borrowerImpl.setVillage(borrower.getVillage());
		borrowerImpl.setDistrict(borrower.getDistrict());
		borrowerImpl.setPdf_Link(borrower.getPdf_Link());
		borrowerImpl.setCurrency(borrower.getCurrency());
		borrowerImpl.setDate_Applied(borrower.getDate_Applied());

		return borrowerImpl;
	}

	/**
	 * Returns the borrower with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the borrower
	 * @return the borrower
	 * @throws com.liferay.portal.NoSuchModelException if a borrower with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Borrower findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the borrower with the primary key or throws a {@link org.goodreturn.NoSuchBorrowerException} if it could not be found.
	 *
	 * @param abacus_Borrower_Id the primary key of the borrower
	 * @return the borrower
	 * @throws org.goodreturn.NoSuchBorrowerException if a borrower with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Borrower findByPrimaryKey(long abacus_Borrower_Id)
		throws NoSuchBorrowerException, SystemException {
		Borrower borrower = fetchByPrimaryKey(abacus_Borrower_Id);

		if (borrower == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					abacus_Borrower_Id);
			}

			throw new NoSuchBorrowerException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				abacus_Borrower_Id);
		}

		return borrower;
	}

	/**
	 * Returns the borrower with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the borrower
	 * @return the borrower, or <code>null</code> if a borrower with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Borrower fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the borrower with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param abacus_Borrower_Id the primary key of the borrower
	 * @return the borrower, or <code>null</code> if a borrower with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Borrower fetchByPrimaryKey(long abacus_Borrower_Id)
		throws SystemException {
		Borrower borrower = (Borrower)EntityCacheUtil.getResult(BorrowerModelImpl.ENTITY_CACHE_ENABLED,
				BorrowerImpl.class, abacus_Borrower_Id);

		if (borrower == _nullBorrower) {
			return null;
		}

		if (borrower == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				borrower = (Borrower)session.get(BorrowerImpl.class,
						Long.valueOf(abacus_Borrower_Id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (borrower != null) {
					cacheResult(borrower);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(BorrowerModelImpl.ENTITY_CACHE_ENABLED,
						BorrowerImpl.class, abacus_Borrower_Id, _nullBorrower);
				}

				closeSession(session);
			}
		}

		return borrower;
	}

	/**
	 * Returns all the borrowers.
	 *
	 * @return the borrowers
	 * @throws SystemException if a system exception occurred
	 */
	public List<Borrower> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the borrowers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of borrowers
	 * @param end the upper bound of the range of borrowers (not inclusive)
	 * @return the range of borrowers
	 * @throws SystemException if a system exception occurred
	 */
	public List<Borrower> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the borrowers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of borrowers
	 * @param end the upper bound of the range of borrowers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of borrowers
	 * @throws SystemException if a system exception occurred
	 */
	public List<Borrower> findAll(int start, int end,
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

		List<Borrower> list = (List<Borrower>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_BORROWER);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_BORROWER.concat(BorrowerModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<Borrower>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<Borrower>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the borrowers from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (Borrower borrower : findAll()) {
			remove(borrower);
		}
	}

	/**
	 * Returns the number of borrowers.
	 *
	 * @return the number of borrowers
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_BORROWER);

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
	 * Returns all the persons associated with the borrower.
	 *
	 * @param pk the primary key of the borrower
	 * @return the persons associated with the borrower
	 * @throws SystemException if a system exception occurred
	 */
	public List<org.goodreturn.model.Person> getPersons(long pk)
		throws SystemException {
		return getPersons(pk, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the persons associated with the borrower.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the borrower
	 * @param start the lower bound of the range of borrowers
	 * @param end the upper bound of the range of borrowers (not inclusive)
	 * @return the range of persons associated with the borrower
	 * @throws SystemException if a system exception occurred
	 */
	public List<org.goodreturn.model.Person> getPersons(long pk, int start,
		int end) throws SystemException {
		return getPersons(pk, start, end, null);
	}

	public static final FinderPath FINDER_PATH_GET_PERSONS = new FinderPath(org.goodreturn.model.impl.PersonModelImpl.ENTITY_CACHE_ENABLED,
			org.goodreturn.model.impl.PersonModelImpl.FINDER_CACHE_ENABLED,
			org.goodreturn.model.impl.PersonImpl.class,
			org.goodreturn.service.persistence.PersonPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getPersons",
			new String[] {
				Long.class.getName(), "java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});

	static {
		FINDER_PATH_GET_PERSONS.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns an ordered range of all the persons associated with the borrower.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the borrower
	 * @param start the lower bound of the range of borrowers
	 * @param end the upper bound of the range of borrowers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of persons associated with the borrower
	 * @throws SystemException if a system exception occurred
	 */
	public List<org.goodreturn.model.Person> getPersons(long pk, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] { pk, start, end, orderByComparator };

		List<org.goodreturn.model.Person> list = (List<org.goodreturn.model.Person>)FinderCacheUtil.getResult(FINDER_PATH_GET_PERSONS,
				finderArgs, this);

		if (list == null) {
			Session session = null;

			try {
				session = openSession();

				String sql = null;

				if (orderByComparator != null) {
					sql = _SQL_GETPERSONS.concat(ORDER_BY_CLAUSE)
										 .concat(orderByComparator.getOrderBy());
				}
				else {
					sql = _SQL_GETPERSONS.concat(org.goodreturn.model.impl.PersonModelImpl.ORDER_BY_SQL);
				}

				SQLQuery q = session.createSQLQuery(sql);

				q.addEntity("GoodReturn_Person",
					org.goodreturn.model.impl.PersonImpl.class);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(pk);

				list = (List<org.goodreturn.model.Person>)QueryUtil.list(q,
						getDialect(), start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_GET_PERSONS,
						finderArgs);
				}
				else {
					personPersistence.cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_GET_PERSONS,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	public static final FinderPath FINDER_PATH_GET_PERSONS_SIZE = new FinderPath(org.goodreturn.model.impl.PersonModelImpl.ENTITY_CACHE_ENABLED,
			org.goodreturn.model.impl.PersonModelImpl.FINDER_CACHE_ENABLED,
			org.goodreturn.model.impl.PersonImpl.class,
			org.goodreturn.service.persistence.PersonPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getPersonsSize", new String[] { Long.class.getName() });

	static {
		FINDER_PATH_GET_PERSONS_SIZE.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns the number of persons associated with the borrower.
	 *
	 * @param pk the primary key of the borrower
	 * @return the number of persons associated with the borrower
	 * @throws SystemException if a system exception occurred
	 */
	public int getPersonsSize(long pk) throws SystemException {
		Object[] finderArgs = new Object[] { pk };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_GET_PERSONS_SIZE,
				finderArgs, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				SQLQuery q = session.createSQLQuery(_SQL_GETPERSONSSIZE);

				q.addScalar(COUNT_COLUMN_NAME,
					com.liferay.portal.kernel.dao.orm.Type.LONG);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(pk);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_GET_PERSONS_SIZE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	public static final FinderPath FINDER_PATH_CONTAINS_PERSON = new FinderPath(org.goodreturn.model.impl.PersonModelImpl.ENTITY_CACHE_ENABLED,
			org.goodreturn.model.impl.PersonModelImpl.FINDER_CACHE_ENABLED,
			org.goodreturn.model.impl.PersonImpl.class,
			org.goodreturn.service.persistence.PersonPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"containsPerson",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns <code>true</code> if the person is associated with the borrower.
	 *
	 * @param pk the primary key of the borrower
	 * @param personPK the primary key of the person
	 * @return <code>true</code> if the person is associated with the borrower; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containsPerson(long pk, long personPK)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk, personPK };

		Boolean value = (Boolean)FinderCacheUtil.getResult(FINDER_PATH_CONTAINS_PERSON,
				finderArgs, this);

		if (value == null) {
			try {
				value = Boolean.valueOf(containsPerson.contains(pk, personPK));
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (value == null) {
					value = Boolean.FALSE;
				}

				FinderCacheUtil.putResult(FINDER_PATH_CONTAINS_PERSON,
					finderArgs, value);
			}
		}

		return value.booleanValue();
	}

	/**
	 * Returns <code>true</code> if the borrower has any persons associated with it.
	 *
	 * @param pk the primary key of the borrower to check for associations with persons
	 * @return <code>true</code> if the borrower has any persons associated with it; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containsPersons(long pk) throws SystemException {
		if (getPersonsSize(pk) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Initializes the borrower persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.goodreturn.model.Borrower")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Borrower>> listenersList = new ArrayList<ModelListener<Borrower>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Borrower>)InstanceFactory.newInstance(
							listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}

		containsPerson = new ContainsPerson();
	}

	public void destroy() {
		EntityCacheUtil.removeCache(BorrowerImpl.class.getName());
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
	protected ContainsPerson containsPerson;

	protected class ContainsPerson {
		protected ContainsPerson() {
			_mappingSqlQuery = MappingSqlQueryFactoryUtil.getMappingSqlQuery(getDataSource(),
					_SQL_CONTAINSPERSON,
					new int[] { java.sql.Types.BIGINT, java.sql.Types.BIGINT },
					RowMapper.COUNT);
		}

		protected boolean contains(long abacus_Borrower_Id,
			long abacus_Person_Id) {
			List<Integer> results = _mappingSqlQuery.execute(new Object[] {
						new Long(abacus_Borrower_Id), new Long(abacus_Person_Id)
					});

			if (results.size() > 0) {
				Integer count = results.get(0);

				if (count.intValue() > 0) {
					return true;
				}
			}

			return false;
		}

		private MappingSqlQuery<Integer> _mappingSqlQuery;
	}

	private static final String _SQL_SELECT_BORROWER = "SELECT borrower FROM Borrower borrower";
	private static final String _SQL_COUNT_BORROWER = "SELECT COUNT(borrower) FROM Borrower borrower";
	private static final String _SQL_GETPERSONS = "SELECT {GoodReturn_Person.*} FROM GoodReturn_Person INNER JOIN GoodReturn_Borrower ON (GoodReturn_Borrower.abacus_Borrower_Id = GoodReturn_Person.abacus_Borrower_Id) WHERE (GoodReturn_Borrower.abacus_Borrower_Id = ?)";
	private static final String _SQL_GETPERSONSSIZE = "SELECT COUNT(*) AS COUNT_VALUE FROM GoodReturn_Person WHERE abacus_Borrower_Id = ?";
	private static final String _SQL_CONTAINSPERSON = "SELECT COUNT(*) AS COUNT_VALUE FROM GoodReturn_Person WHERE abacus_Borrower_Id = ? AND abacus_Person_Id = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "borrower.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Borrower exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(BorrowerPersistenceImpl.class);
	private static Borrower _nullBorrower = new BorrowerImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Borrower> toCacheModel() {
				return _nullBorrowerCacheModel;
			}
		};

	private static CacheModel<Borrower> _nullBorrowerCacheModel = new CacheModel<Borrower>() {
			public Borrower toEntityModel() {
				return _nullBorrower;
			}
		};
}