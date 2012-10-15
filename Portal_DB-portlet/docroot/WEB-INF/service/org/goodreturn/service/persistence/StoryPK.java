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

package org.goodreturn.service.persistence;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

/**
 * @author gilaa004
 */
public class StoryPK implements Comparable<StoryPK>, Serializable {
	public long story_Id;
	public long loan_Account_Id;

	public StoryPK() {
	}

	public StoryPK(long story_Id, long loan_Account_Id) {
		this.story_Id = story_Id;
		this.loan_Account_Id = loan_Account_Id;
	}

	public long getStory_Id() {
		return story_Id;
	}

	public void setStory_Id(long story_Id) {
		this.story_Id = story_Id;
	}

	public long getLoan_Account_Id() {
		return loan_Account_Id;
	}

	public void setLoan_Account_Id(long loan_Account_Id) {
		this.loan_Account_Id = loan_Account_Id;
	}

	public int compareTo(StoryPK pk) {
		if (pk == null) {
			return -1;
		}

		int value = 0;

		if (story_Id < pk.story_Id) {
			value = -1;
		}
		else if (story_Id > pk.story_Id) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		if (loan_Account_Id < pk.loan_Account_Id) {
			value = -1;
		}
		else if (loan_Account_Id > pk.loan_Account_Id) {
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

		StoryPK pk = null;

		try {
			pk = (StoryPK)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		if ((story_Id == pk.story_Id) &&
				(loan_Account_Id == pk.loan_Account_Id)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (String.valueOf(story_Id) + String.valueOf(loan_Account_Id)).hashCode();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(10);

		sb.append(StringPool.OPEN_CURLY_BRACE);

		sb.append("story_Id");
		sb.append(StringPool.EQUAL);
		sb.append(story_Id);

		sb.append(StringPool.COMMA);
		sb.append(StringPool.SPACE);
		sb.append("loan_Account_Id");
		sb.append(StringPool.EQUAL);
		sb.append(loan_Account_Id);

		sb.append(StringPool.CLOSE_CURLY_BRACE);

		return sb.toString();
	}
}