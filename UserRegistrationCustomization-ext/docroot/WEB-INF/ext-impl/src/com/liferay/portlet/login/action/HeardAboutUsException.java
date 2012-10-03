package com.liferay.portlet.login.action;

import com.liferay.portal.kernel.exception.PortalException;

/**
 * Simple exception used to identify problem with the Public User's field HeardAboutUs.
 * 
 * - to be used in fashion as other liferay exceptions for user input checking.
 * 
 * @author Kyle
 */
public class HeardAboutUsException extends PortalException {

	public HeardAboutUsException() {
		super();
	}

	public HeardAboutUsException(String msg) {
		super(msg);
	}

	public HeardAboutUsException(String msg, Throwable cause) {
		super(msg, cause);
	}

	public HeardAboutUsException(Throwable cause) {
		super(cause);
	}
}
