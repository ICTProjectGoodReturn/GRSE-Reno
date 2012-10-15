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

import org.GoodReturn.model.Borrower;

import java.util.List;

/**
 * The persistence utility for the borrower service. This utility wraps {@link BorrowerPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author gilaa004
 * @see BorrowerPersistence
 * @see BorrowerPersistenceImpl
 * @generated
 */
public class BorrowerUtil {
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
	public static void clearCache(Borrower borrower) {
		getPersistence().clearCache(borrower);
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
	public static List<Borrower> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Borrower> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Borrower> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static Borrower update(Borrower borrower, boolean merge)
		throws SystemException {
		return getPersistence().update(borrower, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static Borrower update(Borrower borrower, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(borrower, merge, serviceContext);
	}

	/**
	* Caches the borrower in the entity cache if it is enabled.
	*
	* @param borrower the borrower
	*/
	public static void cacheResult(org.GoodReturn.model.Borrower borrower) {
		getPersistence().cacheResult(borrower);
	}

	/**
	* Caches the borrowers in the entity cache if it is enabled.
	*
	* @param borrowers the borrowers
	*/
	public static void cacheResult(
		java.util.List<org.GoodReturn.model.Borrower> borrowers) {
		getPersistence().cacheResult(borrowers);
	}

	/**
	* Creates a new borrower with the primary key. Does not add the borrower to the database.
	*
	* @param abacus_Borrower_Id the primary key for the new borrower
	* @return the new borrower
	*/
	public static org.GoodReturn.model.Borrower create(long abacus_Borrower_Id) {
		return getPersistence().create(abacus_Borrower_Id);
	}

	/**
	* Removes the borrower with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param abacus_Borrower_Id the primary key of the borrower
	* @return the borrower that was removed
	* @throws org.GoodReturn.NoSuchBorrowerException if a borrower with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.GoodReturn.model.Borrower remove(long abacus_Borrower_Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.GoodReturn.NoSuchBorrowerException {
		return getPersistence().remove(abacus_Borrower_Id);
	}

	public static org.GoodReturn.model.Borrower updateImpl(
		org.GoodReturn.model.Borrower borrower, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(borrower, merge);
	}

	/**
	* Returns the borrower with the primary key or throws a {@link org.GoodReturn.NoSuchBorrowerException} if it could not be found.
	*
	* @param abacus_Borrower_Id the primary key of the borrower
	* @return the borrower
	* @throws org.GoodReturn.NoSuchBorrowerException if a borrower with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.GoodReturn.model.Borrower findByPrimaryKey(
		long abacus_Borrower_Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.GoodReturn.NoSuchBorrowerException {
		return getPersistence().findByPrimaryKey(abacus_Borrower_Id);
	}

	/**
	* Returns the borrower with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param abacus_Borrower_Id the primary key of the borrower
	* @return the borrower, or <code>null</code> if a borrower with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.GoodReturn.model.Borrower fetchByPrimaryKey(
		long abacus_Borrower_Id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(abacus_Borrower_Id);
	}

	/**
	* Returns all the borrowers.
	*
	* @return the borrowers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.GoodReturn.model.Borrower> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<org.GoodReturn.model.Borrower> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<org.GoodReturn.model.Borrower> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the borrowers from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of borrowers.
	*
	* @return the number of borrowers
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	/**
	* Returns all the persons associated with the borrower.
	*
	* @param pk the primary key of the borrower
	* @return the persons associated with the borrower
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.GoodReturn.model.Person> getPersons(
		long pk) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getPersons(pk);
	}

	/**
	* Returns a range of all the persons associated with the borrower.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the borrower
	* @param start the lower bound of the range of borrowers
	* @param end the upper bound of the range of borrowers (not inclusive)
	* @return the range of persons associated with the borrower
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.GoodReturn.model.Person> getPersons(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getPersons(pk, start, end);
	}

	/**
	* Returns an ordered range of all the persons associated with the borrower.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the borrower
	* @param start the lower bound of the range of borrowers
	* @param end the upper bound of the range of borrowers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of persons associated with the borrower
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.GoodReturn.model.Person> getPersons(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getPersons(pk, start, end, orderByComparator);
	}

	/**
	* Returns the number of persons associated with the borrower.
	*
	* @param pk the primary key of the borrower
	* @return the number of persons associated with the borrower
	* @throws SystemException if a system exception occurred
	*/
	public static int getPersonsSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getPersonsSize(pk);
	}

	/**
	* Returns <code>true</code> if the person is associated with the borrower.
	*
	* @param pk the primary key of the borrower
	* @param personPK the primary key of the person
	* @return <code>true</code> if the person is associated with the borrower; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsPerson(long pk, long personPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsPerson(pk, personPK);
	}

	/**
	* Returns <code>true</code> if the borrower has any persons associated with it.
	*
	* @param pk the primary key of the borrower to check for associations with persons
	* @return <code>true</code> if the borrower has any persons associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsPersons(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsPersons(pk);
	}

	public static BorrowerPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (BorrowerPersistence)PortletBeanLocatorUtil.locate(org.GoodReturn.service.ClpSerializer.getServletContextName(),
					BorrowerPersistence.class.getName());

			ReferenceRegistry.registerReference(BorrowerUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(BorrowerPersistence persistence) {
	}

	private static BorrowerPersistence _persistence;
}