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

package com.test.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.test.model.Borrower;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing Borrower in entity cache.
 *
 * @author gilaa004
 * @see Borrower
 * @generated
 */
public class BorrowerCacheModel implements CacheModel<Borrower>, Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{abacus_Borrower_Id=");
		sb.append(abacus_Borrower_Id);
		sb.append(", write_Off_Date=");
		sb.append(write_Off_Date);
		sb.append(", phone=");
		sb.append(phone);
		sb.append(", wait_Time=");
		sb.append(wait_Time);
		sb.append(", country=");
		sb.append(country);
		sb.append(", amount_Needed=");
		sb.append(amount_Needed);
		sb.append(", amount_Needed_AUD=");
		sb.append(amount_Needed_AUD);
		sb.append(", type_Of_Person=");
		sb.append(type_Of_Person);
		sb.append(", village=");
		sb.append(village);
		sb.append(", district=");
		sb.append(district);
		sb.append(", pdf_Link=");
		sb.append(pdf_Link);
		sb.append(", currency=");
		sb.append(currency);
		sb.append(", date_Applied=");
		sb.append(date_Applied);
		sb.append("}");

		return sb.toString();
	}

	public Borrower toEntityModel() {
		BorrowerImpl borrowerImpl = new BorrowerImpl();

		borrowerImpl.setAbacus_Borrower_Id(abacus_Borrower_Id);

		if (write_Off_Date == Long.MIN_VALUE) {
			borrowerImpl.setWrite_Off_Date(null);
		}
		else {
			borrowerImpl.setWrite_Off_Date(new Date(write_Off_Date));
		}

		borrowerImpl.setPhone(phone);
		borrowerImpl.setWait_Time(wait_Time);

		if (country == null) {
			borrowerImpl.setCountry(StringPool.BLANK);
		}
		else {
			borrowerImpl.setCountry(country);
		}

		borrowerImpl.setAmount_Needed(amount_Needed);
		borrowerImpl.setAmount_Needed_AUD(amount_Needed_AUD);

		if (type_Of_Person == null) {
			borrowerImpl.setType_Of_Person(StringPool.BLANK);
		}
		else {
			borrowerImpl.setType_Of_Person(type_Of_Person);
		}

		if (village == null) {
			borrowerImpl.setVillage(StringPool.BLANK);
		}
		else {
			borrowerImpl.setVillage(village);
		}

		if (district == null) {
			borrowerImpl.setDistrict(StringPool.BLANK);
		}
		else {
			borrowerImpl.setDistrict(district);
		}

		if (pdf_Link == null) {
			borrowerImpl.setPdf_Link(StringPool.BLANK);
		}
		else {
			borrowerImpl.setPdf_Link(pdf_Link);
		}

		borrowerImpl.setCurrency(currency);

		if (date_Applied == Long.MIN_VALUE) {
			borrowerImpl.setDate_Applied(null);
		}
		else {
			borrowerImpl.setDate_Applied(new Date(date_Applied));
		}

		borrowerImpl.resetOriginalValues();

		return borrowerImpl;
	}

	public long abacus_Borrower_Id;
	public long write_Off_Date;
	public long phone;
	public long wait_Time;
	public String country;
	public double amount_Needed;
	public double amount_Needed_AUD;
	public String type_Of_Person;
	public String village;
	public String district;
	public String pdf_Link;
	public double currency;
	public long date_Applied;
}