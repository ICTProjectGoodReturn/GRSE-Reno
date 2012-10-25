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

import org.goodreturn.model.TempBl;

import java.io.Serializable;

/**
 * The cache model class for representing TempBl in entity cache.
 *
 * @author gilaa004
 * @see TempBl
 * @generated
 */
public class TempBlCacheModel implements CacheModel<TempBl>, Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{borrower_Name=");
		sb.append(borrower_Name);
		sb.append(", borrower_Loan_Id=");
		sb.append(borrower_Loan_Id);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append("}");

		return sb.toString();
	}

	public TempBl toEntityModel() {
		TempBlImpl tempBlImpl = new TempBlImpl();

		if (borrower_Name == null) {
			tempBlImpl.setBorrower_Name(StringPool.BLANK);
		}
		else {
			tempBlImpl.setBorrower_Name(borrower_Name);
		}

		tempBlImpl.setBorrower_Loan_Id(borrower_Loan_Id);
		tempBlImpl.setGroupId(groupId);
		tempBlImpl.setCompanyId(companyId);

		tempBlImpl.resetOriginalValues();

		return tempBlImpl;
	}

	public String borrower_Name;
	public long borrower_Loan_Id;
	public long groupId;
	public long companyId;
}