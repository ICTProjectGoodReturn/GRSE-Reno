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

package org.goodreturn.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import org.goodreturn.model.Lender;

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
		StringBundler sb = new StringBundler(45);

		sb.append("{lender_Id=");
		sb.append(lender_Id);
		sb.append(", abacus_Person_Id=");
		sb.append(abacus_Person_Id);
		sb.append(", certificate_Id=");
		sb.append(certificate_Id);
		sb.append(", employer_Name=");
		sb.append(employer_Name);
		sb.append(", comment=");
		sb.append(comment);
		sb.append(", heard_Of_Us=");
		sb.append(heard_Of_Us);
		sb.append(", display_Name=");
		sb.append(display_Name);
		sb.append(", date_Of_Birth=");
		sb.append(date_Of_Birth);
		sb.append(", reason_For_Lending=");
		sb.append(reason_For_Lending);
		sb.append(", about_Themselves=");
		sb.append(about_Themselves);
		sb.append(", personal_Link=");
		sb.append(personal_Link);
		sb.append(", is_Public_Profile=");
		sb.append(is_Public_Profile);
		sb.append(", recieve_Emails=");
		sb.append(recieve_Emails);
		sb.append(", recieve_GoodReturn_Info=");
		sb.append(recieve_GoodReturn_Info);
		sb.append(", is_Anonymous=");
		sb.append(is_Anonymous);
		sb.append(", is_Validated=");
		sb.append(is_Validated);
		sb.append(", password=");
		sb.append(password);
		sb.append(", last_Login_Date=");
		sb.append(last_Login_Date);
		sb.append(", featured_Lender=");
		sb.append(featured_Lender);
		sb.append(", is_Loan_Donation=");
		sb.append(is_Loan_Donation);
		sb.append(", changed_By=");
		sb.append(changed_By);
		sb.append(", changed_Time=");
		sb.append(changed_Time);
		sb.append("}");

		return sb.toString();
	}

	public Lender toEntityModel() {
		LenderImpl lenderImpl = new LenderImpl();

		lenderImpl.setLender_Id(lender_Id);
		lenderImpl.setAbacus_Person_Id(abacus_Person_Id);
		lenderImpl.setCertificate_Id(certificate_Id);

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

		if (personal_Link == null) {
			lenderImpl.setPersonal_Link(StringPool.BLANK);
		}
		else {
			lenderImpl.setPersonal_Link(personal_Link);
		}

		lenderImpl.setIs_Public_Profile(is_Public_Profile);
		lenderImpl.setRecieve_Emails(recieve_Emails);
		lenderImpl.setRecieve_GoodReturn_Info(recieve_GoodReturn_Info);
		lenderImpl.setIs_Anonymous(is_Anonymous);
		lenderImpl.setIs_Validated(is_Validated);

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

		lenderImpl.setIs_Loan_Donation(is_Loan_Donation);

		if (changed_By == null) {
			lenderImpl.setChanged_By(StringPool.BLANK);
		}
		else {
			lenderImpl.setChanged_By(changed_By);
		}

		lenderImpl.setChanged_Time(changed_Time);

		lenderImpl.resetOriginalValues();

		return lenderImpl;
	}

	public long lender_Id;
	public long abacus_Person_Id;
	public long certificate_Id;
	public String employer_Name;
	public String comment;
	public String heard_Of_Us;
	public String display_Name;
	public long date_Of_Birth;
	public String reason_For_Lending;
	public String about_Themselves;
	public String personal_Link;
	public boolean is_Public_Profile;
	public boolean recieve_Emails;
	public boolean recieve_GoodReturn_Info;
	public boolean is_Anonymous;
	public boolean is_Validated;
	public String password;
	public long last_Login_Date;
	public String featured_Lender;
	public boolean is_Loan_Donation;
	public String changed_By;
	public long changed_Time;
}