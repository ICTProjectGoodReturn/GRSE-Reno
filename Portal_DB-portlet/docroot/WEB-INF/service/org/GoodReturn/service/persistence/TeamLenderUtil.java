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

import org.goodreturn.model.TeamLender;

import java.util.List;

/**
 * The persistence utility for the team lender service. This utility wraps {@link TeamLenderPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author gilaa004
 * @see TeamLenderPersistence
 * @see TeamLenderPersistenceImpl
 * @generated
 */
public class TeamLenderUtil {
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
	public static void clearCache(TeamLender teamLender) {
		getPersistence().clearCache(teamLender);
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
	public static List<TeamLender> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TeamLender> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TeamLender> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static TeamLender update(TeamLender teamLender, boolean merge)
		throws SystemException {
		return getPersistence().update(teamLender, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static TeamLender update(TeamLender teamLender, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(teamLender, merge, serviceContext);
	}

	/**
	* Caches the team lender in the entity cache if it is enabled.
	*
	* @param teamLender the team lender
	*/
	public static void cacheResult(org.goodreturn.model.TeamLender teamLender) {
		getPersistence().cacheResult(teamLender);
	}

	/**
	* Caches the team lenders in the entity cache if it is enabled.
	*
	* @param teamLenders the team lenders
	*/
	public static void cacheResult(
		java.util.List<org.goodreturn.model.TeamLender> teamLenders) {
		getPersistence().cacheResult(teamLenders);
	}

	/**
	* Creates a new team lender with the primary key. Does not add the team lender to the database.
	*
	* @param teamlender_Id the primary key for the new team lender
	* @return the new team lender
	*/
	public static org.goodreturn.model.TeamLender create(long teamlender_Id) {
		return getPersistence().create(teamlender_Id);
	}

	/**
	* Removes the team lender with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param teamlender_Id the primary key of the team lender
	* @return the team lender that was removed
	* @throws org.goodreturn.NoSuchTeamLenderException if a team lender with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.goodreturn.model.TeamLender remove(long teamlender_Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.goodreturn.NoSuchTeamLenderException {
		return getPersistence().remove(teamlender_Id);
	}

	public static org.goodreturn.model.TeamLender updateImpl(
		org.goodreturn.model.TeamLender teamLender, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(teamLender, merge);
	}

	/**
	* Returns the team lender with the primary key or throws a {@link org.goodreturn.NoSuchTeamLenderException} if it could not be found.
	*
	* @param teamlender_Id the primary key of the team lender
	* @return the team lender
	* @throws org.goodreturn.NoSuchTeamLenderException if a team lender with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.goodreturn.model.TeamLender findByPrimaryKey(
		long teamlender_Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.goodreturn.NoSuchTeamLenderException {
		return getPersistence().findByPrimaryKey(teamlender_Id);
	}

	/**
	* Returns the team lender with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param teamlender_Id the primary key of the team lender
	* @return the team lender, or <code>null</code> if a team lender with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.goodreturn.model.TeamLender fetchByPrimaryKey(
		long teamlender_Id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(teamlender_Id);
	}

	/**
	* Returns all the team lenders.
	*
	* @return the team lenders
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.goodreturn.model.TeamLender> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<org.goodreturn.model.TeamLender> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<org.goodreturn.model.TeamLender> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the team lenders from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of team lenders.
	*
	* @return the number of team lenders
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static TeamLenderPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (TeamLenderPersistence)PortletBeanLocatorUtil.locate(org.goodreturn.service.ClpSerializer.getServletContextName(),
					TeamLenderPersistence.class.getName());

			ReferenceRegistry.registerReference(TeamLenderUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(TeamLenderPersistence persistence) {
	}

	private static TeamLenderPersistence _persistence;
}