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

package com.test.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.test.service.BorrowerLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author gilaa004
 */
public class BorrowerClp extends BaseModelImpl<Borrower> implements Borrower {
	public BorrowerClp() {
	}

	public Class<?> getModelClass() {
		return Borrower.class;
	}

	public String getModelClassName() {
		return Borrower.class.getName();
	}

	public long getPrimaryKey() {
		return _abacus_Borrower_Id;
	}

	public void setPrimaryKey(long primaryKey) {
		setAbacus_Borrower_Id(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_abacus_Borrower_Id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("abacus_Borrower_Id", getAbacus_Borrower_Id());
		attributes.put("write_Off_Date", getWrite_Off_Date());
		attributes.put("phone", getPhone());
		attributes.put("wait_Time", getWait_Time());
		attributes.put("country", getCountry());
		attributes.put("amount_Needed", getAmount_Needed());
		attributes.put("amount_Needed_AUD", getAmount_Needed_AUD());
		attributes.put("type_Of_Person", getType_Of_Person());
		attributes.put("village", getVillage());
		attributes.put("district", getDistrict());
		attributes.put("pdf_Link", getPdf_Link());
		attributes.put("currency", getCurrency());
		attributes.put("date_Applied", getDate_Applied());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long abacus_Borrower_Id = (Long)attributes.get("abacus_Borrower_Id");

		if (abacus_Borrower_Id != null) {
			setAbacus_Borrower_Id(abacus_Borrower_Id);
		}

		Date write_Off_Date = (Date)attributes.get("write_Off_Date");

		if (write_Off_Date != null) {
			setWrite_Off_Date(write_Off_Date);
		}

		Long phone = (Long)attributes.get("phone");

		if (phone != null) {
			setPhone(phone);
		}

		Long wait_Time = (Long)attributes.get("wait_Time");

		if (wait_Time != null) {
			setWait_Time(wait_Time);
		}

		String country = (String)attributes.get("country");

		if (country != null) {
			setCountry(country);
		}

		Double amount_Needed = (Double)attributes.get("amount_Needed");

		if (amount_Needed != null) {
			setAmount_Needed(amount_Needed);
		}

		Double amount_Needed_AUD = (Double)attributes.get("amount_Needed_AUD");

		if (amount_Needed_AUD != null) {
			setAmount_Needed_AUD(amount_Needed_AUD);
		}

		String type_Of_Person = (String)attributes.get("type_Of_Person");

		if (type_Of_Person != null) {
			setType_Of_Person(type_Of_Person);
		}

		String village = (String)attributes.get("village");

		if (village != null) {
			setVillage(village);
		}

		String district = (String)attributes.get("district");

		if (district != null) {
			setDistrict(district);
		}

		String pdf_Link = (String)attributes.get("pdf_Link");

		if (pdf_Link != null) {
			setPdf_Link(pdf_Link);
		}

		Double currency = (Double)attributes.get("currency");

		if (currency != null) {
			setCurrency(currency);
		}

		Date date_Applied = (Date)attributes.get("date_Applied");

		if (date_Applied != null) {
			setDate_Applied(date_Applied);
		}
	}

	public long getAbacus_Borrower_Id() {
		return _abacus_Borrower_Id;
	}

	public void setAbacus_Borrower_Id(long abacus_Borrower_Id) {
		_abacus_Borrower_Id = abacus_Borrower_Id;
	}

	public Date getWrite_Off_Date() {
		return _write_Off_Date;
	}

	public void setWrite_Off_Date(Date write_Off_Date) {
		_write_Off_Date = write_Off_Date;
	}

	public long getPhone() {
		return _phone;
	}

	public void setPhone(long phone) {
		_phone = phone;
	}

	public long getWait_Time() {
		return _wait_Time;
	}

	public void setWait_Time(long wait_Time) {
		_wait_Time = wait_Time;
	}

	public String getCountry() {
		return _country;
	}

	public void setCountry(String country) {
		_country = country;
	}

	public double getAmount_Needed() {
		return _amount_Needed;
	}

	public void setAmount_Needed(double amount_Needed) {
		_amount_Needed = amount_Needed;
	}

	public double getAmount_Needed_AUD() {
		return _amount_Needed_AUD;
	}

	public void setAmount_Needed_AUD(double amount_Needed_AUD) {
		_amount_Needed_AUD = amount_Needed_AUD;
	}

	public String getType_Of_Person() {
		return _type_Of_Person;
	}

	public void setType_Of_Person(String type_Of_Person) {
		_type_Of_Person = type_Of_Person;
	}

	public String getVillage() {
		return _village;
	}

	public void setVillage(String village) {
		_village = village;
	}

	public String getDistrict() {
		return _district;
	}

	public void setDistrict(String district) {
		_district = district;
	}

	public String getPdf_Link() {
		return _pdf_Link;
	}

	public void setPdf_Link(String pdf_Link) {
		_pdf_Link = pdf_Link;
	}

	public double getCurrency() {
		return _currency;
	}

	public void setCurrency(double currency) {
		_currency = currency;
	}

	public Date getDate_Applied() {
		return _date_Applied;
	}

	public void setDate_Applied(Date date_Applied) {
		_date_Applied = date_Applied;
	}

	public BaseModel<?> getBorrowerRemoteModel() {
		return _borrowerRemoteModel;
	}

	public void setBorrowerRemoteModel(BaseModel<?> borrowerRemoteModel) {
		_borrowerRemoteModel = borrowerRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			BorrowerLocalServiceUtil.addBorrower(this);
		}
		else {
			BorrowerLocalServiceUtil.updateBorrower(this);
		}
	}

	@Override
	public Borrower toEscapedModel() {
		return (Borrower)Proxy.newProxyInstance(Borrower.class.getClassLoader(),
			new Class[] { Borrower.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		BorrowerClp clone = new BorrowerClp();

		clone.setAbacus_Borrower_Id(getAbacus_Borrower_Id());
		clone.setWrite_Off_Date(getWrite_Off_Date());
		clone.setPhone(getPhone());
		clone.setWait_Time(getWait_Time());
		clone.setCountry(getCountry());
		clone.setAmount_Needed(getAmount_Needed());
		clone.setAmount_Needed_AUD(getAmount_Needed_AUD());
		clone.setType_Of_Person(getType_Of_Person());
		clone.setVillage(getVillage());
		clone.setDistrict(getDistrict());
		clone.setPdf_Link(getPdf_Link());
		clone.setCurrency(getCurrency());
		clone.setDate_Applied(getDate_Applied());

		return clone;
	}

	public int compareTo(Borrower borrower) {
		int value = 0;

		if (getAmount_Needed() < borrower.getAmount_Needed()) {
			value = -1;
		}
		else if (getAmount_Needed() > borrower.getAmount_Needed()) {
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

		BorrowerClp borrower = null;

		try {
			borrower = (BorrowerClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = borrower.getPrimaryKey();

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
		StringBundler sb = new StringBundler(27);

		sb.append("{abacus_Borrower_Id=");
		sb.append(getAbacus_Borrower_Id());
		sb.append(", write_Off_Date=");
		sb.append(getWrite_Off_Date());
		sb.append(", phone=");
		sb.append(getPhone());
		sb.append(", wait_Time=");
		sb.append(getWait_Time());
		sb.append(", country=");
		sb.append(getCountry());
		sb.append(", amount_Needed=");
		sb.append(getAmount_Needed());
		sb.append(", amount_Needed_AUD=");
		sb.append(getAmount_Needed_AUD());
		sb.append(", type_Of_Person=");
		sb.append(getType_Of_Person());
		sb.append(", village=");
		sb.append(getVillage());
		sb.append(", district=");
		sb.append(getDistrict());
		sb.append(", pdf_Link=");
		sb.append(getPdf_Link());
		sb.append(", currency=");
		sb.append(getCurrency());
		sb.append(", date_Applied=");
		sb.append(getDate_Applied());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(43);

		sb.append("<model><model-name>");
		sb.append("com.test.model.Borrower");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>abacus_Borrower_Id</column-name><column-value><![CDATA[");
		sb.append(getAbacus_Borrower_Id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>write_Off_Date</column-name><column-value><![CDATA[");
		sb.append(getWrite_Off_Date());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>phone</column-name><column-value><![CDATA[");
		sb.append(getPhone());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>wait_Time</column-name><column-value><![CDATA[");
		sb.append(getWait_Time());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>country</column-name><column-value><![CDATA[");
		sb.append(getCountry());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>amount_Needed</column-name><column-value><![CDATA[");
		sb.append(getAmount_Needed());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>amount_Needed_AUD</column-name><column-value><![CDATA[");
		sb.append(getAmount_Needed_AUD());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>type_Of_Person</column-name><column-value><![CDATA[");
		sb.append(getType_Of_Person());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>village</column-name><column-value><![CDATA[");
		sb.append(getVillage());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>district</column-name><column-value><![CDATA[");
		sb.append(getDistrict());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>pdf_Link</column-name><column-value><![CDATA[");
		sb.append(getPdf_Link());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>currency</column-name><column-value><![CDATA[");
		sb.append(getCurrency());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>date_Applied</column-name><column-value><![CDATA[");
		sb.append(getDate_Applied());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _abacus_Borrower_Id;
	private Date _write_Off_Date;
	private long _phone;
	private long _wait_Time;
	private String _country;
	private double _amount_Needed;
	private double _amount_Needed_AUD;
	private String _type_Of_Person;
	private String _village;
	private String _district;
	private String _pdf_Link;
	private double _currency;
	private Date _date_Applied;
	private BaseModel<?> _borrowerRemoteModel;
}