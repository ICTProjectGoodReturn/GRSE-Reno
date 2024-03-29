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
 * The utility for the team lender loan local service. This utility wraps {@link org.goodreturn.service.impl.TeamLenderLoanLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author gilaa004
 * @see TeamLenderLoanLocalService
 * @see org.goodreturn.service.base.TeamLenderLoanLocalServiceBaseImpl
 * @see org.goodreturn.service.impl.TeamLenderLoanLocalServiceImpl
 * @generated
 */
public class TeamLenderLoanLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link org.goodreturn.service.impl.TeamLenderLoanLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the team lender loan to the database. Also notifies the appropriate model listeners.
	*
	* @param teamLenderLoan the team lender loan
	* @return the team lender loan that was added
	* @throws SystemException if a system exception occurred
	*/
	public static org.goodreturn.model.TeamLenderLoan addTeamLenderLoan(
		org.goodreturn.model.TeamLenderLoan teamLenderLoan)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addTeamLenderLoan(teamLenderLoan);
	}

	/**
	* Creates a new team lender loan with the primary key. Does not add the team lender loan to the database.
	*
	* @param account_Id the primary key for the new team lender loan
	* @return the new team lender loan
	*/
	public static org.goodreturn.model.TeamLenderLoan createTeamLenderLoan(
		long account_Id) {
		return getService().createTeamLenderLoan(account_Id);
	}

	/**
	* Deletes the team lender loan with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param account_Id the primary key of the team lender loan
	* @return the team lender loan that was removed
	* @throws PortalException if a team lender loan with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.goodreturn.model.TeamLenderLoan deleteTeamLenderLoan(
		long account_Id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteTeamLenderLoan(account_Id);
	}

	/**
	* Deletes the team lender loan from the database. Also notifies the appropriate model listeners.
	*
	* @param teamLenderLoan the team lender loan
	* @return the team lender loan that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static org.goodreturn.model.TeamLenderLoan deleteTeamLenderLoan(
		org.goodreturn.model.TeamLenderLoan teamLenderLoan)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteTeamLenderLoan(teamLenderLoan);
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

	public static org.goodreturn.model.TeamLenderLoan fetchTeamLenderLoan(
		long account_Id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchTeamLenderLoan(account_Id);
	}

	/**
	* Returns the team lender loan with the primary key.
	*
	* @param account_Id the primary key of the team lender loan
	* @return the team lender loan
	* @throws PortalException if a team lender loan with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.goodreturn.model.TeamLenderLoan getTeamLenderLoan(
		long account_Id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getTeamLenderLoan(account_Id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the team lender loans.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of team lender loans
	* @param end the upper bound of the range of team lender loans (not inclusive)
	* @return the range of team lender loans
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.goodreturn.model.TeamLenderLoan> getTeamLenderLoans(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getTeamLenderLoans(start, end);
	}

	/**
	* Returns the number of team lender loans.
	*
	* @return the number of team lender loans
	* @throws SystemException if a system exception occurred
	*/
	public static int getTeamLenderLoansCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getTeamLenderLoansCount();
	}

	/**
	* Updates the team lender loan in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param teamLenderLoan the team lender loan
	* @return the team lender loan that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static org.goodreturn.model.TeamLenderLoan updateTeamLenderLoan(
		org.goodreturn.model.TeamLenderLoan teamLenderLoan)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateTeamLenderLoan(teamLenderLoan);
	}

	/**
	* Updates the team lender loan in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param teamLenderLoan the team lender loan
	* @param merge whether to merge the team lender loan with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the team lender loan that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static org.goodreturn.model.TeamLenderLoan updateTeamLenderLoan(
		org.goodreturn.model.TeamLenderLoan teamLenderLoan, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateTeamLenderLoan(teamLenderLoan, merge);
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

	public static TeamLenderLoanLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					TeamLenderLoanLocalService.class.getName());

			if (invokableLocalService instanceof TeamLenderLoanLocalService) {
				_service = (TeamLenderLoanLocalService)invokableLocalService;
			}
			else {
				_service = new TeamLenderLoanLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(TeamLenderLoanLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(TeamLenderLoanLocalService service) {
	}

	private static TeamLenderLoanLocalService _service;
}