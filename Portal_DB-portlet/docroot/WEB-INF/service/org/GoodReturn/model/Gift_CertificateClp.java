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

import org.goodreturn.service.Gift_CertificateLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author gilaa004
 */
public class Gift_CertificateClp extends BaseModelImpl<Gift_Certificate>
	implements Gift_Certificate {
	public Gift_CertificateClp() {
	}

	public Class<?> getModelClass() {
		return Gift_Certificate.class;
	}

	public String getModelClassName() {
		return Gift_Certificate.class.getName();
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

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("certificate_Id", getCertificate_Id());
		attributes.put("certificate_Amount", getCertificate_Amount());
		attributes.put("certificate_Type", getCertificate_Type());

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
	}

	public long getCertificate_Id() {
		return _certificate_Id;
	}

	public void setCertificate_Id(long certificate_Id) {
		_certificate_Id = certificate_Id;
	}

	public double getCertificate_Amount() {
		return _certificate_Amount;
	}

	public void setCertificate_Amount(double certificate_Amount) {
		_certificate_Amount = certificate_Amount;
	}

	public String getCertificate_Type() {
		return _certificate_Type;
	}

	public void setCertificate_Type(String certificate_Type) {
		_certificate_Type = certificate_Type;
	}

	public BaseModel<?> getGift_CertificateRemoteModel() {
		return _gift_CertificateRemoteModel;
	}

	public void setGift_CertificateRemoteModel(
		BaseModel<?> gift_CertificateRemoteModel) {
		_gift_CertificateRemoteModel = gift_CertificateRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			Gift_CertificateLocalServiceUtil.addGift_Certificate(this);
		}
		else {
			Gift_CertificateLocalServiceUtil.updateGift_Certificate(this);
		}
	}

	@Override
	public Gift_Certificate toEscapedModel() {
		return (Gift_Certificate)Proxy.newProxyInstance(Gift_Certificate.class.getClassLoader(),
			new Class[] { Gift_Certificate.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		Gift_CertificateClp clone = new Gift_CertificateClp();

		clone.setCertificate_Id(getCertificate_Id());
		clone.setCertificate_Amount(getCertificate_Amount());
		clone.setCertificate_Type(getCertificate_Type());

		return clone;
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

		Gift_CertificateClp gift_Certificate = null;

		try {
			gift_Certificate = (Gift_CertificateClp)obj;
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
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{certificate_Id=");
		sb.append(getCertificate_Id());
		sb.append(", certificate_Amount=");
		sb.append(getCertificate_Amount());
		sb.append(", certificate_Type=");
		sb.append(getCertificate_Type());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

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

		sb.append("</model>");

		return sb.toString();
	}

	private long _certificate_Id;
	private double _certificate_Amount;
	private String _certificate_Type;
	private BaseModel<?> _gift_CertificateRemoteModel;
}