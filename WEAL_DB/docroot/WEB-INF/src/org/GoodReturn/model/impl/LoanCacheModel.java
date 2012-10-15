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

package org.GoodReturn.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import org.GoodReturn.model.Loan;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing Loan in entity cache.
 *
 * @author gilaa004
 * @see Loan
 * @generated
 */
public class LoanCacheModel implements CacheModel<Loan>, Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(49);

		sb.append("{loan_Id=");
		sb.append(loan_Id);
		sb.append(", is_Partially_Funded=");
		sb.append(is_Partially_Funded);
		sb.append(", amount_Requested=");
		sb.append(amount_Requested);
		sb.append(", amount_Fulfilled=");
		sb.append(amount_Fulfilled);
		sb.append(", expiry_Date=");
		sb.append(expiry_Date);
		sb.append(", date_Requisitioned=");
		sb.append(date_Requisitioned);
		sb.append(", date_Of_Fulfillment=");
		sb.append(date_Of_Fulfillment);
		sb.append(", start_Date=");
		sb.append(start_Date);
		sb.append(", end_Date=");
		sb.append(end_Date);
		sb.append(", company_Id=");
		sb.append(company_Id);
		sb.append(", group_Id=");
		sb.append(group_Id);
		sb.append(", amount_Monthly=");
		sb.append(amount_Monthly);
		sb.append(", account_Information=");
		sb.append(account_Information);
		sb.append(", day_Of_Withdrawal=");
		sb.append(day_Of_Withdrawal);
		sb.append(", final_Payment_Date=");
		sb.append(final_Payment_Date);
		sb.append(", loan_Reason=");
		sb.append(loan_Reason);
		sb.append(", loan_Type=");
		sb.append(loan_Type);
		sb.append(", loan_Time=");
		sb.append(loan_Time);
		sb.append(", funding_Preferences=");
		sb.append(funding_Preferences);
		sb.append(", maturity=");
		sb.append(maturity);
		sb.append(", repayments=");
		sb.append(repayments);
		sb.append(", status=");
		sb.append(status);
		sb.append(", payment_Type=");
		sb.append(payment_Type);
		sb.append(", payment_Receipt=");
		sb.append(payment_Receipt);
		sb.append("}");

		return sb.toString();
	}

	public Loan toEntityModel() {
		LoanImpl loanImpl = new LoanImpl();

		loanImpl.setLoan_Id(loan_Id);
		loanImpl.setIs_Partially_Funded(is_Partially_Funded);
		loanImpl.setAmount_Requested(amount_Requested);
		loanImpl.setAmount_Fulfilled(amount_Fulfilled);

		if (expiry_Date == Long.MIN_VALUE) {
			loanImpl.setExpiry_Date(null);
		}
		else {
			loanImpl.setExpiry_Date(new Date(expiry_Date));
		}

		if (date_Requisitioned == Long.MIN_VALUE) {
			loanImpl.setDate_Requisitioned(null);
		}
		else {
			loanImpl.setDate_Requisitioned(new Date(date_Requisitioned));
		}

		if (date_Of_Fulfillment == Long.MIN_VALUE) {
			loanImpl.setDate_Of_Fulfillment(null);
		}
		else {
			loanImpl.setDate_Of_Fulfillment(new Date(date_Of_Fulfillment));
		}

		if (start_Date == Long.MIN_VALUE) {
			loanImpl.setStart_Date(null);
		}
		else {
			loanImpl.setStart_Date(new Date(start_Date));
		}

		if (end_Date == Long.MIN_VALUE) {
			loanImpl.setEnd_Date(null);
		}
		else {
			loanImpl.setEnd_Date(new Date(end_Date));
		}

		loanImpl.setCompany_Id(company_Id);
		loanImpl.setGroup_Id(group_Id);
		loanImpl.setAmount_Monthly(amount_Monthly);

		if (account_Information == null) {
			loanImpl.setAccount_Information(StringPool.BLANK);
		}
		else {
			loanImpl.setAccount_Information(account_Information);
		}

		loanImpl.setDay_Of_Withdrawal(day_Of_Withdrawal);

		if (final_Payment_Date == Long.MIN_VALUE) {
			loanImpl.setFinal_Payment_Date(null);
		}
		else {
			loanImpl.setFinal_Payment_Date(new Date(final_Payment_Date));
		}

		if (loan_Reason == null) {
			loanImpl.setLoan_Reason(StringPool.BLANK);
		}
		else {
			loanImpl.setLoan_Reason(loan_Reason);
		}

		if (loan_Type == null) {
			loanImpl.setLoan_Type(StringPool.BLANK);
		}
		else {
			loanImpl.setLoan_Type(loan_Type);
		}

		if (loan_Time == null) {
			loanImpl.setLoan_Time(StringPool.BLANK);
		}
		else {
			loanImpl.setLoan_Time(loan_Time);
		}

		if (funding_Preferences == null) {
			loanImpl.setFunding_Preferences(StringPool.BLANK);
		}
		else {
			loanImpl.setFunding_Preferences(funding_Preferences);
		}

		if (maturity == null) {
			loanImpl.setMaturity(StringPool.BLANK);
		}
		else {
			loanImpl.setMaturity(maturity);
		}

		loanImpl.setRepayments(repayments);

		if (status == null) {
			loanImpl.setStatus(StringPool.BLANK);
		}
		else {
			loanImpl.setStatus(status);
		}

		if (payment_Type == null) {
			loanImpl.setPayment_Type(StringPool.BLANK);
		}
		else {
			loanImpl.setPayment_Type(payment_Type);
		}

		if (payment_Receipt == null) {
			loanImpl.setPayment_Receipt(StringPool.BLANK);
		}
		else {
			loanImpl.setPayment_Receipt(payment_Receipt);
		}

		loanImpl.resetOriginalValues();

		return loanImpl;
	}

	public long loan_Id;
	public boolean is_Partially_Funded;
	public double amount_Requested;
	public double amount_Fulfilled;
	public long expiry_Date;
	public long date_Requisitioned;
	public long date_Of_Fulfillment;
	public long start_Date;
	public long end_Date;
	public long company_Id;
	public long group_Id;
	public int amount_Monthly;
	public String account_Information;
	public int day_Of_Withdrawal;
	public long final_Payment_Date;
	public String loan_Reason;
	public String loan_Type;
	public String loan_Time;
	public String funding_Preferences;
	public String maturity;
	public double repayments;
	public String status;
	public String payment_Type;
	public String payment_Receipt;
}