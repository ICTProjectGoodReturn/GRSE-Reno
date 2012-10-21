package org.goodreturn.borrowers.portlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import org.goodreturn.borrowers.util.ActionUtil;
import org.goodreturn.borrowers.util.WebKeys;
import org.goodreturn.model.Borrower;
import org.goodreturn.model.BorrowerLoan;
import org.goodreturn.model.Story;
import org.goodreturn.model.impl.BorrowerImpl;
import org.goodreturn.model.impl.BorrowerLoanImpl;
import org.goodreturn.model.impl.StoryImpl;
import org.goodreturn.service.BorrowerLoanLocalServiceUtil;
import org.goodreturn.service.BorrowerLocalServiceUtil;
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
	public void updateBorrower(ActionRequest request, ActionResponse response) throws PortalException, SystemException {
		//Retrieves data for processing request.
		Borrower borrower = ActionUtil.borrowerFromRequest(request);
		ArrayList<String> errors = new ArrayList<String>();
		ServiceContext serviceContext = ServiceContextFactory.getInstance(Story.class.getName(), request);

		//Updates or adds borrower to database if valid.
		boolean operationFailed = true;
		if (BorrowerValidator.validateBorrower(borrower, errors)) {
			if (borrower.getAbacus_Borrower_Id() > 0) {
				// Updating
				try {
					Borrower fromDB = BorrowerLocalServiceUtil.getBorrower(borrower.getAbacus_Borrower_Id());

					if (fromDB != null && (borrower.getAbacus_Borrower_Id() == fromDB.getAbacus_Borrower_Id())) {
						
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
					TODO
					BorrowerLocalServiceUtil.addBorrower(borrower, borrower.getAbacus_Borrower_Id(), serviceContext);
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
		//Retrieves data for processing request.
		BorrowerLoan borrowerLoan = ActionUtil.borrowerLoanFromRequest(request);
		ArrayList<String> errors = new ArrayList<String>();
		ServiceContext serviceContext = ServiceContextFactory.getInstance(Story.class.getName(), request);

		//Updates or adds borrowerLoan to database if valid.
		boolean operationFailed = true;
		if (BorrowerLoanValidator.validateBorrowerLoan(borrowerLoan, errors)) {
			if (borrowerLoan.getBorrower_Loan_Id() > 0) {
				// Updating
				try {
					BorrowerLoan fromDB = BorrowerLoanLocalServiceUtil.getBorrowerLoan(borrowerLoan.getBorrower_Loan_Id());

					if (fromDB != null && (borrowerLoan.getBorrower_Loan_Id() == fromDB.getBorrower_Loan_Id())) {
						
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
					TODO
					BorrowerLoanLocalServiceUtil.addBorrowerLoan(borrowerLoan, borrowerLoan.getBorrower_Loan_Id(), serviceContext);
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
	

	public void updateStory(ActionRequest request, ActionResponse response) throws PortalException, SystemException {
		//Retrieves data for processing request.
		Story story = ActionUtil.storyFromRequest(request);
		ArrayList<String> errors = new ArrayList<String>();
		ServiceContext serviceContext = ServiceContextFactory.getInstance(Story.class.getName(), request);

		//Updates or adds story to database if valid.
		boolean operationFailed = true;
		if (StoryValidator.validateStory(story, errors)) {
			if (story.getStory_Id() > 0) {
				// Updating
				try {
					Story fromDB = StoryLocalServiceUtil.getStory(story.getStory_Id());

					if (fromDB != null && (story.getStory_Id() == fromDB.getStory_Id())) {

						fromDB = StoryLocalServiceUtil.updateStory(story, false);
						SessionMessages.add(request, "story-update-success");
						operationFailed = false;
					}
				//Story could not be updated.
				} catch (PortalException e) {
					errors.add("story-update-error");
				} catch (SystemException e) {
					errors.add("story-update-error");
				}
			} else {
				// Adding
				try {
					StoryLocalServiceUtil.addStory(story, story.getStory_Id(), serviceContext);
					SessionMessages.add(request, "story-add-success");
					operationFailed = false;
				//Story could not be added.
				} catch (SystemException e) {
					errors.add("story-add-error");
				} catch (PortalException e) {
					errors.add("story-add-error");
				}
			}
		} else {
			errors.add("story-data-invalid-error");
		}
		
		//Add/Update failed, adds all errors for user display.
		if (operationFailed) {
			for (String error : errors) {
				SessionErrors.add(request, error);
			}
			
			// Sets render page with data.
			request.setAttribute(WebKeys.STORY_ENTRY, story);
			response.setRenderParameter("jspPage", "/html/story/edit_story.jsp");
		} else {
			//Redirect to new page.
			response.setRenderParameter("jspPage",request.getParameter("jspPage"));
		}
	}

	/**
	 * Deletes the story from the database.
	 *
	 * @param request - request object to initiate the deletion, should contain the resourcePrimKey for story.
	 * @param response - response object.
	 */
	public void deleteStory(ActionRequest request, ActionResponse response) throws Exception {

		long storyKey = ParamUtil.getLong(request, WebKeys.ATTR_STORY_ID);

		if (Validator.isNotNull(storyKey)) {
			StoryLocalServiceUtil.deleteStory(storyKey);
			SessionMessages.add(request, "story-delete-success");
		} else {
			SessionErrors.add(request, "story-delete-error");
		}
		redirect(request, response);
	}
	
	/* ****************************************
	 * Helper methods for obtaining and display content.
	 * ****************************************/
	@Override
	public void processAction(ActionRequest actionRequest, ActionResponse actionResponse) throws IOException, PortletException {
		//TODO first page's content - if needed?
	}
	
	
	//
	// Borrowers
	//
	
	public void getViewBorrower(ActionRequest actionRequest, ActionResponse actionResponse) throws IOException, PortletException {
		Borrower borrower = ActionUtil.getBorrower(actionRequest);
		actionRequest.setAttribute(WebKeys.BORROWER_ENTRY, borrower);
		redirect(actionRequest, actionResponse);
	}
	
	
	public void getEditBorrower(ActionRequest actionRequest, ActionResponse actionResponse) throws IOException, PortletException {
		Borrower borrower = ActionUtil.getBorrower(actionRequest);
		
		if (borrower == null) {
			borrower = new BorrowerImpl();
		}
		
		actionRequest.setAttribute(WebKeys.BORROWER_ENTRY, borrower);
		redirect(actionRequest, actionResponse);
	}

	
	public void getAllBorrowers(ActionRequest actionRequest, ActionResponse actionResponse) throws IOException, PortletException {
		List<Borrower> borrowers = ActionUtil.getBorrowers(actionRequest);
		actionRequest.setAttribute(WebKeys.BORROWER_ENTRIES, borrowers);
		redirect(actionRequest, actionResponse);
	}

	
	//
	// BorrowerLoans
	//
	
	public void getViewBorrowerLoan(ActionRequest actionRequest, ActionResponse actionResponse) throws IOException, PortletException {
		BorrowerLoan borrowerLoan = ActionUtil.getBorrowerLoan(actionRequest);
		actionRequest.setAttribute(WebKeys.BORROWER_LOAN_ENTRY, borrowerLoan);
		redirect(actionRequest, actionResponse);
	}

	
	public void getEditBorrowerLoan(ActionRequest actionRequest, ActionResponse actionResponse) throws IOException, PortletException {
		BorrowerLoan borrowerLoan = ActionUtil.getBorrowerLoan(actionRequest);
		
		if (borrowerLoan == null) {
			borrowerLoan = new BorrowerLoanImpl();
		}
		
		actionRequest.setAttribute(WebKeys.BORROWER_LOAN_ENTRY, borrowerLoan);
		redirect(actionRequest, actionResponse);
	}

	
	public void getAllBorrowerLoans(ActionRequest actionRequest, ActionResponse actionResponse) throws IOException, PortletException {
		List<BorrowerLoan> borrowerLoans = ActionUtil.getBorrowerLoans(actionRequest);
		actionRequest.setAttribute(WebKeys.BORROWER_LOAN_ENTRIES, borrowerLoans);
		redirect(actionRequest, actionResponse);
	}

	
	//
	// Lender Contributions
	//
	
	public void getViewLenderContribution(ActionRequest actionRequest, ActionResponse actionResponse) throws IOException, PortletException {
		//TODO abacus call for getting LenderContribution
		redirect(actionRequest, actionResponse);
	}

	
	public void getAllLenderContributions(ActionRequest actionRequest, ActionResponse actionResponse) throws IOException, PortletException {
		//TODO abacus call for getting LenderContributions
		redirect(actionRequest, actionResponse);
	}

	
	//
	// Stories
	//
	
	public void getViewStory(ActionRequest actionRequest, ActionResponse actionResponse) throws IOException, PortletException {
		Story story = ActionUtil.getInitialStory(actionRequest);
		actionRequest.setAttribute(WebKeys.STORY_ENTRY, story);
		redirect(actionRequest, actionResponse);
	}

	
	public void getEditInitialStory(ActionRequest actionRequest, ActionResponse actionResponse) throws IOException, PortletException {
		Story story = ActionUtil.getInitialStory(actionRequest);
		
		if (story == null) {
			story = new StoryImpl();
			story.setStory_Type("initial");
		}
		
		actionRequest.setAttribute(WebKeys.STORY_ENTRY, story);
		redirect(actionRequest, actionResponse);
	}
	
	
	public void getEditFinalStory(ActionRequest actionRequest, ActionResponse actionResponse) throws IOException, PortletException {
		Story story = ActionUtil.getFinalStory(actionRequest);
		
		if (story == null) {
			story = new StoryImpl();
			story.setStory_Type("final");
		}
		
		actionRequest.setAttribute(WebKeys.STORY_ENTRY, story);
		redirect(actionRequest, actionResponse);
	}
	
	private void redirect(ActionRequest request, ActionResponse response) throws IOException, PortletException {
		//Sets render to new page.
		response.setRenderParameter("jspPage",request.getParameter("jspPage"));
	}
}
