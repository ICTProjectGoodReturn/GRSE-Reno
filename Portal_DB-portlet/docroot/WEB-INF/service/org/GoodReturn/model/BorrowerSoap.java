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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link org.goodreturn.service.http.BorrowerServiceSoap}.
 *
 * @author    gilaa004
 * @see       org.goodreturn.service.http.BorrowerServiceSoap
 * @generated
 */
public class BorrowerSoap implements Serializable {
	public static BorrowerSoap toSoapModel(Borrower model) {
		BorrowerSoap soapModel = new BorrowerSoap();

		soapModel.setBorrower_Id(model.getBorrower_Id());
		soapModel.setAbacus_Person_Id(model.getAbacus_Person_Id());
		soapModel.setVillage(model.getVillage());
		soapModel.setDistrict(model.getDistrict());
		soapModel.setPdf_Link(model.getPdf_Link());
		soapModel.setCurrency(model.getCurrency());
		soapModel.setChanged_By(model.getChanged_By());
		soapModel.setChanged_Time(model.getChanged_Time());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());

		return soapModel;
	}

	public static BorrowerSoap[] toSoapModels(Borrower[] models) {
		BorrowerSoap[] soapModels = new BorrowerSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static BorrowerSoap[][] toSoapModels(Borrower[][] models) {
		BorrowerSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new BorrowerSoap[models.length][models[0].length];
		}
		else {
			soapModels = new BorrowerSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static BorrowerSoap[] toSoapModels(List<Borrower> models) {
		List<BorrowerSoap> soapModels = new ArrayList<BorrowerSoap>(models.size());

		for (Borrower model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new BorrowerSoap[soapModels.size()]);
	}

	public BorrowerSoap() {
	}

	public long getPrimaryKey() {
		return _borrower_Id;
	}

	public void setPrimaryKey(long pk) {
		setBorrower_Id(pk);
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

	private long _borrower_Id;
	private long _abacus_Person_Id;
	private String _village;
	private String _district;
	private String _pdf_Link;
	private double _currency;
	private String _changed_By;
	private long _changed_Time;
	private long _groupId;
	private long _companyId;
}