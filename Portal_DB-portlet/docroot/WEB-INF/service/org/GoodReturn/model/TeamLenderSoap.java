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

		soapModel.setTeam_lender_Id(model.getTeam_lender_Id());
		soapModel.setLender_Id(model.getLender_Id());
		soapModel.setTeam_Id(model.getTeam_Id());
		soapModel.setChanged_By(model.getChanged_By());
		soapModel.setChanged_Time(model.getChanged_Time());

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
		return _team_lender_Id;
	}

	public void setPrimaryKey(long pk) {
		setTeam_lender_Id(pk);
	}

	public long getTeam_lender_Id() {
		return _team_lender_Id;
	}

	public void setTeam_lender_Id(long team_lender_Id) {
		_team_lender_Id = team_lender_Id;
	}

	public long getLender_Id() {
		return _lender_Id;
	}

	public void setLender_Id(long lender_Id) {
		_lender_Id = lender_Id;
	}

	public long getTeam_Id() {
		return _team_Id;
	}

	public void setTeam_Id(long team_Id) {
		_team_Id = team_Id;
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

	private long _team_lender_Id;
	private long _lender_Id;
	private long _team_Id;
	private String _changed_By;
	private long _changed_Time;
}