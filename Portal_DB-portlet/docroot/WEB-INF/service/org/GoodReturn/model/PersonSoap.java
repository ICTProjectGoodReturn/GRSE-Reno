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
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link org.GoodReturn.service.http.PersonServiceSoap}.
 *
 * @author    gilaa004
 * @see       org.GoodReturn.service.http.PersonServiceSoap
 * @generated
 */
public class PersonSoap implements Serializable {
	public static PersonSoap toSoapModel(Person model) {
		PersonSoap soapModel = new PersonSoap();

		soapModel.setAbacus_Person_Id(model.getAbacus_Person_Id());
		soapModel.setFirst_Name(model.getFirst_Name());
		soapModel.setLast_Name(model.getLast_Name());
		soapModel.setEmail(model.getEmail());
		soapModel.setAddress(model.getAddress());
		soapModel.setAddress_Type(model.getAddress_Type());
		soapModel.setCountry(model.getCountry());
		soapModel.setGender(model.getGender());
		soapModel.setStatus(model.getStatus());
		soapModel.setPhoto_URL(model.getPhoto_URL());
		soapModel.setOccupation(model.getOccupation());

		return soapModel;
	}

	public static PersonSoap[] toSoapModels(Person[] models) {
		PersonSoap[] soapModels = new PersonSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static PersonSoap[][] toSoapModels(Person[][] models) {
		PersonSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new PersonSoap[models.length][models[0].length];
		}
		else {
			soapModels = new PersonSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static PersonSoap[] toSoapModels(List<Person> models) {
		List<PersonSoap> soapModels = new ArrayList<PersonSoap>(models.size());

		for (Person model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new PersonSoap[soapModels.size()]);
	}

	public PersonSoap() {
	}

	public long getPrimaryKey() {
		return _abacus_Person_Id;
	}

	public void setPrimaryKey(long pk) {
		setAbacus_Person_Id(pk);
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

	public String getStatus() {
		return _status;
	}

	public void setStatus(String status) {
		_status = status;
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

	private long _abacus_Person_Id;
	private String _first_Name;
	private String _last_Name;
	private String _email;
	private String _address;
	private String _address_Type;
	private String _country;
	private String _gender;
	private String _status;
	private String _photo_URL;
	private String _occupation;
}