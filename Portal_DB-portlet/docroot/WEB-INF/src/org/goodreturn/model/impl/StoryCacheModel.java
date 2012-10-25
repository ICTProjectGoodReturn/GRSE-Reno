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

package org.goodreturn.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import org.goodreturn.model.Story;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing Story in entity cache.
 *
 * @author gilaa004
 * @see Story
 * @generated
 */
public class StoryCacheModel implements CacheModel<Story>, Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", story_Id=");
		sb.append(story_Id);
		sb.append(", abacus_Borrower_Loan_Id=");
		sb.append(abacus_Borrower_Loan_Id);
		sb.append(", story_Type=");
		sb.append(story_Type);
		sb.append(", story_Text=");
		sb.append(story_Text);
		sb.append(", video_Url=");
		sb.append(video_Url);
		sb.append(", is_Good_Enough_For_Marketing=");
		sb.append(is_Good_Enough_For_Marketing);
		sb.append(", is_Good_Enough_For_Story=");
		sb.append(is_Good_Enough_For_Story);
		sb.append(", status=");
		sb.append(status);
		sb.append(", status_By_User_Id=");
		sb.append(status_By_User_Id);
		sb.append(", status_By_User_Name=");
		sb.append(status_By_User_Name);
		sb.append(", status_Date=");
		sb.append(status_Date);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append("}");

		return sb.toString();
	}

	public Story toEntityModel() {
		StoryImpl storyImpl = new StoryImpl();

		if (uuid == null) {
			storyImpl.setUuid(StringPool.BLANK);
		}
		else {
			storyImpl.setUuid(uuid);
		}

		storyImpl.setStory_Id(story_Id);
		storyImpl.setAbacus_Borrower_Loan_Id(abacus_Borrower_Loan_Id);

		if (story_Type == null) {
			storyImpl.setStory_Type(StringPool.BLANK);
		}
		else {
			storyImpl.setStory_Type(story_Type);
		}

		if (story_Text == null) {
			storyImpl.setStory_Text(StringPool.BLANK);
		}
		else {
			storyImpl.setStory_Text(story_Text);
		}

		if (video_Url == null) {
			storyImpl.setVideo_Url(StringPool.BLANK);
		}
		else {
			storyImpl.setVideo_Url(video_Url);
		}

		storyImpl.setIs_Good_Enough_For_Marketing(is_Good_Enough_For_Marketing);
		storyImpl.setIs_Good_Enough_For_Story(is_Good_Enough_For_Story);
		storyImpl.setStatus(status);
		storyImpl.setStatus_By_User_Id(status_By_User_Id);

		if (status_By_User_Name == null) {
			storyImpl.setStatus_By_User_Name(StringPool.BLANK);
		}
		else {
			storyImpl.setStatus_By_User_Name(status_By_User_Name);
		}

		if (status_Date == Long.MIN_VALUE) {
			storyImpl.setStatus_Date(null);
		}
		else {
			storyImpl.setStatus_Date(new Date(status_Date));
		}

		storyImpl.setCompanyId(companyId);
		storyImpl.setGroupId(groupId);
		storyImpl.setUserId(userId);

		storyImpl.resetOriginalValues();

		return storyImpl;
	}

	public String uuid;
	public long story_Id;
	public long abacus_Borrower_Loan_Id;
	public String story_Type;
	public String story_Text;
	public String video_Url;
	public boolean is_Good_Enough_For_Marketing;
	public boolean is_Good_Enough_For_Story;
	public int status;
	public long status_By_User_Id;
	public String status_By_User_Name;
	public long status_Date;
	public long companyId;
	public long groupId;
	public long userId;
}