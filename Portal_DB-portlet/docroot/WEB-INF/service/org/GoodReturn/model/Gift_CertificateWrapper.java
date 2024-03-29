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
 * This class is a wrapper for {@link Gift_Certificate}.
 * </p>
 *
 * @author    gilaa004
 * @see       Gift_Certificate
 * @generated
 */
public class Gift_CertificateWrapper implements Gift_Certificate,
	ModelWrapper<Gift_Certificate> {
	public Gift_CertificateWrapper(Gift_Certificate gift_Certificate) {
		_gift_Certificate = gift_Certificate;
	}

	public Class<?> getModelClass() {
		return Gift_Certificate.class;
	}

	public String getModelClassName() {
		return Gift_Certificate.class.getName();
	}

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

	/**
	* Returns the primary key of this gift_ certificate.
	*
	* @return the primary key of this gift_ certificate
	*/
	public long getPrimaryKey() {
		return _gift_Certificate.getPrimaryKey();
	}

	/**
	* Sets the primary key of this gift_ certificate.
	*
	* @param primaryKey the primary key of this gift_ certificate
	*/
	public void setPrimaryKey(long primaryKey) {
		_gift_Certificate.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the certificate_ ID of this gift_ certificate.
	*
	* @return the certificate_ ID of this gift_ certificate
	*/
	public long getCertificate_Id() {
		return _gift_Certificate.getCertificate_Id();
	}

	/**
	* Sets the certificate_ ID of this gift_ certificate.
	*
	* @param certificate_Id the certificate_ ID of this gift_ certificate
	*/
	public void setCertificate_Id(long certificate_Id) {
		_gift_Certificate.setCertificate_Id(certificate_Id);
	}

	/**
	* Returns the certificate_ amount of this gift_ certificate.
	*
	* @return the certificate_ amount of this gift_ certificate
	*/
	public double getCertificate_Amount() {
		return _gift_Certificate.getCertificate_Amount();
	}

	/**
	* Sets the certificate_ amount of this gift_ certificate.
	*
	* @param certificate_Amount the certificate_ amount of this gift_ certificate
	*/
	public void setCertificate_Amount(double certificate_Amount) {
		_gift_Certificate.setCertificate_Amount(certificate_Amount);
	}

	/**
	* Returns the certificate_ type of this gift_ certificate.
	*
	* @return the certificate_ type of this gift_ certificate
	*/
	public java.lang.String getCertificate_Type() {
		return _gift_Certificate.getCertificate_Type();
	}

	/**
	* Sets the certificate_ type of this gift_ certificate.
	*
	* @param certificate_Type the certificate_ type of this gift_ certificate
	*/
	public void setCertificate_Type(java.lang.String certificate_Type) {
		_gift_Certificate.setCertificate_Type(certificate_Type);
	}

	/**
	* Returns the changed_ by of this gift_ certificate.
	*
	* @return the changed_ by of this gift_ certificate
	*/
	public java.lang.String getChanged_By() {
		return _gift_Certificate.getChanged_By();
	}

	/**
	* Sets the changed_ by of this gift_ certificate.
	*
	* @param changed_By the changed_ by of this gift_ certificate
	*/
	public void setChanged_By(java.lang.String changed_By) {
		_gift_Certificate.setChanged_By(changed_By);
	}

	/**
	* Returns the changed_ time of this gift_ certificate.
	*
	* @return the changed_ time of this gift_ certificate
	*/
	public long getChanged_Time() {
		return _gift_Certificate.getChanged_Time();
	}

	/**
	* Sets the changed_ time of this gift_ certificate.
	*
	* @param changed_Time the changed_ time of this gift_ certificate
	*/
	public void setChanged_Time(long changed_Time) {
		_gift_Certificate.setChanged_Time(changed_Time);
	}

	/**
	* Returns the group ID of this gift_ certificate.
	*
	* @return the group ID of this gift_ certificate
	*/
	public long getGroupId() {
		return _gift_Certificate.getGroupId();
	}

	/**
	* Sets the group ID of this gift_ certificate.
	*
	* @param groupId the group ID of this gift_ certificate
	*/
	public void setGroupId(long groupId) {
		_gift_Certificate.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this gift_ certificate.
	*
	* @return the company ID of this gift_ certificate
	*/
	public long getCompanyId() {
		return _gift_Certificate.getCompanyId();
	}

	/**
	* Sets the company ID of this gift_ certificate.
	*
	* @param companyId the company ID of this gift_ certificate
	*/
	public void setCompanyId(long companyId) {
		_gift_Certificate.setCompanyId(companyId);
	}

	public boolean isNew() {
		return _gift_Certificate.isNew();
	}

	public void setNew(boolean n) {
		_gift_Certificate.setNew(n);
	}

	public boolean isCachedModel() {
		return _gift_Certificate.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_gift_Certificate.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _gift_Certificate.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _gift_Certificate.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_gift_Certificate.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _gift_Certificate.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_gift_Certificate.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new Gift_CertificateWrapper((Gift_Certificate)_gift_Certificate.clone());
	}

	public int compareTo(org.goodreturn.model.Gift_Certificate gift_Certificate) {
		return _gift_Certificate.compareTo(gift_Certificate);
	}

	@Override
	public int hashCode() {
		return _gift_Certificate.hashCode();
	}

	public com.liferay.portal.model.CacheModel<org.goodreturn.model.Gift_Certificate> toCacheModel() {
		return _gift_Certificate.toCacheModel();
	}

	public org.goodreturn.model.Gift_Certificate toEscapedModel() {
		return new Gift_CertificateWrapper(_gift_Certificate.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _gift_Certificate.toString();
	}

	public java.lang.String toXmlString() {
		return _gift_Certificate.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_gift_Certificate.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public Gift_Certificate getWrappedGift_Certificate() {
		return _gift_Certificate;
	}

	public Gift_Certificate getWrappedModel() {
		return _gift_Certificate;
	}

	public void resetOriginalValues() {
		_gift_Certificate.resetOriginalValues();
	}

	private Gift_Certificate _gift_Certificate;
}