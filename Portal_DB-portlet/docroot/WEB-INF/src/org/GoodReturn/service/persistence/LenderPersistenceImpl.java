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

import org.goodreturn.NoSuchLenderException;

import org.goodreturn.model.Lender;
import org.goodreturn.model.impl.LenderImpl;
import org.goodreturn.model.impl.LenderModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the lender service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author gilaa004
 * @see LenderPersistence
 * @see LenderUtil
 * @generated
 */
public class LenderPersistenceImpl extends BasePersistenceImpl<Lender>
	implements LenderPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link LenderUtil} to access the lender persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = LenderImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(LenderModelImpl.ENTITY_CACHE_ENABLED,
			LenderModelImpl.FINDER_CACHE_ENABLED, LenderImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(LenderModelImpl.ENTITY_CACHE_ENABLED,
			LenderModelImpl.FINDER_CACHE_ENABLED, LenderImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(LenderModelImpl.ENTITY_CACHE_ENABLED,
			LenderModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the lender in the entity cache if it is enabled.
	 *
	 * @param lender the lender
	 */
	public void cacheResult(Lender lender) {
		EntityCacheUtil.putResult(LenderModelImpl.ENTITY_CACHE_ENABLED,
			LenderImpl.class, lender.getPrimaryKey(), lender);

		lender.resetOriginalValues();
	}

	/**
	 * Caches the lenders in the entity cache if it is enabled.
	 *
	 * @param lenders the lenders
	 */
	public void cacheResult(List<Lender> lenders) {
		for (Lender lender : lenders) {
			if (EntityCacheUtil.getResult(
						LenderModelImpl.ENTITY_CACHE_ENABLED, LenderImpl.class,
						lender.getPrimaryKey()) == null) {
				cacheResult(lender);
			}
			else {
				lender.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all lenders.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(LenderImpl.class.getName());
		}

		EntityCacheUtil.clearCache(LenderImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the lender.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Lender lender) {
		EntityCacheUtil.removeResult(LenderModelImpl.ENTITY_CACHE_ENABLED,
			LenderImpl.class, lender.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Lender> lenders) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Lender lender : lenders) {
			EntityCacheUtil.removeResult(LenderModelImpl.ENTITY_CACHE_ENABLED,
				LenderImpl.class, lender.getPrimaryKey());
		}
	}

	/**
	 * Creates a new lender with the primary key. Does not add the lender to the database.
	 *
	 * @param lender_Id the primary key for the new lender
	 * @return the new lender
	 */
	public Lender create(long lender_Id) {
		Lender lender = new LenderImpl();

		lender.setNew(true);
		lender.setPrimaryKey(lender_Id);

		return lender;
	}

	/**
	 * Removes the lender with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param lender_Id the primary key of the lender
	 * @return the lender that was removed
	 * @throws org.goodreturn.NoSuchLenderException if a lender with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Lender remove(long lender_Id)
		throws NoSuchLenderException, SystemException {
		return remove(Long.valueOf(lender_Id));
	}

	/**
	 * Removes the lender with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the lender
	 * @return the lender that was removed
	 * @throws org.goodreturn.NoSuchLenderException if a lender with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Lender remove(Serializable primaryKey)
		throws NoSuchLenderException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Lender lender = (Lender)session.get(LenderImpl.class, primaryKey);

			if (lender == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchLenderException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(lender);
		}
		catch (NoSuchLenderException nsee) {
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
	protected Lender removeImpl(Lender lender) throws SystemException {
		lender = toUnwrappedModel(lender);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, lender);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(lender);

		return lender;
	}

	@Override
	public Lender updateImpl(org.goodreturn.model.Lender lender, boolean merge)
		throws SystemException {
		lender = toUnwrappedModel(lender);

		boolean isNew = lender.isNew();

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, lender, merge);

			lender.setNew(false);
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

		EntityCacheUtil.putResult(LenderModelImpl.ENTITY_CACHE_ENABLED,
			LenderImpl.class, lender.getPrimaryKey(), lender);

		return lender;
	}

	protected Lender toUnwrappedModel(Lender lender) {
		if (lender instanceof LenderImpl) {
			return lender;
		}

		LenderImpl lenderImpl = new LenderImpl();

		lenderImpl.setNew(lender.isNew());
		lenderImpl.setPrimaryKey(lender.getPrimaryKey());

		lenderImpl.setLender_Id(lender.getLender_Id());
		lenderImpl.setSalutation(lender.getSalutation());
		lenderImpl.setEmployer_Name(lender.getEmployer_Name());
		lenderImpl.setComment(lender.getComment());
		lenderImpl.setHeard_Of_Us(lender.getHeard_Of_Us());
		lenderImpl.setRegion(lender.getRegion());
		lenderImpl.setDisplay_Name(lender.getDisplay_Name());
		lenderImpl.setDate_Of_Birth(lender.getDate_Of_Birth());
		lenderImpl.setReason_For_Lending(lender.getReason_For_Lending());
		lenderImpl.setAbout_Themselves(lender.getAbout_Themselves());
		lenderImpl.setAutomatic_Re_lend(lender.isAutomatic_Re_lend());
		lenderImpl.setMonthly_Repayments(lender.getMonthly_Repayments());
		lenderImpl.setIs_Public_Profile(lender.isIs_Public_Profile());
		lenderImpl.setBank_Details(lender.getBank_Details());
		lenderImpl.setRecieve_Emails(lender.isRecieve_Emails());
		lenderImpl.setRecieve_GoodReturn_Info(lender.isRecieve_GoodReturn_Info());
		lenderImpl.setIs_Anonymous(lender.isIs_Anonymous());
		lenderImpl.setIs_Validated(lender.isIs_Validated());
		lenderImpl.setCurrent_Balance(lender.getCurrent_Balance());
		lenderImpl.setPaypal_Email(lender.getPaypal_Email());
		lenderImpl.setPassword(lender.getPassword());
		lenderImpl.setLast_Login_Date(lender.getLast_Login_Date());
		lenderImpl.setFeatured_Lender(lender.getFeatured_Lender());
		lenderImpl.setVoucher_Id(lender.getVoucher_Id());
		lenderImpl.setIs_Loan_Donation(lender.isIs_Loan_Donation());

		return lenderImpl;
	}

	/**
	 * Returns the lender with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the lender
	 * @return the lender
	 * @throws com.liferay.portal.NoSuchModelException if a lender with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Lender findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the lender with the primary key or throws a {@link org.goodreturn.NoSuchLenderException} if it could not be found.
	 *
	 * @param lender_Id the primary key of the lender
	 * @return the lender
	 * @throws org.goodreturn.NoSuchLenderException if a lender with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Lender findByPrimaryKey(long lender_Id)
		throws NoSuchLenderException, SystemException {
		Lender lender = fetchByPrimaryKey(lender_Id);

		if (lender == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + lender_Id);
			}

			throw new NoSuchLenderException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				lender_Id);
		}

		return lender;
	}

	/**
	 * Returns the lender with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the lender
	 * @return the lender, or <code>null</code> if a lender with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Lender fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the lender with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param lender_Id the primary key of the lender
	 * @return the lender, or <code>null</code> if a lender with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Lender fetchByPrimaryKey(long lender_Id) throws SystemException {
		Lender lender = (Lender)EntityCacheUtil.getResult(LenderModelImpl.ENTITY_CACHE_ENABLED,
				LenderImpl.class, lender_Id);

		if (lender == _nullLender) {
			return null;
		}

		if (lender == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				lender = (Lender)session.get(LenderImpl.class,
						Long.valueOf(lender_Id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (lender != null) {
					cacheResult(lender);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(LenderModelImpl.ENTITY_CACHE_ENABLED,
						LenderImpl.class, lender_Id, _nullLender);
				}

				closeSession(session);
			}
		}

		return lender;
	}

	/**
	 * Returns all the lenders.
	 *
	 * @return the lenders
	 * @throws SystemException if a system exception occurred
	 */
	public List<Lender> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the lenders.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of lenders
	 * @param end the upper bound of the range of lenders (not inclusive)
	 * @return the range of lenders
	 * @throws SystemException if a system exception occurred
	 */
	public List<Lender> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the lenders.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of lenders
	 * @param end the upper bound of the range of lenders (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of lenders
	 * @throws SystemException if a system exception occurred
	 */
	public List<Lender> findAll(int start, int end,
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

		List<Lender> list = (List<Lender>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_LENDER);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_LENDER.concat(LenderModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<Lender>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);
				}
				else {
					list = (List<Lender>)QueryUtil.list(q, getDialect(), start,
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
	 * Removes all the lenders from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (Lender lender : findAll()) {
			remove(lender);
		}
	}

	/**
	 * Returns the number of lenders.
	 *
	 * @return the number of lenders
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_LENDER);

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
	 * Returns all the persons associated with the lender.
	 *
	 * @param pk the primary key of the lender
	 * @return the persons associated with the lender
	 * @throws SystemException if a system exception occurred
	 */
	public List<org.goodreturn.model.Person> getPersons(long pk)
		throws SystemException {
		return getPersons(pk, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the persons associated with the lender.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the lender
	 * @param start the lower bound of the range of lenders
	 * @param end the upper bound of the range of lenders (not inclusive)
	 * @return the range of persons associated with the lender
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
	 * Returns an ordered range of all the persons associated with the lender.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the lender
	 * @param start the lower bound of the range of lenders
	 * @param end the upper bound of the range of lenders (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of persons associated with the lender
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
	 * Returns the number of persons associated with the lender.
	 *
	 * @param pk the primary key of the lender
	 * @return the number of persons associated with the lender
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
	 * Returns <code>true</code> if the person is associated with the lender.
	 *
	 * @param pk the primary key of the lender
	 * @param personPK the primary key of the person
	 * @return <code>true</code> if the person is associated with the lender; <code>false</code> otherwise
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
	 * Returns <code>true</code> if the lender has any persons associated with it.
	 *
	 * @param pk the primary key of the lender to check for associations with persons
	 * @return <code>true</code> if the lender has any persons associated with it; <code>false</code> otherwise
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
	 * Initializes the lender persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.goodreturn.model.Lender")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Lender>> listenersList = new ArrayList<ModelListener<Lender>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Lender>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(LenderImpl.class.getName());
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

		protected boolean contains(long lender_Id, long abacus_Person_Id) {
			List<Integer> results = _mappingSqlQuery.execute(new Object[] {
						new Long(lender_Id), new Long(abacus_Person_Id)
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

	private static final String _SQL_SELECT_LENDER = "SELECT lender FROM Lender lender";
	private static final String _SQL_COUNT_LENDER = "SELECT COUNT(lender) FROM Lender lender";
	private static final String _SQL_GETPERSONS = "SELECT {GoodReturn_Person.*} FROM GoodReturn_Person INNER JOIN GoodReturn_Lender ON (GoodReturn_Lender.lender_Id = GoodReturn_Person.lender_Id) WHERE (GoodReturn_Lender.lender_Id = ?)";
	private static final String _SQL_GETPERSONSSIZE = "SELECT COUNT(*) AS COUNT_VALUE FROM GoodReturn_Person WHERE lender_Id = ?";
	private static final String _SQL_CONTAINSPERSON = "SELECT COUNT(*) AS COUNT_VALUE FROM GoodReturn_Person WHERE lender_Id = ? AND abacus_Person_Id = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "lender.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Lender exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(LenderPersistenceImpl.class);
	private static Lender _nullLender = new LenderImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Lender> toCacheModel() {
				return _nullLenderCacheModel;
			}
		};

	private static CacheModel<Lender> _nullLenderCacheModel = new CacheModel<Lender>() {
			public Lender toEntityModel() {
				return _nullLender;
			}
		};
}