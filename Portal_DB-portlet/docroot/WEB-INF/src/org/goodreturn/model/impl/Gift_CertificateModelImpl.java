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

import org.goodreturn.model.Gift_Certificate;
import org.goodreturn.model.Gift_CertificateModel;
import org.goodreturn.model.Gift_CertificateSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the Gift_Certificate service. Represents a row in the &quot;GoodReturn_Gift_Certificate&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link org.goodreturn.model.Gift_CertificateModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link Gift_CertificateImpl}.
 * </p>
 *
 * @author gilaa004
 * @see Gift_CertificateImpl
 * @see org.goodreturn.model.Gift_Certificate
 * @see org.goodreturn.model.Gift_CertificateModel
 * @generated
 */
@JSON(strict = true)
public class Gift_CertificateModelImpl extends BaseModelImpl<Gift_Certificate>
	implements Gift_CertificateModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a gift_ certificate model instance should use the {@link org.goodreturn.model.Gift_Certificate} interface instead.
	 */
	public static final String TABLE_NAME = "GoodReturn_Gift_Certificate";
	public static final Object[][] TABLE_COLUMNS = {
			{ "certificate_Id", Types.BIGINT },
			{ "certificate_Amount", Types.DOUBLE },
			{ "certificate_Type", Types.VARCHAR },
			{ "changed_By", Types.VARCHAR },
			{ "changed_Time", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table GoodReturn_Gift_Certificate (certificate_Id LONG not null primary key,certificate_Amount DOUBLE,certificate_Type VARCHAR(75) null,changed_By VARCHAR(75) null,changed_Time LONG,groupId LONG,companyId LONG)";
	public static final String TABLE_SQL_DROP = "drop table GoodReturn_Gift_Certificate";
	public static final String ORDER_BY_JPQL = " ORDER BY gift_Certificate.certificate_Id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY GoodReturn_Gift_Certificate.certificate_Id ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.org.goodreturn.model.Gift_Certificate"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.org.goodreturn.model.Gift_Certificate"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static Gift_Certificate toModel(Gift_CertificateSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Gift_Certificate model = new Gift_CertificateImpl();

		model.setCertificate_Id(soapModel.getCertificate_Id());
		model.setCertificate_Amount(soapModel.getCertificate_Amount());
		model.setCertificate_Type(soapModel.getCertificate_Type());
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
	public static List<Gift_Certificate> toModels(
		Gift_CertificateSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Gift_Certificate> models = new ArrayList<Gift_Certificate>(soapModels.length);

		for (Gift_CertificateSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.org.goodreturn.model.Gift_Certificate"));

	public Gift_CertificateModelImpl() {
	}

	public long getPrimaryKey() {
		return _certificate_Id;
	}

	public void setPrimaryKey(long primaryKey) {
		setCertificate_Id(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_certificate_Id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	public Class<?> getModelClass() {
		return Gift_Certificate.class;
	}

	public String getModelClassName() {
		return Gift_Certificate.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("certificate_Id", getCertificate_Id());
		attributes.put("certificate_Amount", getCertificate_Amount());
		attributes.put("certificate_Type", getCertificate_Type());
		attributes.put("changed_By", getChanged_By());
		attributes.put("changed_Time", getChanged_Time());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long certificate_Id = (Long)attributes.get("certificate_Id");

		if (certificate_Id != null) {
			setCertificate_Id(certificate_Id);
		}

		Double certificate_Amount = (Double)attributes.get("certificate_Amount");

		if (certificate_Amount != null) {
			setCertificate_Amount(certificate_Amount);
		}

		String certificate_Type = (String)attributes.get("certificate_Type");

		if (certificate_Type != null) {
			setCertificate_Type(certificate_Type);
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

	@JSON
	public long getCertificate_Id() {
		return _certificate_Id;
	}

	public void setCertificate_Id(long certificate_Id) {
		_certificate_Id = certificate_Id;
	}

	@JSON
	public double getCertificate_Amount() {
		return _certificate_Amount;
	}

	public void setCertificate_Amount(double certificate_Amount) {
		_certificate_Amount = certificate_Amount;
	}

	@JSON
	public String getCertificate_Type() {
		if (_certificate_Type == null) {
			return StringPool.BLANK;
		}
		else {
			return _certificate_Type;
		}
	}

	public void setCertificate_Type(String certificate_Type) {
		_certificate_Type = certificate_Type;
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
	public long getChanged_Time() {
		return _changed_Time;
	}

	public void setChanged_Time(long changed_Time) {
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

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			Gift_Certificate.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Gift_Certificate toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (Gift_Certificate)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public Object clone() {
		Gift_CertificateImpl gift_CertificateImpl = new Gift_CertificateImpl();

		gift_CertificateImpl.setCertificate_Id(getCertificate_Id());
		gift_CertificateImpl.setCertificate_Amount(getCertificate_Amount());
		gift_CertificateImpl.setCertificate_Type(getCertificate_Type());
		gift_CertificateImpl.setChanged_By(getChanged_By());
		gift_CertificateImpl.setChanged_Time(getChanged_Time());
		gift_CertificateImpl.setGroupId(getGroupId());
		gift_CertificateImpl.setCompanyId(getCompanyId());

		gift_CertificateImpl.resetOriginalValues();

		return gift_CertificateImpl;
	}

	public int compareTo(Gift_Certificate gift_Certificate) {
		int value = 0;

		if (getCertificate_Id() < gift_Certificate.getCertificate_Id()) {
			value = -1;
		}
		else if (getCertificate_Id() > gift_Certificate.getCertificate_Id()) {
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

		Gift_Certificate gift_Certificate = null;

		try {
			gift_Certificate = (Gift_Certificate)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = gift_Certificate.getPrimaryKey();

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
	}

	@Override
	public CacheModel<Gift_Certificate> toCacheModel() {
		Gift_CertificateCacheModel gift_CertificateCacheModel = new Gift_CertificateCacheModel();

		gift_CertificateCacheModel.certificate_Id = getCertificate_Id();

		gift_CertificateCacheModel.certificate_Amount = getCertificate_Amount();

		gift_CertificateCacheModel.certificate_Type = getCertificate_Type();

		String certificate_Type = gift_CertificateCacheModel.certificate_Type;

		if ((certificate_Type != null) && (certificate_Type.length() == 0)) {
			gift_CertificateCacheModel.certificate_Type = null;
		}

		gift_CertificateCacheModel.changed_By = getChanged_By();

		String changed_By = gift_CertificateCacheModel.changed_By;

		if ((changed_By != null) && (changed_By.length() == 0)) {
			gift_CertificateCacheModel.changed_By = null;
		}

		gift_CertificateCacheModel.changed_Time = getChanged_Time();

		gift_CertificateCacheModel.groupId = getGroupId();

		gift_CertificateCacheModel.companyId = getCompanyId();

		return gift_CertificateCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{certificate_Id=");
		sb.append(getCertificate_Id());
		sb.append(", certificate_Amount=");
		sb.append(getCertificate_Amount());
		sb.append(", certificate_Type=");
		sb.append(getCertificate_Type());
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
		sb.append("org.goodreturn.model.Gift_Certificate");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>certificate_Id</column-name><column-value><![CDATA[");
		sb.append(getCertificate_Id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>certificate_Amount</column-name><column-value><![CDATA[");
		sb.append(getCertificate_Amount());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>certificate_Type</column-name><column-value><![CDATA[");
		sb.append(getCertificate_Type());
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

	private static ClassLoader _classLoader = Gift_Certificate.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			Gift_Certificate.class
		};
	private long _certificate_Id;
	private double _certificate_Amount;
	private String _certificate_Type;
	private String _changed_By;
	private long _changed_Time;
	private long _groupId;
	private long _companyId;
	private Gift_Certificate _escapedModelProxy;
}