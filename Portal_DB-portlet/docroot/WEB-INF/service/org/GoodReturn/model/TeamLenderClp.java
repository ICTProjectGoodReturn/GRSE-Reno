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

import org.goodreturn.service.TeamLenderLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author gilaa004
 */
public class TeamLenderClp extends BaseModelImpl<TeamLender>
	implements TeamLender {
	public TeamLenderClp() {
	}

	public Class<?> getModelClass() {
		return TeamLender.class;
	}

	public String getModelClassName() {
		return TeamLender.class.getName();
	}

	public long getPrimaryKey() {
		return _team_lender_Id;
	}

	public void setPrimaryKey(long primaryKey) {
		setTeam_lender_Id(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_team_lender_Id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("team_lender_Id", getTeam_lender_Id());
		attributes.put("lender_Id", getLender_Id());
		attributes.put("team_Id", getTeam_Id());
		attributes.put("changed_By", getChanged_By());
		attributes.put("changed_Time", getChanged_Time());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long team_lender_Id = (Long)attributes.get("team_lender_Id");

		if (team_lender_Id != null) {
			setTeam_lender_Id(team_lender_Id);
		}

		Long lender_Id = (Long)attributes.get("lender_Id");

		if (lender_Id != null) {
			setLender_Id(lender_Id);
		}

		Long team_Id = (Long)attributes.get("team_Id");

		if (team_Id != null) {
			setTeam_Id(team_Id);
		}

		String changed_By = (String)attributes.get("changed_By");

		if (changed_By != null) {
			setChanged_By(changed_By);
		}

		Long changed_Time = (Long)attributes.get("changed_Time");

		if (changed_Time != null) {
			setChanged_Time(changed_Time);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}
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

	public BaseModel<?> getTeamLenderRemoteModel() {
		return _teamLenderRemoteModel;
	}

	public void setTeamLenderRemoteModel(BaseModel<?> teamLenderRemoteModel) {
		_teamLenderRemoteModel = teamLenderRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			TeamLenderLocalServiceUtil.addTeamLender(this);
		}
		else {
			TeamLenderLocalServiceUtil.updateTeamLender(this);
		}
	}

	@Override
	public TeamLender toEscapedModel() {
		return (TeamLender)Proxy.newProxyInstance(TeamLender.class.getClassLoader(),
			new Class[] { TeamLender.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TeamLenderClp clone = new TeamLenderClp();

		clone.setTeam_lender_Id(getTeam_lender_Id());
		clone.setLender_Id(getLender_Id());
		clone.setTeam_Id(getTeam_Id());
		clone.setChanged_By(getChanged_By());
		clone.setChanged_Time(getChanged_Time());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());

		return clone;
	}

	public int compareTo(TeamLender teamLender) {
		int value = 0;

		if (getTeam_lender_Id() < teamLender.getTeam_lender_Id()) {
			value = -1;
		}
		else if (getTeam_lender_Id() > teamLender.getTeam_lender_Id()) {
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

		TeamLenderClp teamLender = null;

		try {
			teamLender = (TeamLenderClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = teamLender.getPrimaryKey();

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
		StringBundler sb = new StringBundler(15);

		sb.append("{team_lender_Id=");
		sb.append(getTeam_lender_Id());
		sb.append(", lender_Id=");
		sb.append(getLender_Id());
		sb.append(", team_Id=");
		sb.append(getTeam_Id());
		sb.append(", changed_By=");
		sb.append(getChanged_By());
		sb.append(", changed_Time=");
		sb.append(getChanged_Time());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("org.goodreturn.model.TeamLender");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>team_lender_Id</column-name><column-value><![CDATA[");
		sb.append(getTeam_lender_Id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lender_Id</column-name><column-value><![CDATA[");
		sb.append(getLender_Id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>team_Id</column-name><column-value><![CDATA[");
		sb.append(getTeam_Id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>changed_By</column-name><column-value><![CDATA[");
		sb.append(getChanged_By());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>changed_Time</column-name><column-value><![CDATA[");
		sb.append(getChanged_Time());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _team_lender_Id;
	private long _lender_Id;
	private long _team_Id;
	private String _changed_By;
	private long _changed_Time;
	private long _groupId;
	private long _companyId;
	private BaseModel<?> _teamLenderRemoteModel;
}