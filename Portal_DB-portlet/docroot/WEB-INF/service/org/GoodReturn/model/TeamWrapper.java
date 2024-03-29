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

import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Team}.
 * </p>
 *
 * @author    gilaa004
 * @see       Team
 * @generated
 */
public class TeamWrapper implements Team, ModelWrapper<Team> {
	public TeamWrapper(Team team) {
		_team = team;
	}

	public Class<?> getModelClass() {
		return Team.class;
	}

	public String getModelClassName() {
		return Team.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("team_Id", getTeam_Id());
		attributes.put("team_Name", getTeam_Name());
		attributes.put("change_By", getChange_By());
		attributes.put("change_Time", getChange_Time());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());

		return attributes;
	}

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

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}
	}

	/**
	* Returns the primary key of this team.
	*
	* @return the primary key of this team
	*/
	public long getPrimaryKey() {
		return _team.getPrimaryKey();
	}

	/**
	* Sets the primary key of this team.
	*
	* @param primaryKey the primary key of this team
	*/
	public void setPrimaryKey(long primaryKey) {
		_team.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the team_ ID of this team.
	*
	* @return the team_ ID of this team
	*/
	public long getTeam_Id() {
		return _team.getTeam_Id();
	}

	/**
	* Sets the team_ ID of this team.
	*
	* @param team_Id the team_ ID of this team
	*/
	public void setTeam_Id(long team_Id) {
		_team.setTeam_Id(team_Id);
	}

	/**
	* Returns the team_ name of this team.
	*
	* @return the team_ name of this team
	*/
	public java.lang.String getTeam_Name() {
		return _team.getTeam_Name();
	}

	/**
	* Sets the team_ name of this team.
	*
	* @param team_Name the team_ name of this team
	*/
	public void setTeam_Name(java.lang.String team_Name) {
		_team.setTeam_Name(team_Name);
	}

	/**
	* Returns the change_ by of this team.
	*
	* @return the change_ by of this team
	*/
	public java.lang.String getChange_By() {
		return _team.getChange_By();
	}

	/**
	* Sets the change_ by of this team.
	*
	* @param change_By the change_ by of this team
	*/
	public void setChange_By(java.lang.String change_By) {
		_team.setChange_By(change_By);
	}

	/**
	* Returns the change_ time of this team.
	*
	* @return the change_ time of this team
	*/
	public long getChange_Time() {
		return _team.getChange_Time();
	}

	/**
	* Sets the change_ time of this team.
	*
	* @param change_Time the change_ time of this team
	*/
	public void setChange_Time(long change_Time) {
		_team.setChange_Time(change_Time);
	}

	/**
	* Returns the group ID of this team.
	*
	* @return the group ID of this team
	*/
	public long getGroupId() {
		return _team.getGroupId();
	}

	/**
	* Sets the group ID of this team.
	*
	* @param groupId the group ID of this team
	*/
	public void setGroupId(long groupId) {
		_team.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this team.
	*
	* @return the company ID of this team
	*/
	public long getCompanyId() {
		return _team.getCompanyId();
	}

	/**
	* Sets the company ID of this team.
	*
	* @param companyId the company ID of this team
	*/
	public void setCompanyId(long companyId) {
		_team.setCompanyId(companyId);
	}

	public boolean isNew() {
		return _team.isNew();
	}

	public void setNew(boolean n) {
		_team.setNew(n);
	}

	public boolean isCachedModel() {
		return _team.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_team.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _team.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _team.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_team.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _team.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_team.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TeamWrapper((Team)_team.clone());
	}

	public int compareTo(org.goodreturn.model.Team team) {
		return _team.compareTo(team);
	}

	@Override
	public int hashCode() {
		return _team.hashCode();
	}

	public com.liferay.portal.model.CacheModel<org.goodreturn.model.Team> toCacheModel() {
		return _team.toCacheModel();
	}

	public org.goodreturn.model.Team toEscapedModel() {
		return new TeamWrapper(_team.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _team.toString();
	}

	public java.lang.String toXmlString() {
		return _team.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_team.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public Team getWrappedTeam() {
		return _team;
	}

	public Team getWrappedModel() {
		return _team;
	}

	public void resetOriginalValues() {
		_team.resetOriginalValues();
	}

	private Team _team;
}