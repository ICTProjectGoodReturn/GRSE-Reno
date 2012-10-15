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

package com.test.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import com.test.service.BorrowerLocalServiceUtil;
import com.test.service.BorrowerServiceUtil;
import com.test.service.ClpSerializer;
import com.test.service.Gift_CertificateLocalServiceUtil;
import com.test.service.Gift_CertificateServiceUtil;
import com.test.service.LenderLocalServiceUtil;
import com.test.service.LenderServiceUtil;
import com.test.service.PersonLocalServiceUtil;
import com.test.service.PersonServiceUtil;
import com.test.service.StoryLocalServiceUtil;
import com.test.service.StoryServiceUtil;
import com.test.service.Supplementary_TableLocalServiceUtil;
import com.test.service.Supplementary_TableServiceUtil;
import com.test.service.TeamLenderLoanLocalServiceUtil;
import com.test.service.TeamLenderLoanServiceUtil;
import com.test.service.TeamLenderLocalServiceUtil;
import com.test.service.TeamLenderServiceUtil;
import com.test.service.TeamLocalServiceUtil;
import com.test.service.TeamServiceUtil;

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
			Gift_CertificateLocalServiceUtil.clearService();

			Gift_CertificateServiceUtil.clearService();
			LenderLocalServiceUtil.clearService();

			LenderServiceUtil.clearService();
			PersonLocalServiceUtil.clearService();

			PersonServiceUtil.clearService();
			StoryLocalServiceUtil.clearService();

			StoryServiceUtil.clearService();
			Supplementary_TableLocalServiceUtil.clearService();

			Supplementary_TableServiceUtil.clearService();
			TeamLocalServiceUtil.clearService();

			TeamServiceUtil.clearService();
			TeamLenderLocalServiceUtil.clearService();

			TeamLenderServiceUtil.clearService();
			TeamLenderLoanLocalServiceUtil.clearService();

			TeamLenderLoanServiceUtil.clearService();
		}
	}
}