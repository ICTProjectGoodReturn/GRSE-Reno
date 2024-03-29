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

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Lender}.
 * </p>
 *
 * @author    gilaa004
 * @see       Lender
 * @generated
 */
public class LenderWrapper implements Lender, ModelWrapper<Lender> {
	public LenderWrapper(Lender lender) {
		_lender = lender;
	}

	public Class<?> getModelClass() {
		return Lender.class;
	}

	public String getModelClassName() {
		return Lender.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("lender_Id", getLender_Id());
		attributes.put("abacus_Person_Id", getAbacus_Person_Id());
		attributes.put("certificate_Id", getCertificate_Id());
		attributes.put("employer_Name", getEmployer_Name());
		attributes.put("comment", getComment());
		attributes.put("heard_Of_Us", getHeard_Of_Us());
		attributes.put("display_Name", getDisplay_Name());
		attributes.put("date_Of_Birth", getDate_Of_Birth());
		attributes.put("reason_For_Lending", getReason_For_Lending());
		attributes.put("about_Themselves", getAbout_Themselves());
		attributes.put("personal_Link", getPersonal_Link());
		attributes.put("is_Public_Profile", getIs_Public_Profile());
		attributes.put("recieve_Emails", getRecieve_Emails());
		attributes.put("recieve_GoodReturn_Info", getRecieve_GoodReturn_Info());
		attributes.put("is_Anonymous", getIs_Anonymous());
		attributes.put("is_Validated", getIs_Validated());
		attributes.put("password", getPassword());
		attributes.put("last_Login_Date", getLast_Login_Date());
		attributes.put("featured_Lender", getFeatured_Lender());
		attributes.put("is_Loan_Donation", getIs_Loan_Donation());
		attributes.put("changed_By", getChanged_By());
		attributes.put("changed_Time", getChanged_Time());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long lender_Id = (Long)attributes.get("lender_Id");

		if (lender_Id != null) {
			setLender_Id(lender_Id);
		}

		Long abacus_Person_Id = (Long)attributes.get("abacus_Person_Id");

		if (abacus_Person_Id != null) {
			setAbacus_Person_Id(abacus_Person_Id);
		}

		Long certificate_Id = (Long)attributes.get("certificate_Id");

		if (certificate_Id != null) {
			setCertificate_Id(certificate_Id);
		}

		String employer_Name = (String)attributes.get("employer_Name");

		if (employer_Name != null) {
			setEmployer_Name(employer_Name);
		}

		String comment = (String)attributes.get("comment");

		if (comment != null) {
			setComment(comment);
		}

		String heard_Of_Us = (String)attributes.get("heard_Of_Us");

		if (heard_Of_Us != null) {
			setHeard_Of_Us(heard_Of_Us);
		}

		String display_Name = (String)attributes.get("display_Name");

		if (display_Name != null) {
			setDisplay_Name(display_Name);
		}

		Date date_Of_Birth = (Date)attributes.get("date_Of_Birth");

		if (date_Of_Birth != null) {
			setDate_Of_Birth(date_Of_Birth);
		}

		String reason_For_Lending = (String)attributes.get("reason_For_Lending");

		if (reason_For_Lending != null) {
			setReason_For_Lending(reason_For_Lending);
		}

		String about_Themselves = (String)attributes.get("about_Themselves");

		if (about_Themselves != null) {
			setAbout_Themselves(about_Themselves);
		}

		String personal_Link = (String)attributes.get("personal_Link");

		if (personal_Link != null) {
			setPersonal_Link(personal_Link);
		}

		Boolean is_Public_Profile = (Boolean)attributes.get("is_Public_Profile");

		if (is_Public_Profile != null) {
			setIs_Public_Profile(is_Public_Profile);
		}

		Boolean recieve_Emails = (Boolean)attributes.get("recieve_Emails");

		if (recieve_Emails != null) {
			setRecieve_Emails(recieve_Emails);
		}

		Boolean recieve_GoodReturn_Info = (Boolean)attributes.get(
				"recieve_GoodReturn_Info");

		if (recieve_GoodReturn_Info != null) {
			setRecieve_GoodReturn_Info(recieve_GoodReturn_Info);
		}

		Boolean is_Anonymous = (Boolean)attributes.get("is_Anonymous");

		if (is_Anonymous != null) {
			setIs_Anonymous(is_Anonymous);
		}

		Boolean is_Validated = (Boolean)attributes.get("is_Validated");

		if (is_Validated != null) {
			setIs_Validated(is_Validated);
		}

		String password = (String)attributes.get("password");

		if (password != null) {
			setPassword(password);
		}

		Date last_Login_Date = (Date)attributes.get("last_Login_Date");

		if (last_Login_Date != null) {
			setLast_Login_Date(last_Login_Date);
		}

		String featured_Lender = (String)attributes.get("featured_Lender");

		if (featured_Lender != null) {
			setFeatured_Lender(featured_Lender);
		}

		Boolean is_Loan_Donation = (Boolean)attributes.get("is_Loan_Donation");

		if (is_Loan_Donation != null) {
			setIs_Loan_Donation(is_Loan_Donation);
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
	* Returns the primary key of this lender.
	*
	* @return the primary key of this lender
	*/
	public long getPrimaryKey() {
		return _lender.getPrimaryKey();
	}

	/**
	* Sets the primary key of this lender.
	*
	* @param primaryKey the primary key of this lender
	*/
	public void setPrimaryKey(long primaryKey) {
		_lender.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the lender_ ID of this lender.
	*
	* @return the lender_ ID of this lender
	*/
	public long getLender_Id() {
		return _lender.getLender_Id();
	}

	/**
	* Sets the lender_ ID of this lender.
	*
	* @param lender_Id the lender_ ID of this lender
	*/
	public void setLender_Id(long lender_Id) {
		_lender.setLender_Id(lender_Id);
	}

	/**
	* Returns the abacus_ person_ ID of this lender.
	*
	* @return the abacus_ person_ ID of this lender
	*/
	public long getAbacus_Person_Id() {
		return _lender.getAbacus_Person_Id();
	}

	/**
	* Sets the abacus_ person_ ID of this lender.
	*
	* @param abacus_Person_Id the abacus_ person_ ID of this lender
	*/
	public void setAbacus_Person_Id(long abacus_Person_Id) {
		_lender.setAbacus_Person_Id(abacus_Person_Id);
	}

	/**
	* Returns the certificate_ ID of this lender.
	*
	* @return the certificate_ ID of this lender
	*/
	public long getCertificate_Id() {
		return _lender.getCertificate_Id();
	}

	/**
	* Sets the certificate_ ID of this lender.
	*
	* @param certificate_Id the certificate_ ID of this lender
	*/
	public void setCertificate_Id(long certificate_Id) {
		_lender.setCertificate_Id(certificate_Id);
	}

	/**
	* Returns the employer_ name of this lender.
	*
	* @return the employer_ name of this lender
	*/
	public java.lang.String getEmployer_Name() {
		return _lender.getEmployer_Name();
	}

	/**
	* Sets the employer_ name of this lender.
	*
	* @param employer_Name the employer_ name of this lender
	*/
	public void setEmployer_Name(java.lang.String employer_Name) {
		_lender.setEmployer_Name(employer_Name);
	}

	/**
	* Returns the comment of this lender.
	*
	* @return the comment of this lender
	*/
	public java.lang.String getComment() {
		return _lender.getComment();
	}

	/**
	* Sets the comment of this lender.
	*
	* @param comment the comment of this lender
	*/
	public void setComment(java.lang.String comment) {
		_lender.setComment(comment);
	}

	/**
	* Returns the heard_ of_ us of this lender.
	*
	* @return the heard_ of_ us of this lender
	*/
	public java.lang.String getHeard_Of_Us() {
		return _lender.getHeard_Of_Us();
	}

	/**
	* Sets the heard_ of_ us of this lender.
	*
	* @param heard_Of_Us the heard_ of_ us of this lender
	*/
	public void setHeard_Of_Us(java.lang.String heard_Of_Us) {
		_lender.setHeard_Of_Us(heard_Of_Us);
	}

	/**
	* Returns the display_ name of this lender.
	*
	* @return the display_ name of this lender
	*/
	public java.lang.String getDisplay_Name() {
		return _lender.getDisplay_Name();
	}

	/**
	* Sets the display_ name of this lender.
	*
	* @param display_Name the display_ name of this lender
	*/
	public void setDisplay_Name(java.lang.String display_Name) {
		_lender.setDisplay_Name(display_Name);
	}

	/**
	* Returns the date_ of_ birth of this lender.
	*
	* @return the date_ of_ birth of this lender
	*/
	public java.util.Date getDate_Of_Birth() {
		return _lender.getDate_Of_Birth();
	}

	/**
	* Sets the date_ of_ birth of this lender.
	*
	* @param date_Of_Birth the date_ of_ birth of this lender
	*/
	public void setDate_Of_Birth(java.util.Date date_Of_Birth) {
		_lender.setDate_Of_Birth(date_Of_Birth);
	}

	/**
	* Returns the reason_ for_ lending of this lender.
	*
	* @return the reason_ for_ lending of this lender
	*/
	public java.lang.String getReason_For_Lending() {
		return _lender.getReason_For_Lending();
	}

	/**
	* Sets the reason_ for_ lending of this lender.
	*
	* @param reason_For_Lending the reason_ for_ lending of this lender
	*/
	public void setReason_For_Lending(java.lang.String reason_For_Lending) {
		_lender.setReason_For_Lending(reason_For_Lending);
	}

	/**
	* Returns the about_ themselves of this lender.
	*
	* @return the about_ themselves of this lender
	*/
	public java.lang.String getAbout_Themselves() {
		return _lender.getAbout_Themselves();
	}

	/**
	* Sets the about_ themselves of this lender.
	*
	* @param about_Themselves the about_ themselves of this lender
	*/
	public void setAbout_Themselves(java.lang.String about_Themselves) {
		_lender.setAbout_Themselves(about_Themselves);
	}

	/**
	* Returns the personal_ link of this lender.
	*
	* @return the personal_ link of this lender
	*/
	public java.lang.String getPersonal_Link() {
		return _lender.getPersonal_Link();
	}

	/**
	* Sets the personal_ link of this lender.
	*
	* @param personal_Link the personal_ link of this lender
	*/
	public void setPersonal_Link(java.lang.String personal_Link) {
		_lender.setPersonal_Link(personal_Link);
	}

	/**
	* Returns the is_ public_ profile of this lender.
	*
	* @return the is_ public_ profile of this lender
	*/
	public boolean getIs_Public_Profile() {
		return _lender.getIs_Public_Profile();
	}

	/**
	* Returns <code>true</code> if this lender is is_ public_ profile.
	*
	* @return <code>true</code> if this lender is is_ public_ profile; <code>false</code> otherwise
	*/
	public boolean isIs_Public_Profile() {
		return _lender.isIs_Public_Profile();
	}

	/**
	* Sets whether this lender is is_ public_ profile.
	*
	* @param is_Public_Profile the is_ public_ profile of this lender
	*/
	public void setIs_Public_Profile(boolean is_Public_Profile) {
		_lender.setIs_Public_Profile(is_Public_Profile);
	}

	/**
	* Returns the recieve_ emails of this lender.
	*
	* @return the recieve_ emails of this lender
	*/
	public boolean getRecieve_Emails() {
		return _lender.getRecieve_Emails();
	}

	/**
	* Returns <code>true</code> if this lender is recieve_ emails.
	*
	* @return <code>true</code> if this lender is recieve_ emails; <code>false</code> otherwise
	*/
	public boolean isRecieve_Emails() {
		return _lender.isRecieve_Emails();
	}

	/**
	* Sets whether this lender is recieve_ emails.
	*
	* @param recieve_Emails the recieve_ emails of this lender
	*/
	public void setRecieve_Emails(boolean recieve_Emails) {
		_lender.setRecieve_Emails(recieve_Emails);
	}

	/**
	* Returns the recieve_ good return_ info of this lender.
	*
	* @return the recieve_ good return_ info of this lender
	*/
	public boolean getRecieve_GoodReturn_Info() {
		return _lender.getRecieve_GoodReturn_Info();
	}

	/**
	* Returns <code>true</code> if this lender is recieve_ good return_ info.
	*
	* @return <code>true</code> if this lender is recieve_ good return_ info; <code>false</code> otherwise
	*/
	public boolean isRecieve_GoodReturn_Info() {
		return _lender.isRecieve_GoodReturn_Info();
	}

	/**
	* Sets whether this lender is recieve_ good return_ info.
	*
	* @param recieve_GoodReturn_Info the recieve_ good return_ info of this lender
	*/
	public void setRecieve_GoodReturn_Info(boolean recieve_GoodReturn_Info) {
		_lender.setRecieve_GoodReturn_Info(recieve_GoodReturn_Info);
	}

	/**
	* Returns the is_ anonymous of this lender.
	*
	* @return the is_ anonymous of this lender
	*/
	public boolean getIs_Anonymous() {
		return _lender.getIs_Anonymous();
	}

	/**
	* Returns <code>true</code> if this lender is is_ anonymous.
	*
	* @return <code>true</code> if this lender is is_ anonymous; <code>false</code> otherwise
	*/
	public boolean isIs_Anonymous() {
		return _lender.isIs_Anonymous();
	}

	/**
	* Sets whether this lender is is_ anonymous.
	*
	* @param is_Anonymous the is_ anonymous of this lender
	*/
	public void setIs_Anonymous(boolean is_Anonymous) {
		_lender.setIs_Anonymous(is_Anonymous);
	}

	/**
	* Returns the is_ validated of this lender.
	*
	* @return the is_ validated of this lender
	*/
	public boolean getIs_Validated() {
		return _lender.getIs_Validated();
	}

	/**
	* Returns <code>true</code> if this lender is is_ validated.
	*
	* @return <code>true</code> if this lender is is_ validated; <code>false</code> otherwise
	*/
	public boolean isIs_Validated() {
		return _lender.isIs_Validated();
	}

	/**
	* Sets whether this lender is is_ validated.
	*
	* @param is_Validated the is_ validated of this lender
	*/
	public void setIs_Validated(boolean is_Validated) {
		_lender.setIs_Validated(is_Validated);
	}

	/**
	* Returns the password of this lender.
	*
	* @return the password of this lender
	*/
	public java.lang.String getPassword() {
		return _lender.getPassword();
	}

	/**
	* Sets the password of this lender.
	*
	* @param password the password of this lender
	*/
	public void setPassword(java.lang.String password) {
		_lender.setPassword(password);
	}

	/**
	* Returns the last_ login_ date of this lender.
	*
	* @return the last_ login_ date of this lender
	*/
	public java.util.Date getLast_Login_Date() {
		return _lender.getLast_Login_Date();
	}

	/**
	* Sets the last_ login_ date of this lender.
	*
	* @param last_Login_Date the last_ login_ date of this lender
	*/
	public void setLast_Login_Date(java.util.Date last_Login_Date) {
		_lender.setLast_Login_Date(last_Login_Date);
	}

	/**
	* Returns the featured_ lender of this lender.
	*
	* @return the featured_ lender of this lender
	*/
	public java.lang.String getFeatured_Lender() {
		return _lender.getFeatured_Lender();
	}

	/**
	* Sets the featured_ lender of this lender.
	*
	* @param featured_Lender the featured_ lender of this lender
	*/
	public void setFeatured_Lender(java.lang.String featured_Lender) {
		_lender.setFeatured_Lender(featured_Lender);
	}

	/**
	* Returns the is_ loan_ donation of this lender.
	*
	* @return the is_ loan_ donation of this lender
	*/
	public boolean getIs_Loan_Donation() {
		return _lender.getIs_Loan_Donation();
	}

	/**
	* Returns <code>true</code> if this lender is is_ loan_ donation.
	*
	* @return <code>true</code> if this lender is is_ loan_ donation; <code>false</code> otherwise
	*/
	public boolean isIs_Loan_Donation() {
		return _lender.isIs_Loan_Donation();
	}

	/**
	* Sets whether this lender is is_ loan_ donation.
	*
	* @param is_Loan_Donation the is_ loan_ donation of this lender
	*/
	public void setIs_Loan_Donation(boolean is_Loan_Donation) {
		_lender.setIs_Loan_Donation(is_Loan_Donation);
	}

	/**
	* Returns the changed_ by of this lender.
	*
	* @return the changed_ by of this lender
	*/
	public java.lang.String getChanged_By() {
		return _lender.getChanged_By();
	}

	/**
	* Sets the changed_ by of this lender.
	*
	* @param changed_By the changed_ by of this lender
	*/
	public void setChanged_By(java.lang.String changed_By) {
		_lender.setChanged_By(changed_By);
	}

	/**
	* Returns the changed_ time of this lender.
	*
	* @return the changed_ time of this lender
	*/
	public long getChanged_Time() {
		return _lender.getChanged_Time();
	}

	/**
	* Sets the changed_ time of this lender.
	*
	* @param changed_Time the changed_ time of this lender
	*/
	public void setChanged_Time(long changed_Time) {
		_lender.setChanged_Time(changed_Time);
	}

	/**
	* Returns the group ID of this lender.
	*
	* @return the group ID of this lender
	*/
	public long getGroupId() {
		return _lender.getGroupId();
	}

	/**
	* Sets the group ID of this lender.
	*
	* @param groupId the group ID of this lender
	*/
	public void setGroupId(long groupId) {
		_lender.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this lender.
	*
	* @return the company ID of this lender
	*/
	public long getCompanyId() {
		return _lender.getCompanyId();
	}

	/**
	* Sets the company ID of this lender.
	*
	* @param companyId the company ID of this lender
	*/
	public void setCompanyId(long companyId) {
		_lender.setCompanyId(companyId);
	}

	public boolean isNew() {
		return _lender.isNew();
	}

	public void setNew(boolean n) {
		_lender.setNew(n);
	}

	public boolean isCachedModel() {
		return _lender.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_lender.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _lender.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _lender.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_lender.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _lender.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_lender.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new LenderWrapper((Lender)_lender.clone());
	}

	public int compareTo(org.goodreturn.model.Lender lender) {
		return _lender.compareTo(lender);
	}

	@Override
	public int hashCode() {
		return _lender.hashCode();
	}

	public com.liferay.portal.model.CacheModel<org.goodreturn.model.Lender> toCacheModel() {
		return _lender.toCacheModel();
	}

	public org.goodreturn.model.Lender toEscapedModel() {
		return new LenderWrapper(_lender.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _lender.toString();
	}

	public java.lang.String toXmlString() {
		return _lender.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_lender.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public Lender getWrappedLender() {
		return _lender;
	}

	public Lender getWrappedModel() {
		return _lender;
	}

	public void resetOriginalValues() {
		_lender.resetOriginalValues();
	}

	private Lender _lender;
}