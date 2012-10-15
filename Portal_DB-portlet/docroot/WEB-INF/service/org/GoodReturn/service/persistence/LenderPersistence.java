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

import org.goodreturn.model.Lender;

/**
 * The persistence interface for the lender service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author gilaa004
 * @see LenderPersistenceImpl
 * @see LenderUtil
 * @generated
 */
public interface LenderPersistence extends BasePersistence<Lender> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link LenderUtil} to access the lender persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the lender in the entity cache if it is enabled.
	*
	* @param lender the lender
	*/
	public void cacheResult(org.goodreturn.model.Lender lender);

	/**
	* Caches the lenders in the entity cache if it is enabled.
	*
	* @param lenders the lenders
	*/
	public void cacheResult(java.util.List<org.goodreturn.model.Lender> lenders);

	/**
	* Creates a new lender with the primary key. Does not add the lender to the database.
	*
	* @param lender_Id the primary key for the new lender
	* @return the new lender
	*/
	public org.goodreturn.model.Lender create(long lender_Id);

	/**
	* Removes the lender with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param lender_Id the primary key of the lender
	* @return the lender that was removed
	* @throws org.goodreturn.NoSuchLenderException if a lender with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.goodreturn.model.Lender remove(long lender_Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.goodreturn.NoSuchLenderException;

	public org.goodreturn.model.Lender updateImpl(
		org.goodreturn.model.Lender lender, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the lender with the primary key or throws a {@link org.goodreturn.NoSuchLenderException} if it could not be found.
	*
	* @param lender_Id the primary key of the lender
	* @return the lender
	* @throws org.goodreturn.NoSuchLenderException if a lender with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.goodreturn.model.Lender findByPrimaryKey(long lender_Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.goodreturn.NoSuchLenderException;

	/**
	* Returns the lender with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param lender_Id the primary key of the lender
	* @return the lender, or <code>null</code> if a lender with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.goodreturn.model.Lender fetchByPrimaryKey(long lender_Id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the lenders.
	*
	* @return the lenders
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.goodreturn.model.Lender> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.goodreturn.model.Lender> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.goodreturn.model.Lender> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the lenders from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of lenders.
	*
	* @return the number of lenders
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the persons associated with the lender.
	*
	* @param pk the primary key of the lender
	* @return the persons associated with the lender
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.goodreturn.model.Person> getPersons(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.goodreturn.model.Person> getPersons(long pk,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.goodreturn.model.Person> getPersons(long pk,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of persons associated with the lender.
	*
	* @param pk the primary key of the lender
	* @return the number of persons associated with the lender
	* @throws SystemException if a system exception occurred
	*/
	public int getPersonsSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the person is associated with the lender.
	*
	* @param pk the primary key of the lender
	* @param personPK the primary key of the person
	* @return <code>true</code> if the person is associated with the lender; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containsPerson(long pk, long personPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the lender has any persons associated with it.
	*
	* @param pk the primary key of the lender to check for associations with persons
	* @return <code>true</code> if the lender has any persons associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containsPersons(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;
}