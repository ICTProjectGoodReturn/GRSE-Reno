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
 * This class is a wrapper for {@link TeamLocalService}.
 * </p>
 *
 * @author    gilaa004
 * @see       TeamLocalService
 * @generated
 */
public class TeamLocalServiceWrapper implements TeamLocalService,
	ServiceWrapper<TeamLocalService> {
	public TeamLocalServiceWrapper(TeamLocalService teamLocalService) {
		_teamLocalService = teamLocalService;
	}

	/**
	* Adds the team to the database. Also notifies the appropriate model listeners.
	*
	* @param team the team
	* @return the team that was added
	* @throws SystemException if a system exception occurred
	*/
	public org.goodreturn.model.Team addTeam(org.goodreturn.model.Team team)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _teamLocalService.addTeam(team);
	}

	/**
	* Creates a new team with the primary key. Does not add the team to the database.
	*
	* @param team_Id the primary key for the new team
	* @return the new team
	*/
	public org.goodreturn.model.Team createTeam(long team_Id) {
		return _teamLocalService.createTeam(team_Id);
	}

	/**
	* Deletes the team with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param team_Id the primary key of the team
	* @return the team that was removed
	* @throws PortalException if a team with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.goodreturn.model.Team deleteTeam(long team_Id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _teamLocalService.deleteTeam(team_Id);
	}

	/**
	* Deletes the team from the database. Also notifies the appropriate model listeners.
	*
	* @param team the team
	* @return the team that was removed
	* @throws SystemException if a system exception occurred
	*/
	public org.goodreturn.model.Team deleteTeam(org.goodreturn.model.Team team)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _teamLocalService.deleteTeam(team);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _teamLocalService.dynamicQuery();
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
		return _teamLocalService.dynamicQuery(dynamicQuery);
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
		return _teamLocalService.dynamicQuery(dynamicQuery, start, end);
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
		return _teamLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _teamLocalService.dynamicQueryCount(dynamicQuery);
	}

	public org.goodreturn.model.Team fetchTeam(long team_Id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _teamLocalService.fetchTeam(team_Id);
	}

	/**
	* Returns the team with the primary key.
	*
	* @param team_Id the primary key of the team
	* @return the team
	* @throws PortalException if a team with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.goodreturn.model.Team getTeam(long team_Id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _teamLocalService.getTeam(team_Id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _teamLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the teams.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of teams
	* @param end the upper bound of the range of teams (not inclusive)
	* @return the range of teams
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.goodreturn.model.Team> getTeams(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _teamLocalService.getTeams(start, end);
	}

	/**
	* Returns the number of teams.
	*
	* @return the number of teams
	* @throws SystemException if a system exception occurred
	*/
	public int getTeamsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _teamLocalService.getTeamsCount();
	}

	/**
	* Updates the team in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param team the team
	* @return the team that was updated
	* @throws SystemException if a system exception occurred
	*/
	public org.goodreturn.model.Team updateTeam(org.goodreturn.model.Team team)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _teamLocalService.updateTeam(team);
	}

	/**
	* Updates the team in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param team the team
	* @param merge whether to merge the team with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the team that was updated
	* @throws SystemException if a system exception occurred
	*/
	public org.goodreturn.model.Team updateTeam(
		org.goodreturn.model.Team team, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _teamLocalService.updateTeam(team, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _teamLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_teamLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _teamLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public TeamLocalService getWrappedTeamLocalService() {
		return _teamLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedTeamLocalService(TeamLocalService teamLocalService) {
		_teamLocalService = teamLocalService;
	}

	public TeamLocalService getWrappedService() {
		return _teamLocalService;
	}

	public void setWrappedService(TeamLocalService teamLocalService) {
		_teamLocalService = teamLocalService;
	}

	private TeamLocalService _teamLocalService;
}