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

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link TeamLenderLocalService}.
 * </p>
 *
 * @author    gilaa004
 * @see       TeamLenderLocalService
 * @generated
 */
public class TeamLenderLocalServiceWrapper implements TeamLenderLocalService,
	ServiceWrapper<TeamLenderLocalService> {
	public TeamLenderLocalServiceWrapper(
		TeamLenderLocalService teamLenderLocalService) {
		_teamLenderLocalService = teamLenderLocalService;
	}

	/**
	* Adds the team lender to the database. Also notifies the appropriate model listeners.
	*
	* @param teamLender the team lender
	* @return the team lender that was added
	* @throws SystemException if a system exception occurred
	*/
	public org.goodreturn.model.TeamLender addTeamLender(
		org.goodreturn.model.TeamLender teamLender)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _teamLenderLocalService.addTeamLender(teamLender);
	}

	/**
	* Creates a new team lender with the primary key. Does not add the team lender to the database.
	*
	* @param team_lender_Id the primary key for the new team lender
	* @return the new team lender
	*/
	public org.goodreturn.model.TeamLender createTeamLender(long team_lender_Id) {
		return _teamLenderLocalService.createTeamLender(team_lender_Id);
	}

	/**
	* Deletes the team lender with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param team_lender_Id the primary key of the team lender
	* @return the team lender that was removed
	* @throws PortalException if a team lender with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.goodreturn.model.TeamLender deleteTeamLender(long team_lender_Id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _teamLenderLocalService.deleteTeamLender(team_lender_Id);
	}

	/**
	* Deletes the team lender from the database. Also notifies the appropriate model listeners.
	*
	* @param teamLender the team lender
	* @return the team lender that was removed
	* @throws SystemException if a system exception occurred
	*/
	public org.goodreturn.model.TeamLender deleteTeamLender(
		org.goodreturn.model.TeamLender teamLender)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _teamLenderLocalService.deleteTeamLender(teamLender);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _teamLenderLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _teamLenderLocalService.dynamicQuery(dynamicQuery);
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
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _teamLenderLocalService.dynamicQuery(dynamicQuery, start, end);
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
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _teamLenderLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _teamLenderLocalService.dynamicQueryCount(dynamicQuery);
	}

	public org.goodreturn.model.TeamLender fetchTeamLender(long team_lender_Id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _teamLenderLocalService.fetchTeamLender(team_lender_Id);
	}

	/**
	* Returns the team lender with the primary key.
	*
	* @param team_lender_Id the primary key of the team lender
	* @return the team lender
	* @throws PortalException if a team lender with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.goodreturn.model.TeamLender getTeamLender(long team_lender_Id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _teamLenderLocalService.getTeamLender(team_lender_Id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _teamLenderLocalService.getPersistedModel(primaryKeyObj);
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
	public java.util.List<org.goodreturn.model.TeamLender> getTeamLenders(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _teamLenderLocalService.getTeamLenders(start, end);
	}

	/**
	* Returns the number of team lenders.
	*
	* @return the number of team lenders
	* @throws SystemException if a system exception occurred
	*/
	public int getTeamLendersCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _teamLenderLocalService.getTeamLendersCount();
	}

	/**
	* Updates the team lender in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param teamLender the team lender
	* @return the team lender that was updated
	* @throws SystemException if a system exception occurred
	*/
	public org.goodreturn.model.TeamLender updateTeamLender(
		org.goodreturn.model.TeamLender teamLender)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _teamLenderLocalService.updateTeamLender(teamLender);
	}

	/**
	* Updates the team lender in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param teamLender the team lender
	* @param merge whether to merge the team lender with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the team lender that was updated
	* @throws SystemException if a system exception occurred
	*/
	public org.goodreturn.model.TeamLender updateTeamLender(
		org.goodreturn.model.TeamLender teamLender, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _teamLenderLocalService.updateTeamLender(teamLender, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _teamLenderLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_teamLenderLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _teamLenderLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public TeamLenderLocalService getWrappedTeamLenderLocalService() {
		return _teamLenderLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedTeamLenderLocalService(
		TeamLenderLocalService teamLenderLocalService) {
		_teamLenderLocalService = teamLenderLocalService;
	}

	public TeamLenderLocalService getWrappedService() {
		return _teamLenderLocalService;
	}

	public void setWrappedService(TeamLenderLocalService teamLenderLocalService) {
		_teamLenderLocalService = teamLenderLocalService;
	}

	private TeamLenderLocalService _teamLenderLocalService;
}