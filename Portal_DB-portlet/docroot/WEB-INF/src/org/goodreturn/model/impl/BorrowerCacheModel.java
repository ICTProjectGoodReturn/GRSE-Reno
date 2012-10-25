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

import org.goodreturn.model.Borrower;

import java.io.Serializable;

/**
 * The cache model class for representing Borrower in entity cache.
 *
 * @author gilaa004
 * @see Borrower
 * @generated
 */
public class BorrowerCacheModel implements CacheModel<Borrower>, Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{borrower_Id=");
		sb.append(borrower_Id);
		sb.append(", abacus_Person_Id=");
		sb.append(abacus_Person_Id);
		sb.append(", village=");
		sb.append(village);
		sb.append(", district=");
		sb.append(district);
		sb.append(", pdf_Link=");
		sb.append(pdf_Link);
		sb.append(", currency=");
		sb.append(currency);
		sb.append(", changed_By=");
		sb.append(changed_By);
		sb.append(", changed_Time=");
		sb.append(changed_Time);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append("}");

		return sb.toString();
	}

	public Borrower toEntityModel() {
		BorrowerImpl borrowerImpl = new BorrowerImpl();

		borrowerImpl.setBorrower_Id(borrower_Id);
		borrowerImpl.setAbacus_Person_Id(abacus_Person_Id);

		if (village == null) {
			borrowerImpl.setVillage(StringPool.BLANK);
		}
		else {
			borrowerImpl.setVillage(village);
		}

		if (district == null) {
			borrowerImpl.setDistrict(StringPool.BLANK);
		}
		else {
			borrowerImpl.setDistrict(district);
		}

		if (pdf_Link == null) {
			borrowerImpl.setPdf_Link(StringPool.BLANK);
		}
		else {
			borrowerImpl.setPdf_Link(pdf_Link);
		}

		borrowerImpl.setCurrency(currency);

		if (changed_By == null) {
			borrowerImpl.setChanged_By(StringPool.BLANK);
		}
		else {
			borrowerImpl.setChanged_By(changed_By);
		}

		borrowerImpl.setChanged_Time(changed_Time);
		borrowerImpl.setGroupId(groupId);
		borrowerImpl.setCompanyId(companyId);

		borrowerImpl.resetOriginalValues();

		return borrowerImpl;
	}

	public long borrower_Id;
	public long abacus_Person_Id;
	public String village;
	public String district;
	public String pdf_Link;
	public double currency;
	public String changed_By;
	public long changed_Time;
	public long groupId;
	public long companyId;
}