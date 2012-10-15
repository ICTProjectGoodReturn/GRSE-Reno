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

package org.GoodReturn.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import org.GoodReturn.model.Story;

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
	public void cacheResult(org.GoodReturn.model.Story story);

	/**
	* Caches the stories in the entity cache if it is enabled.
	*
	* @param stories the stories
	*/
	public void cacheResult(java.util.List<org.GoodReturn.model.Story> stories);

	/**
	* Creates a new story with the primary key. Does not add the story to the database.
	*
	* @param story_Id the primary key for the new story
	* @return the new story
	*/
	public org.GoodReturn.model.Story create(long story_Id);

	/**
	* Removes the story with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param story_Id the primary key of the story
	* @return the story that was removed
	* @throws org.GoodReturn.NoSuchStoryException if a story with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.GoodReturn.model.Story remove(long story_Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.GoodReturn.NoSuchStoryException;

	public org.GoodReturn.model.Story updateImpl(
		org.GoodReturn.model.Story story, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the story with the primary key or throws a {@link org.GoodReturn.NoSuchStoryException} if it could not be found.
	*
	* @param story_Id the primary key of the story
	* @return the story
	* @throws org.GoodReturn.NoSuchStoryException if a story with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.GoodReturn.model.Story findByPrimaryKey(long story_Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.GoodReturn.NoSuchStoryException;

	/**
	* Returns the story with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param story_Id the primary key of the story
	* @return the story, or <code>null</code> if a story with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.GoodReturn.model.Story fetchByPrimaryKey(long story_Id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the stories.
	*
	* @return the stories
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.GoodReturn.model.Story> findAll()
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
	public java.util.List<org.GoodReturn.model.Story> findAll(int start, int end)
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
	public java.util.List<org.GoodReturn.model.Story> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the stories from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
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