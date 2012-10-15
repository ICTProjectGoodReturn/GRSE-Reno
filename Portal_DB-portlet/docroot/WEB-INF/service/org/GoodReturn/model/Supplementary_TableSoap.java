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
 * This class is used by SOAP remote services, specifically {@link org.goodreturn.service.http.Supplementary_TableServiceSoap}.
 *
 * @author    gilaa004
 * @see       org.goodreturn.service.http.Supplementary_TableServiceSoap
 * @generated
 */
public class Supplementary_TableSoap implements Serializable {
	public static Supplementary_TableSoap toSoapModel(Supplementary_Table model) {
		Supplementary_TableSoap soapModel = new Supplementary_TableSoap();

		soapModel.setTable_Id(model.getTable_Id());

		return soapModel;
	}

	public static Supplementary_TableSoap[] toSoapModels(
		Supplementary_Table[] models) {
		Supplementary_TableSoap[] soapModels = new Supplementary_TableSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static Supplementary_TableSoap[][] toSoapModels(
		Supplementary_Table[][] models) {
		Supplementary_TableSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new Supplementary_TableSoap[models.length][models[0].length];
		}
		else {
			soapModels = new Supplementary_TableSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static Supplementary_TableSoap[] toSoapModels(
		List<Supplementary_Table> models) {
		List<Supplementary_TableSoap> soapModels = new ArrayList<Supplementary_TableSoap>(models.size());

		for (Supplementary_Table model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new Supplementary_TableSoap[soapModels.size()]);
	}

	public Supplementary_TableSoap() {
	}

	public long getPrimaryKey() {
		return _table_Id;
	}

	public void setPrimaryKey(long pk) {
		setTable_Id(pk);
	}

	public long getTable_Id() {
		return _table_Id;
	}

	public void setTable_Id(long table_Id) {
		_table_Id = table_Id;
	}

	private long _table_Id;
}