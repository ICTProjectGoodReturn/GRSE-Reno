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

package org.goodreturn.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * The utility for the temp bl local service. This utility wraps {@link org.goodreturn.service.impl.TempBlLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author gilaa004
 * @see TempBlLocalService
 * @see org.goodreturn.service.base.TempBlLocalServiceBaseImpl
 * @see org.goodreturn.service.impl.TempBlLocalServiceImpl
 * @generated
 */
public class TempBlLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link org.goodreturn.service.impl.TempBlLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the temp bl to the database. Also notifies the appropriate model listeners.
	*
	* @param tempBl the temp bl
	* @return the temp bl that was added
	* @throws SystemException if a system exception occurred
	*/
	public static org.goodreturn.model.TempBl addTempBl(
		org.goodreturn.model.TempBl tempBl)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addTempBl(tempBl);
	}

	/**
	* Creates a new temp bl with the primary key. Does not add the temp bl to the database.
	*
	* @param tempBlPK the primary key for the new temp bl
	* @return the new temp bl
	*/
	public static org.goodreturn.model.TempBl createTempBl(
		org.goodreturn.service.persistence.TempBlPK tempBlPK) {
		return getService().createTempBl(tempBlPK);
	}

	/**
	* Deletes the temp bl with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param tempBlPK the primary key of the temp bl
	* @return the temp bl that was removed
	* @throws PortalException if a temp bl with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.goodreturn.model.TempBl deleteTempBl(
		org.goodreturn.service.persistence.TempBlPK tempBlPK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteTempBl(tempBlPK);
	}

	/**
	* Deletes the temp bl from the database. Also notifies the appropriate model listeners.
	*
	* @param tempBl the temp bl
	* @return the temp bl that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static org.goodreturn.model.TempBl deleteTempBl(
		org.goodreturn.model.TempBl tempBl)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteTempBl(tempBl);
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

	public static org.goodreturn.model.TempBl fetchTempBl(
		org.goodreturn.service.persistence.TempBlPK tempBlPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchTempBl(tempBlPK);
	}

	/**
	* Returns the temp bl with the primary key.
	*
	* @param tempBlPK the primary key of the temp bl
	* @return the temp bl
	* @throws PortalException if a temp bl with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.goodreturn.model.TempBl getTempBl(
		org.goodreturn.service.persistence.TempBlPK tempBlPK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getTempBl(tempBlPK);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static java.util.List<org.goodreturn.model.TempBl> getTempBls(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getTempBls(start, end);
	}

	/**
	* Returns the number of temp bls.
	*
	* @return the number of temp bls
	* @throws SystemException if a system exception occurred
	*/
	public static int getTempBlsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getTempBlsCount();
	}

	/**
	* Updates the temp bl in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tempBl the temp bl
	* @return the temp bl that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static org.goodreturn.model.TempBl updateTempBl(
		org.goodreturn.model.TempBl tempBl)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateTempBl(tempBl);
	}

	/**
	* Updates the temp bl in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tempBl the temp bl
	* @param merge whether to merge the temp bl with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the temp bl that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static org.goodreturn.model.TempBl updateTempBl(
		org.goodreturn.model.TempBl tempBl, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateTempBl(tempBl, merge);
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

	public static TempBlLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					TempBlLocalService.class.getName());

			if (invokableLocalService instanceof TempBlLocalService) {
				_service = (TempBlLocalService)invokableLocalService;
			}
			else {
				_service = new TempBlLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(TempBlLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(TempBlLocalService service) {
	}

	private static TempBlLocalService _service;
}