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

package org.GoodReturn.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import org.GoodReturn.model.TeamLender;

import org.GoodReturn.service.TeamLenderLocalServiceUtil;

/**
 * The extended model base implementation for the TeamLender service. Represents a row in the &quot;WEAL_TeamLender&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link TeamLenderImpl}.
 * </p>
 *
 * @author gilaa004
 * @see TeamLenderImpl
 * @see org.GoodReturn.model.TeamLender
 * @generated
 */
public abstract class TeamLenderBaseImpl extends TeamLenderModelImpl
	implements TeamLender {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a team lender model instance should use the {@link TeamLender} interface instead.
	 */
	public void persist() throws SystemException {
		if (this.isNew()) {
			TeamLenderLocalServiceUtil.addTeamLender(this);
		}
		else {
			TeamLenderLocalServiceUtil.updateTeamLender(this);
		}
	}
}