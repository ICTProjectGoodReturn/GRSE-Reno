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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import org.goodreturn.model.Gift_Certificate;

import java.util.List;

/**
 * The persistence utility for the gift_ certificate service. This utility wraps {@link Gift_CertificatePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author gilaa004
 * @see Gift_CertificatePersistence
 * @see Gift_CertificatePersistenceImpl
 * @generated
 */
public class Gift_CertificateUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(Gift_Certificate gift_Certificate) {
		getPersistence().clearCache(gift_Certificate);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Gift_Certificate> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Gift_Certificate> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Gift_Certificate> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static Gift_Certificate update(Gift_Certificate gift_Certificate,
		boolean merge) throws SystemException {
		return getPersistence().update(gift_Certificate, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static Gift_Certificate update(Gift_Certificate gift_Certificate,
		boolean merge, ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(gift_Certificate, merge, serviceContext);
	}

	/**
	* Caches the gift_ certificate in the entity cache if it is enabled.
	*
	* @param gift_Certificate the gift_ certificate
	*/
	public static void cacheResult(
		org.goodreturn.model.Gift_Certificate gift_Certificate) {
		getPersistence().cacheResult(gift_Certificate);
	}

	/**
	* Caches the gift_ certificates in the entity cache if it is enabled.
	*
	* @param gift_Certificates the gift_ certificates
	*/
	public static void cacheResult(
		java.util.List<org.goodreturn.model.Gift_Certificate> gift_Certificates) {
		getPersistence().cacheResult(gift_Certificates);
	}

	/**
	* Creates a new gift_ certificate with the primary key. Does not add the gift_ certificate to the database.
	*
	* @param certificate_Id the primary key for the new gift_ certificate
	* @return the new gift_ certificate
	*/
	public static org.goodreturn.model.Gift_Certificate create(
		long certificate_Id) {
		return getPersistence().create(certificate_Id);
	}

	/**
	* Removes the gift_ certificate with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param certificate_Id the primary key of the gift_ certificate
	* @return the gift_ certificate that was removed
	* @throws org.goodreturn.NoSuchGift_CertificateException if a gift_ certificate with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.goodreturn.model.Gift_Certificate remove(
		long certificate_Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.goodreturn.NoSuchGift_CertificateException {
		return getPersistence().remove(certificate_Id);
	}

	public static org.goodreturn.model.Gift_Certificate updateImpl(
		org.goodreturn.model.Gift_Certificate gift_Certificate, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(gift_Certificate, merge);
	}

	/**
	* Returns the gift_ certificate with the primary key or throws a {@link org.goodreturn.NoSuchGift_CertificateException} if it could not be found.
	*
	* @param certificate_Id the primary key of the gift_ certificate
	* @return the gift_ certificate
	* @throws org.goodreturn.NoSuchGift_CertificateException if a gift_ certificate with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.goodreturn.model.Gift_Certificate findByPrimaryKey(
		long certificate_Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.goodreturn.NoSuchGift_CertificateException {
		return getPersistence().findByPrimaryKey(certificate_Id);
	}

	/**
	* Returns the gift_ certificate with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param certificate_Id the primary key of the gift_ certificate
	* @return the gift_ certificate, or <code>null</code> if a gift_ certificate with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.goodreturn.model.Gift_Certificate fetchByPrimaryKey(
		long certificate_Id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(certificate_Id);
	}

	/**
	* Returns all the gift_ certificates.
	*
	* @return the gift_ certificates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.goodreturn.model.Gift_Certificate> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<org.goodreturn.model.Gift_Certificate> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the gift_ certificates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of gift_ certificates
	* @param end the upper bound of the range of gift_ certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of gift_ certificates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.goodreturn.model.Gift_Certificate> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the gift_ certificates from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of gift_ certificates.
	*
	* @return the number of gift_ certificates
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	/**
	* Returns all the lenders associated with the gift_ certificate.
	*
	* @param pk the primary key of the gift_ certificate
	* @return the lenders associated with the gift_ certificate
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.goodreturn.model.Lender> getLenders(
		long pk) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getLenders(pk);
	}

	/**
	* Returns a range of all the lenders associated with the gift_ certificate.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the gift_ certificate
	* @param start the lower bound of the range of gift_ certificates
	* @param end the upper bound of the range of gift_ certificates (not inclusive)
	* @return the range of lenders associated with the gift_ certificate
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.goodreturn.model.Lender> getLenders(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getLenders(pk, start, end);
	}

	/**
	* Returns an ordered range of all the lenders associated with the gift_ certificate.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the gift_ certificate
	* @param start the lower bound of the range of gift_ certificates
	* @param end the upper bound of the range of gift_ certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of lenders associated with the gift_ certificate
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.goodreturn.model.Lender> getLenders(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getLenders(pk, start, end, orderByComparator);
	}

	/**
	* Returns the number of lenders associated with the gift_ certificate.
	*
	* @param pk the primary key of the gift_ certificate
	* @return the number of lenders associated with the gift_ certificate
	* @throws SystemException if a system exception occurred
	*/
	public static int getLendersSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getLendersSize(pk);
	}

	/**
	* Returns <code>true</code> if the lender is associated with the gift_ certificate.
	*
	* @param pk the primary key of the gift_ certificate
	* @param lenderPK the primary key of the lender
	* @return <code>true</code> if the lender is associated with the gift_ certificate; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsLender(long pk, long lenderPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsLender(pk, lenderPK);
	}

	/**
	* Returns <code>true</code> if the gift_ certificate has any lenders associated with it.
	*
	* @param pk the primary key of the gift_ certificate to check for associations with lenders
	* @return <code>true</code> if the gift_ certificate has any lenders associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsLenders(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsLenders(pk);
	}

	public static Gift_CertificatePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (Gift_CertificatePersistence)PortletBeanLocatorUtil.locate(org.goodreturn.service.ClpSerializer.getServletContextName(),
					Gift_CertificatePersistence.class.getName());

			ReferenceRegistry.registerReference(Gift_CertificateUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(Gift_CertificatePersistence persistence) {
	}

	private static Gift_CertificatePersistence _persistence;
}