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

package com.test.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.test.model.Lender;

import java.util.List;

/**
 * The persistence utility for the lender service. This utility wraps {@link LenderPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author gilaa004
 * @see LenderPersistence
 * @see LenderPersistenceImpl
 * @generated
 */
public class LenderUtil {
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
	public static void clearCache(Lender lender) {
		getPersistence().clearCache(lender);
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
	public static List<Lender> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Lender> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Lender> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static Lender update(Lender lender, boolean merge)
		throws SystemException {
		return getPersistence().update(lender, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static Lender update(Lender lender, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(lender, merge, serviceContext);
	}

	/**
	* Caches the lender in the entity cache if it is enabled.
	*
	* @param lender the lender
	*/
	public static void cacheResult(com.test.model.Lender lender) {
		getPersistence().cacheResult(lender);
	}

	/**
	* Caches the lenders in the entity cache if it is enabled.
	*
	* @param lenders the lenders
	*/
	public static void cacheResult(
		java.util.List<com.test.model.Lender> lenders) {
		getPersistence().cacheResult(lenders);
	}

	/**
	* Creates a new lender with the primary key. Does not add the lender to the database.
	*
	* @param lender_Id the primary key for the new lender
	* @return the new lender
	*/
	public static com.test.model.Lender create(long lender_Id) {
		return getPersistence().create(lender_Id);
	}

	/**
	* Removes the lender with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param lender_Id the primary key of the lender
	* @return the lender that was removed
	* @throws com.test.NoSuchLenderException if a lender with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.model.Lender remove(long lender_Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.NoSuchLenderException {
		return getPersistence().remove(lender_Id);
	}

	public static com.test.model.Lender updateImpl(
		com.test.model.Lender lender, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(lender, merge);
	}

	/**
	* Returns the lender with the primary key or throws a {@link com.test.NoSuchLenderException} if it could not be found.
	*
	* @param lender_Id the primary key of the lender
	* @return the lender
	* @throws com.test.NoSuchLenderException if a lender with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.model.Lender findByPrimaryKey(long lender_Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.NoSuchLenderException {
		return getPersistence().findByPrimaryKey(lender_Id);
	}

	/**
	* Returns the lender with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param lender_Id the primary key of the lender
	* @return the lender, or <code>null</code> if a lender with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.model.Lender fetchByPrimaryKey(long lender_Id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(lender_Id);
	}

	/**
	* Returns all the lenders.
	*
	* @return the lenders
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.test.model.Lender> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<com.test.model.Lender> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<com.test.model.Lender> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the lenders from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of lenders.
	*
	* @return the number of lenders
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	/**
	* Returns all the persons associated with the lender.
	*
	* @param pk the primary key of the lender
	* @return the persons associated with the lender
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.test.model.Person> getPersons(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getPersons(pk);
	}

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
	public static java.util.List<com.test.model.Person> getPersons(long pk,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getPersons(pk, start, end);
	}

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
	public static java.util.List<com.test.model.Person> getPersons(long pk,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getPersons(pk, start, end, orderByComparator);
	}

	/**
	* Returns the number of persons associated with the lender.
	*
	* @param pk the primary key of the lender
	* @return the number of persons associated with the lender
	* @throws SystemException if a system exception occurred
	*/
	public static int getPersonsSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getPersonsSize(pk);
	}

	/**
	* Returns <code>true</code> if the person is associated with the lender.
	*
	* @param pk the primary key of the lender
	* @param personPK the primary key of the person
	* @return <code>true</code> if the person is associated with the lender; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsPerson(long pk, long personPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsPerson(pk, personPK);
	}

	/**
	* Returns <code>true</code> if the lender has any persons associated with it.
	*
	* @param pk the primary key of the lender to check for associations with persons
	* @return <code>true</code> if the lender has any persons associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsPersons(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsPersons(pk);
	}

	public static LenderPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (LenderPersistence)PortletBeanLocatorUtil.locate(com.test.service.ClpSerializer.getServletContextName(),
					LenderPersistence.class.getName());

			ReferenceRegistry.registerReference(LenderUtil.class, "_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(LenderPersistence persistence) {
	}

	private static LenderPersistence _persistence;
}