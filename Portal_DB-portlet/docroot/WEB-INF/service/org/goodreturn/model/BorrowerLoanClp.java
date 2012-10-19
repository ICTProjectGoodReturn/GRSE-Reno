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

package org.goodreturn.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import org.goodreturn.service.BorrowerLoanLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author gilaa004
 */
public class BorrowerLoanClp extends BaseModelImpl<BorrowerLoan>
	implements BorrowerLoan {
	public BorrowerLoanClp() {
	}

	public Class<?> getModelClass() {
		return BorrowerLoan.class;
	}

	public String getModelClassName() {
		return BorrowerLoan.class.getName();
	}

	public long getPrimaryKey() {
		return _borrower_Loan_Id;
	}

	public void setPrimaryKey(long primaryKey) {
		setBorrower_Loan_Id(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_borrower_Loan_Id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("borrower_Loan_Id", getBorrower_Loan_Id());
		attributes.put("borrower_Id", getBorrower_Id());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long borrower_Loan_Id = (Long)attributes.get("borrower_Loan_Id");

		if (borrower_Loan_Id != null) {
			setBorrower_Loan_Id(borrower_Loan_Id);
		}

		Long borrower_Id = (Long)attributes.get("borrower_Id");

		if (borrower_Id != null) {
			setBorrower_Id(borrower_Id);
		}
	}

	public long getBorrower_Loan_Id() {
		return _borrower_Loan_Id;
	}

	public void setBorrower_Loan_Id(long borrower_Loan_Id) {
		_borrower_Loan_Id = borrower_Loan_Id;
	}

	public long getBorrower_Id() {
		return _borrower_Id;
	}

	public void setBorrower_Id(long borrower_Id) {
		_borrower_Id = borrower_Id;
	}

	public BaseModel<?> getBorrowerLoanRemoteModel() {
		return _borrowerLoanRemoteModel;
	}

	public void setBorrowerLoanRemoteModel(BaseModel<?> borrowerLoanRemoteModel) {
		_borrowerLoanRemoteModel = borrowerLoanRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			BorrowerLoanLocalServiceUtil.addBorrowerLoan(this);
		}
		else {
			BorrowerLoanLocalServiceUtil.updateBorrowerLoan(this);
		}
	}

	@Override
	public BorrowerLoan toEscapedModel() {
		return (BorrowerLoan)Proxy.newProxyInstance(BorrowerLoan.class.getClassLoader(),
			new Class[] { BorrowerLoan.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		BorrowerLoanClp clone = new BorrowerLoanClp();

		clone.setBorrower_Loan_Id(getBorrower_Loan_Id());
		clone.setBorrower_Id(getBorrower_Id());

		return clone;
	}

	public int compareTo(BorrowerLoan borrowerLoan) {
		int value = 0;

		if (getBorrower_Loan_Id() < borrowerLoan.getBorrower_Loan_Id()) {
			value = -1;
		}
		else if (getBorrower_Loan_Id() > borrowerLoan.getBorrower_Loan_Id()) {
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

		BorrowerLoanClp borrowerLoan = null;

		try {
			borrowerLoan = (BorrowerLoanClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = borrowerLoan.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{borrower_Loan_Id=");
		sb.append(getBorrower_Loan_Id());
		sb.append(", borrower_Id=");
		sb.append(getBorrower_Id());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("org.goodreturn.model.BorrowerLoan");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>borrower_Loan_Id</column-name><column-value><![CDATA[");
		sb.append(getBorrower_Loan_Id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>borrower_Id</column-name><column-value><![CDATA[");
		sb.append(getBorrower_Id());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _borrower_Loan_Id;
	private long _borrower_Id;
	private BaseModel<?> _borrowerLoanRemoteModel;
}