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
 * This class is used by SOAP remote services, specifically {@link org.goodreturn.service.http.TeamServiceSoap}.
 *
 * @author    gilaa004
 * @see       org.goodreturn.service.http.TeamServiceSoap
 * @generated
 */
public class TeamSoap implements Serializable {
	public static TeamSoap toSoapModel(Team model) {
		TeamSoap soapModel = new TeamSoap();

		soapModel.setTeam_Id(model.getTeam_Id());
		soapModel.setTeam_Name(model.getTeam_Name());
		soapModel.setChange_By(model.getChange_By());
		soapModel.setChange_Time(model.getChange_Time());

		return soapModel;
	}

	public static TeamSoap[] toSoapModels(Team[] models) {
		TeamSoap[] soapModels = new TeamSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TeamSoap[][] toSoapModels(Team[][] models) {
		TeamSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TeamSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TeamSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TeamSoap[] toSoapModels(List<Team> models) {
		List<TeamSoap> soapModels = new ArrayList<TeamSoap>(models.size());

		for (Team model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TeamSoap[soapModels.size()]);
	}

	public TeamSoap() {
	}

	public long getPrimaryKey() {
		return _team_Id;
	}

	public void setPrimaryKey(long pk) {
		setTeam_Id(pk);
	}

	public long getTeam_Id() {
		return _team_Id;
	}

	public void setTeam_Id(long team_Id) {
		_team_Id = team_Id;
	}

	public String getTeam_Name() {
		return _team_Name;
	}

	public void setTeam_Name(String team_Name) {
		_team_Name = team_Name;
	}

	public String getChange_By() {
		return _change_By;
	}

	public void setChange_By(String change_By) {
		_change_By = change_By;
	}

	public long getChange_Time() {
		return _change_Time;
	}

	public void setChange_Time(long change_Time) {
		_change_Time = change_Time;
	}

	private long _team_Id;
	private String _team_Name;
	private String _change_By;
	private long _change_Time;
}