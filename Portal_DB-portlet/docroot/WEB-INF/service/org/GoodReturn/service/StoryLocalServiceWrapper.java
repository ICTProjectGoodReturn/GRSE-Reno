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

package org.goodreturn.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link StoryLocalService}.
 * </p>
 *
 * @author    gilaa004
 * @see       StoryLocalService
 * @generated
 */
public class StoryLocalServiceWrapper implements StoryLocalService,
	ServiceWrapper<StoryLocalService> {
	public StoryLocalServiceWrapper(StoryLocalService storyLocalService) {
		_storyLocalService = storyLocalService;
	}

	/**
	* Adds the story to the database. Also notifies the appropriate model listeners.
	*
	* @param story the story
	* @return the story that was added
	* @throws SystemException if a system exception occurred
	*/
	public org.goodreturn.model.Story addStory(org.goodreturn.model.Story story)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _storyLocalService.addStory(story);
	}

	/**
	* Creates a new story with the primary key. Does not add the story to the database.
	*
	* @param storyPK the primary key for the new story
	* @return the new story
	*/
	public org.goodreturn.model.Story createStory(
		org.goodreturn.service.persistence.StoryPK storyPK) {
		return _storyLocalService.createStory(storyPK);
	}

	/**
	* Deletes the story with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param storyPK the primary key of the story
	* @return the story that was removed
	* @throws PortalException if a story with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.goodreturn.model.Story deleteStory(
		org.goodreturn.service.persistence.StoryPK storyPK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _storyLocalService.deleteStory(storyPK);
	}

	/**
	* Deletes the story from the database. Also notifies the appropriate model listeners.
	*
	* @param story the story
	* @return the story that was removed
	* @throws SystemException if a system exception occurred
	*/
	public org.goodreturn.model.Story deleteStory(
		org.goodreturn.model.Story story)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _storyLocalService.deleteStory(story);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _storyLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _storyLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _storyLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _storyLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _storyLocalService.dynamicQueryCount(dynamicQuery);
	}

	public org.goodreturn.model.Story fetchStory(
		org.goodreturn.service.persistence.StoryPK storyPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _storyLocalService.fetchStory(storyPK);
	}

	/**
	* Returns the story with the primary key.
	*
	* @param storyPK the primary key of the story
	* @return the story
	* @throws PortalException if a story with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.goodreturn.model.Story getStory(
		org.goodreturn.service.persistence.StoryPK storyPK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _storyLocalService.getStory(storyPK);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _storyLocalService.getPersistedModel(primaryKeyObj);
	}

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
	public java.util.List<org.goodreturn.model.Story> getStories(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _storyLocalService.getStories(start, end);
	}

	/**
	* Returns the number of stories.
	*
	* @return the number of stories
	* @throws SystemException if a system exception occurred
	*/
	public int getStoriesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _storyLocalService.getStoriesCount();
	}

	/**
	* Updates the story in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param story the story
	* @return the story that was updated
	* @throws SystemException if a system exception occurred
	*/
	public org.goodreturn.model.Story updateStory(
		org.goodreturn.model.Story story)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _storyLocalService.updateStory(story);
	}

	/**
	* Updates the story in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param story the story
	* @param merge whether to merge the story with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the story that was updated
	* @throws SystemException if a system exception occurred
	*/
	public org.goodreturn.model.Story updateStory(
		org.goodreturn.model.Story story, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _storyLocalService.updateStory(story, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _storyLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_storyLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _storyLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public StoryLocalService getWrappedStoryLocalService() {
		return _storyLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedStoryLocalService(StoryLocalService storyLocalService) {
		_storyLocalService = storyLocalService;
	}

	public StoryLocalService getWrappedService() {
		return _storyLocalService;
	}

	public void setWrappedService(StoryLocalService storyLocalService) {
		_storyLocalService = storyLocalService;
	}

	private StoryLocalService _storyLocalService;
}