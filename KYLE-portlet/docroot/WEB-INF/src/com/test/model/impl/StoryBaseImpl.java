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

package com.test.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import com.test.model.Story;

import com.test.service.StoryLocalServiceUtil;

/**
 * The extended model base implementation for the Story service. Represents a row in the &quot;KYLE_Story&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link StoryImpl}.
 * </p>
 *
 * @author gilaa004
 * @see StoryImpl
 * @see com.test.model.Story
 * @generated
 */
public abstract class StoryBaseImpl extends StoryModelImpl implements Story {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a story model instance should use the {@link Story} interface instead.
	 */
	public void persist() throws SystemException {
		if (this.isNew()) {
			StoryLocalServiceUtil.addStory(this);
		}
		else {
			StoryLocalServiceUtil.updateStory(this);
		}
	}
}