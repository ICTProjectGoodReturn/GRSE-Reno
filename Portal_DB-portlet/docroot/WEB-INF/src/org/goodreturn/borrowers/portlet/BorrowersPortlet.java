package org.goodreturn.borrowers.portlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.goodreturn.NoSuchStoryException;
import org.goodreturn.borrowers.util.ActionUtil;
import org.goodreturn.model.Story;
import org.goodreturn.model.impl.StoryImpl;
import org.goodreturn.service.StoryLocalServiceUtil;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class for BorrowersPortlet.
 * Actions are basis for behaviour of the portlet.
 * 
 * @author Kyle Pink
 */
public class BorrowersPortlet extends MVCPortlet {


	/* ****************************************
	 * Action methods for performing operations.
	 * ****************************************/

	/*
	NOTE commented out as will not likely be used.
	public void setStory(ActionRequest request, ActionResponse response) throws IOException, PortletException {

		//Setup, retrieves fields submitted.
		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		Story story = ActionUtil.storyFromRequest(request);

		//Validates fields, updates or adds into database.
		ArrayList<String> errors = new ArrayList<String>();
		if (StoryValidator.validateStory(story, errors)) {
			//TODO REMOVE COMMENTS
			//StoryLocalServiceUtil.addStory(story, themeDisplay.getUserId());
			//StoryLocalServiceUtil.addStory(story);
			SessionMessages.add(request, "story-saved-successfully");
		}
		else {
			SessionErrors.add(request, "fields-required");
		}
	}
	 */

	public void updateStory(ActionRequest request, ActionResponse response) throws PortalException, SystemException {
		Story story = ActionUtil.storyFromRequest(request);

		ArrayList<String> errors = new ArrayList();
		ServiceContext serviceContext = ServiceContextFactory.getInstance(Story.class.getName(), request);

		if (StoryValidator.validateStory(story, errors)) {
			if (story.getStory_Id() > 0) {
				// Updating
				try {
					Story fromDB = StoryLocalServiceUtil.getStory(story.getStory_Id());

					if (fromDB != null && (story.getStory_Id() == fromDB.getStory_Id())) {

						fromDB = StoryLocalServiceUtil.updateStory(story, false);
						SessionMessages.add(request, "story-update-success");
					}
					//Story could not be updated
				} catch (PortalException e) {
					errors.add("story-update-error");
				} catch (SystemException e) {
					errors.add("story-update-error");
				}
			}
			else {
				// Adding
				try {
					StoryLocalServiceUtil.addStory(story, story.getStory_Id(), serviceContext);
					SessionMessages.add(request, "story-add-success");
					throw new PortalException();
				} catch (SystemException e) {
					errors.add("story-add-error");
				} catch (PortalException e) {
					errors.add("story-add-error");
				}
			}
		} else {
			for (String error : errors) {
				SessionErrors.add(request, error);
			}

			request.setAttribute("storyObject", story);
			response.setRenderParameter("jspPage", "/html/story/edit_story.jsp");
		}
	}

	/**
	 * Deletes the story from the database.
	 *
	 * @param request - request object to initiate the deletion, should contain the resourcePrimKey for story.
	 * @param response - response object.
	 */
	public void deleteStory(ActionRequest request, ActionResponse response) throws Exception {

		long storyKey = ParamUtil.getLong(request, "story_Id");

		if (Validator.isNotNull(storyKey)) {
			StoryLocalServiceUtil.deleteStory(storyKey);
			SessionMessages.add(request, "story-delete-success");
		} else {
			SessionErrors.add(request, "story-delete-error");
		}
	}

	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException, IOException {
		try {
			Story story = null;
			long resourcePrimKey = ParamUtil.getLong(renderRequest, "story_Id");

			if (resourcePrimKey > 0) {
				story = StoryLocalServiceUtil.getStory(resourcePrimKey);
			} else {
				story = new StoryImpl();
			}

			renderRequest.setAttribute("storyObject", story);
		} catch (Exception e) {
			if (e instanceof NoSuchStoryException) {
				SessionErrors.add(renderRequest, e.getClass().getName());
			} else {
				throw new PortletException(e);
			}
		}
		super.render(renderRequest, renderResponse);
	}
	
	
	/* ****************************************
	 * Helper methods for display content.
	 * ****************************************/
	
	@Override
	public void processAction(ActionRequest actionRequest, ActionResponse actionResponse) throws IOException, PortletException {
		//TODO first page's content - if needed.
	}
	
	/**
	 * Gets specified borrower based on borrower_Id and puts it in the request.
	 * 
	 * @param actionRequest
	 * @param actionResponse
	 * @throws IOException
	 * @throws PortletException
	 */
	public void viewBorrower(ActionRequest actionRequest, ActionResponse actionResponse) throws IOException, PortletException {
		//TODO
	}

	/**
	 * Gets all the borrowers for specific MFI group ID and puts it in the request.
	 * 
	 * @param actionRequest
	 * @param actionResponse
	 * @throws IOException
	 * @throws PortletException
	 */
	public void viewAllBorrowers(ActionRequest actionRequest, ActionResponse actionResponse) throws IOException, PortletException {
		//TODO
	}

	/**
	 * Gets specified LoanAccount based on loan_Account_Id and puts it in the request.
	 * 
	 * @param actionRequest
	 * @param actionResponse
	 * @throws IOException
	 * @throws PortletException
	 */
	public void viewLoanAccount(ActionRequest actionRequest, ActionResponse actionResponse) throws IOException, PortletException {
		//TODO
	}

	/**
	 * Gets all LoanAccounts for specified borrower_Id and puts it in the request.
	 * 
	 * @param actionRequest
	 * @param actionResponse
	 * @throws IOException
	 * @throws PortletException
	 */
	public void viewAllLoanAccounts(ActionRequest actionRequest, ActionResponse actionResponse) throws IOException, PortletException {
		//TODO
	}

	/**
	 * Gets specified Loan based on loan_Id, and puts it in the request.
	 * 
	 * @param actionRequest
	 * @param actionResponse
	 * @throws IOException
	 * @throws PortletException
	 */
	public void viewLoan(ActionRequest actionRequest, ActionResponse actionResponse) throws IOException, PortletException {
		//TODO
	}

	/**
	 * Gets all Loans for specified loan_Account_Id and puts it in the request.
	 * 
	 * @param actionRequest
	 * @param actionResponse
	 * @throws IOException
	 * @throws PortletException
	 */
	public void viewAllLoans(ActionRequest actionRequest, ActionResponse actionResponse) throws IOException, PortletException {
		//TODO
	}

	/**
	 * Gets specific Initial Story for specified LoanAccount based on loan_Account_Id and puts in the request.
	 * 
	 * @param actionRequest
	 * @param actionResponse
	 * @throws IOException
	 * @throws PortletException
	 */
	public void viewInitialStory(ActionRequest actionRequest, ActionResponse actionResponse) throws IOException, PortletException {
		//TODO
	}

	/**
	 * Gets specific Final Story for specified LoanAccount based on loan_Account_Id and puts in the request.
	 * 
	 * @param actionRequest
	 * @param actionResponse
	 * @throws IOException
	 * @throws PortletException
	 */
	public void viewFinalStory(ActionRequest actionRequest, ActionResponse actionResponse) throws IOException, PortletException {
		//TODO
	}
}
