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

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.service.BaseLocalService;
import com.liferay.portal.service.InvokableLocalService;
import com.liferay.portal.service.PersistedModelLocalService;

/**
 * The interface for the story local service.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author gilaa004
 * @see StoryLocalServiceUtil
 * @see org.goodreturn.service.base.StoryLocalServiceBaseImpl
 * @see org.goodreturn.service.impl.StoryLocalServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface StoryLocalService extends BaseLocalService,
	InvokableLocalService, PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link StoryLocalServiceUtil} to access the story local service. Add custom service methods to {@link org.goodreturn.service.impl.StoryLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Adds the story to the database. Also notifies the appropriate model listeners.
	*
	* @param story the story
	* @return the story that was added
	* @throws SystemException if a system exception occurred
	*/
	public org.goodreturn.model.Story addStory(org.goodreturn.model.Story story)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Creates a new story with the primary key. Does not add the story to the database.
	*
	* @param story_Id the primary key for the new story
	* @return the new story
	*/
	public org.goodreturn.model.Story createStory(long story_Id);

	/**
	* Deletes the story with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param story_Id the primary key of the story
	* @return the story that was removed
	* @throws PortalException if a story with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.goodreturn.model.Story deleteStory(long story_Id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Deletes the story from the database. Also notifies the appropriate model listeners.
	*
	* @param story the story
	* @return the story that was removed
	* @throws SystemException if a system exception occurred
	*/
	public org.goodreturn.model.Story deleteStory(
		org.goodreturn.model.Story story)
		throws com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery();

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
		throws com.liferay.portal.kernel.exception.SystemException;

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
		int end) throws com.liferay.portal.kernel.exception.SystemException;

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
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public org.goodreturn.model.Story fetchStory(long story_Id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the story with the primary key.
	*
	* @param story_Id the primary key of the story
	* @return the story
	* @throws PortalException if a story with the primary key could not be found
	* @throws SystemException if a system exception occurred
	* @throws org.goodreturn.NoSuchStoryException
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public org.goodreturn.model.Story getStory(long story_Id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			org.goodreturn.NoSuchStoryException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<org.goodreturn.model.Story> getStories(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of stories.
	*
	* @return the number of stories
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getStoriesCount()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the story in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param story the story
	* @return the story that was updated
	* @throws SystemException if a system exception occurred
	*/
	public org.goodreturn.model.Story updateStory(
		org.goodreturn.model.Story story)
		throws com.liferay.portal.kernel.exception.SystemException;

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
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier();

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier);

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable;

	/**
	* Creates a new Story and stores it in the database and returns the new Story object.
	* The new story object is based on the 'newStory' Story object.
	*
	* @param newStory - the Story object which the new story will be stored in db.
	* @param userId - the user which this object is associated with.
	* @param serviceContext
	* @return a new Story object based on newStory which is now within the database.
	*/
	public org.goodreturn.model.Story addStory(
		org.goodreturn.model.Story newStory, long userId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Retrieves all loans which have borrower_Loan_Id and story_Type.
	*
	* @param borrowerLoanId - Primary key field which is associated with borrower which contains specific
	* @param storyType
	* @return
	* @throws SystemException
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<org.goodreturn.model.Story> getStoryByL_S(
		long borrowerLoanId, java.lang.String storyType)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the status of the Story object.
	*
	* @param userId - Id of the user updating the object resource.
	* @param resourcePrimKey - Id of the Story object to be updated.
	* @param status - status of the object to be updated.
	* @param serviceContext
	* @return returns the Story object which status is being updated.
	* @throws PortalException
	* @throws SystemException
	*/
	public org.goodreturn.model.Story updateStatus(long userId,
		long resourcePrimKey, int status,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;
}