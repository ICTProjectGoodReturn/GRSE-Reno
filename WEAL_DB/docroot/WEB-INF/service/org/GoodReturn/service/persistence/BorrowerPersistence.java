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

import org.GoodReturn.model.Borrower;

/**
 * The persistence interface for the borrower service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author gilaa004
 * @see BorrowerPersistenceImpl
 * @see BorrowerUtil
 * @generated
 */
public interface BorrowerPersistence extends BasePersistence<Borrower> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link BorrowerUtil} to access the borrower persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the borrower in the entity cache if it is enabled.
	*
	* @param borrower the borrower
	*/
	public void cacheResult(org.GoodReturn.model.Borrower borrower);

	/**
	* Caches the borrowers in the entity cache if it is enabled.
	*
	* @param borrowers the borrowers
	*/
	public void cacheResult(
		java.util.List<org.GoodReturn.model.Borrower> borrowers);

	/**
	* Creates a new borrower with the primary key. Does not add the borrower to the database.
	*
	* @param abacus_Borrower_Id the primary key for the new borrower
	* @return the new borrower
	*/
	public org.GoodReturn.model.Borrower create(long abacus_Borrower_Id);

	/**
	* Removes the borrower with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param abacus_Borrower_Id the primary key of the borrower
	* @return the borrower that was removed
	* @throws org.GoodReturn.NoSuchBorrowerException if a borrower with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.GoodReturn.model.Borrower remove(long abacus_Borrower_Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.GoodReturn.NoSuchBorrowerException;

	public org.GoodReturn.model.Borrower updateImpl(
		org.GoodReturn.model.Borrower borrower, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the borrower with the primary key or throws a {@link org.GoodReturn.NoSuchBorrowerException} if it could not be found.
	*
	* @param abacus_Borrower_Id the primary key of the borrower
	* @return the borrower
	* @throws org.GoodReturn.NoSuchBorrowerException if a borrower with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.GoodReturn.model.Borrower findByPrimaryKey(
		long abacus_Borrower_Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.GoodReturn.NoSuchBorrowerException;

	/**
	* Returns the borrower with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param abacus_Borrower_Id the primary key of the borrower
	* @return the borrower, or <code>null</code> if a borrower with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.GoodReturn.model.Borrower fetchByPrimaryKey(
		long abacus_Borrower_Id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the borrowers.
	*
	* @return the borrowers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.GoodReturn.model.Borrower> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.GoodReturn.model.Borrower> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.GoodReturn.model.Borrower> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the borrowers from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of borrowers.
	*
	* @return the number of borrowers
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}