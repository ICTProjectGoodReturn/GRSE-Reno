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

package com.test.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link Gift_CertificateService}.
 * </p>
 *
 * @author    gilaa004
 * @see       Gift_CertificateService
 * @generated
 */
public class Gift_CertificateServiceWrapper implements Gift_CertificateService,
	ServiceWrapper<Gift_CertificateService> {
	public Gift_CertificateServiceWrapper(
		Gift_CertificateService gift_CertificateService) {
		_gift_CertificateService = gift_CertificateService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _gift_CertificateService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_gift_CertificateService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _gift_CertificateService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public Gift_CertificateService getWrappedGift_CertificateService() {
		return _gift_CertificateService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedGift_CertificateService(
		Gift_CertificateService gift_CertificateService) {
		_gift_CertificateService = gift_CertificateService;
	}

	public Gift_CertificateService getWrappedService() {
		return _gift_CertificateService;
	}

	public void setWrappedService(
		Gift_CertificateService gift_CertificateService) {
		_gift_CertificateService = gift_CertificateService;
	}

	private Gift_CertificateService _gift_CertificateService;
}