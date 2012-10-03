package com.liferay.portlet.login.action;

import com.liferay.portal.kernel.exception.PortalException;

/**
 * Simple exception used to identify problem with the Public User's field title.
 * 
 * - to be used in fashion as other liferay exceptions for user input checking.
 * 
 * @author Kyle
 */
public class ContactTitleException extends PortalException {

	public ContactTitleException() {
		super();
	}

	public ContactTitleException(String msg) {
		super(msg);
	}

	public ContactTitleException(String msg, Throwable cause) {
		super(msg, cause);
	}

	public ContactTitleException(Throwable cause) {
		super(cause);
	}
}
