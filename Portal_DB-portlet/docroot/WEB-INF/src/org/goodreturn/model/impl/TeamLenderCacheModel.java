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
import com.liferay.portal.kernel.util.StringPool;
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
		StringBundler sb = new StringBundler(11);

		sb.append("{team_lender_Id=");
		sb.append(team_lender_Id);
		sb.append(", lender_Id=");
		sb.append(lender_Id);
		sb.append(", team_Id=");
		sb.append(team_Id);
		sb.append(", changed_By=");
		sb.append(changed_By);
		sb.append(", changed_Time=");
		sb.append(changed_Time);
		sb.append("}");

		return sb.toString();
	}

	public TeamLender toEntityModel() {
		TeamLenderImpl teamLenderImpl = new TeamLenderImpl();

		teamLenderImpl.setTeam_lender_Id(team_lender_Id);
		teamLenderImpl.setLender_Id(lender_Id);
		teamLenderImpl.setTeam_Id(team_Id);

		if (changed_By == null) {
			teamLenderImpl.setChanged_By(StringPool.BLANK);
		}
		else {
			teamLenderImpl.setChanged_By(changed_By);
		}

		teamLenderImpl.setChanged_Time(changed_Time);

		teamLenderImpl.resetOriginalValues();

		return teamLenderImpl;
	}

	public long team_lender_Id;
	public long lender_Id;
	public long team_Id;
	public String changed_By;
	public long changed_Time;
}