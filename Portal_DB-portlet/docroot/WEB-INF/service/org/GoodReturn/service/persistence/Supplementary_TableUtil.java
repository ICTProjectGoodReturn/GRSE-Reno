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

import org.GoodReturn.model.Supplementary_Table;

import java.util.List;

/**
 * The persistence utility for the supplementary_ table service. This utility wraps {@link Supplementary_TablePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author gilaa004
 * @see Supplementary_TablePersistence
 * @see Supplementary_TablePersistenceImpl
 * @generated
 */
public class Supplementary_TableUtil {
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
	public static void clearCache(Supplementary_Table supplementary_Table) {
		getPersistence().clearCache(supplementary_Table);
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
	public static List<Supplementary_Table> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Supplementary_Table> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Supplementary_Table> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static Supplementary_Table update(
		Supplementary_Table supplementary_Table, boolean merge)
		throws SystemException {
		return getPersistence().update(supplementary_Table, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static Supplementary_Table update(
		Supplementary_Table supplementary_Table, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence()
				   .update(supplementary_Table, merge, serviceContext);
	}

	/**
	* Caches the supplementary_ table in the entity cache if it is enabled.
	*
	* @param supplementary_Table the supplementary_ table
	*/
	public static void cacheResult(
		org.GoodReturn.model.Supplementary_Table supplementary_Table) {
		getPersistence().cacheResult(supplementary_Table);
	}

	/**
	* Caches the supplementary_ tables in the entity cache if it is enabled.
	*
	* @param supplementary_Tables the supplementary_ tables
	*/
	public static void cacheResult(
		java.util.List<org.GoodReturn.model.Supplementary_Table> supplementary_Tables) {
		getPersistence().cacheResult(supplementary_Tables);
	}

	/**
	* Creates a new supplementary_ table with the primary key. Does not add the supplementary_ table to the database.
	*
	* @param table_Id the primary key for the new supplementary_ table
	* @return the new supplementary_ table
	*/
	public static org.GoodReturn.model.Supplementary_Table create(long table_Id) {
		return getPersistence().create(table_Id);
	}

	/**
	* Removes the supplementary_ table with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param table_Id the primary key of the supplementary_ table
	* @return the supplementary_ table that was removed
	* @throws org.GoodReturn.NoSuchSupplementary_TableException if a supplementary_ table with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.GoodReturn.model.Supplementary_Table remove(long table_Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.GoodReturn.NoSuchSupplementary_TableException {
		return getPersistence().remove(table_Id);
	}

	public static org.GoodReturn.model.Supplementary_Table updateImpl(
		org.GoodReturn.model.Supplementary_Table supplementary_Table,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(supplementary_Table, merge);
	}

	/**
	* Returns the supplementary_ table with the primary key or throws a {@link org.GoodReturn.NoSuchSupplementary_TableException} if it could not be found.
	*
	* @param table_Id the primary key of the supplementary_ table
	* @return the supplementary_ table
	* @throws org.GoodReturn.NoSuchSupplementary_TableException if a supplementary_ table with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.GoodReturn.model.Supplementary_Table findByPrimaryKey(
		long table_Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.GoodReturn.NoSuchSupplementary_TableException {
		return getPersistence().findByPrimaryKey(table_Id);
	}

	/**
	* Returns the supplementary_ table with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param table_Id the primary key of the supplementary_ table
	* @return the supplementary_ table, or <code>null</code> if a supplementary_ table with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.GoodReturn.model.Supplementary_Table fetchByPrimaryKey(
		long table_Id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(table_Id);
	}

	/**
	* Returns all the supplementary_ tables.
	*
	* @return the supplementary_ tables
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.GoodReturn.model.Supplementary_Table> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the supplementary_ tables.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of supplementary_ tables
	* @param end the upper bound of the range of supplementary_ tables (not inclusive)
	* @return the range of supplementary_ tables
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.GoodReturn.model.Supplementary_Table> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the supplementary_ tables.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of supplementary_ tables
	* @param end the upper bound of the range of supplementary_ tables (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of supplementary_ tables
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.GoodReturn.model.Supplementary_Table> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the supplementary_ tables from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of supplementary_ tables.
	*
	* @return the number of supplementary_ tables
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static Supplementary_TablePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (Supplementary_TablePersistence)PortletBeanLocatorUtil.locate(org.GoodReturn.service.ClpSerializer.getServletContextName(),
					Supplementary_TablePersistence.class.getName());

			ReferenceRegistry.registerReference(Supplementary_TableUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(Supplementary_TablePersistence persistence) {
	}

	private static Supplementary_TablePersistence _persistence;
}