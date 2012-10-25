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
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.BatchSessionUtil;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import org.goodreturn.NoSuchBorrowerLoanException;

import org.goodreturn.model.BorrowerLoan;
import org.goodreturn.model.impl.BorrowerLoanImpl;
import org.goodreturn.model.impl.BorrowerLoanModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the borrower loan service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author gilaa004
 * @see BorrowerLoanPersistence
 * @see BorrowerLoanUtil
 * @generated
 */
public class BorrowerLoanPersistenceImpl extends BasePersistenceImpl<BorrowerLoan>
	implements BorrowerLoanPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link BorrowerLoanUtil} to access the borrower loan persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = BorrowerLoanImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_B_ID = new FinderPath(BorrowerLoanModelImpl.ENTITY_CACHE_ENABLED,
			BorrowerLoanModelImpl.FINDER_CACHE_ENABLED, BorrowerLoanImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByb_Id",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_B_ID = new FinderPath(BorrowerLoanModelImpl.ENTITY_CACHE_ENABLED,
			BorrowerLoanModelImpl.FINDER_CACHE_ENABLED, BorrowerLoanImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByb_Id",
			new String[] { Long.class.getName() },
			BorrowerLoanModelImpl.BORROWER_ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_B_ID = new FinderPath(BorrowerLoanModelImpl.ENTITY_CACHE_ENABLED,
			BorrowerLoanModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByb_Id",
			new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(BorrowerLoanModelImpl.ENTITY_CACHE_ENABLED,
			BorrowerLoanModelImpl.FINDER_CACHE_ENABLED, BorrowerLoanImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(BorrowerLoanModelImpl.ENTITY_CACHE_ENABLED,
			BorrowerLoanModelImpl.FINDER_CACHE_ENABLED, BorrowerLoanImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(BorrowerLoanModelImpl.ENTITY_CACHE_ENABLED,
			BorrowerLoanModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the borrower loan in the entity cache if it is enabled.
	 *
	 * @param borrowerLoan the borrower loan
	 */
	public void cacheResult(BorrowerLoan borrowerLoan) {
		EntityCacheUtil.putResult(BorrowerLoanModelImpl.ENTITY_CACHE_ENABLED,
			BorrowerLoanImpl.class, borrowerLoan.getPrimaryKey(), borrowerLoan);

		borrowerLoan.resetOriginalValues();
	}

	/**
	 * Caches the borrower loans in the entity cache if it is enabled.
	 *
	 * @param borrowerLoans the borrower loans
	 */
	public void cacheResult(List<BorrowerLoan> borrowerLoans) {
		for (BorrowerLoan borrowerLoan : borrowerLoans) {
			if (EntityCacheUtil.getResult(
						BorrowerLoanModelImpl.ENTITY_CACHE_ENABLED,
						BorrowerLoanImpl.class, borrowerLoan.getPrimaryKey()) == null) {
				cacheResult(borrowerLoan);
			}
			else {
				borrowerLoan.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all borrower loans.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(BorrowerLoanImpl.class.getName());
		}

		EntityCacheUtil.clearCache(BorrowerLoanImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the borrower loan.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(BorrowerLoan borrowerLoan) {
		EntityCacheUtil.removeResult(BorrowerLoanModelImpl.ENTITY_CACHE_ENABLED,
			BorrowerLoanImpl.class, borrowerLoan.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<BorrowerLoan> borrowerLoans) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (BorrowerLoan borrowerLoan : borrowerLoans) {
			EntityCacheUtil.removeResult(BorrowerLoanModelImpl.ENTITY_CACHE_ENABLED,
				BorrowerLoanImpl.class, borrowerLoan.getPrimaryKey());
		}
	}

	/**
	 * Creates a new borrower loan with the primary key. Does not add the borrower loan to the database.
	 *
	 * @param abacus_Borrower_Loan_Id the primary key for the new borrower loan
	 * @return the new borrower loan
	 */
	public BorrowerLoan create(long abacus_Borrower_Loan_Id) {
		BorrowerLoan borrowerLoan = new BorrowerLoanImpl();

		borrowerLoan.setNew(true);
		borrowerLoan.setPrimaryKey(abacus_Borrower_Loan_Id);

		return borrowerLoan;
	}

	/**
	 * Removes the borrower loan with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param abacus_Borrower_Loan_Id the primary key of the borrower loan
	 * @return the borrower loan that was removed
	 * @throws org.goodreturn.NoSuchBorrowerLoanException if a borrower loan with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public BorrowerLoan remove(long abacus_Borrower_Loan_Id)
		throws NoSuchBorrowerLoanException, SystemException {
		return remove(Long.valueOf(abacus_Borrower_Loan_Id));
	}

	/**
	 * Removes the borrower loan with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the borrower loan
	 * @return the borrower loan that was removed
	 * @throws org.goodreturn.NoSuchBorrowerLoanException if a borrower loan with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BorrowerLoan remove(Serializable primaryKey)
		throws NoSuchBorrowerLoanException, SystemException {
		Session session = null;

		try {
			session = openSession();

			BorrowerLoan borrowerLoan = (BorrowerLoan)session.get(BorrowerLoanImpl.class,
					primaryKey);

			if (borrowerLoan == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchBorrowerLoanException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(borrowerLoan);
		}
		catch (NoSuchBorrowerLoanException nsee) {
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
	protected BorrowerLoan removeImpl(BorrowerLoan borrowerLoan)
		throws SystemException {
		borrowerLoan = toUnwrappedModel(borrowerLoan);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, borrowerLoan);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(borrowerLoan);

		return borrowerLoan;
	}

	@Override
	public BorrowerLoan updateImpl(
		org.goodreturn.model.BorrowerLoan borrowerLoan, boolean merge)
		throws SystemException {
		borrowerLoan = toUnwrappedModel(borrowerLoan);

		boolean isNew = borrowerLoan.isNew();

		BorrowerLoanModelImpl borrowerLoanModelImpl = (BorrowerLoanModelImpl)borrowerLoan;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, borrowerLoan, merge);

			borrowerLoan.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !BorrowerLoanModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((borrowerLoanModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_B_ID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(borrowerLoanModelImpl.getOriginalBorrower_Id())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_B_ID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_B_ID,
					args);

				args = new Object[] {
						Long.valueOf(borrowerLoanModelImpl.getBorrower_Id())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_B_ID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_B_ID,
					args);
			}
		}

		EntityCacheUtil.putResult(BorrowerLoanModelImpl.ENTITY_CACHE_ENABLED,
			BorrowerLoanImpl.class, borrowerLoan.getPrimaryKey(), borrowerLoan);

		return borrowerLoan;
	}

	protected BorrowerLoan toUnwrappedModel(BorrowerLoan borrowerLoan) {
		if (borrowerLoan instanceof BorrowerLoanImpl) {
			return borrowerLoan;
		}

		BorrowerLoanImpl borrowerLoanImpl = new BorrowerLoanImpl();

		borrowerLoanImpl.setNew(borrowerLoan.isNew());
		borrowerLoanImpl.setPrimaryKey(borrowerLoan.getPrimaryKey());

		borrowerLoanImpl.setAbacus_Borrower_Loan_Id(borrowerLoan.getAbacus_Borrower_Loan_Id());
		borrowerLoanImpl.setBorrower_Id(borrowerLoan.getBorrower_Id());
		borrowerLoanImpl.setAbacus_mfi_Id(borrowerLoan.getAbacus_mfi_Id());
		borrowerLoanImpl.setChanged_By(borrowerLoan.getChanged_By());
		borrowerLoanImpl.setChanged_Time(borrowerLoan.getChanged_Time());

		return borrowerLoanImpl;
	}

	/**
	 * Returns the borrower loan with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the borrower loan
	 * @return the borrower loan
	 * @throws com.liferay.portal.NoSuchModelException if a borrower loan with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BorrowerLoan findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the borrower loan with the primary key or throws a {@link org.goodreturn.NoSuchBorrowerLoanException} if it could not be found.
	 *
	 * @param abacus_Borrower_Loan_Id the primary key of the borrower loan
	 * @return the borrower loan
	 * @throws org.goodreturn.NoSuchBorrowerLoanException if a borrower loan with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public BorrowerLoan findByPrimaryKey(long abacus_Borrower_Loan_Id)
		throws NoSuchBorrowerLoanException, SystemException {
		BorrowerLoan borrowerLoan = fetchByPrimaryKey(abacus_Borrower_Loan_Id);

		if (borrowerLoan == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					abacus_Borrower_Loan_Id);
			}

			throw new NoSuchBorrowerLoanException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				abacus_Borrower_Loan_Id);
		}

		return borrowerLoan;
	}

	/**
	 * Returns the borrower loan with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the borrower loan
	 * @return the borrower loan, or <code>null</code> if a borrower loan with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BorrowerLoan fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the borrower loan with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param abacus_Borrower_Loan_Id the primary key of the borrower loan
	 * @return the borrower loan, or <code>null</code> if a borrower loan with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public BorrowerLoan fetchByPrimaryKey(long abacus_Borrower_Loan_Id)
		throws SystemException {
		BorrowerLoan borrowerLoan = (BorrowerLoan)EntityCacheUtil.getResult(BorrowerLoanModelImpl.ENTITY_CACHE_ENABLED,
				BorrowerLoanImpl.class, abacus_Borrower_Loan_Id);

		if (borrowerLoan == _nullBorrowerLoan) {
			return null;
		}

		if (borrowerLoan == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				borrowerLoan = (BorrowerLoan)session.get(BorrowerLoanImpl.class,
						Long.valueOf(abacus_Borrower_Loan_Id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (borrowerLoan != null) {
					cacheResult(borrowerLoan);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(BorrowerLoanModelImpl.ENTITY_CACHE_ENABLED,
						BorrowerLoanImpl.class, abacus_Borrower_Loan_Id,
						_nullBorrowerLoan);
				}

				closeSession(session);
			}
		}

		return borrowerLoan;
	}

	/**
	 * Returns all the borrower loans where borrower_Id = &#63;.
	 *
	 * @param borrower_Id the borrower_ ID
	 * @return the matching borrower loans
	 * @throws SystemException if a system exception occurred
	 */
	public List<BorrowerLoan> findByb_Id(long borrower_Id)
		throws SystemException {
		return findByb_Id(borrower_Id, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the borrower loans where borrower_Id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param borrower_Id the borrower_ ID
	 * @param start the lower bound of the range of borrower loans
	 * @param end the upper bound of the range of borrower loans (not inclusive)
	 * @return the range of matching borrower loans
	 * @throws SystemException if a system exception occurred
	 */
	public List<BorrowerLoan> findByb_Id(long borrower_Id, int start, int end)
		throws SystemException {
		return findByb_Id(borrower_Id, start, end, null);
	}

	/**
	 * Returns an ordered range of all the borrower loans where borrower_Id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param borrower_Id the borrower_ ID
	 * @param start the lower bound of the range of borrower loans
	 * @param end the upper bound of the range of borrower loans (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching borrower loans
	 * @throws SystemException if a system exception occurred
	 */
	public List<BorrowerLoan> findByb_Id(long borrower_Id, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_B_ID;
			finderArgs = new Object[] { borrower_Id };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_B_ID;
			finderArgs = new Object[] { borrower_Id, start, end, orderByComparator };
		}

		List<BorrowerLoan> list = (List<BorrowerLoan>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (BorrowerLoan borrowerLoan : list) {
				if ((borrower_Id != borrowerLoan.getBorrower_Id())) {
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
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_BORROWERLOAN_WHERE);

			query.append(_FINDER_COLUMN_B_ID_BORROWER_ID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(BorrowerLoanModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(borrower_Id);

				list = (List<BorrowerLoan>)QueryUtil.list(q, getDialect(),
						start, end);
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
	 * Returns the first borrower loan in the ordered set where borrower_Id = &#63;.
	 *
	 * @param borrower_Id the borrower_ ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching borrower loan
	 * @throws org.goodreturn.NoSuchBorrowerLoanException if a matching borrower loan could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public BorrowerLoan findByb_Id_First(long borrower_Id,
		OrderByComparator orderByComparator)
		throws NoSuchBorrowerLoanException, SystemException {
		BorrowerLoan borrowerLoan = fetchByb_Id_First(borrower_Id,
				orderByComparator);

		if (borrowerLoan != null) {
			return borrowerLoan;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("borrower_Id=");
		msg.append(borrower_Id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchBorrowerLoanException(msg.toString());
	}

	/**
	 * Returns the first borrower loan in the ordered set where borrower_Id = &#63;.
	 *
	 * @param borrower_Id the borrower_ ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching borrower loan, or <code>null</code> if a matching borrower loan could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public BorrowerLoan fetchByb_Id_First(long borrower_Id,
		OrderByComparator orderByComparator) throws SystemException {
		List<BorrowerLoan> list = findByb_Id(borrower_Id, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last borrower loan in the ordered set where borrower_Id = &#63;.
	 *
	 * @param borrower_Id the borrower_ ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching borrower loan
	 * @throws org.goodreturn.NoSuchBorrowerLoanException if a matching borrower loan could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public BorrowerLoan findByb_Id_Last(long borrower_Id,
		OrderByComparator orderByComparator)
		throws NoSuchBorrowerLoanException, SystemException {
		BorrowerLoan borrowerLoan = fetchByb_Id_Last(borrower_Id,
				orderByComparator);

		if (borrowerLoan != null) {
			return borrowerLoan;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("borrower_Id=");
		msg.append(borrower_Id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchBorrowerLoanException(msg.toString());
	}

	/**
	 * Returns the last borrower loan in the ordered set where borrower_Id = &#63;.
	 *
	 * @param borrower_Id the borrower_ ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching borrower loan, or <code>null</code> if a matching borrower loan could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public BorrowerLoan fetchByb_Id_Last(long borrower_Id,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByb_Id(borrower_Id);

		List<BorrowerLoan> list = findByb_Id(borrower_Id, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the borrower loans before and after the current borrower loan in the ordered set where borrower_Id = &#63;.
	 *
	 * @param abacus_Borrower_Loan_Id the primary key of the current borrower loan
	 * @param borrower_Id the borrower_ ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next borrower loan
	 * @throws org.goodreturn.NoSuchBorrowerLoanException if a borrower loan with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public BorrowerLoan[] findByb_Id_PrevAndNext(long abacus_Borrower_Loan_Id,
		long borrower_Id, OrderByComparator orderByComparator)
		throws NoSuchBorrowerLoanException, SystemException {
		BorrowerLoan borrowerLoan = findByPrimaryKey(abacus_Borrower_Loan_Id);

		Session session = null;

		try {
			session = openSession();

			BorrowerLoan[] array = new BorrowerLoanImpl[3];

			array[0] = getByb_Id_PrevAndNext(session, borrowerLoan,
					borrower_Id, orderByComparator, true);

			array[1] = borrowerLoan;

			array[2] = getByb_Id_PrevAndNext(session, borrowerLoan,
					borrower_Id, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected BorrowerLoan getByb_Id_PrevAndNext(Session session,
		BorrowerLoan borrowerLoan, long borrower_Id,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_BORROWERLOAN_WHERE);

		query.append(_FINDER_COLUMN_B_ID_BORROWER_ID_2);

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

		else {
			query.append(BorrowerLoanModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(borrower_Id);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(borrowerLoan);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<BorrowerLoan> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the borrower loans.
	 *
	 * @return the borrower loans
	 * @throws SystemException if a system exception occurred
	 */
	public List<BorrowerLoan> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the borrower loans.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of borrower loans
	 * @param end the upper bound of the range of borrower loans (not inclusive)
	 * @return the range of borrower loans
	 * @throws SystemException if a system exception occurred
	 */
	public List<BorrowerLoan> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the borrower loans.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of borrower loans
	 * @param end the upper bound of the range of borrower loans (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of borrower loans
	 * @throws SystemException if a system exception occurred
	 */
	public List<BorrowerLoan> findAll(int start, int end,
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

		List<BorrowerLoan> list = (List<BorrowerLoan>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_BORROWERLOAN);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_BORROWERLOAN.concat(BorrowerLoanModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<BorrowerLoan>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<BorrowerLoan>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the borrower loans where borrower_Id = &#63; from the database.
	 *
	 * @param borrower_Id the borrower_ ID
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByb_Id(long borrower_Id) throws SystemException {
		for (BorrowerLoan borrowerLoan : findByb_Id(borrower_Id)) {
			remove(borrowerLoan);
		}
	}

	/**
	 * Removes all the borrower loans from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (BorrowerLoan borrowerLoan : findAll()) {
			remove(borrowerLoan);
		}
	}

	/**
	 * Returns the number of borrower loans where borrower_Id = &#63;.
	 *
	 * @param borrower_Id the borrower_ ID
	 * @return the number of matching borrower loans
	 * @throws SystemException if a system exception occurred
	 */
	public int countByb_Id(long borrower_Id) throws SystemException {
		Object[] finderArgs = new Object[] { borrower_Id };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_B_ID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_BORROWERLOAN_WHERE);

			query.append(_FINDER_COLUMN_B_ID_BORROWER_ID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(borrower_Id);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_B_ID,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of borrower loans.
	 *
	 * @return the number of borrower loans
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_BORROWERLOAN);

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
	 * Returns all the stories associated with the borrower loan.
	 *
	 * @param pk the primary key of the borrower loan
	 * @return the stories associated with the borrower loan
	 * @throws SystemException if a system exception occurred
	 */
	public List<org.goodreturn.model.Story> getStories(long pk)
		throws SystemException {
		return getStories(pk, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the stories associated with the borrower loan.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the borrower loan
	 * @param start the lower bound of the range of borrower loans
	 * @param end the upper bound of the range of borrower loans (not inclusive)
	 * @return the range of stories associated with the borrower loan
	 * @throws SystemException if a system exception occurred
	 */
	public List<org.goodreturn.model.Story> getStories(long pk, int start,
		int end) throws SystemException {
		return getStories(pk, start, end, null);
	}

	public static final FinderPath FINDER_PATH_GET_STORIES = new FinderPath(org.goodreturn.model.impl.StoryModelImpl.ENTITY_CACHE_ENABLED,
			org.goodreturn.model.impl.StoryModelImpl.FINDER_CACHE_ENABLED,
			org.goodreturn.model.impl.StoryImpl.class,
			org.goodreturn.service.persistence.StoryPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getStories",
			new String[] {
				Long.class.getName(), "java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});

	static {
		FINDER_PATH_GET_STORIES.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns an ordered range of all the stories associated with the borrower loan.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the borrower loan
	 * @param start the lower bound of the range of borrower loans
	 * @param end the upper bound of the range of borrower loans (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of stories associated with the borrower loan
	 * @throws SystemException if a system exception occurred
	 */
	public List<org.goodreturn.model.Story> getStories(long pk, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] { pk, start, end, orderByComparator };

		List<org.goodreturn.model.Story> list = (List<org.goodreturn.model.Story>)FinderCacheUtil.getResult(FINDER_PATH_GET_STORIES,
				finderArgs, this);

		if (list == null) {
			Session session = null;

			try {
				session = openSession();

				String sql = null;

				if (orderByComparator != null) {
					sql = _SQL_GETSTORIES.concat(ORDER_BY_CLAUSE)
										 .concat(orderByComparator.getOrderBy());
				}
				else {
					sql = _SQL_GETSTORIES.concat(org.goodreturn.model.impl.StoryModelImpl.ORDER_BY_SQL);
				}

				SQLQuery q = session.createSQLQuery(sql);

				q.addEntity("GoodReturn_Story",
					org.goodreturn.model.impl.StoryImpl.class);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(pk);

				list = (List<org.goodreturn.model.Story>)QueryUtil.list(q,
						getDialect(), start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_GET_STORIES,
						finderArgs);
				}
				else {
					storyPersistence.cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_GET_STORIES,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	public static final FinderPath FINDER_PATH_GET_STORIES_SIZE = new FinderPath(org.goodreturn.model.impl.StoryModelImpl.ENTITY_CACHE_ENABLED,
			org.goodreturn.model.impl.StoryModelImpl.FINDER_CACHE_ENABLED,
			org.goodreturn.model.impl.StoryImpl.class,
			org.goodreturn.service.persistence.StoryPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getStoriesSize", new String[] { Long.class.getName() });

	static {
		FINDER_PATH_GET_STORIES_SIZE.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns the number of stories associated with the borrower loan.
	 *
	 * @param pk the primary key of the borrower loan
	 * @return the number of stories associated with the borrower loan
	 * @throws SystemException if a system exception occurred
	 */
	public int getStoriesSize(long pk) throws SystemException {
		Object[] finderArgs = new Object[] { pk };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_GET_STORIES_SIZE,
				finderArgs, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				SQLQuery q = session.createSQLQuery(_SQL_GETSTORIESSIZE);

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

				FinderCacheUtil.putResult(FINDER_PATH_GET_STORIES_SIZE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	public static final FinderPath FINDER_PATH_CONTAINS_STORY = new FinderPath(org.goodreturn.model.impl.StoryModelImpl.ENTITY_CACHE_ENABLED,
			org.goodreturn.model.impl.StoryModelImpl.FINDER_CACHE_ENABLED,
			org.goodreturn.model.impl.StoryImpl.class,
			org.goodreturn.service.persistence.StoryPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"containsStory",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns <code>true</code> if the story is associated with the borrower loan.
	 *
	 * @param pk the primary key of the borrower loan
	 * @param storyPK the primary key of the story
	 * @return <code>true</code> if the story is associated with the borrower loan; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containsStory(long pk, long storyPK)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk, storyPK };

		Boolean value = (Boolean)FinderCacheUtil.getResult(FINDER_PATH_CONTAINS_STORY,
				finderArgs, this);

		if (value == null) {
			try {
				value = Boolean.valueOf(containsStory.contains(pk, storyPK));
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (value == null) {
					value = Boolean.FALSE;
				}

				FinderCacheUtil.putResult(FINDER_PATH_CONTAINS_STORY,
					finderArgs, value);
			}
		}

		return value.booleanValue();
	}

	/**
	 * Returns <code>true</code> if the borrower loan has any stories associated with it.
	 *
	 * @param pk the primary key of the borrower loan to check for associations with stories
	 * @return <code>true</code> if the borrower loan has any stories associated with it; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containsStories(long pk) throws SystemException {
		if (getStoriesSize(pk) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Initializes the borrower loan persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.goodreturn.model.BorrowerLoan")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<BorrowerLoan>> listenersList = new ArrayList<ModelListener<BorrowerLoan>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<BorrowerLoan>)InstanceFactory.newInstance(
							listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}

		containsStory = new ContainsStory();
	}

	public void destroy() {
		EntityCacheUtil.removeCache(BorrowerLoanImpl.class.getName());
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
	protected ContainsStory containsStory;

	protected class ContainsStory {
		protected ContainsStory() {
			_mappingSqlQuery = MappingSqlQueryFactoryUtil.getMappingSqlQuery(getDataSource(),
					_SQL_CONTAINSSTORY,
					new int[] { java.sql.Types.BIGINT, java.sql.Types.BIGINT },
					RowMapper.COUNT);
		}

		protected boolean contains(long abacus_Borrower_Loan_Id, long story_Id) {
			List<Integer> results = _mappingSqlQuery.execute(new Object[] {
						new Long(abacus_Borrower_Loan_Id), new Long(story_Id)
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

	private static final String _SQL_SELECT_BORROWERLOAN = "SELECT borrowerLoan FROM BorrowerLoan borrowerLoan";
	private static final String _SQL_SELECT_BORROWERLOAN_WHERE = "SELECT borrowerLoan FROM BorrowerLoan borrowerLoan WHERE ";
	private static final String _SQL_COUNT_BORROWERLOAN = "SELECT COUNT(borrowerLoan) FROM BorrowerLoan borrowerLoan";
	private static final String _SQL_COUNT_BORROWERLOAN_WHERE = "SELECT COUNT(borrowerLoan) FROM BorrowerLoan borrowerLoan WHERE ";
	private static final String _SQL_GETSTORIES = "SELECT {GoodReturn_Story.*} FROM GoodReturn_Story INNER JOIN GoodReturn_BorrowerLoan ON (GoodReturn_BorrowerLoan.abacus_Borrower_Loan_Id = GoodReturn_Story.abacus_Borrower_Loan_Id) WHERE (GoodReturn_BorrowerLoan.abacus_Borrower_Loan_Id = ?)";
	private static final String _SQL_GETSTORIESSIZE = "SELECT COUNT(*) AS COUNT_VALUE FROM GoodReturn_Story WHERE abacus_Borrower_Loan_Id = ?";
	private static final String _SQL_CONTAINSSTORY = "SELECT COUNT(*) AS COUNT_VALUE FROM GoodReturn_Story WHERE abacus_Borrower_Loan_Id = ? AND story_Id = ?";
	private static final String _FINDER_COLUMN_B_ID_BORROWER_ID_2 = "borrowerLoan.borrower_Id = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "borrowerLoan.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No BorrowerLoan exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No BorrowerLoan exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(BorrowerLoanPersistenceImpl.class);
	private static BorrowerLoan _nullBorrowerLoan = new BorrowerLoanImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<BorrowerLoan> toCacheModel() {
				return _nullBorrowerLoanCacheModel;
			}
		};

	private static CacheModel<BorrowerLoan> _nullBorrowerLoanCacheModel = new CacheModel<BorrowerLoan>() {
			public BorrowerLoan toEntityModel() {
				return _nullBorrowerLoan;
			}
		};
}