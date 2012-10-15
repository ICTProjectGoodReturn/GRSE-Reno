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

package org.GoodReturn.model;

import com.liferay.portal.model.ModelWrapper;

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

		attributes.put("story_Id", getStory_Id());
		attributes.put("final_Story", getFinal_Story());
		attributes.put("is_Good_Enough_For_Marketing",
			getIs_Good_Enough_For_Marketing());
		attributes.put("is_Good_Enough_For_Final_Story",
			getIs_Good_Enough_For_Final_Story());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long story_Id = (Long)attributes.get("story_Id");

		if (story_Id != null) {
			setStory_Id(story_Id);
		}

		String final_Story = (String)attributes.get("final_Story");

		if (final_Story != null) {
			setFinal_Story(final_Story);
		}

		Boolean is_Good_Enough_For_Marketing = (Boolean)attributes.get(
				"is_Good_Enough_For_Marketing");

		if (is_Good_Enough_For_Marketing != null) {
			setIs_Good_Enough_For_Marketing(is_Good_Enough_For_Marketing);
		}

		Boolean is_Good_Enough_For_Final_Story = (Boolean)attributes.get(
				"is_Good_Enough_For_Final_Story");

		if (is_Good_Enough_For_Final_Story != null) {
			setIs_Good_Enough_For_Final_Story(is_Good_Enough_For_Final_Story);
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
	* Returns the final_ story of this story.
	*
	* @return the final_ story of this story
	*/
	public java.lang.String getFinal_Story() {
		return _story.getFinal_Story();
	}

	/**
	* Sets the final_ story of this story.
	*
	* @param final_Story the final_ story of this story
	*/
	public void setFinal_Story(java.lang.String final_Story) {
		_story.setFinal_Story(final_Story);
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
	* Returns the is_ good_ enough_ for_ final_ story of this story.
	*
	* @return the is_ good_ enough_ for_ final_ story of this story
	*/
	public boolean getIs_Good_Enough_For_Final_Story() {
		return _story.getIs_Good_Enough_For_Final_Story();
	}

	/**
	* Returns <code>true</code> if this story is is_ good_ enough_ for_ final_ story.
	*
	* @return <code>true</code> if this story is is_ good_ enough_ for_ final_ story; <code>false</code> otherwise
	*/
	public boolean isIs_Good_Enough_For_Final_Story() {
		return _story.isIs_Good_Enough_For_Final_Story();
	}

	/**
	* Sets whether this story is is_ good_ enough_ for_ final_ story.
	*
	* @param is_Good_Enough_For_Final_Story the is_ good_ enough_ for_ final_ story of this story
	*/
	public void setIs_Good_Enough_For_Final_Story(
		boolean is_Good_Enough_For_Final_Story) {
		_story.setIs_Good_Enough_For_Final_Story(is_Good_Enough_For_Final_Story);
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

	public int compareTo(org.GoodReturn.model.Story story) {
		return _story.compareTo(story);
	}

	@Override
	public int hashCode() {
		return _story.hashCode();
	}

	public com.liferay.portal.model.CacheModel<org.GoodReturn.model.Story> toCacheModel() {
		return _story.toCacheModel();
	}

	public org.GoodReturn.model.Story toEscapedModel() {
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