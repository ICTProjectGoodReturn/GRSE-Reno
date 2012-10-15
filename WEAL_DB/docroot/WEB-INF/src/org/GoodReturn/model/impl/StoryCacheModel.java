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

package org.GoodReturn.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import org.GoodReturn.model.Story;

import java.io.Serializable;

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
		StringBundler sb = new StringBundler(9);

		sb.append("{story_Id=");
		sb.append(story_Id);
		sb.append(", final_Story=");
		sb.append(final_Story);
		sb.append(", is_Good_Enough_For_Marketing=");
		sb.append(is_Good_Enough_For_Marketing);
		sb.append(", is_Good_Enough_For_Final_Story=");
		sb.append(is_Good_Enough_For_Final_Story);
		sb.append("}");

		return sb.toString();
	}

	public Story toEntityModel() {
		StoryImpl storyImpl = new StoryImpl();

		storyImpl.setStory_Id(story_Id);

		if (final_Story == null) {
			storyImpl.setFinal_Story(StringPool.BLANK);
		}
		else {
			storyImpl.setFinal_Story(final_Story);
		}

		storyImpl.setIs_Good_Enough_For_Marketing(is_Good_Enough_For_Marketing);
		storyImpl.setIs_Good_Enough_For_Final_Story(is_Good_Enough_For_Final_Story);

		storyImpl.resetOriginalValues();

		return storyImpl;
	}

	public long story_Id;
	public String final_Story;
	public boolean is_Good_Enough_For_Marketing;
	public boolean is_Good_Enough_For_Final_Story;
}