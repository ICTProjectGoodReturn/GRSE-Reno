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

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link LoanLocalService}.
 * </p>
 *
 * @author    gilaa004
 * @see       LoanLocalService
 * @generated
 */
public class LoanLocalServiceWrapper implements LoanLocalService,
	ServiceWrapper<LoanLocalService> {
	public LoanLocalServiceWrapper(LoanLocalService loanLocalService) {
		_loanLocalService = loanLocalService;
	}

	/**
	* Adds the loan to the database. Also notifies the appropriate model listeners.
	*
	* @param loan the loan
	* @return the loan that was added
	* @throws SystemException if a system exception occurred
	*/
	public org.GoodReturn.model.Loan addLoan(org.GoodReturn.model.Loan loan)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _loanLocalService.addLoan(loan);
	}

	/**
	* Creates a new loan with the primary key. Does not add the loan to the database.
	*
	* @param loan_Id the primary key for the new loan
	* @return the new loan
	*/
	public org.GoodReturn.model.Loan createLoan(long loan_Id) {
		return _loanLocalService.createLoan(loan_Id);
	}

	/**
	* Deletes the loan with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param loan_Id the primary key of the loan
	* @return the loan that was removed
	* @throws PortalException if a loan with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.GoodReturn.model.Loan deleteLoan(long loan_Id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _loanLocalService.deleteLoan(loan_Id);
	}

	/**
	* Deletes the loan from the database. Also notifies the appropriate model listeners.
	*
	* @param loan the loan
	* @return the loan that was removed
	* @throws SystemException if a system exception occurred
	*/
	public org.GoodReturn.model.Loan deleteLoan(org.GoodReturn.model.Loan loan)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _loanLocalService.deleteLoan(loan);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _loanLocalService.dynamicQuery();
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
		return _loanLocalService.dynamicQuery(dynamicQuery);
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
		return _loanLocalService.dynamicQuery(dynamicQuery, start, end);
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
		return _loanLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _loanLocalService.dynamicQueryCount(dynamicQuery);
	}

	public org.GoodReturn.model.Loan fetchLoan(long loan_Id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _loanLocalService.fetchLoan(loan_Id);
	}

	/**
	* Returns the loan with the primary key.
	*
	* @param loan_Id the primary key of the loan
	* @return the loan
	* @throws PortalException if a loan with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.GoodReturn.model.Loan getLoan(long loan_Id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _loanLocalService.getLoan(loan_Id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _loanLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the loans.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of loans
	* @param end the upper bound of the range of loans (not inclusive)
	* @return the range of loans
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.GoodReturn.model.Loan> getLoans(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _loanLocalService.getLoans(start, end);
	}

	/**
	* Returns the number of loans.
	*
	* @return the number of loans
	* @throws SystemException if a system exception occurred
	*/
	public int getLoansCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _loanLocalService.getLoansCount();
	}

	/**
	* Updates the loan in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param loan the loan
	* @return the loan that was updated
	* @throws SystemException if a system exception occurred
	*/
	public org.GoodReturn.model.Loan updateLoan(org.GoodReturn.model.Loan loan)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _loanLocalService.updateLoan(loan);
	}

	/**
	* Updates the loan in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param loan the loan
	* @param merge whether to merge the loan with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the loan that was updated
	* @throws SystemException if a system exception occurred
	*/
	public org.GoodReturn.model.Loan updateLoan(
		org.GoodReturn.model.Loan loan, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _loanLocalService.updateLoan(loan, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _loanLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_loanLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _loanLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public LoanLocalService getWrappedLoanLocalService() {
		return _loanLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedLoanLocalService(LoanLocalService loanLocalService) {
		_loanLocalService = loanLocalService;
	}

	public LoanLocalService getWrappedService() {
		return _loanLocalService;
	}

	public void setWrappedService(LoanLocalService loanLocalService) {
		_loanLocalService = loanLocalService;
	}

	private LoanLocalService _loanLocalService;
}