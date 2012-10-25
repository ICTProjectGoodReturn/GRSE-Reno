package org.goodreturn.story;

import java.util.List;
import java.util.Locale;

import javax.portlet.PortletRequest;
import javax.portlet.PortletURL;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.goodreturn.borrowers.util.WebKeys;
import org.goodreturn.model.Story;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.portlet.LiferayPortletRequest;
import com.liferay.portal.kernel.portlet.LiferayPortletResponse;
import com.liferay.portal.model.Portlet;
import com.liferay.portal.security.permission.PermissionChecker;
import com.liferay.portal.service.PortletLocalServiceUtil;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portal.util.PortletKeys;
import com.liferay.portlet.asset.model.BaseAssetRenderer;

public class StoryAssetRenderer extends BaseAssetRenderer {
	
	private Story story;
	
	public StoryAssetRenderer(Story story) {
		this.story = story;
	}

	@Override
	public long getClassPK() {
		return story.getPrimaryKey();
	}

	@Override
	public long getGroupId() {
		return story.getGroupId();
	}

	@Override
	public String getSummary(Locale locale) {
		String storyType = story.getStory_Type();
		storyType = storyType.substring(0, 1).toUpperCase()+storyType.substring(1);
		return storyType + " Story with ID: " + story.getStory_Id();
	}

	@Override
	public String getTitle(Locale locale) {
		String storyType = story.getStory_Type();
		storyType = storyType.substring(0, 1).toUpperCase()+storyType.substring(1);
		return storyType + " Story with ID: " + story.getStory_Id();
	}

	@Override
	public long getUserId() {
		return story.getUserId();
	}

	@Override
	public String getUserName() {
		try {
			return UserLocalServiceUtil.getUser(story.getUserId()).getFullName();
		} catch (PortalException e) {} catch (SystemException e) {}
		
		return "Unknown User";
	}

	@Override
	public String getUuid() {
		return story.getUuid();
	}
	
	@Override
	public PortletURL getURLEdit(LiferayPortletRequest liferayPortletRequest,LiferayPortletResponse liferayPortletResponse)
			throws Exception {

		 PortletURL editPortletURL = liferayPortletResponse.createRenderURL("borrowersportlet_WAR_Portal_DBportlet");

		 editPortletURL.setParameter("jspPage", "/html/story/edit_story.jsp");
		 editPortletURL.setParameter(WebKeys.ATTR_STORY_ID, String.valueOf(story.getStory_Id()));
		 return editPortletURL;
	}
	
	@Override
	public boolean hasEditPermission(PermissionChecker permissionChecker) throws PortalException, SystemException {
		//TODO
		return true;
	}

	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse, String template) throws Exception {
		if (template.equals(TEMPLATE_FULL_CONTENT)) {
	        renderRequest.setAttribute(WebKeys.STORY_ENTRY, story);
	        return "/html/story/" + template + ".jsp";
		} else {
			return null;
		}
	}
}
