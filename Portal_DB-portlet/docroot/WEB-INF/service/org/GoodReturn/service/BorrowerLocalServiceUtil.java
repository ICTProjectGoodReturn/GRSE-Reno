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
 * The utility for the borrower local service. This utility wraps {@link org.goodreturn.service.impl.BorrowerLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author gilaa004
 * @see BorrowerLocalService
 * @see org.goodreturn.service.base.BorrowerLocalServiceBaseImpl
 * @see org.goodreturn.service.impl.BorrowerLocalServiceImpl
 * @generated
 */
public class BorrowerLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link org.goodreturn.service.impl.BorrowerLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the borrower to the database. Also notifies the appropriate model listeners.
	*
	* @param borrower the borrower
	* @return the borrower that was added
	* @throws SystemException if a system exception occurred
	*/
	public static org.goodreturn.model.Borrower addBorrower(
		org.goodreturn.model.Borrower borrower)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addBorrower(borrower);
	}

	/**
	* Creates a new borrower with the primary key. Does not add the borrower to the database.
	*
	* @param abacus_Borrower_Id the primary key for the new borrower
	* @return the new borrower
	*/
	public static org.goodreturn.model.Borrower createBorrower(
		long abacus_Borrower_Id) {
		return getService().createBorrower(abacus_Borrower_Id);
	}

	/**
	* Deletes the borrower with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param abacus_Borrower_Id the primary key of the borrower
	* @return the borrower that was removed
	* @throws PortalException if a borrower with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.goodreturn.model.Borrower deleteBorrower(
		long abacus_Borrower_Id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteBorrower(abacus_Borrower_Id);
	}

	/**
	* Deletes the borrower from the database. Also notifies the appropriate model listeners.
	*
	* @param borrower the borrower
	* @return the borrower that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static org.goodreturn.model.Borrower deleteBorrower(
		org.goodreturn.model.Borrower borrower)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteBorrower(borrower);
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

	public static org.goodreturn.model.Borrower fetchBorrower(
		long abacus_Borrower_Id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchBorrower(abacus_Borrower_Id);
	}

	/**
	* Returns the borrower with the primary key.
	*
	* @param abacus_Borrower_Id the primary key of the borrower
	* @return the borrower
	* @throws PortalException if a borrower with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.goodreturn.model.Borrower getBorrower(
		long abacus_Borrower_Id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getBorrower(abacus_Borrower_Id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static java.util.List<org.goodreturn.model.Borrower> getBorrowers(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getBorrowers(start, end);
	}

	/**
	* Returns the number of borrowers.
	*
	* @return the number of borrowers
	* @throws SystemException if a system exception occurred
	*/
	public static int getBorrowersCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getBorrowersCount();
	}

	/**
	* Updates the borrower in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param borrower the borrower
	* @return the borrower that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static org.goodreturn.model.Borrower updateBorrower(
		org.goodreturn.model.Borrower borrower)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateBorrower(borrower);
	}

	/**
	* Updates the borrower in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param borrower the borrower
	* @param merge whether to merge the borrower with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the borrower that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static org.goodreturn.model.Borrower updateBorrower(
		org.goodreturn.model.Borrower borrower, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateBorrower(borrower, merge);
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

	public static BorrowerLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					BorrowerLocalService.class.getName());

			if (invokableLocalService instanceof BorrowerLocalService) {
				_service = (BorrowerLocalService)invokableLocalService;
			}
			else {
				_service = new BorrowerLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(BorrowerLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(BorrowerLocalService service) {
	}

	private static BorrowerLocalService _service;
}