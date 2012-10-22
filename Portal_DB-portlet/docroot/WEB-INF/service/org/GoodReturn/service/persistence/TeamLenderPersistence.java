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

import com.liferay.portal.service.persistence.BasePersistence;

import org.goodreturn.model.TeamLender;

/**
 * The persistence interface for the team lender service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author gilaa004
 * @see TeamLenderPersistenceImpl
 * @see TeamLenderUtil
 * @generated
 */
public interface TeamLenderPersistence extends BasePersistence<TeamLender> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TeamLenderUtil} to access the team lender persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the team lender in the entity cache if it is enabled.
	*
	* @param teamLender the team lender
	*/
	public void cacheResult(org.goodreturn.model.TeamLender teamLender);

	/**
	* Caches the team lenders in the entity cache if it is enabled.
	*
	* @param teamLenders the team lenders
	*/
	public void cacheResult(
		java.util.List<org.goodreturn.model.TeamLender> teamLenders);

	/**
	* Creates a new team lender with the primary key. Does not add the team lender to the database.
	*
	* @param team_lender_Id the primary key for the new team lender
	* @return the new team lender
	*/
	public org.goodreturn.model.TeamLender create(long team_lender_Id);

	/**
	* Removes the team lender with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param team_lender_Id the primary key of the team lender
	* @return the team lender that was removed
	* @throws org.goodreturn.NoSuchTeamLenderException if a team lender with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.goodreturn.model.TeamLender remove(long team_lender_Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.goodreturn.NoSuchTeamLenderException;

	public org.goodreturn.model.TeamLender updateImpl(
		org.goodreturn.model.TeamLender teamLender, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the team lender with the primary key or throws a {@link org.goodreturn.NoSuchTeamLenderException} if it could not be found.
	*
	* @param team_lender_Id the primary key of the team lender
	* @return the team lender
	* @throws org.goodreturn.NoSuchTeamLenderException if a team lender with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.goodreturn.model.TeamLender findByPrimaryKey(long team_lender_Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.goodreturn.NoSuchTeamLenderException;

	/**
	* Returns the team lender with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param team_lender_Id the primary key of the team lender
	* @return the team lender, or <code>null</code> if a team lender with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.goodreturn.model.TeamLender fetchByPrimaryKey(
		long team_lender_Id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the team lenders.
	*
	* @return the team lenders
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.goodreturn.model.TeamLender> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.goodreturn.model.TeamLender> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the team lenders.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of team lenders
	* @param end the upper bound of the range of team lenders (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of team lenders
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.goodreturn.model.TeamLender> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the team lenders from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of team lenders.
	*
	* @return the number of team lenders
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}