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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link org.goodreturn.service.http.StoryServiceSoap}.
 *
 * @author    gilaa004
 * @see       org.goodreturn.service.http.StoryServiceSoap
 * @generated
 */
public class StorySoap implements Serializable {
	public static StorySoap toSoapModel(Story model) {
		StorySoap soapModel = new StorySoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setStory_Id(model.getStory_Id());
		soapModel.setLoan_Account_Id(model.getLoan_Account_Id());
		soapModel.setStory_Type(model.getStory_Type());
		soapModel.setStory_Text(model.getStory_Text());
		soapModel.setVideo_Url(model.getVideo_Url());
		soapModel.setIs_Good_Enough_For_Marketing(model.getIs_Good_Enough_For_Marketing());
		soapModel.setIs_Good_Enough_For_Story(model.getIs_Good_Enough_For_Story());
		soapModel.setStatus(model.getStatus());
		soapModel.setStatus_By_User_Id(model.getStatus_By_User_Id());
		soapModel.setStatus_By_User_Name(model.getStatus_By_User_Name());
		soapModel.setStatus_Date(model.getStatus_Date());
		soapModel.setCompany_Id(model.getCompany_Id());
		soapModel.setGroup_Id(model.getGroup_Id());
		soapModel.setUser_Id(model.getUser_Id());

		return soapModel;
	}

	public static StorySoap[] toSoapModels(Story[] models) {
		StorySoap[] soapModels = new StorySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static StorySoap[][] toSoapModels(Story[][] models) {
		StorySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new StorySoap[models.length][models[0].length];
		}
		else {
			soapModels = new StorySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static StorySoap[] toSoapModels(List<Story> models) {
		List<StorySoap> soapModels = new ArrayList<StorySoap>(models.size());

		for (Story model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new StorySoap[soapModels.size()]);
	}

	public StorySoap() {
	}

	public long getPrimaryKey() {
		return _story_Id;
	}

	public void setPrimaryKey(long pk) {
		setStory_Id(pk);
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
}