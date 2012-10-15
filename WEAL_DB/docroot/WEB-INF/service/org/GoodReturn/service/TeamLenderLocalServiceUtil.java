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

package org.GoodReturn.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * The utility for the team lender local service. This utility wraps {@link org.GoodReturn.service.impl.TeamLenderLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author gilaa004
 * @see TeamLenderLocalService
 * @see org.GoodReturn.service.base.TeamLenderLocalServiceBaseImpl
 * @see org.GoodReturn.service.impl.TeamLenderLocalServiceImpl
 * @generated
 */
public class TeamLenderLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link org.GoodReturn.service.impl.TeamLenderLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the team lender to the database. Also notifies the appropriate model listeners.
	*
	* @param teamLender the team lender
	* @return the team lender that was added
	* @throws SystemException if a system exception occurred
	*/
	public static org.GoodReturn.model.TeamLender addTeamLender(
		org.GoodReturn.model.TeamLender teamLender)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addTeamLender(teamLender);
	}

	/**
	* Creates a new team lender with the primary key. Does not add the team lender to the database.
	*
	* @param teamlender_Id the primary key for the new team lender
	* @return the new team lender
	*/
	public static org.GoodReturn.model.TeamLender createTeamLender(
		long teamlender_Id) {
		return getService().createTeamLender(teamlender_Id);
	}

	/**
	* Deletes the team lender with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param teamlender_Id the primary key of the team lender
	* @return the team lender that was removed
	* @throws PortalException if a team lender with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.GoodReturn.model.TeamLender deleteTeamLender(
		long teamlender_Id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteTeamLender(teamlender_Id);
	}

	/**
	* Deletes the team lender from the database. Also notifies the appropriate model listeners.
	*
	* @param teamLender the team lender
	* @return the team lender that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static org.GoodReturn.model.TeamLender deleteTeamLender(
		org.GoodReturn.model.TeamLender teamLender)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteTeamLender(teamLender);
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

	public static org.GoodReturn.model.TeamLender fetchTeamLender(
		long teamlender_Id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchTeamLender(teamlender_Id);
	}

	/**
	* Returns the team lender with the primary key.
	*
	* @param teamlender_Id the primary key of the team lender
	* @return the team lender
	* @throws PortalException if a team lender with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.GoodReturn.model.TeamLender getTeamLender(
		long teamlender_Id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getTeamLender(teamlender_Id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the team lenders.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of team lenders
	* @param end the upper bound of the range of team lenders (not inclusive)
	* @return the range of team lenders
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.GoodReturn.model.TeamLender> getTeamLenders(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getTeamLenders(start, end);
	}

	/**
	* Returns the number of team lenders.
	*
	* @return the number of team lenders
	* @throws SystemException if a system exception occurred
	*/
	public static int getTeamLendersCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getTeamLendersCount();
	}

	/**
	* Updates the team lender in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param teamLender the team lender
	* @return the team lender that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static org.GoodReturn.model.TeamLender updateTeamLender(
		org.GoodReturn.model.TeamLender teamLender)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateTeamLender(teamLender);
	}

	/**
	* Updates the team lender in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param teamLender the team lender
	* @param merge whether to merge the team lender with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the team lender that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static org.GoodReturn.model.TeamLender updateTeamLender(
		org.GoodReturn.model.TeamLender teamLender, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateTeamLender(teamLender, merge);
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

	public static TeamLenderLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					TeamLenderLocalService.class.getName());

			if (invokableLocalService instanceof TeamLenderLocalService) {
				_service = (TeamLenderLocalService)invokableLocalService;
			}
			else {
				_service = new TeamLenderLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(TeamLenderLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(TeamLenderLocalService service) {
	}

	private static TeamLenderLocalService _service;
}