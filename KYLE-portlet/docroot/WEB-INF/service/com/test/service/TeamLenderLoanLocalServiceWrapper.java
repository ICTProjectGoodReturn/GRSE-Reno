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

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link TeamLenderLoanLocalService}.
 * </p>
 *
 * @author    gilaa004
 * @see       TeamLenderLoanLocalService
 * @generated
 */
public class TeamLenderLoanLocalServiceWrapper
	implements TeamLenderLoanLocalService,
		ServiceWrapper<TeamLenderLoanLocalService> {
	public TeamLenderLoanLocalServiceWrapper(
		TeamLenderLoanLocalService teamLenderLoanLocalService) {
		_teamLenderLoanLocalService = teamLenderLoanLocalService;
	}

	/**
	* Adds the team lender loan to the database. Also notifies the appropriate model listeners.
	*
	* @param teamLenderLoan the team lender loan
	* @return the team lender loan that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.test.model.TeamLenderLoan addTeamLenderLoan(
		com.test.model.TeamLenderLoan teamLenderLoan)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _teamLenderLoanLocalService.addTeamLenderLoan(teamLenderLoan);
	}

	/**
	* Creates a new team lender loan with the primary key. Does not add the team lender loan to the database.
	*
	* @param account_Id the primary key for the new team lender loan
	* @return the new team lender loan
	*/
	public com.test.model.TeamLenderLoan createTeamLenderLoan(long account_Id) {
		return _teamLenderLoanLocalService.createTeamLenderLoan(account_Id);
	}

	/**
	* Deletes the team lender loan with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param account_Id the primary key of the team lender loan
	* @return the team lender loan that was removed
	* @throws PortalException if a team lender loan with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.test.model.TeamLenderLoan deleteTeamLenderLoan(long account_Id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _teamLenderLoanLocalService.deleteTeamLenderLoan(account_Id);
	}

	/**
	* Deletes the team lender loan from the database. Also notifies the appropriate model listeners.
	*
	* @param teamLenderLoan the team lender loan
	* @return the team lender loan that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.test.model.TeamLenderLoan deleteTeamLenderLoan(
		com.test.model.TeamLenderLoan teamLenderLoan)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _teamLenderLoanLocalService.deleteTeamLenderLoan(teamLenderLoan);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _teamLenderLoanLocalService.dynamicQuery();
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
		return _teamLenderLoanLocalService.dynamicQuery(dynamicQuery);
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
		return _teamLenderLoanLocalService.dynamicQuery(dynamicQuery, start, end);
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
		return _teamLenderLoanLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
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
		return _teamLenderLoanLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.test.model.TeamLenderLoan fetchTeamLenderLoan(long account_Id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _teamLenderLoanLocalService.fetchTeamLenderLoan(account_Id);
	}

	/**
	* Returns the team lender loan with the primary key.
	*
	* @param account_Id the primary key of the team lender loan
	* @return the team lender loan
	* @throws PortalException if a team lender loan with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.test.model.TeamLenderLoan getTeamLenderLoan(long account_Id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _teamLenderLoanLocalService.getTeamLenderLoan(account_Id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _teamLenderLoanLocalService.getPersistedModel(primaryKeyObj);
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
	public java.util.List<com.test.model.TeamLenderLoan> getTeamLenderLoans(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _teamLenderLoanLocalService.getTeamLenderLoans(start, end);
	}

	/**
	* Returns the number of team lender loans.
	*
	* @return the number of team lender loans
	* @throws SystemException if a system exception occurred
	*/
	public int getTeamLenderLoansCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _teamLenderLoanLocalService.getTeamLenderLoansCount();
	}

	/**
	* Updates the team lender loan in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param teamLenderLoan the team lender loan
	* @return the team lender loan that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.test.model.TeamLenderLoan updateTeamLenderLoan(
		com.test.model.TeamLenderLoan teamLenderLoan)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _teamLenderLoanLocalService.updateTeamLenderLoan(teamLenderLoan);
	}

	/**
	* Updates the team lender loan in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param teamLenderLoan the team lender loan
	* @param merge whether to merge the team lender loan with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the team lender loan that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.test.model.TeamLenderLoan updateTeamLenderLoan(
		com.test.model.TeamLenderLoan teamLenderLoan, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _teamLenderLoanLocalService.updateTeamLenderLoan(teamLenderLoan,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _teamLenderLoanLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_teamLenderLoanLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _teamLenderLoanLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public TeamLenderLoanLocalService getWrappedTeamLenderLoanLocalService() {
		return _teamLenderLoanLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedTeamLenderLoanLocalService(
		TeamLenderLoanLocalService teamLenderLoanLocalService) {
		_teamLenderLoanLocalService = teamLenderLoanLocalService;
	}

	public TeamLenderLoanLocalService getWrappedService() {
		return _teamLenderLoanLocalService;
	}

	public void setWrappedService(
		TeamLenderLoanLocalService teamLenderLoanLocalService) {
		_teamLenderLoanLocalService = teamLenderLoanLocalService;
	}

	private TeamLenderLoanLocalService _teamLenderLoanLocalService;
}