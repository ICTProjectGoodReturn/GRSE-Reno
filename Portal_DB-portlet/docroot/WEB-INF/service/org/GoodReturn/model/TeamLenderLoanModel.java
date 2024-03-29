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

import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the TeamLenderLoan service. Represents a row in the &quot;GoodReturn_TeamLenderLoan&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link org.goodreturn.model.impl.TeamLenderLoanModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link org.goodreturn.model.impl.TeamLenderLoanImpl}.
 * </p>
 *
 * @author gilaa004
 * @see TeamLenderLoan
 * @see org.goodreturn.model.impl.TeamLenderLoanImpl
 * @see org.goodreturn.model.impl.TeamLenderLoanModelImpl
 * @generated
 */
public interface TeamLenderLoanModel extends BaseModel<TeamLenderLoan> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a team lender loan model instance should use the {@link TeamLenderLoan} interface instead.
	 */

	/**
	 * Returns the primary key of this team lender loan.
	 *
	 * @return the primary key of this team lender loan
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this team lender loan.
	 *
	 * @param primaryKey the primary key of this team lender loan
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the account_ ID of this team lender loan.
	 *
	 * @return the account_ ID of this team lender loan
	 */
	public long getAccount_Id();

	/**
	 * Sets the account_ ID of this team lender loan.
	 *
	 * @param account_Id the account_ ID of this team lender loan
	 */
	public void setAccount_Id(long account_Id);

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public Serializable getPrimaryKeyObj();

	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(TeamLenderLoan teamLenderLoan);

	public int hashCode();

	public CacheModel<TeamLenderLoan> toCacheModel();

	public TeamLenderLoan toEscapedModel();

	public String toString();

	public String toXmlString();
}