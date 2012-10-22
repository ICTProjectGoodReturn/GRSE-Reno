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
 * The utility for the borrower loan local service. This utility wraps {@link org.goodreturn.service.impl.BorrowerLoanLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author gilaa004
 * @see BorrowerLoanLocalService
 * @see org.goodreturn.service.base.BorrowerLoanLocalServiceBaseImpl
 * @see org.goodreturn.service.impl.BorrowerLoanLocalServiceImpl
 * @generated
 */
public class BorrowerLoanLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link org.goodreturn.service.impl.BorrowerLoanLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the borrower loan to the database. Also notifies the appropriate model listeners.
	*
	* @param borrowerLoan the borrower loan
	* @return the borrower loan that was added
	* @throws SystemException if a system exception occurred
	*/
	public static org.goodreturn.model.BorrowerLoan addBorrowerLoan(
		org.goodreturn.model.BorrowerLoan borrowerLoan)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addBorrowerLoan(borrowerLoan);
	}

	/**
	* Creates a new borrower loan with the primary key. Does not add the borrower loan to the database.
	*
	* @param abacus_Borrower_Loan_Id the primary key for the new borrower loan
	* @return the new borrower loan
	*/
	public static org.goodreturn.model.BorrowerLoan createBorrowerLoan(
		long abacus_Borrower_Loan_Id) {
		return getService().createBorrowerLoan(abacus_Borrower_Loan_Id);
	}

	/**
	* Deletes the borrower loan with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param abacus_Borrower_Loan_Id the primary key of the borrower loan
	* @return the borrower loan that was removed
	* @throws PortalException if a borrower loan with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.goodreturn.model.BorrowerLoan deleteBorrowerLoan(
		long abacus_Borrower_Loan_Id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteBorrowerLoan(abacus_Borrower_Loan_Id);
	}

	/**
	* Deletes the borrower loan from the database. Also notifies the appropriate model listeners.
	*
	* @param borrowerLoan the borrower loan
	* @return the borrower loan that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static org.goodreturn.model.BorrowerLoan deleteBorrowerLoan(
		org.goodreturn.model.BorrowerLoan borrowerLoan)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteBorrowerLoan(borrowerLoan);
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

	public static org.goodreturn.model.BorrowerLoan fetchBorrowerLoan(
		long abacus_Borrower_Loan_Id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchBorrowerLoan(abacus_Borrower_Loan_Id);
	}

	/**
	* Returns the borrower loan with the primary key.
	*
	* @param abacus_Borrower_Loan_Id the primary key of the borrower loan
	* @return the borrower loan
	* @throws PortalException if a borrower loan with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.goodreturn.model.BorrowerLoan getBorrowerLoan(
		long abacus_Borrower_Loan_Id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getBorrowerLoan(abacus_Borrower_Loan_Id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the borrower loans.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of borrower loans
	* @param end the upper bound of the range of borrower loans (not inclusive)
	* @return the range of borrower loans
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.goodreturn.model.BorrowerLoan> getBorrowerLoans(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getBorrowerLoans(start, end);
	}

	/**
	* Returns the number of borrower loans.
	*
	* @return the number of borrower loans
	* @throws SystemException if a system exception occurred
	*/
	public static int getBorrowerLoansCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getBorrowerLoansCount();
	}

	/**
	* Updates the borrower loan in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param borrowerLoan the borrower loan
	* @return the borrower loan that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static org.goodreturn.model.BorrowerLoan updateBorrowerLoan(
		org.goodreturn.model.BorrowerLoan borrowerLoan)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateBorrowerLoan(borrowerLoan);
	}

	/**
	* Updates the borrower loan in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param borrowerLoan the borrower loan
	* @param merge whether to merge the borrower loan with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the borrower loan that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static org.goodreturn.model.BorrowerLoan updateBorrowerLoan(
		org.goodreturn.model.BorrowerLoan borrowerLoan, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateBorrowerLoan(borrowerLoan, merge);
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

	public static BorrowerLoanLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					BorrowerLoanLocalService.class.getName());

			if (invokableLocalService instanceof BorrowerLoanLocalService) {
				_service = (BorrowerLoanLocalService)invokableLocalService;
			}
			else {
				_service = new BorrowerLoanLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(BorrowerLoanLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(BorrowerLoanLocalService service) {
	}

	private static BorrowerLoanLocalService _service;
}