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
 * This class is used by SOAP remote services, specifically {@link org.GoodReturn.service.http.LenderServiceSoap}.
 *
 * @author    gilaa004
 * @see       org.GoodReturn.service.http.LenderServiceSoap
 * @generated
 */
public class LenderSoap implements Serializable {
	public static LenderSoap toSoapModel(Lender model) {
		LenderSoap soapModel = new LenderSoap();

		soapModel.setLender_Id(model.getLender_Id());
		soapModel.setSalutation(model.getSalutation());
		soapModel.setEmployer_Name(model.getEmployer_Name());
		soapModel.setComment(model.getComment());
		soapModel.setHeard_Of_Us(model.getHeard_Of_Us());
		soapModel.setRegion(model.getRegion());
		soapModel.setDisplay_Name(model.getDisplay_Name());
		soapModel.setDate_Of_Birth(model.getDate_Of_Birth());
		soapModel.setReason_For_Lending(model.getReason_For_Lending());
		soapModel.setAbout_Themselves(model.getAbout_Themselves());
		soapModel.setAutomatic_Re_lend(model.getAutomatic_Re_lend());
		soapModel.setMonthly_Repayments(model.getMonthly_Repayments());
		soapModel.setIs_Public_Profile(model.getIs_Public_Profile());
		soapModel.setBank_Details(model.getBank_Details());
		soapModel.setRecieve_Emails(model.getRecieve_Emails());
		soapModel.setRecieve_GoodReturn_Info(model.getRecieve_GoodReturn_Info());
		soapModel.setIs_Anonymous(model.getIs_Anonymous());
		soapModel.setIs_Validated(model.getIs_Validated());
		soapModel.setCurrent_Balance(model.getCurrent_Balance());
		soapModel.setPaypal_Email(model.getPaypal_Email());
		soapModel.setPassword(model.getPassword());
		soapModel.setLast_Login_Date(model.getLast_Login_Date());
		soapModel.setFeatured_Lender(model.getFeatured_Lender());
		soapModel.setVoucher_Id(model.getVoucher_Id());
		soapModel.setIs_Loan_Donation(model.getIs_Loan_Donation());

		return soapModel;
	}

	public static LenderSoap[] toSoapModels(Lender[] models) {
		LenderSoap[] soapModels = new LenderSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static LenderSoap[][] toSoapModels(Lender[][] models) {
		LenderSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new LenderSoap[models.length][models[0].length];
		}
		else {
			soapModels = new LenderSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static LenderSoap[] toSoapModels(List<Lender> models) {
		List<LenderSoap> soapModels = new ArrayList<LenderSoap>(models.size());

		for (Lender model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new LenderSoap[soapModels.size()]);
	}

	public LenderSoap() {
	}

	public long getPrimaryKey() {
		return _lender_Id;
	}

	public void setPrimaryKey(long pk) {
		setLender_Id(pk);
	}

	public long getLender_Id() {
		return _lender_Id;
	}

	public void setLender_Id(long lender_Id) {
		_lender_Id = lender_Id;
	}

	public String getSalutation() {
		return _salutation;
	}

	public void setSalutation(String salutation) {
		_salutation = salutation;
	}

	public String getEmployer_Name() {
		return _employer_Name;
	}

	public void setEmployer_Name(String employer_Name) {
		_employer_Name = employer_Name;
	}

	public String getComment() {
		return _comment;
	}

	public void setComment(String comment) {
		_comment = comment;
	}

	public String getHeard_Of_Us() {
		return _heard_Of_Us;
	}

	public void setHeard_Of_Us(String heard_Of_Us) {
		_heard_Of_Us = heard_Of_Us;
	}

	public String getRegion() {
		return _region;
	}

	public void setRegion(String region) {
		_region = region;
	}

	public String getDisplay_Name() {
		return _display_Name;
	}

	public void setDisplay_Name(String display_Name) {
		_display_Name = display_Name;
	}

	public Date getDate_Of_Birth() {
		return _date_Of_Birth;
	}

	public void setDate_Of_Birth(Date date_Of_Birth) {
		_date_Of_Birth = date_Of_Birth;
	}

	public String getReason_For_Lending() {
		return _reason_For_Lending;
	}

	public void setReason_For_Lending(String reason_For_Lending) {
		_reason_For_Lending = reason_For_Lending;
	}

	public String getAbout_Themselves() {
		return _about_Themselves;
	}

	public void setAbout_Themselves(String about_Themselves) {
		_about_Themselves = about_Themselves;
	}

	public boolean getAutomatic_Re_lend() {
		return _automatic_Re_lend;
	}

	public boolean isAutomatic_Re_lend() {
		return _automatic_Re_lend;
	}

	public void setAutomatic_Re_lend(boolean automatic_Re_lend) {
		_automatic_Re_lend = automatic_Re_lend;
	}

	public double getMonthly_Repayments() {
		return _monthly_Repayments;
	}

	public void setMonthly_Repayments(double monthly_Repayments) {
		_monthly_Repayments = monthly_Repayments;
	}

	public boolean getIs_Public_Profile() {
		return _is_Public_Profile;
	}

	public boolean isIs_Public_Profile() {
		return _is_Public_Profile;
	}

	public void setIs_Public_Profile(boolean is_Public_Profile) {
		_is_Public_Profile = is_Public_Profile;
	}

	public String getBank_Details() {
		return _bank_Details;
	}

	public void setBank_Details(String bank_Details) {
		_bank_Details = bank_Details;
	}

	public boolean getRecieve_Emails() {
		return _recieve_Emails;
	}

	public boolean isRecieve_Emails() {
		return _recieve_Emails;
	}

	public void setRecieve_Emails(boolean recieve_Emails) {
		_recieve_Emails = recieve_Emails;
	}

	public boolean getRecieve_GoodReturn_Info() {
		return _recieve_GoodReturn_Info;
	}

	public boolean isRecieve_GoodReturn_Info() {
		return _recieve_GoodReturn_Info;
	}

	public void setRecieve_GoodReturn_Info(boolean recieve_GoodReturn_Info) {
		_recieve_GoodReturn_Info = recieve_GoodReturn_Info;
	}

	public boolean getIs_Anonymous() {
		return _is_Anonymous;
	}

	public boolean isIs_Anonymous() {
		return _is_Anonymous;
	}

	public void setIs_Anonymous(boolean is_Anonymous) {
		_is_Anonymous = is_Anonymous;
	}

	public boolean getIs_Validated() {
		return _is_Validated;
	}

	public boolean isIs_Validated() {
		return _is_Validated;
	}

	public void setIs_Validated(boolean is_Validated) {
		_is_Validated = is_Validated;
	}

	public double getCurrent_Balance() {
		return _current_Balance;
	}

	public void setCurrent_Balance(double current_Balance) {
		_current_Balance = current_Balance;
	}

	public String getPaypal_Email() {
		return _paypal_Email;
	}

	public void setPaypal_Email(String paypal_Email) {
		_paypal_Email = paypal_Email;
	}

	public String getPassword() {
		return _password;
	}

	public void setPassword(String password) {
		_password = password;
	}

	public Date getLast_Login_Date() {
		return _last_Login_Date;
	}

	public void setLast_Login_Date(Date last_Login_Date) {
		_last_Login_Date = last_Login_Date;
	}

	public String getFeatured_Lender() {
		return _featured_Lender;
	}

	public void setFeatured_Lender(String featured_Lender) {
		_featured_Lender = featured_Lender;
	}

	public long getVoucher_Id() {
		return _voucher_Id;
	}

	public void setVoucher_Id(long voucher_Id) {
		_voucher_Id = voucher_Id;
	}

	public boolean getIs_Loan_Donation() {
		return _is_Loan_Donation;
	}

	public boolean isIs_Loan_Donation() {
		return _is_Loan_Donation;
	}

	public void setIs_Loan_Donation(boolean is_Loan_Donation) {
		_is_Loan_Donation = is_Loan_Donation;
	}

	private long _lender_Id;
	private String _salutation;
	private String _employer_Name;
	private String _comment;
	private String _heard_Of_Us;
	private String _region;
	private String _display_Name;
	private Date _date_Of_Birth;
	private String _reason_For_Lending;
	private String _about_Themselves;
	private boolean _automatic_Re_lend;
	private double _monthly_Repayments;
	private boolean _is_Public_Profile;
	private String _bank_Details;
	private boolean _recieve_Emails;
	private boolean _recieve_GoodReturn_Info;
	private boolean _is_Anonymous;
	private boolean _is_Validated;
	private double _current_Balance;
	private String _paypal_Email;
	private String _password;
	private Date _last_Login_Date;
	private String _featured_Lender;
	private long _voucher_Id;
	private boolean _is_Loan_Donation;
}