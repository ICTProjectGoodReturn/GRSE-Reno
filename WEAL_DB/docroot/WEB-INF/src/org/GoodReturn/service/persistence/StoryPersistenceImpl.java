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

package org.GoodReturn.service.persistence;

import com.liferay.portal.NoSuchModelException;
import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
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
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.BatchSessionUtil;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import org.GoodReturn.NoSuchStoryException;

import org.GoodReturn.model.Story;
import org.GoodReturn.model.impl.StoryImpl;
import org.GoodReturn.model.impl.StoryModelImpl;

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

		return story;
	}

	/**
	 * Removes the story with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param story_Id the primary key of the story
	 * @return the story that was removed
	 * @throws org.GoodReturn.NoSuchStoryException if a story with the primary key could not be found
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
	 * @throws org.GoodReturn.NoSuchStoryException if a story with the primary key could not be found
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
	public Story updateImpl(org.GoodReturn.model.Story story, boolean merge)
		throws SystemException {
		story = toUnwrappedModel(story);

		boolean isNew = story.isNew();

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

		if (isNew) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
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

		storyImpl.setStory_Id(story.getStory_Id());
		storyImpl.setFinal_Story(story.getFinal_Story());
		storyImpl.setIs_Good_Enough_For_Marketing(story.isIs_Good_Enough_For_Marketing());
		storyImpl.setIs_Good_Enough_For_Final_Story(story.isIs_Good_Enough_For_Final_Story());

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
	 * Returns the story with the primary key or throws a {@link org.GoodReturn.NoSuchStoryException} if it could not be found.
	 *
	 * @param story_Id the primary key of the story
	 * @return the story
	 * @throws org.GoodReturn.NoSuchStoryException if a story with the primary key could not be found
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
						"value.object.listener.org.GoodReturn.model.Story")));

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
	@BeanReference(type = Gift_CertificatePersistence.class)
	protected Gift_CertificatePersistence gift_CertificatePersistence;
	@BeanReference(type = LenderPersistence.class)
	protected LenderPersistence lenderPersistence;
	@BeanReference(type = PersonPersistence.class)
	protected PersonPersistence personPersistence;
	@BeanReference(type = StoryPersistence.class)
	protected StoryPersistence storyPersistence;
	@BeanReference(type = Supplementary_TablePersistence.class)
	protected Supplementary_TablePersistence supplementary_TablePersistence;
	@BeanReference(type = TeamPersistence.class)
	protected TeamPersistence teamPersistence;
	@BeanReference(type = TeamLenderPersistence.class)
	protected TeamLenderPersistence teamLenderPersistence;
	@BeanReference(type = TeamLenderLoanPersistence.class)
	protected TeamLenderLoanPersistence teamLenderLoanPersistence;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private static final String _SQL_SELECT_STORY = "SELECT story FROM Story story";
	private static final String _SQL_COUNT_STORY = "SELECT COUNT(story) FROM Story story";
	private static final String _ORDER_BY_ENTITY_ALIAS = "story.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Story exists with the primary key ";
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