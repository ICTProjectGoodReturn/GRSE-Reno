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

import org.goodreturn.model.TeamLenderLoan;

/**
 * The persistence interface for the team lender loan service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author gilaa004
 * @see TeamLenderLoanPersistenceImpl
 * @see TeamLenderLoanUtil
 * @generated
 */
public interface TeamLenderLoanPersistence extends BasePersistence<TeamLenderLoan> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TeamLenderLoanUtil} to access the team lender loan persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the team lender loan in the entity cache if it is enabled.
	*
	* @param teamLenderLoan the team lender loan
	*/
	public void cacheResult(org.goodreturn.model.TeamLenderLoan teamLenderLoan);

	/**
	* Caches the team lender loans in the entity cache if it is enabled.
	*
	* @param teamLenderLoans the team lender loans
	*/
	public void cacheResult(
		java.util.List<org.goodreturn.model.TeamLenderLoan> teamLenderLoans);

	/**
	* Creates a new team lender loan with the primary key. Does not add the team lender loan to the database.
	*
	* @param account_Id the primary key for the new team lender loan
	* @return the new team lender loan
	*/
	public org.goodreturn.model.TeamLenderLoan create(long account_Id);

	/**
	* Removes the team lender loan with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param account_Id the primary key of the team lender loan
	* @return the team lender loan that was removed
	* @throws org.goodreturn.NoSuchTeamLenderLoanException if a team lender loan with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.goodreturn.model.TeamLenderLoan remove(long account_Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.goodreturn.NoSuchTeamLenderLoanException;

	public org.goodreturn.model.TeamLenderLoan updateImpl(
		org.goodreturn.model.TeamLenderLoan teamLenderLoan, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the team lender loan with the primary key or throws a {@link org.goodreturn.NoSuchTeamLenderLoanException} if it could not be found.
	*
	* @param account_Id the primary key of the team lender loan
	* @return the team lender loan
	* @throws org.goodreturn.NoSuchTeamLenderLoanException if a team lender loan with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.goodreturn.model.TeamLenderLoan findByPrimaryKey(long account_Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.goodreturn.NoSuchTeamLenderLoanException;

	/**
	* Returns the team lender loan with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param account_Id the primary key of the team lender loan
	* @return the team lender loan, or <code>null</code> if a team lender loan with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.goodreturn.model.TeamLenderLoan fetchByPrimaryKey(
		long account_Id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the team lender loans.
	*
	* @return the team lender loans
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.goodreturn.model.TeamLenderLoan> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the team lender loans.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of team lender loans
	* @param end the upper bound of the range of team lender loans (not inclusive)
	* @return the range of team lender loans
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.goodreturn.model.TeamLenderLoan> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the team lender loans.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of team lender loans
	* @param end the upper bound of the range of team lender loans (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of team lender loans
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.goodreturn.model.TeamLenderLoan> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the team lender loans from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of team lender loans.
	*
	* @return the number of team lender loans
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}