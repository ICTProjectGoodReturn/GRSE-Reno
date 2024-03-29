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

import org.goodreturn.NoSuchGift_CertificateException;

import org.goodreturn.model.Gift_Certificate;
import org.goodreturn.model.impl.Gift_CertificateImpl;
import org.goodreturn.model.impl.Gift_CertificateModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the gift_ certificate service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author gilaa004
 * @see Gift_CertificatePersistence
 * @see Gift_CertificateUtil
 * @generated
 */
public class Gift_CertificatePersistenceImpl extends BasePersistenceImpl<Gift_Certificate>
	implements Gift_CertificatePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link Gift_CertificateUtil} to access the gift_ certificate persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = Gift_CertificateImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(Gift_CertificateModelImpl.ENTITY_CACHE_ENABLED,
			Gift_CertificateModelImpl.FINDER_CACHE_ENABLED,
			Gift_CertificateImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(Gift_CertificateModelImpl.ENTITY_CACHE_ENABLED,
			Gift_CertificateModelImpl.FINDER_CACHE_ENABLED,
			Gift_CertificateImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(Gift_CertificateModelImpl.ENTITY_CACHE_ENABLED,
			Gift_CertificateModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the gift_ certificate in the entity cache if it is enabled.
	 *
	 * @param gift_Certificate the gift_ certificate
	 */
	public void cacheResult(Gift_Certificate gift_Certificate) {
		EntityCacheUtil.putResult(Gift_CertificateModelImpl.ENTITY_CACHE_ENABLED,
			Gift_CertificateImpl.class, gift_Certificate.getPrimaryKey(),
			gift_Certificate);

		gift_Certificate.resetOriginalValues();
	}

	/**
	 * Caches the gift_ certificates in the entity cache if it is enabled.
	 *
	 * @param gift_Certificates the gift_ certificates
	 */
	public void cacheResult(List<Gift_Certificate> gift_Certificates) {
		for (Gift_Certificate gift_Certificate : gift_Certificates) {
			if (EntityCacheUtil.getResult(
						Gift_CertificateModelImpl.ENTITY_CACHE_ENABLED,
						Gift_CertificateImpl.class,
						gift_Certificate.getPrimaryKey()) == null) {
				cacheResult(gift_Certificate);
			}
			else {
				gift_Certificate.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all gift_ certificates.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(Gift_CertificateImpl.class.getName());
		}

		EntityCacheUtil.clearCache(Gift_CertificateImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the gift_ certificate.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Gift_Certificate gift_Certificate) {
		EntityCacheUtil.removeResult(Gift_CertificateModelImpl.ENTITY_CACHE_ENABLED,
			Gift_CertificateImpl.class, gift_Certificate.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Gift_Certificate> gift_Certificates) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Gift_Certificate gift_Certificate : gift_Certificates) {
			EntityCacheUtil.removeResult(Gift_CertificateModelImpl.ENTITY_CACHE_ENABLED,
				Gift_CertificateImpl.class, gift_Certificate.getPrimaryKey());
		}
	}

	/**
	 * Creates a new gift_ certificate with the primary key. Does not add the gift_ certificate to the database.
	 *
	 * @param certificate_Id the primary key for the new gift_ certificate
	 * @return the new gift_ certificate
	 */
	public Gift_Certificate create(long certificate_Id) {
		Gift_Certificate gift_Certificate = new Gift_CertificateImpl();

		gift_Certificate.setNew(true);
		gift_Certificate.setPrimaryKey(certificate_Id);

		return gift_Certificate;
	}

	/**
	 * Removes the gift_ certificate with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param certificate_Id the primary key of the gift_ certificate
	 * @return the gift_ certificate that was removed
	 * @throws org.goodreturn.NoSuchGift_CertificateException if a gift_ certificate with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Gift_Certificate remove(long certificate_Id)
		throws NoSuchGift_CertificateException, SystemException {
		return remove(Long.valueOf(certificate_Id));
	}

	/**
	 * Removes the gift_ certificate with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the gift_ certificate
	 * @return the gift_ certificate that was removed
	 * @throws org.goodreturn.NoSuchGift_CertificateException if a gift_ certificate with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Gift_Certificate remove(Serializable primaryKey)
		throws NoSuchGift_CertificateException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Gift_Certificate gift_Certificate = (Gift_Certificate)session.get(Gift_CertificateImpl.class,
					primaryKey);

			if (gift_Certificate == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchGift_CertificateException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(gift_Certificate);
		}
		catch (NoSuchGift_CertificateException nsee) {
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
	protected Gift_Certificate removeImpl(Gift_Certificate gift_Certificate)
		throws SystemException {
		gift_Certificate = toUnwrappedModel(gift_Certificate);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, gift_Certificate);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(gift_Certificate);

		return gift_Certificate;
	}

	@Override
	public Gift_Certificate updateImpl(
		org.goodreturn.model.Gift_Certificate gift_Certificate, boolean merge)
		throws SystemException {
		gift_Certificate = toUnwrappedModel(gift_Certificate);

		boolean isNew = gift_Certificate.isNew();

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, gift_Certificate, merge);

			gift_Certificate.setNew(false);
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

		EntityCacheUtil.putResult(Gift_CertificateModelImpl.ENTITY_CACHE_ENABLED,
			Gift_CertificateImpl.class, gift_Certificate.getPrimaryKey(),
			gift_Certificate);

		return gift_Certificate;
	}

	protected Gift_Certificate toUnwrappedModel(
		Gift_Certificate gift_Certificate) {
		if (gift_Certificate instanceof Gift_CertificateImpl) {
			return gift_Certificate;
		}

		Gift_CertificateImpl gift_CertificateImpl = new Gift_CertificateImpl();

		gift_CertificateImpl.setNew(gift_Certificate.isNew());
		gift_CertificateImpl.setPrimaryKey(gift_Certificate.getPrimaryKey());

		gift_CertificateImpl.setCertificate_Id(gift_Certificate.getCertificate_Id());
		gift_CertificateImpl.setCertificate_Amount(gift_Certificate.getCertificate_Amount());
		gift_CertificateImpl.setCertificate_Type(gift_Certificate.getCertificate_Type());
		gift_CertificateImpl.setChanged_By(gift_Certificate.getChanged_By());
		gift_CertificateImpl.setChanged_Time(gift_Certificate.getChanged_Time());
		gift_CertificateImpl.setGroupId(gift_Certificate.getGroupId());
		gift_CertificateImpl.setCompanyId(gift_Certificate.getCompanyId());

		return gift_CertificateImpl;
	}

	/**
	 * Returns the gift_ certificate with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the gift_ certificate
	 * @return the gift_ certificate
	 * @throws com.liferay.portal.NoSuchModelException if a gift_ certificate with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Gift_Certificate findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the gift_ certificate with the primary key or throws a {@link org.goodreturn.NoSuchGift_CertificateException} if it could not be found.
	 *
	 * @param certificate_Id the primary key of the gift_ certificate
	 * @return the gift_ certificate
	 * @throws org.goodreturn.NoSuchGift_CertificateException if a gift_ certificate with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Gift_Certificate findByPrimaryKey(long certificate_Id)
		throws NoSuchGift_CertificateException, SystemException {
		Gift_Certificate gift_Certificate = fetchByPrimaryKey(certificate_Id);

		if (gift_Certificate == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + certificate_Id);
			}

			throw new NoSuchGift_CertificateException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				certificate_Id);
		}

		return gift_Certificate;
	}

	/**
	 * Returns the gift_ certificate with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the gift_ certificate
	 * @return the gift_ certificate, or <code>null</code> if a gift_ certificate with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Gift_Certificate fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the gift_ certificate with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param certificate_Id the primary key of the gift_ certificate
	 * @return the gift_ certificate, or <code>null</code> if a gift_ certificate with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Gift_Certificate fetchByPrimaryKey(long certificate_Id)
		throws SystemException {
		Gift_Certificate gift_Certificate = (Gift_Certificate)EntityCacheUtil.getResult(Gift_CertificateModelImpl.ENTITY_CACHE_ENABLED,
				Gift_CertificateImpl.class, certificate_Id);

		if (gift_Certificate == _nullGift_Certificate) {
			return null;
		}

		if (gift_Certificate == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				gift_Certificate = (Gift_Certificate)session.get(Gift_CertificateImpl.class,
						Long.valueOf(certificate_Id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (gift_Certificate != null) {
					cacheResult(gift_Certificate);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(Gift_CertificateModelImpl.ENTITY_CACHE_ENABLED,
						Gift_CertificateImpl.class, certificate_Id,
						_nullGift_Certificate);
				}

				closeSession(session);
			}
		}

		return gift_Certificate;
	}

	/**
	 * Returns all the gift_ certificates.
	 *
	 * @return the gift_ certificates
	 * @throws SystemException if a system exception occurred
	 */
	public List<Gift_Certificate> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the gift_ certificates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of gift_ certificates
	 * @param end the upper bound of the range of gift_ certificates (not inclusive)
	 * @return the range of gift_ certificates
	 * @throws SystemException if a system exception occurred
	 */
	public List<Gift_Certificate> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the gift_ certificates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of gift_ certificates
	 * @param end the upper bound of the range of gift_ certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of gift_ certificates
	 * @throws SystemException if a system exception occurred
	 */
	public List<Gift_Certificate> findAll(int start, int end,
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

		List<Gift_Certificate> list = (List<Gift_Certificate>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_GIFT_CERTIFICATE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_GIFT_CERTIFICATE.concat(Gift_CertificateModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<Gift_Certificate>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<Gift_Certificate>)QueryUtil.list(q,
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
	 * Removes all the gift_ certificates from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (Gift_Certificate gift_Certificate : findAll()) {
			remove(gift_Certificate);
		}
	}

	/**
	 * Returns the number of gift_ certificates.
	 *
	 * @return the number of gift_ certificates
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_GIFT_CERTIFICATE);

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
	 * Returns all the lenders associated with the gift_ certificate.
	 *
	 * @param pk the primary key of the gift_ certificate
	 * @return the lenders associated with the gift_ certificate
	 * @throws SystemException if a system exception occurred
	 */
	public List<org.goodreturn.model.Lender> getLenders(long pk)
		throws SystemException {
		return getLenders(pk, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the lenders associated with the gift_ certificate.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the gift_ certificate
	 * @param start the lower bound of the range of gift_ certificates
	 * @param end the upper bound of the range of gift_ certificates (not inclusive)
	 * @return the range of lenders associated with the gift_ certificate
	 * @throws SystemException if a system exception occurred
	 */
	public List<org.goodreturn.model.Lender> getLenders(long pk, int start,
		int end) throws SystemException {
		return getLenders(pk, start, end, null);
	}

	public static final FinderPath FINDER_PATH_GET_LENDERS = new FinderPath(org.goodreturn.model.impl.LenderModelImpl.ENTITY_CACHE_ENABLED,
			org.goodreturn.model.impl.LenderModelImpl.FINDER_CACHE_ENABLED,
			org.goodreturn.model.impl.LenderImpl.class,
			org.goodreturn.service.persistence.LenderPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getLenders",
			new String[] {
				Long.class.getName(), "java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});

	static {
		FINDER_PATH_GET_LENDERS.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns an ordered range of all the lenders associated with the gift_ certificate.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the gift_ certificate
	 * @param start the lower bound of the range of gift_ certificates
	 * @param end the upper bound of the range of gift_ certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of lenders associated with the gift_ certificate
	 * @throws SystemException if a system exception occurred
	 */
	public List<org.goodreturn.model.Lender> getLenders(long pk, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] { pk, start, end, orderByComparator };

		List<org.goodreturn.model.Lender> list = (List<org.goodreturn.model.Lender>)FinderCacheUtil.getResult(FINDER_PATH_GET_LENDERS,
				finderArgs, this);

		if (list == null) {
			Session session = null;

			try {
				session = openSession();

				String sql = null;

				if (orderByComparator != null) {
					sql = _SQL_GETLENDERS.concat(ORDER_BY_CLAUSE)
										 .concat(orderByComparator.getOrderBy());
				}
				else {
					sql = _SQL_GETLENDERS.concat(org.goodreturn.model.impl.LenderModelImpl.ORDER_BY_SQL);
				}

				SQLQuery q = session.createSQLQuery(sql);

				q.addEntity("GoodReturn_Lender",
					org.goodreturn.model.impl.LenderImpl.class);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(pk);

				list = (List<org.goodreturn.model.Lender>)QueryUtil.list(q,
						getDialect(), start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_GET_LENDERS,
						finderArgs);
				}
				else {
					lenderPersistence.cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_GET_LENDERS,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	public static final FinderPath FINDER_PATH_GET_LENDERS_SIZE = new FinderPath(org.goodreturn.model.impl.LenderModelImpl.ENTITY_CACHE_ENABLED,
			org.goodreturn.model.impl.LenderModelImpl.FINDER_CACHE_ENABLED,
			org.goodreturn.model.impl.LenderImpl.class,
			org.goodreturn.service.persistence.LenderPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getLendersSize", new String[] { Long.class.getName() });

	static {
		FINDER_PATH_GET_LENDERS_SIZE.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns the number of lenders associated with the gift_ certificate.
	 *
	 * @param pk the primary key of the gift_ certificate
	 * @return the number of lenders associated with the gift_ certificate
	 * @throws SystemException if a system exception occurred
	 */
	public int getLendersSize(long pk) throws SystemException {
		Object[] finderArgs = new Object[] { pk };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_GET_LENDERS_SIZE,
				finderArgs, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				SQLQuery q = session.createSQLQuery(_SQL_GETLENDERSSIZE);

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

				FinderCacheUtil.putResult(FINDER_PATH_GET_LENDERS_SIZE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	public static final FinderPath FINDER_PATH_CONTAINS_LENDER = new FinderPath(org.goodreturn.model.impl.LenderModelImpl.ENTITY_CACHE_ENABLED,
			org.goodreturn.model.impl.LenderModelImpl.FINDER_CACHE_ENABLED,
			org.goodreturn.model.impl.LenderImpl.class,
			org.goodreturn.service.persistence.LenderPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"containsLender",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns <code>true</code> if the lender is associated with the gift_ certificate.
	 *
	 * @param pk the primary key of the gift_ certificate
	 * @param lenderPK the primary key of the lender
	 * @return <code>true</code> if the lender is associated with the gift_ certificate; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containsLender(long pk, long lenderPK)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk, lenderPK };

		Boolean value = (Boolean)FinderCacheUtil.getResult(FINDER_PATH_CONTAINS_LENDER,
				finderArgs, this);

		if (value == null) {
			try {
				value = Boolean.valueOf(containsLender.contains(pk, lenderPK));
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (value == null) {
					value = Boolean.FALSE;
				}

				FinderCacheUtil.putResult(FINDER_PATH_CONTAINS_LENDER,
					finderArgs, value);
			}
		}

		return value.booleanValue();
	}

	/**
	 * Returns <code>true</code> if the gift_ certificate has any lenders associated with it.
	 *
	 * @param pk the primary key of the gift_ certificate to check for associations with lenders
	 * @return <code>true</code> if the gift_ certificate has any lenders associated with it; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containsLenders(long pk) throws SystemException {
		if (getLendersSize(pk) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Initializes the gift_ certificate persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.goodreturn.model.Gift_Certificate")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Gift_Certificate>> listenersList = new ArrayList<ModelListener<Gift_Certificate>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Gift_Certificate>)InstanceFactory.newInstance(
							listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}

		containsLender = new ContainsLender();
	}

	public void destroy() {
		EntityCacheUtil.removeCache(Gift_CertificateImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@BeanReference(type = BorrowerPersistence.class)
	protected BorrowerPersistence borrowerPersistence;
	@BeanReference(type = BorrowerLoanPersistence.class)
	protected BorrowerLoanPersistence borrowerLoanPersistence;
	@BeanReference(type = Gift_CertificatePersistence.class)
	protected Gift_CertificatePersistence gift_CertificatePersistence;
	@BeanReference(type = LenderPersistence.class)
	protected LenderPersistence lenderPersistence;
	@BeanReference(type = PersonPersistence.class)
	protected PersonPersistence personPersistence;
	@BeanReference(type = StoryPersistence.class)
	protected StoryPersistence storyPersistence;
	@BeanReference(type = TeamPersistence.class)
	protected TeamPersistence teamPersistence;
	@BeanReference(type = TeamLenderPersistence.class)
	protected TeamLenderPersistence teamLenderPersistence;
	@BeanReference(type = TempBlPersistence.class)
	protected TempBlPersistence tempBlPersistence;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	protected ContainsLender containsLender;

	protected class ContainsLender {
		protected ContainsLender() {
			_mappingSqlQuery = MappingSqlQueryFactoryUtil.getMappingSqlQuery(getDataSource(),
					_SQL_CONTAINSLENDER,
					new int[] { java.sql.Types.BIGINT, java.sql.Types.BIGINT },
					RowMapper.COUNT);
		}

		protected boolean contains(long certificate_Id, long lender_Id) {
			List<Integer> results = _mappingSqlQuery.execute(new Object[] {
						new Long(certificate_Id), new Long(lender_Id)
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

	private static final String _SQL_SELECT_GIFT_CERTIFICATE = "SELECT gift_Certificate FROM Gift_Certificate gift_Certificate";
	private static final String _SQL_COUNT_GIFT_CERTIFICATE = "SELECT COUNT(gift_Certificate) FROM Gift_Certificate gift_Certificate";
	private static final String _SQL_GETLENDERS = "SELECT {GoodReturn_Lender.*} FROM GoodReturn_Lender INNER JOIN GoodReturn_Gift_Certificate ON (GoodReturn_Gift_Certificate.certificate_Id = GoodReturn_Lender.certificate_Id) WHERE (GoodReturn_Gift_Certificate.certificate_Id = ?)";
	private static final String _SQL_GETLENDERSSIZE = "SELECT COUNT(*) AS COUNT_VALUE FROM GoodReturn_Lender WHERE certificate_Id = ?";
	private static final String _SQL_CONTAINSLENDER = "SELECT COUNT(*) AS COUNT_VALUE FROM GoodReturn_Lender WHERE certificate_Id = ? AND lender_Id = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "gift_Certificate.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Gift_Certificate exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(Gift_CertificatePersistenceImpl.class);
	private static Gift_Certificate _nullGift_Certificate = new Gift_CertificateImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Gift_Certificate> toCacheModel() {
				return _nullGift_CertificateCacheModel;
			}
		};

	private static CacheModel<Gift_Certificate> _nullGift_CertificateCacheModel = new CacheModel<Gift_Certificate>() {
			public Gift_Certificate toEntityModel() {
				return _nullGift_Certificate;
			}
		};
}