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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link org.goodreturn.service.http.TempBlServiceSoap}.
 *
 * @author    gilaa004
 * @see       org.goodreturn.service.http.TempBlServiceSoap
 * @generated
 */
public class TempBlSoap implements Serializable {
	public static TempBlSoap toSoapModel(TempBl model) {
		TempBlSoap soapModel = new TempBlSoap();

		soapModel.setBorrower_Name(model.getBorrower_Name());
		soapModel.setBorrower_Loan_Id(model.getBorrower_Loan_Id());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());

		return soapModel;
	}

	public static TempBlSoap[] toSoapModels(TempBl[] models) {
		TempBlSoap[] soapModels = new TempBlSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TempBlSoap[][] toSoapModels(TempBl[][] models) {
		TempBlSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TempBlSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TempBlSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TempBlSoap[] toSoapModels(List<TempBl> models) {
		List<TempBlSoap> soapModels = new ArrayList<TempBlSoap>(models.size());

		for (TempBl model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TempBlSoap[soapModels.size()]);
	}

	public TempBlSoap() {
	}

	public long getPrimaryKey() {
		return _borrower_Loan_Id;
	}

	public void setPrimaryKey(long pk) {
		setBorrower_Loan_Id(pk);
	}

	public String getBorrower_Name() {
		return _borrower_Name;
	}

	public void setBorrower_Name(String borrower_Name) {
		_borrower_Name = borrower_Name;
	}

	public long getBorrower_Loan_Id() {
		return _borrower_Loan_Id;
	}

	public void setBorrower_Loan_Id(long borrower_Loan_Id) {
		_borrower_Loan_Id = borrower_Loan_Id;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	private String _borrower_Name;
	private long _borrower_Loan_Id;
	private long _groupId;
	private long _companyId;
}