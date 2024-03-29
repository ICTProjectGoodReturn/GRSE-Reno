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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the Gift_Certificate service. Represents a row in the &quot;GoodReturn_Gift_Certificate&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link org.goodreturn.model.impl.Gift_CertificateModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link org.goodreturn.model.impl.Gift_CertificateImpl}.
 * </p>
 *
 * @author gilaa004
 * @see Gift_Certificate
 * @see org.goodreturn.model.impl.Gift_CertificateImpl
 * @see org.goodreturn.model.impl.Gift_CertificateModelImpl
 * @generated
 */
public interface Gift_CertificateModel extends BaseModel<Gift_Certificate> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a gift_ certificate model instance should use the {@link Gift_Certificate} interface instead.
	 */

	/**
	 * Returns the primary key of this gift_ certificate.
	 *
	 * @return the primary key of this gift_ certificate
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this gift_ certificate.
	 *
	 * @param primaryKey the primary key of this gift_ certificate
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the certificate_ ID of this gift_ certificate.
	 *
	 * @return the certificate_ ID of this gift_ certificate
	 */
	public long getCertificate_Id();

	/**
	 * Sets the certificate_ ID of this gift_ certificate.
	 *
	 * @param certificate_Id the certificate_ ID of this gift_ certificate
	 */
	public void setCertificate_Id(long certificate_Id);

	/**
	 * Returns the certificate_ amount of this gift_ certificate.
	 *
	 * @return the certificate_ amount of this gift_ certificate
	 */
	public double getCertificate_Amount();

	/**
	 * Sets the certificate_ amount of this gift_ certificate.
	 *
	 * @param certificate_Amount the certificate_ amount of this gift_ certificate
	 */
	public void setCertificate_Amount(double certificate_Amount);

	/**
	 * Returns the certificate_ type of this gift_ certificate.
	 *
	 * @return the certificate_ type of this gift_ certificate
	 */
	@AutoEscape
	public String getCertificate_Type();

	/**
	 * Sets the certificate_ type of this gift_ certificate.
	 *
	 * @param certificate_Type the certificate_ type of this gift_ certificate
	 */
	public void setCertificate_Type(String certificate_Type);

	/**
	 * Returns the changed_ by of this gift_ certificate.
	 *
	 * @return the changed_ by of this gift_ certificate
	 */
	@AutoEscape
	public String getChanged_By();

	/**
	 * Sets the changed_ by of this gift_ certificate.
	 *
	 * @param changed_By the changed_ by of this gift_ certificate
	 */
	public void setChanged_By(String changed_By);

	/**
	 * Returns the changed_ time of this gift_ certificate.
	 *
	 * @return the changed_ time of this gift_ certificate
	 */
	public long getChanged_Time();

	/**
	 * Sets the changed_ time of this gift_ certificate.
	 *
	 * @param changed_Time the changed_ time of this gift_ certificate
	 */
	public void setChanged_Time(long changed_Time);

	/**
	 * Returns the group ID of this gift_ certificate.
	 *
	 * @return the group ID of this gift_ certificate
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this gift_ certificate.
	 *
	 * @param groupId the group ID of this gift_ certificate
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this gift_ certificate.
	 *
	 * @return the company ID of this gift_ certificate
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this gift_ certificate.
	 *
	 * @param companyId the company ID of this gift_ certificate
	 */
	public void setCompanyId(long companyId);

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public Serializable getPrimaryKeyObj();

	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(Gift_Certificate gift_Certificate);

	public int hashCode();

	public CacheModel<Gift_Certificate> toCacheModel();

	public Gift_Certificate toEscapedModel();

	public String toString();

	public String toXmlString();
}