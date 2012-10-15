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

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Person}.
 * </p>
 *
 * @author    gilaa004
 * @see       Person
 * @generated
 */
public class PersonWrapper implements Person, ModelWrapper<Person> {
	public PersonWrapper(Person person) {
		_person = person;
	}

	public Class<?> getModelClass() {
		return Person.class;
	}

	public String getModelClassName() {
		return Person.class.getName();
	}

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
		attributes.put("status", getStatus());
		attributes.put("photo_URL", getPhoto_URL());
		attributes.put("occupation", getOccupation());

		return attributes;
	}

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

		String status = (String)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		String photo_URL = (String)attributes.get("photo_URL");

		if (photo_URL != null) {
			setPhoto_URL(photo_URL);
		}

		String occupation = (String)attributes.get("occupation");

		if (occupation != null) {
			setOccupation(occupation);
		}
	}

	/**
	* Returns the primary key of this person.
	*
	* @return the primary key of this person
	*/
	public long getPrimaryKey() {
		return _person.getPrimaryKey();
	}

	/**
	* Sets the primary key of this person.
	*
	* @param primaryKey the primary key of this person
	*/
	public void setPrimaryKey(long primaryKey) {
		_person.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the abacus_ person_ ID of this person.
	*
	* @return the abacus_ person_ ID of this person
	*/
	public long getAbacus_Person_Id() {
		return _person.getAbacus_Person_Id();
	}

	/**
	* Sets the abacus_ person_ ID of this person.
	*
	* @param abacus_Person_Id the abacus_ person_ ID of this person
	*/
	public void setAbacus_Person_Id(long abacus_Person_Id) {
		_person.setAbacus_Person_Id(abacus_Person_Id);
	}

	/**
	* Returns the first_ name of this person.
	*
	* @return the first_ name of this person
	*/
	public java.lang.String getFirst_Name() {
		return _person.getFirst_Name();
	}

	/**
	* Sets the first_ name of this person.
	*
	* @param first_Name the first_ name of this person
	*/
	public void setFirst_Name(java.lang.String first_Name) {
		_person.setFirst_Name(first_Name);
	}

	/**
	* Returns the last_ name of this person.
	*
	* @return the last_ name of this person
	*/
	public java.lang.String getLast_Name() {
		return _person.getLast_Name();
	}

	/**
	* Sets the last_ name of this person.
	*
	* @param last_Name the last_ name of this person
	*/
	public void setLast_Name(java.lang.String last_Name) {
		_person.setLast_Name(last_Name);
	}

	/**
	* Returns the email of this person.
	*
	* @return the email of this person
	*/
	public java.lang.String getEmail() {
		return _person.getEmail();
	}

	/**
	* Sets the email of this person.
	*
	* @param email the email of this person
	*/
	public void setEmail(java.lang.String email) {
		_person.setEmail(email);
	}

	/**
	* Returns the address of this person.
	*
	* @return the address of this person
	*/
	public java.lang.String getAddress() {
		return _person.getAddress();
	}

	/**
	* Sets the address of this person.
	*
	* @param address the address of this person
	*/
	public void setAddress(java.lang.String address) {
		_person.setAddress(address);
	}

	/**
	* Returns the address_ type of this person.
	*
	* @return the address_ type of this person
	*/
	public java.lang.String getAddress_Type() {
		return _person.getAddress_Type();
	}

	/**
	* Sets the address_ type of this person.
	*
	* @param address_Type the address_ type of this person
	*/
	public void setAddress_Type(java.lang.String address_Type) {
		_person.setAddress_Type(address_Type);
	}

	/**
	* Returns the country of this person.
	*
	* @return the country of this person
	*/
	public java.lang.String getCountry() {
		return _person.getCountry();
	}

	/**
	* Sets the country of this person.
	*
	* @param country the country of this person
	*/
	public void setCountry(java.lang.String country) {
		_person.setCountry(country);
	}

	/**
	* Returns the gender of this person.
	*
	* @return the gender of this person
	*/
	public java.lang.String getGender() {
		return _person.getGender();
	}

	/**
	* Sets the gender of this person.
	*
	* @param gender the gender of this person
	*/
	public void setGender(java.lang.String gender) {
		_person.setGender(gender);
	}

	/**
	* Returns the status of this person.
	*
	* @return the status of this person
	*/
	public java.lang.String getStatus() {
		return _person.getStatus();
	}

	/**
	* Sets the status of this person.
	*
	* @param status the status of this person
	*/
	public void setStatus(java.lang.String status) {
		_person.setStatus(status);
	}

	/**
	* Returns the photo_ u r l of this person.
	*
	* @return the photo_ u r l of this person
	*/
	public java.lang.String getPhoto_URL() {
		return _person.getPhoto_URL();
	}

	/**
	* Sets the photo_ u r l of this person.
	*
	* @param photo_URL the photo_ u r l of this person
	*/
	public void setPhoto_URL(java.lang.String photo_URL) {
		_person.setPhoto_URL(photo_URL);
	}

	/**
	* Returns the occupation of this person.
	*
	* @return the occupation of this person
	*/
	public java.lang.String getOccupation() {
		return _person.getOccupation();
	}

	/**
	* Sets the occupation of this person.
	*
	* @param occupation the occupation of this person
	*/
	public void setOccupation(java.lang.String occupation) {
		_person.setOccupation(occupation);
	}

	public boolean isNew() {
		return _person.isNew();
	}

	public void setNew(boolean n) {
		_person.setNew(n);
	}

	public boolean isCachedModel() {
		return _person.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_person.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _person.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _person.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_person.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _person.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_person.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new PersonWrapper((Person)_person.clone());
	}

	public int compareTo(org.GoodReturn.model.Person person) {
		return _person.compareTo(person);
	}

	@Override
	public int hashCode() {
		return _person.hashCode();
	}

	public com.liferay.portal.model.CacheModel<org.GoodReturn.model.Person> toCacheModel() {
		return _person.toCacheModel();
	}

	public org.GoodReturn.model.Person toEscapedModel() {
		return new PersonWrapper(_person.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _person.toString();
	}

	public java.lang.String toXmlString() {
		return _person.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_person.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public Person getWrappedPerson() {
		return _person;
	}

	public Person getWrappedModel() {
		return _person;
	}

	public void resetOriginalValues() {
		_person.resetOriginalValues();
	}

	private Person _person;
}