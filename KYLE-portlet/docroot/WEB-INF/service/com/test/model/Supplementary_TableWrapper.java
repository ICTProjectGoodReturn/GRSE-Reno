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

import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Supplementary_Table}.
 * </p>
 *
 * @author    gilaa004
 * @see       Supplementary_Table
 * @generated
 */
public class Supplementary_TableWrapper implements Supplementary_Table,
	ModelWrapper<Supplementary_Table> {
	public Supplementary_TableWrapper(Supplementary_Table supplementary_Table) {
		_supplementary_Table = supplementary_Table;
	}

	public Class<?> getModelClass() {
		return Supplementary_Table.class;
	}

	public String getModelClassName() {
		return Supplementary_Table.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("table_Id", getTable_Id());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long table_Id = (Long)attributes.get("table_Id");

		if (table_Id != null) {
			setTable_Id(table_Id);
		}
	}

	/**
	* Returns the primary key of this supplementary_ table.
	*
	* @return the primary key of this supplementary_ table
	*/
	public long getPrimaryKey() {
		return _supplementary_Table.getPrimaryKey();
	}

	/**
	* Sets the primary key of this supplementary_ table.
	*
	* @param primaryKey the primary key of this supplementary_ table
	*/
	public void setPrimaryKey(long primaryKey) {
		_supplementary_Table.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the table_ ID of this supplementary_ table.
	*
	* @return the table_ ID of this supplementary_ table
	*/
	public long getTable_Id() {
		return _supplementary_Table.getTable_Id();
	}

	/**
	* Sets the table_ ID of this supplementary_ table.
	*
	* @param table_Id the table_ ID of this supplementary_ table
	*/
	public void setTable_Id(long table_Id) {
		_supplementary_Table.setTable_Id(table_Id);
	}

	public boolean isNew() {
		return _supplementary_Table.isNew();
	}

	public void setNew(boolean n) {
		_supplementary_Table.setNew(n);
	}

	public boolean isCachedModel() {
		return _supplementary_Table.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_supplementary_Table.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _supplementary_Table.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _supplementary_Table.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_supplementary_Table.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _supplementary_Table.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_supplementary_Table.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new Supplementary_TableWrapper((Supplementary_Table)_supplementary_Table.clone());
	}

	public int compareTo(Supplementary_Table supplementary_Table) {
		return _supplementary_Table.compareTo(supplementary_Table);
	}

	@Override
	public int hashCode() {
		return _supplementary_Table.hashCode();
	}

	public com.liferay.portal.model.CacheModel<Supplementary_Table> toCacheModel() {
		return _supplementary_Table.toCacheModel();
	}

	public Supplementary_Table toEscapedModel() {
		return new Supplementary_TableWrapper(_supplementary_Table.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _supplementary_Table.toString();
	}

	public java.lang.String toXmlString() {
		return _supplementary_Table.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_supplementary_Table.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public Supplementary_Table getWrappedSupplementary_Table() {
		return _supplementary_Table;
	}

	public Supplementary_Table getWrappedModel() {
		return _supplementary_Table;
	}

	public void resetOriginalValues() {
		_supplementary_Table.resetOriginalValues();
	}

	private Supplementary_Table _supplementary_Table;
}