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

import org.goodreturn.model.Story;

/**
 * The persistence interface for the story service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author gilaa004
 * @see StoryPersistenceImpl
 * @see StoryUtil
 * @generated
 */
public interface StoryPersistence extends BasePersistence<Story> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link StoryUtil} to access the story persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the story in the entity cache if it is enabled.
	*
	* @param story the story
	*/
	public void cacheResult(org.goodreturn.model.Story story);

	/**
	* Caches the stories in the entity cache if it is enabled.
	*
	* @param stories the stories
	*/
	public void cacheResult(java.util.List<org.goodreturn.model.Story> stories);

	/**
	* Creates a new story with the primary key. Does not add the story to the database.
	*
	* @param story_Id the primary key for the new story
	* @return the new story
	*/
	public org.goodreturn.model.Story create(long story_Id);

	/**
	* Removes the story with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param story_Id the primary key of the story
	* @return the story that was removed
	* @throws org.goodreturn.NoSuchStoryException if a story with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.goodreturn.model.Story remove(long story_Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.goodreturn.NoSuchStoryException;

	public org.goodreturn.model.Story updateImpl(
		org.goodreturn.model.Story story, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the story with the primary key or throws a {@link org.goodreturn.NoSuchStoryException} if it could not be found.
	*
	* @param story_Id the primary key of the story
	* @return the story
	* @throws org.goodreturn.NoSuchStoryException if a story with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.goodreturn.model.Story findByPrimaryKey(long story_Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.goodreturn.NoSuchStoryException;

	/**
	* Returns the story with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param story_Id the primary key of the story
	* @return the story, or <code>null</code> if a story with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.goodreturn.model.Story fetchByPrimaryKey(long story_Id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the stories where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching stories
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.goodreturn.model.Story> findByUuid(
		java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the stories where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of stories
	* @param end the upper bound of the range of stories (not inclusive)
	* @return the range of matching stories
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.goodreturn.model.Story> findByUuid(
		java.lang.String uuid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the stories where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of stories
	* @param end the upper bound of the range of stories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching stories
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.goodreturn.model.Story> findByUuid(
		java.lang.String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first story in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching story
	* @throws org.goodreturn.NoSuchStoryException if a matching story could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.goodreturn.model.Story findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.goodreturn.NoSuchStoryException;

	/**
	* Returns the first story in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching story, or <code>null</code> if a matching story could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.goodreturn.model.Story fetchByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last story in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching story
	* @throws org.goodreturn.NoSuchStoryException if a matching story could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.goodreturn.model.Story findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.goodreturn.NoSuchStoryException;

	/**
	* Returns the last story in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching story, or <code>null</code> if a matching story could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.goodreturn.model.Story fetchByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the stories before and after the current story in the ordered set where uuid = &#63;.
	*
	* @param story_Id the primary key of the current story
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next story
	* @throws org.goodreturn.NoSuchStoryException if a story with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.goodreturn.model.Story[] findByUuid_PrevAndNext(long story_Id,
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.goodreturn.NoSuchStoryException;

	/**
	* Returns the story where uuid = &#63; and groupId = &#63; or throws a {@link org.goodreturn.NoSuchStoryException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching story
	* @throws org.goodreturn.NoSuchStoryException if a matching story could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.goodreturn.model.Story findByUUID_G(java.lang.String uuid,
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.goodreturn.NoSuchStoryException;

	/**
	* Returns the story where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching story, or <code>null</code> if a matching story could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.goodreturn.model.Story fetchByUUID_G(java.lang.String uuid,
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the story where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching story, or <code>null</code> if a matching story could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.goodreturn.model.Story fetchByUUID_G(java.lang.String uuid,
		long groupId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the stories where abacus_Borrower_Loan_Id = &#63; and story_Type = &#63;.
	*
	* @param abacus_Borrower_Loan_Id the abacus_ borrower_ loan_ ID
	* @param story_Type the story_ type
	* @return the matching stories
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.goodreturn.model.Story> findByL_S(
		long abacus_Borrower_Loan_Id, java.lang.String story_Type)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the stories where abacus_Borrower_Loan_Id = &#63; and story_Type = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param abacus_Borrower_Loan_Id the abacus_ borrower_ loan_ ID
	* @param story_Type the story_ type
	* @param start the lower bound of the range of stories
	* @param end the upper bound of the range of stories (not inclusive)
	* @return the range of matching stories
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.goodreturn.model.Story> findByL_S(
		long abacus_Borrower_Loan_Id, java.lang.String story_Type, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the stories where abacus_Borrower_Loan_Id = &#63; and story_Type = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param abacus_Borrower_Loan_Id the abacus_ borrower_ loan_ ID
	* @param story_Type the story_ type
	* @param start the lower bound of the range of stories
	* @param end the upper bound of the range of stories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching stories
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.goodreturn.model.Story> findByL_S(
		long abacus_Borrower_Loan_Id, java.lang.String story_Type, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first story in the ordered set where abacus_Borrower_Loan_Id = &#63; and story_Type = &#63;.
	*
	* @param abacus_Borrower_Loan_Id the abacus_ borrower_ loan_ ID
	* @param story_Type the story_ type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching story
	* @throws org.goodreturn.NoSuchStoryException if a matching story could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.goodreturn.model.Story findByL_S_First(
		long abacus_Borrower_Loan_Id, java.lang.String story_Type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.goodreturn.NoSuchStoryException;

	/**
	* Returns the first story in the ordered set where abacus_Borrower_Loan_Id = &#63; and story_Type = &#63;.
	*
	* @param abacus_Borrower_Loan_Id the abacus_ borrower_ loan_ ID
	* @param story_Type the story_ type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching story, or <code>null</code> if a matching story could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.goodreturn.model.Story fetchByL_S_First(
		long abacus_Borrower_Loan_Id, java.lang.String story_Type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last story in the ordered set where abacus_Borrower_Loan_Id = &#63; and story_Type = &#63;.
	*
	* @param abacus_Borrower_Loan_Id the abacus_ borrower_ loan_ ID
	* @param story_Type the story_ type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching story
	* @throws org.goodreturn.NoSuchStoryException if a matching story could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.goodreturn.model.Story findByL_S_Last(
		long abacus_Borrower_Loan_Id, java.lang.String story_Type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.goodreturn.NoSuchStoryException;

	/**
	* Returns the last story in the ordered set where abacus_Borrower_Loan_Id = &#63; and story_Type = &#63;.
	*
	* @param abacus_Borrower_Loan_Id the abacus_ borrower_ loan_ ID
	* @param story_Type the story_ type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching story, or <code>null</code> if a matching story could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.goodreturn.model.Story fetchByL_S_Last(
		long abacus_Borrower_Loan_Id, java.lang.String story_Type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the stories before and after the current story in the ordered set where abacus_Borrower_Loan_Id = &#63; and story_Type = &#63;.
	*
	* @param story_Id the primary key of the current story
	* @param abacus_Borrower_Loan_Id the abacus_ borrower_ loan_ ID
	* @param story_Type the story_ type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next story
	* @throws org.goodreturn.NoSuchStoryException if a story with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.goodreturn.model.Story[] findByL_S_PrevAndNext(long story_Id,
		long abacus_Borrower_Loan_Id, java.lang.String story_Type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.goodreturn.NoSuchStoryException;

	/**
	* Returns all the stories where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @return the matching stories
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.goodreturn.model.Story> findByG_S(long groupId,
		int status) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the stories where groupId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group ID
	* @param status the status
	* @param start the lower bound of the range of stories
	* @param end the upper bound of the range of stories (not inclusive)
	* @return the range of matching stories
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.goodreturn.model.Story> findByG_S(long groupId,
		int status, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the stories where groupId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group ID
	* @param status the status
	* @param start the lower bound of the range of stories
	* @param end the upper bound of the range of stories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching stories
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.goodreturn.model.Story> findByG_S(long groupId,
		int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first story in the ordered set where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching story
	* @throws org.goodreturn.NoSuchStoryException if a matching story could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.goodreturn.model.Story findByG_S_First(long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.goodreturn.NoSuchStoryException;

	/**
	* Returns the first story in the ordered set where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching story, or <code>null</code> if a matching story could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.goodreturn.model.Story fetchByG_S_First(long groupId,
		int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last story in the ordered set where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching story
	* @throws org.goodreturn.NoSuchStoryException if a matching story could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.goodreturn.model.Story findByG_S_Last(long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.goodreturn.NoSuchStoryException;

	/**
	* Returns the last story in the ordered set where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching story, or <code>null</code> if a matching story could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.goodreturn.model.Story fetchByG_S_Last(long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the stories before and after the current story in the ordered set where groupId = &#63; and status = &#63;.
	*
	* @param story_Id the primary key of the current story
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next story
	* @throws org.goodreturn.NoSuchStoryException if a story with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.goodreturn.model.Story[] findByG_S_PrevAndNext(long story_Id,
		long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.goodreturn.NoSuchStoryException;

	/**
	* Returns all the stories that the user has permission to view where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @return the matching stories that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.goodreturn.model.Story> filterFindByG_S(
		long groupId, int status)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the stories that the user has permission to view where groupId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group ID
	* @param status the status
	* @param start the lower bound of the range of stories
	* @param end the upper bound of the range of stories (not inclusive)
	* @return the range of matching stories that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.goodreturn.model.Story> filterFindByG_S(
		long groupId, int status, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the stories that the user has permissions to view where groupId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group ID
	* @param status the status
	* @param start the lower bound of the range of stories
	* @param end the upper bound of the range of stories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching stories that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.goodreturn.model.Story> filterFindByG_S(
		long groupId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the stories before and after the current story in the ordered set of stories that the user has permission to view where groupId = &#63; and status = &#63;.
	*
	* @param story_Id the primary key of the current story
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next story
	* @throws org.goodreturn.NoSuchStoryException if a story with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.goodreturn.model.Story[] filterFindByG_S_PrevAndNext(
		long story_Id, long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.goodreturn.NoSuchStoryException;

	/**
	* Returns all the stories where abacus_Borrower_Loan_Id = &#63; and groupId = &#63;.
	*
	* @param abacus_Borrower_Loan_Id the abacus_ borrower_ loan_ ID
	* @param groupId the group ID
	* @return the matching stories
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.goodreturn.model.Story> findByL_G(
		long abacus_Borrower_Loan_Id, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the stories where abacus_Borrower_Loan_Id = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param abacus_Borrower_Loan_Id the abacus_ borrower_ loan_ ID
	* @param groupId the group ID
	* @param start the lower bound of the range of stories
	* @param end the upper bound of the range of stories (not inclusive)
	* @return the range of matching stories
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.goodreturn.model.Story> findByL_G(
		long abacus_Borrower_Loan_Id, long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the stories where abacus_Borrower_Loan_Id = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param abacus_Borrower_Loan_Id the abacus_ borrower_ loan_ ID
	* @param groupId the group ID
	* @param start the lower bound of the range of stories
	* @param end the upper bound of the range of stories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching stories
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.goodreturn.model.Story> findByL_G(
		long abacus_Borrower_Loan_Id, long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first story in the ordered set where abacus_Borrower_Loan_Id = &#63; and groupId = &#63;.
	*
	* @param abacus_Borrower_Loan_Id the abacus_ borrower_ loan_ ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching story
	* @throws org.goodreturn.NoSuchStoryException if a matching story could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.goodreturn.model.Story findByL_G_First(
		long abacus_Borrower_Loan_Id, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.goodreturn.NoSuchStoryException;

	/**
	* Returns the first story in the ordered set where abacus_Borrower_Loan_Id = &#63; and groupId = &#63;.
	*
	* @param abacus_Borrower_Loan_Id the abacus_ borrower_ loan_ ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching story, or <code>null</code> if a matching story could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.goodreturn.model.Story fetchByL_G_First(
		long abacus_Borrower_Loan_Id, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last story in the ordered set where abacus_Borrower_Loan_Id = &#63; and groupId = &#63;.
	*
	* @param abacus_Borrower_Loan_Id the abacus_ borrower_ loan_ ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching story
	* @throws org.goodreturn.NoSuchStoryException if a matching story could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.goodreturn.model.Story findByL_G_Last(
		long abacus_Borrower_Loan_Id, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.goodreturn.NoSuchStoryException;

	/**
	* Returns the last story in the ordered set where abacus_Borrower_Loan_Id = &#63; and groupId = &#63;.
	*
	* @param abacus_Borrower_Loan_Id the abacus_ borrower_ loan_ ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching story, or <code>null</code> if a matching story could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.goodreturn.model.Story fetchByL_G_Last(
		long abacus_Borrower_Loan_Id, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the stories before and after the current story in the ordered set where abacus_Borrower_Loan_Id = &#63; and groupId = &#63;.
	*
	* @param story_Id the primary key of the current story
	* @param abacus_Borrower_Loan_Id the abacus_ borrower_ loan_ ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next story
	* @throws org.goodreturn.NoSuchStoryException if a story with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.goodreturn.model.Story[] findByL_G_PrevAndNext(long story_Id,
		long abacus_Borrower_Loan_Id, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.goodreturn.NoSuchStoryException;

	/**
	* Returns all the stories that the user has permission to view where abacus_Borrower_Loan_Id = &#63; and groupId = &#63;.
	*
	* @param abacus_Borrower_Loan_Id the abacus_ borrower_ loan_ ID
	* @param groupId the group ID
	* @return the matching stories that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.goodreturn.model.Story> filterFindByL_G(
		long abacus_Borrower_Loan_Id, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the stories that the user has permission to view where abacus_Borrower_Loan_Id = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param abacus_Borrower_Loan_Id the abacus_ borrower_ loan_ ID
	* @param groupId the group ID
	* @param start the lower bound of the range of stories
	* @param end the upper bound of the range of stories (not inclusive)
	* @return the range of matching stories that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.goodreturn.model.Story> filterFindByL_G(
		long abacus_Borrower_Loan_Id, long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the stories that the user has permissions to view where abacus_Borrower_Loan_Id = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param abacus_Borrower_Loan_Id the abacus_ borrower_ loan_ ID
	* @param groupId the group ID
	* @param start the lower bound of the range of stories
	* @param end the upper bound of the range of stories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching stories that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.goodreturn.model.Story> filterFindByL_G(
		long abacus_Borrower_Loan_Id, long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the stories before and after the current story in the ordered set of stories that the user has permission to view where abacus_Borrower_Loan_Id = &#63; and groupId = &#63;.
	*
	* @param story_Id the primary key of the current story
	* @param abacus_Borrower_Loan_Id the abacus_ borrower_ loan_ ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next story
	* @throws org.goodreturn.NoSuchStoryException if a story with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.goodreturn.model.Story[] filterFindByL_G_PrevAndNext(
		long story_Id, long abacus_Borrower_Loan_Id, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.goodreturn.NoSuchStoryException;

	/**
	* Returns all the stories where status = &#63;.
	*
	* @param status the status
	* @return the matching stories
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.goodreturn.model.Story> findBystatus(int status)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the stories where status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param status the status
	* @param start the lower bound of the range of stories
	* @param end the upper bound of the range of stories (not inclusive)
	* @return the range of matching stories
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.goodreturn.model.Story> findBystatus(int status,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the stories where status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param status the status
	* @param start the lower bound of the range of stories
	* @param end the upper bound of the range of stories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching stories
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.goodreturn.model.Story> findBystatus(int status,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first story in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching story
	* @throws org.goodreturn.NoSuchStoryException if a matching story could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.goodreturn.model.Story findBystatus_First(int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.goodreturn.NoSuchStoryException;

	/**
	* Returns the first story in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching story, or <code>null</code> if a matching story could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.goodreturn.model.Story fetchBystatus_First(int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last story in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching story
	* @throws org.goodreturn.NoSuchStoryException if a matching story could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.goodreturn.model.Story findBystatus_Last(int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.goodreturn.NoSuchStoryException;

	/**
	* Returns the last story in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching story, or <code>null</code> if a matching story could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.goodreturn.model.Story fetchBystatus_Last(int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the stories before and after the current story in the ordered set where status = &#63;.
	*
	* @param story_Id the primary key of the current story
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next story
	* @throws org.goodreturn.NoSuchStoryException if a story with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.goodreturn.model.Story[] findBystatus_PrevAndNext(
		long story_Id, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.goodreturn.NoSuchStoryException;

	/**
	* Returns all the stories.
	*
	* @return the stories
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.goodreturn.model.Story> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the stories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of stories
	* @param end the upper bound of the range of stories (not inclusive)
	* @return the range of stories
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.goodreturn.model.Story> findAll(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the stories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of stories
	* @param end the upper bound of the range of stories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of stories
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.goodreturn.model.Story> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the stories where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the story where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the story that was removed
	* @throws SystemException if a system exception occurred
	*/
	public org.goodreturn.model.Story removeByUUID_G(java.lang.String uuid,
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.goodreturn.NoSuchStoryException;

	/**
	* Removes all the stories where abacus_Borrower_Loan_Id = &#63; and story_Type = &#63; from the database.
	*
	* @param abacus_Borrower_Loan_Id the abacus_ borrower_ loan_ ID
	* @param story_Type the story_ type
	* @throws SystemException if a system exception occurred
	*/
	public void removeByL_S(long abacus_Borrower_Loan_Id,
		java.lang.String story_Type)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the stories where groupId = &#63; and status = &#63; from the database.
	*
	* @param groupId the group ID
	* @param status the status
	* @throws SystemException if a system exception occurred
	*/
	public void removeByG_S(long groupId, int status)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the stories where abacus_Borrower_Loan_Id = &#63; and groupId = &#63; from the database.
	*
	* @param abacus_Borrower_Loan_Id the abacus_ borrower_ loan_ ID
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByL_G(long abacus_Borrower_Loan_Id, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the stories where status = &#63; from the database.
	*
	* @param status the status
	* @throws SystemException if a system exception occurred
	*/
	public void removeBystatus(int status)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the stories from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of stories where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching stories
	* @throws SystemException if a system exception occurred
	*/
	public int countByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of stories where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching stories
	* @throws SystemException if a system exception occurred
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of stories where abacus_Borrower_Loan_Id = &#63; and story_Type = &#63;.
	*
	* @param abacus_Borrower_Loan_Id the abacus_ borrower_ loan_ ID
	* @param story_Type the story_ type
	* @return the number of matching stories
	* @throws SystemException if a system exception occurred
	*/
	public int countByL_S(long abacus_Borrower_Loan_Id,
		java.lang.String story_Type)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of stories where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @return the number of matching stories
	* @throws SystemException if a system exception occurred
	*/
	public int countByG_S(long groupId, int status)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of stories that the user has permission to view where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @return the number of matching stories that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public int filterCountByG_S(long groupId, int status)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of stories where abacus_Borrower_Loan_Id = &#63; and groupId = &#63;.
	*
	* @param abacus_Borrower_Loan_Id the abacus_ borrower_ loan_ ID
	* @param groupId the group ID
	* @return the number of matching stories
	* @throws SystemException if a system exception occurred
	*/
	public int countByL_G(long abacus_Borrower_Loan_Id, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of stories that the user has permission to view where abacus_Borrower_Loan_Id = &#63; and groupId = &#63;.
	*
	* @param abacus_Borrower_Loan_Id the abacus_ borrower_ loan_ ID
	* @param groupId the group ID
	* @return the number of matching stories that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public int filterCountByL_G(long abacus_Borrower_Loan_Id, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of stories where status = &#63;.
	*
	* @param status the status
	* @return the number of matching stories
	* @throws SystemException if a system exception occurred
	*/
	public int countBystatus(int status)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of stories.
	*
	* @return the number of stories
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}