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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import org.goodreturn.model.Story;
import org.goodreturn.model.StoryModel;
import org.goodreturn.model.StorySoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the Story service. Represents a row in the &quot;GoodReturn_Story&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link org.goodreturn.model.StoryModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link StoryImpl}.
 * </p>
 *
 * @author gilaa004
 * @see StoryImpl
 * @see org.goodreturn.model.Story
 * @see org.goodreturn.model.StoryModel
 * @generated
 */
@JSON(strict = true)
public class StoryModelImpl extends BaseModelImpl<Story> implements StoryModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a story model instance should use the {@link org.goodreturn.model.Story} interface instead.
	 */
	public static final String TABLE_NAME = "GoodReturn_Story";
	public static final Object[][] TABLE_COLUMNS = {
			{ "uuid_", Types.VARCHAR },
			{ "story_Id", Types.BIGINT },
			{ "loan_Account_Id", Types.BIGINT },
			{ "story_Type", Types.VARCHAR },
			{ "story_Text", Types.VARCHAR },
			{ "video_Url", Types.VARCHAR },
			{ "is_Good_Enough_For_Marketing", Types.BOOLEAN },
			{ "is_Good_Enough_For_Story", Types.BOOLEAN },
			{ "status", Types.INTEGER },
			{ "status_By_User_Id", Types.BIGINT },
			{ "status_By_User_Name", Types.VARCHAR },
			{ "status_Date", Types.TIMESTAMP },
			{ "company_Id", Types.BIGINT },
			{ "group_Id", Types.BIGINT },
			{ "user_Id", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table GoodReturn_Story (uuid_ VARCHAR(75) null,story_Id LONG not null primary key,loan_Account_Id LONG,story_Type VARCHAR(75) null,story_Text VARCHAR(75) null,video_Url VARCHAR(75) null,is_Good_Enough_For_Marketing BOOLEAN,is_Good_Enough_For_Story BOOLEAN,status INTEGER,status_By_User_Id LONG,status_By_User_Name VARCHAR(75) null,status_Date DATE null,company_Id LONG,group_Id LONG,user_Id LONG)";
	public static final String TABLE_SQL_DROP = "drop table GoodReturn_Story";
	public static final String ORDER_BY_JPQL = " ORDER BY story.story_Id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY GoodReturn_Story.story_Id ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.org.goodreturn.model.Story"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.org.goodreturn.model.Story"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.org.goodreturn.model.Story"),
			true);
	public static long LOAN_ACCOUNT_ID_COLUMN_BITMASK = 1L;
	public static long STORY_TYPE_COLUMN_BITMASK = 2L;
	public static long UUID_COLUMN_BITMASK = 4L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static Story toModel(StorySoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Story model = new StoryImpl();

		model.setUuid(soapModel.getUuid());
		model.setStory_Id(soapModel.getStory_Id());
		model.setLoan_Account_Id(soapModel.getLoan_Account_Id());
		model.setStory_Type(soapModel.getStory_Type());
		model.setStory_Text(soapModel.getStory_Text());
		model.setVideo_Url(soapModel.getVideo_Url());
		model.setIs_Good_Enough_For_Marketing(soapModel.getIs_Good_Enough_For_Marketing());
		model.setIs_Good_Enough_For_Story(soapModel.getIs_Good_Enough_For_Story());
		model.setStatus(soapModel.getStatus());
		model.setStatus_By_User_Id(soapModel.getStatus_By_User_Id());
		model.setStatus_By_User_Name(soapModel.getStatus_By_User_Name());
		model.setStatus_Date(soapModel.getStatus_Date());
		model.setCompany_Id(soapModel.getCompany_Id());
		model.setGroup_Id(soapModel.getGroup_Id());
		model.setUser_Id(soapModel.getUser_Id());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<Story> toModels(StorySoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Story> models = new ArrayList<Story>(soapModels.length);

		for (StorySoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.org.goodreturn.model.Story"));

	public StoryModelImpl() {
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

	public Class<?> getModelClass() {
		return Story.class;
	}

	public String getModelClassName() {
		return Story.class.getName();
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

	@JSON
	public String getUuid() {
		if (_uuid == null) {
			return StringPool.BLANK;
		}
		else {
			return _uuid;
		}
	}

	public void setUuid(String uuid) {
		if (_originalUuid == null) {
			_originalUuid = _uuid;
		}

		_uuid = uuid;
	}

	public String getOriginalUuid() {
		return GetterUtil.getString(_originalUuid);
	}

	@JSON
	public long getStory_Id() {
		return _story_Id;
	}

	public void setStory_Id(long story_Id) {
		_columnBitmask = -1L;

		_story_Id = story_Id;
	}

	@JSON
	public long getLoan_Account_Id() {
		return _loan_Account_Id;
	}

	public void setLoan_Account_Id(long loan_Account_Id) {
		_columnBitmask |= LOAN_ACCOUNT_ID_COLUMN_BITMASK;

		if (!_setOriginalLoan_Account_Id) {
			_setOriginalLoan_Account_Id = true;

			_originalLoan_Account_Id = _loan_Account_Id;
		}

		_loan_Account_Id = loan_Account_Id;
	}

	public long getOriginalLoan_Account_Id() {
		return _originalLoan_Account_Id;
	}

	@JSON
	public String getStory_Type() {
		if (_story_Type == null) {
			return StringPool.BLANK;
		}
		else {
			return _story_Type;
		}
	}

	public void setStory_Type(String story_Type) {
		_columnBitmask |= STORY_TYPE_COLUMN_BITMASK;

		if (_originalStory_Type == null) {
			_originalStory_Type = _story_Type;
		}

		_story_Type = story_Type;
	}

	public String getOriginalStory_Type() {
		return GetterUtil.getString(_originalStory_Type);
	}

	@JSON
	public String getStory_Text() {
		if (_story_Text == null) {
			return StringPool.BLANK;
		}
		else {
			return _story_Text;
		}
	}

	public void setStory_Text(String story_Text) {
		_story_Text = story_Text;
	}

	@JSON
	public String getVideo_Url() {
		if (_video_Url == null) {
			return StringPool.BLANK;
		}
		else {
			return _video_Url;
		}
	}

	public void setVideo_Url(String video_Url) {
		_video_Url = video_Url;
	}

	@JSON
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

	@JSON
	public boolean getIs_Good_Enough_For_Story() {
		return _is_Good_Enough_For_Story;
	}

	public boolean isIs_Good_Enough_For_Story() {
		return _is_Good_Enough_For_Story;
	}

	public void setIs_Good_Enough_For_Story(boolean is_Good_Enough_For_Story) {
		_is_Good_Enough_For_Story = is_Good_Enough_For_Story;
	}

	@JSON
	public int getStatus() {
		return _status;
	}

	public void setStatus(int status) {
		_status = status;
	}

	@JSON
	public long getStatus_By_User_Id() {
		return _status_By_User_Id;
	}

	public void setStatus_By_User_Id(long status_By_User_Id) {
		_status_By_User_Id = status_By_User_Id;
	}

	@JSON
	public String getStatus_By_User_Name() {
		if (_status_By_User_Name == null) {
			return StringPool.BLANK;
		}
		else {
			return _status_By_User_Name;
		}
	}

	public void setStatus_By_User_Name(String status_By_User_Name) {
		_status_By_User_Name = status_By_User_Name;
	}

	@JSON
	public Date getStatus_Date() {
		return _status_Date;
	}

	public void setStatus_Date(Date status_Date) {
		_status_Date = status_Date;
	}

	@JSON
	public long getCompany_Id() {
		return _company_Id;
	}

	public void setCompany_Id(long company_Id) {
		_company_Id = company_Id;
	}

	@JSON
	public long getGroup_Id() {
		return _group_Id;
	}

	public void setGroup_Id(long group_Id) {
		_group_Id = group_Id;
	}

	@JSON
	public long getUser_Id() {
		return _user_Id;
	}

	public void setUser_Id(long user_Id) {
		_user_Id = user_Id;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			Story.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Story toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (Story)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public Object clone() {
		StoryImpl storyImpl = new StoryImpl();

		storyImpl.setUuid(getUuid());
		storyImpl.setStory_Id(getStory_Id());
		storyImpl.setLoan_Account_Id(getLoan_Account_Id());
		storyImpl.setStory_Type(getStory_Type());
		storyImpl.setStory_Text(getStory_Text());
		storyImpl.setVideo_Url(getVideo_Url());
		storyImpl.setIs_Good_Enough_For_Marketing(getIs_Good_Enough_For_Marketing());
		storyImpl.setIs_Good_Enough_For_Story(getIs_Good_Enough_For_Story());
		storyImpl.setStatus(getStatus());
		storyImpl.setStatus_By_User_Id(getStatus_By_User_Id());
		storyImpl.setStatus_By_User_Name(getStatus_By_User_Name());
		storyImpl.setStatus_Date(getStatus_Date());
		storyImpl.setCompany_Id(getCompany_Id());
		storyImpl.setGroup_Id(getGroup_Id());
		storyImpl.setUser_Id(getUser_Id());

		storyImpl.resetOriginalValues();

		return storyImpl;
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

		Story story = null;

		try {
			story = (Story)obj;
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
	public void resetOriginalValues() {
		StoryModelImpl storyModelImpl = this;

		storyModelImpl._originalUuid = storyModelImpl._uuid;

		storyModelImpl._originalLoan_Account_Id = storyModelImpl._loan_Account_Id;

		storyModelImpl._setOriginalLoan_Account_Id = false;

		storyModelImpl._originalStory_Type = storyModelImpl._story_Type;

		storyModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Story> toCacheModel() {
		StoryCacheModel storyCacheModel = new StoryCacheModel();

		storyCacheModel.uuid = getUuid();

		String uuid = storyCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			storyCacheModel.uuid = null;
		}

		storyCacheModel.story_Id = getStory_Id();

		storyCacheModel.loan_Account_Id = getLoan_Account_Id();

		storyCacheModel.story_Type = getStory_Type();

		String story_Type = storyCacheModel.story_Type;

		if ((story_Type != null) && (story_Type.length() == 0)) {
			storyCacheModel.story_Type = null;
		}

		storyCacheModel.story_Text = getStory_Text();

		String story_Text = storyCacheModel.story_Text;

		if ((story_Text != null) && (story_Text.length() == 0)) {
			storyCacheModel.story_Text = null;
		}

		storyCacheModel.video_Url = getVideo_Url();

		String video_Url = storyCacheModel.video_Url;

		if ((video_Url != null) && (video_Url.length() == 0)) {
			storyCacheModel.video_Url = null;
		}

		storyCacheModel.is_Good_Enough_For_Marketing = getIs_Good_Enough_For_Marketing();

		storyCacheModel.is_Good_Enough_For_Story = getIs_Good_Enough_For_Story();

		storyCacheModel.status = getStatus();

		storyCacheModel.status_By_User_Id = getStatus_By_User_Id();

		storyCacheModel.status_By_User_Name = getStatus_By_User_Name();

		String status_By_User_Name = storyCacheModel.status_By_User_Name;

		if ((status_By_User_Name != null) &&
				(status_By_User_Name.length() == 0)) {
			storyCacheModel.status_By_User_Name = null;
		}

		Date status_Date = getStatus_Date();

		if (status_Date != null) {
			storyCacheModel.status_Date = status_Date.getTime();
		}
		else {
			storyCacheModel.status_Date = Long.MIN_VALUE;
		}

		storyCacheModel.company_Id = getCompany_Id();

		storyCacheModel.group_Id = getGroup_Id();

		storyCacheModel.user_Id = getUser_Id();

		return storyCacheModel;
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

	private static ClassLoader _classLoader = Story.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			Story.class
		};
	private String _uuid;
	private String _originalUuid;
	private long _story_Id;
	private long _loan_Account_Id;
	private long _originalLoan_Account_Id;
	private boolean _setOriginalLoan_Account_Id;
	private String _story_Type;
	private String _originalStory_Type;
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
	private long _columnBitmask;
	private Story _escapedModelProxy;
}