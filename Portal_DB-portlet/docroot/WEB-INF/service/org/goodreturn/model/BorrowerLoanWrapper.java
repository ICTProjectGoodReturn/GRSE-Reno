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

		attributes.put("abacus_Borrower_Loan_Id", getAbacus_Borrower_Loan_Id());
		attributes.put("borrower_Id", getBorrower_Id());
		attributes.put("abacus_mfi_Id", getAbacus_mfi_Id());
		attributes.put("changed_By", getChanged_By());
		attributes.put("changed_Time", getChanged_Time());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long abacus_Borrower_Loan_Id = (Long)attributes.get(
				"abacus_Borrower_Loan_Id");

		if (abacus_Borrower_Loan_Id != null) {
			setAbacus_Borrower_Loan_Id(abacus_Borrower_Loan_Id);
		}

		Long borrower_Id = (Long)attributes.get("borrower_Id");

		if (borrower_Id != null) {
			setBorrower_Id(borrower_Id);
		}

		Long abacus_mfi_Id = (Long)attributes.get("abacus_mfi_Id");

		if (abacus_mfi_Id != null) {
			setAbacus_mfi_Id(abacus_mfi_Id);
		}

		String changed_By = (String)attributes.get("changed_By");

		if (changed_By != null) {
			setChanged_By(changed_By);
		}

		String changed_Time = (String)attributes.get("changed_Time");

		if (changed_Time != null) {
			setChanged_Time(changed_Time);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
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
	* Returns the abacus_ borrower_ loan_ ID of this borrower loan.
	*
	* @return the abacus_ borrower_ loan_ ID of this borrower loan
	*/
	public long getAbacus_Borrower_Loan_Id() {
		return _borrowerLoan.getAbacus_Borrower_Loan_Id();
	}

	/**
	* Sets the abacus_ borrower_ loan_ ID of this borrower loan.
	*
	* @param abacus_Borrower_Loan_Id the abacus_ borrower_ loan_ ID of this borrower loan
	*/
	public void setAbacus_Borrower_Loan_Id(long abacus_Borrower_Loan_Id) {
		_borrowerLoan.setAbacus_Borrower_Loan_Id(abacus_Borrower_Loan_Id);
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

	/**
	* Returns the abacus_mfi_ ID of this borrower loan.
	*
	* @return the abacus_mfi_ ID of this borrower loan
	*/
	public long getAbacus_mfi_Id() {
		return _borrowerLoan.getAbacus_mfi_Id();
	}

	/**
	* Sets the abacus_mfi_ ID of this borrower loan.
	*
	* @param abacus_mfi_Id the abacus_mfi_ ID of this borrower loan
	*/
	public void setAbacus_mfi_Id(long abacus_mfi_Id) {
		_borrowerLoan.setAbacus_mfi_Id(abacus_mfi_Id);
	}

	/**
	* Returns the changed_ by of this borrower loan.
	*
	* @return the changed_ by of this borrower loan
	*/
	public java.lang.String getChanged_By() {
		return _borrowerLoan.getChanged_By();
	}

	/**
	* Sets the changed_ by of this borrower loan.
	*
	* @param changed_By the changed_ by of this borrower loan
	*/
	public void setChanged_By(java.lang.String changed_By) {
		_borrowerLoan.setChanged_By(changed_By);
	}

	/**
	* Returns the changed_ time of this borrower loan.
	*
	* @return the changed_ time of this borrower loan
	*/
	public java.lang.String getChanged_Time() {
		return _borrowerLoan.getChanged_Time();
	}

	/**
	* Sets the changed_ time of this borrower loan.
	*
	* @param changed_Time the changed_ time of this borrower loan
	*/
	public void setChanged_Time(java.lang.String changed_Time) {
		_borrowerLoan.setChanged_Time(changed_Time);
	}

	/**
	* Returns the group ID of this borrower loan.
	*
	* @return the group ID of this borrower loan
	*/
	public long getGroupId() {
		return _borrowerLoan.getGroupId();
	}

	/**
	* Sets the group ID of this borrower loan.
	*
	* @param groupId the group ID of this borrower loan
	*/
	public void setGroupId(long groupId) {
		_borrowerLoan.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this borrower loan.
	*
	* @return the company ID of this borrower loan
	*/
	public long getCompanyId() {
		return _borrowerLoan.getCompanyId();
	}

	/**
	* Sets the company ID of this borrower loan.
	*
	* @param companyId the company ID of this borrower loan
	*/
	public void setCompanyId(long companyId) {
		_borrowerLoan.setCompanyId(companyId);
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

	public int compareTo(org.goodreturn.model.BorrowerLoan borrowerLoan) {
		return _borrowerLoan.compareTo(borrowerLoan);
	}

	@Override
	public int hashCode() {
		return _borrowerLoan.hashCode();
	}

	public com.liferay.portal.model.CacheModel<org.goodreturn.model.BorrowerLoan> toCacheModel() {
		return _borrowerLoan.toCacheModel();
	}

	public org.goodreturn.model.BorrowerLoan toEscapedModel() {
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