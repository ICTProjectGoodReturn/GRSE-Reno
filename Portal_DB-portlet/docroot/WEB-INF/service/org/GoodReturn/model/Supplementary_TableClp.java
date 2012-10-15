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

import org.goodreturn.service.Supplementary_TableLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author gilaa004
 */
public class Supplementary_TableClp extends BaseModelImpl<Supplementary_Table>
	implements Supplementary_Table {
	public Supplementary_TableClp() {
	}

	public Class<?> getModelClass() {
		return Supplementary_Table.class;
	}

	public String getModelClassName() {
		return Supplementary_Table.class.getName();
	}

	public long getPrimaryKey() {
		return _table_Id;
	}

	public void setPrimaryKey(long primaryKey) {
		setTable_Id(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_table_Id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("table_Id", getTable_Id());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long table_Id = (Long)attributes.get("table_Id");

		if (table_Id != null) {
			setTable_Id(table_Id);
		}
	}

	public long getTable_Id() {
		return _table_Id;
	}

	public void setTable_Id(long table_Id) {
		_table_Id = table_Id;
	}

	public BaseModel<?> getSupplementary_TableRemoteModel() {
		return _supplementary_TableRemoteModel;
	}

	public void setSupplementary_TableRemoteModel(
		BaseModel<?> supplementary_TableRemoteModel) {
		_supplementary_TableRemoteModel = supplementary_TableRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			Supplementary_TableLocalServiceUtil.addSupplementary_Table(this);
		}
		else {
			Supplementary_TableLocalServiceUtil.updateSupplementary_Table(this);
		}
	}

	@Override
	public Supplementary_Table toEscapedModel() {
		return (Supplementary_Table)Proxy.newProxyInstance(Supplementary_Table.class.getClassLoader(),
			new Class[] { Supplementary_Table.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		Supplementary_TableClp clone = new Supplementary_TableClp();

		clone.setTable_Id(getTable_Id());

		return clone;
	}

	public int compareTo(Supplementary_Table supplementary_Table) {
		int value = 0;

		if (getTable_Id() < supplementary_Table.getTable_Id()) {
			value = -1;
		}
		else if (getTable_Id() > supplementary_Table.getTable_Id()) {
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

		Supplementary_TableClp supplementary_Table = null;

		try {
			supplementary_Table = (Supplementary_TableClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = supplementary_Table.getPrimaryKey();

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

		sb.append("{table_Id=");
		sb.append(getTable_Id());

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(7);

		sb.append("<model><model-name>");
		sb.append("org.goodreturn.model.Supplementary_Table");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>table_Id</column-name><column-value><![CDATA[");
		sb.append(getTable_Id());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _table_Id;
	private BaseModel<?> _supplementary_TableRemoteModel;
}