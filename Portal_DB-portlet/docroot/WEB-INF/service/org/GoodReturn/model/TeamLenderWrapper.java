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

		attributes.put("teamlender_Id", getTeamlender_Id());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long teamlender_Id = (Long)attributes.get("teamlender_Id");

		if (teamlender_Id != null) {
			setTeamlender_Id(teamlender_Id);
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
	* Returns the teamlender_ ID of this team lender.
	*
	* @return the teamlender_ ID of this team lender
	*/
	public long getTeamlender_Id() {
		return _teamLender.getTeamlender_Id();
	}

	/**
	* Sets the teamlender_ ID of this team lender.
	*
	* @param teamlender_Id the teamlender_ ID of this team lender
	*/
	public void setTeamlender_Id(long teamlender_Id) {
		_teamLender.setTeamlender_Id(teamlender_Id);
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

	public int compareTo(TeamLender teamLender) {
		return _teamLender.compareTo(teamLender);
	}

	@Override
	public int hashCode() {
		return _teamLender.hashCode();
	}

	public com.liferay.portal.model.CacheModel<TeamLender> toCacheModel() {
		return _teamLender.toCacheModel();
	}

	public TeamLender toEscapedModel() {
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