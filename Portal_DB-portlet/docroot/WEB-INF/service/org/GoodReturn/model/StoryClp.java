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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import org.goodreturn.service.StoryLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;
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

		attributes.put("uuid", getUuid());
		attributes.put("story_Id", getStory_Id());
		attributes.put("loan_Account_Id", getLoan_Account_Id());
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
		attributes.put("company_Id", getCompany_Id());
		attributes.put("group_Id", getGroup_Id());
		attributes.put("user_Id", getUser_Id());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long story_Id = (Long)attributes.get("story_Id");

		if (story_Id != null) {
			setStory_Id(story_Id);
		}

		Long loan_Account_Id = (Long)attributes.get("loan_Account_Id");

		if (loan_Account_Id != null) {
			setLoan_Account_Id(loan_Account_Id);
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

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getStory_Id() {
		return _story_Id;
	}

	public void setStory_Id(long story_Id) {
		_story_Id = story_Id;
	}

	public long getLoan_Account_Id() {
		return _loan_Account_Id;
	}

	public void setLoan_Account_Id(long loan_Account_Id) {
		_loan_Account_Id = loan_Account_Id;
	}

	public String getStory_Type() {
		return _story_Type;
	}

	public void setStory_Type(String story_Type) {
		_story_Type = story_Type;
	}

	public String getStory_Text() {
		return _story_Text;
	}

	public void setStory_Text(String story_Text) {
		_story_Text = story_Text;
	}

	public String getVideo_Url() {
		return _video_Url;
	}

	public void setVideo_Url(String video_Url) {
		_video_Url = video_Url;
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

	public boolean getIs_Good_Enough_For_Story() {
		return _is_Good_Enough_For_Story;
	}

	public boolean isIs_Good_Enough_For_Story() {
		return _is_Good_Enough_For_Story;
	}

	public void setIs_Good_Enough_For_Story(boolean is_Good_Enough_For_Story) {
		_is_Good_Enough_For_Story = is_Good_Enough_For_Story;
	}

	public int getStatus() {
		return _status;
	}

	public void setStatus(int status) {
		_status = status;
	}

	public long getStatus_By_User_Id() {
		return _status_By_User_Id;
	}

	public void setStatus_By_User_Id(long status_By_User_Id) {
		_status_By_User_Id = status_By_User_Id;
	}

	public String getStatus_By_User_Name() {
		return _status_By_User_Name;
	}

	public void setStatus_By_User_Name(String status_By_User_Name) {
		_status_By_User_Name = status_By_User_Name;
	}

	public Date getStatus_Date() {
		return _status_Date;
	}

	public void setStatus_Date(Date status_Date) {
		_status_Date = status_Date;
	}

	public long getCompany_Id() {
		return _company_Id;
	}

	public void setCompany_Id(long company_Id) {
		_company_Id = company_Id;
	}

	public long getGroup_Id() {
		return _group_Id;
	}

	public void setGroup_Id(long group_Id) {
		_group_Id = group_Id;
	}

	public long getUser_Id() {
		return _user_Id;
	}

	public void setUser_Id(long user_Id) {
		_user_Id = user_Id;
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

		clone.setUuid(getUuid());
		clone.setStory_Id(getStory_Id());
		clone.setLoan_Account_Id(getLoan_Account_Id());
		clone.setStory_Type(getStory_Type());
		clone.setStory_Text(getStory_Text());
		clone.setVideo_Url(getVideo_Url());
		clone.setIs_Good_Enough_For_Marketing(getIs_Good_Enough_For_Marketing());
		clone.setIs_Good_Enough_For_Story(getIs_Good_Enough_For_Story());
		clone.setStatus(getStatus());
		clone.setStatus_By_User_Id(getStatus_By_User_Id());
		clone.setStatus_By_User_Name(getStatus_By_User_Name());
		clone.setStatus_Date(getStatus_Date());
		clone.setCompany_Id(getCompany_Id());
		clone.setGroup_Id(getGroup_Id());
		clone.setUser_Id(getUser_Id());

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
		StringBundler sb = new StringBundler(31);

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", story_Id=");
		sb.append(getStory_Id());
		sb.append(", loan_Account_Id=");
		sb.append(getLoan_Account_Id());
		sb.append(", story_Type=");
		sb.append(getStory_Type());
		sb.append(", story_Text=");
		sb.append(getStory_Text());
		sb.append(", video_Url=");
		sb.append(getVideo_Url());
		sb.append(", is_Good_Enough_For_Marketing=");
		sb.append(getIs_Good_Enough_For_Marketing());
		sb.append(", is_Good_Enough_For_Story=");
		sb.append(getIs_Good_Enough_For_Story());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append(", status_By_User_Id=");
		sb.append(getStatus_By_User_Id());
		sb.append(", status_By_User_Name=");
		sb.append(getStatus_By_User_Name());
		sb.append(", status_Date=");
		sb.append(getStatus_Date());
		sb.append(", company_Id=");
		sb.append(getCompany_Id());
		sb.append(", group_Id=");
		sb.append(getGroup_Id());
		sb.append(", user_Id=");
		sb.append(getUser_Id());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(49);

		sb.append("<model><model-name>");
		sb.append("org.goodreturn.model.Story");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>story_Id</column-name><column-value><![CDATA[");
		sb.append(getStory_Id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>loan_Account_Id</column-name><column-value><![CDATA[");
		sb.append(getLoan_Account_Id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>story_Type</column-name><column-value><![CDATA[");
		sb.append(getStory_Type());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>story_Text</column-name><column-value><![CDATA[");
		sb.append(getStory_Text());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>video_Url</column-name><column-value><![CDATA[");
		sb.append(getVideo_Url());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>is_Good_Enough_For_Marketing</column-name><column-value><![CDATA[");
		sb.append(getIs_Good_Enough_For_Marketing());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>is_Good_Enough_For_Story</column-name><column-value><![CDATA[");
		sb.append(getIs_Good_Enough_For_Story());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status_By_User_Id</column-name><column-value><![CDATA[");
		sb.append(getStatus_By_User_Id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status_By_User_Name</column-name><column-value><![CDATA[");
		sb.append(getStatus_By_User_Name());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status_Date</column-name><column-value><![CDATA[");
		sb.append(getStatus_Date());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>company_Id</column-name><column-value><![CDATA[");
		sb.append(getCompany_Id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>group_Id</column-name><column-value><![CDATA[");
		sb.append(getGroup_Id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>user_Id</column-name><column-value><![CDATA[");
		sb.append(getUser_Id());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private String _uuid;
	private long _story_Id;
	private long _loan_Account_Id;
	private String _story_Type;
	private String _story_Text;
	private String _video_Url;
	private boolean _is_Good_Enough_For_Marketing;
	private boolean _is_Good_Enough_For_Story;
	private int _status;
	private long _status_By_User_Id;
	private String _status_By_User_Name;
	private Date _status_Date;
	private long _company_Id;
	private long _group_Id;
	private long _user_Id;
	private BaseModel<?> _storyRemoteModel;
}