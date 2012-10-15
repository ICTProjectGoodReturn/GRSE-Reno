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

package com.test.model;

import com.liferay.portal.model.PersistedModel;

/**
 * The extended model interface for the Person service. Represents a row in the &quot;KYLE_Person&quot; database table, with each column mapped to a property of this class.
 *
 * @author gilaa004
 * @see PersonModel
 * @see com.test.model.impl.PersonImpl
 * @see com.test.model.impl.PersonModelImpl
 * @generated
 */
public interface Person extends PersonModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.test.model.impl.PersonImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
}