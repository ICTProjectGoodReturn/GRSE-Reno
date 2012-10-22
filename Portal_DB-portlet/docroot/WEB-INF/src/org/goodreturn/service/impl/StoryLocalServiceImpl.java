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

package org.goodreturn.service.impl;

import java.util.List;

import org.goodreturn.NoSuchStoryException;
import org.goodreturn.model.Story;
import org.goodreturn.service.base.StoryLocalServiceBaseImpl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.kernel.workflow.WorkflowHandlerRegistryUtil;
import com.liferay.portal.model.ResourceConstants;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ServiceContext;

/**
 * The implementation of the story local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.goodreturn.service.StoryLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author gilaa004
 * @see org.goodreturn.service.base.StoryLocalServiceBaseImpl
 * @see org.goodreturn.service.StoryLocalServiceUtil
 */
public class StoryLocalServiceImpl extends StoryLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link org.goodreturn.service.StoryLocalServiceUtil} to access the story local service.
	 */
	
	/**
	 * Creates a new Story and stores it in the database and returns the new Story object.
	 * The new story object is based on the 'newStory' Story object.
	 * 
	 * @param newStory - the Story object which the new story will be stored in db.
	 * @param userId - the user which this object is associated with.
	 * @param serviceContext
	 * @return a new Story object based on newStory which is now within the database. 
	 */
	public Story addStory(Story newStory, long userId, ServiceContext serviceContext)          
			throws SystemException, PortalException {
		
		//Creates the FinalStory and sets all variables.
		Story story = storyPersistence.create(counterLocalService.increment(Story.class.getName()));
		story.setAbacus_Borrower_Loan_Id(newStory.getAbacus_Borrower_Loan_Id());
		System.out.println("**********************************************************");
		System.out.println(story.getStory_Id());
		System.out.println("*********************************************************");

		story.setStory_Type(newStory.getStory_Type());
		story.setStory_Text(newStory.getStory_Text());
		story.setVideo_Url(newStory.getVideo_Url());
		story.setIs_Good_Enough_For_Marketing(newStory.getIs_Good_Enough_For_Marketing());
		story.setIs_Good_Enough_For_Story(newStory.getIs_Good_Enough_For_Story());

		story.setCompany_Id(newStory.getCompany_Id());
		story.setGroup_Id(newStory.getGroup_Id());
		story.setUser_Id(userId);
		
		story.setStatus(WorkflowConstants.STATUS_DRAFT);

		//Updates it in the database.
		storyPersistence.update(story, false);


		resourceLocalService.addResources(
				story.getCompany_Id(), story.getGroup_Id(), userId,
				Story.class.getName(), story.getPrimaryKey(), false, 
				true, true);

		assetEntryLocalService.updateEntry(              
				userId, story.getGroup_Id(), Story.class.getName(),
				story.getStory_Id(), serviceContext.getAssetCategoryIds(),
				serviceContext.getAssetTagNames());
		
		WorkflowHandlerRegistryUtil.startWorkflowInstance(story.getCompany_Id(),
				userId, Story.class.getName(), story.getPrimaryKey(),
				story, serviceContext);

		return story;
	}
	
	
	public Story deleteStory(long storyId) throws PortalException, SystemException {
		Story story = getStory(storyId);
		
		return deleteStory(story);
	}

	
	public Story deleteStory(Story story) throws SystemException {
		long companyId = story.getCompany_Id();
		
		//Updates resource and asset status.
		try {
			resourceLocalService.deleteResource(
					companyId, Story.class.getName(),
					ResourceConstants.SCOPE_INDIVIDUAL, story.getPrimaryKey());

			assetEntryLocalService.deleteEntry(Story.class.getName(), story.getStory_Id());
		} catch (PortalException e) {
			// Throws exception based on portal exception.
			throw new SystemException(e);
		}

		return storyPersistence.remove(story);
	}

	
	public Story getStory(long PK) throws NoSuchStoryException, SystemException {
		return storyPersistence.findByPrimaryKey(PK);
	}
	
	/**
	 * Retrieves all loans which have borrower_Loan_Id and story_Type.
	 * 
	 * @param borrowerLoanId - Primary key field which is associated with borrower which contains specific
	 * @param storyType
	 * @return
	 * @throws SystemException
	 */
	public List<Story> getStoryByL_S(long borrowerLoanId, String storyType) throws SystemException {
		return storyPersistence.findByL_S(borrowerLoanId, storyType);
	}
	
	
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
	public Story updateStatus(long userId, long resourcePrimKey,
			int status, ServiceContext serviceContext)
	    throws PortalException, SystemException {
		//Retrieves user and story.
	    User user = userLocalService.getUser(userId);
	    Story story = getStory(resourcePrimKey);
	    
	    //Sets workflow fields.
	    story.setStatus(status);                
	    story.setStatus_By_User_Id(userId);
	    story.setStatus_By_User_Name(user.getFullName());
	    story.setStatus_Date(serviceContext.getModifiedDate());
	    storyPersistence.update(story, false);
	    
	    //Updates visibility of asset.
	    if (status == WorkflowConstants.STATUS_APPROVED) { 
	        assetEntryLocalService.updateVisible(
	            Story.class.getName(), resourcePrimKey, true);
	    } else {
	        assetEntryLocalService.updateVisible(
	            Story.class.getName(), resourcePrimKey, false);
	    }
	    
	    return story;		
	}
	
	
	
}