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

package org.goodreturn.service.persistence;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

/**
 * @author gilaa004
 */
public class TempBlPK implements Comparable<TempBlPK>, Serializable {
	public String borrower_Name;
	public long borrower_Loan_Id;

	public TempBlPK() {
	}

	public TempBlPK(String borrower_Name, long borrower_Loan_Id) {
		this.borrower_Name = borrower_Name;
		this.borrower_Loan_Id = borrower_Loan_Id;
	}

	public String getBorrower_Name() {
		return borrower_Name;
	}

	public void setBorrower_Name(String borrower_Name) {
		this.borrower_Name = borrower_Name;
	}

	public long getBorrower_Loan_Id() {
		return borrower_Loan_Id;
	}

	public void setBorrower_Loan_Id(long borrower_Loan_Id) {
		this.borrower_Loan_Id = borrower_Loan_Id;
	}

	public int compareTo(TempBlPK pk) {
		if (pk == null) {
			return -1;
		}

		int value = 0;

		value = borrower_Name.compareTo(pk.borrower_Name);

		if (value != 0) {
			return value;
		}

		if (borrower_Loan_Id < pk.borrower_Loan_Id) {
			value = -1;
		}
		else if (borrower_Loan_Id > pk.borrower_Loan_Id) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		TempBlPK pk = null;

		try {
			pk = (TempBlPK)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		if ((borrower_Name.equals(pk.borrower_Name)) &&
				(borrower_Loan_Id == pk.borrower_Loan_Id)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (String.valueOf(borrower_Name) +
		String.valueOf(borrower_Loan_Id)).hashCode();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(10);

		sb.append(StringPool.OPEN_CURLY_BRACE);

		sb.append("borrower_Name");
		sb.append(StringPool.EQUAL);
		sb.append(borrower_Name);

		sb.append(StringPool.COMMA);
		sb.append(StringPool.SPACE);
		sb.append("borrower_Loan_Id");
		sb.append(StringPool.EQUAL);
		sb.append(borrower_Loan_Id);

		sb.append(StringPool.CLOSE_CURLY_BRACE);

		return sb.toString();
	}
}