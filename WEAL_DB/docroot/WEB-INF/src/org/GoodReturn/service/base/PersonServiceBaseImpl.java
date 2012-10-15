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

package org.GoodReturn.service.base;

import com.liferay.counter.service.CounterLocalService;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.BaseServiceImpl;
import com.liferay.portal.service.ResourceLocalService;
import com.liferay.portal.service.ResourceService;
import com.liferay.portal.service.UserLocalService;
import com.liferay.portal.service.UserService;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;

import org.GoodReturn.model.Person;

import org.GoodReturn.service.BorrowerLocalService;
import org.GoodReturn.service.BorrowerService;
import org.GoodReturn.service.Gift_CertificateLocalService;
import org.GoodReturn.service.Gift_CertificateService;
import org.GoodReturn.service.LenderLocalService;
import org.GoodReturn.service.LenderService;
import org.GoodReturn.service.PersonLocalService;
import org.GoodReturn.service.PersonService;
import org.GoodReturn.service.StoryLocalService;
import org.GoodReturn.service.StoryService;
import org.GoodReturn.service.Supplementary_TableLocalService;
import org.GoodReturn.service.Supplementary_TableService;
import org.GoodReturn.service.TeamLenderLoanLocalService;
import org.GoodReturn.service.TeamLenderLoanService;
import org.GoodReturn.service.TeamLenderLocalService;
import org.GoodReturn.service.TeamLenderService;
import org.GoodReturn.service.TeamLocalService;
import org.GoodReturn.service.TeamService;
import org.GoodReturn.service.persistence.BorrowerPersistence;
import org.GoodReturn.service.persistence.Gift_CertificatePersistence;
import org.GoodReturn.service.persistence.LenderPersistence;
import org.GoodReturn.service.persistence.PersonPersistence;
import org.GoodReturn.service.persistence.StoryPersistence;
import org.GoodReturn.service.persistence.Supplementary_TablePersistence;
import org.GoodReturn.service.persistence.TeamLenderLoanPersistence;
import org.GoodReturn.service.persistence.TeamLenderPersistence;
import org.GoodReturn.service.persistence.TeamPersistence;

import javax.sql.DataSource;

/**
 * The base implementation of the person remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link org.GoodReturn.service.impl.PersonServiceImpl}.
 * </p>
 *
 * @author gilaa004
 * @see org.GoodReturn.service.impl.PersonServiceImpl
 * @see org.GoodReturn.service.PersonServiceUtil
 * @generated
 */
public abstract class PersonServiceBaseImpl extends BaseServiceImpl
	implements PersonService, IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link org.GoodReturn.service.PersonServiceUtil} to access the person remote service.
	 */

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
	 * Returns the supplementary_ table local service.
	 *
	 * @return the supplementary_ table local service
	 */
	public Supplementary_TableLocalService getSupplementary_TableLocalService() {
		return supplementary_TableLocalService;
	}

	/**
	 * Sets the supplementary_ table local service.
	 *
	 * @param supplementary_TableLocalService the supplementary_ table local service
	 */
	public void setSupplementary_TableLocalService(
		Supplementary_TableLocalService supplementary_TableLocalService) {
		this.supplementary_TableLocalService = supplementary_TableLocalService;
	}

	/**
	 * Returns the supplementary_ table remote service.
	 *
	 * @return the supplementary_ table remote service
	 */
	public Supplementary_TableService getSupplementary_TableService() {
		return supplementary_TableService;
	}

	/**
	 * Sets the supplementary_ table remote service.
	 *
	 * @param supplementary_TableService the supplementary_ table remote service
	 */
	public void setSupplementary_TableService(
		Supplementary_TableService supplementary_TableService) {
		this.supplementary_TableService = supplementary_TableService;
	}

	/**
	 * Returns the supplementary_ table persistence.
	 *
	 * @return the supplementary_ table persistence
	 */
	public Supplementary_TablePersistence getSupplementary_TablePersistence() {
		return supplementary_TablePersistence;
	}

	/**
	 * Sets the supplementary_ table persistence.
	 *
	 * @param supplementary_TablePersistence the supplementary_ table persistence
	 */
	public void setSupplementary_TablePersistence(
		Supplementary_TablePersistence supplementary_TablePersistence) {
		this.supplementary_TablePersistence = supplementary_TablePersistence;
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
	 * Returns the team lender loan local service.
	 *
	 * @return the team lender loan local service
	 */
	public TeamLenderLoanLocalService getTeamLenderLoanLocalService() {
		return teamLenderLoanLocalService;
	}

	/**
	 * Sets the team lender loan local service.
	 *
	 * @param teamLenderLoanLocalService the team lender loan local service
	 */
	public void setTeamLenderLoanLocalService(
		TeamLenderLoanLocalService teamLenderLoanLocalService) {
		this.teamLenderLoanLocalService = teamLenderLoanLocalService;
	}

	/**
	 * Returns the team lender loan remote service.
	 *
	 * @return the team lender loan remote service
	 */
	public TeamLenderLoanService getTeamLenderLoanService() {
		return teamLenderLoanService;
	}

	/**
	 * Sets the team lender loan remote service.
	 *
	 * @param teamLenderLoanService the team lender loan remote service
	 */
	public void setTeamLenderLoanService(
		TeamLenderLoanService teamLenderLoanService) {
		this.teamLenderLoanService = teamLenderLoanService;
	}

	/**
	 * Returns the team lender loan persistence.
	 *
	 * @return the team lender loan persistence
	 */
	public TeamLenderLoanPersistence getTeamLenderLoanPersistence() {
		return teamLenderLoanPersistence;
	}

	/**
	 * Sets the team lender loan persistence.
	 *
	 * @param teamLenderLoanPersistence the team lender loan persistence
	 */
	public void setTeamLenderLoanPersistence(
		TeamLenderLoanPersistence teamLenderLoanPersistence) {
		this.teamLenderLoanPersistence = teamLenderLoanPersistence;
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
	}

	public void destroy() {
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
		return Person.class;
	}

	protected String getModelClassName() {
		return Person.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = personPersistence.getDataSource();

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
	@BeanReference(type = Supplementary_TableLocalService.class)
	protected Supplementary_TableLocalService supplementary_TableLocalService;
	@BeanReference(type = Supplementary_TableService.class)
	protected Supplementary_TableService supplementary_TableService;
	@BeanReference(type = Supplementary_TablePersistence.class)
	protected Supplementary_TablePersistence supplementary_TablePersistence;
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
	@BeanReference(type = TeamLenderLoanLocalService.class)
	protected TeamLenderLoanLocalService teamLenderLoanLocalService;
	@BeanReference(type = TeamLenderLoanService.class)
	protected TeamLenderLoanService teamLenderLoanService;
	@BeanReference(type = TeamLenderLoanPersistence.class)
	protected TeamLenderLoanPersistence teamLenderLoanPersistence;
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
	private PersonServiceClpInvoker _clpInvoker = new PersonServiceClpInvoker();
}