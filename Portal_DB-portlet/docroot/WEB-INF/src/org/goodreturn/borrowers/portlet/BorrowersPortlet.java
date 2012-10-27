package org.goodreturn.borrowers.portlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import org.goodreturn.borrowers.util.ActionUtil;
import org.goodreturn.borrowers.util.WebKeys;
import org.goodreturn.model.Borrower;
import org.goodreturn.model.BorrowerLoan;
import org.goodreturn.model.Story;
import org.goodreturn.model.TempBl;
import org.goodreturn.service.BorrowerLoanLocalServiceUtil;
import org.goodreturn.service.BorrowerLocalServiceUtil;
import org.goodreturn.service.StoryLocalServiceUtil;
import org.goodreturn.service.TempBlLocalService;
import org.goodreturn.service.TempBlLocalServiceUtil;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
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


	/* ****************************************
	 * Action methods for performing operations.
	 * ****************************************/
	public void updateBorrower(ActionRequest request, ActionResponse response) throws PortalException, SystemException {
		//TODO may need another look at.
		//Retrieves data for processing request.
		Borrower borrower = ActionUtil.borrowerFromRequest(request);
		ArrayList<String> errors = new ArrayList<String>();
		ServiceContext serviceContext = ServiceContextFactory.getInstance(Story.class.getName(), request);

		//Updates or adds borrower to database if valid.
		boolean operationFailed = true;
		if (BorrowerValidator.validateBorrower(borrower, errors)) {
			if (borrower.getBorrower_Id() > 0) {
				// Updating
				try {
					Borrower fromDB = BorrowerLocalServiceUtil.getBorrower(borrower.getBorrower_Id());

					if (fromDB != null && (borrower.getBorrower_Id() == fromDB.getBorrower_Id())) {

						fromDB = BorrowerLocalServiceUtil.updateBorrower(borrower, false);
						SessionMessages.add(request, "borrower-update-success");
						operationFailed = false;
					}
					//Borrower could not be updated.
				} catch (PortalException e) {
					errors.add("borrower-update-error");
				} catch (SystemException e) {
					errors.add("borrower-update-error");
				}
			} else {
				// Adding
				/*try {
					long userId = ((ThemeDisplay)actionRequest.getAttribute(WebKeys.THEME_DISPLAY)).getUserId();
					TODO
					BorrowerLocalServiceUtil.addBorrower(borrower, userId, serviceContext);
					SessionMessages.add(request, "borrower-add-success");
					operationFailed = false;
				//Borrower could not be added.
				} catch (SystemException e) {
					errors.add("borrower-add-error");
				} catch (PortalException e) {
					errors.add("borrower-add-error");
				}*/
			}
		} else {
			errors.add("borrower-data-invalid-error");
		}

		//Add/Update failed, adds all errors for user display.
		if (operationFailed) {
			for (String error : errors) {
				SessionErrors.add(request, error);
			}

			//Sets render page with data.
			request.setAttribute(WebKeys.BORROWER_ENTRY, borrower);
			response.setRenderParameter("jspPage", "/html/borrower/edit_borrower.jsp");
		} else {
			//Redirect to new page.
			response.setRenderParameter("jspPage",request.getParameter("jspPage"));
		}
	}


	public void updateBorrowerLoan(ActionRequest request, ActionResponse response) throws PortalException, SystemException {
		//TODO may need another look at.
		//Retrieves data for processing request.
		BorrowerLoan borrowerLoan = ActionUtil.borrowerLoanFromRequest(request);
		ArrayList<String> errors = new ArrayList<String>();
		ServiceContext serviceContext = ServiceContextFactory.getInstance(Story.class.getName(), request);

		//Updates or adds borrowerLoan to database if valid.
		boolean operationFailed = true;
		if (BorrowerLoanValidator.validateBorrowerLoan(borrowerLoan, errors)) {
			if (borrowerLoan.getAbacus_Borrower_Loan_Id() > 0) {
				// Updating
				try {
					BorrowerLoan fromDB = BorrowerLoanLocalServiceUtil.getBorrowerLoan(borrowerLoan.getAbacus_Borrower_Loan_Id());

					if (fromDB != null && (borrowerLoan.getAbacus_Borrower_Loan_Id() == fromDB.getAbacus_Borrower_Loan_Id())) {

						fromDB = BorrowerLoanLocalServiceUtil.updateBorrowerLoan(borrowerLoan, false);
						SessionMessages.add(request, "borrower-loan-update-success");
						operationFailed = false;
					}
					//BorrowerLoan could not be updated.
				} catch (PortalException e) {
					errors.add("borrower-loan-update-error");
				} catch (SystemException e) {
					errors.add("borrower-loan-update-error");
				}
			} else {
				// Adding
				/*try {
					long userId = ((ThemeDisplay)actionRequest.getAttribute(WebKeys.THEME_DISPLAY)).getUserId();
					TODO
					BorrowerLoanLocalServiceUtil.addBorrowerLoan(borrowerLoan, userId, serviceContext);
					SessionMessages.add(request, "borrower-loan-add-success");
					operationFailed = false;
				//BorrowerLoan could not be added.
				} catch (SystemException e) {
					errors.add("borrower-loan-add-error");
				} catch (PortalException e) {
					errors.add("borrower-loan-add-error");
				}
				 */
			}
		} else {
			errors.add("borrower-loan-data-invalid-error");
		}

		//Add/Update failed, adds all errors for user display.
		if (operationFailed) {
			for (String error : errors) {
				SessionErrors.add(request, error);
			}

			//Sets render page with data.
			request.setAttribute(WebKeys.BORROWER_LOAN_ENTRY, borrowerLoan);
			response.setRenderParameter("jspPage", "/html/borrower_loan/edit_borrower_loan.jsp");
		} else {
			//Redirect to new page.
			response.setRenderParameter("jspPage",request.getParameter("jspPage"));
		}
	}


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

	public void updateTempBl(ActionRequest actionRequest, ActionResponse actionResponse) throws IOException, PortletException, PortalException, SystemException {
		//Data retrieval
		TempBl tempBl = ActionUtil.tempBlFromRequest(actionRequest);
		ArrayList<String> errors = new ArrayList<String>();

		ServiceContext serviceContext = null;
		serviceContext = ServiceContextFactory.getInstance(Story.class.getName(), actionRequest);

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
