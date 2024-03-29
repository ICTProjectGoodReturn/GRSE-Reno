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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import org.goodreturn.model.TempBl;
import org.goodreturn.model.TempBlModel;
import org.goodreturn.model.TempBlSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the TempBl service. Represents a row in the &quot;GoodReturn_TempBl&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link org.goodreturn.model.TempBlModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link TempBlImpl}.
 * </p>
 *
 * @author gilaa004
 * @see TempBlImpl
 * @see org.goodreturn.model.TempBl
 * @see org.goodreturn.model.TempBlModel
 * @generated
 */
@JSON(strict = true)
public class TempBlModelImpl extends BaseModelImpl<TempBl>
	implements TempBlModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a temp bl model instance should use the {@link org.goodreturn.model.TempBl} interface instead.
	 */
	public static final String TABLE_NAME = "GoodReturn_TempBl";
	public static final Object[][] TABLE_COLUMNS = {
			{ "borrower_Name", Types.VARCHAR },
			{ "borrower_Loan_Id", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table GoodReturn_TempBl (borrower_Name VARCHAR(75) null,borrower_Loan_Id LONG not null primary key,groupId LONG,companyId LONG)";
	public static final String TABLE_SQL_DROP = "drop table GoodReturn_TempBl";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.org.goodreturn.model.TempBl"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.org.goodreturn.model.TempBl"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.org.goodreturn.model.TempBl"),
			true);
	public static long GROUPID_COLUMN_BITMASK = 1L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static TempBl toModel(TempBlSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		TempBl model = new TempBlImpl();

		model.setBorrower_Name(soapModel.getBorrower_Name());
		model.setBorrower_Loan_Id(soapModel.getBorrower_Loan_Id());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<TempBl> toModels(TempBlSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<TempBl> models = new ArrayList<TempBl>(soapModels.length);

		for (TempBlSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.org.goodreturn.model.TempBl"));

	public TempBlModelImpl() {
	}

	public long getPrimaryKey() {
		return _borrower_Loan_Id;
	}

	public void setPrimaryKey(long primaryKey) {
		setBorrower_Loan_Id(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_borrower_Loan_Id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	public Class<?> getModelClass() {
		return TempBl.class;
	}

	public String getModelClassName() {
		return TempBl.class.getName();
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

	@JSON
	public String getBorrower_Name() {
		if (_borrower_Name == null) {
			return StringPool.BLANK;
		}
		else {
			return _borrower_Name;
		}
	}

	public void setBorrower_Name(String borrower_Name) {
		_borrower_Name = borrower_Name;
	}

	@JSON
	public long getBorrower_Loan_Id() {
		return _borrower_Loan_Id;
	}

	public void setBorrower_Loan_Id(long borrower_Loan_Id) {
		_borrower_Loan_Id = borrower_Loan_Id;
	}

	@JSON
	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_columnBitmask |= GROUPID_COLUMN_BITMASK;

		if (!_setOriginalGroupId) {
			_setOriginalGroupId = true;

			_originalGroupId = _groupId;
		}

		_groupId = groupId;
	}

	public long getOriginalGroupId() {
		return _originalGroupId;
	}

	@JSON
	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			TempBl.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public TempBl toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (TempBl)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public Object clone() {
		TempBlImpl tempBlImpl = new TempBlImpl();

		tempBlImpl.setBorrower_Name(getBorrower_Name());
		tempBlImpl.setBorrower_Loan_Id(getBorrower_Loan_Id());
		tempBlImpl.setGroupId(getGroupId());
		tempBlImpl.setCompanyId(getCompanyId());

		tempBlImpl.resetOriginalValues();

		return tempBlImpl;
	}

	public int compareTo(TempBl tempBl) {
		long primaryKey = tempBl.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		TempBl tempBl = null;

		try {
			tempBl = (TempBl)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = tempBl.getPrimaryKey();

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
	public void resetOriginalValues() {
		TempBlModelImpl tempBlModelImpl = this;

		tempBlModelImpl._originalGroupId = tempBlModelImpl._groupId;

		tempBlModelImpl._setOriginalGroupId = false;

		tempBlModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<TempBl> toCacheModel() {
		TempBlCacheModel tempBlCacheModel = new TempBlCacheModel();

		tempBlCacheModel.borrower_Name = getBorrower_Name();

		String borrower_Name = tempBlCacheModel.borrower_Name;

		if ((borrower_Name != null) && (borrower_Name.length() == 0)) {
			tempBlCacheModel.borrower_Name = null;
		}

		tempBlCacheModel.borrower_Loan_Id = getBorrower_Loan_Id();

		tempBlCacheModel.groupId = getGroupId();

		tempBlCacheModel.companyId = getCompanyId();

		return tempBlCacheModel;
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

	private static ClassLoader _classLoader = TempBl.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			TempBl.class
		};
	private String _borrower_Name;
	private long _borrower_Loan_Id;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _companyId;
	private long _columnBitmask;
	private TempBl _escapedModelProxy;
}