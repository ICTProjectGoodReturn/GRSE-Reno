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

		attributes.put("borrower_Id", getBorrower_Id());
		attributes.put("abacus_Person_Id", getAbacus_Person_Id());
		attributes.put("village", getVillage());
		attributes.put("district", getDistrict());
		attributes.put("pdf_Link", getPdf_Link());
		attributes.put("currency", getCurrency());
		attributes.put("changed_By", getChanged_By());
		attributes.put("changed_Time", getChanged_Time());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long borrower_Id = (Long)attributes.get("borrower_Id");

		if (borrower_Id != null) {
			setBorrower_Id(borrower_Id);
		}

		Long abacus_Person_Id = (Long)attributes.get("abacus_Person_Id");

		if (abacus_Person_Id != null) {
			setAbacus_Person_Id(abacus_Person_Id);
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

		String changed_By = (String)attributes.get("changed_By");

		if (changed_By != null) {
			setChanged_By(changed_By);
		}

		Long changed_Time = (Long)attributes.get("changed_Time");

		if (changed_Time != null) {
			setChanged_Time(changed_Time);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
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
	* Returns the borrower_ ID of this borrower.
	*
	* @return the borrower_ ID of this borrower
	*/
	public long getBorrower_Id() {
		return _borrower.getBorrower_Id();
	}

	/**
	* Sets the borrower_ ID of this borrower.
	*
	* @param borrower_Id the borrower_ ID of this borrower
	*/
	public void setBorrower_Id(long borrower_Id) {
		_borrower.setBorrower_Id(borrower_Id);
	}

	/**
	* Returns the abacus_ person_ ID of this borrower.
	*
	* @return the abacus_ person_ ID of this borrower
	*/
	public long getAbacus_Person_Id() {
		return _borrower.getAbacus_Person_Id();
	}

	/**
	* Sets the abacus_ person_ ID of this borrower.
	*
	* @param abacus_Person_Id the abacus_ person_ ID of this borrower
	*/
	public void setAbacus_Person_Id(long abacus_Person_Id) {
		_borrower.setAbacus_Person_Id(abacus_Person_Id);
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
	* Returns the changed_ by of this borrower.
	*
	* @return the changed_ by of this borrower
	*/
	public java.lang.String getChanged_By() {
		return _borrower.getChanged_By();
	}

	/**
	* Sets the changed_ by of this borrower.
	*
	* @param changed_By the changed_ by of this borrower
	*/
	public void setChanged_By(java.lang.String changed_By) {
		_borrower.setChanged_By(changed_By);
	}

	/**
	* Returns the changed_ time of this borrower.
	*
	* @return the changed_ time of this borrower
	*/
	public long getChanged_Time() {
		return _borrower.getChanged_Time();
	}

	/**
	* Sets the changed_ time of this borrower.
	*
	* @param changed_Time the changed_ time of this borrower
	*/
	public void setChanged_Time(long changed_Time) {
		_borrower.setChanged_Time(changed_Time);
	}

	/**
	* Returns the group ID of this borrower.
	*
	* @return the group ID of this borrower
	*/
	public long getGroupId() {
		return _borrower.getGroupId();
	}

	/**
	* Sets the group ID of this borrower.
	*
	* @param groupId the group ID of this borrower
	*/
	public void setGroupId(long groupId) {
		_borrower.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this borrower.
	*
	* @return the company ID of this borrower
	*/
	public long getCompanyId() {
		return _borrower.getCompanyId();
	}

	/**
	* Sets the company ID of this borrower.
	*
	* @param companyId the company ID of this borrower
	*/
	public void setCompanyId(long companyId) {
		_borrower.setCompanyId(companyId);
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