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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.test.service.http.StoryServiceSoap}.
 *
 * @author    gilaa004
 * @see       com.test.service.http.StoryServiceSoap
 * @generated
 */
public class StorySoap implements Serializable {
	public static StorySoap toSoapModel(Story model) {
		StorySoap soapModel = new StorySoap();

		soapModel.setStory_Id(model.getStory_Id());
		soapModel.setFinal_Story(model.getFinal_Story());
		soapModel.setIs_Good_Enough_For_Marketing(model.getIs_Good_Enough_For_Marketing());
		soapModel.setIs_Good_Enough_For_Final_Story(model.getIs_Good_Enough_For_Final_Story());

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

	private long _story_Id;
	private String _final_Story;
	private boolean _is_Good_Enough_For_Marketing;
	private boolean _is_Good_Enough_For_Final_Story;
}