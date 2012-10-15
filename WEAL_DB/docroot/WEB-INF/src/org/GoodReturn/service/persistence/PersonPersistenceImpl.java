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

import org.GoodReturn.NoSuchPersonException;

import org.GoodReturn.model.Person;
import org.GoodReturn.model.impl.PersonImpl;
import org.GoodReturn.model.impl.PersonModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the person service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author gilaa004
 * @see PersonPersistence
 * @see PersonUtil
 * @generated
 */
public class PersonPersistenceImpl extends BasePersistenceImpl<Person>
	implements PersonPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link PersonUtil} to access the person persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = PersonImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(PersonModelImpl.ENTITY_CACHE_ENABLED,
			PersonModelImpl.FINDER_CACHE_ENABLED, PersonImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(PersonModelImpl.ENTITY_CACHE_ENABLED,
			PersonModelImpl.FINDER_CACHE_ENABLED, PersonImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(PersonModelImpl.ENTITY_CACHE_ENABLED,
			PersonModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the person in the entity cache if it is enabled.
	 *
	 * @param person the person
	 */
	public void cacheResult(Person person) {
		EntityCacheUtil.putResult(PersonModelImpl.ENTITY_CACHE_ENABLED,
			PersonImpl.class, person.getPrimaryKey(), person);

		person.resetOriginalValues();
	}

	/**
	 * Caches the persons in the entity cache if it is enabled.
	 *
	 * @param persons the persons
	 */
	public void cacheResult(List<Person> persons) {
		for (Person person : persons) {
			if (EntityCacheUtil.getResult(
						PersonModelImpl.ENTITY_CACHE_ENABLED, PersonImpl.class,
						person.getPrimaryKey()) == null) {
				cacheResult(person);
			}
			else {
				person.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all persons.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(PersonImpl.class.getName());
		}

		EntityCacheUtil.clearCache(PersonImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the person.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Person person) {
		EntityCacheUtil.removeResult(PersonModelImpl.ENTITY_CACHE_ENABLED,
			PersonImpl.class, person.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Person> persons) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Person person : persons) {
			EntityCacheUtil.removeResult(PersonModelImpl.ENTITY_CACHE_ENABLED,
				PersonImpl.class, person.getPrimaryKey());
		}
	}

	/**
	 * Creates a new person with the primary key. Does not add the person to the database.
	 *
	 * @param abacus_Person_Id the primary key for the new person
	 * @return the new person
	 */
	public Person create(long abacus_Person_Id) {
		Person person = new PersonImpl();

		person.setNew(true);
		person.setPrimaryKey(abacus_Person_Id);

		return person;
	}

	/**
	 * Removes the person with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param abacus_Person_Id the primary key of the person
	 * @return the person that was removed
	 * @throws org.GoodReturn.NoSuchPersonException if a person with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Person remove(long abacus_Person_Id)
		throws NoSuchPersonException, SystemException {
		return remove(Long.valueOf(abacus_Person_Id));
	}

	/**
	 * Removes the person with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the person
	 * @return the person that was removed
	 * @throws org.GoodReturn.NoSuchPersonException if a person with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Person remove(Serializable primaryKey)
		throws NoSuchPersonException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Person person = (Person)session.get(PersonImpl.class, primaryKey);

			if (person == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchPersonException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(person);
		}
		catch (NoSuchPersonException nsee) {
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
	protected Person removeImpl(Person person) throws SystemException {
		person = toUnwrappedModel(person);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, person);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(person);

		return person;
	}

	@Override
	public Person updateImpl(org.GoodReturn.model.Person person, boolean merge)
		throws SystemException {
		person = toUnwrappedModel(person);

		boolean isNew = person.isNew();

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, person, merge);

			person.setNew(false);
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

		EntityCacheUtil.putResult(PersonModelImpl.ENTITY_CACHE_ENABLED,
			PersonImpl.class, person.getPrimaryKey(), person);

		return person;
	}

	protected Person toUnwrappedModel(Person person) {
		if (person instanceof PersonImpl) {
			return person;
		}

		PersonImpl personImpl = new PersonImpl();

		personImpl.setNew(person.isNew());
		personImpl.setPrimaryKey(person.getPrimaryKey());

		personImpl.setAbacus_Person_Id(person.getAbacus_Person_Id());
		personImpl.setFirst_Name(person.getFirst_Name());
		personImpl.setLast_Name(person.getLast_Name());
		personImpl.setEmail(person.getEmail());
		personImpl.setAddress(person.getAddress());
		personImpl.setAddress_Type(person.getAddress_Type());
		personImpl.setCountry(person.getCountry());
		personImpl.setGender(person.getGender());
		personImpl.setStatus(person.getStatus());
		personImpl.setPhoto_URL(person.getPhoto_URL());
		personImpl.setOccupation(person.getOccupation());

		return personImpl;
	}

	/**
	 * Returns the person with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the person
	 * @return the person
	 * @throws com.liferay.portal.NoSuchModelException if a person with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Person findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the person with the primary key or throws a {@link org.GoodReturn.NoSuchPersonException} if it could not be found.
	 *
	 * @param abacus_Person_Id the primary key of the person
	 * @return the person
	 * @throws org.GoodReturn.NoSuchPersonException if a person with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Person findByPrimaryKey(long abacus_Person_Id)
		throws NoSuchPersonException, SystemException {
		Person person = fetchByPrimaryKey(abacus_Person_Id);

		if (person == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + abacus_Person_Id);
			}

			throw new NoSuchPersonException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				abacus_Person_Id);
		}

		return person;
	}

	/**
	 * Returns the person with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the person
	 * @return the person, or <code>null</code> if a person with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Person fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the person with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param abacus_Person_Id the primary key of the person
	 * @return the person, or <code>null</code> if a person with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Person fetchByPrimaryKey(long abacus_Person_Id)
		throws SystemException {
		Person person = (Person)EntityCacheUtil.getResult(PersonModelImpl.ENTITY_CACHE_ENABLED,
				PersonImpl.class, abacus_Person_Id);

		if (person == _nullPerson) {
			return null;
		}

		if (person == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				person = (Person)session.get(PersonImpl.class,
						Long.valueOf(abacus_Person_Id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (person != null) {
					cacheResult(person);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(PersonModelImpl.ENTITY_CACHE_ENABLED,
						PersonImpl.class, abacus_Person_Id, _nullPerson);
				}

				closeSession(session);
			}
		}

		return person;
	}

	/**
	 * Returns all the persons.
	 *
	 * @return the persons
	 * @throws SystemException if a system exception occurred
	 */
	public List<Person> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the persons.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of persons
	 * @param end the upper bound of the range of persons (not inclusive)
	 * @return the range of persons
	 * @throws SystemException if a system exception occurred
	 */
	public List<Person> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the persons.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of persons
	 * @param end the upper bound of the range of persons (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of persons
	 * @throws SystemException if a system exception occurred
	 */
	public List<Person> findAll(int start, int end,
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

		List<Person> list = (List<Person>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_PERSON);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PERSON.concat(PersonModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<Person>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);
				}
				else {
					list = (List<Person>)QueryUtil.list(q, getDialect(), start,
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
	 * Removes all the persons from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (Person person : findAll()) {
			remove(person);
		}
	}

	/**
	 * Returns the number of persons.
	 *
	 * @return the number of persons
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_PERSON);

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
	 * Initializes the person persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.GoodReturn.model.Person")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Person>> listenersList = new ArrayList<ModelListener<Person>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Person>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(PersonImpl.class.getName());
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
	private static final String _SQL_SELECT_PERSON = "SELECT person FROM Person person";
	private static final String _SQL_COUNT_PERSON = "SELECT COUNT(person) FROM Person person";
	private static final String _ORDER_BY_ENTITY_ALIAS = "person.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Person exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(PersonPersistenceImpl.class);
	private static Person _nullPerson = new PersonImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Person> toCacheModel() {
				return _nullPersonCacheModel;
			}
		};

	private static CacheModel<Person> _nullPersonCacheModel = new CacheModel<Person>() {
			public Person toEntityModel() {
				return _nullPerson;
			}
		};
}