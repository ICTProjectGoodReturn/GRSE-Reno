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
		StringBundler sb = new StringBundler(27);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", story_Id=");
		sb.append(story_Id);
		sb.append(", loan_Account_Id=");
		sb.append(loan_Account_Id);
		sb.append(", final_Story=");
		sb.append(final_Story);
		sb.append(", is_Good_Enough_For_Marketing=");
		sb.append(is_Good_Enough_For_Marketing);
		sb.append(", is_Good_Enough_For_Final_Story=");
		sb.append(is_Good_Enough_For_Final_Story);
		sb.append(", status=");
		sb.append(status);
		sb.append(", status_By_User_Id=");
		sb.append(status_By_User_Id);
		sb.append(", status_By_User_Name=");
		sb.append(status_By_User_Name);
		sb.append(", status_Date=");
		sb.append(status_Date);
		sb.append(", company_Id=");
		sb.append(company_Id);
		sb.append(", group_Id=");
		sb.append(group_Id);
		sb.append(", user_Id=");
		sb.append(user_Id);
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
		storyImpl.setLoan_Account_Id(loan_Account_Id);

		if (final_Story == null) {
			storyImpl.setFinal_Story(StringPool.BLANK);
		}
		else {
			storyImpl.setFinal_Story(final_Story);
		}

		storyImpl.setIs_Good_Enough_For_Marketing(is_Good_Enough_For_Marketing);
		storyImpl.setIs_Good_Enough_For_Final_Story(is_Good_Enough_For_Final_Story);
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

		storyImpl.setCompany_Id(company_Id);
		storyImpl.setGroup_Id(group_Id);
		storyImpl.setUser_Id(user_Id);

		storyImpl.resetOriginalValues();

		return storyImpl;
	}

	public String uuid;
	public long story_Id;
	public long loan_Account_Id;
	public String final_Story;
	public boolean is_Good_Enough_For_Marketing;
	public boolean is_Good_Enough_For_Final_Story;
	public int status;
	public long status_By_User_Id;
	public String status_By_User_Name;
	public long status_Date;
	public long company_Id;
	public long group_Id;
	public long user_Id;
}