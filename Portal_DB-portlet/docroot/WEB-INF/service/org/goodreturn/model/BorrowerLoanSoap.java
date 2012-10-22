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
 * This class is used by SOAP remote services, specifically {@link org.goodreturn.service.http.BorrowerLoanServiceSoap}.
 *
 * @author    gilaa004
 * @see       org.goodreturn.service.http.BorrowerLoanServiceSoap
 * @generated
 */
public class BorrowerLoanSoap implements Serializable {
	public static BorrowerLoanSoap toSoapModel(BorrowerLoan model) {
		BorrowerLoanSoap soapModel = new BorrowerLoanSoap();

		soapModel.setAbacus_Borrower_Loan_Id(model.getAbacus_Borrower_Loan_Id());
		soapModel.setBorrower_Id(model.getBorrower_Id());
		soapModel.setAbacus_mfi_Id(model.getAbacus_mfi_Id());
		soapModel.setChanged_By(model.getChanged_By());
		soapModel.setChanged_Time(model.getChanged_Time());

		return soapModel;
	}

	public static BorrowerLoanSoap[] toSoapModels(BorrowerLoan[] models) {
		BorrowerLoanSoap[] soapModels = new BorrowerLoanSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static BorrowerLoanSoap[][] toSoapModels(BorrowerLoan[][] models) {
		BorrowerLoanSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new BorrowerLoanSoap[models.length][models[0].length];
		}
		else {
			soapModels = new BorrowerLoanSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static BorrowerLoanSoap[] toSoapModels(List<BorrowerLoan> models) {
		List<BorrowerLoanSoap> soapModels = new ArrayList<BorrowerLoanSoap>(models.size());

		for (BorrowerLoan model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new BorrowerLoanSoap[soapModels.size()]);
	}

	public BorrowerLoanSoap() {
	}

	public long getPrimaryKey() {
		return _abacus_Borrower_Loan_Id;
	}

	public void setPrimaryKey(long pk) {
		setAbacus_Borrower_Loan_Id(pk);
	}

	public long getAbacus_Borrower_Loan_Id() {
		return _abacus_Borrower_Loan_Id;
	}

	public void setAbacus_Borrower_Loan_Id(long abacus_Borrower_Loan_Id) {
		_abacus_Borrower_Loan_Id = abacus_Borrower_Loan_Id;
	}

	public long getBorrower_Id() {
		return _borrower_Id;
	}

	public void setBorrower_Id(long borrower_Id) {
		_borrower_Id = borrower_Id;
	}

	public long getAbacus_mfi_Id() {
		return _abacus_mfi_Id;
	}

	public void setAbacus_mfi_Id(long abacus_mfi_Id) {
		_abacus_mfi_Id = abacus_mfi_Id;
	}

	public String getChanged_By() {
		return _changed_By;
	}

	public void setChanged_By(String changed_By) {
		_changed_By = changed_By;
	}

	public String getChanged_Time() {
		return _changed_Time;
	}

	public void setChanged_Time(String changed_Time) {
		_changed_Time = changed_Time;
	}

	private long _abacus_Borrower_Loan_Id;
	private long _borrower_Id;
	private long _abacus_mfi_Id;
	private String _changed_By;
	private String _changed_Time;
}