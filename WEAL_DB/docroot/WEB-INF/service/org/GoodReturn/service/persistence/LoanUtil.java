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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import org.GoodReturn.model.Loan;

import java.util.List;

/**
 * The persistence utility for the loan service. This utility wraps {@link LoanPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author gilaa004
 * @see LoanPersistence
 * @see LoanPersistenceImpl
 * @generated
 */
public class LoanUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(Loan loan) {
		getPersistence().clearCache(loan);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Loan> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Loan> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Loan> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static Loan update(Loan loan, boolean merge)
		throws SystemException {
		return getPersistence().update(loan, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static Loan update(Loan loan, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(loan, merge, serviceContext);
	}

	/**
	* Caches the loan in the entity cache if it is enabled.
	*
	* @param loan the loan
	*/
	public static void cacheResult(org.GoodReturn.model.Loan loan) {
		getPersistence().cacheResult(loan);
	}

	/**
	* Caches the loans in the entity cache if it is enabled.
	*
	* @param loans the loans
	*/
	public static void cacheResult(
		java.util.List<org.GoodReturn.model.Loan> loans) {
		getPersistence().cacheResult(loans);
	}

	/**
	* Creates a new loan with the primary key. Does not add the loan to the database.
	*
	* @param loan_Id the primary key for the new loan
	* @return the new loan
	*/
	public static org.GoodReturn.model.Loan create(long loan_Id) {
		return getPersistence().create(loan_Id);
	}

	/**
	* Removes the loan with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param loan_Id the primary key of the loan
	* @return the loan that was removed
	* @throws org.GoodReturn.NoSuchLoanException if a loan with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.GoodReturn.model.Loan remove(long loan_Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.GoodReturn.NoSuchLoanException {
		return getPersistence().remove(loan_Id);
	}

	public static org.GoodReturn.model.Loan updateImpl(
		org.GoodReturn.model.Loan loan, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(loan, merge);
	}

	/**
	* Returns the loan with the primary key or throws a {@link org.GoodReturn.NoSuchLoanException} if it could not be found.
	*
	* @param loan_Id the primary key of the loan
	* @return the loan
	* @throws org.GoodReturn.NoSuchLoanException if a loan with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.GoodReturn.model.Loan findByPrimaryKey(long loan_Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.GoodReturn.NoSuchLoanException {
		return getPersistence().findByPrimaryKey(loan_Id);
	}

	/**
	* Returns the loan with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param loan_Id the primary key of the loan
	* @return the loan, or <code>null</code> if a loan with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.GoodReturn.model.Loan fetchByPrimaryKey(long loan_Id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(loan_Id);
	}

	/**
	* Returns all the loans.
	*
	* @return the loans
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.GoodReturn.model.Loan> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<org.GoodReturn.model.Loan> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
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
	public static java.util.List<org.GoodReturn.model.Loan> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the loans from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of loans.
	*
	* @return the number of loans
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static LoanPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (LoanPersistence)PortletBeanLocatorUtil.locate(org.GoodReturn.service.ClpSerializer.getServletContextName(),
					LoanPersistence.class.getName());

			ReferenceRegistry.registerReference(LoanUtil.class, "_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(LoanPersistence persistence) {
	}

	private static LoanPersistence _persistence;
}