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
		attributes.put("amount_Lent", getAmount_Lent());

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

		String amount_Lent = (String)attributes.get("amount_Lent");

		if (amount_Lent != null) {
			setAmount_Lent(amount_Lent);
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

	public String getAmount_Lent() {
		return _amount_Lent;
	}

	public void setAmount_Lent(String amount_Lent) {
		_amount_Lent = amount_Lent;
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
		clone.setAmount_Lent(getAmount_Lent());

		return clone;
	}

	public int compareTo(Team team) {
		int value = 0;

		value = getTeam_Name().compareTo(team.getTeam_Name());

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
		StringBundler sb = new StringBundler(7);

		sb.append("{team_Id=");
		sb.append(getTeam_Id());
		sb.append(", team_Name=");
		sb.append(getTeam_Name());
		sb.append(", amount_Lent=");
		sb.append(getAmount_Lent());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

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
			"<column><column-name>amount_Lent</column-name><column-value><![CDATA[");
		sb.append(getAmount_Lent());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _team_Id;
	private String _team_Name;
	private String _amount_Lent;
	private BaseModel<?> _teamRemoteModel;
}