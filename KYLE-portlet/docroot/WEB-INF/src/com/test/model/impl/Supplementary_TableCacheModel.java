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

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import com.test.model.Supplementary_Table;

import java.io.Serializable;

/**
 * The cache model class for representing Supplementary_Table in entity cache.
 *
 * @author gilaa004
 * @see Supplementary_Table
 * @generated
 */
public class Supplementary_TableCacheModel implements CacheModel<Supplementary_Table>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(3);

		sb.append("{table_Id=");
		sb.append(table_Id);

		return sb.toString();
	}

	public Supplementary_Table toEntityModel() {
		Supplementary_TableImpl supplementary_TableImpl = new Supplementary_TableImpl();

		supplementary_TableImpl.setTable_Id(table_Id);

		supplementary_TableImpl.resetOriginalValues();

		return supplementary_TableImpl;
	}

	public long table_Id;
}