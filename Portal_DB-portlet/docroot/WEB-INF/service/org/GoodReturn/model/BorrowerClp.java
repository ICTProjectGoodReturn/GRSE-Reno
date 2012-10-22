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

import org.goodreturn.service.BorrowerLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

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
		return _borrower_Id;
	}

	public void setPrimaryKey(long primaryKey) {
		setBorrower_Id(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_borrower_Id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("borrower_Id", getBorrower_Id());
		attributes.put("abacus_Person_Id", getAbacus_Person_Id());
		attributes.put("village", getVillage());
		attributes.put("district", getDistrict());
		attributes.put("pdf_Link", getPdf_Link());
		attributes.put("currency", getCurrency());
		attributes.put("changed_By", getChanged_By());
		attributes.put("changed_Time", getChanged_Time());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long borrower_Id = (Long)attributes.get("borrower_Id");

		if (borrower_Id != null) {
			setBorrower_Id(borrower_Id);
		}

		Long abacus_Person_Id = (Long)attributes.get("abacus_Person_Id");

		if (abacus_Person_Id != null) {
			setAbacus_Person_Id(abacus_Person_Id);
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

		String changed_By = (String)attributes.get("changed_By");

		if (changed_By != null) {
			setChanged_By(changed_By);
		}

		Long changed_Time = (Long)attributes.get("changed_Time");

		if (changed_Time != null) {
			setChanged_Time(changed_Time);
		}
	}

	public long getBorrower_Id() {
		return _borrower_Id;
	}

	public void setBorrower_Id(long borrower_Id) {
		_borrower_Id = borrower_Id;
	}

	public long getAbacus_Person_Id() {
		return _abacus_Person_Id;
	}

	public void setAbacus_Person_Id(long abacus_Person_Id) {
		_abacus_Person_Id = abacus_Person_Id;
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

		clone.setBorrower_Id(getBorrower_Id());
		clone.setAbacus_Person_Id(getAbacus_Person_Id());
		clone.setVillage(getVillage());
		clone.setDistrict(getDistrict());
		clone.setPdf_Link(getPdf_Link());
		clone.setCurrency(getCurrency());
		clone.setChanged_By(getChanged_By());
		clone.setChanged_Time(getChanged_Time());

		return clone;
	}

	public int compareTo(Borrower borrower) {
		int value = 0;

		if (getBorrower_Id() < borrower.getBorrower_Id()) {
			value = -1;
		}
		else if (getBorrower_Id() > borrower.getBorrower_Id()) {
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
		StringBundler sb = new StringBundler(17);

		sb.append("{borrower_Id=");
		sb.append(getBorrower_Id());
		sb.append(", abacus_Person_Id=");
		sb.append(getAbacus_Person_Id());
		sb.append(", village=");
		sb.append(getVillage());
		sb.append(", district=");
		sb.append(getDistrict());
		sb.append(", pdf_Link=");
		sb.append(getPdf_Link());
		sb.append(", currency=");
		sb.append(getCurrency());
		sb.append(", changed_By=");
		sb.append(getChanged_By());
		sb.append(", changed_Time=");
		sb.append(getChanged_Time());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(28);

		sb.append("<model><model-name>");
		sb.append("org.goodreturn.model.Borrower");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>borrower_Id</column-name><column-value><![CDATA[");
		sb.append(getBorrower_Id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>abacus_Person_Id</column-name><column-value><![CDATA[");
		sb.append(getAbacus_Person_Id());
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

	private long _borrower_Id;
	private long _abacus_Person_Id;
	private String _village;
	private String _district;
	private String _pdf_Link;
	private double _currency;
	private String _changed_By;
	private long _changed_Time;
	private BaseModel<?> _borrowerRemoteModel;
}