package org.goodreturn.story.portlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import org.goodreturn.model.Story;
import org.goodreturn.service.StoryLocalServiceUtil;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class StoryPortlet
 */
public class OldStoryPortlet extends MVCPortlet {
	
	private Story storyFromRequest(ActionRequest request) {
		return null;
	}
	
	@Override
	public void processAction(ActionRequest actionRequest, ActionResponse actionResponse)
			throws IOException, PortletException {
		
	}


	public void setStory(ActionRequest request, ActionResponse response)
			throws IOException, PortletException {

		//Setup, retrieves fields submitted.
		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		Story story = storyFromRequest(request);
		
		//Validates fields, updates or adds into database.
		ArrayList<String> errors = new ArrayList<String>();
		if (StoryValidator.validateStory(story, errors)) {
			//TODO call below
			//StoryLocalServiceUtil.addStory(story, themeDisplay.getUserId()); 
			SessionMessages.add(request, "story-saved-successfully");
		}
		else {
			SessionErrors.add(request, "fields-required");
		}
	}
	
	public void updateStory(ActionRequest request, ActionResponse response) throws PortalException, SystemException {

        Story slogan = storyFromRequest(request);

        ArrayList<String> errors = new ArrayList();
        ServiceContext serviceContext = ServiceContextFactory.getInstance(Story.class.getName(), request);

        if (StoryValidator.validateStory(slogan, errors)) {

            if (slogan.getStory_Id() > 0) {
                // Updating

                try {
                    Story fromDB = StoryLocalServiceUtil.getStory(slogan.getStory_Id());

                    if (fromDB != null &&
                        (slogan.getStory_Id() == fromDB.getStory_Id())) {

                        fromDB = StoryLocalServiceUtil.updateStory(slogan, false);
                        SessionMessages.add(request, "story-added");

                    }
                }
                catch (PortalException e) {

                    errors.add("story-failed-to-update");

                }
                catch (SystemException e) {

                    errors.add("story-failed-to-update");

                }
            }
            else {
                // Adding

            	//COMMENTED OUT -K
            	/*
                try {
                    //StoryLocalServiceUtil.addStory(slogan, slogan.getStory_Id(), serviceContext);

                }
                catch (SystemException e) {

                    errors.add("story-failed-to-add");

                }
                catch (PortalException e) {

                    errors.add("story-failed-to-add");
                }
                */

            }

            //response.setRenderParameter("jspPage", "/html/view.jsp");

        } else {

            for (String error : errors) {
                SessionErrors.add(request, error);
            }

            request.setAttribute("storyObject", slogan);
            response.setRenderParameter("jspPage", "/html/edit_slogan.jsp");
        }
    }

    /**
     * Deletes the slogan from the database.
     *
     * @param request
     * @param response
     */
    public void deleteStory(ActionRequest request, ActionResponse response) throws Exception {

        long sloganKey = ParamUtil.getLong(request, "resourcePrimKey");

        if (Validator.isNotNull(sloganKey)) {
            StoryLocalServiceUtil.deleteStory(sloganKey);
            SessionMessages.add(request, "story-deleted");

        } else {
            SessionErrors.add(request, "error-deleting");

        }
    }

}
