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
import com.liferay.portal.kernel.dao.jdbc.MappingSqlQuery;
import com.liferay.portal.kernel.dao.jdbc.MappingSqlQueryFactoryUtil;
import com.liferay.portal.kernel.dao.jdbc.RowMapper;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
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

import org.goodreturn.NoSuchPersonException;

import org.goodreturn.model.Person;
import org.goodreturn.model.impl.PersonImpl;
import org.goodreturn.model.impl.PersonModelImpl;

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
	 * @throws org.goodreturn.NoSuchPersonException if a person with the primary key could not be found
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
	 * @throws org.goodreturn.NoSuchPersonException if a person with the primary key could not be found
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
	public Person updateImpl(org.goodreturn.model.Person person, boolean merge)
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
		personImpl.setSalutation(person.getSalutation());
		personImpl.setStatus(person.getStatus());
		personImpl.setPhone_Number(person.getPhone_Number());
		personImpl.setPhoto_URL(person.getPhoto_URL());
		personImpl.setOccupation(person.getOccupation());
		personImpl.setChanged_By(person.getChanged_By());
		personImpl.setChanged_Time(person.getChanged_Time());

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
	 * Returns the person with the primary key or throws a {@link org.goodreturn.NoSuchPersonException} if it could not be found.
	 *
	 * @param abacus_Person_Id the primary key of the person
	 * @return the person
	 * @throws org.goodreturn.NoSuchPersonException if a person with the primary key could not be found
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
	 * Returns all the borrowers associated with the person.
	 *
	 * @param pk the primary key of the person
	 * @return the borrowers associated with the person
	 * @throws SystemException if a system exception occurred
	 */
	public List<org.goodreturn.model.Borrower> getBorrowers(long pk)
		throws SystemException {
		return getBorrowers(pk, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the borrowers associated with the person.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the person
	 * @param start the lower bound of the range of persons
	 * @param end the upper bound of the range of persons (not inclusive)
	 * @return the range of borrowers associated with the person
	 * @throws SystemException if a system exception occurred
	 */
	public List<org.goodreturn.model.Borrower> getBorrowers(long pk, int start,
		int end) throws SystemException {
		return getBorrowers(pk, start, end, null);
	}

	public static final FinderPath FINDER_PATH_GET_BORROWERS = new FinderPath(org.goodreturn.model.impl.BorrowerModelImpl.ENTITY_CACHE_ENABLED,
			org.goodreturn.model.impl.BorrowerModelImpl.FINDER_CACHE_ENABLED,
			org.goodreturn.model.impl.BorrowerImpl.class,
			org.goodreturn.service.persistence.BorrowerPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getBorrowers",
			new String[] {
				Long.class.getName(), "java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});

	static {
		FINDER_PATH_GET_BORROWERS.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns an ordered range of all the borrowers associated with the person.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the person
	 * @param start the lower bound of the range of persons
	 * @param end the upper bound of the range of persons (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of borrowers associated with the person
	 * @throws SystemException if a system exception occurred
	 */
	public List<org.goodreturn.model.Borrower> getBorrowers(long pk, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] { pk, start, end, orderByComparator };

		List<org.goodreturn.model.Borrower> list = (List<org.goodreturn.model.Borrower>)FinderCacheUtil.getResult(FINDER_PATH_GET_BORROWERS,
				finderArgs, this);

		if (list == null) {
			Session session = null;

			try {
				session = openSession();

				String sql = null;

				if (orderByComparator != null) {
					sql = _SQL_GETBORROWERS.concat(ORDER_BY_CLAUSE)
										   .concat(orderByComparator.getOrderBy());
				}
				else {
					sql = _SQL_GETBORROWERS.concat(org.goodreturn.model.impl.BorrowerModelImpl.ORDER_BY_SQL);
				}

				SQLQuery q = session.createSQLQuery(sql);

				q.addEntity("GoodReturn_Borrower",
					org.goodreturn.model.impl.BorrowerImpl.class);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(pk);

				list = (List<org.goodreturn.model.Borrower>)QueryUtil.list(q,
						getDialect(), start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_GET_BORROWERS,
						finderArgs);
				}
				else {
					borrowerPersistence.cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_GET_BORROWERS,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	public static final FinderPath FINDER_PATH_GET_BORROWERS_SIZE = new FinderPath(org.goodreturn.model.impl.BorrowerModelImpl.ENTITY_CACHE_ENABLED,
			org.goodreturn.model.impl.BorrowerModelImpl.FINDER_CACHE_ENABLED,
			org.goodreturn.model.impl.BorrowerImpl.class,
			org.goodreturn.service.persistence.BorrowerPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getBorrowersSize", new String[] { Long.class.getName() });

	static {
		FINDER_PATH_GET_BORROWERS_SIZE.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns the number of borrowers associated with the person.
	 *
	 * @param pk the primary key of the person
	 * @return the number of borrowers associated with the person
	 * @throws SystemException if a system exception occurred
	 */
	public int getBorrowersSize(long pk) throws SystemException {
		Object[] finderArgs = new Object[] { pk };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_GET_BORROWERS_SIZE,
				finderArgs, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				SQLQuery q = session.createSQLQuery(_SQL_GETBORROWERSSIZE);

				q.addScalar(COUNT_COLUMN_NAME,
					com.liferay.portal.kernel.dao.orm.Type.LONG);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(pk);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_GET_BORROWERS_SIZE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	public static final FinderPath FINDER_PATH_CONTAINS_BORROWER = new FinderPath(org.goodreturn.model.impl.BorrowerModelImpl.ENTITY_CACHE_ENABLED,
			org.goodreturn.model.impl.BorrowerModelImpl.FINDER_CACHE_ENABLED,
			org.goodreturn.model.impl.BorrowerImpl.class,
			org.goodreturn.service.persistence.BorrowerPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"containsBorrower",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns <code>true</code> if the borrower is associated with the person.
	 *
	 * @param pk the primary key of the person
	 * @param borrowerPK the primary key of the borrower
	 * @return <code>true</code> if the borrower is associated with the person; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containsBorrower(long pk, long borrowerPK)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk, borrowerPK };

		Boolean value = (Boolean)FinderCacheUtil.getResult(FINDER_PATH_CONTAINS_BORROWER,
				finderArgs, this);

		if (value == null) {
			try {
				value = Boolean.valueOf(containsBorrower.contains(pk, borrowerPK));
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (value == null) {
					value = Boolean.FALSE;
				}

				FinderCacheUtil.putResult(FINDER_PATH_CONTAINS_BORROWER,
					finderArgs, value);
			}
		}

		return value.booleanValue();
	}

	/**
	 * Returns <code>true</code> if the person has any borrowers associated with it.
	 *
	 * @param pk the primary key of the person to check for associations with borrowers
	 * @return <code>true</code> if the person has any borrowers associated with it; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containsBorrowers(long pk) throws SystemException {
		if (getBorrowersSize(pk) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Returns all the lenders associated with the person.
	 *
	 * @param pk the primary key of the person
	 * @return the lenders associated with the person
	 * @throws SystemException if a system exception occurred
	 */
	public List<org.goodreturn.model.Lender> getLenders(long pk)
		throws SystemException {
		return getLenders(pk, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the lenders associated with the person.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the person
	 * @param start the lower bound of the range of persons
	 * @param end the upper bound of the range of persons (not inclusive)
	 * @return the range of lenders associated with the person
	 * @throws SystemException if a system exception occurred
	 */
	public List<org.goodreturn.model.Lender> getLenders(long pk, int start,
		int end) throws SystemException {
		return getLenders(pk, start, end, null);
	}

	public static final FinderPath FINDER_PATH_GET_LENDERS = new FinderPath(org.goodreturn.model.impl.LenderModelImpl.ENTITY_CACHE_ENABLED,
			org.goodreturn.model.impl.LenderModelImpl.FINDER_CACHE_ENABLED,
			org.goodreturn.model.impl.LenderImpl.class,
			org.goodreturn.service.persistence.LenderPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getLenders",
			new String[] {
				Long.class.getName(), "java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});

	static {
		FINDER_PATH_GET_LENDERS.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns an ordered range of all the lenders associated with the person.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param pk the primary key of the person
	 * @param start the lower bound of the range of persons
	 * @param end the upper bound of the range of persons (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of lenders associated with the person
	 * @throws SystemException if a system exception occurred
	 */
	public List<org.goodreturn.model.Lender> getLenders(long pk, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] { pk, start, end, orderByComparator };

		List<org.goodreturn.model.Lender> list = (List<org.goodreturn.model.Lender>)FinderCacheUtil.getResult(FINDER_PATH_GET_LENDERS,
				finderArgs, this);

		if (list == null) {
			Session session = null;

			try {
				session = openSession();

				String sql = null;

				if (orderByComparator != null) {
					sql = _SQL_GETLENDERS.concat(ORDER_BY_CLAUSE)
										 .concat(orderByComparator.getOrderBy());
				}
				else {
					sql = _SQL_GETLENDERS.concat(org.goodreturn.model.impl.LenderModelImpl.ORDER_BY_SQL);
				}

				SQLQuery q = session.createSQLQuery(sql);

				q.addEntity("GoodReturn_Lender",
					org.goodreturn.model.impl.LenderImpl.class);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(pk);

				list = (List<org.goodreturn.model.Lender>)QueryUtil.list(q,
						getDialect(), start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_GET_LENDERS,
						finderArgs);
				}
				else {
					lenderPersistence.cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_GET_LENDERS,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	public static final FinderPath FINDER_PATH_GET_LENDERS_SIZE = new FinderPath(org.goodreturn.model.impl.LenderModelImpl.ENTITY_CACHE_ENABLED,
			org.goodreturn.model.impl.LenderModelImpl.FINDER_CACHE_ENABLED,
			org.goodreturn.model.impl.LenderImpl.class,
			org.goodreturn.service.persistence.LenderPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"getLendersSize", new String[] { Long.class.getName() });

	static {
		FINDER_PATH_GET_LENDERS_SIZE.setCacheKeyGeneratorCacheName(null);
	}

	/**
	 * Returns the number of lenders associated with the person.
	 *
	 * @param pk the primary key of the person
	 * @return the number of lenders associated with the person
	 * @throws SystemException if a system exception occurred
	 */
	public int getLendersSize(long pk) throws SystemException {
		Object[] finderArgs = new Object[] { pk };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_GET_LENDERS_SIZE,
				finderArgs, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				SQLQuery q = session.createSQLQuery(_SQL_GETLENDERSSIZE);

				q.addScalar(COUNT_COLUMN_NAME,
					com.liferay.portal.kernel.dao.orm.Type.LONG);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(pk);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_GET_LENDERS_SIZE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	public static final FinderPath FINDER_PATH_CONTAINS_LENDER = new FinderPath(org.goodreturn.model.impl.LenderModelImpl.ENTITY_CACHE_ENABLED,
			org.goodreturn.model.impl.LenderModelImpl.FINDER_CACHE_ENABLED,
			org.goodreturn.model.impl.LenderImpl.class,
			org.goodreturn.service.persistence.LenderPersistenceImpl.FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"containsLender",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns <code>true</code> if the lender is associated with the person.
	 *
	 * @param pk the primary key of the person
	 * @param lenderPK the primary key of the lender
	 * @return <code>true</code> if the lender is associated with the person; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containsLender(long pk, long lenderPK)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk, lenderPK };

		Boolean value = (Boolean)FinderCacheUtil.getResult(FINDER_PATH_CONTAINS_LENDER,
				finderArgs, this);

		if (value == null) {
			try {
				value = Boolean.valueOf(containsLender.contains(pk, lenderPK));
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (value == null) {
					value = Boolean.FALSE;
				}

				FinderCacheUtil.putResult(FINDER_PATH_CONTAINS_LENDER,
					finderArgs, value);
			}
		}

		return value.booleanValue();
	}

	/**
	 * Returns <code>true</code> if the person has any lenders associated with it.
	 *
	 * @param pk the primary key of the person to check for associations with lenders
	 * @return <code>true</code> if the person has any lenders associated with it; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containsLenders(long pk) throws SystemException {
		if (getLendersSize(pk) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Initializes the person persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.goodreturn.model.Person")));

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

		containsBorrower = new ContainsBorrower();

		containsLender = new ContainsLender();
	}

	public void destroy() {
		EntityCacheUtil.removeCache(PersonImpl.class.getName());
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
	protected ContainsBorrower containsBorrower;
	protected ContainsLender containsLender;

	protected class ContainsBorrower {
		protected ContainsBorrower() {
			_mappingSqlQuery = MappingSqlQueryFactoryUtil.getMappingSqlQuery(getDataSource(),
					_SQL_CONTAINSBORROWER,
					new int[] { java.sql.Types.BIGINT, java.sql.Types.BIGINT },
					RowMapper.COUNT);
		}

		protected boolean contains(long abacus_Person_Id, long borrower_Id) {
			List<Integer> results = _mappingSqlQuery.execute(new Object[] {
						new Long(abacus_Person_Id), new Long(borrower_Id)
					});

			if (results.size() > 0) {
				Integer count = results.get(0);

				if (count.intValue() > 0) {
					return true;
				}
			}

			return false;
		}

		private MappingSqlQuery<Integer> _mappingSqlQuery;
	}

	protected class ContainsLender {
		protected ContainsLender() {
			_mappingSqlQuery = MappingSqlQueryFactoryUtil.getMappingSqlQuery(getDataSource(),
					_SQL_CONTAINSLENDER,
					new int[] { java.sql.Types.BIGINT, java.sql.Types.BIGINT },
					RowMapper.COUNT);
		}

		protected boolean contains(long abacus_Person_Id, long lender_Id) {
			List<Integer> results = _mappingSqlQuery.execute(new Object[] {
						new Long(abacus_Person_Id), new Long(lender_Id)
					});

			if (results.size() > 0) {
				Integer count = results.get(0);

				if (count.intValue() > 0) {
					return true;
				}
			}

			return false;
		}

		private MappingSqlQuery<Integer> _mappingSqlQuery;
	}

	private static final String _SQL_SELECT_PERSON = "SELECT person FROM Person person";
	private static final String _SQL_COUNT_PERSON = "SELECT COUNT(person) FROM Person person";
	private static final String _SQL_GETBORROWERS = "SELECT {GoodReturn_Borrower.*} FROM GoodReturn_Borrower INNER JOIN GoodReturn_Person ON (GoodReturn_Person.abacus_Person_Id = GoodReturn_Borrower.abacus_Person_Id) WHERE (GoodReturn_Person.abacus_Person_Id = ?)";
	private static final String _SQL_GETBORROWERSSIZE = "SELECT COUNT(*) AS COUNT_VALUE FROM GoodReturn_Borrower WHERE abacus_Person_Id = ?";
	private static final String _SQL_CONTAINSBORROWER = "SELECT COUNT(*) AS COUNT_VALUE FROM GoodReturn_Borrower WHERE abacus_Person_Id = ? AND borrower_Id = ?";
	private static final String _SQL_GETLENDERS = "SELECT {GoodReturn_Lender.*} FROM GoodReturn_Lender INNER JOIN GoodReturn_Person ON (GoodReturn_Person.abacus_Person_Id = GoodReturn_Lender.abacus_Person_Id) WHERE (GoodReturn_Person.abacus_Person_Id = ?)";
	private static final String _SQL_GETLENDERSSIZE = "SELECT COUNT(*) AS COUNT_VALUE FROM GoodReturn_Lender WHERE abacus_Person_Id = ?";
	private static final String _SQL_CONTAINSLENDER = "SELECT COUNT(*) AS COUNT_VALUE FROM GoodReturn_Lender WHERE abacus_Person_Id = ? AND lender_Id = ?";
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