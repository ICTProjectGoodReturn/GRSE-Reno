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

import org.GoodReturn.NoSuchLoanException;

import org.GoodReturn.model.Loan;
import org.GoodReturn.model.impl.LoanImpl;
import org.GoodReturn.model.impl.LoanModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the loan service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author gilaa004
 * @see LoanPersistence
 * @see LoanUtil
 * @generated
 */
public class LoanPersistenceImpl extends BasePersistenceImpl<Loan>
	implements LoanPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link LoanUtil} to access the loan persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = LoanImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(LoanModelImpl.ENTITY_CACHE_ENABLED,
			LoanModelImpl.FINDER_CACHE_ENABLED, LoanImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(LoanModelImpl.ENTITY_CACHE_ENABLED,
			LoanModelImpl.FINDER_CACHE_ENABLED, LoanImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(LoanModelImpl.ENTITY_CACHE_ENABLED,
			LoanModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the loan in the entity cache if it is enabled.
	 *
	 * @param loan the loan
	 */
	public void cacheResult(Loan loan) {
		EntityCacheUtil.putResult(LoanModelImpl.ENTITY_CACHE_ENABLED,
			LoanImpl.class, loan.getPrimaryKey(), loan);

		loan.resetOriginalValues();
	}

	/**
	 * Caches the loans in the entity cache if it is enabled.
	 *
	 * @param loans the loans
	 */
	public void cacheResult(List<Loan> loans) {
		for (Loan loan : loans) {
			if (EntityCacheUtil.getResult(LoanModelImpl.ENTITY_CACHE_ENABLED,
						LoanImpl.class, loan.getPrimaryKey()) == null) {
				cacheResult(loan);
			}
			else {
				loan.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all loans.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(LoanImpl.class.getName());
		}

		EntityCacheUtil.clearCache(LoanImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the loan.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Loan loan) {
		EntityCacheUtil.removeResult(LoanModelImpl.ENTITY_CACHE_ENABLED,
			LoanImpl.class, loan.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Loan> loans) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Loan loan : loans) {
			EntityCacheUtil.removeResult(LoanModelImpl.ENTITY_CACHE_ENABLED,
				LoanImpl.class, loan.getPrimaryKey());
		}
	}

	/**
	 * Creates a new loan with the primary key. Does not add the loan to the database.
	 *
	 * @param loan_Id the primary key for the new loan
	 * @return the new loan
	 */
	public Loan create(long loan_Id) {
		Loan loan = new LoanImpl();

		loan.setNew(true);
		loan.setPrimaryKey(loan_Id);

		return loan;
	}

	/**
	 * Removes the loan with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param loan_Id the primary key of the loan
	 * @return the loan that was removed
	 * @throws org.GoodReturn.NoSuchLoanException if a loan with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Loan remove(long loan_Id)
		throws NoSuchLoanException, SystemException {
		return remove(Long.valueOf(loan_Id));
	}

	/**
	 * Removes the loan with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the loan
	 * @return the loan that was removed
	 * @throws org.GoodReturn.NoSuchLoanException if a loan with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Loan remove(Serializable primaryKey)
		throws NoSuchLoanException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Loan loan = (Loan)session.get(LoanImpl.class, primaryKey);

			if (loan == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchLoanException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(loan);
		}
		catch (NoSuchLoanException nsee) {
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
	protected Loan removeImpl(Loan loan) throws SystemException {
		loan = toUnwrappedModel(loan);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, loan);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(loan);

		return loan;
	}

	@Override
	public Loan updateImpl(org.GoodReturn.model.Loan loan, boolean merge)
		throws SystemException {
		loan = toUnwrappedModel(loan);

		boolean isNew = loan.isNew();

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, loan, merge);

			loan.setNew(false);
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

		EntityCacheUtil.putResult(LoanModelImpl.ENTITY_CACHE_ENABLED,
			LoanImpl.class, loan.getPrimaryKey(), loan);

		return loan;
	}

	protected Loan toUnwrappedModel(Loan loan) {
		if (loan instanceof LoanImpl) {
			return loan;
		}

		LoanImpl loanImpl = new LoanImpl();

		loanImpl.setNew(loan.isNew());
		loanImpl.setPrimaryKey(loan.getPrimaryKey());

		loanImpl.setLoan_Id(loan.getLoan_Id());
		loanImpl.setIs_Partially_Funded(loan.isIs_Partially_Funded());
		loanImpl.setAmount_Requested(loan.getAmount_Requested());
		loanImpl.setAmount_Fulfilled(loan.getAmount_Fulfilled());
		loanImpl.setExpiry_Date(loan.getExpiry_Date());
		loanImpl.setDate_Requisitioned(loan.getDate_Requisitioned());
		loanImpl.setDate_Of_Fulfillment(loan.getDate_Of_Fulfillment());
		loanImpl.setStart_Date(loan.getStart_Date());
		loanImpl.setEnd_Date(loan.getEnd_Date());
		loanImpl.setCompany_Id(loan.getCompany_Id());
		loanImpl.setGroup_Id(loan.getGroup_Id());
		loanImpl.setAmount_Monthly(loan.getAmount_Monthly());
		loanImpl.setAccount_Information(loan.getAccount_Information());
		loanImpl.setDay_Of_Withdrawal(loan.getDay_Of_Withdrawal());
		loanImpl.setFinal_Payment_Date(loan.getFinal_Payment_Date());
		loanImpl.setLoan_Reason(loan.getLoan_Reason());
		loanImpl.setLoan_Type(loan.getLoan_Type());
		loanImpl.setLoan_Time(loan.getLoan_Time());
		loanImpl.setFunding_Preferences(loan.getFunding_Preferences());
		loanImpl.setMaturity(loan.getMaturity());
		loanImpl.setRepayments(loan.getRepayments());
		loanImpl.setStatus(loan.getStatus());
		loanImpl.setPayment_Type(loan.getPayment_Type());
		loanImpl.setPayment_Receipt(loan.getPayment_Receipt());

		return loanImpl;
	}

	/**
	 * Returns the loan with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the loan
	 * @return the loan
	 * @throws com.liferay.portal.NoSuchModelException if a loan with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Loan findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the loan with the primary key or throws a {@link org.GoodReturn.NoSuchLoanException} if it could not be found.
	 *
	 * @param loan_Id the primary key of the loan
	 * @return the loan
	 * @throws org.GoodReturn.NoSuchLoanException if a loan with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Loan findByPrimaryKey(long loan_Id)
		throws NoSuchLoanException, SystemException {
		Loan loan = fetchByPrimaryKey(loan_Id);

		if (loan == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + loan_Id);
			}

			throw new NoSuchLoanException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				loan_Id);
		}

		return loan;
	}

	/**
	 * Returns the loan with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the loan
	 * @return the loan, or <code>null</code> if a loan with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Loan fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the loan with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param loan_Id the primary key of the loan
	 * @return the loan, or <code>null</code> if a loan with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Loan fetchByPrimaryKey(long loan_Id) throws SystemException {
		Loan loan = (Loan)EntityCacheUtil.getResult(LoanModelImpl.ENTITY_CACHE_ENABLED,
				LoanImpl.class, loan_Id);

		if (loan == _nullLoan) {
			return null;
		}

		if (loan == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				loan = (Loan)session.get(LoanImpl.class, Long.valueOf(loan_Id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (loan != null) {
					cacheResult(loan);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(LoanModelImpl.ENTITY_CACHE_ENABLED,
						LoanImpl.class, loan_Id, _nullLoan);
				}

				closeSession(session);
			}
		}

		return loan;
	}

	/**
	 * Returns all the loans.
	 *
	 * @return the loans
	 * @throws SystemException if a system exception occurred
	 */
	public List<Loan> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the loans.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of loans
	 * @param end the upper bound of the range of loans (not inclusive)
	 * @return the range of loans
	 * @throws SystemException if a system exception occurred
	 */
	public List<Loan> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the loans.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of loans
	 * @param end the upper bound of the range of loans (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of loans
	 * @throws SystemException if a system exception occurred
	 */
	public List<Loan> findAll(int start, int end,
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

		List<Loan> list = (List<Loan>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_LOAN);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_LOAN.concat(LoanModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<Loan>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);
				}
				else {
					list = (List<Loan>)QueryUtil.list(q, getDialect(), start,
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
	 * Removes all the loans from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (Loan loan : findAll()) {
			remove(loan);
		}
	}

	/**
	 * Returns the number of loans.
	 *
	 * @return the number of loans
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_LOAN);

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
	 * Initializes the loan persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.GoodReturn.model.Loan")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Loan>> listenersList = new ArrayList<ModelListener<Loan>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Loan>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(LoanImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@BeanReference(type = BorrowerPersistence.class)
	protected BorrowerPersistence borrowerPersistence;
	@BeanReference(type = Gift_CertificatePersistence.class)
	protected Gift_CertificatePersistence gift_CertificatePersistence;
	@BeanReference(type = LenderPersistence.class)
	protected LenderPersistence lenderPersistence;
	@BeanReference(type = LoanPersistence.class)
	protected LoanPersistence loanPersistence;
	@BeanReference(type = PersonPersistence.class)
	protected PersonPersistence personPersistence;
	@BeanReference(type = StoryPersistence.class)
	protected StoryPersistence storyPersistence;
	@BeanReference(type = Supplementary_TablePersistence.class)
	protected Supplementary_TablePersistence supplementary_TablePersistence;
	@BeanReference(type = TeamPersistence.class)
	protected TeamPersistence teamPersistence;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private static final String _SQL_SELECT_LOAN = "SELECT loan FROM Loan loan";
	private static final String _SQL_COUNT_LOAN = "SELECT COUNT(loan) FROM Loan loan";
	private static final String _ORDER_BY_ENTITY_ALIAS = "loan.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Loan exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(LoanPersistenceImpl.class);
	private static Loan _nullLoan = new LoanImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Loan> toCacheModel() {
				return _nullLoanCacheModel;
			}
		};

	private static CacheModel<Loan> _nullLoanCacheModel = new CacheModel<Loan>() {
			public Loan toEntityModel() {
				return _nullLoan;
			}
		};
}