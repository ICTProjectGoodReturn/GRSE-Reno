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

import org.goodreturn.model.BorrowerLoan;
import org.goodreturn.model.BorrowerLoanModel;
import org.goodreturn.model.BorrowerLoanSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the BorrowerLoan service. Represents a row in the &quot;GoodReturn_BorrowerLoan&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link org.goodreturn.model.BorrowerLoanModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link BorrowerLoanImpl}.
 * </p>
 *
 * @author gilaa004
 * @see BorrowerLoanImpl
 * @see org.goodreturn.model.BorrowerLoan
 * @see org.goodreturn.model.BorrowerLoanModel
 * @generated
 */
@JSON(strict = true)
public class BorrowerLoanModelImpl extends BaseModelImpl<BorrowerLoan>
	implements BorrowerLoanModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a borrower loan model instance should use the {@link org.goodreturn.model.BorrowerLoan} interface instead.
	 */
	public static final String TABLE_NAME = "GoodReturn_BorrowerLoan";
	public static final Object[][] TABLE_COLUMNS = {
			{ "abacus_Borrower_Loan_Id", Types.BIGINT },
			{ "borrower_Id", Types.BIGINT },
			{ "abacus_mfi_Id", Types.BIGINT },
			{ "changed_By", Types.VARCHAR },
			{ "changed_Time", Types.VARCHAR },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table GoodReturn_BorrowerLoan (abacus_Borrower_Loan_Id LONG not null primary key,borrower_Id LONG,abacus_mfi_Id LONG,changed_By VARCHAR(75) null,changed_Time VARCHAR(75) null,groupId LONG,companyId LONG)";
	public static final String TABLE_SQL_DROP = "drop table GoodReturn_BorrowerLoan";
	public static final String ORDER_BY_JPQL = " ORDER BY borrowerLoan.abacus_Borrower_Loan_Id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY GoodReturn_BorrowerLoan.abacus_Borrower_Loan_Id ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.org.goodreturn.model.BorrowerLoan"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.org.goodreturn.model.BorrowerLoan"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.org.goodreturn.model.BorrowerLoan"),
			true);
	public static long BORROWER_ID_COLUMN_BITMASK = 1L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static BorrowerLoan toModel(BorrowerLoanSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		BorrowerLoan model = new BorrowerLoanImpl();

		model.setAbacus_Borrower_Loan_Id(soapModel.getAbacus_Borrower_Loan_Id());
		model.setBorrower_Id(soapModel.getBorrower_Id());
		model.setAbacus_mfi_Id(soapModel.getAbacus_mfi_Id());
		model.setChanged_By(soapModel.getChanged_By());
		model.setChanged_Time(soapModel.getChanged_Time());
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
	public static List<BorrowerLoan> toModels(BorrowerLoanSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<BorrowerLoan> models = new ArrayList<BorrowerLoan>(soapModels.length);

		for (BorrowerLoanSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.org.goodreturn.model.BorrowerLoan"));

	public BorrowerLoanModelImpl() {
	}

	public long getPrimaryKey() {
		return _abacus_Borrower_Loan_Id;
	}

	public void setPrimaryKey(long primaryKey) {
		setAbacus_Borrower_Loan_Id(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_abacus_Borrower_Loan_Id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	public Class<?> getModelClass() {
		return BorrowerLoan.class;
	}

	public String getModelClassName() {
		return BorrowerLoan.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("abacus_Borrower_Loan_Id", getAbacus_Borrower_Loan_Id());
		attributes.put("borrower_Id", getBorrower_Id());
		attributes.put("abacus_mfi_Id", getAbacus_mfi_Id());
		attributes.put("changed_By", getChanged_By());
		attributes.put("changed_Time", getChanged_Time());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long abacus_Borrower_Loan_Id = (Long)attributes.get(
				"abacus_Borrower_Loan_Id");

		if (abacus_Borrower_Loan_Id != null) {
			setAbacus_Borrower_Loan_Id(abacus_Borrower_Loan_Id);
		}

		Long borrower_Id = (Long)attributes.get("borrower_Id");

		if (borrower_Id != null) {
			setBorrower_Id(borrower_Id);
		}

		Long abacus_mfi_Id = (Long)attributes.get("abacus_mfi_Id");

		if (abacus_mfi_Id != null) {
			setAbacus_mfi_Id(abacus_mfi_Id);
		}

		String changed_By = (String)attributes.get("changed_By");

		if (changed_By != null) {
			setChanged_By(changed_By);
		}

		String changed_Time = (String)attributes.get("changed_Time");

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

	@JSON
	public long getAbacus_Borrower_Loan_Id() {
		return _abacus_Borrower_Loan_Id;
	}

	public void setAbacus_Borrower_Loan_Id(long abacus_Borrower_Loan_Id) {
		_columnBitmask = -1L;

		_abacus_Borrower_Loan_Id = abacus_Borrower_Loan_Id;
	}

	@JSON
	public long getBorrower_Id() {
		return _borrower_Id;
	}

	public void setBorrower_Id(long borrower_Id) {
		_columnBitmask |= BORROWER_ID_COLUMN_BITMASK;

		if (!_setOriginalBorrower_Id) {
			_setOriginalBorrower_Id = true;

			_originalBorrower_Id = _borrower_Id;
		}

		_borrower_Id = borrower_Id;
	}

	public long getOriginalBorrower_Id() {
		return _originalBorrower_Id;
	}

	@JSON
	public long getAbacus_mfi_Id() {
		return _abacus_mfi_Id;
	}

	public void setAbacus_mfi_Id(long abacus_mfi_Id) {
		_abacus_mfi_Id = abacus_mfi_Id;
	}

	@JSON
	public String getChanged_By() {
		if (_changed_By == null) {
			return StringPool.BLANK;
		}
		else {
			return _changed_By;
		}
	}

	public void setChanged_By(String changed_By) {
		_changed_By = changed_By;
	}

	@JSON
	public String getChanged_Time() {
		if (_changed_Time == null) {
			return StringPool.BLANK;
		}
		else {
			return _changed_Time;
		}
	}

	public void setChanged_Time(String changed_Time) {
		_changed_Time = changed_Time;
	}

	@JSON
	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
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
			BorrowerLoan.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public BorrowerLoan toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (BorrowerLoan)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public Object clone() {
		BorrowerLoanImpl borrowerLoanImpl = new BorrowerLoanImpl();

		borrowerLoanImpl.setAbacus_Borrower_Loan_Id(getAbacus_Borrower_Loan_Id());
		borrowerLoanImpl.setBorrower_Id(getBorrower_Id());
		borrowerLoanImpl.setAbacus_mfi_Id(getAbacus_mfi_Id());
		borrowerLoanImpl.setChanged_By(getChanged_By());
		borrowerLoanImpl.setChanged_Time(getChanged_Time());
		borrowerLoanImpl.setGroupId(getGroupId());
		borrowerLoanImpl.setCompanyId(getCompanyId());

		borrowerLoanImpl.resetOriginalValues();

		return borrowerLoanImpl;
	}

	public int compareTo(BorrowerLoan borrowerLoan) {
		int value = 0;

		if (getAbacus_Borrower_Loan_Id() < borrowerLoan.getAbacus_Borrower_Loan_Id()) {
			value = -1;
		}
		else if (getAbacus_Borrower_Loan_Id() > borrowerLoan.getAbacus_Borrower_Loan_Id()) {
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

		BorrowerLoan borrowerLoan = null;

		try {
			borrowerLoan = (BorrowerLoan)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = borrowerLoan.getPrimaryKey();

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
		BorrowerLoanModelImpl borrowerLoanModelImpl = this;

		borrowerLoanModelImpl._originalBorrower_Id = borrowerLoanModelImpl._borrower_Id;

		borrowerLoanModelImpl._setOriginalBorrower_Id = false;

		borrowerLoanModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<BorrowerLoan> toCacheModel() {
		BorrowerLoanCacheModel borrowerLoanCacheModel = new BorrowerLoanCacheModel();

		borrowerLoanCacheModel.abacus_Borrower_Loan_Id = getAbacus_Borrower_Loan_Id();

		borrowerLoanCacheModel.borrower_Id = getBorrower_Id();

		borrowerLoanCacheModel.abacus_mfi_Id = getAbacus_mfi_Id();

		borrowerLoanCacheModel.changed_By = getChanged_By();

		String changed_By = borrowerLoanCacheModel.changed_By;

		if ((changed_By != null) && (changed_By.length() == 0)) {
			borrowerLoanCacheModel.changed_By = null;
		}

		borrowerLoanCacheModel.changed_Time = getChanged_Time();

		String changed_Time = borrowerLoanCacheModel.changed_Time;

		if ((changed_Time != null) && (changed_Time.length() == 0)) {
			borrowerLoanCacheModel.changed_Time = null;
		}

		borrowerLoanCacheModel.groupId = getGroupId();

		borrowerLoanCacheModel.companyId = getCompanyId();

		return borrowerLoanCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{abacus_Borrower_Loan_Id=");
		sb.append(getAbacus_Borrower_Loan_Id());
		sb.append(", borrower_Id=");
		sb.append(getBorrower_Id());
		sb.append(", abacus_mfi_Id=");
		sb.append(getAbacus_mfi_Id());
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
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("org.goodreturn.model.BorrowerLoan");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>abacus_Borrower_Loan_Id</column-name><column-value><![CDATA[");
		sb.append(getAbacus_Borrower_Loan_Id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>borrower_Id</column-name><column-value><![CDATA[");
		sb.append(getBorrower_Id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>abacus_mfi_Id</column-name><column-value><![CDATA[");
		sb.append(getAbacus_mfi_Id());
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

	private static ClassLoader _classLoader = BorrowerLoan.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			BorrowerLoan.class
		};
	private long _abacus_Borrower_Loan_Id;
	private long _borrower_Id;
	private long _originalBorrower_Id;
	private boolean _setOriginalBorrower_Id;
	private long _abacus_mfi_Id;
	private String _changed_By;
	private String _changed_Time;
	private long _groupId;
	private long _companyId;
	private long _columnBitmask;
	private BorrowerLoan _escapedModelProxy;
}