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

package org.GoodReturn.model;

import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Lender}.
 * </p>
 *
 * @author    gilaa004
 * @see       Lender
 * @generated
 */
public class LenderWrapper implements Lender, ModelWrapper<Lender> {
	public LenderWrapper(Lender lender) {
		_lender = lender;
	}

	public Class<?> getModelClass() {
		return Lender.class;
	}

	public String getModelClassName() {
		return Lender.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("lender_Id", getLender_Id());
		attributes.put("salutation", getSalutation());
		attributes.put("employer_Name", getEmployer_Name());
		attributes.put("comment", getComment());
		attributes.put("heard_Of_Us", getHeard_Of_Us());
		attributes.put("region", getRegion());
		attributes.put("display_Name", getDisplay_Name());
		attributes.put("date_Of_Birth", getDate_Of_Birth());
		attributes.put("reason_For_Lending", getReason_For_Lending());
		attributes.put("about_Themselves", getAbout_Themselves());
		attributes.put("automatic_Re_lend", getAutomatic_Re_lend());
		attributes.put("monthly_Repayments", getMonthly_Repayments());
		attributes.put("is_Public_Profile", getIs_Public_Profile());
		attributes.put("bank_Details", getBank_Details());
		attributes.put("recieve_Emails", getRecieve_Emails());
		attributes.put("recieve_GoodReturn_Info", getRecieve_GoodReturn_Info());
		attributes.put("is_Anonymous", getIs_Anonymous());
		attributes.put("is_Validated", getIs_Validated());
		attributes.put("current_Balance", getCurrent_Balance());
		attributes.put("paypal_Email", getPaypal_Email());
		attributes.put("password", getPassword());
		attributes.put("last_Login_Date", getLast_Login_Date());
		attributes.put("featured_Lender", getFeatured_Lender());
		attributes.put("voucher_Id", getVoucher_Id());
		attributes.put("is_Loan_Donation", getIs_Loan_Donation());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long lender_Id = (Long)attributes.get("lender_Id");

		if (lender_Id != null) {
			setLender_Id(lender_Id);
		}

		String salutation = (String)attributes.get("salutation");

		if (salutation != null) {
			setSalutation(salutation);
		}

		String employer_Name = (String)attributes.get("employer_Name");

		if (employer_Name != null) {
			setEmployer_Name(employer_Name);
		}

		String comment = (String)attributes.get("comment");

		if (comment != null) {
			setComment(comment);
		}

		String heard_Of_Us = (String)attributes.get("heard_Of_Us");

		if (heard_Of_Us != null) {
			setHeard_Of_Us(heard_Of_Us);
		}

		String region = (String)attributes.get("region");

		if (region != null) {
			setRegion(region);
		}

		String display_Name = (String)attributes.get("display_Name");

		if (display_Name != null) {
			setDisplay_Name(display_Name);
		}

		Date date_Of_Birth = (Date)attributes.get("date_Of_Birth");

		if (date_Of_Birth != null) {
			setDate_Of_Birth(date_Of_Birth);
		}

		String reason_For_Lending = (String)attributes.get("reason_For_Lending");

		if (reason_For_Lending != null) {
			setReason_For_Lending(reason_For_Lending);
		}

		String about_Themselves = (String)attributes.get("about_Themselves");

		if (about_Themselves != null) {
			setAbout_Themselves(about_Themselves);
		}

		Boolean automatic_Re_lend = (Boolean)attributes.get("automatic_Re_lend");

		if (automatic_Re_lend != null) {
			setAutomatic_Re_lend(automatic_Re_lend);
		}

		Double monthly_Repayments = (Double)attributes.get("monthly_Repayments");

		if (monthly_Repayments != null) {
			setMonthly_Repayments(monthly_Repayments);
		}

		Boolean is_Public_Profile = (Boolean)attributes.get("is_Public_Profile");

		if (is_Public_Profile != null) {
			setIs_Public_Profile(is_Public_Profile);
		}

		String bank_Details = (String)attributes.get("bank_Details");

		if (bank_Details != null) {
			setBank_Details(bank_Details);
		}

		Boolean recieve_Emails = (Boolean)attributes.get("recieve_Emails");

		if (recieve_Emails != null) {
			setRecieve_Emails(recieve_Emails);
		}

		Boolean recieve_GoodReturn_Info = (Boolean)attributes.get(
				"recieve_GoodReturn_Info");

		if (recieve_GoodReturn_Info != null) {
			setRecieve_GoodReturn_Info(recieve_GoodReturn_Info);
		}

		Boolean is_Anonymous = (Boolean)attributes.get("is_Anonymous");

		if (is_Anonymous != null) {
			setIs_Anonymous(is_Anonymous);
		}

		Boolean is_Validated = (Boolean)attributes.get("is_Validated");

		if (is_Validated != null) {
			setIs_Validated(is_Validated);
		}

		Double current_Balance = (Double)attributes.get("current_Balance");

		if (current_Balance != null) {
			setCurrent_Balance(current_Balance);
		}

		String paypal_Email = (String)attributes.get("paypal_Email");

		if (paypal_Email != null) {
			setPaypal_Email(paypal_Email);
		}

		String password = (String)attributes.get("password");

		if (password != null) {
			setPassword(password);
		}

		Date last_Login_Date = (Date)attributes.get("last_Login_Date");

		if (last_Login_Date != null) {
			setLast_Login_Date(last_Login_Date);
		}

		String featured_Lender = (String)attributes.get("featured_Lender");

		if (featured_Lender != null) {
			setFeatured_Lender(featured_Lender);
		}

		Long voucher_Id = (Long)attributes.get("voucher_Id");

		if (voucher_Id != null) {
			setVoucher_Id(voucher_Id);
		}

		Boolean is_Loan_Donation = (Boolean)attributes.get("is_Loan_Donation");

		if (is_Loan_Donation != null) {
			setIs_Loan_Donation(is_Loan_Donation);
		}
	}

	/**
	* Returns the primary key of this lender.
	*
	* @return the primary key of this lender
	*/
	public long getPrimaryKey() {
		return _lender.getPrimaryKey();
	}

	/**
	* Sets the primary key of this lender.
	*
	* @param primaryKey the primary key of this lender
	*/
	public void setPrimaryKey(long primaryKey) {
		_lender.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the lender_ ID of this lender.
	*
	* @return the lender_ ID of this lender
	*/
	public long getLender_Id() {
		return _lender.getLender_Id();
	}

	/**
	* Sets the lender_ ID of this lender.
	*
	* @param lender_Id the lender_ ID of this lender
	*/
	public void setLender_Id(long lender_Id) {
		_lender.setLender_Id(lender_Id);
	}

	/**
	* Returns the salutation of this lender.
	*
	* @return the salutation of this lender
	*/
	public java.lang.String getSalutation() {
		return _lender.getSalutation();
	}

	/**
	* Sets the salutation of this lender.
	*
	* @param salutation the salutation of this lender
	*/
	public void setSalutation(java.lang.String salutation) {
		_lender.setSalutation(salutation);
	}

	/**
	* Returns the employer_ name of this lender.
	*
	* @return the employer_ name of this lender
	*/
	public java.lang.String getEmployer_Name() {
		return _lender.getEmployer_Name();
	}

	/**
	* Sets the employer_ name of this lender.
	*
	* @param employer_Name the employer_ name of this lender
	*/
	public void setEmployer_Name(java.lang.String employer_Name) {
		_lender.setEmployer_Name(employer_Name);
	}

	/**
	* Returns the comment of this lender.
	*
	* @return the comment of this lender
	*/
	public java.lang.String getComment() {
		return _lender.getComment();
	}

	/**
	* Sets the comment of this lender.
	*
	* @param comment the comment of this lender
	*/
	public void setComment(java.lang.String comment) {
		_lender.setComment(comment);
	}

	/**
	* Returns the heard_ of_ us of this lender.
	*
	* @return the heard_ of_ us of this lender
	*/
	public java.lang.String getHeard_Of_Us() {
		return _lender.getHeard_Of_Us();
	}

	/**
	* Sets the heard_ of_ us of this lender.
	*
	* @param heard_Of_Us the heard_ of_ us of this lender
	*/
	public void setHeard_Of_Us(java.lang.String heard_Of_Us) {
		_lender.setHeard_Of_Us(heard_Of_Us);
	}

	/**
	* Returns the region of this lender.
	*
	* @return the region of this lender
	*/
	public java.lang.String getRegion() {
		return _lender.getRegion();
	}

	/**
	* Sets the region of this lender.
	*
	* @param region the region of this lender
	*/
	public void setRegion(java.lang.String region) {
		_lender.setRegion(region);
	}

	/**
	* Returns the display_ name of this lender.
	*
	* @return the display_ name of this lender
	*/
	public java.lang.String getDisplay_Name() {
		return _lender.getDisplay_Name();
	}

	/**
	* Sets the display_ name of this lender.
	*
	* @param display_Name the display_ name of this lender
	*/
	public void setDisplay_Name(java.lang.String display_Name) {
		_lender.setDisplay_Name(display_Name);
	}

	/**
	* Returns the date_ of_ birth of this lender.
	*
	* @return the date_ of_ birth of this lender
	*/
	public java.util.Date getDate_Of_Birth() {
		return _lender.getDate_Of_Birth();
	}

	/**
	* Sets the date_ of_ birth of this lender.
	*
	* @param date_Of_Birth the date_ of_ birth of this lender
	*/
	public void setDate_Of_Birth(java.util.Date date_Of_Birth) {
		_lender.setDate_Of_Birth(date_Of_Birth);
	}

	/**
	* Returns the reason_ for_ lending of this lender.
	*
	* @return the reason_ for_ lending of this lender
	*/
	public java.lang.String getReason_For_Lending() {
		return _lender.getReason_For_Lending();
	}

	/**
	* Sets the reason_ for_ lending of this lender.
	*
	* @param reason_For_Lending the reason_ for_ lending of this lender
	*/
	public void setReason_For_Lending(java.lang.String reason_For_Lending) {
		_lender.setReason_For_Lending(reason_For_Lending);
	}

	/**
	* Returns the about_ themselves of this lender.
	*
	* @return the about_ themselves of this lender
	*/
	public java.lang.String getAbout_Themselves() {
		return _lender.getAbout_Themselves();
	}

	/**
	* Sets the about_ themselves of this lender.
	*
	* @param about_Themselves the about_ themselves of this lender
	*/
	public void setAbout_Themselves(java.lang.String about_Themselves) {
		_lender.setAbout_Themselves(about_Themselves);
	}

	/**
	* Returns the automatic_ re_lend of this lender.
	*
	* @return the automatic_ re_lend of this lender
	*/
	public boolean getAutomatic_Re_lend() {
		return _lender.getAutomatic_Re_lend();
	}

	/**
	* Returns <code>true</code> if this lender is automatic_ re_lend.
	*
	* @return <code>true</code> if this lender is automatic_ re_lend; <code>false</code> otherwise
	*/
	public boolean isAutomatic_Re_lend() {
		return _lender.isAutomatic_Re_lend();
	}

	/**
	* Sets whether this lender is automatic_ re_lend.
	*
	* @param automatic_Re_lend the automatic_ re_lend of this lender
	*/
	public void setAutomatic_Re_lend(boolean automatic_Re_lend) {
		_lender.setAutomatic_Re_lend(automatic_Re_lend);
	}

	/**
	* Returns the monthly_ repayments of this lender.
	*
	* @return the monthly_ repayments of this lender
	*/
	public double getMonthly_Repayments() {
		return _lender.getMonthly_Repayments();
	}

	/**
	* Sets the monthly_ repayments of this lender.
	*
	* @param monthly_Repayments the monthly_ repayments of this lender
	*/
	public void setMonthly_Repayments(double monthly_Repayments) {
		_lender.setMonthly_Repayments(monthly_Repayments);
	}

	/**
	* Returns the is_ public_ profile of this lender.
	*
	* @return the is_ public_ profile of this lender
	*/
	public boolean getIs_Public_Profile() {
		return _lender.getIs_Public_Profile();
	}

	/**
	* Returns <code>true</code> if this lender is is_ public_ profile.
	*
	* @return <code>true</code> if this lender is is_ public_ profile; <code>false</code> otherwise
	*/
	public boolean isIs_Public_Profile() {
		return _lender.isIs_Public_Profile();
	}

	/**
	* Sets whether this lender is is_ public_ profile.
	*
	* @param is_Public_Profile the is_ public_ profile of this lender
	*/
	public void setIs_Public_Profile(boolean is_Public_Profile) {
		_lender.setIs_Public_Profile(is_Public_Profile);
	}

	/**
	* Returns the bank_ details of this lender.
	*
	* @return the bank_ details of this lender
	*/
	public java.lang.String getBank_Details() {
		return _lender.getBank_Details();
	}

	/**
	* Sets the bank_ details of this lender.
	*
	* @param bank_Details the bank_ details of this lender
	*/
	public void setBank_Details(java.lang.String bank_Details) {
		_lender.setBank_Details(bank_Details);
	}

	/**
	* Returns the recieve_ emails of this lender.
	*
	* @return the recieve_ emails of this lender
	*/
	public boolean getRecieve_Emails() {
		return _lender.getRecieve_Emails();
	}

	/**
	* Returns <code>true</code> if this lender is recieve_ emails.
	*
	* @return <code>true</code> if this lender is recieve_ emails; <code>false</code> otherwise
	*/
	public boolean isRecieve_Emails() {
		return _lender.isRecieve_Emails();
	}

	/**
	* Sets whether this lender is recieve_ emails.
	*
	* @param recieve_Emails the recieve_ emails of this lender
	*/
	public void setRecieve_Emails(boolean recieve_Emails) {
		_lender.setRecieve_Emails(recieve_Emails);
	}

	/**
	* Returns the recieve_ good return_ info of this lender.
	*
	* @return the recieve_ good return_ info of this lender
	*/
	public boolean getRecieve_GoodReturn_Info() {
		return _lender.getRecieve_GoodReturn_Info();
	}

	/**
	* Returns <code>true</code> if this lender is recieve_ good return_ info.
	*
	* @return <code>true</code> if this lender is recieve_ good return_ info; <code>false</code> otherwise
	*/
	public boolean isRecieve_GoodReturn_Info() {
		return _lender.isRecieve_GoodReturn_Info();
	}

	/**
	* Sets whether this lender is recieve_ good return_ info.
	*
	* @param recieve_GoodReturn_Info the recieve_ good return_ info of this lender
	*/
	public void setRecieve_GoodReturn_Info(boolean recieve_GoodReturn_Info) {
		_lender.setRecieve_GoodReturn_Info(recieve_GoodReturn_Info);
	}

	/**
	* Returns the is_ anonymous of this lender.
	*
	* @return the is_ anonymous of this lender
	*/
	public boolean getIs_Anonymous() {
		return _lender.getIs_Anonymous();
	}

	/**
	* Returns <code>true</code> if this lender is is_ anonymous.
	*
	* @return <code>true</code> if this lender is is_ anonymous; <code>false</code> otherwise
	*/
	public boolean isIs_Anonymous() {
		return _lender.isIs_Anonymous();
	}

	/**
	* Sets whether this lender is is_ anonymous.
	*
	* @param is_Anonymous the is_ anonymous of this lender
	*/
	public void setIs_Anonymous(boolean is_Anonymous) {
		_lender.setIs_Anonymous(is_Anonymous);
	}

	/**
	* Returns the is_ validated of this lender.
	*
	* @return the is_ validated of this lender
	*/
	public boolean getIs_Validated() {
		return _lender.getIs_Validated();
	}

	/**
	* Returns <code>true</code> if this lender is is_ validated.
	*
	* @return <code>true</code> if this lender is is_ validated; <code>false</code> otherwise
	*/
	public boolean isIs_Validated() {
		return _lender.isIs_Validated();
	}

	/**
	* Sets whether this lender is is_ validated.
	*
	* @param is_Validated the is_ validated of this lender
	*/
	public void setIs_Validated(boolean is_Validated) {
		_lender.setIs_Validated(is_Validated);
	}

	/**
	* Returns the current_ balance of this lender.
	*
	* @return the current_ balance of this lender
	*/
	public double getCurrent_Balance() {
		return _lender.getCurrent_Balance();
	}

	/**
	* Sets the current_ balance of this lender.
	*
	* @param current_Balance the current_ balance of this lender
	*/
	public void setCurrent_Balance(double current_Balance) {
		_lender.setCurrent_Balance(current_Balance);
	}

	/**
	* Returns the paypal_ email of this lender.
	*
	* @return the paypal_ email of this lender
	*/
	public java.lang.String getPaypal_Email() {
		return _lender.getPaypal_Email();
	}

	/**
	* Sets the paypal_ email of this lender.
	*
	* @param paypal_Email the paypal_ email of this lender
	*/
	public void setPaypal_Email(java.lang.String paypal_Email) {
		_lender.setPaypal_Email(paypal_Email);
	}

	/**
	* Returns the password of this lender.
	*
	* @return the password of this lender
	*/
	public java.lang.String getPassword() {
		return _lender.getPassword();
	}

	/**
	* Sets the password of this lender.
	*
	* @param password the password of this lender
	*/
	public void setPassword(java.lang.String password) {
		_lender.setPassword(password);
	}

	/**
	* Returns the last_ login_ date of this lender.
	*
	* @return the last_ login_ date of this lender
	*/
	public java.util.Date getLast_Login_Date() {
		return _lender.getLast_Login_Date();
	}

	/**
	* Sets the last_ login_ date of this lender.
	*
	* @param last_Login_Date the last_ login_ date of this lender
	*/
	public void setLast_Login_Date(java.util.Date last_Login_Date) {
		_lender.setLast_Login_Date(last_Login_Date);
	}

	/**
	* Returns the featured_ lender of this lender.
	*
	* @return the featured_ lender of this lender
	*/
	public java.lang.String getFeatured_Lender() {
		return _lender.getFeatured_Lender();
	}

	/**
	* Sets the featured_ lender of this lender.
	*
	* @param featured_Lender the featured_ lender of this lender
	*/
	public void setFeatured_Lender(java.lang.String featured_Lender) {
		_lender.setFeatured_Lender(featured_Lender);
	}

	/**
	* Returns the voucher_ ID of this lender.
	*
	* @return the voucher_ ID of this lender
	*/
	public long getVoucher_Id() {
		return _lender.getVoucher_Id();
	}

	/**
	* Sets the voucher_ ID of this lender.
	*
	* @param voucher_Id the voucher_ ID of this lender
	*/
	public void setVoucher_Id(long voucher_Id) {
		_lender.setVoucher_Id(voucher_Id);
	}

	/**
	* Returns the is_ loan_ donation of this lender.
	*
	* @return the is_ loan_ donation of this lender
	*/
	public boolean getIs_Loan_Donation() {
		return _lender.getIs_Loan_Donation();
	}

	/**
	* Returns <code>true</code> if this lender is is_ loan_ donation.
	*
	* @return <code>true</code> if this lender is is_ loan_ donation; <code>false</code> otherwise
	*/
	public boolean isIs_Loan_Donation() {
		return _lender.isIs_Loan_Donation();
	}

	/**
	* Sets whether this lender is is_ loan_ donation.
	*
	* @param is_Loan_Donation the is_ loan_ donation of this lender
	*/
	public void setIs_Loan_Donation(boolean is_Loan_Donation) {
		_lender.setIs_Loan_Donation(is_Loan_Donation);
	}

	public boolean isNew() {
		return _lender.isNew();
	}

	public void setNew(boolean n) {
		_lender.setNew(n);
	}

	public boolean isCachedModel() {
		return _lender.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_lender.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _lender.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _lender.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_lender.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _lender.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_lender.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new LenderWrapper((Lender)_lender.clone());
	}

	public int compareTo(org.GoodReturn.model.Lender lender) {
		return _lender.compareTo(lender);
	}

	@Override
	public int hashCode() {
		return _lender.hashCode();
	}

	public com.liferay.portal.model.CacheModel<org.GoodReturn.model.Lender> toCacheModel() {
		return _lender.toCacheModel();
	}

	public org.GoodReturn.model.Lender toEscapedModel() {
		return new LenderWrapper(_lender.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _lender.toString();
	}

	public java.lang.String toXmlString() {
		return _lender.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_lender.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public Lender getWrappedLender() {
		return _lender;
	}

	public Lender getWrappedModel() {
		return _lender;
	}

	public void resetOriginalValues() {
		_lender.resetOriginalValues();
	}

	private Lender _lender;
}