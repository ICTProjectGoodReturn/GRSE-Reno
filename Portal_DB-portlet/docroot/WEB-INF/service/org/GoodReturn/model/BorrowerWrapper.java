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

import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Borrower}.
 * </p>
 *
 * @author    gilaa004
 * @see       Borrower
 * @generated
 */
public class BorrowerWrapper implements Borrower, ModelWrapper<Borrower> {
	public BorrowerWrapper(Borrower borrower) {
		_borrower = borrower;
	}

	public Class<?> getModelClass() {
		return Borrower.class;
	}

	public String getModelClassName() {
		return Borrower.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("abacus_Borrower_Id", getAbacus_Borrower_Id());
		attributes.put("write_Off_Date", getWrite_Off_Date());
		attributes.put("phone", getPhone());
		attributes.put("wait_Time", getWait_Time());
		attributes.put("country", getCountry());
		attributes.put("amount_Needed", getAmount_Needed());
		attributes.put("amount_Needed_AUD", getAmount_Needed_AUD());
		attributes.put("type_Of_Person", getType_Of_Person());
		attributes.put("village", getVillage());
		attributes.put("district", getDistrict());
		attributes.put("pdf_Link", getPdf_Link());
		attributes.put("currency", getCurrency());
		attributes.put("date_Applied", getDate_Applied());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long abacus_Borrower_Id = (Long)attributes.get("abacus_Borrower_Id");

		if (abacus_Borrower_Id != null) {
			setAbacus_Borrower_Id(abacus_Borrower_Id);
		}

		Date write_Off_Date = (Date)attributes.get("write_Off_Date");

		if (write_Off_Date != null) {
			setWrite_Off_Date(write_Off_Date);
		}

		Long phone = (Long)attributes.get("phone");

		if (phone != null) {
			setPhone(phone);
		}

		Long wait_Time = (Long)attributes.get("wait_Time");

		if (wait_Time != null) {
			setWait_Time(wait_Time);
		}

		String country = (String)attributes.get("country");

		if (country != null) {
			setCountry(country);
		}

		Double amount_Needed = (Double)attributes.get("amount_Needed");

		if (amount_Needed != null) {
			setAmount_Needed(amount_Needed);
		}

		Double amount_Needed_AUD = (Double)attributes.get("amount_Needed_AUD");

		if (amount_Needed_AUD != null) {
			setAmount_Needed_AUD(amount_Needed_AUD);
		}

		String type_Of_Person = (String)attributes.get("type_Of_Person");

		if (type_Of_Person != null) {
			setType_Of_Person(type_Of_Person);
		}

		String village = (String)attributes.get("village");

		if (village != null) {
			setVillage(village);
		}

		String district = (String)attributes.get("district");

		if (district != null) {
			setDistrict(district);
		}

		String pdf_Link = (String)attributes.get("pdf_Link");

		if (pdf_Link != null) {
			setPdf_Link(pdf_Link);
		}

		Double currency = (Double)attributes.get("currency");

		if (currency != null) {
			setCurrency(currency);
		}

		Date date_Applied = (Date)attributes.get("date_Applied");

		if (date_Applied != null) {
			setDate_Applied(date_Applied);
		}
	}

	/**
	* Returns the primary key of this borrower.
	*
	* @return the primary key of this borrower
	*/
	public long getPrimaryKey() {
		return _borrower.getPrimaryKey();
	}

	/**
	* Sets the primary key of this borrower.
	*
	* @param primaryKey the primary key of this borrower
	*/
	public void setPrimaryKey(long primaryKey) {
		_borrower.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the abacus_ borrower_ ID of this borrower.
	*
	* @return the abacus_ borrower_ ID of this borrower
	*/
	public long getAbacus_Borrower_Id() {
		return _borrower.getAbacus_Borrower_Id();
	}

	/**
	* Sets the abacus_ borrower_ ID of this borrower.
	*
	* @param abacus_Borrower_Id the abacus_ borrower_ ID of this borrower
	*/
	public void setAbacus_Borrower_Id(long abacus_Borrower_Id) {
		_borrower.setAbacus_Borrower_Id(abacus_Borrower_Id);
	}

	/**
	* Returns the write_ off_ date of this borrower.
	*
	* @return the write_ off_ date of this borrower
	*/
	public java.util.Date getWrite_Off_Date() {
		return _borrower.getWrite_Off_Date();
	}

	/**
	* Sets the write_ off_ date of this borrower.
	*
	* @param write_Off_Date the write_ off_ date of this borrower
	*/
	public void setWrite_Off_Date(java.util.Date write_Off_Date) {
		_borrower.setWrite_Off_Date(write_Off_Date);
	}

	/**
	* Returns the phone of this borrower.
	*
	* @return the phone of this borrower
	*/
	public long getPhone() {
		return _borrower.getPhone();
	}

	/**
	* Sets the phone of this borrower.
	*
	* @param phone the phone of this borrower
	*/
	public void setPhone(long phone) {
		_borrower.setPhone(phone);
	}

	/**
	* Returns the wait_ time of this borrower.
	*
	* @return the wait_ time of this borrower
	*/
	public long getWait_Time() {
		return _borrower.getWait_Time();
	}

	/**
	* Sets the wait_ time of this borrower.
	*
	* @param wait_Time the wait_ time of this borrower
	*/
	public void setWait_Time(long wait_Time) {
		_borrower.setWait_Time(wait_Time);
	}

	/**
	* Returns the country of this borrower.
	*
	* @return the country of this borrower
	*/
	public java.lang.String getCountry() {
		return _borrower.getCountry();
	}

	/**
	* Sets the country of this borrower.
	*
	* @param country the country of this borrower
	*/
	public void setCountry(java.lang.String country) {
		_borrower.setCountry(country);
	}

	/**
	* Returns the amount_ needed of this borrower.
	*
	* @return the amount_ needed of this borrower
	*/
	public double getAmount_Needed() {
		return _borrower.getAmount_Needed();
	}

	/**
	* Sets the amount_ needed of this borrower.
	*
	* @param amount_Needed the amount_ needed of this borrower
	*/
	public void setAmount_Needed(double amount_Needed) {
		_borrower.setAmount_Needed(amount_Needed);
	}

	/**
	* Returns the amount_ needed_ a u d of this borrower.
	*
	* @return the amount_ needed_ a u d of this borrower
	*/
	public double getAmount_Needed_AUD() {
		return _borrower.getAmount_Needed_AUD();
	}

	/**
	* Sets the amount_ needed_ a u d of this borrower.
	*
	* @param amount_Needed_AUD the amount_ needed_ a u d of this borrower
	*/
	public void setAmount_Needed_AUD(double amount_Needed_AUD) {
		_borrower.setAmount_Needed_AUD(amount_Needed_AUD);
	}

	/**
	* Returns the type_ of_ person of this borrower.
	*
	* @return the type_ of_ person of this borrower
	*/
	public java.lang.String getType_Of_Person() {
		return _borrower.getType_Of_Person();
	}

	/**
	* Sets the type_ of_ person of this borrower.
	*
	* @param type_Of_Person the type_ of_ person of this borrower
	*/
	public void setType_Of_Person(java.lang.String type_Of_Person) {
		_borrower.setType_Of_Person(type_Of_Person);
	}

	/**
	* Returns the village of this borrower.
	*
	* @return the village of this borrower
	*/
	public java.lang.String getVillage() {
		return _borrower.getVillage();
	}

	/**
	* Sets the village of this borrower.
	*
	* @param village the village of this borrower
	*/
	public void setVillage(java.lang.String village) {
		_borrower.setVillage(village);
	}

	/**
	* Returns the district of this borrower.
	*
	* @return the district of this borrower
	*/
	public java.lang.String getDistrict() {
		return _borrower.getDistrict();
	}

	/**
	* Sets the district of this borrower.
	*
	* @param district the district of this borrower
	*/
	public void setDistrict(java.lang.String district) {
		_borrower.setDistrict(district);
	}

	/**
	* Returns the pdf_ link of this borrower.
	*
	* @return the pdf_ link of this borrower
	*/
	public java.lang.String getPdf_Link() {
		return _borrower.getPdf_Link();
	}

	/**
	* Sets the pdf_ link of this borrower.
	*
	* @param pdf_Link the pdf_ link of this borrower
	*/
	public void setPdf_Link(java.lang.String pdf_Link) {
		_borrower.setPdf_Link(pdf_Link);
	}

	/**
	* Returns the currency of this borrower.
	*
	* @return the currency of this borrower
	*/
	public double getCurrency() {
		return _borrower.getCurrency();
	}

	/**
	* Sets the currency of this borrower.
	*
	* @param currency the currency of this borrower
	*/
	public void setCurrency(double currency) {
		_borrower.setCurrency(currency);
	}

	/**
	* Returns the date_ applied of this borrower.
	*
	* @return the date_ applied of this borrower
	*/
	public java.util.Date getDate_Applied() {
		return _borrower.getDate_Applied();
	}

	/**
	* Sets the date_ applied of this borrower.
	*
	* @param date_Applied the date_ applied of this borrower
	*/
	public void setDate_Applied(java.util.Date date_Applied) {
		_borrower.setDate_Applied(date_Applied);
	}

	public boolean isNew() {
		return _borrower.isNew();
	}

	public void setNew(boolean n) {
		_borrower.setNew(n);
	}

	public boolean isCachedModel() {
		return _borrower.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_borrower.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _borrower.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _borrower.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_borrower.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _borrower.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_borrower.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new BorrowerWrapper((Borrower)_borrower.clone());
	}

	public int compareTo(org.goodreturn.model.Borrower borrower) {
		return _borrower.compareTo(borrower);
	}

	@Override
	public int hashCode() {
		return _borrower.hashCode();
	}

	public com.liferay.portal.model.CacheModel<org.goodreturn.model.Borrower> toCacheModel() {
		return _borrower.toCacheModel();
	}

	public org.goodreturn.model.Borrower toEscapedModel() {
		return new BorrowerWrapper(_borrower.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _borrower.toString();
	}

	public java.lang.String toXmlString() {
		return _borrower.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_borrower.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public Borrower getWrappedBorrower() {
		return _borrower;
	}

	public Borrower getWrappedModel() {
		return _borrower;
	}

	public void resetOriginalValues() {
		_borrower.resetOriginalValues();
	}

	private Borrower _borrower;
}