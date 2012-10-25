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

import org.goodreturn.model.TempBl;

import java.util.List;

/**
 * The persistence utility for the temp bl service. This utility wraps {@link TempBlPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author gilaa004
 * @see TempBlPersistence
 * @see TempBlPersistenceImpl
 * @generated
 */
public class TempBlUtil {
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
	public static void clearCache(TempBl tempBl) {
		getPersistence().clearCache(tempBl);
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
	public static List<TempBl> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TempBl> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TempBl> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static TempBl update(TempBl tempBl, boolean merge)
		throws SystemException {
		return getPersistence().update(tempBl, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static TempBl update(TempBl tempBl, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(tempBl, merge, serviceContext);
	}

	/**
	* Caches the temp bl in the entity cache if it is enabled.
	*
	* @param tempBl the temp bl
	*/
	public static void cacheResult(org.goodreturn.model.TempBl tempBl) {
		getPersistence().cacheResult(tempBl);
	}

	/**
	* Caches the temp bls in the entity cache if it is enabled.
	*
	* @param tempBls the temp bls
	*/
	public static void cacheResult(
		java.util.List<org.goodreturn.model.TempBl> tempBls) {
		getPersistence().cacheResult(tempBls);
	}

	/**
	* Creates a new temp bl with the primary key. Does not add the temp bl to the database.
	*
	* @param tempBlPK the primary key for the new temp bl
	* @return the new temp bl
	*/
	public static org.goodreturn.model.TempBl create(
		org.goodreturn.service.persistence.TempBlPK tempBlPK) {
		return getPersistence().create(tempBlPK);
	}

	/**
	* Removes the temp bl with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param tempBlPK the primary key of the temp bl
	* @return the temp bl that was removed
	* @throws org.goodreturn.NoSuchTempBlException if a temp bl with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.goodreturn.model.TempBl remove(
		org.goodreturn.service.persistence.TempBlPK tempBlPK)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.goodreturn.NoSuchTempBlException {
		return getPersistence().remove(tempBlPK);
	}

	public static org.goodreturn.model.TempBl updateImpl(
		org.goodreturn.model.TempBl tempBl, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(tempBl, merge);
	}

	/**
	* Returns the temp bl with the primary key or throws a {@link org.goodreturn.NoSuchTempBlException} if it could not be found.
	*
	* @param tempBlPK the primary key of the temp bl
	* @return the temp bl
	* @throws org.goodreturn.NoSuchTempBlException if a temp bl with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.goodreturn.model.TempBl findByPrimaryKey(
		org.goodreturn.service.persistence.TempBlPK tempBlPK)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.goodreturn.NoSuchTempBlException {
		return getPersistence().findByPrimaryKey(tempBlPK);
	}

	/**
	* Returns the temp bl with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param tempBlPK the primary key of the temp bl
	* @return the temp bl, or <code>null</code> if a temp bl with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.goodreturn.model.TempBl fetchByPrimaryKey(
		org.goodreturn.service.persistence.TempBlPK tempBlPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(tempBlPK);
	}

	/**
	* Returns all the temp bls.
	*
	* @return the temp bls
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.goodreturn.model.TempBl> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the temp bls.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of temp bls
	* @param end the upper bound of the range of temp bls (not inclusive)
	* @return the range of temp bls
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.goodreturn.model.TempBl> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the temp bls.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of temp bls
	* @param end the upper bound of the range of temp bls (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of temp bls
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.goodreturn.model.TempBl> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the temp bls from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of temp bls.
	*
	* @return the number of temp bls
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static TempBlPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (TempBlPersistence)PortletBeanLocatorUtil.locate(org.goodreturn.service.ClpSerializer.getServletContextName(),
					TempBlPersistence.class.getName());

			ReferenceRegistry.registerReference(TempBlUtil.class, "_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(TempBlPersistence persistence) {
	}

	private static TempBlPersistence _persistence;
}