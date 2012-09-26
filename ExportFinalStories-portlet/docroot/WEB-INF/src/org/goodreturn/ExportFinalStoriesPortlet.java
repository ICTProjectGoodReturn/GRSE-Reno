package org.goodreturn;

import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedList;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.liferay.portal.kernel.servlet.ServletResponseUtil;
import com.liferay.portal.kernel.util.ContentTypes;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.util.PortalUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class ExportFinalStoriesPortlet
 */
public class ExportFinalStoriesPortlet extends MVCPortlet {

	public void serveResource(ResourceRequest req, ResourceResponse res) throws PortletException, IOException {
		boolean downloadxls = ParamUtil.getBoolean(req, "download");

		if (downloadxls) {
			res.setContentType("application/vnd.ms-excel"); //TODO Remove?


			//Retrieves data as Csv data.
			LinkedList<String[]> data = FinalStoryExporter.loadData();
			LinkedList<String> csvData = FinalStoryExporter.createCsvData(data);
			
			//Creates stream for csv data.
			InputStream in = new LinesInputStream(csvData);

			//Sends data to user.
			if (in == null) {
				in.close();
			} else {
				HttpServletRequest request = PortalUtil.getHttpServletRequest(req);
				HttpServletResponse response = PortalUtil.getHttpServletResponse(res);
				ServletResponseUtil.sendFile(request,response, "stories.csv", in, ContentTypes.TEXT_CSV);

				in.close();
			}
		}
	}

}
