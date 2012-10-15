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
 * This class is a wrapper for {@link BorrowerService}.
 * </p>
 *
 * @author    gilaa004
 * @see       BorrowerService
 * @generated
 */
public class BorrowerServiceWrapper implements BorrowerService,
	ServiceWrapper<BorrowerService> {
	public BorrowerServiceWrapper(BorrowerService borrowerService) {
		_borrowerService = borrowerService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _borrowerService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_borrowerService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _borrowerService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public BorrowerService getWrappedBorrowerService() {
		return _borrowerService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedBorrowerService(BorrowerService borrowerService) {
		_borrowerService = borrowerService;
	}

	public BorrowerService getWrappedService() {
		return _borrowerService;
	}

	public void setWrappedService(BorrowerService borrowerService) {
		_borrowerService = borrowerService;
	}

	private BorrowerService _borrowerService;
}