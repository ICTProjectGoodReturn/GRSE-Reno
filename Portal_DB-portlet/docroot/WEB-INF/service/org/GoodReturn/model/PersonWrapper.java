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
		attributes.put("salutation", getSalutation());
		attributes.put("status", getStatus());
		attributes.put("phone_Number", getPhone_Number());
		attributes.put("photo_URL", getPhoto_URL());
		attributes.put("occupation", getOccupation());
		attributes.put("changed_By", getChanged_By());
		attributes.put("changed_Time", getChanged_Time());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());

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

		String salutation = (String)attributes.get("salutation");

		if (salutation != null) {
			setSalutation(salutation);
		}

		String status = (String)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		String phone_Number = (String)attributes.get("phone_Number");

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

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
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
	* Returns the salutation of this person.
	*
	* @return the salutation of this person
	*/
	public java.lang.String getSalutation() {
		return _person.getSalutation();
	}

	/**
	* Sets the salutation of this person.
	*
	* @param salutation the salutation of this person
	*/
	public void setSalutation(java.lang.String salutation) {
		_person.setSalutation(salutation);
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
	* Returns the phone_ number of this person.
	*
	* @return the phone_ number of this person
	*/
	public java.lang.String getPhone_Number() {
		return _person.getPhone_Number();
	}

	/**
	* Sets the phone_ number of this person.
	*
	* @param phone_Number the phone_ number of this person
	*/
	public void setPhone_Number(java.lang.String phone_Number) {
		_person.setPhone_Number(phone_Number);
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

	/**
	* Returns the changed_ by of this person.
	*
	* @return the changed_ by of this person
	*/
	public java.lang.String getChanged_By() {
		return _person.getChanged_By();
	}

	/**
	* Sets the changed_ by of this person.
	*
	* @param changed_By the changed_ by of this person
	*/
	public void setChanged_By(java.lang.String changed_By) {
		_person.setChanged_By(changed_By);
	}

	/**
	* Returns the changed_ time of this person.
	*
	* @return the changed_ time of this person
	*/
	public long getChanged_Time() {
		return _person.getChanged_Time();
	}

	/**
	* Sets the changed_ time of this person.
	*
	* @param changed_Time the changed_ time of this person
	*/
	public void setChanged_Time(long changed_Time) {
		_person.setChanged_Time(changed_Time);
	}

	/**
	* Returns the group ID of this person.
	*
	* @return the group ID of this person
	*/
	public long getGroupId() {
		return _person.getGroupId();
	}

	/**
	* Sets the group ID of this person.
	*
	* @param groupId the group ID of this person
	*/
	public void setGroupId(long groupId) {
		_person.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this person.
	*
	* @return the company ID of this person
	*/
	public long getCompanyId() {
		return _person.getCompanyId();
	}

	/**
	* Sets the company ID of this person.
	*
	* @param companyId the company ID of this person
	*/
	public void setCompanyId(long companyId) {
		_person.setCompanyId(companyId);
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

	public int compareTo(org.goodreturn.model.Person person) {
		return _person.compareTo(person);
	}

	@Override
	public int hashCode() {
		return _person.hashCode();
	}

	public com.liferay.portal.model.CacheModel<org.goodreturn.model.Person> toCacheModel() {
		return _person.toCacheModel();
	}

	public org.goodreturn.model.Person toEscapedModel() {
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