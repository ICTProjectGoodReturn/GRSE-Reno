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

package org.GoodReturn.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link org.GoodReturn.service.http.BorrowerServiceSoap}.
 *
 * @author    gilaa004
 * @see       org.GoodReturn.service.http.BorrowerServiceSoap
 * @generated
 */
public class BorrowerSoap implements Serializable {
	public static BorrowerSoap toSoapModel(Borrower model) {
		BorrowerSoap soapModel = new BorrowerSoap();

		soapModel.setAbacus_Borrower_Id(model.getAbacus_Borrower_Id());
		soapModel.setWrite_Off_Date(model.getWrite_Off_Date());
		soapModel.setPhone(model.getPhone());
		soapModel.setWait_Time(model.getWait_Time());
		soapModel.setCountry(model.getCountry());
		soapModel.setAmount_Needed(model.getAmount_Needed());
		soapModel.setAmount_Needed_AUD(model.getAmount_Needed_AUD());
		soapModel.setType_Of_Person(model.getType_Of_Person());
		soapModel.setVillage(model.getVillage());
		soapModel.setDistrict(model.getDistrict());
		soapModel.setPdf_Link(model.getPdf_Link());
		soapModel.setCurrency(model.getCurrency());
		soapModel.setDate_Applied(model.getDate_Applied());

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
		return _abacus_Borrower_Id;
	}

	public void setPrimaryKey(long pk) {
		setAbacus_Borrower_Id(pk);
	}

	public long getAbacus_Borrower_Id() {
		return _abacus_Borrower_Id;
	}

	public void setAbacus_Borrower_Id(long abacus_Borrower_Id) {
		_abacus_Borrower_Id = abacus_Borrower_Id;
	}

	public Date getWrite_Off_Date() {
		return _write_Off_Date;
	}

	public void setWrite_Off_Date(Date write_Off_Date) {
		_write_Off_Date = write_Off_Date;
	}

	public long getPhone() {
		return _phone;
	}

	public void setPhone(long phone) {
		_phone = phone;
	}

	public long getWait_Time() {
		return _wait_Time;
	}

	public void setWait_Time(long wait_Time) {
		_wait_Time = wait_Time;
	}

	public String getCountry() {
		return _country;
	}

	public void setCountry(String country) {
		_country = country;
	}

	public double getAmount_Needed() {
		return _amount_Needed;
	}

	public void setAmount_Needed(double amount_Needed) {
		_amount_Needed = amount_Needed;
	}

	public double getAmount_Needed_AUD() {
		return _amount_Needed_AUD;
	}

	public void setAmount_Needed_AUD(double amount_Needed_AUD) {
		_amount_Needed_AUD = amount_Needed_AUD;
	}

	public String getType_Of_Person() {
		return _type_Of_Person;
	}

	public void setType_Of_Person(String type_Of_Person) {
		_type_Of_Person = type_Of_Person;
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

	public Date getDate_Applied() {
		return _date_Applied;
	}

	public void setDate_Applied(Date date_Applied) {
		_date_Applied = date_Applied;
	}

	private long _abacus_Borrower_Id;
	private Date _write_Off_Date;
	private long _phone;
	private long _wait_Time;
	private String _country;
	private double _amount_Needed;
	private double _amount_Needed_AUD;
	private String _type_Of_Person;
	private String _village;
	private String _district;
	private String _pdf_Link;
	private double _currency;
	private Date _date_Applied;
}