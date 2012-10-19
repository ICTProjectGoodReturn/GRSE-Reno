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
		StringBundler sb = new StringBundler(5);

		sb.append("{borrower_Loan_Id=");
		sb.append(borrower_Loan_Id);
		sb.append(", borrower_Id=");
		sb.append(borrower_Id);
		sb.append("}");

		return sb.toString();
	}

	public BorrowerLoan toEntityModel() {
		BorrowerLoanImpl borrowerLoanImpl = new BorrowerLoanImpl();

		borrowerLoanImpl.setBorrower_Loan_Id(borrower_Loan_Id);
		borrowerLoanImpl.setBorrower_Id(borrower_Id);

		borrowerLoanImpl.resetOriginalValues();

		return borrowerLoanImpl;
	}

	public long borrower_Loan_Id;
	public long borrower_Id;
}