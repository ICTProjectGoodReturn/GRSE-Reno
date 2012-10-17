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

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import org.goodreturn.model.Gift_Certificate;

import java.io.Serializable;

/**
 * The cache model class for representing Gift_Certificate in entity cache.
 *
 * @author gilaa004
 * @see Gift_Certificate
 * @generated
 */
public class Gift_CertificateCacheModel implements CacheModel<Gift_Certificate>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{certificate_Id=");
		sb.append(certificate_Id);
		sb.append(", certificate_Amount=");
		sb.append(certificate_Amount);
		sb.append(", certificate_Type=");
		sb.append(certificate_Type);
		sb.append("}");

		return sb.toString();
	}

	public Gift_Certificate toEntityModel() {
		Gift_CertificateImpl gift_CertificateImpl = new Gift_CertificateImpl();

		gift_CertificateImpl.setCertificate_Id(certificate_Id);
		gift_CertificateImpl.setCertificate_Amount(certificate_Amount);

		if (certificate_Type == null) {
			gift_CertificateImpl.setCertificate_Type(StringPool.BLANK);
		}
		else {
			gift_CertificateImpl.setCertificate_Type(certificate_Type);
		}

		gift_CertificateImpl.resetOriginalValues();

		return gift_CertificateImpl;
	}

	public long certificate_Id;
	public double certificate_Amount;
	public String certificate_Type;
}