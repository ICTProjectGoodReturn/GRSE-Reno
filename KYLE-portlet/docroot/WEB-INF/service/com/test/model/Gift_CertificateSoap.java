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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.test.service.http.Gift_CertificateServiceSoap}.
 *
 * @author    gilaa004
 * @see       com.test.service.http.Gift_CertificateServiceSoap
 * @generated
 */
public class Gift_CertificateSoap implements Serializable {
	public static Gift_CertificateSoap toSoapModel(Gift_Certificate model) {
		Gift_CertificateSoap soapModel = new Gift_CertificateSoap();

		soapModel.setCertificate_Id(model.getCertificate_Id());
		soapModel.setCertificate_Amount(model.getCertificate_Amount());
		soapModel.setCertificate_Type(model.getCertificate_Type());

		return soapModel;
	}

	public static Gift_CertificateSoap[] toSoapModels(Gift_Certificate[] models) {
		Gift_CertificateSoap[] soapModels = new Gift_CertificateSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static Gift_CertificateSoap[][] toSoapModels(
		Gift_Certificate[][] models) {
		Gift_CertificateSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new Gift_CertificateSoap[models.length][models[0].length];
		}
		else {
			soapModels = new Gift_CertificateSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static Gift_CertificateSoap[] toSoapModels(
		List<Gift_Certificate> models) {
		List<Gift_CertificateSoap> soapModels = new ArrayList<Gift_CertificateSoap>(models.size());

		for (Gift_Certificate model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new Gift_CertificateSoap[soapModels.size()]);
	}

	public Gift_CertificateSoap() {
	}

	public long getPrimaryKey() {
		return _certificate_Id;
	}

	public void setPrimaryKey(long pk) {
		setCertificate_Id(pk);
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

	private long _certificate_Id;
	private double _certificate_Amount;
	private String _certificate_Type;
}