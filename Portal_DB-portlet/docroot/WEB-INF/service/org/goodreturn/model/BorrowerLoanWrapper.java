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

package org.goodreturn.model;

import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link BorrowerLoan}.
 * </p>
 *
 * @author    gilaa004
 * @see       BorrowerLoan
 * @generated
 */
public class BorrowerLoanWrapper implements BorrowerLoan,
	ModelWrapper<BorrowerLoan> {
	public BorrowerLoanWrapper(BorrowerLoan borrowerLoan) {
		_borrowerLoan = borrowerLoan;
	}

	public Class<?> getModelClass() {
		return BorrowerLoan.class;
	}

	public String getModelClassName() {
		return BorrowerLoan.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("borrower_Loan_Id", getBorrower_Loan_Id());
		attributes.put("borrower_Id", getBorrower_Id());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long borrower_Loan_Id = (Long)attributes.get("borrower_Loan_Id");

		if (borrower_Loan_Id != null) {
			setBorrower_Loan_Id(borrower_Loan_Id);
		}

		Long borrower_Id = (Long)attributes.get("borrower_Id");

		if (borrower_Id != null) {
			setBorrower_Id(borrower_Id);
		}
	}

	/**
	* Returns the primary key of this borrower loan.
	*
	* @return the primary key of this borrower loan
	*/
	public long getPrimaryKey() {
		return _borrowerLoan.getPrimaryKey();
	}

	/**
	* Sets the primary key of this borrower loan.
	*
	* @param primaryKey the primary key of this borrower loan
	*/
	public void setPrimaryKey(long primaryKey) {
		_borrowerLoan.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the borrower_ loan_ ID of this borrower loan.
	*
	* @return the borrower_ loan_ ID of this borrower loan
	*/
	public long getBorrower_Loan_Id() {
		return _borrowerLoan.getBorrower_Loan_Id();
	}

	/**
	* Sets the borrower_ loan_ ID of this borrower loan.
	*
	* @param borrower_Loan_Id the borrower_ loan_ ID of this borrower loan
	*/
	public void setBorrower_Loan_Id(long borrower_Loan_Id) {
		_borrowerLoan.setBorrower_Loan_Id(borrower_Loan_Id);
	}

	/**
	* Returns the borrower_ ID of this borrower loan.
	*
	* @return the borrower_ ID of this borrower loan
	*/
	public long getBorrower_Id() {
		return _borrowerLoan.getBorrower_Id();
	}

	/**
	* Sets the borrower_ ID of this borrower loan.
	*
	* @param borrower_Id the borrower_ ID of this borrower loan
	*/
	public void setBorrower_Id(long borrower_Id) {
		_borrowerLoan.setBorrower_Id(borrower_Id);
	}

	public boolean isNew() {
		return _borrowerLoan.isNew();
	}

	public void setNew(boolean n) {
		_borrowerLoan.setNew(n);
	}

	public boolean isCachedModel() {
		return _borrowerLoan.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_borrowerLoan.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _borrowerLoan.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _borrowerLoan.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_borrowerLoan.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _borrowerLoan.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_borrowerLoan.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new BorrowerLoanWrapper((BorrowerLoan)_borrowerLoan.clone());
	}

	public int compareTo(BorrowerLoan borrowerLoan) {
		return _borrowerLoan.compareTo(borrowerLoan);
	}

	@Override
	public int hashCode() {
		return _borrowerLoan.hashCode();
	}

	public com.liferay.portal.model.CacheModel<BorrowerLoan> toCacheModel() {
		return _borrowerLoan.toCacheModel();
	}

	public BorrowerLoan toEscapedModel() {
		return new BorrowerLoanWrapper(_borrowerLoan.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _borrowerLoan.toString();
	}

	public java.lang.String toXmlString() {
		return _borrowerLoan.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_borrowerLoan.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public BorrowerLoan getWrappedBorrowerLoan() {
		return _borrowerLoan;
	}

	public BorrowerLoan getWrappedModel() {
		return _borrowerLoan;
	}

	public void resetOriginalValues() {
		_borrowerLoan.resetOriginalValues();
	}

	private BorrowerLoan _borrowerLoan;
}