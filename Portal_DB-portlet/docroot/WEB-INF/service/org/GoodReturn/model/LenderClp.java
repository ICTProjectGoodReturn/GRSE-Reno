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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import org.goodreturn.service.LenderLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author gilaa004
 */
public class LenderClp extends BaseModelImpl<Lender> implements Lender {
	public LenderClp() {
	}

	public Class<?> getModelClass() {
		return Lender.class;
	}

	public String getModelClassName() {
		return Lender.class.getName();
	}

	public long getPrimaryKey() {
		return _lender_Id;
	}

	public void setPrimaryKey(long primaryKey) {
		setLender_Id(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_lender_Id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("lender_Id", getLender_Id());
		attributes.put("salutation", getSalutation());
		attributes.put("employer_Name", getEmployer_Name());
		attributes.put("comment", getComment());
		attributes.put("heard_Of_Us", getHeard_Of_Us());
		attributes.put("region", getRegion());
		attributes.put("display_Name", getDisplay_Name());
		attributes.put("date_Of_Birth", getDate_Of_Birth());
		attributes.put("reason_For_Lending", getReason_For_Lending());
		attributes.put("about_Themselves", getAbout_Themselves());
		attributes.put("automatic_Re_lend", getAutomatic_Re_lend());
		attributes.put("monthly_Repayments", getMonthly_Repayments());
		attributes.put("is_Public_Profile", getIs_Public_Profile());
		attributes.put("bank_Details", getBank_Details());
		attributes.put("recieve_Emails", getRecieve_Emails());
		attributes.put("recieve_GoodReturn_Info", getRecieve_GoodReturn_Info());
		attributes.put("is_Anonymous", getIs_Anonymous());
		attributes.put("is_Validated", getIs_Validated());
		attributes.put("current_Balance", getCurrent_Balance());
		attributes.put("paypal_Email", getPaypal_Email());
		attributes.put("password", getPassword());
		attributes.put("last_Login_Date", getLast_Login_Date());
		attributes.put("featured_Lender", getFeatured_Lender());
		attributes.put("voucher_Id", getVoucher_Id());
		attributes.put("is_Loan_Donation", getIs_Loan_Donation());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long lender_Id = (Long)attributes.get("lender_Id");

		if (lender_Id != null) {
			setLender_Id(lender_Id);
		}

		String salutation = (String)attributes.get("salutation");

		if (salutation != null) {
			setSalutation(salutation);
		}

		String employer_Name = (String)attributes.get("employer_Name");

		if (employer_Name != null) {
			setEmployer_Name(employer_Name);
		}

		String comment = (String)attributes.get("comment");

		if (comment != null) {
			setComment(comment);
		}

		String heard_Of_Us = (String)attributes.get("heard_Of_Us");

		if (heard_Of_Us != null) {
			setHeard_Of_Us(heard_Of_Us);
		}

		String region = (String)attributes.get("region");

		if (region != null) {
			setRegion(region);
		}

		String display_Name = (String)attributes.get("display_Name");

		if (display_Name != null) {
			setDisplay_Name(display_Name);
		}

		Date date_Of_Birth = (Date)attributes.get("date_Of_Birth");

		if (date_Of_Birth != null) {
			setDate_Of_Birth(date_Of_Birth);
		}

		String reason_For_Lending = (String)attributes.get("reason_For_Lending");

		if (reason_For_Lending != null) {
			setReason_For_Lending(reason_For_Lending);
		}

		String about_Themselves = (String)attributes.get("about_Themselves");

		if (about_Themselves != null) {
			setAbout_Themselves(about_Themselves);
		}

		Boolean automatic_Re_lend = (Boolean)attributes.get("automatic_Re_lend");

		if (automatic_Re_lend != null) {
			setAutomatic_Re_lend(automatic_Re_lend);
		}

		Double monthly_Repayments = (Double)attributes.get("monthly_Repayments");

		if (monthly_Repayments != null) {
			setMonthly_Repayments(monthly_Repayments);
		}

		Boolean is_Public_Profile = (Boolean)attributes.get("is_Public_Profile");

		if (is_Public_Profile != null) {
			setIs_Public_Profile(is_Public_Profile);
		}

		String bank_Details = (String)attributes.get("bank_Details");

		if (bank_Details != null) {
			setBank_Details(bank_Details);
		}

		Boolean recieve_Emails = (Boolean)attributes.get("recieve_Emails");

		if (recieve_Emails != null) {
			setRecieve_Emails(recieve_Emails);
		}

		Boolean recieve_GoodReturn_Info = (Boolean)attributes.get(
				"recieve_GoodReturn_Info");

		if (recieve_GoodReturn_Info != null) {
			setRecieve_GoodReturn_Info(recieve_GoodReturn_Info);
		}

		Boolean is_Anonymous = (Boolean)attributes.get("is_Anonymous");

		if (is_Anonymous != null) {
			setIs_Anonymous(is_Anonymous);
		}

		Boolean is_Validated = (Boolean)attributes.get("is_Validated");

		if (is_Validated != null) {
			setIs_Validated(is_Validated);
		}

		Double current_Balance = (Double)attributes.get("current_Balance");

		if (current_Balance != null) {
			setCurrent_Balance(current_Balance);
		}

		String paypal_Email = (String)attributes.get("paypal_Email");

		if (paypal_Email != null) {
			setPaypal_Email(paypal_Email);
		}

		String password = (String)attributes.get("password");

		if (password != null) {
			setPassword(password);
		}

		Date last_Login_Date = (Date)attributes.get("last_Login_Date");

		if (last_Login_Date != null) {
			setLast_Login_Date(last_Login_Date);
		}

		String featured_Lender = (String)attributes.get("featured_Lender");

		if (featured_Lender != null) {
			setFeatured_Lender(featured_Lender);
		}

		Long voucher_Id = (Long)attributes.get("voucher_Id");

		if (voucher_Id != null) {
			setVoucher_Id(voucher_Id);
		}

		Boolean is_Loan_Donation = (Boolean)attributes.get("is_Loan_Donation");

		if (is_Loan_Donation != null) {
			setIs_Loan_Donation(is_Loan_Donation);
		}
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

	public BaseModel<?> getLenderRemoteModel() {
		return _lenderRemoteModel;
	}

	public void setLenderRemoteModel(BaseModel<?> lenderRemoteModel) {
		_lenderRemoteModel = lenderRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			LenderLocalServiceUtil.addLender(this);
		}
		else {
			LenderLocalServiceUtil.updateLender(this);
		}
	}

	@Override
	public Lender toEscapedModel() {
		return (Lender)Proxy.newProxyInstance(Lender.class.getClassLoader(),
			new Class[] { Lender.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		LenderClp clone = new LenderClp();

		clone.setLender_Id(getLender_Id());
		clone.setSalutation(getSalutation());
		clone.setEmployer_Name(getEmployer_Name());
		clone.setComment(getComment());
		clone.setHeard_Of_Us(getHeard_Of_Us());
		clone.setRegion(getRegion());
		clone.setDisplay_Name(getDisplay_Name());
		clone.setDate_Of_Birth(getDate_Of_Birth());
		clone.setReason_For_Lending(getReason_For_Lending());
		clone.setAbout_Themselves(getAbout_Themselves());
		clone.setAutomatic_Re_lend(getAutomatic_Re_lend());
		clone.setMonthly_Repayments(getMonthly_Repayments());
		clone.setIs_Public_Profile(getIs_Public_Profile());
		clone.setBank_Details(getBank_Details());
		clone.setRecieve_Emails(getRecieve_Emails());
		clone.setRecieve_GoodReturn_Info(getRecieve_GoodReturn_Info());
		clone.setIs_Anonymous(getIs_Anonymous());
		clone.setIs_Validated(getIs_Validated());
		clone.setCurrent_Balance(getCurrent_Balance());
		clone.setPaypal_Email(getPaypal_Email());
		clone.setPassword(getPassword());
		clone.setLast_Login_Date(getLast_Login_Date());
		clone.setFeatured_Lender(getFeatured_Lender());
		clone.setVoucher_Id(getVoucher_Id());
		clone.setIs_Loan_Donation(getIs_Loan_Donation());

		return clone;
	}

	public int compareTo(Lender lender) {
		int value = 0;

		value = getDisplay_Name().compareTo(lender.getDisplay_Name());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		LenderClp lender = null;

		try {
			lender = (LenderClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = lender.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(51);

		sb.append("{lender_Id=");
		sb.append(getLender_Id());
		sb.append(", salutation=");
		sb.append(getSalutation());
		sb.append(", employer_Name=");
		sb.append(getEmployer_Name());
		sb.append(", comment=");
		sb.append(getComment());
		sb.append(", heard_Of_Us=");
		sb.append(getHeard_Of_Us());
		sb.append(", region=");
		sb.append(getRegion());
		sb.append(", display_Name=");
		sb.append(getDisplay_Name());
		sb.append(", date_Of_Birth=");
		sb.append(getDate_Of_Birth());
		sb.append(", reason_For_Lending=");
		sb.append(getReason_For_Lending());
		sb.append(", about_Themselves=");
		sb.append(getAbout_Themselves());
		sb.append(", automatic_Re_lend=");
		sb.append(getAutomatic_Re_lend());
		sb.append(", monthly_Repayments=");
		sb.append(getMonthly_Repayments());
		sb.append(", is_Public_Profile=");
		sb.append(getIs_Public_Profile());
		sb.append(", bank_Details=");
		sb.append(getBank_Details());
		sb.append(", recieve_Emails=");
		sb.append(getRecieve_Emails());
		sb.append(", recieve_GoodReturn_Info=");
		sb.append(getRecieve_GoodReturn_Info());
		sb.append(", is_Anonymous=");
		sb.append(getIs_Anonymous());
		sb.append(", is_Validated=");
		sb.append(getIs_Validated());
		sb.append(", current_Balance=");
		sb.append(getCurrent_Balance());
		sb.append(", paypal_Email=");
		sb.append(getPaypal_Email());
		sb.append(", password=");
		sb.append(getPassword());
		sb.append(", last_Login_Date=");
		sb.append(getLast_Login_Date());
		sb.append(", featured_Lender=");
		sb.append(getFeatured_Lender());
		sb.append(", voucher_Id=");
		sb.append(getVoucher_Id());
		sb.append(", is_Loan_Donation=");
		sb.append(getIs_Loan_Donation());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(79);

		sb.append("<model><model-name>");
		sb.append("org.goodreturn.model.Lender");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>lender_Id</column-name><column-value><![CDATA[");
		sb.append(getLender_Id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>salutation</column-name><column-value><![CDATA[");
		sb.append(getSalutation());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>employer_Name</column-name><column-value><![CDATA[");
		sb.append(getEmployer_Name());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>comment</column-name><column-value><![CDATA[");
		sb.append(getComment());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>heard_Of_Us</column-name><column-value><![CDATA[");
		sb.append(getHeard_Of_Us());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>region</column-name><column-value><![CDATA[");
		sb.append(getRegion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>display_Name</column-name><column-value><![CDATA[");
		sb.append(getDisplay_Name());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>date_Of_Birth</column-name><column-value><![CDATA[");
		sb.append(getDate_Of_Birth());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>reason_For_Lending</column-name><column-value><![CDATA[");
		sb.append(getReason_For_Lending());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>about_Themselves</column-name><column-value><![CDATA[");
		sb.append(getAbout_Themselves());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>automatic_Re_lend</column-name><column-value><![CDATA[");
		sb.append(getAutomatic_Re_lend());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>monthly_Repayments</column-name><column-value><![CDATA[");
		sb.append(getMonthly_Repayments());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>is_Public_Profile</column-name><column-value><![CDATA[");
		sb.append(getIs_Public_Profile());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>bank_Details</column-name><column-value><![CDATA[");
		sb.append(getBank_Details());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>recieve_Emails</column-name><column-value><![CDATA[");
		sb.append(getRecieve_Emails());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>recieve_GoodReturn_Info</column-name><column-value><![CDATA[");
		sb.append(getRecieve_GoodReturn_Info());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>is_Anonymous</column-name><column-value><![CDATA[");
		sb.append(getIs_Anonymous());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>is_Validated</column-name><column-value><![CDATA[");
		sb.append(getIs_Validated());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>current_Balance</column-name><column-value><![CDATA[");
		sb.append(getCurrent_Balance());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>paypal_Email</column-name><column-value><![CDATA[");
		sb.append(getPaypal_Email());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>password</column-name><column-value><![CDATA[");
		sb.append(getPassword());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>last_Login_Date</column-name><column-value><![CDATA[");
		sb.append(getLast_Login_Date());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>featured_Lender</column-name><column-value><![CDATA[");
		sb.append(getFeatured_Lender());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>voucher_Id</column-name><column-value><![CDATA[");
		sb.append(getVoucher_Id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>is_Loan_Donation</column-name><column-value><![CDATA[");
		sb.append(getIs_Loan_Donation());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
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
	private BaseModel<?> _lenderRemoteModel;
}