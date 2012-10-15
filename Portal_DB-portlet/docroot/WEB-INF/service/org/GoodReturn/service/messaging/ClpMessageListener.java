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

package org.GoodReturn.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import org.GoodReturn.service.BorrowerLocalServiceUtil;
import org.GoodReturn.service.BorrowerServiceUtil;
import org.GoodReturn.service.ClpSerializer;
import org.GoodReturn.service.Gift_CertificateLocalServiceUtil;
import org.GoodReturn.service.Gift_CertificateServiceUtil;
import org.GoodReturn.service.LenderLocalServiceUtil;
import org.GoodReturn.service.LenderServiceUtil;
import org.GoodReturn.service.PersonLocalServiceUtil;
import org.GoodReturn.service.PersonServiceUtil;
import org.GoodReturn.service.StoryLocalServiceUtil;
import org.GoodReturn.service.StoryServiceUtil;
import org.GoodReturn.service.Supplementary_TableLocalServiceUtil;
import org.GoodReturn.service.Supplementary_TableServiceUtil;
import org.GoodReturn.service.TeamLenderLoanLocalServiceUtil;
import org.GoodReturn.service.TeamLenderLoanServiceUtil;
import org.GoodReturn.service.TeamLenderLocalServiceUtil;
import org.GoodReturn.service.TeamLenderServiceUtil;
import org.GoodReturn.service.TeamLocalServiceUtil;
import org.GoodReturn.service.TeamServiceUtil;

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