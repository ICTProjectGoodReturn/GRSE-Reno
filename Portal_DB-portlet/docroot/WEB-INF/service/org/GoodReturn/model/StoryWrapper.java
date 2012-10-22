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
 * This class is a wrapper for {@link Story}.
 * </p>
 *
 * @author    gilaa004
 * @see       Story
 * @generated
 */
public class StoryWrapper implements Story, ModelWrapper<Story> {
	public StoryWrapper(Story story) {
		_story = story;
	}

	public Class<?> getModelClass() {
		return Story.class;
	}

	public String getModelClassName() {
		return Story.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("story_Id", getStory_Id());
		attributes.put("abacus_Borrower_Loan_Id", getAbacus_Borrower_Loan_Id());
		attributes.put("story_Type", getStory_Type());
		attributes.put("story_Text", getStory_Text());
		attributes.put("video_Url", getVideo_Url());
		attributes.put("is_Good_Enough_For_Marketing",
			getIs_Good_Enough_For_Marketing());
		attributes.put("is_Good_Enough_For_Story", getIs_Good_Enough_For_Story());
		attributes.put("status", getStatus());
		attributes.put("status_By_User_Id", getStatus_By_User_Id());
		attributes.put("status_By_User_Name", getStatus_By_User_Name());
		attributes.put("status_Date", getStatus_Date());
		attributes.put("changed_By", getChanged_By());
		attributes.put("changed_Time", getChanged_Time());
		attributes.put("company_Id", getCompany_Id());
		attributes.put("group_Id", getGroup_Id());
		attributes.put("user_Id", getUser_Id());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long story_Id = (Long)attributes.get("story_Id");

		if (story_Id != null) {
			setStory_Id(story_Id);
		}

		Long abacus_Borrower_Loan_Id = (Long)attributes.get(
				"abacus_Borrower_Loan_Id");

		if (abacus_Borrower_Loan_Id != null) {
			setAbacus_Borrower_Loan_Id(abacus_Borrower_Loan_Id);
		}

		String story_Type = (String)attributes.get("story_Type");

		if (story_Type != null) {
			setStory_Type(story_Type);
		}

		String story_Text = (String)attributes.get("story_Text");

		if (story_Text != null) {
			setStory_Text(story_Text);
		}

		String video_Url = (String)attributes.get("video_Url");

		if (video_Url != null) {
			setVideo_Url(video_Url);
		}

		Boolean is_Good_Enough_For_Marketing = (Boolean)attributes.get(
				"is_Good_Enough_For_Marketing");

		if (is_Good_Enough_For_Marketing != null) {
			setIs_Good_Enough_For_Marketing(is_Good_Enough_For_Marketing);
		}

		Boolean is_Good_Enough_For_Story = (Boolean)attributes.get(
				"is_Good_Enough_For_Story");

		if (is_Good_Enough_For_Story != null) {
			setIs_Good_Enough_For_Story(is_Good_Enough_For_Story);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Long status_By_User_Id = (Long)attributes.get("status_By_User_Id");

		if (status_By_User_Id != null) {
			setStatus_By_User_Id(status_By_User_Id);
		}

		String status_By_User_Name = (String)attributes.get(
				"status_By_User_Name");

		if (status_By_User_Name != null) {
			setStatus_By_User_Name(status_By_User_Name);
		}

		Date status_Date = (Date)attributes.get("status_Date");

		if (status_Date != null) {
			setStatus_Date(status_Date);
		}

		String changed_By = (String)attributes.get("changed_By");

		if (changed_By != null) {
			setChanged_By(changed_By);
		}

		Long changed_Time = (Long)attributes.get("changed_Time");

		if (changed_Time != null) {
			setChanged_Time(changed_Time);
		}

		Long company_Id = (Long)attributes.get("company_Id");

		if (company_Id != null) {
			setCompany_Id(company_Id);
		}

		Long group_Id = (Long)attributes.get("group_Id");

		if (group_Id != null) {
			setGroup_Id(group_Id);
		}

		Long user_Id = (Long)attributes.get("user_Id");

		if (user_Id != null) {
			setUser_Id(user_Id);
		}
	}

	/**
	* Returns the primary key of this story.
	*
	* @return the primary key of this story
	*/
	public long getPrimaryKey() {
		return _story.getPrimaryKey();
	}

	/**
	* Sets the primary key of this story.
	*
	* @param primaryKey the primary key of this story
	*/
	public void setPrimaryKey(long primaryKey) {
		_story.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the uuid of this story.
	*
	* @return the uuid of this story
	*/
	public java.lang.String getUuid() {
		return _story.getUuid();
	}

	/**
	* Sets the uuid of this story.
	*
	* @param uuid the uuid of this story
	*/
	public void setUuid(java.lang.String uuid) {
		_story.setUuid(uuid);
	}

	/**
	* Returns the story_ ID of this story.
	*
	* @return the story_ ID of this story
	*/
	public long getStory_Id() {
		return _story.getStory_Id();
	}

	/**
	* Sets the story_ ID of this story.
	*
	* @param story_Id the story_ ID of this story
	*/
	public void setStory_Id(long story_Id) {
		_story.setStory_Id(story_Id);
	}

	/**
	* Returns the abacus_ borrower_ loan_ ID of this story.
	*
	* @return the abacus_ borrower_ loan_ ID of this story
	*/
	public long getAbacus_Borrower_Loan_Id() {
		return _story.getAbacus_Borrower_Loan_Id();
	}

	/**
	* Sets the abacus_ borrower_ loan_ ID of this story.
	*
	* @param abacus_Borrower_Loan_Id the abacus_ borrower_ loan_ ID of this story
	*/
	public void setAbacus_Borrower_Loan_Id(long abacus_Borrower_Loan_Id) {
		_story.setAbacus_Borrower_Loan_Id(abacus_Borrower_Loan_Id);
	}

	/**
	* Returns the story_ type of this story.
	*
	* @return the story_ type of this story
	*/
	public java.lang.String getStory_Type() {
		return _story.getStory_Type();
	}

	/**
	* Sets the story_ type of this story.
	*
	* @param story_Type the story_ type of this story
	*/
	public void setStory_Type(java.lang.String story_Type) {
		_story.setStory_Type(story_Type);
	}

	/**
	* Returns the story_ text of this story.
	*
	* @return the story_ text of this story
	*/
	public java.lang.String getStory_Text() {
		return _story.getStory_Text();
	}

	/**
	* Sets the story_ text of this story.
	*
	* @param story_Text the story_ text of this story
	*/
	public void setStory_Text(java.lang.String story_Text) {
		_story.setStory_Text(story_Text);
	}

	/**
	* Returns the video_ url of this story.
	*
	* @return the video_ url of this story
	*/
	public java.lang.String getVideo_Url() {
		return _story.getVideo_Url();
	}

	/**
	* Sets the video_ url of this story.
	*
	* @param video_Url the video_ url of this story
	*/
	public void setVideo_Url(java.lang.String video_Url) {
		_story.setVideo_Url(video_Url);
	}

	/**
	* Returns the is_ good_ enough_ for_ marketing of this story.
	*
	* @return the is_ good_ enough_ for_ marketing of this story
	*/
	public boolean getIs_Good_Enough_For_Marketing() {
		return _story.getIs_Good_Enough_For_Marketing();
	}

	/**
	* Returns <code>true</code> if this story is is_ good_ enough_ for_ marketing.
	*
	* @return <code>true</code> if this story is is_ good_ enough_ for_ marketing; <code>false</code> otherwise
	*/
	public boolean isIs_Good_Enough_For_Marketing() {
		return _story.isIs_Good_Enough_For_Marketing();
	}

	/**
	* Sets whether this story is is_ good_ enough_ for_ marketing.
	*
	* @param is_Good_Enough_For_Marketing the is_ good_ enough_ for_ marketing of this story
	*/
	public void setIs_Good_Enough_For_Marketing(
		boolean is_Good_Enough_For_Marketing) {
		_story.setIs_Good_Enough_For_Marketing(is_Good_Enough_For_Marketing);
	}

	/**
	* Returns the is_ good_ enough_ for_ story of this story.
	*
	* @return the is_ good_ enough_ for_ story of this story
	*/
	public boolean getIs_Good_Enough_For_Story() {
		return _story.getIs_Good_Enough_For_Story();
	}

	/**
	* Returns <code>true</code> if this story is is_ good_ enough_ for_ story.
	*
	* @return <code>true</code> if this story is is_ good_ enough_ for_ story; <code>false</code> otherwise
	*/
	public boolean isIs_Good_Enough_For_Story() {
		return _story.isIs_Good_Enough_For_Story();
	}

	/**
	* Sets whether this story is is_ good_ enough_ for_ story.
	*
	* @param is_Good_Enough_For_Story the is_ good_ enough_ for_ story of this story
	*/
	public void setIs_Good_Enough_For_Story(boolean is_Good_Enough_For_Story) {
		_story.setIs_Good_Enough_For_Story(is_Good_Enough_For_Story);
	}

	/**
	* Returns the status of this story.
	*
	* @return the status of this story
	*/
	public int getStatus() {
		return _story.getStatus();
	}

	/**
	* Sets the status of this story.
	*
	* @param status the status of this story
	*/
	public void setStatus(int status) {
		_story.setStatus(status);
	}

	/**
	* Returns the status_ by_ user_ ID of this story.
	*
	* @return the status_ by_ user_ ID of this story
	*/
	public long getStatus_By_User_Id() {
		return _story.getStatus_By_User_Id();
	}

	/**
	* Sets the status_ by_ user_ ID of this story.
	*
	* @param status_By_User_Id the status_ by_ user_ ID of this story
	*/
	public void setStatus_By_User_Id(long status_By_User_Id) {
		_story.setStatus_By_User_Id(status_By_User_Id);
	}

	/**
	* Returns the status_ by_ user_ name of this story.
	*
	* @return the status_ by_ user_ name of this story
	*/
	public java.lang.String getStatus_By_User_Name() {
		return _story.getStatus_By_User_Name();
	}

	/**
	* Sets the status_ by_ user_ name of this story.
	*
	* @param status_By_User_Name the status_ by_ user_ name of this story
	*/
	public void setStatus_By_User_Name(java.lang.String status_By_User_Name) {
		_story.setStatus_By_User_Name(status_By_User_Name);
	}

	/**
	* Returns the status_ date of this story.
	*
	* @return the status_ date of this story
	*/
	public java.util.Date getStatus_Date() {
		return _story.getStatus_Date();
	}

	/**
	* Sets the status_ date of this story.
	*
	* @param status_Date the status_ date of this story
	*/
	public void setStatus_Date(java.util.Date status_Date) {
		_story.setStatus_Date(status_Date);
	}

	/**
	* Returns the changed_ by of this story.
	*
	* @return the changed_ by of this story
	*/
	public java.lang.String getChanged_By() {
		return _story.getChanged_By();
	}

	/**
	* Sets the changed_ by of this story.
	*
	* @param changed_By the changed_ by of this story
	*/
	public void setChanged_By(java.lang.String changed_By) {
		_story.setChanged_By(changed_By);
	}

	/**
	* Returns the changed_ time of this story.
	*
	* @return the changed_ time of this story
	*/
	public long getChanged_Time() {
		return _story.getChanged_Time();
	}

	/**
	* Sets the changed_ time of this story.
	*
	* @param changed_Time the changed_ time of this story
	*/
	public void setChanged_Time(long changed_Time) {
		_story.setChanged_Time(changed_Time);
	}

	/**
	* Returns the company_ ID of this story.
	*
	* @return the company_ ID of this story
	*/
	public long getCompany_Id() {
		return _story.getCompany_Id();
	}

	/**
	* Sets the company_ ID of this story.
	*
	* @param company_Id the company_ ID of this story
	*/
	public void setCompany_Id(long company_Id) {
		_story.setCompany_Id(company_Id);
	}

	/**
	* Returns the group_ ID of this story.
	*
	* @return the group_ ID of this story
	*/
	public long getGroup_Id() {
		return _story.getGroup_Id();
	}

	/**
	* Sets the group_ ID of this story.
	*
	* @param group_Id the group_ ID of this story
	*/
	public void setGroup_Id(long group_Id) {
		_story.setGroup_Id(group_Id);
	}

	/**
	* Returns the user_ ID of this story.
	*
	* @return the user_ ID of this story
	*/
	public long getUser_Id() {
		return _story.getUser_Id();
	}

	/**
	* Sets the user_ ID of this story.
	*
	* @param user_Id the user_ ID of this story
	*/
	public void setUser_Id(long user_Id) {
		_story.setUser_Id(user_Id);
	}

	public boolean isNew() {
		return _story.isNew();
	}

	public void setNew(boolean n) {
		_story.setNew(n);
	}

	public boolean isCachedModel() {
		return _story.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_story.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _story.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _story.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_story.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _story.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_story.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new StoryWrapper((Story)_story.clone());
	}

	public int compareTo(org.goodreturn.model.Story story) {
		return _story.compareTo(story);
	}

	@Override
	public int hashCode() {
		return _story.hashCode();
	}

	public com.liferay.portal.model.CacheModel<org.goodreturn.model.Story> toCacheModel() {
		return _story.toCacheModel();
	}

	public org.goodreturn.model.Story toEscapedModel() {
		return new StoryWrapper(_story.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _story.toString();
	}

	public java.lang.String toXmlString() {
		return _story.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_story.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public Story getWrappedStory() {
		return _story;
	}

	public Story getWrappedModel() {
		return _story;
	}

	public void resetOriginalValues() {
		_story.resetOriginalValues();
	}

	private Story _story;
}