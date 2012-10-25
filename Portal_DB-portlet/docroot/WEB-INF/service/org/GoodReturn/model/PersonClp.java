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

import org.goodreturn.service.PersonLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author gilaa004
 */
public class PersonClp extends BaseModelImpl<Person> implements Person {
	public PersonClp() {
	}

	public Class<?> getModelClass() {
		return Person.class;
	}

	public String getModelClassName() {
		return Person.class.getName();
	}

	public long getPrimaryKey() {
		return _abacus_Person_Id;
	}

	public void setPrimaryKey(long primaryKey) {
		setAbacus_Person_Id(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_abacus_Person_Id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("abacus_Person_Id", getAbacus_Person_Id());
		attributes.put("first_Name", getFirst_Name());
		attributes.put("last_Name", getLast_Name());
		attributes.put("email", getEmail());
		attributes.put("address", getAddress());
		attributes.put("address_Type", getAddress_Type());
		attributes.put("country", getCountry());
		attributes.put("gender", getGender());
		attributes.put("salutation", getSalutation());
		attributes.put("status", getStatus());
		attributes.put("phone_Number", getPhone_Number());
		attributes.put("photo_URL", getPhoto_URL());
		attributes.put("occupation", getOccupation());
		attributes.put("changed_By", getChanged_By());
		attributes.put("changed_Time", getChanged_Time());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long abacus_Person_Id = (Long)attributes.get("abacus_Person_Id");

		if (abacus_Person_Id != null) {
			setAbacus_Person_Id(abacus_Person_Id);
		}

		String first_Name = (String)attributes.get("first_Name");

		if (first_Name != null) {
			setFirst_Name(first_Name);
		}

		String last_Name = (String)attributes.get("last_Name");

		if (last_Name != null) {
			setLast_Name(last_Name);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		String address = (String)attributes.get("address");

		if (address != null) {
			setAddress(address);
		}

		String address_Type = (String)attributes.get("address_Type");

		if (address_Type != null) {
			setAddress_Type(address_Type);
		}

		String country = (String)attributes.get("country");

		if (country != null) {
			setCountry(country);
		}

		String gender = (String)attributes.get("gender");

		if (gender != null) {
			setGender(gender);
		}

		String salutation = (String)attributes.get("salutation");

		if (salutation != null) {
			setSalutation(salutation);
		}

		String status = (String)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Long phone_Number = (Long)attributes.get("phone_Number");

		if (phone_Number != null) {
			setPhone_Number(phone_Number);
		}

		String photo_URL = (String)attributes.get("photo_URL");

		if (photo_URL != null) {
			setPhoto_URL(photo_URL);
		}

		String occupation = (String)attributes.get("occupation");

		if (occupation != null) {
			setOccupation(occupation);
		}

		String changed_By = (String)attributes.get("changed_By");

		if (changed_By != null) {
			setChanged_By(changed_By);
		}

		Long changed_Time = (Long)attributes.get("changed_Time");

		if (changed_Time != null) {
			setChanged_Time(changed_Time);
		}
	}

	public long getAbacus_Person_Id() {
		return _abacus_Person_Id;
	}

	public void setAbacus_Person_Id(long abacus_Person_Id) {
		_abacus_Person_Id = abacus_Person_Id;
	}

	public String getFirst_Name() {
		return _first_Name;
	}

	public void setFirst_Name(String first_Name) {
		_first_Name = first_Name;
	}

	public String getLast_Name() {
		return _last_Name;
	}

	public void setLast_Name(String last_Name) {
		_last_Name = last_Name;
	}

	public String getEmail() {
		return _email;
	}

	public void setEmail(String email) {
		_email = email;
	}

	public String getAddress() {
		return _address;
	}

	public void setAddress(String address) {
		_address = address;
	}

	public String getAddress_Type() {
		return _address_Type;
	}

	public void setAddress_Type(String address_Type) {
		_address_Type = address_Type;
	}

	public String getCountry() {
		return _country;
	}

	public void setCountry(String country) {
		_country = country;
	}

	public String getGender() {
		return _gender;
	}

	public void setGender(String gender) {
		_gender = gender;
	}

	public String getSalutation() {
		return _salutation;
	}

	public void setSalutation(String salutation) {
		_salutation = salutation;
	}

	public String getStatus() {
		return _status;
	}

	public void setStatus(String status) {
		_status = status;
	}

	public long getPhone_Number() {
		return _phone_Number;
	}

	public void setPhone_Number(long phone_Number) {
		_phone_Number = phone_Number;
	}

	public String getPhoto_URL() {
		return _photo_URL;
	}

	public void setPhoto_URL(String photo_URL) {
		_photo_URL = photo_URL;
	}

	public String getOccupation() {
		return _occupation;
	}

	public void setOccupation(String occupation) {
		_occupation = occupation;
	}

	public String getChanged_By() {
		return _changed_By;
	}

	public void setChanged_By(String changed_By) {
		_changed_By = changed_By;
	}

	public long getChanged_Time() {
		return _changed_Time;
	}

	public void setChanged_Time(long changed_Time) {
		_changed_Time = changed_Time;
	}

	public BaseModel<?> getPersonRemoteModel() {
		return _personRemoteModel;
	}

	public void setPersonRemoteModel(BaseModel<?> personRemoteModel) {
		_personRemoteModel = personRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			PersonLocalServiceUtil.addPerson(this);
		}
		else {
			PersonLocalServiceUtil.updatePerson(this);
		}
	}

	@Override
	public Person toEscapedModel() {
		return (Person)Proxy.newProxyInstance(Person.class.getClassLoader(),
			new Class[] { Person.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		PersonClp clone = new PersonClp();

		clone.setAbacus_Person_Id(getAbacus_Person_Id());
		clone.setFirst_Name(getFirst_Name());
		clone.setLast_Name(getLast_Name());
		clone.setEmail(getEmail());
		clone.setAddress(getAddress());
		clone.setAddress_Type(getAddress_Type());
		clone.setCountry(getCountry());
		clone.setGender(getGender());
		clone.setSalutation(getSalutation());
		clone.setStatus(getStatus());
		clone.setPhone_Number(getPhone_Number());
		clone.setPhoto_URL(getPhoto_URL());
		clone.setOccupation(getOccupation());
		clone.setChanged_By(getChanged_By());
		clone.setChanged_Time(getChanged_Time());

		return clone;
	}

	public int compareTo(Person person) {
		int value = 0;

		if (getAbacus_Person_Id() < person.getAbacus_Person_Id()) {
			value = -1;
		}
		else if (getAbacus_Person_Id() > person.getAbacus_Person_Id()) {
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

		PersonClp person = null;

		try {
			person = (PersonClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = person.getPrimaryKey();

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
		StringBundler sb = new StringBundler(31);

		sb.append("{abacus_Person_Id=");
		sb.append(getAbacus_Person_Id());
		sb.append(", first_Name=");
		sb.append(getFirst_Name());
		sb.append(", last_Name=");
		sb.append(getLast_Name());
		sb.append(", email=");
		sb.append(getEmail());
		sb.append(", address=");
		sb.append(getAddress());
		sb.append(", address_Type=");
		sb.append(getAddress_Type());
		sb.append(", country=");
		sb.append(getCountry());
		sb.append(", gender=");
		sb.append(getGender());
		sb.append(", salutation=");
		sb.append(getSalutation());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append(", phone_Number=");
		sb.append(getPhone_Number());
		sb.append(", photo_URL=");
		sb.append(getPhoto_URL());
		sb.append(", occupation=");
		sb.append(getOccupation());
		sb.append(", changed_By=");
		sb.append(getChanged_By());
		sb.append(", changed_Time=");
		sb.append(getChanged_Time());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(49);

		sb.append("<model><model-name>");
		sb.append("org.goodreturn.model.Person");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>abacus_Person_Id</column-name><column-value><![CDATA[");
		sb.append(getAbacus_Person_Id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>first_Name</column-name><column-value><![CDATA[");
		sb.append(getFirst_Name());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>last_Name</column-name><column-value><![CDATA[");
		sb.append(getLast_Name());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>email</column-name><column-value><![CDATA[");
		sb.append(getEmail());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>address</column-name><column-value><![CDATA[");
		sb.append(getAddress());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>address_Type</column-name><column-value><![CDATA[");
		sb.append(getAddress_Type());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>country</column-name><column-value><![CDATA[");
		sb.append(getCountry());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>gender</column-name><column-value><![CDATA[");
		sb.append(getGender());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>salutation</column-name><column-value><![CDATA[");
		sb.append(getSalutation());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>phone_Number</column-name><column-value><![CDATA[");
		sb.append(getPhone_Number());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>photo_URL</column-name><column-value><![CDATA[");
		sb.append(getPhoto_URL());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>occupation</column-name><column-value><![CDATA[");
		sb.append(getOccupation());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>changed_By</column-name><column-value><![CDATA[");
		sb.append(getChanged_By());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>changed_Time</column-name><column-value><![CDATA[");
		sb.append(getChanged_Time());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _abacus_Person_Id;
	private String _first_Name;
	private String _last_Name;
	private String _email;
	private String _address;
	private String _address_Type;
	private String _country;
	private String _gender;
	private String _salutation;
	private String _status;
	private long _phone_Number;
	private String _photo_URL;
	private String _occupation;
	private String _changed_By;
	private long _changed_Time;
	private BaseModel<?> _personRemoteModel;
}