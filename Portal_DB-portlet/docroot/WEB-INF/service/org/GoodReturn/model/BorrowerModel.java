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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the Borrower service. Represents a row in the &quot;GoodReturn_Borrower&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link org.goodreturn.model.impl.BorrowerModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link org.goodreturn.model.impl.BorrowerImpl}.
 * </p>
 *
 * @author gilaa004
 * @see Borrower
 * @see org.goodreturn.model.impl.BorrowerImpl
 * @see org.goodreturn.model.impl.BorrowerModelImpl
 * @generated
 */
public interface BorrowerModel extends BaseModel<Borrower> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a borrower model instance should use the {@link Borrower} interface instead.
	 */

	/**
	 * Returns the primary key of this borrower.
	 *
	 * @return the primary key of this borrower
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this borrower.
	 *
	 * @param primaryKey the primary key of this borrower
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the borrower_ ID of this borrower.
	 *
	 * @return the borrower_ ID of this borrower
	 */
	public long getBorrower_Id();

	/**
	 * Sets the borrower_ ID of this borrower.
	 *
	 * @param borrower_Id the borrower_ ID of this borrower
	 */
	public void setBorrower_Id(long borrower_Id);

	/**
	 * Returns the abacus_ person_ ID of this borrower.
	 *
	 * @return the abacus_ person_ ID of this borrower
	 */
	public long getAbacus_Person_Id();

	/**
	 * Sets the abacus_ person_ ID of this borrower.
	 *
	 * @param abacus_Person_Id the abacus_ person_ ID of this borrower
	 */
	public void setAbacus_Person_Id(long abacus_Person_Id);

	/**
	 * Returns the village of this borrower.
	 *
	 * @return the village of this borrower
	 */
	@AutoEscape
	public String getVillage();

	/**
	 * Sets the village of this borrower.
	 *
	 * @param village the village of this borrower
	 */
	public void setVillage(String village);

	/**
	 * Returns the district of this borrower.
	 *
	 * @return the district of this borrower
	 */
	@AutoEscape
	public String getDistrict();

	/**
	 * Sets the district of this borrower.
	 *
	 * @param district the district of this borrower
	 */
	public void setDistrict(String district);

	/**
	 * Returns the pdf_ link of this borrower.
	 *
	 * @return the pdf_ link of this borrower
	 */
	@AutoEscape
	public String getPdf_Link();

	/**
	 * Sets the pdf_ link of this borrower.
	 *
	 * @param pdf_Link the pdf_ link of this borrower
	 */
	public void setPdf_Link(String pdf_Link);

	/**
	 * Returns the currency of this borrower.
	 *
	 * @return the currency of this borrower
	 */
	public double getCurrency();

	/**
	 * Sets the currency of this borrower.
	 *
	 * @param currency the currency of this borrower
	 */
	public void setCurrency(double currency);

	/**
	 * Returns the changed_ by of this borrower.
	 *
	 * @return the changed_ by of this borrower
	 */
	@AutoEscape
	public String getChanged_By();

	/**
	 * Sets the changed_ by of this borrower.
	 *
	 * @param changed_By the changed_ by of this borrower
	 */
	public void setChanged_By(String changed_By);

	/**
	 * Returns the changed_ time of this borrower.
	 *
	 * @return the changed_ time of this borrower
	 */
	public long getChanged_Time();

	/**
	 * Sets the changed_ time of this borrower.
	 *
	 * @param changed_Time the changed_ time of this borrower
	 */
	public void setChanged_Time(long changed_Time);

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

	public int compareTo(Borrower borrower);

	public int hashCode();

	public CacheModel<Borrower> toCacheModel();

	public Borrower toEscapedModel();

	public String toString();

	public String toXmlString();
}