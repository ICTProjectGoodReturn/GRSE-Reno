package org.goodreturn.borrowers.util;

import java.util.Collections;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.RenderRequest;

import org.goodreturn.NoSuchStoryException;
import org.goodreturn.model.Borrower;
import org.goodreturn.model.BorrowerLoan;
import org.goodreturn.model.Story;
import org.goodreturn.model.TempBl;
import org.goodreturn.model.impl.BorrowerImpl;
import org.goodreturn.model.impl.BorrowerLoanImpl;
import org.goodreturn.model.impl.StoryImpl;
import org.goodreturn.model.impl.TempBlImpl;
import org.goodreturn.service.StoryLocalServiceUtil;
import org.goodreturn.service.TempBlLocalServiceUtil;
import org.goodreturn.service.persistence.TempBlPK;

import com.liferay.portal.NoSuchOrganizationException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.Organization;
import com.liferay.portal.service.OrganizationLocalServiceUtil;
import com.liferay.portal.theme.ThemeDisplay;

/**
 * Class ActionUtil is a helper which helps perform operations for the Portlets.
 * 
 * Allows for general operations to be performed in static and central manner
 * for use within either the Render or Action Phase of portlets.  
 * 
 * @author Kyle Pink
 */
public class ActionUtil {
	//
	//	Render Phase (like) Data Retrieval Methods
	//
	
	//Wrappers for both types of requests.
	public static long getUserMfiGroupId(ActionRequest request) throws NoSuchOrganizationException {
		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);

		return getUserMfiGroupId(themeDisplay);
	}
	
	
	public static long getUserMfiGroupId(RenderRequest request) throws NoSuchOrganizationException {
		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		
		return getUserMfiGroupId(themeDisplay);		
	}

	/**
	 * Retrieves MFI organization id of user within the themeDisplay object.
	 * Does not support member being part of multiple mfi organizations. returns first found.
	 * 
	 * @param themeDisplay
	 * @return
	 * @throws NoSuchOrganizationException 
	 */
	private static long getUserMfiGroupId(ThemeDisplay themeDisplay) throws NoSuchOrganizationException {

		try {
			//Retrieves mfi parent id.
			long mfiOrganizationId;
			mfiOrganizationId = OrganizationLocalServiceUtil.getOrganizationId(themeDisplay.getCompanyId(), "MFI");


			//Discovers which org is an mfi
			List<Organization> orgs = themeDisplay.getUser().getOrganizations();
			for (Organization currentOrganization : orgs) {
				if (currentOrganization.getParentOrganizationId() == mfiOrganizationId) {
					return currentOrganization.getGroupId();
				}
			}

		} catch (SystemException e) {
			//MFI organization cannot be found.
		} catch (PortalException e) {
			//user is not in any organization.
		}

		//Cannot be found.
		throw new NoSuchOrganizationException("MFI organization cannot be found for specific user.");
	}

	/**
	 * Retrieves all borrowers for specific MFI. Designed to be called from render phase. 
	 * 
	 * @param request - action requested which has access from the render phase.
	 * @return List of Borrower objects for specific MFI.
	 */
	public static List<Borrower> getBorrowers(RenderRequest request) {
		//TODO NEEDS WORK
		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		long groupId = themeDisplay.getScopeGroupId();

		List<Borrower> tempResults;

		try {
			//TODO uncomment/fix and remove throw.
			//tempResults = BorrowerLocalServiceUtil.getAllBorrowers(groupId);
			throw new SystemException("not implemented");
		} catch (SystemException ex) {
			tempResults  = Collections.EMPTY_LIST;
		}

		return tempResults;
	}

	/**
	 * Retrieves single specific borrower based on borrower_Id. Designed to be called from render phase. 
	 * 
	 * @param request - action requested which has access from the render phase.
	 * @return Specific Borrower object for specific borrower_Id. null if not found.
	 */
	public static Borrower getBorrower(RenderRequest request) {
		//TODO NEEDS WORK
		//Values to retrieve data.
		long borrowerId = ParamUtil.getLong(request, WebKeys.ATTR_BORROWER_ID);
		Borrower tempResult;

		//Returns borrower if possible, else null.
		try {
			//TODO uncomment/fix and remove throw.
			//tempResult = BorrowerLocalServiceUtil.getBorrower(borrowerId);
			throw new SystemException("not implemented");
		} catch (SystemException ex) {
			tempResult = null;
		}

		return tempResult;
	}

	public static Borrower getEditableBorrower(RenderRequest request) {
		//TODO NEEDS WORK
		Borrower borrower = ActionUtil.getBorrower(request);

		if (borrower == null) {
			//TODO

			borrower = new BorrowerImpl();
		}

		return borrower;
	}


	/**
	 * Retrieves all BorrowerLoans for specific borrower_Id. Designed to be called from render phase. 
	 * 
	 * @param request Render request which has access from the render phase.
	 * @return List of BorrowerLoan objects for specific Borrower.
	 */
	public static List<BorrowerLoan> getBorrowerLoans(RenderRequest request) {
		//TODO NEEDS WORK
		//Retrieves values needed for request.
		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		long groupId = themeDisplay.getScopeGroupId();

		long borrowerId = ParamUtil.getLong(request, WebKeys.ATTR_BORROWER_ID);
		List<BorrowerLoan> tempResults;

		try {
			//TODO FIX
			//tempResults = BorrowerLoanLocalServiceUtil.getAllBorrowerLoans(groupId);
			throw new SystemException("not implemented");
		} catch (SystemException se) {
			tempResults = Collections.EMPTY_LIST;
		}

		return tempResults;
	}

	/**
	 * Retrieves specific BorrowerLoan for specific borrower_Loan_Id. Designed to be called from render phase. 
	 * 
	 * @param request Render request which has access from the render phase.
	 * @return specific BorrowerLoan object for specific borrower_Loan_Id.
	 */
	public static BorrowerLoan getBorrowerLoan(RenderRequest request) {
		//TODO NEEDS WORK
		//Retrieves values needed for request.
		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		long groupId = themeDisplay.getScopeGroupId();

		long borrowerLoanId = ParamUtil.getLong(request, WebKeys.ATTR_BORROWER_LOAN_ID);
		BorrowerLoan tempResult;

		try {
			//TODO uncomment/fix and remove throw.
			//tempResult = BorrowerLoanServiceUtil.getBorrowerLoan(groupId, borrowerLoanId);
			throw new SystemException("not implemented");
		} catch (SystemException se) {
			tempResult = null;
		}

		return tempResult;
	}

	public static BorrowerLoan getEditableBorrowerLoan(RenderRequest request) {
		//TODO NEEDS WORK

		BorrowerLoan borrowerLoan = ActionUtil.getBorrowerLoan(request);

		if (borrowerLoan == null) {
			//TODO

			borrowerLoan = new BorrowerLoanImpl();
		}

		return borrowerLoan;
	}

	/**
	 * Retrieves all LenderContribution for specific Loan. Designed to be called from render phase. 
	 * 
	 * @param request Render request which has access from the render phase.
	 * @return List of LenderContribution objects for specific Loan - based on loan_Id.
	 */
	public static List<String> getLenderContributions(RenderRequest request) {
		//TODO fix class return type and retrieve from abacus.
		return null;
	}

	/**
	 * Retrieves specific LenderContribution for specific lender_Contribution_Id. Designed to be called from render phase. 
	 * 
	 * @param request Render request which has access from the render phase.
	 * @return specific LenderContribution object.
	 */
	public static String getLenderContribution(RenderRequest request) {
		//TODO fix class return type and retrieve from abacus.
		return null;
	}

	/**
	 * Retrieves Story based on type specified in request. Designed to be called from render phase. 
	 * Retrieves based on  values in order of: story_Id (non-existent)--> Borrower_Loan_Id, story_Type.
	 * 
	 * Returns new story with borrower_Loan_Id and Story_Type if none exists.
	 * 
	 * @param request Render request which has access from the render phase.
	 * @return Story object which represents the InitialStory for specific Loan. Returns new Story for editing if not existent.
	 */
	public static Story getEditableStory(RenderRequest request) {
		Story story;

		//Attempts story based on Id.
		long storyId = ParamUtil.getLong(request, WebKeys.ATTR_STORY_ID);
		if (Validator.isNotNull(storyId)) {
			try {
				return StoryLocalServiceUtil.getStory(storyId);

				//These Exceptions should not really occur.
			} catch (NoSuchStoryException e) {
				e.printStackTrace();
			} catch (PortalException e) {
				e.printStackTrace();
			} catch (SystemException e) {
				e.printStackTrace();
			}
		}

		//Retrieves story based on borrowerLoanId and storyType.
		long borrowerLoanId = ParamUtil.getLong(request, WebKeys.ATTR_BORROWER_LOAN_ID);
		String storyType = ParamUtil.getString(request, WebKeys.ATTR_STORY_TYPE);
		story = ActionUtil.getStoryByType(borrowerLoanId, storyType);

		//Returns new story if it could not be found. (with storyType and BorrowerLoanId).
		if (story == null) {
			story = new StoryImpl();
			story.setStory_Type(storyType);
			story.setAbacus_Borrower_Loan_Id(borrowerLoanId);
		}

		return story;
	}

	public static Story getStoryByType(long borrowerLoanId, String storyType) {
		//Gets story based on loanId and type or returns null.
		Story tempResult;
		try {
			tempResult = StoryLocalServiceUtil.getStoryByL_S(borrowerLoanId, storyType).get(0);
		} catch (SystemException se) {
			tempResult = null;
		} catch (IndexOutOfBoundsException e) {
			tempResult = null;
		}

		return tempResult;
	}


	public static List<Story> getAllStoriesByLoan(RenderRequest request) {
		try {
			long borrowerLoanId = ParamUtil.getLong(request, WebKeys.ATTR_TEMPBL_LOAN_ID);
			long mfiId = ActionUtil.getUserMfiGroupId(request);

			//Gets story based on loanId and group or returns empty collection.
			List<Story> tempResult;
			try {
				tempResult = StoryLocalServiceUtil.getStoryByL_G(borrowerLoanId, mfiId);
			} catch (SystemException se) {
				tempResult = Collections.EMPTY_LIST;
			} catch (IndexOutOfBoundsException e) {
				tempResult = Collections.EMPTY_LIST;
			}

			return tempResult;
		} catch (NoSuchOrganizationException e) {
			SessionErrors.add(request, "story-no-mfi-group");
			return Collections.EMPTY_LIST;
		}
	}


	/**
	 * Retrieves tempBl object based on data within request. Or returns new object.
	 * 
	 * @param request Render request which has access from the render phase.
	 * @return TempBl object which represented in the data.
	 */
	public static TempBl getEditableTempBl(RenderRequest request) {

		//Retrieves tempBl based on PK (composite).
		TempBl tempBl;
		tempBl = ActionUtil.getTempBl(request);

		//Returns new story if it could not be found. (with storyType and BorrowerLoanId).
		if (tempBl == null) {
			tempBl = new TempBlImpl();
		}

		return tempBl;
	}

	/**
	 * Retrieves the tempBl object represented within the request object. or else returns null.
	 * 
	 * @param request - request object which contains the data to obtain the TempBl object from db.
	 * @return tempBl object from the db, or returns null.
	 */
	public static TempBl getTempBl(RenderRequest request) {
		//request data.
		String borrowerName = ParamUtil.getString(request, WebKeys.ATTR_TEMPBL_BORROWER_NAME);
		long borrowerLoanId = ParamUtil.getLong(request, WebKeys.ATTR_TEMPBL_LOAN_ID);
		TempBl tempResult;

		//Attempts retrieval from db or sets null.
		try {
			tempResult = TempBlLocalServiceUtil.getTempBl(new TempBlPK(borrowerName, borrowerLoanId));
		} catch (PortalException e) {
			tempResult = null;
		} catch (SystemException e) {
			tempResult = null;
		}

		return tempResult;
	}

	public static List<TempBl> getTempBls(RenderRequest request) {
		try {
			//Request data.
			long mfiId = ActionUtil.getUserMfiGroupId(request);

			//Retrieves data
			try {
				return TempBlLocalServiceUtil.getAllTempBls(mfiId);
			} catch (SystemException ex) {
				return Collections.EMPTY_LIST;
			}
		} catch (NoSuchOrganizationException e) {
			SessionErrors.add(request, "borrower-no-mfi-group");
			return Collections.EMPTY_LIST;
		}
	}

	//
	//	Action Phase Processing Methods
	//
	/**
	 * Creates a Borrower from a sent RenderRequest object.
	 * 
	 * @param request - The request which contains relevant data to build Borrower object.
	 * @return - Borrower object which has been built from the request object.
	 */
	public static Borrower borrowerFromRequest(ActionRequest request) {
		//TODO if edits allowed? retrieve stored entity from db if id indicates it is not new.
		//This prevents losing data which is not set and allows for data to be set at appropriate times.
		//Look at storyFromRequest(ActionRequest request) if example needed.
		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		Borrower borrower = new BorrowerImpl();

		//PK/FK data
		borrower.setBorrower_Id(ParamUtil.getLong(request, "borrower_Id"));
		borrower.setAbacus_Person_Id(ParamUtil.getLong(request, "abacus_Person_Id"));

		//Data
		borrower.setVillage(ParamUtil.getString(request, "village"));
		borrower.setDistrict(ParamUtil.getString(request, "district"));
		borrower.setPdf_Link(ParamUtil.getString(request, "pdf_Link"));
		borrower.setCurrency(ParamUtil.getDouble(request, "currency"));
		borrower.setChanged_By(ParamUtil.getString(request, "changed_By"));
		borrower.setChanged_Time(ParamUtil.getLong(request, "changed_Time"));


		//Portal Identifying info
		borrower.setCompanyId(themeDisplay.getCompanyId());
		borrower.setGroupId(themeDisplay.getScopeGroupId()); //TODO BASE ON MFI, see Story/TempBl

		return borrower;
	}


	/**
	 * Creates a BorrowerLoan from a sent actionRequest object.
	 * 
	 * @param request - The request which contains relevant data to build BorrowerLoan object.
	 * @return - BorrowerLoan object which has been built from the request object.
	 */
	public static BorrowerLoan borrowerLoanFromRequest(ActionRequest request) {
		//TODO if edits allowed? retrieve stored entity from db if id indicates it is not new.
		//This prevents losing data which is not set and allows for data to be set at appropriate times.
		//Look at storyFromRequest(ActionRequest request) if example needed.
		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		BorrowerLoan borrowerLoan = new BorrowerLoanImpl();

		//PK/FK data
		borrowerLoan.setAbacus_Borrower_Loan_Id(ParamUtil.getLong(request, "abacus_Borrower_Loan_Id"));
		borrowerLoan.setBorrower_Id(ParamUtil.getLong(request, "borrower_Id"));

		//Data
		borrowerLoan.setAbacus_mfi_Id(ParamUtil.getLong(request, "abacus_mfi_Id"));
		borrowerLoan.setChanged_By(ParamUtil.getString(request, "changed_By"));
		borrowerLoan.setChanged_Time(ParamUtil.getString(request, "changed_Time"));

		//Portal Identifying info
		borrowerLoan.setCompanyId(themeDisplay.getCompanyId());
		borrowerLoan.setGroupId(themeDisplay.getScopeGroupId()); //TODO BASE ON MFI, see Story/TempBl
		return borrowerLoan;
	}


	/**
	 * Creates a LenderContribution from a sent actionRequest object.
	 * 
	 * @param request - The request which contains relevant data to build LenderContribution object.
	 * @return - LenderContribution object which has been built from the request object.
	 */
	//TODO fix class and call to abacus system for LenderContribution?
	public static String lenderContributionFromRequest(ActionRequest request) {
		return null;
	}

	/**
	 * Creates a Story from a sent actionRequest object.
	 * 
	 * @param request - The request which contains relevant data to build Story object.
	 * @return - Story object which has been built from the request object.
	 * @throws NoSuchOrganizationException - thrown if attempting to create new Story and user not in MFI Organization.
	 */
	public static Story storyFromRequest(ActionRequest request) {
		long storyId = ParamUtil.getLong(request, "story_Id");
		boolean newStory = true;
		Story story = null;

		//Loads existing data if needed before replacing changes or creates new object.
		if (storyId > 0) {
			try {
				story = StoryLocalServiceUtil.getStory(storyId);
				newStory = false;

				//Pointless exceptions as flag wont be set which will allow new story
				//to be made.
			} catch (NoSuchStoryException e) {}
			catch (PortalException e) {}
			catch (SystemException e) {}
		} 

		//Creates new Story if needed.
		if (newStory) {
			//PK/FK data
			story = new StoryImpl();
			story.setStory_Id(storyId); //Shouldn't matter either way.
			story.setAbacus_Borrower_Loan_Id(ParamUtil.getLong(request, "abacus_Borrower_Loan_Id"));

			try {
				//Portal Identifying info
				ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
				story.setCompanyId(themeDisplay.getCompanyId());
				story.setGroupId(ActionUtil.getUserMfiGroupId(request));
				story.setUserId(themeDisplay.getUserId());
			} catch (NoSuchOrganizationException e) {
				SessionErrors.add(request, "story-no-mfi-group");
				return null;
			}
		}

		//Data
		story.setStory_Text(ParamUtil.getString(request, "story_Text"));
		story.setVideo_Url(ParamUtil.getString(request, "video_Url"));
		story.setIs_Good_Enough_For_Marketing(ParamUtil.getBoolean(request, "is_Good_Enough_For_Marketing"));
		story.setIs_Good_Enough_For_Story(ParamUtil.getBoolean(request, "is_Good_Enough_For_Story"));
		story.setStory_Type(ParamUtil.getString(request, "story_Type"));

		return story;
	}

	/**
	 * Creates a new TempBl object from the data which is attached to the request.
	 * 
	 * @param request which contains the relevant data for the Tempbl object.
	 * @return TempBl object which represents the data within the request.
	 * @throws NoSuchOrganizationException - thrown if attempting to create new TempBl and user not in MFI Organization.
	 */
	public static TempBl tempBlFromRequest(ActionRequest request) {
		String borrowerName = ParamUtil.getString(request, "borrower_Name");
		long borrowerLoanId = ParamUtil.getLong(request, "borrower_Loan_Id");
		boolean newTempBl = true;
		TempBl tempBl = null;

		//Loads existing data if it exists.
		try {
			tempBl = TempBlLocalServiceUtil.getTempBl(new TempBlPK(borrowerName, borrowerLoanId));
			newTempBl = false;

			//Pointless exceptions as flag wont be set which will allow new object.
		} catch (NoSuchStoryException e) {}
		catch (PortalException e) {}
		catch (SystemException e) {}

		//Creates new TempBL if needed.
		if (newTempBl) {
			tempBl = new TempBlImpl();

			try {
			//Portal Identifying info
			ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
			tempBl.setCompanyId(themeDisplay.getCompanyId());
				tempBl.setGroupId(ActionUtil.getUserMfiGroupId(request));
			} catch (NoSuchOrganizationException e) {
				SessionErrors.add(request, "borrower-no-mfi-group");
				return null;
			}
		}

		//Data
		tempBl.setBorrower_Name(borrowerName);
		tempBl.setBorrower_Loan_Id(borrowerLoanId);

		return tempBl;
	}
}
