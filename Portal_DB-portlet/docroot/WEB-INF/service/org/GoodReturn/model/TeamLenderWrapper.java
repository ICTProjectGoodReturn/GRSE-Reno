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
 * This class is a wrapper for {@link TeamLender}.
 * </p>
 *
 * @author    gilaa004
 * @see       TeamLender
 * @generated
 */
public class TeamLenderWrapper implements TeamLender, ModelWrapper<TeamLender> {
	public TeamLenderWrapper(TeamLender teamLender) {
		_teamLender = teamLender;
	}

	public Class<?> getModelClass() {
		return TeamLender.class;
	}

	public String getModelClassName() {
		return TeamLender.class.getName();
	}

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

	/**
	* Returns the primary key of this team lender.
	*
	* @return the primary key of this team lender
	*/
	public long getPrimaryKey() {
		return _teamLender.getPrimaryKey();
	}

	/**
	* Sets the primary key of this team lender.
	*
	* @param primaryKey the primary key of this team lender
	*/
	public void setPrimaryKey(long primaryKey) {
		_teamLender.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the team_lender_ ID of this team lender.
	*
	* @return the team_lender_ ID of this team lender
	*/
	public long getTeam_lender_Id() {
		return _teamLender.getTeam_lender_Id();
	}

	/**
	* Sets the team_lender_ ID of this team lender.
	*
	* @param team_lender_Id the team_lender_ ID of this team lender
	*/
	public void setTeam_lender_Id(long team_lender_Id) {
		_teamLender.setTeam_lender_Id(team_lender_Id);
	}

	/**
	* Returns the lender_ ID of this team lender.
	*
	* @return the lender_ ID of this team lender
	*/
	public long getLender_Id() {
		return _teamLender.getLender_Id();
	}

	/**
	* Sets the lender_ ID of this team lender.
	*
	* @param lender_Id the lender_ ID of this team lender
	*/
	public void setLender_Id(long lender_Id) {
		_teamLender.setLender_Id(lender_Id);
	}

	/**
	* Returns the team_ ID of this team lender.
	*
	* @return the team_ ID of this team lender
	*/
	public long getTeam_Id() {
		return _teamLender.getTeam_Id();
	}

	/**
	* Sets the team_ ID of this team lender.
	*
	* @param team_Id the team_ ID of this team lender
	*/
	public void setTeam_Id(long team_Id) {
		_teamLender.setTeam_Id(team_Id);
	}

	/**
	* Returns the changed_ by of this team lender.
	*
	* @return the changed_ by of this team lender
	*/
	public java.lang.String getChanged_By() {
		return _teamLender.getChanged_By();
	}

	/**
	* Sets the changed_ by of this team lender.
	*
	* @param changed_By the changed_ by of this team lender
	*/
	public void setChanged_By(java.lang.String changed_By) {
		_teamLender.setChanged_By(changed_By);
	}

	/**
	* Returns the changed_ time of this team lender.
	*
	* @return the changed_ time of this team lender
	*/
	public long getChanged_Time() {
		return _teamLender.getChanged_Time();
	}

	/**
	* Sets the changed_ time of this team lender.
	*
	* @param changed_Time the changed_ time of this team lender
	*/
	public void setChanged_Time(long changed_Time) {
		_teamLender.setChanged_Time(changed_Time);
	}

	/**
	* Returns the group ID of this team lender.
	*
	* @return the group ID of this team lender
	*/
	public long getGroupId() {
		return _teamLender.getGroupId();
	}

	/**
	* Sets the group ID of this team lender.
	*
	* @param groupId the group ID of this team lender
	*/
	public void setGroupId(long groupId) {
		_teamLender.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this team lender.
	*
	* @return the company ID of this team lender
	*/
	public long getCompanyId() {
		return _teamLender.getCompanyId();
	}

	/**
	* Sets the company ID of this team lender.
	*
	* @param companyId the company ID of this team lender
	*/
	public void setCompanyId(long companyId) {
		_teamLender.setCompanyId(companyId);
	}

	public boolean isNew() {
		return _teamLender.isNew();
	}

	public void setNew(boolean n) {
		_teamLender.setNew(n);
	}

	public boolean isCachedModel() {
		return _teamLender.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_teamLender.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _teamLender.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _teamLender.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_teamLender.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _teamLender.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_teamLender.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TeamLenderWrapper((TeamLender)_teamLender.clone());
	}

	public int compareTo(org.goodreturn.model.TeamLender teamLender) {
		return _teamLender.compareTo(teamLender);
	}

	@Override
	public int hashCode() {
		return _teamLender.hashCode();
	}

	public com.liferay.portal.model.CacheModel<org.goodreturn.model.TeamLender> toCacheModel() {
		return _teamLender.toCacheModel();
	}

	public org.goodreturn.model.TeamLender toEscapedModel() {
		return new TeamLenderWrapper(_teamLender.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _teamLender.toString();
	}

	public java.lang.String toXmlString() {
		return _teamLender.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_teamLender.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public TeamLender getWrappedTeamLender() {
		return _teamLender;
	}

	public TeamLender getWrappedModel() {
		return _teamLender;
	}

	public void resetOriginalValues() {
		_teamLender.resetOriginalValues();
	}

	private TeamLender _teamLender;
}