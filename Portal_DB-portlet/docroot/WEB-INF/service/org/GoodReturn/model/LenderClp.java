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

import org.goodreturn.service.LenderLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author gilaa004
 */
public class LenderClp extends BaseModelImpl<Lender> implements Lender {
	public LenderClp() {
	}

	public Class<?> getModelClass() {
		return Lender.class;
	}

	public String getModelClassName() {
		return Lender.class.getName();
	}

	public long getPrimaryKey() {
		return _lender_Id;
	}

	public void setPrimaryKey(long primaryKey) {
		setLender_Id(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_lender_Id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
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

	@Override
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

	public long getLender_Id() {
		return _lender_Id;
	}

	public void setLender_Id(long lender_Id) {
		_lender_Id = lender_Id;
	}

	public long getAbacus_Person_Id() {
		return _abacus_Person_Id;
	}

	public void setAbacus_Person_Id(long abacus_Person_Id) {
		_abacus_Person_Id = abacus_Person_Id;
	}

	public long getCertificate_Id() {
		return _certificate_Id;
	}

	public void setCertificate_Id(long certificate_Id) {
		_certificate_Id = certificate_Id;
	}

	public String getEmployer_Name() {
		return _employer_Name;
	}

	public void setEmployer_Name(String employer_Name) {
		_employer_Name = employer_Name;
	}

	public String getComment() {
		return _comment;
	}

	public void setComment(String comment) {
		_comment = comment;
	}

	public String getHeard_Of_Us() {
		return _heard_Of_Us;
	}

	public void setHeard_Of_Us(String heard_Of_Us) {
		_heard_Of_Us = heard_Of_Us;
	}

	public String getDisplay_Name() {
		return _display_Name;
	}

	public void setDisplay_Name(String display_Name) {
		_display_Name = display_Name;
	}

	public Date getDate_Of_Birth() {
		return _date_Of_Birth;
	}

	public void setDate_Of_Birth(Date date_Of_Birth) {
		_date_Of_Birth = date_Of_Birth;
	}

	public String getReason_For_Lending() {
		return _reason_For_Lending;
	}

	public void setReason_For_Lending(String reason_For_Lending) {
		_reason_For_Lending = reason_For_Lending;
	}

	public String getAbout_Themselves() {
		return _about_Themselves;
	}

	public void setAbout_Themselves(String about_Themselves) {
		_about_Themselves = about_Themselves;
	}

	public String getPersonal_Link() {
		return _personal_Link;
	}

	public void setPersonal_Link(String personal_Link) {
		_personal_Link = personal_Link;
	}

	public boolean getIs_Public_Profile() {
		return _is_Public_Profile;
	}

	public boolean isIs_Public_Profile() {
		return _is_Public_Profile;
	}

	public void setIs_Public_Profile(boolean is_Public_Profile) {
		_is_Public_Profile = is_Public_Profile;
	}

	public boolean getRecieve_Emails() {
		return _recieve_Emails;
	}

	public boolean isRecieve_Emails() {
		return _recieve_Emails;
	}

	public void setRecieve_Emails(boolean recieve_Emails) {
		_recieve_Emails = recieve_Emails;
	}

	public boolean getRecieve_GoodReturn_Info() {
		return _recieve_GoodReturn_Info;
	}

	public boolean isRecieve_GoodReturn_Info() {
		return _recieve_GoodReturn_Info;
	}

	public void setRecieve_GoodReturn_Info(boolean recieve_GoodReturn_Info) {
		_recieve_GoodReturn_Info = recieve_GoodReturn_Info;
	}

	public boolean getIs_Anonymous() {
		return _is_Anonymous;
	}

	public boolean isIs_Anonymous() {
		return _is_Anonymous;
	}

	public void setIs_Anonymous(boolean is_Anonymous) {
		_is_Anonymous = is_Anonymous;
	}

	public boolean getIs_Validated() {
		return _is_Validated;
	}

	public boolean isIs_Validated() {
		return _is_Validated;
	}

	public void setIs_Validated(boolean is_Validated) {
		_is_Validated = is_Validated;
	}

	public String getPassword() {
		return _password;
	}

	public void setPassword(String password) {
		_password = password;
	}

	public Date getLast_Login_Date() {
		return _last_Login_Date;
	}

	public void setLast_Login_Date(Date last_Login_Date) {
		_last_Login_Date = last_Login_Date;
	}

	public String getFeatured_Lender() {
		return _featured_Lender;
	}

	public void setFeatured_Lender(String featured_Lender) {
		_featured_Lender = featured_Lender;
	}

	public boolean getIs_Loan_Donation() {
		return _is_Loan_Donation;
	}

	public boolean isIs_Loan_Donation() {
		return _is_Loan_Donation;
	}

	public void setIs_Loan_Donation(boolean is_Loan_Donation) {
		_is_Loan_Donation = is_Loan_Donation;
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

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public BaseModel<?> getLenderRemoteModel() {
		return _lenderRemoteModel;
	}

	public void setLenderRemoteModel(BaseModel<?> lenderRemoteModel) {
		_lenderRemoteModel = lenderRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			LenderLocalServiceUtil.addLender(this);
		}
		else {
			LenderLocalServiceUtil.updateLender(this);
		}
	}

	@Override
	public Lender toEscapedModel() {
		return (Lender)Proxy.newProxyInstance(Lender.class.getClassLoader(),
			new Class[] { Lender.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		LenderClp clone = new LenderClp();

		clone.setLender_Id(getLender_Id());
		clone.setAbacus_Person_Id(getAbacus_Person_Id());
		clone.setCertificate_Id(getCertificate_Id());
		clone.setEmployer_Name(getEmployer_Name());
		clone.setComment(getComment());
		clone.setHeard_Of_Us(getHeard_Of_Us());
		clone.setDisplay_Name(getDisplay_Name());
		clone.setDate_Of_Birth(getDate_Of_Birth());
		clone.setReason_For_Lending(getReason_For_Lending());
		clone.setAbout_Themselves(getAbout_Themselves());
		clone.setPersonal_Link(getPersonal_Link());
		clone.setIs_Public_Profile(getIs_Public_Profile());
		clone.setRecieve_Emails(getRecieve_Emails());
		clone.setRecieve_GoodReturn_Info(getRecieve_GoodReturn_Info());
		clone.setIs_Anonymous(getIs_Anonymous());
		clone.setIs_Validated(getIs_Validated());
		clone.setPassword(getPassword());
		clone.setLast_Login_Date(getLast_Login_Date());
		clone.setFeatured_Lender(getFeatured_Lender());
		clone.setIs_Loan_Donation(getIs_Loan_Donation());
		clone.setChanged_By(getChanged_By());
		clone.setChanged_Time(getChanged_Time());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());

		return clone;
	}

	public int compareTo(Lender lender) {
		int value = 0;

		if (getLender_Id() < lender.getLender_Id()) {
			value = -1;
		}
		else if (getLender_Id() > lender.getLender_Id()) {
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

		LenderClp lender = null;

		try {
			lender = (LenderClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = lender.getPrimaryKey();

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
		StringBundler sb = new StringBundler(49);

		sb.append("{lender_Id=");
		sb.append(getLender_Id());
		sb.append(", abacus_Person_Id=");
		sb.append(getAbacus_Person_Id());
		sb.append(", certificate_Id=");
		sb.append(getCertificate_Id());
		sb.append(", employer_Name=");
		sb.append(getEmployer_Name());
		sb.append(", comment=");
		sb.append(getComment());
		sb.append(", heard_Of_Us=");
		sb.append(getHeard_Of_Us());
		sb.append(", display_Name=");
		sb.append(getDisplay_Name());
		sb.append(", date_Of_Birth=");
		sb.append(getDate_Of_Birth());
		sb.append(", reason_For_Lending=");
		sb.append(getReason_For_Lending());
		sb.append(", about_Themselves=");
		sb.append(getAbout_Themselves());
		sb.append(", personal_Link=");
		sb.append(getPersonal_Link());
		sb.append(", is_Public_Profile=");
		sb.append(getIs_Public_Profile());
		sb.append(", recieve_Emails=");
		sb.append(getRecieve_Emails());
		sb.append(", recieve_GoodReturn_Info=");
		sb.append(getRecieve_GoodReturn_Info());
		sb.append(", is_Anonymous=");
		sb.append(getIs_Anonymous());
		sb.append(", is_Validated=");
		sb.append(getIs_Validated());
		sb.append(", password=");
		sb.append(getPassword());
		sb.append(", last_Login_Date=");
		sb.append(getLast_Login_Date());
		sb.append(", featured_Lender=");
		sb.append(getFeatured_Lender());
		sb.append(", is_Loan_Donation=");
		sb.append(getIs_Loan_Donation());
		sb.append(", changed_By=");
		sb.append(getChanged_By());
		sb.append(", changed_Time=");
		sb.append(getChanged_Time());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(76);

		sb.append("<model><model-name>");
		sb.append("org.goodreturn.model.Lender");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>lender_Id</column-name><column-value><![CDATA[");
		sb.append(getLender_Id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>abacus_Person_Id</column-name><column-value><![CDATA[");
		sb.append(getAbacus_Person_Id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>certificate_Id</column-name><column-value><![CDATA[");
		sb.append(getCertificate_Id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>employer_Name</column-name><column-value><![CDATA[");
		sb.append(getEmployer_Name());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>comment</column-name><column-value><![CDATA[");
		sb.append(getComment());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>heard_Of_Us</column-name><column-value><![CDATA[");
		sb.append(getHeard_Of_Us());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>display_Name</column-name><column-value><![CDATA[");
		sb.append(getDisplay_Name());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>date_Of_Birth</column-name><column-value><![CDATA[");
		sb.append(getDate_Of_Birth());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>reason_For_Lending</column-name><column-value><![CDATA[");
		sb.append(getReason_For_Lending());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>about_Themselves</column-name><column-value><![CDATA[");
		sb.append(getAbout_Themselves());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>personal_Link</column-name><column-value><![CDATA[");
		sb.append(getPersonal_Link());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>is_Public_Profile</column-name><column-value><![CDATA[");
		sb.append(getIs_Public_Profile());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>recieve_Emails</column-name><column-value><![CDATA[");
		sb.append(getRecieve_Emails());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>recieve_GoodReturn_Info</column-name><column-value><![CDATA[");
		sb.append(getRecieve_GoodReturn_Info());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>is_Anonymous</column-name><column-value><![CDATA[");
		sb.append(getIs_Anonymous());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>is_Validated</column-name><column-value><![CDATA[");
		sb.append(getIs_Validated());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>password</column-name><column-value><![CDATA[");
		sb.append(getPassword());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>last_Login_Date</column-name><column-value><![CDATA[");
		sb.append(getLast_Login_Date());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>featured_Lender</column-name><column-value><![CDATA[");
		sb.append(getFeatured_Lender());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>is_Loan_Donation</column-name><column-value><![CDATA[");
		sb.append(getIs_Loan_Donation());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>changed_By</column-name><column-value><![CDATA[");
		sb.append(getChanged_By());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>changed_Time</column-name><column-value><![CDATA[");
		sb.append(getChanged_Time());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _lender_Id;
	private long _abacus_Person_Id;
	private long _certificate_Id;
	private String _employer_Name;
	private String _comment;
	private String _heard_Of_Us;
	private String _display_Name;
	private Date _date_Of_Birth;
	private String _reason_For_Lending;
	private String _about_Themselves;
	private String _personal_Link;
	private boolean _is_Public_Profile;
	private boolean _recieve_Emails;
	private boolean _recieve_GoodReturn_Info;
	private boolean _is_Anonymous;
	private boolean _is_Validated;
	private String _password;
	private Date _last_Login_Date;
	private String _featured_Lender;
	private boolean _is_Loan_Donation;
	private String _changed_By;
	private long _changed_Time;
	private long _groupId;
	private long _companyId;
	private BaseModel<?> _lenderRemoteModel;
}