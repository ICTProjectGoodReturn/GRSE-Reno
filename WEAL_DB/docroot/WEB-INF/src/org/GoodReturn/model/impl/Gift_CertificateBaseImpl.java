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

package org.GoodReturn.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import org.GoodReturn.model.Gift_Certificate;

import org.GoodReturn.service.Gift_CertificateLocalServiceUtil;

/**
 * The extended model base implementation for the Gift_Certificate service. Represents a row in the &quot;WEAL_Gift_Certificate&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link Gift_CertificateImpl}.
 * </p>
 *
 * @author gilaa004
 * @see Gift_CertificateImpl
 * @see org.GoodReturn.model.Gift_Certificate
 * @generated
 */
public abstract class Gift_CertificateBaseImpl extends Gift_CertificateModelImpl
	implements Gift_Certificate {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a gift_ certificate model instance should use the {@link Gift_Certificate} interface instead.
	 */
	public void persist() throws SystemException {
		if (this.isNew()) {
			Gift_CertificateLocalServiceUtil.addGift_Certificate(this);
		}
		else {
			Gift_CertificateLocalServiceUtil.updateGift_Certificate(this);
		}
	}
}