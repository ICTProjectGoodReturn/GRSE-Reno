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

package org.GoodReturn.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import org.GoodReturn.model.Team;

/**
 * The persistence interface for the team service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author gilaa004
 * @see TeamPersistenceImpl
 * @see TeamUtil
 * @generated
 */
public interface TeamPersistence extends BasePersistence<Team> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TeamUtil} to access the team persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the team in the entity cache if it is enabled.
	*
	* @param team the team
	*/
	public void cacheResult(org.GoodReturn.model.Team team);

	/**
	* Caches the teams in the entity cache if it is enabled.
	*
	* @param teams the teams
	*/
	public void cacheResult(java.util.List<org.GoodReturn.model.Team> teams);

	/**
	* Creates a new team with the primary key. Does not add the team to the database.
	*
	* @param team_Id the primary key for the new team
	* @return the new team
	*/
	public org.GoodReturn.model.Team create(long team_Id);

	/**
	* Removes the team with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param team_Id the primary key of the team
	* @return the team that was removed
	* @throws org.GoodReturn.NoSuchTeamException if a team with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.GoodReturn.model.Team remove(long team_Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.GoodReturn.NoSuchTeamException;

	public org.GoodReturn.model.Team updateImpl(
		org.GoodReturn.model.Team team, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the team with the primary key or throws a {@link org.GoodReturn.NoSuchTeamException} if it could not be found.
	*
	* @param team_Id the primary key of the team
	* @return the team
	* @throws org.GoodReturn.NoSuchTeamException if a team with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.GoodReturn.model.Team findByPrimaryKey(long team_Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.GoodReturn.NoSuchTeamException;

	/**
	* Returns the team with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param team_Id the primary key of the team
	* @return the team, or <code>null</code> if a team with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.GoodReturn.model.Team fetchByPrimaryKey(long team_Id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the teams.
	*
	* @return the teams
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.GoodReturn.model.Team> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.GoodReturn.model.Team> findAll(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the teams.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of teams
	* @param end the upper bound of the range of teams (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of teams
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.GoodReturn.model.Team> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the teams from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of teams.
	*
	* @return the number of teams
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}