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

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Loan}.
 * </p>
 *
 * @author    gilaa004
 * @see       Loan
 * @generated
 */
public class LoanWrapper implements Loan, ModelWrapper<Loan> {
	public LoanWrapper(Loan loan) {
		_loan = loan;
	}

	public Class<?> getModelClass() {
		return Loan.class;
	}

	public String getModelClassName() {
		return Loan.class.getName();
	}

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

	/**
	* Returns the primary key of this loan.
	*
	* @return the primary key of this loan
	*/
	public long getPrimaryKey() {
		return _loan.getPrimaryKey();
	}

	/**
	* Sets the primary key of this loan.
	*
	* @param primaryKey the primary key of this loan
	*/
	public void setPrimaryKey(long primaryKey) {
		_loan.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the loan_ ID of this loan.
	*
	* @return the loan_ ID of this loan
	*/
	public long getLoan_Id() {
		return _loan.getLoan_Id();
	}

	/**
	* Sets the loan_ ID of this loan.
	*
	* @param loan_Id the loan_ ID of this loan
	*/
	public void setLoan_Id(long loan_Id) {
		_loan.setLoan_Id(loan_Id);
	}

	/**
	* Returns the is_ partially_ funded of this loan.
	*
	* @return the is_ partially_ funded of this loan
	*/
	public boolean getIs_Partially_Funded() {
		return _loan.getIs_Partially_Funded();
	}

	/**
	* Returns <code>true</code> if this loan is is_ partially_ funded.
	*
	* @return <code>true</code> if this loan is is_ partially_ funded; <code>false</code> otherwise
	*/
	public boolean isIs_Partially_Funded() {
		return _loan.isIs_Partially_Funded();
	}

	/**
	* Sets whether this loan is is_ partially_ funded.
	*
	* @param is_Partially_Funded the is_ partially_ funded of this loan
	*/
	public void setIs_Partially_Funded(boolean is_Partially_Funded) {
		_loan.setIs_Partially_Funded(is_Partially_Funded);
	}

	/**
	* Returns the amount_ requested of this loan.
	*
	* @return the amount_ requested of this loan
	*/
	public double getAmount_Requested() {
		return _loan.getAmount_Requested();
	}

	/**
	* Sets the amount_ requested of this loan.
	*
	* @param amount_Requested the amount_ requested of this loan
	*/
	public void setAmount_Requested(double amount_Requested) {
		_loan.setAmount_Requested(amount_Requested);
	}

	/**
	* Returns the amount_ fulfilled of this loan.
	*
	* @return the amount_ fulfilled of this loan
	*/
	public double getAmount_Fulfilled() {
		return _loan.getAmount_Fulfilled();
	}

	/**
	* Sets the amount_ fulfilled of this loan.
	*
	* @param amount_Fulfilled the amount_ fulfilled of this loan
	*/
	public void setAmount_Fulfilled(double amount_Fulfilled) {
		_loan.setAmount_Fulfilled(amount_Fulfilled);
	}

	/**
	* Returns the expiry_ date of this loan.
	*
	* @return the expiry_ date of this loan
	*/
	public java.util.Date getExpiry_Date() {
		return _loan.getExpiry_Date();
	}

	/**
	* Sets the expiry_ date of this loan.
	*
	* @param expiry_Date the expiry_ date of this loan
	*/
	public void setExpiry_Date(java.util.Date expiry_Date) {
		_loan.setExpiry_Date(expiry_Date);
	}

	/**
	* Returns the date_ requisitioned of this loan.
	*
	* @return the date_ requisitioned of this loan
	*/
	public java.util.Date getDate_Requisitioned() {
		return _loan.getDate_Requisitioned();
	}

	/**
	* Sets the date_ requisitioned of this loan.
	*
	* @param date_Requisitioned the date_ requisitioned of this loan
	*/
	public void setDate_Requisitioned(java.util.Date date_Requisitioned) {
		_loan.setDate_Requisitioned(date_Requisitioned);
	}

	/**
	* Returns the date_ of_ fulfillment of this loan.
	*
	* @return the date_ of_ fulfillment of this loan
	*/
	public java.util.Date getDate_Of_Fulfillment() {
		return _loan.getDate_Of_Fulfillment();
	}

	/**
	* Sets the date_ of_ fulfillment of this loan.
	*
	* @param date_Of_Fulfillment the date_ of_ fulfillment of this loan
	*/
	public void setDate_Of_Fulfillment(java.util.Date date_Of_Fulfillment) {
		_loan.setDate_Of_Fulfillment(date_Of_Fulfillment);
	}

	/**
	* Returns the start_ date of this loan.
	*
	* @return the start_ date of this loan
	*/
	public java.util.Date getStart_Date() {
		return _loan.getStart_Date();
	}

	/**
	* Sets the start_ date of this loan.
	*
	* @param start_Date the start_ date of this loan
	*/
	public void setStart_Date(java.util.Date start_Date) {
		_loan.setStart_Date(start_Date);
	}

	/**
	* Returns the end_ date of this loan.
	*
	* @return the end_ date of this loan
	*/
	public java.util.Date getEnd_Date() {
		return _loan.getEnd_Date();
	}

	/**
	* Sets the end_ date of this loan.
	*
	* @param end_Date the end_ date of this loan
	*/
	public void setEnd_Date(java.util.Date end_Date) {
		_loan.setEnd_Date(end_Date);
	}

	/**
	* Returns the company_ ID of this loan.
	*
	* @return the company_ ID of this loan
	*/
	public long getCompany_Id() {
		return _loan.getCompany_Id();
	}

	/**
	* Sets the company_ ID of this loan.
	*
	* @param company_Id the company_ ID of this loan
	*/
	public void setCompany_Id(long company_Id) {
		_loan.setCompany_Id(company_Id);
	}

	/**
	* Returns the group_ ID of this loan.
	*
	* @return the group_ ID of this loan
	*/
	public long getGroup_Id() {
		return _loan.getGroup_Id();
	}

	/**
	* Sets the group_ ID of this loan.
	*
	* @param group_Id the group_ ID of this loan
	*/
	public void setGroup_Id(long group_Id) {
		_loan.setGroup_Id(group_Id);
	}

	/**
	* Returns the amount_ monthly of this loan.
	*
	* @return the amount_ monthly of this loan
	*/
	public int getAmount_Monthly() {
		return _loan.getAmount_Monthly();
	}

	/**
	* Sets the amount_ monthly of this loan.
	*
	* @param amount_Monthly the amount_ monthly of this loan
	*/
	public void setAmount_Monthly(int amount_Monthly) {
		_loan.setAmount_Monthly(amount_Monthly);
	}

	/**
	* Returns the account_ information of this loan.
	*
	* @return the account_ information of this loan
	*/
	public java.lang.String getAccount_Information() {
		return _loan.getAccount_Information();
	}

	/**
	* Sets the account_ information of this loan.
	*
	* @param account_Information the account_ information of this loan
	*/
	public void setAccount_Information(java.lang.String account_Information) {
		_loan.setAccount_Information(account_Information);
	}

	/**
	* Returns the day_ of_ withdrawal of this loan.
	*
	* @return the day_ of_ withdrawal of this loan
	*/
	public int getDay_Of_Withdrawal() {
		return _loan.getDay_Of_Withdrawal();
	}

	/**
	* Sets the day_ of_ withdrawal of this loan.
	*
	* @param day_Of_Withdrawal the day_ of_ withdrawal of this loan
	*/
	public void setDay_Of_Withdrawal(int day_Of_Withdrawal) {
		_loan.setDay_Of_Withdrawal(day_Of_Withdrawal);
	}

	/**
	* Returns the final_ payment_ date of this loan.
	*
	* @return the final_ payment_ date of this loan
	*/
	public java.util.Date getFinal_Payment_Date() {
		return _loan.getFinal_Payment_Date();
	}

	/**
	* Sets the final_ payment_ date of this loan.
	*
	* @param final_Payment_Date the final_ payment_ date of this loan
	*/
	public void setFinal_Payment_Date(java.util.Date final_Payment_Date) {
		_loan.setFinal_Payment_Date(final_Payment_Date);
	}

	/**
	* Returns the loan_ reason of this loan.
	*
	* @return the loan_ reason of this loan
	*/
	public java.lang.String getLoan_Reason() {
		return _loan.getLoan_Reason();
	}

	/**
	* Sets the loan_ reason of this loan.
	*
	* @param loan_Reason the loan_ reason of this loan
	*/
	public void setLoan_Reason(java.lang.String loan_Reason) {
		_loan.setLoan_Reason(loan_Reason);
	}

	/**
	* Returns the loan_ type of this loan.
	*
	* @return the loan_ type of this loan
	*/
	public java.lang.String getLoan_Type() {
		return _loan.getLoan_Type();
	}

	/**
	* Sets the loan_ type of this loan.
	*
	* @param loan_Type the loan_ type of this loan
	*/
	public void setLoan_Type(java.lang.String loan_Type) {
		_loan.setLoan_Type(loan_Type);
	}

	/**
	* Returns the loan_ time of this loan.
	*
	* @return the loan_ time of this loan
	*/
	public java.lang.String getLoan_Time() {
		return _loan.getLoan_Time();
	}

	/**
	* Sets the loan_ time of this loan.
	*
	* @param loan_Time the loan_ time of this loan
	*/
	public void setLoan_Time(java.lang.String loan_Time) {
		_loan.setLoan_Time(loan_Time);
	}

	/**
	* Returns the funding_ preferences of this loan.
	*
	* @return the funding_ preferences of this loan
	*/
	public java.lang.String getFunding_Preferences() {
		return _loan.getFunding_Preferences();
	}

	/**
	* Sets the funding_ preferences of this loan.
	*
	* @param funding_Preferences the funding_ preferences of this loan
	*/
	public void setFunding_Preferences(java.lang.String funding_Preferences) {
		_loan.setFunding_Preferences(funding_Preferences);
	}

	/**
	* Returns the maturity of this loan.
	*
	* @return the maturity of this loan
	*/
	public java.lang.String getMaturity() {
		return _loan.getMaturity();
	}

	/**
	* Sets the maturity of this loan.
	*
	* @param maturity the maturity of this loan
	*/
	public void setMaturity(java.lang.String maturity) {
		_loan.setMaturity(maturity);
	}

	/**
	* Returns the repayments of this loan.
	*
	* @return the repayments of this loan
	*/
	public double getRepayments() {
		return _loan.getRepayments();
	}

	/**
	* Sets the repayments of this loan.
	*
	* @param repayments the repayments of this loan
	*/
	public void setRepayments(double repayments) {
		_loan.setRepayments(repayments);
	}

	/**
	* Returns the status of this loan.
	*
	* @return the status of this loan
	*/
	public java.lang.String getStatus() {
		return _loan.getStatus();
	}

	/**
	* Sets the status of this loan.
	*
	* @param status the status of this loan
	*/
	public void setStatus(java.lang.String status) {
		_loan.setStatus(status);
	}

	/**
	* Returns the payment_ type of this loan.
	*
	* @return the payment_ type of this loan
	*/
	public java.lang.String getPayment_Type() {
		return _loan.getPayment_Type();
	}

	/**
	* Sets the payment_ type of this loan.
	*
	* @param payment_Type the payment_ type of this loan
	*/
	public void setPayment_Type(java.lang.String payment_Type) {
		_loan.setPayment_Type(payment_Type);
	}

	/**
	* Returns the payment_ receipt of this loan.
	*
	* @return the payment_ receipt of this loan
	*/
	public java.lang.String getPayment_Receipt() {
		return _loan.getPayment_Receipt();
	}

	/**
	* Sets the payment_ receipt of this loan.
	*
	* @param payment_Receipt the payment_ receipt of this loan
	*/
	public void setPayment_Receipt(java.lang.String payment_Receipt) {
		_loan.setPayment_Receipt(payment_Receipt);
	}

	public boolean isNew() {
		return _loan.isNew();
	}

	public void setNew(boolean n) {
		_loan.setNew(n);
	}

	public boolean isCachedModel() {
		return _loan.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_loan.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _loan.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _loan.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_loan.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _loan.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_loan.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new LoanWrapper((Loan)_loan.clone());
	}

	public int compareTo(org.GoodReturn.model.Loan loan) {
		return _loan.compareTo(loan);
	}

	@Override
	public int hashCode() {
		return _loan.hashCode();
	}

	public com.liferay.portal.model.CacheModel<org.GoodReturn.model.Loan> toCacheModel() {
		return _loan.toCacheModel();
	}

	public org.GoodReturn.model.Loan toEscapedModel() {
		return new LoanWrapper(_loan.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _loan.toString();
	}

	public java.lang.String toXmlString() {
		return _loan.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_loan.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public Loan getWrappedLoan() {
		return _loan;
	}

	public Loan getWrappedModel() {
		return _loan;
	}

	public void resetOriginalValues() {
		_loan.resetOriginalValues();
	}

	private Loan _loan;
}