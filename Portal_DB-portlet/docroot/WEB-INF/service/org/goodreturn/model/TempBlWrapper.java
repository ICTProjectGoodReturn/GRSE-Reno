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
 * This class is a wrapper for {@link TempBl}.
 * </p>
 *
 * @author    gilaa004
 * @see       TempBl
 * @generated
 */
public class TempBlWrapper implements TempBl, ModelWrapper<TempBl> {
	public TempBlWrapper(TempBl tempBl) {
		_tempBl = tempBl;
	}

	public Class<?> getModelClass() {
		return TempBl.class;
	}

	public String getModelClassName() {
		return TempBl.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("borrower_Name", getBorrower_Name());
		attributes.put("borrower_Loan_Id", getBorrower_Loan_Id());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		String borrower_Name = (String)attributes.get("borrower_Name");

		if (borrower_Name != null) {
			setBorrower_Name(borrower_Name);
		}

		Long borrower_Loan_Id = (Long)attributes.get("borrower_Loan_Id");

		if (borrower_Loan_Id != null) {
			setBorrower_Loan_Id(borrower_Loan_Id);
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
	* Returns the primary key of this temp bl.
	*
	* @return the primary key of this temp bl
	*/
	public org.goodreturn.service.persistence.TempBlPK getPrimaryKey() {
		return _tempBl.getPrimaryKey();
	}

	/**
	* Sets the primary key of this temp bl.
	*
	* @param primaryKey the primary key of this temp bl
	*/
	public void setPrimaryKey(
		org.goodreturn.service.persistence.TempBlPK primaryKey) {
		_tempBl.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the borrower_ name of this temp bl.
	*
	* @return the borrower_ name of this temp bl
	*/
	public java.lang.String getBorrower_Name() {
		return _tempBl.getBorrower_Name();
	}

	/**
	* Sets the borrower_ name of this temp bl.
	*
	* @param borrower_Name the borrower_ name of this temp bl
	*/
	public void setBorrower_Name(java.lang.String borrower_Name) {
		_tempBl.setBorrower_Name(borrower_Name);
	}

	/**
	* Returns the borrower_ loan_ ID of this temp bl.
	*
	* @return the borrower_ loan_ ID of this temp bl
	*/
	public long getBorrower_Loan_Id() {
		return _tempBl.getBorrower_Loan_Id();
	}

	/**
	* Sets the borrower_ loan_ ID of this temp bl.
	*
	* @param borrower_Loan_Id the borrower_ loan_ ID of this temp bl
	*/
	public void setBorrower_Loan_Id(long borrower_Loan_Id) {
		_tempBl.setBorrower_Loan_Id(borrower_Loan_Id);
	}

	/**
	* Returns the group ID of this temp bl.
	*
	* @return the group ID of this temp bl
	*/
	public long getGroupId() {
		return _tempBl.getGroupId();
	}

	/**
	* Sets the group ID of this temp bl.
	*
	* @param groupId the group ID of this temp bl
	*/
	public void setGroupId(long groupId) {
		_tempBl.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this temp bl.
	*
	* @return the company ID of this temp bl
	*/
	public long getCompanyId() {
		return _tempBl.getCompanyId();
	}

	/**
	* Sets the company ID of this temp bl.
	*
	* @param companyId the company ID of this temp bl
	*/
	public void setCompanyId(long companyId) {
		_tempBl.setCompanyId(companyId);
	}

	public boolean isNew() {
		return _tempBl.isNew();
	}

	public void setNew(boolean n) {
		_tempBl.setNew(n);
	}

	public boolean isCachedModel() {
		return _tempBl.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_tempBl.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _tempBl.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _tempBl.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_tempBl.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _tempBl.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_tempBl.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TempBlWrapper((TempBl)_tempBl.clone());
	}

	public int compareTo(org.goodreturn.model.TempBl tempBl) {
		return _tempBl.compareTo(tempBl);
	}

	@Override
	public int hashCode() {
		return _tempBl.hashCode();
	}

	public com.liferay.portal.model.CacheModel<org.goodreturn.model.TempBl> toCacheModel() {
		return _tempBl.toCacheModel();
	}

	public org.goodreturn.model.TempBl toEscapedModel() {
		return new TempBlWrapper(_tempBl.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _tempBl.toString();
	}

	public java.lang.String toXmlString() {
		return _tempBl.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_tempBl.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public TempBl getWrappedTempBl() {
		return _tempBl;
	}

	public TempBl getWrappedModel() {
		return _tempBl;
	}

	public void resetOriginalValues() {
		_tempBl.resetOriginalValues();
	}

	private TempBl _tempBl;
}