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

package org.GoodReturn.model;

import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link TeamLenderLoan}.
 * </p>
 *
 * @author    gilaa004
 * @see       TeamLenderLoan
 * @generated
 */
public class TeamLenderLoanWrapper implements TeamLenderLoan,
	ModelWrapper<TeamLenderLoan> {
	public TeamLenderLoanWrapper(TeamLenderLoan teamLenderLoan) {
		_teamLenderLoan = teamLenderLoan;
	}

	public Class<?> getModelClass() {
		return TeamLenderLoan.class;
	}

	public String getModelClassName() {
		return TeamLenderLoan.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("account_Id", getAccount_Id());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long account_Id = (Long)attributes.get("account_Id");

		if (account_Id != null) {
			setAccount_Id(account_Id);
		}
	}

	/**
	* Returns the primary key of this team lender loan.
	*
	* @return the primary key of this team lender loan
	*/
	public long getPrimaryKey() {
		return _teamLenderLoan.getPrimaryKey();
	}

	/**
	* Sets the primary key of this team lender loan.
	*
	* @param primaryKey the primary key of this team lender loan
	*/
	public void setPrimaryKey(long primaryKey) {
		_teamLenderLoan.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the account_ ID of this team lender loan.
	*
	* @return the account_ ID of this team lender loan
	*/
	public long getAccount_Id() {
		return _teamLenderLoan.getAccount_Id();
	}

	/**
	* Sets the account_ ID of this team lender loan.
	*
	* @param account_Id the account_ ID of this team lender loan
	*/
	public void setAccount_Id(long account_Id) {
		_teamLenderLoan.setAccount_Id(account_Id);
	}

	public boolean isNew() {
		return _teamLenderLoan.isNew();
	}

	public void setNew(boolean n) {
		_teamLenderLoan.setNew(n);
	}

	public boolean isCachedModel() {
		return _teamLenderLoan.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_teamLenderLoan.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _teamLenderLoan.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _teamLenderLoan.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_teamLenderLoan.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _teamLenderLoan.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_teamLenderLoan.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TeamLenderLoanWrapper((TeamLenderLoan)_teamLenderLoan.clone());
	}

	public int compareTo(org.GoodReturn.model.TeamLenderLoan teamLenderLoan) {
		return _teamLenderLoan.compareTo(teamLenderLoan);
	}

	@Override
	public int hashCode() {
		return _teamLenderLoan.hashCode();
	}

	public com.liferay.portal.model.CacheModel<org.GoodReturn.model.TeamLenderLoan> toCacheModel() {
		return _teamLenderLoan.toCacheModel();
	}

	public org.GoodReturn.model.TeamLenderLoan toEscapedModel() {
		return new TeamLenderLoanWrapper(_teamLenderLoan.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _teamLenderLoan.toString();
	}

	public java.lang.String toXmlString() {
		return _teamLenderLoan.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_teamLenderLoan.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public TeamLenderLoan getWrappedTeamLenderLoan() {
		return _teamLenderLoan;
	}

	public TeamLenderLoan getWrappedModel() {
		return _teamLenderLoan;
	}

	public void resetOriginalValues() {
		_teamLenderLoan.resetOriginalValues();
	}

	private TeamLenderLoan _teamLenderLoan;
}