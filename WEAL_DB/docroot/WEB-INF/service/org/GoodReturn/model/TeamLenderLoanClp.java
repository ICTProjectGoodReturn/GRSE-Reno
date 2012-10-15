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

package org.GoodReturn.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import org.GoodReturn.service.TeamLenderLoanLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author gilaa004
 */
public class TeamLenderLoanClp extends BaseModelImpl<TeamLenderLoan>
	implements TeamLenderLoan {
	public TeamLenderLoanClp() {
	}

	public Class<?> getModelClass() {
		return TeamLenderLoan.class;
	}

	public String getModelClassName() {
		return TeamLenderLoan.class.getName();
	}

	public long getPrimaryKey() {
		return _account_Id;
	}

	public void setPrimaryKey(long primaryKey) {
		setAccount_Id(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_account_Id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("account_Id", getAccount_Id());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long account_Id = (Long)attributes.get("account_Id");

		if (account_Id != null) {
			setAccount_Id(account_Id);
		}
	}

	public long getAccount_Id() {
		return _account_Id;
	}

	public void setAccount_Id(long account_Id) {
		_account_Id = account_Id;
	}

	public BaseModel<?> getTeamLenderLoanRemoteModel() {
		return _teamLenderLoanRemoteModel;
	}

	public void setTeamLenderLoanRemoteModel(
		BaseModel<?> teamLenderLoanRemoteModel) {
		_teamLenderLoanRemoteModel = teamLenderLoanRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			TeamLenderLoanLocalServiceUtil.addTeamLenderLoan(this);
		}
		else {
			TeamLenderLoanLocalServiceUtil.updateTeamLenderLoan(this);
		}
	}

	@Override
	public TeamLenderLoan toEscapedModel() {
		return (TeamLenderLoan)Proxy.newProxyInstance(TeamLenderLoan.class.getClassLoader(),
			new Class[] { TeamLenderLoan.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TeamLenderLoanClp clone = new TeamLenderLoanClp();

		clone.setAccount_Id(getAccount_Id());

		return clone;
	}

	public int compareTo(TeamLenderLoan teamLenderLoan) {
		int value = 0;

		if (getAccount_Id() < teamLenderLoan.getAccount_Id()) {
			value = -1;
		}
		else if (getAccount_Id() > teamLenderLoan.getAccount_Id()) {
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

		TeamLenderLoanClp teamLenderLoan = null;

		try {
			teamLenderLoan = (TeamLenderLoanClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = teamLenderLoan.getPrimaryKey();

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

		sb.append("{account_Id=");
		sb.append(getAccount_Id());

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(7);

		sb.append("<model><model-name>");
		sb.append("org.GoodReturn.model.TeamLenderLoan");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>account_Id</column-name><column-value><![CDATA[");
		sb.append(getAccount_Id());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _account_Id;
	private BaseModel<?> _teamLenderLoanRemoteModel;
}