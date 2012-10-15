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

package org.GoodReturn.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import org.GoodReturn.model.TeamLender;
import org.GoodReturn.model.TeamLenderModel;
import org.GoodReturn.model.TeamLenderSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the TeamLender service. Represents a row in the &quot;WEAL_TeamLender&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link org.GoodReturn.model.TeamLenderModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link TeamLenderImpl}.
 * </p>
 *
 * @author gilaa004
 * @see TeamLenderImpl
 * @see org.GoodReturn.model.TeamLender
 * @see org.GoodReturn.model.TeamLenderModel
 * @generated
 */
@JSON(strict = true)
public class TeamLenderModelImpl extends BaseModelImpl<TeamLender>
	implements TeamLenderModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a team lender model instance should use the {@link org.GoodReturn.model.TeamLender} interface instead.
	 */
	public static final String TABLE_NAME = "WEAL_TeamLender";
	public static final Object[][] TABLE_COLUMNS = {
			{ "teamlender_Id", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table WEAL_TeamLender (teamlender_Id LONG not null primary key)";
	public static final String TABLE_SQL_DROP = "drop table WEAL_TeamLender";
	public static final String ORDER_BY_JPQL = " ORDER BY teamLender.teamlender_Id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY WEAL_TeamLender.teamlender_Id ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.org.GoodReturn.model.TeamLender"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.org.GoodReturn.model.TeamLender"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static TeamLender toModel(TeamLenderSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		TeamLender model = new TeamLenderImpl();

		model.setTeamlender_Id(soapModel.getTeamlender_Id());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<TeamLender> toModels(TeamLenderSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<TeamLender> models = new ArrayList<TeamLender>(soapModels.length);

		for (TeamLenderSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.org.GoodReturn.model.TeamLender"));

	public TeamLenderModelImpl() {
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

	public Class<?> getModelClass() {
		return TeamLender.class;
	}

	public String getModelClassName() {
		return TeamLender.class.getName();
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

	@JSON
	public long getTeamlender_Id() {
		return _teamlender_Id;
	}

	public void setTeamlender_Id(long teamlender_Id) {
		_teamlender_Id = teamlender_Id;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			TeamLender.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public TeamLender toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (TeamLender)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public Object clone() {
		TeamLenderImpl teamLenderImpl = new TeamLenderImpl();

		teamLenderImpl.setTeamlender_Id(getTeamlender_Id());

		teamLenderImpl.resetOriginalValues();

		return teamLenderImpl;
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

		TeamLender teamLender = null;

		try {
			teamLender = (TeamLender)obj;
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
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<TeamLender> toCacheModel() {
		TeamLenderCacheModel teamLenderCacheModel = new TeamLenderCacheModel();

		teamLenderCacheModel.teamlender_Id = getTeamlender_Id();

		return teamLenderCacheModel;
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
		sb.append("org.GoodReturn.model.TeamLender");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>teamlender_Id</column-name><column-value><![CDATA[");
		sb.append(getTeamlender_Id());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = TeamLender.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			TeamLender.class
		};
	private long _teamlender_Id;
	private TeamLender _escapedModelProxy;
}