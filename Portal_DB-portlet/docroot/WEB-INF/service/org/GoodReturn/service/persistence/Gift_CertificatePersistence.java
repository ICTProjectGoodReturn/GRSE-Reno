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

import com.liferay.portal.service.persistence.BasePersistence;

import org.goodreturn.model.Gift_Certificate;

/**
 * The persistence interface for the gift_ certificate service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author gilaa004
 * @see Gift_CertificatePersistenceImpl
 * @see Gift_CertificateUtil
 * @generated
 */
public interface Gift_CertificatePersistence extends BasePersistence<Gift_Certificate> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link Gift_CertificateUtil} to access the gift_ certificate persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the gift_ certificate in the entity cache if it is enabled.
	*
	* @param gift_Certificate the gift_ certificate
	*/
	public void cacheResult(
		org.goodreturn.model.Gift_Certificate gift_Certificate);

	/**
	* Caches the gift_ certificates in the entity cache if it is enabled.
	*
	* @param gift_Certificates the gift_ certificates
	*/
	public void cacheResult(
		java.util.List<org.goodreturn.model.Gift_Certificate> gift_Certificates);

	/**
	* Creates a new gift_ certificate with the primary key. Does not add the gift_ certificate to the database.
	*
	* @param certificate_Id the primary key for the new gift_ certificate
	* @return the new gift_ certificate
	*/
	public org.goodreturn.model.Gift_Certificate create(long certificate_Id);

	/**
	* Removes the gift_ certificate with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param certificate_Id the primary key of the gift_ certificate
	* @return the gift_ certificate that was removed
	* @throws org.goodreturn.NoSuchGift_CertificateException if a gift_ certificate with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.goodreturn.model.Gift_Certificate remove(long certificate_Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.goodreturn.NoSuchGift_CertificateException;

	public org.goodreturn.model.Gift_Certificate updateImpl(
		org.goodreturn.model.Gift_Certificate gift_Certificate, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the gift_ certificate with the primary key or throws a {@link org.goodreturn.NoSuchGift_CertificateException} if it could not be found.
	*
	* @param certificate_Id the primary key of the gift_ certificate
	* @return the gift_ certificate
	* @throws org.goodreturn.NoSuchGift_CertificateException if a gift_ certificate with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.goodreturn.model.Gift_Certificate findByPrimaryKey(
		long certificate_Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.goodreturn.NoSuchGift_CertificateException;

	/**
	* Returns the gift_ certificate with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param certificate_Id the primary key of the gift_ certificate
	* @return the gift_ certificate, or <code>null</code> if a gift_ certificate with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.goodreturn.model.Gift_Certificate fetchByPrimaryKey(
		long certificate_Id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the gift_ certificates.
	*
	* @return the gift_ certificates
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.goodreturn.model.Gift_Certificate> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.goodreturn.model.Gift_Certificate> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.goodreturn.model.Gift_Certificate> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the gift_ certificates from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of gift_ certificates.
	*
	* @return the number of gift_ certificates
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}