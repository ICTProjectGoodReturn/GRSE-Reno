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

import org.GoodReturn.model.Person;

/**
 * The persistence interface for the person service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author gilaa004
 * @see PersonPersistenceImpl
 * @see PersonUtil
 * @generated
 */
public interface PersonPersistence extends BasePersistence<Person> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PersonUtil} to access the person persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the person in the entity cache if it is enabled.
	*
	* @param person the person
	*/
	public void cacheResult(org.GoodReturn.model.Person person);

	/**
	* Caches the persons in the entity cache if it is enabled.
	*
	* @param persons the persons
	*/
	public void cacheResult(java.util.List<org.GoodReturn.model.Person> persons);

	/**
	* Creates a new person with the primary key. Does not add the person to the database.
	*
	* @param abacus_Person_Id the primary key for the new person
	* @return the new person
	*/
	public org.GoodReturn.model.Person create(long abacus_Person_Id);

	/**
	* Removes the person with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param abacus_Person_Id the primary key of the person
	* @return the person that was removed
	* @throws org.GoodReturn.NoSuchPersonException if a person with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.GoodReturn.model.Person remove(long abacus_Person_Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.GoodReturn.NoSuchPersonException;

	public org.GoodReturn.model.Person updateImpl(
		org.GoodReturn.model.Person person, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the person with the primary key or throws a {@link org.GoodReturn.NoSuchPersonException} if it could not be found.
	*
	* @param abacus_Person_Id the primary key of the person
	* @return the person
	* @throws org.GoodReturn.NoSuchPersonException if a person with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.GoodReturn.model.Person findByPrimaryKey(long abacus_Person_Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.GoodReturn.NoSuchPersonException;

	/**
	* Returns the person with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param abacus_Person_Id the primary key of the person
	* @return the person, or <code>null</code> if a person with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.GoodReturn.model.Person fetchByPrimaryKey(long abacus_Person_Id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the persons.
	*
	* @return the persons
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.GoodReturn.model.Person> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the persons.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of persons
	* @param end the upper bound of the range of persons (not inclusive)
	* @return the range of persons
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.GoodReturn.model.Person> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the persons.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of persons
	* @param end the upper bound of the range of persons (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of persons
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.GoodReturn.model.Person> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the persons from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of persons.
	*
	* @return the number of persons
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}