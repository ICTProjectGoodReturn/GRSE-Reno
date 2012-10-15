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

package com.test.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import com.test.model.Team;
import com.test.model.TeamModel;
import com.test.model.TeamSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the Team service. Represents a row in the &quot;KYLE_Team&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.test.model.TeamModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link TeamImpl}.
 * </p>
 *
 * @author gilaa004
 * @see TeamImpl
 * @see com.test.model.Team
 * @see com.test.model.TeamModel
 * @generated
 */
@JSON(strict = true)
public class TeamModelImpl extends BaseModelImpl<Team> implements TeamModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a team model instance should use the {@link com.test.model.Team} interface instead.
	 */
	public static final String TABLE_NAME = "KYLE_Team";
	public static final Object[][] TABLE_COLUMNS = {
			{ "team_Id", Types.BIGINT },
			{ "team_Name", Types.VARCHAR },
			{ "amount_Lent", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table KYLE_Team (team_Id LONG not null primary key,team_Name VARCHAR(75) null,amount_Lent VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table KYLE_Team";
	public static final String ORDER_BY_JPQL = " ORDER BY team.team_Name ASC";
	public static final String ORDER_BY_SQL = " ORDER BY KYLE_Team.team_Name ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.test.model.Team"), true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.test.model.Team"), true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static Team toModel(TeamSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Team model = new TeamImpl();

		model.setTeam_Id(soapModel.getTeam_Id());
		model.setTeam_Name(soapModel.getTeam_Name());
		model.setAmount_Lent(soapModel.getAmount_Lent());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<Team> toModels(TeamSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Team> models = new ArrayList<Team>(soapModels.length);

		for (TeamSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.test.model.Team"));

	public TeamModelImpl() {
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

	public Class<?> getModelClass() {
		return Team.class;
	}

	public String getModelClassName() {
		return Team.class.getName();
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

	@JSON
	public long getTeam_Id() {
		return _team_Id;
	}

	public void setTeam_Id(long team_Id) {
		_team_Id = team_Id;
	}

	@JSON
	public String getTeam_Name() {
		if (_team_Name == null) {
			return StringPool.BLANK;
		}
		else {
			return _team_Name;
		}
	}

	public void setTeam_Name(String team_Name) {
		_team_Name = team_Name;
	}

	@JSON
	public String getAmount_Lent() {
		if (_amount_Lent == null) {
			return StringPool.BLANK;
		}
		else {
			return _amount_Lent;
		}
	}

	public void setAmount_Lent(String amount_Lent) {
		_amount_Lent = amount_Lent;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			Team.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Team toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (Team)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public Object clone() {
		TeamImpl teamImpl = new TeamImpl();

		teamImpl.setTeam_Id(getTeam_Id());
		teamImpl.setTeam_Name(getTeam_Name());
		teamImpl.setAmount_Lent(getAmount_Lent());

		teamImpl.resetOriginalValues();

		return teamImpl;
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

		Team team = null;

		try {
			team = (Team)obj;
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
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<Team> toCacheModel() {
		TeamCacheModel teamCacheModel = new TeamCacheModel();

		teamCacheModel.team_Id = getTeam_Id();

		teamCacheModel.team_Name = getTeam_Name();

		String team_Name = teamCacheModel.team_Name;

		if ((team_Name != null) && (team_Name.length() == 0)) {
			teamCacheModel.team_Name = null;
		}

		teamCacheModel.amount_Lent = getAmount_Lent();

		String amount_Lent = teamCacheModel.amount_Lent;

		if ((amount_Lent != null) && (amount_Lent.length() == 0)) {
			teamCacheModel.amount_Lent = null;
		}

		return teamCacheModel;
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
		sb.append("com.test.model.Team");
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

	private static ClassLoader _classLoader = Team.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			Team.class
		};
	private long _team_Id;
	private String _team_Name;
	private String _amount_Lent;
	private Team _escapedModelProxy;
}