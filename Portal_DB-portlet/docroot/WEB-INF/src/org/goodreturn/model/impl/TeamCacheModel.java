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

import org.goodreturn.model.Team;

import java.io.Serializable;

/**
 * The cache model class for representing Team in entity cache.
 *
 * @author gilaa004
 * @see Team
 * @generated
 */
public class TeamCacheModel implements CacheModel<Team>, Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{team_Id=");
		sb.append(team_Id);
		sb.append(", team_Name=");
		sb.append(team_Name);
		sb.append(", amount_Lent=");
		sb.append(amount_Lent);
		sb.append("}");

		return sb.toString();
	}

	public Team toEntityModel() {
		TeamImpl teamImpl = new TeamImpl();

		teamImpl.setTeam_Id(team_Id);

		if (team_Name == null) {
			teamImpl.setTeam_Name(StringPool.BLANK);
		}
		else {
			teamImpl.setTeam_Name(team_Name);
		}

		if (amount_Lent == null) {
			teamImpl.setAmount_Lent(StringPool.BLANK);
		}
		else {
			teamImpl.setAmount_Lent(amount_Lent);
		}

		teamImpl.resetOriginalValues();

		return teamImpl;
	}

	public long team_Id;
	public String team_Name;
	public String amount_Lent;
}