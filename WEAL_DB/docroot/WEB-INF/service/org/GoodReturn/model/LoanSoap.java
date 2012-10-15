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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link org.GoodReturn.service.http.LoanServiceSoap}.
 *
 * @author    gilaa004
 * @see       org.GoodReturn.service.http.LoanServiceSoap
 * @generated
 */
public class LoanSoap implements Serializable {
	public static LoanSoap toSoapModel(Loan model) {
		LoanSoap soapModel = new LoanSoap();

		soapModel.setLoan_Id(model.getLoan_Id());
		soapModel.setIs_Partially_Funded(model.getIs_Partially_Funded());
		soapModel.setAmount_Requested(model.getAmount_Requested());
		soapModel.setAmount_Fulfilled(model.getAmount_Fulfilled());
		soapModel.setExpiry_Date(model.getExpiry_Date());
		soapModel.setDate_Requisitioned(model.getDate_Requisitioned());
		soapModel.setDate_Of_Fulfillment(model.getDate_Of_Fulfillment());
		soapModel.setStart_Date(model.getStart_Date());
		soapModel.setEnd_Date(model.getEnd_Date());
		soapModel.setCompany_Id(model.getCompany_Id());
		soapModel.setGroup_Id(model.getGroup_Id());
		soapModel.setAmount_Monthly(model.getAmount_Monthly());
		soapModel.setAccount_Information(model.getAccount_Information());
		soapModel.setDay_Of_Withdrawal(model.getDay_Of_Withdrawal());
		soapModel.setFinal_Payment_Date(model.getFinal_Payment_Date());
		soapModel.setLoan_Reason(model.getLoan_Reason());
		soapModel.setLoan_Type(model.getLoan_Type());
		soapModel.setLoan_Time(model.getLoan_Time());
		soapModel.setFunding_Preferences(model.getFunding_Preferences());
		soapModel.setMaturity(model.getMaturity());
		soapModel.setRepayments(model.getRepayments());
		soapModel.setStatus(model.getStatus());
		soapModel.setPayment_Type(model.getPayment_Type());
		soapModel.setPayment_Receipt(model.getPayment_Receipt());

		return soapModel;
	}

	public static LoanSoap[] toSoapModels(Loan[] models) {
		LoanSoap[] soapModels = new LoanSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static LoanSoap[][] toSoapModels(Loan[][] models) {
		LoanSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new LoanSoap[models.length][models[0].length];
		}
		else {
			soapModels = new LoanSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static LoanSoap[] toSoapModels(List<Loan> models) {
		List<LoanSoap> soapModels = new ArrayList<LoanSoap>(models.size());

		for (Loan model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new LoanSoap[soapModels.size()]);
	}

	public LoanSoap() {
	}

	public long getPrimaryKey() {
		return _loan_Id;
	}

	public void setPrimaryKey(long pk) {
		setLoan_Id(pk);
	}

	public long getLoan_Id() {
		return _loan_Id;
	}

	public void setLoan_Id(long loan_Id) {
		_loan_Id = loan_Id;
	}

	public boolean getIs_Partially_Funded() {
		return _is_Partially_Funded;
	}

	public boolean isIs_Partially_Funded() {
		return _is_Partially_Funded;
	}

	public void setIs_Partially_Funded(boolean is_Partially_Funded) {
		_is_Partially_Funded = is_Partially_Funded;
	}

	public double getAmount_Requested() {
		return _amount_Requested;
	}

	public void setAmount_Requested(double amount_Requested) {
		_amount_Requested = amount_Requested;
	}

	public double getAmount_Fulfilled() {
		return _amount_Fulfilled;
	}

	public void setAmount_Fulfilled(double amount_Fulfilled) {
		_amount_Fulfilled = amount_Fulfilled;
	}

	public Date getExpiry_Date() {
		return _expiry_Date;
	}

	public void setExpiry_Date(Date expiry_Date) {
		_expiry_Date = expiry_Date;
	}

	public Date getDate_Requisitioned() {
		return _date_Requisitioned;
	}

	public void setDate_Requisitioned(Date date_Requisitioned) {
		_date_Requisitioned = date_Requisitioned;
	}

	public Date getDate_Of_Fulfillment() {
		return _date_Of_Fulfillment;
	}

	public void setDate_Of_Fulfillment(Date date_Of_Fulfillment) {
		_date_Of_Fulfillment = date_Of_Fulfillment;
	}

	public Date getStart_Date() {
		return _start_Date;
	}

	public void setStart_Date(Date start_Date) {
		_start_Date = start_Date;
	}

	public Date getEnd_Date() {
		return _end_Date;
	}

	public void setEnd_Date(Date end_Date) {
		_end_Date = end_Date;
	}

	public long getCompany_Id() {
		return _company_Id;
	}

	public void setCompany_Id(long company_Id) {
		_company_Id = company_Id;
	}

	public long getGroup_Id() {
		return _group_Id;
	}

	public void setGroup_Id(long group_Id) {
		_group_Id = group_Id;
	}

	public int getAmount_Monthly() {
		return _amount_Monthly;
	}

	public void setAmount_Monthly(int amount_Monthly) {
		_amount_Monthly = amount_Monthly;
	}

	public String getAccount_Information() {
		return _account_Information;
	}

	public void setAccount_Information(String account_Information) {
		_account_Information = account_Information;
	}

	public int getDay_Of_Withdrawal() {
		return _day_Of_Withdrawal;
	}

	public void setDay_Of_Withdrawal(int day_Of_Withdrawal) {
		_day_Of_Withdrawal = day_Of_Withdrawal;
	}

	public Date getFinal_Payment_Date() {
		return _final_Payment_Date;
	}

	public void setFinal_Payment_Date(Date final_Payment_Date) {
		_final_Payment_Date = final_Payment_Date;
	}

	public String getLoan_Reason() {
		return _loan_Reason;
	}

	public void setLoan_Reason(String loan_Reason) {
		_loan_Reason = loan_Reason;
	}

	public String getLoan_Type() {
		return _loan_Type;
	}

	public void setLoan_Type(String loan_Type) {
		_loan_Type = loan_Type;
	}

	public String getLoan_Time() {
		return _loan_Time;
	}

	public void setLoan_Time(String loan_Time) {
		_loan_Time = loan_Time;
	}

	public String getFunding_Preferences() {
		return _funding_Preferences;
	}

	public void setFunding_Preferences(String funding_Preferences) {
		_funding_Preferences = funding_Preferences;
	}

	public String getMaturity() {
		return _maturity;
	}

	public void setMaturity(String maturity) {
		_maturity = maturity;
	}

	public double getRepayments() {
		return _repayments;
	}

	public void setRepayments(double repayments) {
		_repayments = repayments;
	}

	public String getStatus() {
		return _status;
	}

	public void setStatus(String status) {
		_status = status;
	}

	public String getPayment_Type() {
		return _payment_Type;
	}

	public void setPayment_Type(String payment_Type) {
		_payment_Type = payment_Type;
	}

	public String getPayment_Receipt() {
		return _payment_Receipt;
	}

	public void setPayment_Receipt(String payment_Receipt) {
		_payment_Receipt = payment_Receipt;
	}

	private long _loan_Id;
	private boolean _is_Partially_Funded;
	private double _amount_Requested;
	private double _amount_Fulfilled;
	private Date _expiry_Date;
	private Date _date_Requisitioned;
	private Date _date_Of_Fulfillment;
	private Date _start_Date;
	private Date _end_Date;
	private long _company_Id;
	private long _group_Id;
	private int _amount_Monthly;
	private String _account_Information;
	private int _day_Of_Withdrawal;
	private Date _final_Payment_Date;
	private String _loan_Reason;
	private String _loan_Type;
	private String _loan_Time;
	private String _funding_Preferences;
	private String _maturity;
	private double _repayments;
	private String _status;
	private String _payment_Type;
	private String _payment_Receipt;
}