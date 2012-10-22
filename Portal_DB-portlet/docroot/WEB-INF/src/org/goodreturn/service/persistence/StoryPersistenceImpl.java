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

import com.liferay.portal.NoSuchModelException;
import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.BatchSessionUtil;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;
import com.liferay.portal.service.persistence.WorkflowInstanceLinkPersistence;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.liferay.portlet.asset.service.persistence.AssetEntryPersistence;

import org.goodreturn.NoSuchStoryException;

import org.goodreturn.model.Story;
import org.goodreturn.model.impl.StoryImpl;
import org.goodreturn.model.impl.StoryModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the story service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author gilaa004
 * @see StoryPersistence
 * @see StoryUtil
 * @generated
 */
public class StoryPersistenceImpl extends BasePersistenceImpl<Story>
	implements StoryPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link StoryUtil} to access the story persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = StoryImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(StoryModelImpl.ENTITY_CACHE_ENABLED,
			StoryModelImpl.FINDER_CACHE_ENABLED, StoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(StoryModelImpl.ENTITY_CACHE_ENABLED,
			StoryModelImpl.FINDER_CACHE_ENABLED, StoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] { String.class.getName() },
			StoryModelImpl.UUID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(StoryModelImpl.ENTITY_CACHE_ENABLED,
			StoryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_L_S = new FinderPath(StoryModelImpl.ENTITY_CACHE_ENABLED,
			StoryModelImpl.FINDER_CACHE_ENABLED, StoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByL_S",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_L_S = new FinderPath(StoryModelImpl.ENTITY_CACHE_ENABLED,
			StoryModelImpl.FINDER_CACHE_ENABLED, StoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByL_S",
			new String[] { Long.class.getName(), String.class.getName() },
			StoryModelImpl.ABACUS_BORROWER_LOAN_ID_COLUMN_BITMASK |
			StoryModelImpl.STORY_TYPE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_L_S = new FinderPath(StoryModelImpl.ENTITY_CACHE_ENABLED,
			StoryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByL_S",
			new String[] { Long.class.getName(), String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(StoryModelImpl.ENTITY_CACHE_ENABLED,
			StoryModelImpl.FINDER_CACHE_ENABLED, StoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(StoryModelImpl.ENTITY_CACHE_ENABLED,
			StoryModelImpl.FINDER_CACHE_ENABLED, StoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(StoryModelImpl.ENTITY_CACHE_ENABLED,
			StoryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the story in the entity cache if it is enabled.
	 *
	 * @param story the story
	 */
	public void cacheResult(Story story) {
		EntityCacheUtil.putResult(StoryModelImpl.ENTITY_CACHE_ENABLED,
			StoryImpl.class, story.getPrimaryKey(), story);

		story.resetOriginalValues();
	}

	/**
	 * Caches the stories in the entity cache if it is enabled.
	 *
	 * @param stories the stories
	 */
	public void cacheResult(List<Story> stories) {
		for (Story story : stories) {
			if (EntityCacheUtil.getResult(StoryModelImpl.ENTITY_CACHE_ENABLED,
						StoryImpl.class, story.getPrimaryKey()) == null) {
				cacheResult(story);
			}
			else {
				story.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all stories.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(StoryImpl.class.getName());
		}

		EntityCacheUtil.clearCache(StoryImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the story.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Story story) {
		EntityCacheUtil.removeResult(StoryModelImpl.ENTITY_CACHE_ENABLED,
			StoryImpl.class, story.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Story> stories) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Story story : stories) {
			EntityCacheUtil.removeResult(StoryModelImpl.ENTITY_CACHE_ENABLED,
				StoryImpl.class, story.getPrimaryKey());
		}
	}

	/**
	 * Creates a new story with the primary key. Does not add the story to the database.
	 *
	 * @param story_Id the primary key for the new story
	 * @return the new story
	 */
	public Story create(long story_Id) {
		Story story = new StoryImpl();

		story.setNew(true);
		story.setPrimaryKey(story_Id);

		String uuid = PortalUUIDUtil.generate();

		story.setUuid(uuid);

		return story;
	}

	/**
	 * Removes the story with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param story_Id the primary key of the story
	 * @return the story that was removed
	 * @throws org.goodreturn.NoSuchStoryException if a story with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Story remove(long story_Id)
		throws NoSuchStoryException, SystemException {
		return remove(Long.valueOf(story_Id));
	}

	/**
	 * Removes the story with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the story
	 * @return the story that was removed
	 * @throws org.goodreturn.NoSuchStoryException if a story with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Story remove(Serializable primaryKey)
		throws NoSuchStoryException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Story story = (Story)session.get(StoryImpl.class, primaryKey);

			if (story == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchStoryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(story);
		}
		catch (NoSuchStoryException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Story removeImpl(Story story) throws SystemException {
		story = toUnwrappedModel(story);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, story);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(story);

		return story;
	}

	@Override
	public Story updateImpl(org.goodreturn.model.Story story, boolean merge)
		throws SystemException {
		story = toUnwrappedModel(story);

		boolean isNew = story.isNew();

		StoryModelImpl storyModelImpl = (StoryModelImpl)story;

		if (Validator.isNull(story.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			story.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, story, merge);

			story.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !StoryModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((storyModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { storyModelImpl.getOriginalUuid() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);

				args = new Object[] { storyModelImpl.getUuid() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);
			}

			if ((storyModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_L_S.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(storyModelImpl.getOriginalAbacus_Borrower_Loan_Id()),
						
						storyModelImpl.getOriginalStory_Type()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_L_S, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_L_S,
					args);

				args = new Object[] {
						Long.valueOf(storyModelImpl.getAbacus_Borrower_Loan_Id()),
						
						storyModelImpl.getStory_Type()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_L_S, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_L_S,
					args);
			}
		}

		EntityCacheUtil.putResult(StoryModelImpl.ENTITY_CACHE_ENABLED,
			StoryImpl.class, story.getPrimaryKey(), story);

		return story;
	}

	protected Story toUnwrappedModel(Story story) {
		if (story instanceof StoryImpl) {
			return story;
		}

		StoryImpl storyImpl = new StoryImpl();

		storyImpl.setNew(story.isNew());
		storyImpl.setPrimaryKey(story.getPrimaryKey());

		storyImpl.setUuid(story.getUuid());
		storyImpl.setStory_Id(story.getStory_Id());
		storyImpl.setAbacus_Borrower_Loan_Id(story.getAbacus_Borrower_Loan_Id());
		storyImpl.setStory_Type(story.getStory_Type());
		storyImpl.setStory_Text(story.getStory_Text());
		storyImpl.setVideo_Url(story.getVideo_Url());
		storyImpl.setIs_Good_Enough_For_Marketing(story.isIs_Good_Enough_For_Marketing());
		storyImpl.setIs_Good_Enough_For_Story(story.isIs_Good_Enough_For_Story());
		storyImpl.setStatus(story.getStatus());
		storyImpl.setStatus_By_User_Id(story.getStatus_By_User_Id());
		storyImpl.setStatus_By_User_Name(story.getStatus_By_User_Name());
		storyImpl.setStatus_Date(story.getStatus_Date());
		storyImpl.setChanged_By(story.getChanged_By());
		storyImpl.setChanged_Time(story.getChanged_Time());
		storyImpl.setCompany_Id(story.getCompany_Id());
		storyImpl.setGroup_Id(story.getGroup_Id());
		storyImpl.setUser_Id(story.getUser_Id());

		return storyImpl;
	}

	/**
	 * Returns the story with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the story
	 * @return the story
	 * @throws com.liferay.portal.NoSuchModelException if a story with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Story findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the story with the primary key or throws a {@link org.goodreturn.NoSuchStoryException} if it could not be found.
	 *
	 * @param story_Id the primary key of the story
	 * @return the story
	 * @throws org.goodreturn.NoSuchStoryException if a story with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Story findByPrimaryKey(long story_Id)
		throws NoSuchStoryException, SystemException {
		Story story = fetchByPrimaryKey(story_Id);

		if (story == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + story_Id);
			}

			throw new NoSuchStoryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				story_Id);
		}

		return story;
	}

	/**
	 * Returns the story with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the story
	 * @return the story, or <code>null</code> if a story with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Story fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the story with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param story_Id the primary key of the story
	 * @return the story, or <code>null</code> if a story with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Story fetchByPrimaryKey(long story_Id) throws SystemException {
		Story story = (Story)EntityCacheUtil.getResult(StoryModelImpl.ENTITY_CACHE_ENABLED,
				StoryImpl.class, story_Id);

		if (story == _nullStory) {
			return null;
		}

		if (story == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				story = (Story)session.get(StoryImpl.class,
						Long.valueOf(story_Id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (story != null) {
					cacheResult(story);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(StoryModelImpl.ENTITY_CACHE_ENABLED,
						StoryImpl.class, story_Id, _nullStory);
				}

				closeSession(session);
			}
		}

		return story;
	}

	/**
	 * Returns all the stories where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching stories
	 * @throws SystemException if a system exception occurred
	 */
	public List<Story> findByUuid(String uuid) throws SystemException {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the stories where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of stories
	 * @param end the upper bound of the range of stories (not inclusive)
	 * @return the range of matching stories
	 * @throws SystemException if a system exception occurred
	 */
	public List<Story> findByUuid(String uuid, int start, int end)
		throws SystemException {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the stories where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of stories
	 * @param end the upper bound of the range of stories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching stories
	 * @throws SystemException if a system exception occurred
	 */
	public List<Story> findByUuid(String uuid, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID;
			finderArgs = new Object[] { uuid };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID;
			finderArgs = new Object[] { uuid, start, end, orderByComparator };
		}

		List<Story> list = (List<Story>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Story story : list) {
				if (!Validator.equals(uuid, story.getUuid())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_STORY_WHERE);

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_UUID_1);
			}
			else {
				if (uuid.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_UUID_UUID_3);
				}
				else {
					query.append(_FINDER_COLUMN_UUID_UUID_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(StoryModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (uuid != null) {
					qPos.add(uuid);
				}

				list = (List<Story>)QueryUtil.list(q, getDialect(), start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(finderPath, finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(finderPath, finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first story in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching story
	 * @throws org.goodreturn.NoSuchStoryException if a matching story could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Story findByUuid_First(String uuid,
		OrderByComparator orderByComparator)
		throws NoSuchStoryException, SystemException {
		Story story = fetchByUuid_First(uuid, orderByComparator);

		if (story != null) {
			return story;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchStoryException(msg.toString());
	}

	/**
	 * Returns the first story in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching story, or <code>null</code> if a matching story could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Story fetchByUuid_First(String uuid,
		OrderByComparator orderByComparator) throws SystemException {
		List<Story> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last story in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching story
	 * @throws org.goodreturn.NoSuchStoryException if a matching story could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Story findByUuid_Last(String uuid,
		OrderByComparator orderByComparator)
		throws NoSuchStoryException, SystemException {
		Story story = fetchByUuid_Last(uuid, orderByComparator);

		if (story != null) {
			return story;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchStoryException(msg.toString());
	}

	/**
	 * Returns the last story in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching story, or <code>null</code> if a matching story could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Story fetchByUuid_Last(String uuid,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByUuid(uuid);

		List<Story> list = findByUuid(uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the stories before and after the current story in the ordered set where uuid = &#63;.
	 *
	 * @param story_Id the primary key of the current story
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next story
	 * @throws org.goodreturn.NoSuchStoryException if a story with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Story[] findByUuid_PrevAndNext(long story_Id, String uuid,
		OrderByComparator orderByComparator)
		throws NoSuchStoryException, SystemException {
		Story story = findByPrimaryKey(story_Id);

		Session session = null;

		try {
			session = openSession();

			Story[] array = new StoryImpl[3];

			array[0] = getByUuid_PrevAndNext(session, story, uuid,
					orderByComparator, true);

			array[1] = story;

			array[2] = getByUuid_PrevAndNext(session, story, uuid,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Story getByUuid_PrevAndNext(Session session, Story story,
		String uuid, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_STORY_WHERE);

		if (uuid == null) {
			query.append(_FINDER_COLUMN_UUID_UUID_1);
		}
		else {
			if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}

		else {
			query.append(StoryModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (uuid != null) {
			qPos.add(uuid);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(story);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Story> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the stories where abacus_Borrower_Loan_Id = &#63; and story_Type = &#63;.
	 *
	 * @param abacus_Borrower_Loan_Id the abacus_ borrower_ loan_ ID
	 * @param story_Type the story_ type
	 * @return the matching stories
	 * @throws SystemException if a system exception occurred
	 */
	public List<Story> findByL_S(long abacus_Borrower_Loan_Id, String story_Type)
		throws SystemException {
		return findByL_S(abacus_Borrower_Loan_Id, story_Type,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the stories where abacus_Borrower_Loan_Id = &#63; and story_Type = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param abacus_Borrower_Loan_Id the abacus_ borrower_ loan_ ID
	 * @param story_Type the story_ type
	 * @param start the lower bound of the range of stories
	 * @param end the upper bound of the range of stories (not inclusive)
	 * @return the range of matching stories
	 * @throws SystemException if a system exception occurred
	 */
	public List<Story> findByL_S(long abacus_Borrower_Loan_Id,
		String story_Type, int start, int end) throws SystemException {
		return findByL_S(abacus_Borrower_Loan_Id, story_Type, start, end, null);
	}

	/**
	 * Returns an ordered range of all the stories where abacus_Borrower_Loan_Id = &#63; and story_Type = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param abacus_Borrower_Loan_Id the abacus_ borrower_ loan_ ID
	 * @param story_Type the story_ type
	 * @param start the lower bound of the range of stories
	 * @param end the upper bound of the range of stories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching stories
	 * @throws SystemException if a system exception occurred
	 */
	public List<Story> findByL_S(long abacus_Borrower_Loan_Id,
		String story_Type, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_L_S;
			finderArgs = new Object[] { abacus_Borrower_Loan_Id, story_Type };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_L_S;
			finderArgs = new Object[] {
					abacus_Borrower_Loan_Id, story_Type,
					
					start, end, orderByComparator
				};
		}

		List<Story> list = (List<Story>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Story story : list) {
				if ((abacus_Borrower_Loan_Id != story.getAbacus_Borrower_Loan_Id()) ||
						!Validator.equals(story_Type, story.getStory_Type())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_STORY_WHERE);

			query.append(_FINDER_COLUMN_L_S_ABACUS_BORROWER_LOAN_ID_2);

			if (story_Type == null) {
				query.append(_FINDER_COLUMN_L_S_STORY_TYPE_1);
			}
			else {
				if (story_Type.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_L_S_STORY_TYPE_3);
				}
				else {
					query.append(_FINDER_COLUMN_L_S_STORY_TYPE_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(StoryModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(abacus_Borrower_Loan_Id);

				if (story_Type != null) {
					qPos.add(story_Type);
				}

				list = (List<Story>)QueryUtil.list(q, getDialect(), start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(finderPath, finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(finderPath, finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first story in the ordered set where abacus_Borrower_Loan_Id = &#63; and story_Type = &#63;.
	 *
	 * @param abacus_Borrower_Loan_Id the abacus_ borrower_ loan_ ID
	 * @param story_Type the story_ type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching story
	 * @throws org.goodreturn.NoSuchStoryException if a matching story could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Story findByL_S_First(long abacus_Borrower_Loan_Id,
		String story_Type, OrderByComparator orderByComparator)
		throws NoSuchStoryException, SystemException {
		Story story = fetchByL_S_First(abacus_Borrower_Loan_Id, story_Type,
				orderByComparator);

		if (story != null) {
			return story;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("abacus_Borrower_Loan_Id=");
		msg.append(abacus_Borrower_Loan_Id);

		msg.append(", story_Type=");
		msg.append(story_Type);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchStoryException(msg.toString());
	}

	/**
	 * Returns the first story in the ordered set where abacus_Borrower_Loan_Id = &#63; and story_Type = &#63;.
	 *
	 * @param abacus_Borrower_Loan_Id the abacus_ borrower_ loan_ ID
	 * @param story_Type the story_ type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching story, or <code>null</code> if a matching story could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Story fetchByL_S_First(long abacus_Borrower_Loan_Id,
		String story_Type, OrderByComparator orderByComparator)
		throws SystemException {
		List<Story> list = findByL_S(abacus_Borrower_Loan_Id, story_Type, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last story in the ordered set where abacus_Borrower_Loan_Id = &#63; and story_Type = &#63;.
	 *
	 * @param abacus_Borrower_Loan_Id the abacus_ borrower_ loan_ ID
	 * @param story_Type the story_ type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching story
	 * @throws org.goodreturn.NoSuchStoryException if a matching story could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Story findByL_S_Last(long abacus_Borrower_Loan_Id,
		String story_Type, OrderByComparator orderByComparator)
		throws NoSuchStoryException, SystemException {
		Story story = fetchByL_S_Last(abacus_Borrower_Loan_Id, story_Type,
				orderByComparator);

		if (story != null) {
			return story;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("abacus_Borrower_Loan_Id=");
		msg.append(abacus_Borrower_Loan_Id);

		msg.append(", story_Type=");
		msg.append(story_Type);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchStoryException(msg.toString());
	}

	/**
	 * Returns the last story in the ordered set where abacus_Borrower_Loan_Id = &#63; and story_Type = &#63;.
	 *
	 * @param abacus_Borrower_Loan_Id the abacus_ borrower_ loan_ ID
	 * @param story_Type the story_ type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching story, or <code>null</code> if a matching story could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Story fetchByL_S_Last(long abacus_Borrower_Loan_Id,
		String story_Type, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByL_S(abacus_Borrower_Loan_Id, story_Type);

		List<Story> list = findByL_S(abacus_Borrower_Loan_Id, story_Type,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the stories before and after the current story in the ordered set where abacus_Borrower_Loan_Id = &#63; and story_Type = &#63;.
	 *
	 * @param story_Id the primary key of the current story
	 * @param abacus_Borrower_Loan_Id the abacus_ borrower_ loan_ ID
	 * @param story_Type the story_ type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next story
	 * @throws org.goodreturn.NoSuchStoryException if a story with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Story[] findByL_S_PrevAndNext(long story_Id,
		long abacus_Borrower_Loan_Id, String story_Type,
		OrderByComparator orderByComparator)
		throws NoSuchStoryException, SystemException {
		Story story = findByPrimaryKey(story_Id);

		Session session = null;

		try {
			session = openSession();

			Story[] array = new StoryImpl[3];

			array[0] = getByL_S_PrevAndNext(session, story,
					abacus_Borrower_Loan_Id, story_Type, orderByComparator, true);

			array[1] = story;

			array[2] = getByL_S_PrevAndNext(session, story,
					abacus_Borrower_Loan_Id, story_Type, orderByComparator,
					false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Story getByL_S_PrevAndNext(Session session, Story story,
		long abacus_Borrower_Loan_Id, String story_Type,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_STORY_WHERE);

		query.append(_FINDER_COLUMN_L_S_ABACUS_BORROWER_LOAN_ID_2);

		if (story_Type == null) {
			query.append(_FINDER_COLUMN_L_S_STORY_TYPE_1);
		}
		else {
			if (story_Type.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_L_S_STORY_TYPE_3);
			}
			else {
				query.append(_FINDER_COLUMN_L_S_STORY_TYPE_2);
			}
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}

		else {
			query.append(StoryModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(abacus_Borrower_Loan_Id);

		if (story_Type != null) {
			qPos.add(story_Type);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(story);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Story> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the stories.
	 *
	 * @return the stories
	 * @throws SystemException if a system exception occurred
	 */
	public List<Story> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the stories.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of stories
	 * @param end the upper bound of the range of stories (not inclusive)
	 * @return the range of stories
	 * @throws SystemException if a system exception occurred
	 */
	public List<Story> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the stories.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of stories
	 * @param end the upper bound of the range of stories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of stories
	 * @throws SystemException if a system exception occurred
	 */
	public List<Story> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = new Object[] { start, end, orderByComparator };

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<Story> list = (List<Story>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_STORY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_STORY.concat(StoryModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<Story>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);
				}
				else {
					list = (List<Story>)QueryUtil.list(q, getDialect(), start,
							end);
				}
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(finderPath, finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(finderPath, finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the stories where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByUuid(String uuid) throws SystemException {
		for (Story story : findByUuid(uuid)) {
			remove(story);
		}
	}

	/**
	 * Removes all the stories where abacus_Borrower_Loan_Id = &#63; and story_Type = &#63; from the database.
	 *
	 * @param abacus_Borrower_Loan_Id the abacus_ borrower_ loan_ ID
	 * @param story_Type the story_ type
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByL_S(long abacus_Borrower_Loan_Id, String story_Type)
		throws SystemException {
		for (Story story : findByL_S(abacus_Borrower_Loan_Id, story_Type)) {
			remove(story);
		}
	}

	/**
	 * Removes all the stories from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (Story story : findAll()) {
			remove(story);
		}
	}

	/**
	 * Returns the number of stories where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching stories
	 * @throws SystemException if a system exception occurred
	 */
	public int countByUuid(String uuid) throws SystemException {
		Object[] finderArgs = new Object[] { uuid };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_UUID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_STORY_WHERE);

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_UUID_1);
			}
			else {
				if (uuid.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_UUID_UUID_3);
				}
				else {
					query.append(_FINDER_COLUMN_UUID_UUID_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (uuid != null) {
					qPos.add(uuid);
				}

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_UUID,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of stories where abacus_Borrower_Loan_Id = &#63; and story_Type = &#63;.
	 *
	 * @param abacus_Borrower_Loan_Id the abacus_ borrower_ loan_ ID
	 * @param story_Type the story_ type
	 * @return the number of matching stories
	 * @throws SystemException if a system exception occurred
	 */
	public int countByL_S(long abacus_Borrower_Loan_Id, String story_Type)
		throws SystemException {
		Object[] finderArgs = new Object[] { abacus_Borrower_Loan_Id, story_Type };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_L_S,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_STORY_WHERE);

			query.append(_FINDER_COLUMN_L_S_ABACUS_BORROWER_LOAN_ID_2);

			if (story_Type == null) {
				query.append(_FINDER_COLUMN_L_S_STORY_TYPE_1);
			}
			else {
				if (story_Type.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_L_S_STORY_TYPE_3);
				}
				else {
					query.append(_FINDER_COLUMN_L_S_STORY_TYPE_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(abacus_Borrower_Loan_Id);

				if (story_Type != null) {
					qPos.add(story_Type);
				}

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_L_S, finderArgs,
					count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of stories.
	 *
	 * @return the number of stories
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_STORY);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the story persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.goodreturn.model.Story")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Story>> listenersList = new ArrayList<ModelListener<Story>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Story>)InstanceFactory.newInstance(
							listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(StoryImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@BeanReference(type = BorrowerPersistence.class)
	protected BorrowerPersistence borrowerPersistence;
	@BeanReference(type = BorrowerLoanPersistence.class)
	protected BorrowerLoanPersistence borrowerLoanPersistence;
	@BeanReference(type = Gift_CertificatePersistence.class)
	protected Gift_CertificatePersistence gift_CertificatePersistence;
	@BeanReference(type = LenderPersistence.class)
	protected LenderPersistence lenderPersistence;
	@BeanReference(type = PersonPersistence.class)
	protected PersonPersistence personPersistence;
	@BeanReference(type = StoryPersistence.class)
	protected StoryPersistence storyPersistence;
	@BeanReference(type = TeamPersistence.class)
	protected TeamPersistence teamPersistence;
	@BeanReference(type = TeamLenderPersistence.class)
	protected TeamLenderPersistence teamLenderPersistence;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	@BeanReference(type = WorkflowInstanceLinkPersistence.class)
	protected WorkflowInstanceLinkPersistence workflowInstanceLinkPersistence;
	@BeanReference(type = AssetEntryPersistence.class)
	protected AssetEntryPersistence assetEntryPersistence;
	private static final String _SQL_SELECT_STORY = "SELECT story FROM Story story";
	private static final String _SQL_SELECT_STORY_WHERE = "SELECT story FROM Story story WHERE ";
	private static final String _SQL_COUNT_STORY = "SELECT COUNT(story) FROM Story story";
	private static final String _SQL_COUNT_STORY_WHERE = "SELECT COUNT(story) FROM Story story WHERE ";
	private static final String _FINDER_COLUMN_UUID_UUID_1 = "story.uuid IS NULL";
	private static final String _FINDER_COLUMN_UUID_UUID_2 = "story.uuid = ?";
	private static final String _FINDER_COLUMN_UUID_UUID_3 = "(story.uuid IS NULL OR story.uuid = ?)";
	private static final String _FINDER_COLUMN_L_S_ABACUS_BORROWER_LOAN_ID_2 = "story.abacus_Borrower_Loan_Id = ? AND ";
	private static final String _FINDER_COLUMN_L_S_STORY_TYPE_1 = "story.story_Type IS NULL";
	private static final String _FINDER_COLUMN_L_S_STORY_TYPE_2 = "story.story_Type = ?";
	private static final String _FINDER_COLUMN_L_S_STORY_TYPE_3 = "(story.story_Type IS NULL OR story.story_Type = ?)";
	private static final String _ORDER_BY_ENTITY_ALIAS = "story.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Story exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Story exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(StoryPersistenceImpl.class);
	private static Story _nullStory = new StoryImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Story> toCacheModel() {
				return _nullStoryCacheModel;
			}
		};

	private static CacheModel<Story> _nullStoryCacheModel = new CacheModel<Story>() {
			public Story toEntityModel() {
				return _nullStory;
			}
		};
}