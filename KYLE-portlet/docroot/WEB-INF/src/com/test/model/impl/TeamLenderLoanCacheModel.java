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

import com.test.model.TeamLenderLoan;

import java.io.Serializable;

/**
 * The cache model class for representing TeamLenderLoan in entity cache.
 *
 * @author gilaa004
 * @see TeamLenderLoan
 * @generated
 */
public class TeamLenderLoanCacheModel implements CacheModel<TeamLenderLoan>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(3);

		sb.append("{account_Id=");
		sb.append(account_Id);

		return sb.toString();
	}

	public TeamLenderLoan toEntityModel() {
		TeamLenderLoanImpl teamLenderLoanImpl = new TeamLenderLoanImpl();

		teamLenderLoanImpl.setAccount_Id(account_Id);

		teamLenderLoanImpl.resetOriginalValues();

		return teamLenderLoanImpl;
	}

	public long account_Id;
}