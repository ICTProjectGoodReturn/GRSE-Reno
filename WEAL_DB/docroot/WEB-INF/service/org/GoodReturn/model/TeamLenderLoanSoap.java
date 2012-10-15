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
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link org.GoodReturn.service.http.TeamLenderLoanServiceSoap}.
 *
 * @author    gilaa004
 * @see       org.GoodReturn.service.http.TeamLenderLoanServiceSoap
 * @generated
 */
public class TeamLenderLoanSoap implements Serializable {
	public static TeamLenderLoanSoap toSoapModel(TeamLenderLoan model) {
		TeamLenderLoanSoap soapModel = new TeamLenderLoanSoap();

		soapModel.setAccount_Id(model.getAccount_Id());

		return soapModel;
	}

	public static TeamLenderLoanSoap[] toSoapModels(TeamLenderLoan[] models) {
		TeamLenderLoanSoap[] soapModels = new TeamLenderLoanSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TeamLenderLoanSoap[][] toSoapModels(TeamLenderLoan[][] models) {
		TeamLenderLoanSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TeamLenderLoanSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TeamLenderLoanSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TeamLenderLoanSoap[] toSoapModels(List<TeamLenderLoan> models) {
		List<TeamLenderLoanSoap> soapModels = new ArrayList<TeamLenderLoanSoap>(models.size());

		for (TeamLenderLoan model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TeamLenderLoanSoap[soapModels.size()]);
	}

	public TeamLenderLoanSoap() {
	}

	public long getPrimaryKey() {
		return _account_Id;
	}

	public void setPrimaryKey(long pk) {
		setAccount_Id(pk);
	}

	public long getAccount_Id() {
		return _account_Id;
	}

	public void setAccount_Id(long account_Id) {
		_account_Id = account_Id;
	}

	private long _account_Id;
}