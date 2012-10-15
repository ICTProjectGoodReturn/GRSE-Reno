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

package com.test.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.test.service.StoryLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author gilaa004
 */
public class StoryClp extends BaseModelImpl<Story> implements Story {
	public StoryClp() {
	}

	public Class<?> getModelClass() {
		return Story.class;
	}

	public String getModelClassName() {
		return Story.class.getName();
	}

	public long getPrimaryKey() {
		return _story_Id;
	}

	public void setPrimaryKey(long primaryKey) {
		setStory_Id(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_story_Id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
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

	@Override
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

	public long getStory_Id() {
		return _story_Id;
	}

	public void setStory_Id(long story_Id) {
		_story_Id = story_Id;
	}

	public String getFinal_Story() {
		return _final_Story;
	}

	public void setFinal_Story(String final_Story) {
		_final_Story = final_Story;
	}

	public boolean getIs_Good_Enough_For_Marketing() {
		return _is_Good_Enough_For_Marketing;
	}

	public boolean isIs_Good_Enough_For_Marketing() {
		return _is_Good_Enough_For_Marketing;
	}

	public void setIs_Good_Enough_For_Marketing(
		boolean is_Good_Enough_For_Marketing) {
		_is_Good_Enough_For_Marketing = is_Good_Enough_For_Marketing;
	}

	public boolean getIs_Good_Enough_For_Final_Story() {
		return _is_Good_Enough_For_Final_Story;
	}

	public boolean isIs_Good_Enough_For_Final_Story() {
		return _is_Good_Enough_For_Final_Story;
	}

	public void setIs_Good_Enough_For_Final_Story(
		boolean is_Good_Enough_For_Final_Story) {
		_is_Good_Enough_For_Final_Story = is_Good_Enough_For_Final_Story;
	}

	public BaseModel<?> getStoryRemoteModel() {
		return _storyRemoteModel;
	}

	public void setStoryRemoteModel(BaseModel<?> storyRemoteModel) {
		_storyRemoteModel = storyRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			StoryLocalServiceUtil.addStory(this);
		}
		else {
			StoryLocalServiceUtil.updateStory(this);
		}
	}

	@Override
	public Story toEscapedModel() {
		return (Story)Proxy.newProxyInstance(Story.class.getClassLoader(),
			new Class[] { Story.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		StoryClp clone = new StoryClp();

		clone.setStory_Id(getStory_Id());
		clone.setFinal_Story(getFinal_Story());
		clone.setIs_Good_Enough_For_Marketing(getIs_Good_Enough_For_Marketing());
		clone.setIs_Good_Enough_For_Final_Story(getIs_Good_Enough_For_Final_Story());

		return clone;
	}

	public int compareTo(Story story) {
		int value = 0;

		if (getStory_Id() < story.getStory_Id()) {
			value = -1;
		}
		else if (getStory_Id() > story.getStory_Id()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		StoryClp story = null;

		try {
			story = (StoryClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = story.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{story_Id=");
		sb.append(getStory_Id());
		sb.append(", final_Story=");
		sb.append(getFinal_Story());
		sb.append(", is_Good_Enough_For_Marketing=");
		sb.append(getIs_Good_Enough_For_Marketing());
		sb.append(", is_Good_Enough_For_Final_Story=");
		sb.append(getIs_Good_Enough_For_Final_Story());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("com.test.model.Story");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>story_Id</column-name><column-value><![CDATA[");
		sb.append(getStory_Id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>final_Story</column-name><column-value><![CDATA[");
		sb.append(getFinal_Story());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>is_Good_Enough_For_Marketing</column-name><column-value><![CDATA[");
		sb.append(getIs_Good_Enough_For_Marketing());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>is_Good_Enough_For_Final_Story</column-name><column-value><![CDATA[");
		sb.append(getIs_Good_Enough_For_Final_Story());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _story_Id;
	private String _final_Story;
	private boolean _is_Good_Enough_For_Marketing;
	private boolean _is_Good_Enough_For_Final_Story;
	private BaseModel<?> _storyRemoteModel;
}