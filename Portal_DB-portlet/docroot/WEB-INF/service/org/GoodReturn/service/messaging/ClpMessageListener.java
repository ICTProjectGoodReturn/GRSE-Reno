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

package org.goodreturn.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import org.goodreturn.service.BorrowerLoanLocalServiceUtil;
import org.goodreturn.service.BorrowerLoanServiceUtil;
import org.goodreturn.service.BorrowerLocalServiceUtil;
import org.goodreturn.service.BorrowerServiceUtil;
import org.goodreturn.service.ClpSerializer;
import org.goodreturn.service.Gift_CertificateLocalServiceUtil;
import org.goodreturn.service.Gift_CertificateServiceUtil;
import org.goodreturn.service.LenderLocalServiceUtil;
import org.goodreturn.service.LenderServiceUtil;
import org.goodreturn.service.PersonLocalServiceUtil;
import org.goodreturn.service.PersonServiceUtil;
import org.goodreturn.service.StoryLocalServiceUtil;
import org.goodreturn.service.StoryServiceUtil;
import org.goodreturn.service.TeamLenderLocalServiceUtil;
import org.goodreturn.service.TeamLenderServiceUtil;
import org.goodreturn.service.TeamLocalServiceUtil;
import org.goodreturn.service.TeamServiceUtil;

/**
 * @author Brian Wing Shun Chan
 */
public class ClpMessageListener extends BaseMessageListener {
	public static String getServletContextName() {
		return ClpSerializer.getServletContextName();
	}

	@Override
	protected void doReceive(Message message) throws Exception {
		String command = message.getString("command");
		String servletContextName = message.getString("servletContextName");

		if (command.equals("undeploy") &&
				servletContextName.equals(getServletContextName())) {
			BorrowerLocalServiceUtil.clearService();

			BorrowerServiceUtil.clearService();
			BorrowerLoanLocalServiceUtil.clearService();

			BorrowerLoanServiceUtil.clearService();
			Gift_CertificateLocalServiceUtil.clearService();

			Gift_CertificateServiceUtil.clearService();
			LenderLocalServiceUtil.clearService();

			LenderServiceUtil.clearService();
			PersonLocalServiceUtil.clearService();

			PersonServiceUtil.clearService();
			StoryLocalServiceUtil.clearService();

			StoryServiceUtil.clearService();
			TeamLocalServiceUtil.clearService();

			TeamServiceUtil.clearService();
			TeamLenderLocalServiceUtil.clearService();

			TeamLenderServiceUtil.clearService();
		}
	}
}