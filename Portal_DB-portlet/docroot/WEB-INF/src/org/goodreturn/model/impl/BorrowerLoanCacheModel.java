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

import org.goodreturn.model.BorrowerLoan;

import java.io.Serializable;

/**
 * The cache model class for representing BorrowerLoan in entity cache.
 *
 * @author gilaa004
 * @see BorrowerLoan
 * @generated
 */
public class BorrowerLoanCacheModel implements CacheModel<BorrowerLoan>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{abacus_Borrower_Loan_Id=");
		sb.append(abacus_Borrower_Loan_Id);
		sb.append(", borrower_Id=");
		sb.append(borrower_Id);
		sb.append(", abacus_mfi_Id=");
		sb.append(abacus_mfi_Id);
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

	public BorrowerLoan toEntityModel() {
		BorrowerLoanImpl borrowerLoanImpl = new BorrowerLoanImpl();

		borrowerLoanImpl.setAbacus_Borrower_Loan_Id(abacus_Borrower_Loan_Id);
		borrowerLoanImpl.setBorrower_Id(borrower_Id);
		borrowerLoanImpl.setAbacus_mfi_Id(abacus_mfi_Id);

		if (changed_By == null) {
			borrowerLoanImpl.setChanged_By(StringPool.BLANK);
		}
		else {
			borrowerLoanImpl.setChanged_By(changed_By);
		}

		if (changed_Time == null) {
			borrowerLoanImpl.setChanged_Time(StringPool.BLANK);
		}
		else {
			borrowerLoanImpl.setChanged_Time(changed_Time);
		}

		borrowerLoanImpl.setGroupId(groupId);
		borrowerLoanImpl.setCompanyId(companyId);

		borrowerLoanImpl.resetOriginalValues();

		return borrowerLoanImpl;
	}

	public long abacus_Borrower_Loan_Id;
	public long borrower_Id;
	public long abacus_mfi_Id;
	public String changed_By;
	public String changed_Time;
	public long groupId;
	public long companyId;
}