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

package org.goodreturn.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link PersonLocalService}.
 * </p>
 *
 * @author    gilaa004
 * @see       PersonLocalService
 * @generated
 */
public class PersonLocalServiceWrapper implements PersonLocalService,
	ServiceWrapper<PersonLocalService> {
	public PersonLocalServiceWrapper(PersonLocalService personLocalService) {
		_personLocalService = personLocalService;
	}

	/**
	* Adds the person to the database. Also notifies the appropriate model listeners.
	*
	* @param person the person
	* @return the person that was added
	* @throws SystemException if a system exception occurred
	*/
	public org.goodreturn.model.Person addPerson(
		org.goodreturn.model.Person person)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _personLocalService.addPerson(person);
	}

	/**
	* Creates a new person with the primary key. Does not add the person to the database.
	*
	* @param abacus_Person_Id the primary key for the new person
	* @return the new person
	*/
	public org.goodreturn.model.Person createPerson(long abacus_Person_Id) {
		return _personLocalService.createPerson(abacus_Person_Id);
	}

	/**
	* Deletes the person with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param abacus_Person_Id the primary key of the person
	* @return the person that was removed
	* @throws PortalException if a person with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.goodreturn.model.Person deletePerson(long abacus_Person_Id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _personLocalService.deletePerson(abacus_Person_Id);
	}

	/**
	* Deletes the person from the database. Also notifies the appropriate model listeners.
	*
	* @param person the person
	* @return the person that was removed
	* @throws SystemException if a system exception occurred
	*/
	public org.goodreturn.model.Person deletePerson(
		org.goodreturn.model.Person person)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _personLocalService.deletePerson(person);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _personLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _personLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _personLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _personLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _personLocalService.dynamicQueryCount(dynamicQuery);
	}

	public org.goodreturn.model.Person fetchPerson(long abacus_Person_Id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _personLocalService.fetchPerson(abacus_Person_Id);
	}

	/**
	* Returns the person with the primary key.
	*
	* @param abacus_Person_Id the primary key of the person
	* @return the person
	* @throws PortalException if a person with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.goodreturn.model.Person getPerson(long abacus_Person_Id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _personLocalService.getPerson(abacus_Person_Id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _personLocalService.getPersistedModel(primaryKeyObj);
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
	public java.util.List<org.goodreturn.model.Person> getPersons(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _personLocalService.getPersons(start, end);
	}

	/**
	* Returns the number of persons.
	*
	* @return the number of persons
	* @throws SystemException if a system exception occurred
	*/
	public int getPersonsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _personLocalService.getPersonsCount();
	}

	/**
	* Updates the person in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param person the person
	* @return the person that was updated
	* @throws SystemException if a system exception occurred
	*/
	public org.goodreturn.model.Person updatePerson(
		org.goodreturn.model.Person person)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _personLocalService.updatePerson(person);
	}

	/**
	* Updates the person in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param person the person
	* @param merge whether to merge the person with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the person that was updated
	* @throws SystemException if a system exception occurred
	*/
	public org.goodreturn.model.Person updatePerson(
		org.goodreturn.model.Person person, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _personLocalService.updatePerson(person, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _personLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_personLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _personLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public PersonLocalService getWrappedPersonLocalService() {
		return _personLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedPersonLocalService(
		PersonLocalService personLocalService) {
		_personLocalService = personLocalService;
	}

	public PersonLocalService getWrappedService() {
		return _personLocalService;
	}

	public void setWrappedService(PersonLocalService personLocalService) {
		_personLocalService = personLocalService;
	}

	private PersonLocalService _personLocalService;
}