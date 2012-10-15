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

package com.test.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.test.service.TeamLenderLocalServiceUtil;

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
		return _teamlender_Id;
	}

	public void setPrimaryKey(long primaryKey) {
		setTeamlender_Id(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_teamlender_Id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("teamlender_Id", getTeamlender_Id());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long teamlender_Id = (Long)attributes.get("teamlender_Id");

		if (teamlender_Id != null) {
			setTeamlender_Id(teamlender_Id);
		}
	}

	public long getTeamlender_Id() {
		return _teamlender_Id;
	}

	public void setTeamlender_Id(long teamlender_Id) {
		_teamlender_Id = teamlender_Id;
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

		clone.setTeamlender_Id(getTeamlender_Id());

		return clone;
	}

	public int compareTo(TeamLender teamLender) {
		int value = 0;

		if (getTeamlender_Id() < teamLender.getTeamlender_Id()) {
			value = -1;
		}
		else if (getTeamlender_Id() > teamLender.getTeamlender_Id()) {
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
		StringBundler sb = new StringBundler(3);

		sb.append("{teamlender_Id=");
		sb.append(getTeamlender_Id());

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(7);

		sb.append("<model><model-name>");
		sb.append("com.test.model.TeamLender");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>teamlender_Id</column-name><column-value><![CDATA[");
		sb.append(getTeamlender_Id());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _teamlender_Id;
	private BaseModel<?> _teamLenderRemoteModel;
}