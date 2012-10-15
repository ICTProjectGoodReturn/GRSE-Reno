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
 * This class is used by SOAP remote services, specifically {@link org.goodreturn.service.http.TeamLenderServiceSoap}.
 *
 * @author    gilaa004
 * @see       org.goodreturn.service.http.TeamLenderServiceSoap
 * @generated
 */
public class TeamLenderSoap implements Serializable {
	public static TeamLenderSoap toSoapModel(TeamLender model) {
		TeamLenderSoap soapModel = new TeamLenderSoap();

		soapModel.setTeamlender_Id(model.getTeamlender_Id());

		return soapModel;
	}

	public static TeamLenderSoap[] toSoapModels(TeamLender[] models) {
		TeamLenderSoap[] soapModels = new TeamLenderSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TeamLenderSoap[][] toSoapModels(TeamLender[][] models) {
		TeamLenderSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TeamLenderSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TeamLenderSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TeamLenderSoap[] toSoapModels(List<TeamLender> models) {
		List<TeamLenderSoap> soapModels = new ArrayList<TeamLenderSoap>(models.size());

		for (TeamLender model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TeamLenderSoap[soapModels.size()]);
	}

	public TeamLenderSoap() {
	}

	public long getPrimaryKey() {
		return _teamlender_Id;
	}

	public void setPrimaryKey(long pk) {
		setTeamlender_Id(pk);
	}

	public long getTeamlender_Id() {
		return _teamlender_Id;
	}

	public void setTeamlender_Id(long teamlender_Id) {
		_teamlender_Id = teamlender_Id;
	}

	private long _teamlender_Id;
}