package org.goodreturn.borrowers.portlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import org.goodreturn.borrowers.util.ActionUtil;
import org.goodreturn.borrowers.util.WebKeys;
import org.goodreturn.model.Story;
import org.goodreturn.model.TempBl;
import org.goodreturn.service.StoryLocalServiceUtil;
import org.goodreturn.service.TempBlLocalServiceUtil;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class for BorrowersPortlet.
 * Actions are basis for behaviour of the portlet.
 * 
 * @author Kyle Pink
 */
public class BorrowersPortlet extends MVCPortlet {


	/**
	 * Retrieves the Borrower object to be added or updated in the db,
	 * First retrieves the Borrower object from the request object, validates the borrower object
	 * then performs the insert or update operation within the db or fails with errors.
	 * 
	 * @param request - which contains the Borrower object attributes.
	 * @param response - response which will allow for output to be provided to the user.
	 * @throws PortalException
	 * @throws SystemException
	 */
	public void updateBorrower(ActionRequest request, ActionResponse response) throws PortalException, SystemException {
		//TODO
	}

	
	/**
	 * Retrieves the BorrowerLoan object to be added or updated in the db,
	 * First retrieves the BorrowerLoan object from the request object, validates the borrowerloan object
	 * then performs the insert or update operation within the db or fails with errors.
	 * 
	 * @param request - which contains the BorrowerLoan object attributes.
	 * @param response - response which will allow for output to be provided to the user.
	 * @throws PortalException
	 * @throws SystemException
	 */
	public void updateBorrowerLoan(ActionRequest request, ActionResponse response) throws PortalException, SystemException {
		//TODO
	}

	
	/**
	 * Retrieves the Story object to be added or updated in the db,
	 * First retrieves the Story object from the request object, validates the story object
	 * then performs the insert or update operation within the db or fails with errors.
	 * 
	 * @param request - which contains the Story object attributes.
	 * @param response - response which will allow for output to be provided to the user.
	 * @throws PortalException
	 * @throws SystemException
	 */
	public void updateStory(ActionRequest actionRequest, ActionResponse actionResponse) throws IOException, PortletException, PortalException, SystemException {
		//Retrieves data for processing request.
		Story story = ActionUtil.storyFromRequest(actionRequest);
		ArrayList<String> errors = new ArrayList<String>();
		ServiceContext serviceContext = null;

		serviceContext = ServiceContextFactory.getInstance(Story.class.getName(), actionRequest);

		
		boolean operationFailed = true;
		boolean isNewStory = story.getStory_Id() <= 0;
		
		//Updates or adds story to database if valid.
		if (StoryValidator.validateStory(story, errors)) {
			if (isNewStory) {
				// Adding
				try {
					long userId = ((ThemeDisplay)actionRequest.getAttribute(WebKeys.THEME_DISPLAY)).getUserId();

					StoryLocalServiceUtil.addStory(story, userId, serviceContext);
					SessionMessages.add(actionRequest, "story-add-success");
					operationFailed = false;
				//Story could not be added.
				} catch (SystemException e) {
					e.printStackTrace();
					errors.add("story-add-error");
				} catch (PortalException e) {
					e.printStackTrace();
					errors.add("story-add-error");
				}
			} else {
				// Updating
				try {
					Story fromDB = StoryLocalServiceUtil.getStory(story.getStory_Id());

					if (fromDB != null && (story.getStory_Id() == fromDB.getStory_Id())) {
						fromDB = StoryLocalServiceUtil.updateStory(story, false);
						SessionMessages.add(actionRequest, "story-update-success");
						operationFailed = false;
					}
				//Story could not be updated.
				} catch (PortalException e) {
					errors.add("story-update-error");
				} catch (SystemException e) {
					errors.add("story-update-error");
				}
			}
		} else {
			errors.add("story-data-invalid-error");
		}

		//Add/Update failed, adds all errors for user display.
		if (operationFailed) {
			for (String error : errors) {
				SessionErrors.add(actionRequest, error);
			}

			// Sets render page with data.
			actionRequest.setAttribute(WebKeys.STORY_ENTRY, story);
			actionResponse.setRenderParameter(WebKeys.WORKFLOW_INTERFACE, String.valueOf(ParamUtil.getBoolean(actionRequest, WebKeys.WORKFLOW_INTERFACE)));
			actionResponse.setRenderParameter("jspPage", "/html/story/edit_story.jsp");

		} else {
			//redirects based on weather new or edit.
			if (isNewStory) {
				actionResponse.setRenderParameter("jspPage", ParamUtil.getString(actionRequest, "jspPage"));
				actionResponse.setRenderParameter(WebKeys.ATTR_TEMPBL_LOAN_ID, ParamUtil.getString(actionRequest, WebKeys.ATTR_TEMPBL_LOAN_ID));
				actionResponse.setRenderParameter(WebKeys.ATTR_TEMPBL_BORROWER_NAME, ParamUtil.getString(actionRequest, WebKeys.ATTR_TEMPBL_BORROWER_NAME));
			} else {
				actionResponse.setRenderParameter("jspPage", "/html/story/edit_story.jsp");
				actionResponse.setRenderParameter(WebKeys.ATTR_STORY_ID, String.valueOf(story.getStory_Id()));
			}
		}
	}
	
	
	/**
	 * Retrieves the TempBl object to be added or updated in the db,
	 * First retrieves the TempBl object from the request object, validates the TempBl object
	 * then performs the insert or update operation within the db or fails with errors.
	 * 
	 * @param request - which contains the TempBl object attributes.
	 * @param response - response which will allow for output to be provided to the user.
	 * @throws PortalException
	 * @throws SystemException
	 */
	public void updateTempBl(ActionRequest actionRequest, ActionResponse actionResponse) throws IOException, PortletException, PortalException, SystemException {
		//Data retrieval
		TempBl tempBl = ActionUtil.tempBlFromRequest(actionRequest);
		ArrayList<String> errors = new ArrayList<String>();

		ServiceContext serviceContext = ServiceContextFactory.getInstance(Story.class.getName(), actionRequest);

		//Updates or adds tempBl to database if valid.
		boolean operationFailed = true;
		if (TempBlValidator.validateTempBl(tempBl, errors)) {
			TempBlLocalServiceUtil.addTempBl(tempBl);
			SessionMessages.add(actionRequest, "tempbl-data-add-success");
			operationFailed = false;
		} else {
			errors.add("tempbl-data-invalid-error");
		}

		//Add/Update failed, adds all errors for user display.
		if (operationFailed) {
			for (String error : errors) {
				SessionErrors.add(actionRequest, error);
			}

			// Sets render page with data.
			actionRequest.setAttribute(WebKeys.TEMPBL_ENTRY, tempBl);
		}

		//Ensure page is redirected to.
		actionResponse.setRenderParameter("jspPage", "/html/temp_bl/view_tempbl.jsp");
	}
}
