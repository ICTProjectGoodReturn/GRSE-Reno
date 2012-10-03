package com.liferay.portlet.login.action;

import com.liferay.portal.kernel.exception.PortalException;

/**
 * Simple exception used to identify problem with the Public User's field addressType.
 * 
 * - to be used in fashion as other liferay exceptions for user input checking.
 * 
 * @author Kyle
 */
public class AddressTypeException extends PortalException {

	public AddressTypeException() {
		super();
	}

	public AddressTypeException(String msg) {
		super(msg);
	}

	public AddressTypeException(String msg, Throwable cause) {
		super(msg, cause);
	}

	public AddressTypeException(Throwable cause) {
		super(cause);
	}
}
