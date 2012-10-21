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
 * The base model interface for the BorrowerLoan service. Represents a row in the &quot;GoodReturn_BorrowerLoan&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link org.goodreturn.model.impl.BorrowerLoanModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link org.goodreturn.model.impl.BorrowerLoanImpl}.
 * </p>
 *
 * @author gilaa004
 * @see BorrowerLoan
 * @see org.goodreturn.model.impl.BorrowerLoanImpl
 * @see org.goodreturn.model.impl.BorrowerLoanModelImpl
 * @generated
 */
public interface BorrowerLoanModel extends BaseModel<BorrowerLoan> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a borrower loan model instance should use the {@link BorrowerLoan} interface instead.
	 */

	/**
	 * Returns the primary key of this borrower loan.
	 *
	 * @return the primary key of this borrower loan
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this borrower loan.
	 *
	 * @param primaryKey the primary key of this borrower loan
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the borrower_ loan_ ID of this borrower loan.
	 *
	 * @return the borrower_ loan_ ID of this borrower loan
	 */
	public long getBorrower_Loan_Id();

	/**
	 * Sets the borrower_ loan_ ID of this borrower loan.
	 *
	 * @param borrower_Loan_Id the borrower_ loan_ ID of this borrower loan
	 */
	public void setBorrower_Loan_Id(long borrower_Loan_Id);

	/**
	 * Returns the borrower_ ID of this borrower loan.
	 *
	 * @return the borrower_ ID of this borrower loan
	 */
	public long getBorrower_Id();

	/**
	 * Sets the borrower_ ID of this borrower loan.
	 *
	 * @param borrower_Id the borrower_ ID of this borrower loan
	 */
	public void setBorrower_Id(long borrower_Id);

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

	public int compareTo(BorrowerLoan borrowerLoan);

	public int hashCode();

	public CacheModel<BorrowerLoan> toCacheModel();

	public BorrowerLoan toEscapedModel();

	public String toString();

	public String toXmlString();
}