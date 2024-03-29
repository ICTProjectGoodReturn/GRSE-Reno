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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import org.goodreturn.model.Person;

import java.util.List;

/**
 * The persistence utility for the person service. This utility wraps {@link PersonPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author gilaa004
 * @see PersonPersistence
 * @see PersonPersistenceImpl
 * @generated
 */
public class PersonUtil {
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
	public static void clearCache(Person person) {
		getPersistence().clearCache(person);
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
	public static List<Person> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Person> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Person> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static Person update(Person person, boolean merge)
		throws SystemException {
		return getPersistence().update(person, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static Person update(Person person, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(person, merge, serviceContext);
	}

	/**
	* Caches the person in the entity cache if it is enabled.
	*
	* @param person the person
	*/
	public static void cacheResult(org.goodreturn.model.Person person) {
		getPersistence().cacheResult(person);
	}

	/**
	* Caches the persons in the entity cache if it is enabled.
	*
	* @param persons the persons
	*/
	public static void cacheResult(
		java.util.List<org.goodreturn.model.Person> persons) {
		getPersistence().cacheResult(persons);
	}

	/**
	* Creates a new person with the primary key. Does not add the person to the database.
	*
	* @param abacus_Person_Id the primary key for the new person
	* @return the new person
	*/
	public static org.goodreturn.model.Person create(long abacus_Person_Id) {
		return getPersistence().create(abacus_Person_Id);
	}

	/**
	* Removes the person with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param abacus_Person_Id the primary key of the person
	* @return the person that was removed
	* @throws org.goodreturn.NoSuchPersonException if a person with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.goodreturn.model.Person remove(long abacus_Person_Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.goodreturn.NoSuchPersonException {
		return getPersistence().remove(abacus_Person_Id);
	}

	public static org.goodreturn.model.Person updateImpl(
		org.goodreturn.model.Person person, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(person, merge);
	}

	/**
	* Returns the person with the primary key or throws a {@link org.goodreturn.NoSuchPersonException} if it could not be found.
	*
	* @param abacus_Person_Id the primary key of the person
	* @return the person
	* @throws org.goodreturn.NoSuchPersonException if a person with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.goodreturn.model.Person findByPrimaryKey(
		long abacus_Person_Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.goodreturn.NoSuchPersonException {
		return getPersistence().findByPrimaryKey(abacus_Person_Id);
	}

	/**
	* Returns the person with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param abacus_Person_Id the primary key of the person
	* @return the person, or <code>null</code> if a person with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.goodreturn.model.Person fetchByPrimaryKey(
		long abacus_Person_Id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(abacus_Person_Id);
	}

	/**
	* Returns all the persons.
	*
	* @return the persons
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.goodreturn.model.Person> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<org.goodreturn.model.Person> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<org.goodreturn.model.Person> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the persons from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of persons.
	*
	* @return the number of persons
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	/**
	* Returns all the borrowers associated with the person.
	*
	* @param pk the primary key of the person
	* @return the borrowers associated with the person
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.goodreturn.model.Borrower> getBorrowers(
		long pk) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getBorrowers(pk);
	}

	/**
	* Returns a range of all the borrowers associated with the person.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the person
	* @param start the lower bound of the range of persons
	* @param end the upper bound of the range of persons (not inclusive)
	* @return the range of borrowers associated with the person
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.goodreturn.model.Borrower> getBorrowers(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getBorrowers(pk, start, end);
	}

	/**
	* Returns an ordered range of all the borrowers associated with the person.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the person
	* @param start the lower bound of the range of persons
	* @param end the upper bound of the range of persons (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of borrowers associated with the person
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.goodreturn.model.Borrower> getBorrowers(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getBorrowers(pk, start, end, orderByComparator);
	}

	/**
	* Returns the number of borrowers associated with the person.
	*
	* @param pk the primary key of the person
	* @return the number of borrowers associated with the person
	* @throws SystemException if a system exception occurred
	*/
	public static int getBorrowersSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getBorrowersSize(pk);
	}

	/**
	* Returns <code>true</code> if the borrower is associated with the person.
	*
	* @param pk the primary key of the person
	* @param borrowerPK the primary key of the borrower
	* @return <code>true</code> if the borrower is associated with the person; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsBorrower(long pk, long borrowerPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsBorrower(pk, borrowerPK);
	}

	/**
	* Returns <code>true</code> if the person has any borrowers associated with it.
	*
	* @param pk the primary key of the person to check for associations with borrowers
	* @return <code>true</code> if the person has any borrowers associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsBorrowers(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsBorrowers(pk);
	}

	/**
	* Returns all the lenders associated with the person.
	*
	* @param pk the primary key of the person
	* @return the lenders associated with the person
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.goodreturn.model.Lender> getLenders(
		long pk) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getLenders(pk);
	}

	/**
	* Returns a range of all the lenders associated with the person.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the person
	* @param start the lower bound of the range of persons
	* @param end the upper bound of the range of persons (not inclusive)
	* @return the range of lenders associated with the person
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.goodreturn.model.Lender> getLenders(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getLenders(pk, start, end);
	}

	/**
	* Returns an ordered range of all the lenders associated with the person.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the person
	* @param start the lower bound of the range of persons
	* @param end the upper bound of the range of persons (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of lenders associated with the person
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.goodreturn.model.Lender> getLenders(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getLenders(pk, start, end, orderByComparator);
	}

	/**
	* Returns the number of lenders associated with the person.
	*
	* @param pk the primary key of the person
	* @return the number of lenders associated with the person
	* @throws SystemException if a system exception occurred
	*/
	public static int getLendersSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getLendersSize(pk);
	}

	/**
	* Returns <code>true</code> if the lender is associated with the person.
	*
	* @param pk the primary key of the person
	* @param lenderPK the primary key of the lender
	* @return <code>true</code> if the lender is associated with the person; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsLender(long pk, long lenderPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsLender(pk, lenderPK);
	}

	/**
	* Returns <code>true</code> if the person has any lenders associated with it.
	*
	* @param pk the primary key of the person to check for associations with lenders
	* @return <code>true</code> if the person has any lenders associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsLenders(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsLenders(pk);
	}

	public static PersonPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (PersonPersistence)PortletBeanLocatorUtil.locate(org.goodreturn.service.ClpSerializer.getServletContextName(),
					PersonPersistence.class.getName());

			ReferenceRegistry.registerReference(PersonUtil.class, "_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(PersonPersistence persistence) {
	}

	private static PersonPersistence _persistence;
}