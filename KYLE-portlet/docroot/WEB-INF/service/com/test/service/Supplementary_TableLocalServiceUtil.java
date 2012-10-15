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

package com.test.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * The utility for the supplementary_ table local service. This utility wraps {@link com.test.service.impl.Supplementary_TableLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author gilaa004
 * @see Supplementary_TableLocalService
 * @see com.test.service.base.Supplementary_TableLocalServiceBaseImpl
 * @see com.test.service.impl.Supplementary_TableLocalServiceImpl
 * @generated
 */
public class Supplementary_TableLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.test.service.impl.Supplementary_TableLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the supplementary_ table to the database. Also notifies the appropriate model listeners.
	*
	* @param supplementary_Table the supplementary_ table
	* @return the supplementary_ table that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.model.Supplementary_Table addSupplementary_Table(
		com.test.model.Supplementary_Table supplementary_Table)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addSupplementary_Table(supplementary_Table);
	}

	/**
	* Creates a new supplementary_ table with the primary key. Does not add the supplementary_ table to the database.
	*
	* @param table_Id the primary key for the new supplementary_ table
	* @return the new supplementary_ table
	*/
	public static com.test.model.Supplementary_Table createSupplementary_Table(
		long table_Id) {
		return getService().createSupplementary_Table(table_Id);
	}

	/**
	* Deletes the supplementary_ table with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param table_Id the primary key of the supplementary_ table
	* @return the supplementary_ table that was removed
	* @throws PortalException if a supplementary_ table with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.model.Supplementary_Table deleteSupplementary_Table(
		long table_Id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteSupplementary_Table(table_Id);
	}

	/**
	* Deletes the supplementary_ table from the database. Also notifies the appropriate model listeners.
	*
	* @param supplementary_Table the supplementary_ table
	* @return the supplementary_ table that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.model.Supplementary_Table deleteSupplementary_Table(
		com.test.model.Supplementary_Table supplementary_Table)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteSupplementary_Table(supplementary_Table);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	public static com.test.model.Supplementary_Table fetchSupplementary_Table(
		long table_Id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchSupplementary_Table(table_Id);
	}

	/**
	* Returns the supplementary_ table with the primary key.
	*
	* @param table_Id the primary key of the supplementary_ table
	* @return the supplementary_ table
	* @throws PortalException if a supplementary_ table with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.model.Supplementary_Table getSupplementary_Table(
		long table_Id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getSupplementary_Table(table_Id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static java.util.List<com.test.model.Supplementary_Table> getSupplementary_Tables(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getSupplementary_Tables(start, end);
	}

	/**
	* Returns the number of supplementary_ tables.
	*
	* @return the number of supplementary_ tables
	* @throws SystemException if a system exception occurred
	*/
	public static int getSupplementary_TablesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getSupplementary_TablesCount();
	}

	/**
	* Updates the supplementary_ table in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param supplementary_Table the supplementary_ table
	* @return the supplementary_ table that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.model.Supplementary_Table updateSupplementary_Table(
		com.test.model.Supplementary_Table supplementary_Table)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateSupplementary_Table(supplementary_Table);
	}

	/**
	* Updates the supplementary_ table in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param supplementary_Table the supplementary_ table
	* @param merge whether to merge the supplementary_ table with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the supplementary_ table that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.model.Supplementary_Table updateSupplementary_Table(
		com.test.model.Supplementary_Table supplementary_Table, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateSupplementary_Table(supplementary_Table, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static void clearService() {
		_service = null;
	}

	public static Supplementary_TableLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					Supplementary_TableLocalService.class.getName());

			if (invokableLocalService instanceof Supplementary_TableLocalService) {
				_service = (Supplementary_TableLocalService)invokableLocalService;
			}
			else {
				_service = new Supplementary_TableLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(Supplementary_TableLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(Supplementary_TableLocalService service) {
	}

	private static Supplementary_TableLocalService _service;
}