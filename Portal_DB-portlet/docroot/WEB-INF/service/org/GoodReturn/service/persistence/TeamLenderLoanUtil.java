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

import org.goodreturn.model.TeamLenderLoan;

import java.util.List;

/**
 * The persistence utility for the team lender loan service. This utility wraps {@link TeamLenderLoanPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author gilaa004
 * @see TeamLenderLoanPersistence
 * @see TeamLenderLoanPersistenceImpl
 * @generated
 */
public class TeamLenderLoanUtil {
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
	public static void clearCache(TeamLenderLoan teamLenderLoan) {
		getPersistence().clearCache(teamLenderLoan);
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
	public static List<TeamLenderLoan> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TeamLenderLoan> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TeamLenderLoan> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static TeamLenderLoan update(TeamLenderLoan teamLenderLoan,
		boolean merge) throws SystemException {
		return getPersistence().update(teamLenderLoan, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static TeamLenderLoan update(TeamLenderLoan teamLenderLoan,
		boolean merge, ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(teamLenderLoan, merge, serviceContext);
	}

	/**
	* Caches the team lender loan in the entity cache if it is enabled.
	*
	* @param teamLenderLoan the team lender loan
	*/
	public static void cacheResult(
		org.goodreturn.model.TeamLenderLoan teamLenderLoan) {
		getPersistence().cacheResult(teamLenderLoan);
	}

	/**
	* Caches the team lender loans in the entity cache if it is enabled.
	*
	* @param teamLenderLoans the team lender loans
	*/
	public static void cacheResult(
		java.util.List<org.goodreturn.model.TeamLenderLoan> teamLenderLoans) {
		getPersistence().cacheResult(teamLenderLoans);
	}

	/**
	* Creates a new team lender loan with the primary key. Does not add the team lender loan to the database.
	*
	* @param account_Id the primary key for the new team lender loan
	* @return the new team lender loan
	*/
	public static org.goodreturn.model.TeamLenderLoan create(long account_Id) {
		return getPersistence().create(account_Id);
	}

	/**
	* Removes the team lender loan with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param account_Id the primary key of the team lender loan
	* @return the team lender loan that was removed
	* @throws org.goodreturn.NoSuchTeamLenderLoanException if a team lender loan with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.goodreturn.model.TeamLenderLoan remove(long account_Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.goodreturn.NoSuchTeamLenderLoanException {
		return getPersistence().remove(account_Id);
	}

	public static org.goodreturn.model.TeamLenderLoan updateImpl(
		org.goodreturn.model.TeamLenderLoan teamLenderLoan, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(teamLenderLoan, merge);
	}

	/**
	* Returns the team lender loan with the primary key or throws a {@link org.goodreturn.NoSuchTeamLenderLoanException} if it could not be found.
	*
	* @param account_Id the primary key of the team lender loan
	* @return the team lender loan
	* @throws org.goodreturn.NoSuchTeamLenderLoanException if a team lender loan with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.goodreturn.model.TeamLenderLoan findByPrimaryKey(
		long account_Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.goodreturn.NoSuchTeamLenderLoanException {
		return getPersistence().findByPrimaryKey(account_Id);
	}

	/**
	* Returns the team lender loan with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param account_Id the primary key of the team lender loan
	* @return the team lender loan, or <code>null</code> if a team lender loan with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.goodreturn.model.TeamLenderLoan fetchByPrimaryKey(
		long account_Id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(account_Id);
	}

	/**
	* Returns all the team lender loans.
	*
	* @return the team lender loans
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.goodreturn.model.TeamLenderLoan> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<org.goodreturn.model.TeamLenderLoan> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the team lender loans.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of team lender loans
	* @param end the upper bound of the range of team lender loans (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of team lender loans
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.goodreturn.model.TeamLenderLoan> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the team lender loans from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of team lender loans.
	*
	* @return the number of team lender loans
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static TeamLenderLoanPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (TeamLenderLoanPersistence)PortletBeanLocatorUtil.locate(org.goodreturn.service.ClpSerializer.getServletContextName(),
					TeamLenderLoanPersistence.class.getName());

			ReferenceRegistry.registerReference(TeamLenderLoanUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(TeamLenderLoanPersistence persistence) {
	}

	private static TeamLenderLoanPersistence _persistence;
}