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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import org.goodreturn.service.TeamLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author gilaa004
 */
public class TeamClp extends BaseModelImpl<Team> implements Team {
	public TeamClp() {
	}

	public Class<?> getModelClass() {
		return Team.class;
	}

	public String getModelClassName() {
		return Team.class.getName();
	}

	public long getPrimaryKey() {
		return _team_Id;
	}

	public void setPrimaryKey(long primaryKey) {
		setTeam_Id(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_team_Id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("team_Id", getTeam_Id());
		attributes.put("team_Name", getTeam_Name());
		attributes.put("change_By", getChange_By());
		attributes.put("change_Time", getChange_Time());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long team_Id = (Long)attributes.get("team_Id");

		if (team_Id != null) {
			setTeam_Id(team_Id);
		}

		String team_Name = (String)attributes.get("team_Name");

		if (team_Name != null) {
			setTeam_Name(team_Name);
		}

		String change_By = (String)attributes.get("change_By");

		if (change_By != null) {
			setChange_By(change_By);
		}

		Long change_Time = (Long)attributes.get("change_Time");

		if (change_Time != null) {
			setChange_Time(change_Time);
		}
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

	public BaseModel<?> getTeamRemoteModel() {
		return _teamRemoteModel;
	}

	public void setTeamRemoteModel(BaseModel<?> teamRemoteModel) {
		_teamRemoteModel = teamRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			TeamLocalServiceUtil.addTeam(this);
		}
		else {
			TeamLocalServiceUtil.updateTeam(this);
		}
	}

	@Override
	public Team toEscapedModel() {
		return (Team)Proxy.newProxyInstance(Team.class.getClassLoader(),
			new Class[] { Team.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TeamClp clone = new TeamClp();

		clone.setTeam_Id(getTeam_Id());
		clone.setTeam_Name(getTeam_Name());
		clone.setChange_By(getChange_By());
		clone.setChange_Time(getChange_Time());

		return clone;
	}

	public int compareTo(Team team) {
		int value = 0;

		if (getTeam_Id() < team.getTeam_Id()) {
			value = -1;
		}
		else if (getTeam_Id() > team.getTeam_Id()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		TeamClp team = null;

		try {
			team = (TeamClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = team.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{team_Id=");
		sb.append(getTeam_Id());
		sb.append(", team_Name=");
		sb.append(getTeam_Name());
		sb.append(", change_By=");
		sb.append(getChange_By());
		sb.append(", change_Time=");
		sb.append(getChange_Time());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("org.goodreturn.model.Team");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>team_Id</column-name><column-value><![CDATA[");
		sb.append(getTeam_Id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>team_Name</column-name><column-value><![CDATA[");
		sb.append(getTeam_Name());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>change_By</column-name><column-value><![CDATA[");
		sb.append(getChange_By());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>change_Time</column-name><column-value><![CDATA[");
		sb.append(getChange_Time());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _team_Id;
	private String _team_Name;
	private String _change_By;
	private long _change_Time;
	private BaseModel<?> _teamRemoteModel;
}