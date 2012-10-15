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

import org.GoodReturn.model.Lender;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing Lender in entity cache.
 *
 * @author gilaa004
 * @see Lender
 * @generated
 */
public class LenderCacheModel implements CacheModel<Lender>, Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(51);

		sb.append("{lender_Id=");
		sb.append(lender_Id);
		sb.append(", salutation=");
		sb.append(salutation);
		sb.append(", employer_Name=");
		sb.append(employer_Name);
		sb.append(", comment=");
		sb.append(comment);
		sb.append(", heard_Of_Us=");
		sb.append(heard_Of_Us);
		sb.append(", region=");
		sb.append(region);
		sb.append(", display_Name=");
		sb.append(display_Name);
		sb.append(", date_Of_Birth=");
		sb.append(date_Of_Birth);
		sb.append(", reason_For_Lending=");
		sb.append(reason_For_Lending);
		sb.append(", about_Themselves=");
		sb.append(about_Themselves);
		sb.append(", automatic_Re_lend=");
		sb.append(automatic_Re_lend);
		sb.append(", monthly_Repayments=");
		sb.append(monthly_Repayments);
		sb.append(", is_Public_Profile=");
		sb.append(is_Public_Profile);
		sb.append(", bank_Details=");
		sb.append(bank_Details);
		sb.append(", recieve_Emails=");
		sb.append(recieve_Emails);
		sb.append(", recieve_GoodReturn_Info=");
		sb.append(recieve_GoodReturn_Info);
		sb.append(", is_Anonymous=");
		sb.append(is_Anonymous);
		sb.append(", is_Validated=");
		sb.append(is_Validated);
		sb.append(", current_Balance=");
		sb.append(current_Balance);
		sb.append(", paypal_Email=");
		sb.append(paypal_Email);
		sb.append(", password=");
		sb.append(password);
		sb.append(", last_Login_Date=");
		sb.append(last_Login_Date);
		sb.append(", featured_Lender=");
		sb.append(featured_Lender);
		sb.append(", voucher_Id=");
		sb.append(voucher_Id);
		sb.append(", is_Loan_Donation=");
		sb.append(is_Loan_Donation);
		sb.append("}");

		return sb.toString();
	}

	public Lender toEntityModel() {
		LenderImpl lenderImpl = new LenderImpl();

		lenderImpl.setLender_Id(lender_Id);

		if (salutation == null) {
			lenderImpl.setSalutation(StringPool.BLANK);
		}
		else {
			lenderImpl.setSalutation(salutation);
		}

		if (employer_Name == null) {
			lenderImpl.setEmployer_Name(StringPool.BLANK);
		}
		else {
			lenderImpl.setEmployer_Name(employer_Name);
		}

		if (comment == null) {
			lenderImpl.setComment(StringPool.BLANK);
		}
		else {
			lenderImpl.setComment(comment);
		}

		if (heard_Of_Us == null) {
			lenderImpl.setHeard_Of_Us(StringPool.BLANK);
		}
		else {
			lenderImpl.setHeard_Of_Us(heard_Of_Us);
		}

		if (region == null) {
			lenderImpl.setRegion(StringPool.BLANK);
		}
		else {
			lenderImpl.setRegion(region);
		}

		if (display_Name == null) {
			lenderImpl.setDisplay_Name(StringPool.BLANK);
		}
		else {
			lenderImpl.setDisplay_Name(display_Name);
		}

		if (date_Of_Birth == Long.MIN_VALUE) {
			lenderImpl.setDate_Of_Birth(null);
		}
		else {
			lenderImpl.setDate_Of_Birth(new Date(date_Of_Birth));
		}

		if (reason_For_Lending == null) {
			lenderImpl.setReason_For_Lending(StringPool.BLANK);
		}
		else {
			lenderImpl.setReason_For_Lending(reason_For_Lending);
		}

		if (about_Themselves == null) {
			lenderImpl.setAbout_Themselves(StringPool.BLANK);
		}
		else {
			lenderImpl.setAbout_Themselves(about_Themselves);
		}

		lenderImpl.setAutomatic_Re_lend(automatic_Re_lend);
		lenderImpl.setMonthly_Repayments(monthly_Repayments);
		lenderImpl.setIs_Public_Profile(is_Public_Profile);

		if (bank_Details == null) {
			lenderImpl.setBank_Details(StringPool.BLANK);
		}
		else {
			lenderImpl.setBank_Details(bank_Details);
		}

		lenderImpl.setRecieve_Emails(recieve_Emails);
		lenderImpl.setRecieve_GoodReturn_Info(recieve_GoodReturn_Info);
		lenderImpl.setIs_Anonymous(is_Anonymous);
		lenderImpl.setIs_Validated(is_Validated);
		lenderImpl.setCurrent_Balance(current_Balance);

		if (paypal_Email == null) {
			lenderImpl.setPaypal_Email(StringPool.BLANK);
		}
		else {
			lenderImpl.setPaypal_Email(paypal_Email);
		}

		if (password == null) {
			lenderImpl.setPassword(StringPool.BLANK);
		}
		else {
			lenderImpl.setPassword(password);
		}

		if (last_Login_Date == Long.MIN_VALUE) {
			lenderImpl.setLast_Login_Date(null);
		}
		else {
			lenderImpl.setLast_Login_Date(new Date(last_Login_Date));
		}

		if (featured_Lender == null) {
			lenderImpl.setFeatured_Lender(StringPool.BLANK);
		}
		else {
			lenderImpl.setFeatured_Lender(featured_Lender);
		}

		lenderImpl.setVoucher_Id(voucher_Id);
		lenderImpl.setIs_Loan_Donation(is_Loan_Donation);

		lenderImpl.resetOriginalValues();

		return lenderImpl;
	}

	public long lender_Id;
	public String salutation;
	public String employer_Name;
	public String comment;
	public String heard_Of_Us;
	public String region;
	public String display_Name;
	public long date_Of_Birth;
	public String reason_For_Lending;
	public String about_Themselves;
	public boolean automatic_Re_lend;
	public double monthly_Repayments;
	public boolean is_Public_Profile;
	public String bank_Details;
	public boolean recieve_Emails;
	public boolean recieve_GoodReturn_Info;
	public boolean is_Anonymous;
	public boolean is_Validated;
	public double current_Balance;
	public String paypal_Email;
	public String password;
	public long last_Login_Date;
	public String featured_Lender;
	public long voucher_Id;
	public boolean is_Loan_Donation;
}