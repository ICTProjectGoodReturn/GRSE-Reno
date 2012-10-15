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

import com.liferay.portal.service.persistence.BasePersistence;

import org.goodreturn.model.Supplementary_Table;

/**
 * The persistence interface for the supplementary_ table service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author gilaa004
 * @see Supplementary_TablePersistenceImpl
 * @see Supplementary_TableUtil
 * @generated
 */
public interface Supplementary_TablePersistence extends BasePersistence<Supplementary_Table> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link Supplementary_TableUtil} to access the supplementary_ table persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the supplementary_ table in the entity cache if it is enabled.
	*
	* @param supplementary_Table the supplementary_ table
	*/
	public void cacheResult(
		org.goodreturn.model.Supplementary_Table supplementary_Table);

	/**
	* Caches the supplementary_ tables in the entity cache if it is enabled.
	*
	* @param supplementary_Tables the supplementary_ tables
	*/
	public void cacheResult(
		java.util.List<org.goodreturn.model.Supplementary_Table> supplementary_Tables);

	/**
	* Creates a new supplementary_ table with the primary key. Does not add the supplementary_ table to the database.
	*
	* @param table_Id the primary key for the new supplementary_ table
	* @return the new supplementary_ table
	*/
	public org.goodreturn.model.Supplementary_Table create(long table_Id);

	/**
	* Removes the supplementary_ table with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param table_Id the primary key of the supplementary_ table
	* @return the supplementary_ table that was removed
	* @throws org.goodreturn.NoSuchSupplementary_TableException if a supplementary_ table with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.goodreturn.model.Supplementary_Table remove(long table_Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.goodreturn.NoSuchSupplementary_TableException;

	public org.goodreturn.model.Supplementary_Table updateImpl(
		org.goodreturn.model.Supplementary_Table supplementary_Table,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the supplementary_ table with the primary key or throws a {@link org.goodreturn.NoSuchSupplementary_TableException} if it could not be found.
	*
	* @param table_Id the primary key of the supplementary_ table
	* @return the supplementary_ table
	* @throws org.goodreturn.NoSuchSupplementary_TableException if a supplementary_ table with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.goodreturn.model.Supplementary_Table findByPrimaryKey(
		long table_Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.goodreturn.NoSuchSupplementary_TableException;

	/**
	* Returns the supplementary_ table with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param table_Id the primary key of the supplementary_ table
	* @return the supplementary_ table, or <code>null</code> if a supplementary_ table with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.goodreturn.model.Supplementary_Table fetchByPrimaryKey(
		long table_Id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the supplementary_ tables.
	*
	* @return the supplementary_ tables
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.goodreturn.model.Supplementary_Table> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the supplementary_ tables.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of supplementary_ tables
	* @param end the upper bound of the range of supplementary_ tables (not inclusive)
	* @return the range of supplementary_ tables
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.goodreturn.model.Supplementary_Table> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the supplementary_ tables.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of supplementary_ tables
	* @param end the upper bound of the range of supplementary_ tables (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of supplementary_ tables
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.goodreturn.model.Supplementary_Table> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the supplementary_ tables from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of supplementary_ tables.
	*
	* @return the number of supplementary_ tables
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}