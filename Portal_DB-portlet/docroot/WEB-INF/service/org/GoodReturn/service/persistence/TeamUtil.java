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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import org.goodreturn.model.Team;

import java.util.List;

/**
 * The persistence utility for the team service. This utility wraps {@link TeamPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author gilaa004
 * @see TeamPersistence
 * @see TeamPersistenceImpl
 * @generated
 */
public class TeamUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(Team team) {
		getPersistence().clearCache(team);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Team> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Team> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Team> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static Team update(Team team, boolean merge)
		throws SystemException {
		return getPersistence().update(team, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static Team update(Team team, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(team, merge, serviceContext);
	}

	/**
	* Caches the team in the entity cache if it is enabled.
	*
	* @param team the team
	*/
	public static void cacheResult(org.goodreturn.model.Team team) {
		getPersistence().cacheResult(team);
	}

	/**
	* Caches the teams in the entity cache if it is enabled.
	*
	* @param teams the teams
	*/
	public static void cacheResult(
		java.util.List<org.goodreturn.model.Team> teams) {
		getPersistence().cacheResult(teams);
	}

	/**
	* Creates a new team with the primary key. Does not add the team to the database.
	*
	* @param team_Id the primary key for the new team
	* @return the new team
	*/
	public static org.goodreturn.model.Team create(long team_Id) {
		return getPersistence().create(team_Id);
	}

	/**
	* Removes the team with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param team_Id the primary key of the team
	* @return the team that was removed
	* @throws org.goodreturn.NoSuchTeamException if a team with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.goodreturn.model.Team remove(long team_Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.goodreturn.NoSuchTeamException {
		return getPersistence().remove(team_Id);
	}

	public static org.goodreturn.model.Team updateImpl(
		org.goodreturn.model.Team team, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(team, merge);
	}

	/**
	* Returns the team with the primary key or throws a {@link org.goodreturn.NoSuchTeamException} if it could not be found.
	*
	* @param team_Id the primary key of the team
	* @return the team
	* @throws org.goodreturn.NoSuchTeamException if a team with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.goodreturn.model.Team findByPrimaryKey(long team_Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.goodreturn.NoSuchTeamException {
		return getPersistence().findByPrimaryKey(team_Id);
	}

	/**
	* Returns the team with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param team_Id the primary key of the team
	* @return the team, or <code>null</code> if a team with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.goodreturn.model.Team fetchByPrimaryKey(long team_Id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(team_Id);
	}

	/**
	* Returns all the teams.
	*
	* @return the teams
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.goodreturn.model.Team> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<org.goodreturn.model.Team> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<org.goodreturn.model.Team> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the teams from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of teams.
	*
	* @return the number of teams
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	/**
	* Returns all the team lenders associated with the team.
	*
	* @param pk the primary key of the team
	* @return the team lenders associated with the team
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.goodreturn.model.TeamLender> getTeamLenders(
		long pk) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getTeamLenders(pk);
	}

	/**
	* Returns a range of all the team lenders associated with the team.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the team
	* @param start the lower bound of the range of teams
	* @param end the upper bound of the range of teams (not inclusive)
	* @return the range of team lenders associated with the team
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.goodreturn.model.TeamLender> getTeamLenders(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getTeamLenders(pk, start, end);
	}

	/**
	* Returns an ordered range of all the team lenders associated with the team.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the team
	* @param start the lower bound of the range of teams
	* @param end the upper bound of the range of teams (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of team lenders associated with the team
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.goodreturn.model.TeamLender> getTeamLenders(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getTeamLenders(pk, start, end, orderByComparator);
	}

	/**
	* Returns the number of team lenders associated with the team.
	*
	* @param pk the primary key of the team
	* @return the number of team lenders associated with the team
	* @throws SystemException if a system exception occurred
	*/
	public static int getTeamLendersSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getTeamLendersSize(pk);
	}

	/**
	* Returns <code>true</code> if the team lender is associated with the team.
	*
	* @param pk the primary key of the team
	* @param teamLenderPK the primary key of the team lender
	* @return <code>true</code> if the team lender is associated with the team; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsTeamLender(long pk, long teamLenderPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsTeamLender(pk, teamLenderPK);
	}

	/**
	* Returns <code>true</code> if the team has any team lenders associated with it.
	*
	* @param pk the primary key of the team to check for associations with team lenders
	* @return <code>true</code> if the team has any team lenders associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsTeamLenders(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsTeamLenders(pk);
	}

	public static TeamPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (TeamPersistence)PortletBeanLocatorUtil.locate(org.goodreturn.service.ClpSerializer.getServletContextName(),
					TeamPersistence.class.getName());

			ReferenceRegistry.registerReference(TeamUtil.class, "_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(TeamPersistence persistence) {
	}

	private static TeamPersistence _persistence;
}