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

import com.liferay.portal.service.persistence.BasePersistence;

import org.GoodReturn.model.Loan;

/**
 * The persistence interface for the loan service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author gilaa004
 * @see LoanPersistenceImpl
 * @see LoanUtil
 * @generated
 */
public interface LoanPersistence extends BasePersistence<Loan> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link LoanUtil} to access the loan persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the loan in the entity cache if it is enabled.
	*
	* @param loan the loan
	*/
	public void cacheResult(org.GoodReturn.model.Loan loan);

	/**
	* Caches the loans in the entity cache if it is enabled.
	*
	* @param loans the loans
	*/
	public void cacheResult(java.util.List<org.GoodReturn.model.Loan> loans);

	/**
	* Creates a new loan with the primary key. Does not add the loan to the database.
	*
	* @param loan_Id the primary key for the new loan
	* @return the new loan
	*/
	public org.GoodReturn.model.Loan create(long loan_Id);

	/**
	* Removes the loan with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param loan_Id the primary key of the loan
	* @return the loan that was removed
	* @throws org.GoodReturn.NoSuchLoanException if a loan with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.GoodReturn.model.Loan remove(long loan_Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.GoodReturn.NoSuchLoanException;

	public org.GoodReturn.model.Loan updateImpl(
		org.GoodReturn.model.Loan loan, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the loan with the primary key or throws a {@link org.GoodReturn.NoSuchLoanException} if it could not be found.
	*
	* @param loan_Id the primary key of the loan
	* @return the loan
	* @throws org.GoodReturn.NoSuchLoanException if a loan with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.GoodReturn.model.Loan findByPrimaryKey(long loan_Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.GoodReturn.NoSuchLoanException;

	/**
	* Returns the loan with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param loan_Id the primary key of the loan
	* @return the loan, or <code>null</code> if a loan with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.GoodReturn.model.Loan fetchByPrimaryKey(long loan_Id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the loans.
	*
	* @return the loans
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.GoodReturn.model.Loan> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.GoodReturn.model.Loan> findAll(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.GoodReturn.model.Loan> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the loans from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of loans.
	*
	* @return the number of loans
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}