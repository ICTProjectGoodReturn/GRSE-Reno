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

import com.liferay.portal.service.persistence.BasePersistence;

import org.goodreturn.model.BorrowerLoan;

/**
 * The persistence interface for the borrower loan service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author gilaa004
 * @see BorrowerLoanPersistenceImpl
 * @see BorrowerLoanUtil
 * @generated
 */
public interface BorrowerLoanPersistence extends BasePersistence<BorrowerLoan> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link BorrowerLoanUtil} to access the borrower loan persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the borrower loan in the entity cache if it is enabled.
	*
	* @param borrowerLoan the borrower loan
	*/
	public void cacheResult(org.goodreturn.model.BorrowerLoan borrowerLoan);

	/**
	* Caches the borrower loans in the entity cache if it is enabled.
	*
	* @param borrowerLoans the borrower loans
	*/
	public void cacheResult(
		java.util.List<org.goodreturn.model.BorrowerLoan> borrowerLoans);

	/**
	* Creates a new borrower loan with the primary key. Does not add the borrower loan to the database.
	*
	* @param abacus_Borrower_Loan_Id the primary key for the new borrower loan
	* @return the new borrower loan
	*/
	public org.goodreturn.model.BorrowerLoan create(
		long abacus_Borrower_Loan_Id);

	/**
	* Removes the borrower loan with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param abacus_Borrower_Loan_Id the primary key of the borrower loan
	* @return the borrower loan that was removed
	* @throws org.goodreturn.NoSuchBorrowerLoanException if a borrower loan with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.goodreturn.model.BorrowerLoan remove(
		long abacus_Borrower_Loan_Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.goodreturn.NoSuchBorrowerLoanException;

	public org.goodreturn.model.BorrowerLoan updateImpl(
		org.goodreturn.model.BorrowerLoan borrowerLoan, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the borrower loan with the primary key or throws a {@link org.goodreturn.NoSuchBorrowerLoanException} if it could not be found.
	*
	* @param abacus_Borrower_Loan_Id the primary key of the borrower loan
	* @return the borrower loan
	* @throws org.goodreturn.NoSuchBorrowerLoanException if a borrower loan with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.goodreturn.model.BorrowerLoan findByPrimaryKey(
		long abacus_Borrower_Loan_Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.goodreturn.NoSuchBorrowerLoanException;

	/**
	* Returns the borrower loan with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param abacus_Borrower_Loan_Id the primary key of the borrower loan
	* @return the borrower loan, or <code>null</code> if a borrower loan with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.goodreturn.model.BorrowerLoan fetchByPrimaryKey(
		long abacus_Borrower_Loan_Id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the borrower loans where borrower_Id = &#63;.
	*
	* @param borrower_Id the borrower_ ID
	* @return the matching borrower loans
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.goodreturn.model.BorrowerLoan> findByb_Id(
		long borrower_Id)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.goodreturn.model.BorrowerLoan> findByb_Id(
		long borrower_Id, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.goodreturn.model.BorrowerLoan> findByb_Id(
		long borrower_Id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first borrower loan in the ordered set where borrower_Id = &#63;.
	*
	* @param borrower_Id the borrower_ ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching borrower loan
	* @throws org.goodreturn.NoSuchBorrowerLoanException if a matching borrower loan could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.goodreturn.model.BorrowerLoan findByb_Id_First(
		long borrower_Id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.goodreturn.NoSuchBorrowerLoanException;

	/**
	* Returns the first borrower loan in the ordered set where borrower_Id = &#63;.
	*
	* @param borrower_Id the borrower_ ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching borrower loan, or <code>null</code> if a matching borrower loan could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.goodreturn.model.BorrowerLoan fetchByb_Id_First(
		long borrower_Id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last borrower loan in the ordered set where borrower_Id = &#63;.
	*
	* @param borrower_Id the borrower_ ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching borrower loan
	* @throws org.goodreturn.NoSuchBorrowerLoanException if a matching borrower loan could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.goodreturn.model.BorrowerLoan findByb_Id_Last(long borrower_Id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.goodreturn.NoSuchBorrowerLoanException;

	/**
	* Returns the last borrower loan in the ordered set where borrower_Id = &#63;.
	*
	* @param borrower_Id the borrower_ ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching borrower loan, or <code>null</code> if a matching borrower loan could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.goodreturn.model.BorrowerLoan fetchByb_Id_Last(
		long borrower_Id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public org.goodreturn.model.BorrowerLoan[] findByb_Id_PrevAndNext(
		long abacus_Borrower_Loan_Id, long borrower_Id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.goodreturn.NoSuchBorrowerLoanException;

	/**
	* Returns all the borrower loans.
	*
	* @return the borrower loans
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.goodreturn.model.BorrowerLoan> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.goodreturn.model.BorrowerLoan> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.goodreturn.model.BorrowerLoan> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the borrower loans where borrower_Id = &#63; from the database.
	*
	* @param borrower_Id the borrower_ ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByb_Id(long borrower_Id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the borrower loans from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of borrower loans where borrower_Id = &#63;.
	*
	* @param borrower_Id the borrower_ ID
	* @return the number of matching borrower loans
	* @throws SystemException if a system exception occurred
	*/
	public int countByb_Id(long borrower_Id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of borrower loans.
	*
	* @return the number of borrower loans
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the stories associated with the borrower loan.
	*
	* @param pk the primary key of the borrower loan
	* @return the stories associated with the borrower loan
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.goodreturn.model.Story> getStories(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.goodreturn.model.Story> getStories(long pk,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.goodreturn.model.Story> getStories(long pk,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of stories associated with the borrower loan.
	*
	* @param pk the primary key of the borrower loan
	* @return the number of stories associated with the borrower loan
	* @throws SystemException if a system exception occurred
	*/
	public int getStoriesSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the story is associated with the borrower loan.
	*
	* @param pk the primary key of the borrower loan
	* @param storyPK the primary key of the story
	* @return <code>true</code> if the story is associated with the borrower loan; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containsStory(long pk, long storyPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the borrower loan has any stories associated with it.
	*
	* @param pk the primary key of the borrower loan to check for associations with stories
	* @return <code>true</code> if the borrower loan has any stories associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containsStories(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;
}