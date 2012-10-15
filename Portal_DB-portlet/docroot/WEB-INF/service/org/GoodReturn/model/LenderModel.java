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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Lender service. Represents a row in the &quot;GoodReturn_Lender&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link org.GoodReturn.model.impl.LenderModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link org.GoodReturn.model.impl.LenderImpl}.
 * </p>
 *
 * @author gilaa004
 * @see Lender
 * @see org.GoodReturn.model.impl.LenderImpl
 * @see org.GoodReturn.model.impl.LenderModelImpl
 * @generated
 */
public interface LenderModel extends BaseModel<Lender> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a lender model instance should use the {@link Lender} interface instead.
	 */

	/**
	 * Returns the primary key of this lender.
	 *
	 * @return the primary key of this lender
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this lender.
	 *
	 * @param primaryKey the primary key of this lender
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the lender_ ID of this lender.
	 *
	 * @return the lender_ ID of this lender
	 */
	public long getLender_Id();

	/**
	 * Sets the lender_ ID of this lender.
	 *
	 * @param lender_Id the lender_ ID of this lender
	 */
	public void setLender_Id(long lender_Id);

	/**
	 * Returns the salutation of this lender.
	 *
	 * @return the salutation of this lender
	 */
	@AutoEscape
	public String getSalutation();

	/**
	 * Sets the salutation of this lender.
	 *
	 * @param salutation the salutation of this lender
	 */
	public void setSalutation(String salutation);

	/**
	 * Returns the employer_ name of this lender.
	 *
	 * @return the employer_ name of this lender
	 */
	@AutoEscape
	public String getEmployer_Name();

	/**
	 * Sets the employer_ name of this lender.
	 *
	 * @param employer_Name the employer_ name of this lender
	 */
	public void setEmployer_Name(String employer_Name);

	/**
	 * Returns the comment of this lender.
	 *
	 * @return the comment of this lender
	 */
	@AutoEscape
	public String getComment();

	/**
	 * Sets the comment of this lender.
	 *
	 * @param comment the comment of this lender
	 */
	public void setComment(String comment);

	/**
	 * Returns the heard_ of_ us of this lender.
	 *
	 * @return the heard_ of_ us of this lender
	 */
	@AutoEscape
	public String getHeard_Of_Us();

	/**
	 * Sets the heard_ of_ us of this lender.
	 *
	 * @param heard_Of_Us the heard_ of_ us of this lender
	 */
	public void setHeard_Of_Us(String heard_Of_Us);

	/**
	 * Returns the region of this lender.
	 *
	 * @return the region of this lender
	 */
	@AutoEscape
	public String getRegion();

	/**
	 * Sets the region of this lender.
	 *
	 * @param region the region of this lender
	 */
	public void setRegion(String region);

	/**
	 * Returns the display_ name of this lender.
	 *
	 * @return the display_ name of this lender
	 */
	@AutoEscape
	public String getDisplay_Name();

	/**
	 * Sets the display_ name of this lender.
	 *
	 * @param display_Name the display_ name of this lender
	 */
	public void setDisplay_Name(String display_Name);

	/**
	 * Returns the date_ of_ birth of this lender.
	 *
	 * @return the date_ of_ birth of this lender
	 */
	public Date getDate_Of_Birth();

	/**
	 * Sets the date_ of_ birth of this lender.
	 *
	 * @param date_Of_Birth the date_ of_ birth of this lender
	 */
	public void setDate_Of_Birth(Date date_Of_Birth);

	/**
	 * Returns the reason_ for_ lending of this lender.
	 *
	 * @return the reason_ for_ lending of this lender
	 */
	@AutoEscape
	public String getReason_For_Lending();

	/**
	 * Sets the reason_ for_ lending of this lender.
	 *
	 * @param reason_For_Lending the reason_ for_ lending of this lender
	 */
	public void setReason_For_Lending(String reason_For_Lending);

	/**
	 * Returns the about_ themselves of this lender.
	 *
	 * @return the about_ themselves of this lender
	 */
	@AutoEscape
	public String getAbout_Themselves();

	/**
	 * Sets the about_ themselves of this lender.
	 *
	 * @param about_Themselves the about_ themselves of this lender
	 */
	public void setAbout_Themselves(String about_Themselves);

	/**
	 * Returns the automatic_ re_lend of this lender.
	 *
	 * @return the automatic_ re_lend of this lender
	 */
	public boolean getAutomatic_Re_lend();

	/**
	 * Returns <code>true</code> if this lender is automatic_ re_lend.
	 *
	 * @return <code>true</code> if this lender is automatic_ re_lend; <code>false</code> otherwise
	 */
	public boolean isAutomatic_Re_lend();

	/**
	 * Sets whether this lender is automatic_ re_lend.
	 *
	 * @param automatic_Re_lend the automatic_ re_lend of this lender
	 */
	public void setAutomatic_Re_lend(boolean automatic_Re_lend);

	/**
	 * Returns the monthly_ repayments of this lender.
	 *
	 * @return the monthly_ repayments of this lender
	 */
	public double getMonthly_Repayments();

	/**
	 * Sets the monthly_ repayments of this lender.
	 *
	 * @param monthly_Repayments the monthly_ repayments of this lender
	 */
	public void setMonthly_Repayments(double monthly_Repayments);

	/**
	 * Returns the is_ public_ profile of this lender.
	 *
	 * @return the is_ public_ profile of this lender
	 */
	public boolean getIs_Public_Profile();

	/**
	 * Returns <code>true</code> if this lender is is_ public_ profile.
	 *
	 * @return <code>true</code> if this lender is is_ public_ profile; <code>false</code> otherwise
	 */
	public boolean isIs_Public_Profile();

	/**
	 * Sets whether this lender is is_ public_ profile.
	 *
	 * @param is_Public_Profile the is_ public_ profile of this lender
	 */
	public void setIs_Public_Profile(boolean is_Public_Profile);

	/**
	 * Returns the bank_ details of this lender.
	 *
	 * @return the bank_ details of this lender
	 */
	@AutoEscape
	public String getBank_Details();

	/**
	 * Sets the bank_ details of this lender.
	 *
	 * @param bank_Details the bank_ details of this lender
	 */
	public void setBank_Details(String bank_Details);

	/**
	 * Returns the recieve_ emails of this lender.
	 *
	 * @return the recieve_ emails of this lender
	 */
	public boolean getRecieve_Emails();

	/**
	 * Returns <code>true</code> if this lender is recieve_ emails.
	 *
	 * @return <code>true</code> if this lender is recieve_ emails; <code>false</code> otherwise
	 */
	public boolean isRecieve_Emails();

	/**
	 * Sets whether this lender is recieve_ emails.
	 *
	 * @param recieve_Emails the recieve_ emails of this lender
	 */
	public void setRecieve_Emails(boolean recieve_Emails);

	/**
	 * Returns the recieve_ good return_ info of this lender.
	 *
	 * @return the recieve_ good return_ info of this lender
	 */
	public boolean getRecieve_GoodReturn_Info();

	/**
	 * Returns <code>true</code> if this lender is recieve_ good return_ info.
	 *
	 * @return <code>true</code> if this lender is recieve_ good return_ info; <code>false</code> otherwise
	 */
	public boolean isRecieve_GoodReturn_Info();

	/**
	 * Sets whether this lender is recieve_ good return_ info.
	 *
	 * @param recieve_GoodReturn_Info the recieve_ good return_ info of this lender
	 */
	public void setRecieve_GoodReturn_Info(boolean recieve_GoodReturn_Info);

	/**
	 * Returns the is_ anonymous of this lender.
	 *
	 * @return the is_ anonymous of this lender
	 */
	public boolean getIs_Anonymous();

	/**
	 * Returns <code>true</code> if this lender is is_ anonymous.
	 *
	 * @return <code>true</code> if this lender is is_ anonymous; <code>false</code> otherwise
	 */
	public boolean isIs_Anonymous();

	/**
	 * Sets whether this lender is is_ anonymous.
	 *
	 * @param is_Anonymous the is_ anonymous of this lender
	 */
	public void setIs_Anonymous(boolean is_Anonymous);

	/**
	 * Returns the is_ validated of this lender.
	 *
	 * @return the is_ validated of this lender
	 */
	public boolean getIs_Validated();

	/**
	 * Returns <code>true</code> if this lender is is_ validated.
	 *
	 * @return <code>true</code> if this lender is is_ validated; <code>false</code> otherwise
	 */
	public boolean isIs_Validated();

	/**
	 * Sets whether this lender is is_ validated.
	 *
	 * @param is_Validated the is_ validated of this lender
	 */
	public void setIs_Validated(boolean is_Validated);

	/**
	 * Returns the current_ balance of this lender.
	 *
	 * @return the current_ balance of this lender
	 */
	public double getCurrent_Balance();

	/**
	 * Sets the current_ balance of this lender.
	 *
	 * @param current_Balance the current_ balance of this lender
	 */
	public void setCurrent_Balance(double current_Balance);

	/**
	 * Returns the paypal_ email of this lender.
	 *
	 * @return the paypal_ email of this lender
	 */
	@AutoEscape
	public String getPaypal_Email();

	/**
	 * Sets the paypal_ email of this lender.
	 *
	 * @param paypal_Email the paypal_ email of this lender
	 */
	public void setPaypal_Email(String paypal_Email);

	/**
	 * Returns the password of this lender.
	 *
	 * @return the password of this lender
	 */
	@AutoEscape
	public String getPassword();

	/**
	 * Sets the password of this lender.
	 *
	 * @param password the password of this lender
	 */
	public void setPassword(String password);

	/**
	 * Returns the last_ login_ date of this lender.
	 *
	 * @return the last_ login_ date of this lender
	 */
	public Date getLast_Login_Date();

	/**
	 * Sets the last_ login_ date of this lender.
	 *
	 * @param last_Login_Date the last_ login_ date of this lender
	 */
	public void setLast_Login_Date(Date last_Login_Date);

	/**
	 * Returns the featured_ lender of this lender.
	 *
	 * @return the featured_ lender of this lender
	 */
	@AutoEscape
	public String getFeatured_Lender();

	/**
	 * Sets the featured_ lender of this lender.
	 *
	 * @param featured_Lender the featured_ lender of this lender
	 */
	public void setFeatured_Lender(String featured_Lender);

	/**
	 * Returns the voucher_ ID of this lender.
	 *
	 * @return the voucher_ ID of this lender
	 */
	public long getVoucher_Id();

	/**
	 * Sets the voucher_ ID of this lender.
	 *
	 * @param voucher_Id the voucher_ ID of this lender
	 */
	public void setVoucher_Id(long voucher_Id);

	/**
	 * Returns the is_ loan_ donation of this lender.
	 *
	 * @return the is_ loan_ donation of this lender
	 */
	public boolean getIs_Loan_Donation();

	/**
	 * Returns <code>true</code> if this lender is is_ loan_ donation.
	 *
	 * @return <code>true</code> if this lender is is_ loan_ donation; <code>false</code> otherwise
	 */
	public boolean isIs_Loan_Donation();

	/**
	 * Sets whether this lender is is_ loan_ donation.
	 *
	 * @param is_Loan_Donation the is_ loan_ donation of this lender
	 */
	public void setIs_Loan_Donation(boolean is_Loan_Donation);

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public Serializable getPrimaryKeyObj();

	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(Lender lender);

	public int hashCode();

	public CacheModel<Lender> toCacheModel();

	public Lender toEscapedModel();

	public String toString();

	public String toXmlString();
}