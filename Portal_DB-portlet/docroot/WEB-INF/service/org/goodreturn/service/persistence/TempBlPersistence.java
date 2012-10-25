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

import org.goodreturn.model.TempBl;

/**
 * The persistence interface for the temp bl service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author gilaa004
 * @see TempBlPersistenceImpl
 * @see TempBlUtil
 * @generated
 */
public interface TempBlPersistence extends BasePersistence<TempBl> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TempBlUtil} to access the temp bl persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the temp bl in the entity cache if it is enabled.
	*
	* @param tempBl the temp bl
	*/
	public void cacheResult(org.goodreturn.model.TempBl tempBl);

	/**
	* Caches the temp bls in the entity cache if it is enabled.
	*
	* @param tempBls the temp bls
	*/
	public void cacheResult(java.util.List<org.goodreturn.model.TempBl> tempBls);

	/**
	* Creates a new temp bl with the primary key. Does not add the temp bl to the database.
	*
	* @param tempBlPK the primary key for the new temp bl
	* @return the new temp bl
	*/
	public org.goodreturn.model.TempBl create(
		org.goodreturn.service.persistence.TempBlPK tempBlPK);

	/**
	* Removes the temp bl with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param tempBlPK the primary key of the temp bl
	* @return the temp bl that was removed
	* @throws org.goodreturn.NoSuchTempBlException if a temp bl with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.goodreturn.model.TempBl remove(
		org.goodreturn.service.persistence.TempBlPK tempBlPK)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.goodreturn.NoSuchTempBlException;

	public org.goodreturn.model.TempBl updateImpl(
		org.goodreturn.model.TempBl tempBl, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the temp bl with the primary key or throws a {@link org.goodreturn.NoSuchTempBlException} if it could not be found.
	*
	* @param tempBlPK the primary key of the temp bl
	* @return the temp bl
	* @throws org.goodreturn.NoSuchTempBlException if a temp bl with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.goodreturn.model.TempBl findByPrimaryKey(
		org.goodreturn.service.persistence.TempBlPK tempBlPK)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.goodreturn.NoSuchTempBlException;

	/**
	* Returns the temp bl with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param tempBlPK the primary key of the temp bl
	* @return the temp bl, or <code>null</code> if a temp bl with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.goodreturn.model.TempBl fetchByPrimaryKey(
		org.goodreturn.service.persistence.TempBlPK tempBlPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the temp bls where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching temp bls
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.goodreturn.model.TempBl> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the temp bls where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of temp bls
	* @param end the upper bound of the range of temp bls (not inclusive)
	* @return the range of matching temp bls
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.goodreturn.model.TempBl> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the temp bls where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of temp bls
	* @param end the upper bound of the range of temp bls (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching temp bls
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.goodreturn.model.TempBl> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first temp bl in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching temp bl
	* @throws org.goodreturn.NoSuchTempBlException if a matching temp bl could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.goodreturn.model.TempBl findByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.goodreturn.NoSuchTempBlException;

	/**
	* Returns the first temp bl in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching temp bl, or <code>null</code> if a matching temp bl could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.goodreturn.model.TempBl fetchByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last temp bl in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching temp bl
	* @throws org.goodreturn.NoSuchTempBlException if a matching temp bl could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.goodreturn.model.TempBl findByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.goodreturn.NoSuchTempBlException;

	/**
	* Returns the last temp bl in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching temp bl, or <code>null</code> if a matching temp bl could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.goodreturn.model.TempBl fetchByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the temp bls before and after the current temp bl in the ordered set where groupId = &#63;.
	*
	* @param tempBlPK the primary key of the current temp bl
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next temp bl
	* @throws org.goodreturn.NoSuchTempBlException if a temp bl with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.goodreturn.model.TempBl[] findByGroupId_PrevAndNext(
		org.goodreturn.service.persistence.TempBlPK tempBlPK, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.goodreturn.NoSuchTempBlException;

	/**
	* Returns all the temp bls.
	*
	* @return the temp bls
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.goodreturn.model.TempBl> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the temp bls.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of temp bls
	* @param end the upper bound of the range of temp bls (not inclusive)
	* @return the range of temp bls
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.goodreturn.model.TempBl> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the temp bls.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of temp bls
	* @param end the upper bound of the range of temp bls (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of temp bls
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.goodreturn.model.TempBl> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the temp bls where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the temp bls from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of temp bls where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching temp bls
	* @throws SystemException if a system exception occurred
	*/
	public int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of temp bls.
	*
	* @return the number of temp bls
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}