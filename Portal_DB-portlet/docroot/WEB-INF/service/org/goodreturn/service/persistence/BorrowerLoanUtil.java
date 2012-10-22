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

import org.goodreturn.model.BorrowerLoan;

import java.util.List;

/**
 * The persistence utility for the borrower loan service. This utility wraps {@link BorrowerLoanPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author gilaa004
 * @see BorrowerLoanPersistence
 * @see BorrowerLoanPersistenceImpl
 * @generated
 */
public class BorrowerLoanUtil {
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
	public static void clearCache(BorrowerLoan borrowerLoan) {
		getPersistence().clearCache(borrowerLoan);
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
	public static List<BorrowerLoan> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<BorrowerLoan> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<BorrowerLoan> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static BorrowerLoan update(BorrowerLoan borrowerLoan, boolean merge)
		throws SystemException {
		return getPersistence().update(borrowerLoan, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static BorrowerLoan update(BorrowerLoan borrowerLoan, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(borrowerLoan, merge, serviceContext);
	}

	/**
	* Caches the borrower loan in the entity cache if it is enabled.
	*
	* @param borrowerLoan the borrower loan
	*/
	public static void cacheResult(
		org.goodreturn.model.BorrowerLoan borrowerLoan) {
		getPersistence().cacheResult(borrowerLoan);
	}

	/**
	* Caches the borrower loans in the entity cache if it is enabled.
	*
	* @param borrowerLoans the borrower loans
	*/
	public static void cacheResult(
		java.util.List<org.goodreturn.model.BorrowerLoan> borrowerLoans) {
		getPersistence().cacheResult(borrowerLoans);
	}

	/**
	* Creates a new borrower loan with the primary key. Does not add the borrower loan to the database.
	*
	* @param abacus_Borrower_Loan_Id the primary key for the new borrower loan
	* @return the new borrower loan
	*/
	public static org.goodreturn.model.BorrowerLoan create(
		long abacus_Borrower_Loan_Id) {
		return getPersistence().create(abacus_Borrower_Loan_Id);
	}

	/**
	* Removes the borrower loan with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param abacus_Borrower_Loan_Id the primary key of the borrower loan
	* @return the borrower loan that was removed
	* @throws org.goodreturn.NoSuchBorrowerLoanException if a borrower loan with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.goodreturn.model.BorrowerLoan remove(
		long abacus_Borrower_Loan_Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.goodreturn.NoSuchBorrowerLoanException {
		return getPersistence().remove(abacus_Borrower_Loan_Id);
	}

	public static org.goodreturn.model.BorrowerLoan updateImpl(
		org.goodreturn.model.BorrowerLoan borrowerLoan, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(borrowerLoan, merge);
	}

	/**
	* Returns the borrower loan with the primary key or throws a {@link org.goodreturn.NoSuchBorrowerLoanException} if it could not be found.
	*
	* @param abacus_Borrower_Loan_Id the primary key of the borrower loan
	* @return the borrower loan
	* @throws org.goodreturn.NoSuchBorrowerLoanException if a borrower loan with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.goodreturn.model.BorrowerLoan findByPrimaryKey(
		long abacus_Borrower_Loan_Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.goodreturn.NoSuchBorrowerLoanException {
		return getPersistence().findByPrimaryKey(abacus_Borrower_Loan_Id);
	}

	/**
	* Returns the borrower loan with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param abacus_Borrower_Loan_Id the primary key of the borrower loan
	* @return the borrower loan, or <code>null</code> if a borrower loan with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.goodreturn.model.BorrowerLoan fetchByPrimaryKey(
		long abacus_Borrower_Loan_Id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(abacus_Borrower_Loan_Id);
	}

	/**
	* Returns all the borrower loans where borrower_Id = &#63;.
	*
	* @param borrower_Id the borrower_ ID
	* @return the matching borrower loans
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.goodreturn.model.BorrowerLoan> findByb_Id(
		long borrower_Id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByb_Id(borrower_Id);
	}

	/**
	* Returns a range of all the borrower loans where borrower_Id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param borrower_Id the borrower_ ID
	* @param start the lower bound of the range of borrower loans
	* @param end the upper bound of the range of borrower loans (not inclusive)
	* @return the range of matching borrower loans
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.goodreturn.model.BorrowerLoan> findByb_Id(
		long borrower_Id, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByb_Id(borrower_Id, start, end);
	}

	/**
	* Returns an ordered range of all the borrower loans where borrower_Id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param borrower_Id the borrower_ ID
	* @param start the lower bound of the range of borrower loans
	* @param end the upper bound of the range of borrower loans (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching borrower loans
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.goodreturn.model.BorrowerLoan> findByb_Id(
		long borrower_Id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByb_Id(borrower_Id, start, end, orderByComparator);
	}

	/**
	* Returns the first borrower loan in the ordered set where borrower_Id = &#63;.
	*
	* @param borrower_Id the borrower_ ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching borrower loan
	* @throws org.goodreturn.NoSuchBorrowerLoanException if a matching borrower loan could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.goodreturn.model.BorrowerLoan findByb_Id_First(
		long borrower_Id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.goodreturn.NoSuchBorrowerLoanException {
		return getPersistence().findByb_Id_First(borrower_Id, orderByComparator);
	}

	/**
	* Returns the first borrower loan in the ordered set where borrower_Id = &#63;.
	*
	* @param borrower_Id the borrower_ ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching borrower loan, or <code>null</code> if a matching borrower loan could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.goodreturn.model.BorrowerLoan fetchByb_Id_First(
		long borrower_Id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByb_Id_First(borrower_Id, orderByComparator);
	}

	/**
	* Returns the last borrower loan in the ordered set where borrower_Id = &#63;.
	*
	* @param borrower_Id the borrower_ ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching borrower loan
	* @throws org.goodreturn.NoSuchBorrowerLoanException if a matching borrower loan could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.goodreturn.model.BorrowerLoan findByb_Id_Last(
		long borrower_Id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.goodreturn.NoSuchBorrowerLoanException {
		return getPersistence().findByb_Id_Last(borrower_Id, orderByComparator);
	}

	/**
	* Returns the last borrower loan in the ordered set where borrower_Id = &#63;.
	*
	* @param borrower_Id the borrower_ ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching borrower loan, or <code>null</code> if a matching borrower loan could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.goodreturn.model.BorrowerLoan fetchByb_Id_Last(
		long borrower_Id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByb_Id_Last(borrower_Id, orderByComparator);
	}

	/**
	* Returns the borrower loans before and after the current borrower loan in the ordered set where borrower_Id = &#63;.
	*
	* @param abacus_Borrower_Loan_Id the primary key of the current borrower loan
	* @param borrower_Id the borrower_ ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next borrower loan
	* @throws org.goodreturn.NoSuchBorrowerLoanException if a borrower loan with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.goodreturn.model.BorrowerLoan[] findByb_Id_PrevAndNext(
		long abacus_Borrower_Loan_Id, long borrower_Id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.goodreturn.NoSuchBorrowerLoanException {
		return getPersistence()
				   .findByb_Id_PrevAndNext(abacus_Borrower_Loan_Id,
			borrower_Id, orderByComparator);
	}

	/**
	* Returns all the borrower loans.
	*
	* @return the borrower loans
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.goodreturn.model.BorrowerLoan> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the borrower loans.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of borrower loans
	* @param end the upper bound of the range of borrower loans (not inclusive)
	* @return the range of borrower loans
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.goodreturn.model.BorrowerLoan> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the borrower loans.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of borrower loans
	* @param end the upper bound of the range of borrower loans (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of borrower loans
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.goodreturn.model.BorrowerLoan> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the borrower loans where borrower_Id = &#63; from the database.
	*
	* @param borrower_Id the borrower_ ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByb_Id(long borrower_Id)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByb_Id(borrower_Id);
	}

	/**
	* Removes all the borrower loans from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of borrower loans where borrower_Id = &#63;.
	*
	* @param borrower_Id the borrower_ ID
	* @return the number of matching borrower loans
	* @throws SystemException if a system exception occurred
	*/
	public static int countByb_Id(long borrower_Id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByb_Id(borrower_Id);
	}

	/**
	* Returns the number of borrower loans.
	*
	* @return the number of borrower loans
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	/**
	* Returns all the stories associated with the borrower loan.
	*
	* @param pk the primary key of the borrower loan
	* @return the stories associated with the borrower loan
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.goodreturn.model.Story> getStories(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getStories(pk);
	}

	/**
	* Returns a range of all the stories associated with the borrower loan.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the borrower loan
	* @param start the lower bound of the range of borrower loans
	* @param end the upper bound of the range of borrower loans (not inclusive)
	* @return the range of stories associated with the borrower loan
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.goodreturn.model.Story> getStories(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getStories(pk, start, end);
	}

	/**
	* Returns an ordered range of all the stories associated with the borrower loan.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the borrower loan
	* @param start the lower bound of the range of borrower loans
	* @param end the upper bound of the range of borrower loans (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of stories associated with the borrower loan
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.goodreturn.model.Story> getStories(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getStories(pk, start, end, orderByComparator);
	}

	/**
	* Returns the number of stories associated with the borrower loan.
	*
	* @param pk the primary key of the borrower loan
	* @return the number of stories associated with the borrower loan
	* @throws SystemException if a system exception occurred
	*/
	public static int getStoriesSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getStoriesSize(pk);
	}

	/**
	* Returns <code>true</code> if the story is associated with the borrower loan.
	*
	* @param pk the primary key of the borrower loan
	* @param storyPK the primary key of the story
	* @return <code>true</code> if the story is associated with the borrower loan; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsStory(long pk, long storyPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsStory(pk, storyPK);
	}

	/**
	* Returns <code>true</code> if the borrower loan has any stories associated with it.
	*
	* @param pk the primary key of the borrower loan to check for associations with stories
	* @return <code>true</code> if the borrower loan has any stories associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsStories(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsStories(pk);
	}

	public static BorrowerLoanPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (BorrowerLoanPersistence)PortletBeanLocatorUtil.locate(org.goodreturn.service.ClpSerializer.getServletContextName(),
					BorrowerLoanPersistence.class.getName());

			ReferenceRegistry.registerReference(BorrowerLoanUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(BorrowerLoanPersistence persistence) {
	}

	private static BorrowerLoanPersistence _persistence;
}