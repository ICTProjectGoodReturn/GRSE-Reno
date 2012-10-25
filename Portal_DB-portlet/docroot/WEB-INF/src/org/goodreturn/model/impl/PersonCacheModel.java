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

import org.goodreturn.model.Person;

import java.io.Serializable;

/**
 * The cache model class for representing Person in entity cache.
 *
 * @author gilaa004
 * @see Person
 * @generated
 */
public class PersonCacheModel implements CacheModel<Person>, Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(35);

		sb.append("{abacus_Person_Id=");
		sb.append(abacus_Person_Id);
		sb.append(", first_Name=");
		sb.append(first_Name);
		sb.append(", last_Name=");
		sb.append(last_Name);
		sb.append(", email=");
		sb.append(email);
		sb.append(", address=");
		sb.append(address);
		sb.append(", address_Type=");
		sb.append(address_Type);
		sb.append(", country=");
		sb.append(country);
		sb.append(", gender=");
		sb.append(gender);
		sb.append(", salutation=");
		sb.append(salutation);
		sb.append(", status=");
		sb.append(status);
		sb.append(", phone_Number=");
		sb.append(phone_Number);
		sb.append(", photo_URL=");
		sb.append(photo_URL);
		sb.append(", occupation=");
		sb.append(occupation);
		sb.append(", changed_By=");
		sb.append(changed_By);
		sb.append(", changed_Time=");
		sb.append(changed_Time);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append("}");

		return sb.toString();
	}

	public Person toEntityModel() {
		PersonImpl personImpl = new PersonImpl();

		personImpl.setAbacus_Person_Id(abacus_Person_Id);

		if (first_Name == null) {
			personImpl.setFirst_Name(StringPool.BLANK);
		}
		else {
			personImpl.setFirst_Name(first_Name);
		}

		if (last_Name == null) {
			personImpl.setLast_Name(StringPool.BLANK);
		}
		else {
			personImpl.setLast_Name(last_Name);
		}

		if (email == null) {
			personImpl.setEmail(StringPool.BLANK);
		}
		else {
			personImpl.setEmail(email);
		}

		if (address == null) {
			personImpl.setAddress(StringPool.BLANK);
		}
		else {
			personImpl.setAddress(address);
		}

		if (address_Type == null) {
			personImpl.setAddress_Type(StringPool.BLANK);
		}
		else {
			personImpl.setAddress_Type(address_Type);
		}

		if (country == null) {
			personImpl.setCountry(StringPool.BLANK);
		}
		else {
			personImpl.setCountry(country);
		}

		if (gender == null) {
			personImpl.setGender(StringPool.BLANK);
		}
		else {
			personImpl.setGender(gender);
		}

		if (salutation == null) {
			personImpl.setSalutation(StringPool.BLANK);
		}
		else {
			personImpl.setSalutation(salutation);
		}

		if (status == null) {
			personImpl.setStatus(StringPool.BLANK);
		}
		else {
			personImpl.setStatus(status);
		}

		personImpl.setPhone_Number(phone_Number);

		if (photo_URL == null) {
			personImpl.setPhoto_URL(StringPool.BLANK);
		}
		else {
			personImpl.setPhoto_URL(photo_URL);
		}

		if (occupation == null) {
			personImpl.setOccupation(StringPool.BLANK);
		}
		else {
			personImpl.setOccupation(occupation);
		}

		if (changed_By == null) {
			personImpl.setChanged_By(StringPool.BLANK);
		}
		else {
			personImpl.setChanged_By(changed_By);
		}

		personImpl.setChanged_Time(changed_Time);
		personImpl.setGroupId(groupId);
		personImpl.setCompanyId(companyId);

		personImpl.resetOriginalValues();

		return personImpl;
	}

	public long abacus_Person_Id;
	public String first_Name;
	public String last_Name;
	public String email;
	public String address;
	public String address_Type;
	public String country;
	public String gender;
	public String salutation;
	public String status;
	public long phone_Number;
	public String photo_URL;
	public String occupation;
	public String changed_By;
	public long changed_Time;
	public long groupId;
	public long companyId;
}