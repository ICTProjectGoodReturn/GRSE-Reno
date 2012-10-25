package org.goodreturn.story.exporter;

import com.liferay.portal.model.Portlet;
import com.liferay.portal.security.permission.PermissionChecker;
import com.liferay.portlet.BaseControlPanelEntry;

public class StoryExporterUsersControlPanelEntry extends BaseControlPanelEntry {

	@Override
	public boolean isVisible(PermissionChecker permissionChecker, Portlet portlet) throws Exception {
		// TODO this
		return true;
	}

}
