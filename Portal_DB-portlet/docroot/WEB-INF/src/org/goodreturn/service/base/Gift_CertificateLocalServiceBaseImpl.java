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

package org.goodreturn.service.base;

import com.liferay.counter.service.CounterLocalService;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.BaseLocalServiceImpl;
import com.liferay.portal.service.PersistedModelLocalServiceRegistryUtil;
import com.liferay.portal.service.ResourceLocalService;
import com.liferay.portal.service.ResourceService;
import com.liferay.portal.service.UserLocalService;
import com.liferay.portal.service.UserService;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;

import org.goodreturn.model.Gift_Certificate;

import org.goodreturn.service.BorrowerLoanLocalService;
import org.goodreturn.service.BorrowerLoanService;
import org.goodreturn.service.BorrowerLocalService;
import org.goodreturn.service.BorrowerService;
import org.goodreturn.service.Gift_CertificateLocalService;
import org.goodreturn.service.Gift_CertificateService;
import org.goodreturn.service.LenderLocalService;
import org.goodreturn.service.LenderService;
import org.goodreturn.service.PersonLocalService;
import org.goodreturn.service.PersonService;
import org.goodreturn.service.StoryLocalService;
import org.goodreturn.service.StoryService;
import org.goodreturn.service.TeamLenderLocalService;
import org.goodreturn.service.TeamLenderService;
import org.goodreturn.service.TeamLocalService;
import org.goodreturn.service.TeamService;
import org.goodreturn.service.TempBlLocalService;
import org.goodreturn.service.TempBlService;
import org.goodreturn.service.persistence.BorrowerLoanPersistence;
import org.goodreturn.service.persistence.BorrowerPersistence;
import org.goodreturn.service.persistence.Gift_CertificatePersistence;
import org.goodreturn.service.persistence.LenderPersistence;
import org.goodreturn.service.persistence.PersonPersistence;
import org.goodreturn.service.persistence.StoryPersistence;
import org.goodreturn.service.persistence.TeamLenderPersistence;
import org.goodreturn.service.persistence.TeamPersistence;
import org.goodreturn.service.persistence.TempBlPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * The base implementation of the gift_ certificate local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link org.goodreturn.service.impl.Gift_CertificateLocalServiceImpl}.
 * </p>
 *
 * @author gilaa004
 * @see org.goodreturn.service.impl.Gift_CertificateLocalServiceImpl
 * @see org.goodreturn.service.Gift_CertificateLocalServiceUtil
 * @generated
 */
public abstract class Gift_CertificateLocalServiceBaseImpl
	extends BaseLocalServiceImpl implements Gift_CertificateLocalService,
		IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link org.goodreturn.service.Gift_CertificateLocalServiceUtil} to access the gift_ certificate local service.
	 */

	/**
	 * Adds the gift_ certificate to the database. Also notifies the appropriate model listeners.
	 *
	 * @param gift_Certificate the gift_ certificate
	 * @return the gift_ certificate that was added
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	public Gift_Certificate addGift_Certificate(
		Gift_Certificate gift_Certificate) throws SystemException {
		gift_Certificate.setNew(true);

		return gift_CertificatePersistence.update(gift_Certificate, false);
	}

	/**
	 * Creates a new gift_ certificate with the primary key. Does not add the gift_ certificate to the database.
	 *
	 * @param certificate_Id the primary key for the new gift_ certificate
	 * @return the new gift_ certificate
	 */
	public Gift_Certificate createGift_Certificate(long certificate_Id) {
		return gift_CertificatePersistence.create(certificate_Id);
	}

	/**
	 * Deletes the gift_ certificate with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param certificate_Id the primary key of the gift_ certificate
	 * @return the gift_ certificate that was removed
	 * @throws PortalException if a gift_ certificate with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	public Gift_Certificate deleteGift_Certificate(long certificate_Id)
		throws PortalException, SystemException {
		return gift_CertificatePersistence.remove(certificate_Id);
	}

	/**
	 * Deletes the gift_ certificate from the database. Also notifies the appropriate model listeners.
	 *
	 * @param gift_Certificate the gift_ certificate
	 * @return the gift_ certificate that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	public Gift_Certificate deleteGift_Certificate(
		Gift_Certificate gift_Certificate) throws SystemException {
		return gift_CertificatePersistence.remove(gift_Certificate);
	}

	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(Gift_Certificate.class,
			clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return gift_CertificatePersistence.findWithDynamicQuery(dynamicQuery);
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
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return gift_CertificatePersistence.findWithDynamicQuery(dynamicQuery,
			start, end);
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
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return gift_CertificatePersistence.findWithDynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows that match the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows that match the dynamic query
	 * @throws SystemException if a system exception occurred
	 */
	public long dynamicQueryCount(DynamicQuery dynamicQuery)
		throws SystemException {
		return gift_CertificatePersistence.countWithDynamicQuery(dynamicQuery);
	}

	public Gift_Certificate fetchGift_Certificate(long certificate_Id)
		throws SystemException {
		return gift_CertificatePersistence.fetchByPrimaryKey(certificate_Id);
	}

	/**
	 * Returns the gift_ certificate with the primary key.
	 *
	 * @param certificate_Id the primary key of the gift_ certificate
	 * @return the gift_ certificate
	 * @throws PortalException if a gift_ certificate with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Gift_Certificate getGift_Certificate(long certificate_Id)
		throws PortalException, SystemException {
		return gift_CertificatePersistence.findByPrimaryKey(certificate_Id);
	}

	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException, SystemException {
		return gift_CertificatePersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the gift_ certificates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of gift_ certificates
	 * @param end the upper bound of the range of gift_ certificates (not inclusive)
	 * @return the range of gift_ certificates
	 * @throws SystemException if a system exception occurred
	 */
	public List<Gift_Certificate> getGift_Certificates(int start, int end)
		throws SystemException {
		return gift_CertificatePersistence.findAll(start, end);
	}

	/**
	 * Returns the number of gift_ certificates.
	 *
	 * @return the number of gift_ certificates
	 * @throws SystemException if a system exception occurred
	 */
	public int getGift_CertificatesCount() throws SystemException {
		return gift_CertificatePersistence.countAll();
	}

	/**
	 * Updates the gift_ certificate in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param gift_Certificate the gift_ certificate
	 * @return the gift_ certificate that was updated
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	public Gift_Certificate updateGift_Certificate(
		Gift_Certificate gift_Certificate) throws SystemException {
		return updateGift_Certificate(gift_Certificate, true);
	}

	/**
	 * Updates the gift_ certificate in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param gift_Certificate the gift_ certificate
	 * @param merge whether to merge the gift_ certificate with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	 * @return the gift_ certificate that was updated
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	public Gift_Certificate updateGift_Certificate(
		Gift_Certificate gift_Certificate, boolean merge)
		throws SystemException {
		gift_Certificate.setNew(false);

		return gift_CertificatePersistence.update(gift_Certificate, merge);
	}

	/**
	 * Returns the borrower local service.
	 *
	 * @return the borrower local service
	 */
	public BorrowerLocalService getBorrowerLocalService() {
		return borrowerLocalService;
	}

	/**
	 * Sets the borrower local service.
	 *
	 * @param borrowerLocalService the borrower local service
	 */
	public void setBorrowerLocalService(
		BorrowerLocalService borrowerLocalService) {
		this.borrowerLocalService = borrowerLocalService;
	}

	/**
	 * Returns the borrower remote service.
	 *
	 * @return the borrower remote service
	 */
	public BorrowerService getBorrowerService() {
		return borrowerService;
	}

	/**
	 * Sets the borrower remote service.
	 *
	 * @param borrowerService the borrower remote service
	 */
	public void setBorrowerService(BorrowerService borrowerService) {
		this.borrowerService = borrowerService;
	}

	/**
	 * Returns the borrower persistence.
	 *
	 * @return the borrower persistence
	 */
	public BorrowerPersistence getBorrowerPersistence() {
		return borrowerPersistence;
	}

	/**
	 * Sets the borrower persistence.
	 *
	 * @param borrowerPersistence the borrower persistence
	 */
	public void setBorrowerPersistence(BorrowerPersistence borrowerPersistence) {
		this.borrowerPersistence = borrowerPersistence;
	}

	/**
	 * Returns the borrower loan local service.
	 *
	 * @return the borrower loan local service
	 */
	public BorrowerLoanLocalService getBorrowerLoanLocalService() {
		return borrowerLoanLocalService;
	}

	/**
	 * Sets the borrower loan local service.
	 *
	 * @param borrowerLoanLocalService the borrower loan local service
	 */
	public void setBorrowerLoanLocalService(
		BorrowerLoanLocalService borrowerLoanLocalService) {
		this.borrowerLoanLocalService = borrowerLoanLocalService;
	}

	/**
	 * Returns the borrower loan remote service.
	 *
	 * @return the borrower loan remote service
	 */
	public BorrowerLoanService getBorrowerLoanService() {
		return borrowerLoanService;
	}

	/**
	 * Sets the borrower loan remote service.
	 *
	 * @param borrowerLoanService the borrower loan remote service
	 */
	public void setBorrowerLoanService(BorrowerLoanService borrowerLoanService) {
		this.borrowerLoanService = borrowerLoanService;
	}

	/**
	 * Returns the borrower loan persistence.
	 *
	 * @return the borrower loan persistence
	 */
	public BorrowerLoanPersistence getBorrowerLoanPersistence() {
		return borrowerLoanPersistence;
	}

	/**
	 * Sets the borrower loan persistence.
	 *
	 * @param borrowerLoanPersistence the borrower loan persistence
	 */
	public void setBorrowerLoanPersistence(
		BorrowerLoanPersistence borrowerLoanPersistence) {
		this.borrowerLoanPersistence = borrowerLoanPersistence;
	}

	/**
	 * Returns the gift_ certificate local service.
	 *
	 * @return the gift_ certificate local service
	 */
	public Gift_CertificateLocalService getGift_CertificateLocalService() {
		return gift_CertificateLocalService;
	}

	/**
	 * Sets the gift_ certificate local service.
	 *
	 * @param gift_CertificateLocalService the gift_ certificate local service
	 */
	public void setGift_CertificateLocalService(
		Gift_CertificateLocalService gift_CertificateLocalService) {
		this.gift_CertificateLocalService = gift_CertificateLocalService;
	}

	/**
	 * Returns the gift_ certificate remote service.
	 *
	 * @return the gift_ certificate remote service
	 */
	public Gift_CertificateService getGift_CertificateService() {
		return gift_CertificateService;
	}

	/**
	 * Sets the gift_ certificate remote service.
	 *
	 * @param gift_CertificateService the gift_ certificate remote service
	 */
	public void setGift_CertificateService(
		Gift_CertificateService gift_CertificateService) {
		this.gift_CertificateService = gift_CertificateService;
	}

	/**
	 * Returns the gift_ certificate persistence.
	 *
	 * @return the gift_ certificate persistence
	 */
	public Gift_CertificatePersistence getGift_CertificatePersistence() {
		return gift_CertificatePersistence;
	}

	/**
	 * Sets the gift_ certificate persistence.
	 *
	 * @param gift_CertificatePersistence the gift_ certificate persistence
	 */
	public void setGift_CertificatePersistence(
		Gift_CertificatePersistence gift_CertificatePersistence) {
		this.gift_CertificatePersistence = gift_CertificatePersistence;
	}

	/**
	 * Returns the lender local service.
	 *
	 * @return the lender local service
	 */
	public LenderLocalService getLenderLocalService() {
		return lenderLocalService;
	}

	/**
	 * Sets the lender local service.
	 *
	 * @param lenderLocalService the lender local service
	 */
	public void setLenderLocalService(LenderLocalService lenderLocalService) {
		this.lenderLocalService = lenderLocalService;
	}

	/**
	 * Returns the lender remote service.
	 *
	 * @return the lender remote service
	 */
	public LenderService getLenderService() {
		return lenderService;
	}

	/**
	 * Sets the lender remote service.
	 *
	 * @param lenderService the lender remote service
	 */
	public void setLenderService(LenderService lenderService) {
		this.lenderService = lenderService;
	}

	/**
	 * Returns the lender persistence.
	 *
	 * @return the lender persistence
	 */
	public LenderPersistence getLenderPersistence() {
		return lenderPersistence;
	}

	/**
	 * Sets the lender persistence.
	 *
	 * @param lenderPersistence the lender persistence
	 */
	public void setLenderPersistence(LenderPersistence lenderPersistence) {
		this.lenderPersistence = lenderPersistence;
	}

	/**
	 * Returns the person local service.
	 *
	 * @return the person local service
	 */
	public PersonLocalService getPersonLocalService() {
		return personLocalService;
	}

	/**
	 * Sets the person local service.
	 *
	 * @param personLocalService the person local service
	 */
	public void setPersonLocalService(PersonLocalService personLocalService) {
		this.personLocalService = personLocalService;
	}

	/**
	 * Returns the person remote service.
	 *
	 * @return the person remote service
	 */
	public PersonService getPersonService() {
		return personService;
	}

	/**
	 * Sets the person remote service.
	 *
	 * @param personService the person remote service
	 */
	public void setPersonService(PersonService personService) {
		this.personService = personService;
	}

	/**
	 * Returns the person persistence.
	 *
	 * @return the person persistence
	 */
	public PersonPersistence getPersonPersistence() {
		return personPersistence;
	}

	/**
	 * Sets the person persistence.
	 *
	 * @param personPersistence the person persistence
	 */
	public void setPersonPersistence(PersonPersistence personPersistence) {
		this.personPersistence = personPersistence;
	}

	/**
	 * Returns the story local service.
	 *
	 * @return the story local service
	 */
	public StoryLocalService getStoryLocalService() {
		return storyLocalService;
	}

	/**
	 * Sets the story local service.
	 *
	 * @param storyLocalService the story local service
	 */
	public void setStoryLocalService(StoryLocalService storyLocalService) {
		this.storyLocalService = storyLocalService;
	}

	/**
	 * Returns the story remote service.
	 *
	 * @return the story remote service
	 */
	public StoryService getStoryService() {
		return storyService;
	}

	/**
	 * Sets the story remote service.
	 *
	 * @param storyService the story remote service
	 */
	public void setStoryService(StoryService storyService) {
		this.storyService = storyService;
	}

	/**
	 * Returns the story persistence.
	 *
	 * @return the story persistence
	 */
	public StoryPersistence getStoryPersistence() {
		return storyPersistence;
	}

	/**
	 * Sets the story persistence.
	 *
	 * @param storyPersistence the story persistence
	 */
	public void setStoryPersistence(StoryPersistence storyPersistence) {
		this.storyPersistence = storyPersistence;
	}

	/**
	 * Returns the team local service.
	 *
	 * @return the team local service
	 */
	public TeamLocalService getTeamLocalService() {
		return teamLocalService;
	}

	/**
	 * Sets the team local service.
	 *
	 * @param teamLocalService the team local service
	 */
	public void setTeamLocalService(TeamLocalService teamLocalService) {
		this.teamLocalService = teamLocalService;
	}

	/**
	 * Returns the team remote service.
	 *
	 * @return the team remote service
	 */
	public TeamService getTeamService() {
		return teamService;
	}

	/**
	 * Sets the team remote service.
	 *
	 * @param teamService the team remote service
	 */
	public void setTeamService(TeamService teamService) {
		this.teamService = teamService;
	}

	/**
	 * Returns the team persistence.
	 *
	 * @return the team persistence
	 */
	public TeamPersistence getTeamPersistence() {
		return teamPersistence;
	}

	/**
	 * Sets the team persistence.
	 *
	 * @param teamPersistence the team persistence
	 */
	public void setTeamPersistence(TeamPersistence teamPersistence) {
		this.teamPersistence = teamPersistence;
	}

	/**
	 * Returns the team lender local service.
	 *
	 * @return the team lender local service
	 */
	public TeamLenderLocalService getTeamLenderLocalService() {
		return teamLenderLocalService;
	}

	/**
	 * Sets the team lender local service.
	 *
	 * @param teamLenderLocalService the team lender local service
	 */
	public void setTeamLenderLocalService(
		TeamLenderLocalService teamLenderLocalService) {
		this.teamLenderLocalService = teamLenderLocalService;
	}

	/**
	 * Returns the team lender remote service.
	 *
	 * @return the team lender remote service
	 */
	public TeamLenderService getTeamLenderService() {
		return teamLenderService;
	}

	/**
	 * Sets the team lender remote service.
	 *
	 * @param teamLenderService the team lender remote service
	 */
	public void setTeamLenderService(TeamLenderService teamLenderService) {
		this.teamLenderService = teamLenderService;
	}

	/**
	 * Returns the team lender persistence.
	 *
	 * @return the team lender persistence
	 */
	public TeamLenderPersistence getTeamLenderPersistence() {
		return teamLenderPersistence;
	}

	/**
	 * Sets the team lender persistence.
	 *
	 * @param teamLenderPersistence the team lender persistence
	 */
	public void setTeamLenderPersistence(
		TeamLenderPersistence teamLenderPersistence) {
		this.teamLenderPersistence = teamLenderPersistence;
	}

	/**
	 * Returns the temp bl local service.
	 *
	 * @return the temp bl local service
	 */
	public TempBlLocalService getTempBlLocalService() {
		return tempBlLocalService;
	}

	/**
	 * Sets the temp bl local service.
	 *
	 * @param tempBlLocalService the temp bl local service
	 */
	public void setTempBlLocalService(TempBlLocalService tempBlLocalService) {
		this.tempBlLocalService = tempBlLocalService;
	}

	/**
	 * Returns the temp bl remote service.
	 *
	 * @return the temp bl remote service
	 */
	public TempBlService getTempBlService() {
		return tempBlService;
	}

	/**
	 * Sets the temp bl remote service.
	 *
	 * @param tempBlService the temp bl remote service
	 */
	public void setTempBlService(TempBlService tempBlService) {
		this.tempBlService = tempBlService;
	}

	/**
	 * Returns the temp bl persistence.
	 *
	 * @return the temp bl persistence
	 */
	public TempBlPersistence getTempBlPersistence() {
		return tempBlPersistence;
	}

	/**
	 * Sets the temp bl persistence.
	 *
	 * @param tempBlPersistence the temp bl persistence
	 */
	public void setTempBlPersistence(TempBlPersistence tempBlPersistence) {
		this.tempBlPersistence = tempBlPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the resource remote service.
	 *
	 * @return the resource remote service
	 */
	public ResourceService getResourceService() {
		return resourceService;
	}

	/**
	 * Sets the resource remote service.
	 *
	 * @param resourceService the resource remote service
	 */
	public void setResourceService(ResourceService resourceService) {
		this.resourceService = resourceService;
	}

	/**
	 * Returns the resource persistence.
	 *
	 * @return the resource persistence
	 */
	public ResourcePersistence getResourcePersistence() {
		return resourcePersistence;
	}

	/**
	 * Sets the resource persistence.
	 *
	 * @param resourcePersistence the resource persistence
	 */
	public void setResourcePersistence(ResourcePersistence resourcePersistence) {
		this.resourcePersistence = resourcePersistence;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		PersistedModelLocalServiceRegistryUtil.register("org.goodreturn.model.Gift_Certificate",
			gift_CertificateLocalService);
	}

	public void destroy() {
		PersistedModelLocalServiceRegistryUtil.unregister(
			"org.goodreturn.model.Gift_Certificate");
	}

	/**
	 * Returns the Spring bean ID for this bean.
	 *
	 * @return the Spring bean ID for this bean
	 */
	public String getBeanIdentifier() {
		return _beanIdentifier;
	}

	/**
	 * Sets the Spring bean ID for this bean.
	 *
	 * @param beanIdentifier the Spring bean ID for this bean
	 */
	public void setBeanIdentifier(String beanIdentifier) {
		_beanIdentifier = beanIdentifier;
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
	}

	protected Class<?> getModelClass() {
		return Gift_Certificate.class;
	}

	protected String getModelClassName() {
		return Gift_Certificate.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = gift_CertificatePersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = BorrowerLocalService.class)
	protected BorrowerLocalService borrowerLocalService;
	@BeanReference(type = BorrowerService.class)
	protected BorrowerService borrowerService;
	@BeanReference(type = BorrowerPersistence.class)
	protected BorrowerPersistence borrowerPersistence;
	@BeanReference(type = BorrowerLoanLocalService.class)
	protected BorrowerLoanLocalService borrowerLoanLocalService;
	@BeanReference(type = BorrowerLoanService.class)
	protected BorrowerLoanService borrowerLoanService;
	@BeanReference(type = BorrowerLoanPersistence.class)
	protected BorrowerLoanPersistence borrowerLoanPersistence;
	@BeanReference(type = Gift_CertificateLocalService.class)
	protected Gift_CertificateLocalService gift_CertificateLocalService;
	@BeanReference(type = Gift_CertificateService.class)
	protected Gift_CertificateService gift_CertificateService;
	@BeanReference(type = Gift_CertificatePersistence.class)
	protected Gift_CertificatePersistence gift_CertificatePersistence;
	@BeanReference(type = LenderLocalService.class)
	protected LenderLocalService lenderLocalService;
	@BeanReference(type = LenderService.class)
	protected LenderService lenderService;
	@BeanReference(type = LenderPersistence.class)
	protected LenderPersistence lenderPersistence;
	@BeanReference(type = PersonLocalService.class)
	protected PersonLocalService personLocalService;
	@BeanReference(type = PersonService.class)
	protected PersonService personService;
	@BeanReference(type = PersonPersistence.class)
	protected PersonPersistence personPersistence;
	@BeanReference(type = StoryLocalService.class)
	protected StoryLocalService storyLocalService;
	@BeanReference(type = StoryService.class)
	protected StoryService storyService;
	@BeanReference(type = StoryPersistence.class)
	protected StoryPersistence storyPersistence;
	@BeanReference(type = TeamLocalService.class)
	protected TeamLocalService teamLocalService;
	@BeanReference(type = TeamService.class)
	protected TeamService teamService;
	@BeanReference(type = TeamPersistence.class)
	protected TeamPersistence teamPersistence;
	@BeanReference(type = TeamLenderLocalService.class)
	protected TeamLenderLocalService teamLenderLocalService;
	@BeanReference(type = TeamLenderService.class)
	protected TeamLenderService teamLenderService;
	@BeanReference(type = TeamLenderPersistence.class)
	protected TeamLenderPersistence teamLenderPersistence;
	@BeanReference(type = TempBlLocalService.class)
	protected TempBlLocalService tempBlLocalService;
	@BeanReference(type = TempBlService.class)
	protected TempBlService tempBlService;
	@BeanReference(type = TempBlPersistence.class)
	protected TempBlPersistence tempBlPersistence;
	@BeanReference(type = CounterLocalService.class)
	protected CounterLocalService counterLocalService;
	@BeanReference(type = ResourceLocalService.class)
	protected ResourceLocalService resourceLocalService;
	@BeanReference(type = ResourceService.class)
	protected ResourceService resourceService;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserLocalService.class)
	protected UserLocalService userLocalService;
	@BeanReference(type = UserService.class)
	protected UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private String _beanIdentifier;
	private Gift_CertificateLocalServiceClpInvoker _clpInvoker = new Gift_CertificateLocalServiceClpInvoker();
}