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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import org.GoodReturn.service.LoanLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author gilaa004
 */
public class LoanClp extends BaseModelImpl<Loan> implements Loan {
	public LoanClp() {
	}

	public Class<?> getModelClass() {
		return Loan.class;
	}

	public String getModelClassName() {
		return Loan.class.getName();
	}

	public long getPrimaryKey() {
		return _loan_Id;
	}

	public void setPrimaryKey(long primaryKey) {
		setLoan_Id(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_loan_Id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("loan_Id", getLoan_Id());
		attributes.put("is_Partially_Funded", getIs_Partially_Funded());
		attributes.put("amount_Requested", getAmount_Requested());
		attributes.put("amount_Fulfilled", getAmount_Fulfilled());
		attributes.put("expiry_Date", getExpiry_Date());
		attributes.put("date_Requisitioned", getDate_Requisitioned());
		attributes.put("date_Of_Fulfillment", getDate_Of_Fulfillment());
		attributes.put("start_Date", getStart_Date());
		attributes.put("end_Date", getEnd_Date());
		attributes.put("company_Id", getCompany_Id());
		attributes.put("group_Id", getGroup_Id());
		attributes.put("amount_Monthly", getAmount_Monthly());
		attributes.put("account_Information", getAccount_Information());
		attributes.put("day_Of_Withdrawal", getDay_Of_Withdrawal());
		attributes.put("final_Payment_Date", getFinal_Payment_Date());
		attributes.put("loan_Reason", getLoan_Reason());
		attributes.put("loan_Type", getLoan_Type());
		attributes.put("loan_Time", getLoan_Time());
		attributes.put("funding_Preferences", getFunding_Preferences());
		attributes.put("maturity", getMaturity());
		attributes.put("repayments", getRepayments());
		attributes.put("status", getStatus());
		attributes.put("payment_Type", getPayment_Type());
		attributes.put("payment_Receipt", getPayment_Receipt());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long loan_Id = (Long)attributes.get("loan_Id");

		if (loan_Id != null) {
			setLoan_Id(loan_Id);
		}

		Boolean is_Partially_Funded = (Boolean)attributes.get(
				"is_Partially_Funded");

		if (is_Partially_Funded != null) {
			setIs_Partially_Funded(is_Partially_Funded);
		}

		Double amount_Requested = (Double)attributes.get("amount_Requested");

		if (amount_Requested != null) {
			setAmount_Requested(amount_Requested);
		}

		Double amount_Fulfilled = (Double)attributes.get("amount_Fulfilled");

		if (amount_Fulfilled != null) {
			setAmount_Fulfilled(amount_Fulfilled);
		}

		Date expiry_Date = (Date)attributes.get("expiry_Date");

		if (expiry_Date != null) {
			setExpiry_Date(expiry_Date);
		}

		Date date_Requisitioned = (Date)attributes.get("date_Requisitioned");

		if (date_Requisitioned != null) {
			setDate_Requisitioned(date_Requisitioned);
		}

		Date date_Of_Fulfillment = (Date)attributes.get("date_Of_Fulfillment");

		if (date_Of_Fulfillment != null) {
			setDate_Of_Fulfillment(date_Of_Fulfillment);
		}

		Date start_Date = (Date)attributes.get("start_Date");

		if (start_Date != null) {
			setStart_Date(start_Date);
		}

		Date end_Date = (Date)attributes.get("end_Date");

		if (end_Date != null) {
			setEnd_Date(end_Date);
		}

		Long company_Id = (Long)attributes.get("company_Id");

		if (company_Id != null) {
			setCompany_Id(company_Id);
		}

		Long group_Id = (Long)attributes.get("group_Id");

		if (group_Id != null) {
			setGroup_Id(group_Id);
		}

		Integer amount_Monthly = (Integer)attributes.get("amount_Monthly");

		if (amount_Monthly != null) {
			setAmount_Monthly(amount_Monthly);
		}

		String account_Information = (String)attributes.get(
				"account_Information");

		if (account_Information != null) {
			setAccount_Information(account_Information);
		}

		Integer day_Of_Withdrawal = (Integer)attributes.get("day_Of_Withdrawal");

		if (day_Of_Withdrawal != null) {
			setDay_Of_Withdrawal(day_Of_Withdrawal);
		}

		Date final_Payment_Date = (Date)attributes.get("final_Payment_Date");

		if (final_Payment_Date != null) {
			setFinal_Payment_Date(final_Payment_Date);
		}

		String loan_Reason = (String)attributes.get("loan_Reason");

		if (loan_Reason != null) {
			setLoan_Reason(loan_Reason);
		}

		String loan_Type = (String)attributes.get("loan_Type");

		if (loan_Type != null) {
			setLoan_Type(loan_Type);
		}

		String loan_Time = (String)attributes.get("loan_Time");

		if (loan_Time != null) {
			setLoan_Time(loan_Time);
		}

		String funding_Preferences = (String)attributes.get(
				"funding_Preferences");

		if (funding_Preferences != null) {
			setFunding_Preferences(funding_Preferences);
		}

		String maturity = (String)attributes.get("maturity");

		if (maturity != null) {
			setMaturity(maturity);
		}

		Double repayments = (Double)attributes.get("repayments");

		if (repayments != null) {
			setRepayments(repayments);
		}

		String status = (String)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		String payment_Type = (String)attributes.get("payment_Type");

		if (payment_Type != null) {
			setPayment_Type(payment_Type);
		}

		String payment_Receipt = (String)attributes.get("payment_Receipt");

		if (payment_Receipt != null) {
			setPayment_Receipt(payment_Receipt);
		}
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

	public BaseModel<?> getLoanRemoteModel() {
		return _loanRemoteModel;
	}

	public void setLoanRemoteModel(BaseModel<?> loanRemoteModel) {
		_loanRemoteModel = loanRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			LoanLocalServiceUtil.addLoan(this);
		}
		else {
			LoanLocalServiceUtil.updateLoan(this);
		}
	}

	@Override
	public Loan toEscapedModel() {
		return (Loan)Proxy.newProxyInstance(Loan.class.getClassLoader(),
			new Class[] { Loan.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		LoanClp clone = new LoanClp();

		clone.setLoan_Id(getLoan_Id());
		clone.setIs_Partially_Funded(getIs_Partially_Funded());
		clone.setAmount_Requested(getAmount_Requested());
		clone.setAmount_Fulfilled(getAmount_Fulfilled());
		clone.setExpiry_Date(getExpiry_Date());
		clone.setDate_Requisitioned(getDate_Requisitioned());
		clone.setDate_Of_Fulfillment(getDate_Of_Fulfillment());
		clone.setStart_Date(getStart_Date());
		clone.setEnd_Date(getEnd_Date());
		clone.setCompany_Id(getCompany_Id());
		clone.setGroup_Id(getGroup_Id());
		clone.setAmount_Monthly(getAmount_Monthly());
		clone.setAccount_Information(getAccount_Information());
		clone.setDay_Of_Withdrawal(getDay_Of_Withdrawal());
		clone.setFinal_Payment_Date(getFinal_Payment_Date());
		clone.setLoan_Reason(getLoan_Reason());
		clone.setLoan_Type(getLoan_Type());
		clone.setLoan_Time(getLoan_Time());
		clone.setFunding_Preferences(getFunding_Preferences());
		clone.setMaturity(getMaturity());
		clone.setRepayments(getRepayments());
		clone.setStatus(getStatus());
		clone.setPayment_Type(getPayment_Type());
		clone.setPayment_Receipt(getPayment_Receipt());

		return clone;
	}

	public int compareTo(Loan loan) {
		int value = 0;

		if (getLoan_Id() < loan.getLoan_Id()) {
			value = -1;
		}
		else if (getLoan_Id() > loan.getLoan_Id()) {
			value = 1;
		}
		else {
			value = 0;
		}

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

		LoanClp loan = null;

		try {
			loan = (LoanClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = loan.getPrimaryKey();

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
		StringBundler sb = new StringBundler(49);

		sb.append("{loan_Id=");
		sb.append(getLoan_Id());
		sb.append(", is_Partially_Funded=");
		sb.append(getIs_Partially_Funded());
		sb.append(", amount_Requested=");
		sb.append(getAmount_Requested());
		sb.append(", amount_Fulfilled=");
		sb.append(getAmount_Fulfilled());
		sb.append(", expiry_Date=");
		sb.append(getExpiry_Date());
		sb.append(", date_Requisitioned=");
		sb.append(getDate_Requisitioned());
		sb.append(", date_Of_Fulfillment=");
		sb.append(getDate_Of_Fulfillment());
		sb.append(", start_Date=");
		sb.append(getStart_Date());
		sb.append(", end_Date=");
		sb.append(getEnd_Date());
		sb.append(", company_Id=");
		sb.append(getCompany_Id());
		sb.append(", group_Id=");
		sb.append(getGroup_Id());
		sb.append(", amount_Monthly=");
		sb.append(getAmount_Monthly());
		sb.append(", account_Information=");
		sb.append(getAccount_Information());
		sb.append(", day_Of_Withdrawal=");
		sb.append(getDay_Of_Withdrawal());
		sb.append(", final_Payment_Date=");
		sb.append(getFinal_Payment_Date());
		sb.append(", loan_Reason=");
		sb.append(getLoan_Reason());
		sb.append(", loan_Type=");
		sb.append(getLoan_Type());
		sb.append(", loan_Time=");
		sb.append(getLoan_Time());
		sb.append(", funding_Preferences=");
		sb.append(getFunding_Preferences());
		sb.append(", maturity=");
		sb.append(getMaturity());
		sb.append(", repayments=");
		sb.append(getRepayments());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append(", payment_Type=");
		sb.append(getPayment_Type());
		sb.append(", payment_Receipt=");
		sb.append(getPayment_Receipt());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(76);

		sb.append("<model><model-name>");
		sb.append("org.GoodReturn.model.Loan");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>loan_Id</column-name><column-value><![CDATA[");
		sb.append(getLoan_Id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>is_Partially_Funded</column-name><column-value><![CDATA[");
		sb.append(getIs_Partially_Funded());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>amount_Requested</column-name><column-value><![CDATA[");
		sb.append(getAmount_Requested());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>amount_Fulfilled</column-name><column-value><![CDATA[");
		sb.append(getAmount_Fulfilled());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>expiry_Date</column-name><column-value><![CDATA[");
		sb.append(getExpiry_Date());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>date_Requisitioned</column-name><column-value><![CDATA[");
		sb.append(getDate_Requisitioned());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>date_Of_Fulfillment</column-name><column-value><![CDATA[");
		sb.append(getDate_Of_Fulfillment());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>start_Date</column-name><column-value><![CDATA[");
		sb.append(getStart_Date());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>end_Date</column-name><column-value><![CDATA[");
		sb.append(getEnd_Date());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>company_Id</column-name><column-value><![CDATA[");
		sb.append(getCompany_Id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>group_Id</column-name><column-value><![CDATA[");
		sb.append(getGroup_Id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>amount_Monthly</column-name><column-value><![CDATA[");
		sb.append(getAmount_Monthly());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>account_Information</column-name><column-value><![CDATA[");
		sb.append(getAccount_Information());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>day_Of_Withdrawal</column-name><column-value><![CDATA[");
		sb.append(getDay_Of_Withdrawal());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>final_Payment_Date</column-name><column-value><![CDATA[");
		sb.append(getFinal_Payment_Date());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>loan_Reason</column-name><column-value><![CDATA[");
		sb.append(getLoan_Reason());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>loan_Type</column-name><column-value><![CDATA[");
		sb.append(getLoan_Type());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>loan_Time</column-name><column-value><![CDATA[");
		sb.append(getLoan_Time());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>funding_Preferences</column-name><column-value><![CDATA[");
		sb.append(getFunding_Preferences());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maturity</column-name><column-value><![CDATA[");
		sb.append(getMaturity());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>repayments</column-name><column-value><![CDATA[");
		sb.append(getRepayments());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>payment_Type</column-name><column-value><![CDATA[");
		sb.append(getPayment_Type());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>payment_Receipt</column-name><column-value><![CDATA[");
		sb.append(getPayment_Receipt());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
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
	private BaseModel<?> _loanRemoteModel;
}