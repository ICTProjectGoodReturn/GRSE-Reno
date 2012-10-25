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

import org.goodreturn.service.TempBlLocalServiceUtil;
import org.goodreturn.service.persistence.TempBlPK;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author gilaa004
 */
public class TempBlClp extends BaseModelImpl<TempBl> implements TempBl {
	public TempBlClp() {
	}

	public Class<?> getModelClass() {
		return TempBl.class;
	}

	public String getModelClassName() {
		return TempBl.class.getName();
	}

	public TempBlPK getPrimaryKey() {
		return new TempBlPK(_borrower_Name, _borrower_Loan_Id);
	}

	public void setPrimaryKey(TempBlPK primaryKey) {
		setBorrower_Name(primaryKey.borrower_Name);
		setBorrower_Loan_Id(primaryKey.borrower_Loan_Id);
	}

	public Serializable getPrimaryKeyObj() {
		return new TempBlPK(_borrower_Name, _borrower_Loan_Id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((TempBlPK)primaryKeyObj);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("borrower_Name", getBorrower_Name());
		attributes.put("borrower_Loan_Id", getBorrower_Loan_Id());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String borrower_Name = (String)attributes.get("borrower_Name");

		if (borrower_Name != null) {
			setBorrower_Name(borrower_Name);
		}

		Long borrower_Loan_Id = (Long)attributes.get("borrower_Loan_Id");

		if (borrower_Loan_Id != null) {
			setBorrower_Loan_Id(borrower_Loan_Id);
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

	public String getBorrower_Name() {
		return _borrower_Name;
	}

	public void setBorrower_Name(String borrower_Name) {
		_borrower_Name = borrower_Name;
	}

	public long getBorrower_Loan_Id() {
		return _borrower_Loan_Id;
	}

	public void setBorrower_Loan_Id(long borrower_Loan_Id) {
		_borrower_Loan_Id = borrower_Loan_Id;
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

	public BaseModel<?> getTempBlRemoteModel() {
		return _tempBlRemoteModel;
	}

	public void setTempBlRemoteModel(BaseModel<?> tempBlRemoteModel) {
		_tempBlRemoteModel = tempBlRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			TempBlLocalServiceUtil.addTempBl(this);
		}
		else {
			TempBlLocalServiceUtil.updateTempBl(this);
		}
	}

	@Override
	public TempBl toEscapedModel() {
		return (TempBl)Proxy.newProxyInstance(TempBl.class.getClassLoader(),
			new Class[] { TempBl.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TempBlClp clone = new TempBlClp();

		clone.setBorrower_Name(getBorrower_Name());
		clone.setBorrower_Loan_Id(getBorrower_Loan_Id());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());

		return clone;
	}

	public int compareTo(TempBl tempBl) {
		TempBlPK primaryKey = tempBl.getPrimaryKey();

		return getPrimaryKey().compareTo(primaryKey);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		TempBlClp tempBl = null;

		try {
			tempBl = (TempBlClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		TempBlPK primaryKey = tempBl.getPrimaryKey();

		if (getPrimaryKey().equals(primaryKey)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey().hashCode();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{borrower_Name=");
		sb.append(getBorrower_Name());
		sb.append(", borrower_Loan_Id=");
		sb.append(getBorrower_Loan_Id());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("org.goodreturn.model.TempBl");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>borrower_Name</column-name><column-value><![CDATA[");
		sb.append(getBorrower_Name());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>borrower_Loan_Id</column-name><column-value><![CDATA[");
		sb.append(getBorrower_Loan_Id());
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

	private String _borrower_Name;
	private long _borrower_Loan_Id;
	private long _groupId;
	private long _companyId;
	private BaseModel<?> _tempBlRemoteModel;
}