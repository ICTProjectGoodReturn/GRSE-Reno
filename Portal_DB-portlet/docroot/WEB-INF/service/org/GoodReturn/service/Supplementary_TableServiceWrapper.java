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
 * This class is a wrapper for {@link Supplementary_TableService}.
 * </p>
 *
 * @author    gilaa004
 * @see       Supplementary_TableService
 * @generated
 */
public class Supplementary_TableServiceWrapper
	implements Supplementary_TableService,
		ServiceWrapper<Supplementary_TableService> {
	public Supplementary_TableServiceWrapper(
		Supplementary_TableService supplementary_TableService) {
		_supplementary_TableService = supplementary_TableService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _supplementary_TableService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_supplementary_TableService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _supplementary_TableService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public Supplementary_TableService getWrappedSupplementary_TableService() {
		return _supplementary_TableService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedSupplementary_TableService(
		Supplementary_TableService supplementary_TableService) {
		_supplementary_TableService = supplementary_TableService;
	}

	public Supplementary_TableService getWrappedService() {
		return _supplementary_TableService;
	}

	public void setWrappedService(
		Supplementary_TableService supplementary_TableService) {
		_supplementary_TableService = supplementary_TableService;
	}

	private Supplementary_TableService _supplementary_TableService;
}