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
import com.liferay.portal.kernel.dao.orm.QueryPos;
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
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.BatchSessionUtil;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import org.goodreturn.NoSuchTempBlException;

import org.goodreturn.model.TempBl;
import org.goodreturn.model.impl.TempBlImpl;
import org.goodreturn.model.impl.TempBlModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the temp bl service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author gilaa004
 * @see TempBlPersistence
 * @see TempBlUtil
 * @generated
 */
public class TempBlPersistenceImpl extends BasePersistenceImpl<TempBl>
	implements TempBlPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TempBlUtil} to access the temp bl persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TempBlImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID = new FinderPath(TempBlModelImpl.ENTITY_CACHE_ENABLED,
			TempBlModelImpl.FINDER_CACHE_ENABLED, TempBlImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByGroupId",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID =
		new FinderPath(TempBlModelImpl.ENTITY_CACHE_ENABLED,
			TempBlModelImpl.FINDER_CACHE_ENABLED, TempBlImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByGroupId",
			new String[] { Long.class.getName() },
			TempBlModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_GROUPID = new FinderPath(TempBlModelImpl.ENTITY_CACHE_ENABLED,
			TempBlModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByGroupId",
			new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TempBlModelImpl.ENTITY_CACHE_ENABLED,
			TempBlModelImpl.FINDER_CACHE_ENABLED, TempBlImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TempBlModelImpl.ENTITY_CACHE_ENABLED,
			TempBlModelImpl.FINDER_CACHE_ENABLED, TempBlImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TempBlModelImpl.ENTITY_CACHE_ENABLED,
			TempBlModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the temp bl in the entity cache if it is enabled.
	 *
	 * @param tempBl the temp bl
	 */
	public void cacheResult(TempBl tempBl) {
		EntityCacheUtil.putResult(TempBlModelImpl.ENTITY_CACHE_ENABLED,
			TempBlImpl.class, tempBl.getPrimaryKey(), tempBl);

		tempBl.resetOriginalValues();
	}

	/**
	 * Caches the temp bls in the entity cache if it is enabled.
	 *
	 * @param tempBls the temp bls
	 */
	public void cacheResult(List<TempBl> tempBls) {
		for (TempBl tempBl : tempBls) {
			if (EntityCacheUtil.getResult(
						TempBlModelImpl.ENTITY_CACHE_ENABLED, TempBlImpl.class,
						tempBl.getPrimaryKey()) == null) {
				cacheResult(tempBl);
			}
			else {
				tempBl.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all temp bls.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(TempBlImpl.class.getName());
		}

		EntityCacheUtil.clearCache(TempBlImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the temp bl.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TempBl tempBl) {
		EntityCacheUtil.removeResult(TempBlModelImpl.ENTITY_CACHE_ENABLED,
			TempBlImpl.class, tempBl.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<TempBl> tempBls) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TempBl tempBl : tempBls) {
			EntityCacheUtil.removeResult(TempBlModelImpl.ENTITY_CACHE_ENABLED,
				TempBlImpl.class, tempBl.getPrimaryKey());
		}
	}

	/**
	 * Creates a new temp bl with the primary key. Does not add the temp bl to the database.
	 *
	 * @param tempBlPK the primary key for the new temp bl
	 * @return the new temp bl
	 */
	public TempBl create(TempBlPK tempBlPK) {
		TempBl tempBl = new TempBlImpl();

		tempBl.setNew(true);
		tempBl.setPrimaryKey(tempBlPK);

		return tempBl;
	}

	/**
	 * Removes the temp bl with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tempBlPK the primary key of the temp bl
	 * @return the temp bl that was removed
	 * @throws org.goodreturn.NoSuchTempBlException if a temp bl with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempBl remove(TempBlPK tempBlPK)
		throws NoSuchTempBlException, SystemException {
		return remove((Serializable)tempBlPK);
	}

	/**
	 * Removes the temp bl with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the temp bl
	 * @return the temp bl that was removed
	 * @throws org.goodreturn.NoSuchTempBlException if a temp bl with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempBl remove(Serializable primaryKey)
		throws NoSuchTempBlException, SystemException {
		Session session = null;

		try {
			session = openSession();

			TempBl tempBl = (TempBl)session.get(TempBlImpl.class, primaryKey);

			if (tempBl == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTempBlException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(tempBl);
		}
		catch (NoSuchTempBlException nsee) {
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
	protected TempBl removeImpl(TempBl tempBl) throws SystemException {
		tempBl = toUnwrappedModel(tempBl);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, tempBl);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(tempBl);

		return tempBl;
	}

	@Override
	public TempBl updateImpl(org.goodreturn.model.TempBl tempBl, boolean merge)
		throws SystemException {
		tempBl = toUnwrappedModel(tempBl);

		boolean isNew = tempBl.isNew();

		TempBlModelImpl tempBlModelImpl = (TempBlModelImpl)tempBl;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, tempBl, merge);

			tempBl.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !TempBlModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((tempBlModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(tempBlModelImpl.getOriginalGroupId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);

				args = new Object[] { Long.valueOf(tempBlModelImpl.getGroupId()) };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);
			}
		}

		EntityCacheUtil.putResult(TempBlModelImpl.ENTITY_CACHE_ENABLED,
			TempBlImpl.class, tempBl.getPrimaryKey(), tempBl);

		return tempBl;
	}

	protected TempBl toUnwrappedModel(TempBl tempBl) {
		if (tempBl instanceof TempBlImpl) {
			return tempBl;
		}

		TempBlImpl tempBlImpl = new TempBlImpl();

		tempBlImpl.setNew(tempBl.isNew());
		tempBlImpl.setPrimaryKey(tempBl.getPrimaryKey());

		tempBlImpl.setBorrower_Name(tempBl.getBorrower_Name());
		tempBlImpl.setBorrower_Loan_Id(tempBl.getBorrower_Loan_Id());
		tempBlImpl.setGroupId(tempBl.getGroupId());
		tempBlImpl.setCompanyId(tempBl.getCompanyId());

		return tempBlImpl;
	}

	/**
	 * Returns the temp bl with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the temp bl
	 * @return the temp bl
	 * @throws com.liferay.portal.NoSuchModelException if a temp bl with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempBl findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey((TempBlPK)primaryKey);
	}

	/**
	 * Returns the temp bl with the primary key or throws a {@link org.goodreturn.NoSuchTempBlException} if it could not be found.
	 *
	 * @param tempBlPK the primary key of the temp bl
	 * @return the temp bl
	 * @throws org.goodreturn.NoSuchTempBlException if a temp bl with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempBl findByPrimaryKey(TempBlPK tempBlPK)
		throws NoSuchTempBlException, SystemException {
		TempBl tempBl = fetchByPrimaryKey(tempBlPK);

		if (tempBl == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + tempBlPK);
			}

			throw new NoSuchTempBlException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				tempBlPK);
		}

		return tempBl;
	}

	/**
	 * Returns the temp bl with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the temp bl
	 * @return the temp bl, or <code>null</code> if a temp bl with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempBl fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey((TempBlPK)primaryKey);
	}

	/**
	 * Returns the temp bl with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tempBlPK the primary key of the temp bl
	 * @return the temp bl, or <code>null</code> if a temp bl with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempBl fetchByPrimaryKey(TempBlPK tempBlPK)
		throws SystemException {
		TempBl tempBl = (TempBl)EntityCacheUtil.getResult(TempBlModelImpl.ENTITY_CACHE_ENABLED,
				TempBlImpl.class, tempBlPK);

		if (tempBl == _nullTempBl) {
			return null;
		}

		if (tempBl == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				tempBl = (TempBl)session.get(TempBlImpl.class, tempBlPK);
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (tempBl != null) {
					cacheResult(tempBl);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(TempBlModelImpl.ENTITY_CACHE_ENABLED,
						TempBlImpl.class, tempBlPK, _nullTempBl);
				}

				closeSession(session);
			}
		}

		return tempBl;
	}

	/**
	 * Returns all the temp bls where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching temp bls
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempBl> findByGroupId(long groupId) throws SystemException {
		return findByGroupId(groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the temp bls where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of temp bls
	 * @param end the upper bound of the range of temp bls (not inclusive)
	 * @return the range of matching temp bls
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempBl> findByGroupId(long groupId, int start, int end)
		throws SystemException {
		return findByGroupId(groupId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp bls where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of temp bls
	 * @param end the upper bound of the range of temp bls (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching temp bls
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempBl> findByGroupId(long groupId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID;
			finderArgs = new Object[] { groupId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID;
			finderArgs = new Object[] { groupId, start, end, orderByComparator };
		}

		List<TempBl> list = (List<TempBl>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TempBl tempBl : list) {
				if ((groupId != tempBl.getGroupId())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(2);
			}

			query.append(_SQL_SELECT_TEMPBL_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				list = (List<TempBl>)QueryUtil.list(q, getDialect(), start, end);
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
	 * Returns the first temp bl in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp bl
	 * @throws org.goodreturn.NoSuchTempBlException if a matching temp bl could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempBl findByGroupId_First(long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchTempBlException, SystemException {
		TempBl tempBl = fetchByGroupId_First(groupId, orderByComparator);

		if (tempBl != null) {
			return tempBl;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTempBlException(msg.toString());
	}

	/**
	 * Returns the first temp bl in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp bl, or <code>null</code> if a matching temp bl could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempBl fetchByGroupId_First(long groupId,
		OrderByComparator orderByComparator) throws SystemException {
		List<TempBl> list = findByGroupId(groupId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last temp bl in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp bl
	 * @throws org.goodreturn.NoSuchTempBlException if a matching temp bl could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempBl findByGroupId_Last(long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchTempBlException, SystemException {
		TempBl tempBl = fetchByGroupId_Last(groupId, orderByComparator);

		if (tempBl != null) {
			return tempBl;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTempBlException(msg.toString());
	}

	/**
	 * Returns the last temp bl in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp bl, or <code>null</code> if a matching temp bl could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempBl fetchByGroupId_Last(long groupId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByGroupId(groupId);

		List<TempBl> list = findByGroupId(groupId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the temp bls before and after the current temp bl in the ordered set where groupId = &#63;.
	 *
	 * @param tempBlPK the primary key of the current temp bl
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next temp bl
	 * @throws org.goodreturn.NoSuchTempBlException if a temp bl with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TempBl[] findByGroupId_PrevAndNext(TempBlPK tempBlPK, long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchTempBlException, SystemException {
		TempBl tempBl = findByPrimaryKey(tempBlPK);

		Session session = null;

		try {
			session = openSession();

			TempBl[] array = new TempBlImpl[3];

			array[0] = getByGroupId_PrevAndNext(session, tempBl, groupId,
					orderByComparator, true);

			array[1] = tempBl;

			array[2] = getByGroupId_PrevAndNext(session, tempBl, groupId,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected TempBl getByGroupId_PrevAndNext(Session session, TempBl tempBl,
		long groupId, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TEMPBL_WHERE);

		query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(tempBl);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TempBl> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the temp bls.
	 *
	 * @return the temp bls
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempBl> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the temp bls.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of temp bls
	 * @param end the upper bound of the range of temp bls (not inclusive)
	 * @return the range of temp bls
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempBl> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp bls.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of temp bls
	 * @param end the upper bound of the range of temp bls (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of temp bls
	 * @throws SystemException if a system exception occurred
	 */
	public List<TempBl> findAll(int start, int end,
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

		List<TempBl> list = (List<TempBl>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TEMPBL);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TEMPBL;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<TempBl>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);
				}
				else {
					list = (List<TempBl>)QueryUtil.list(q, getDialect(), start,
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
	 * Removes all the temp bls where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByGroupId(long groupId) throws SystemException {
		for (TempBl tempBl : findByGroupId(groupId)) {
			remove(tempBl);
		}
	}

	/**
	 * Removes all the temp bls from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (TempBl tempBl : findAll()) {
			remove(tempBl);
		}
	}

	/**
	 * Returns the number of temp bls where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching temp bls
	 * @throws SystemException if a system exception occurred
	 */
	public int countByGroupId(long groupId) throws SystemException {
		Object[] finderArgs = new Object[] { groupId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_GROUPID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_TEMPBL_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_GROUPID,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of temp bls.
	 *
	 * @return the number of temp bls
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_TEMPBL);

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
	 * Initializes the temp bl persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.goodreturn.model.TempBl")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<TempBl>> listenersList = new ArrayList<ModelListener<TempBl>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<TempBl>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(TempBlImpl.class.getName());
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
	private static final String _SQL_SELECT_TEMPBL = "SELECT tempBl FROM TempBl tempBl";
	private static final String _SQL_SELECT_TEMPBL_WHERE = "SELECT tempBl FROM TempBl tempBl WHERE ";
	private static final String _SQL_COUNT_TEMPBL = "SELECT COUNT(tempBl) FROM TempBl tempBl";
	private static final String _SQL_COUNT_TEMPBL_WHERE = "SELECT COUNT(tempBl) FROM TempBl tempBl WHERE ";
	private static final String _FINDER_COLUMN_GROUPID_GROUPID_2 = "tempBl.groupId = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tempBl.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TempBl exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No TempBl exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(TempBlPersistenceImpl.class);
	private static TempBl _nullTempBl = new TempBlImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<TempBl> toCacheModel() {
				return _nullTempBlCacheModel;
			}
		};

	private static CacheModel<TempBl> _nullTempBlCacheModel = new CacheModel<TempBl>() {
			public TempBl toEntityModel() {
				return _nullTempBl;
			}
		};
}