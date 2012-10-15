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

package org.goodreturn.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import org.goodreturn.model.TeamLender;

import java.io.Serializable;

/**
 * The cache model class for representing TeamLender in entity cache.
 *
 * @author gilaa004
 * @see TeamLender
 * @generated
 */
public class TeamLenderCacheModel implements CacheModel<TeamLender>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(3);

		sb.append("{teamlender_Id=");
		sb.append(teamlender_Id);

		return sb.toString();
	}

	public TeamLender toEntityModel() {
		TeamLenderImpl teamLenderImpl = new TeamLenderImpl();

		teamLenderImpl.setTeamlender_Id(teamlender_Id);

		teamLenderImpl.resetOriginalValues();

		return teamLenderImpl;
	}

	public long teamlender_Id;
}