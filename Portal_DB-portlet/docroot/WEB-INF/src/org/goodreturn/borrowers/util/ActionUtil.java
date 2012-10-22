package org.goodreturn.borrowers.util;

import java.util.Collections;
import java.util.List;

import javax.portlet.ActionRequest;

import org.goodreturn.model.Borrower;
import org.goodreturn.model.BorrowerLoan;
import org.goodreturn.model.Story;
import org.goodreturn.model.impl.BorrowerImpl;
import org.goodreturn.model.impl.StoryImpl;
import org.goodreturn.service.BorrowerLoanLocalServiceUtil;
import org.goodreturn.service.BorrowerLoanServiceUtil;
import org.goodreturn.service.BorrowerLocalServiceUtil;
import org.goodreturn.service.StoryLocalServiceUtil;
import org.goodreturn.borrowers.util.WebKeys;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
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
	/**
	 * Retrieves all borrowers for specific MFI. Designed to be called from action phase. 
	 * 
	 * @param request - action requested which has access from the action phase.
	 * @return List of Borrower objects for specific MFI.
	 */
	public static List<Borrower> getBorrowers(ActionRequest request) {
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
	 * Retrieves single specific borrower based on borrower_Id. Designed to be called from action phase. 
	 * 
	 * @param request - action requested which has access from the action phase.
	 * @return Specific Borrower object for specific borrower_Id. null if not found.
	 */
	public static Borrower getBorrower(ActionRequest request) {
		//Values to retrieve data.
		long borrowerId = ParamUtil.getLong(request, WebKeys.BORROWER_ID);
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
	
	/**
	 * Retrieves all BorrowerLoans for specific borrower_Id. Designed to be called from action phase. 
	 * 
	 * @param request Render request which has access from the action phase.
	 * @return List of BorrowerLoan objects for specific Borrower.
	 */
	public static List<BorrowerLoan> getBorrowerLoans(ActionRequest request) {
		//Retrieves values needed for request.
		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		long groupId = themeDisplay.getScopeGroupId();
		
		long borrowerId = ParamUtil.getLong(request, WebKeys.BORROWER_ID);
		List<BorrowerLoan> tempResults;

		try {
			//TODO FIX
			//tempResults = BorrowerLoanLocalServiceUtil.getAllBorrowerLoans(groupId, borrowerId);
			throw new SystemException("not implemented");
		} catch (SystemException se) {
			tempResults = Collections.EMPTY_LIST;
		}

		return tempResults;
	}
	
	/**
	 * Retrieves specific BorrowerLoan for specific borrower_Loan_Id. Designed to be called from action phase. 
	 * 
	 * @param request Render request which has access from the action phase.
	 * @return specific BorrowerLoan object for specific borrower_Loan_Id.
	 */
	public static BorrowerLoan getBorrowerLoan(ActionRequest request) {
		//Retrieves values needed for request.
		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		long groupId = themeDisplay.getScopeGroupId();
		
		long borrowerLoanId = ParamUtil.getLong(request, WebKeys.BORROWER_LOAN_ID);
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
	
	/**
	 * Retrieves all LenderContribution for specific Loan. Designed to be called from action phase. 
	 * 
	 * @param request Render request which has access from the action phase.
	 * @return List of LenderContribution objects for specific Loan - based on loan_Id.
	 */
	//TODO fix class type and retrieve from accubus.
	public static List<String> getLenderContributions(ActionRequest request) {
		return null;
	}

	/**
	 * Retrieves specific LenderContribution for specific lender_Contribution_Id. Designed to be called from action phase. 
	 * 
	 * @param request Render request which has access from the action phase.
	 * @return specific LenderContribution object.
	 */
	//TODO fix class type and retrieve from accubus.
	public static String getLenderContribution(ActionRequest request) {
		return null;
	}
	
	/**
	 * Retrieves InitialStory for specific Borrower. Designed to be called from action phase. 
	 * 
	 * @param request Render request which has access from the action phase.
	 * @return Story object which represents the InitialStory for specific Loan. Returns null if not existent.
	 */
	public static Story getInitialStory(ActionRequest request) {
		return getStoryByType(request, "initial");
	}
	
	/**
	 * Retrieves FinalStory for specific Borrower. Designed to be called from action phase. 
	 * 
	 * @param request Render request which has access from the action phase.
	 * @return Story object which represents the FinalStory for specific Loan. Returns null if not existent.
	 */
	public static Story getFinalStory(ActionRequest request) {
		return getStoryByType(request, "final");
	}
	
	private static Story getStoryByType(ActionRequest request, String storyType) {
		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		long groupId = themeDisplay.getScopeGroupId();
		
		long borrowerLoanId = ParamUtil.getLong(request, WebKeys.BORROWER_LOAN_ID);
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

	//
	//	Action Phase Processing Methods
	//
	/**
	 * Creates a Borrower from a sent actionRequest object.
	 * 
	 * @param request - The request which contains relevant data to build Borrower object.
	 * @return - Borrower object which has been built from the request object.
	 */
	public static Borrower borrowerFromRequest(ActionRequest request) {
		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		Borrower borrower = new BorrowerImpl();
		
		//FK data
		//TODO SPECIFIC
		//borrower.setLoan_Account_Id(ParamUtil.getLong(request, "loan_Account_Id"));
		
		//Data
		//TODO SPECIFIC
		//borrower.setStory_Text(ParamUtil.getString(request, "story_Text"));
		
		//Portal Identifying info
		//TODO UNCOMMENT
		//borrower.setCompany_Id(themeDisplay.getCompanyId());
		//borrower.setGroup_Id(themeDisplay.getScopeGroupId());
		//borrower.setUser_Id(themeDisplay.getUserId());

		return borrower;
	}
	
	/**
	 * Creates a Supplementary_Table from a sent actionRequest object.
	 * 
	 * @param request - The request which contains relevant data to build Supplementary_Table object.
	 * @return - Supplementary_Table object which has been built from the request object.
	 */
	//TODO UNCOMMENT
	//public static Supplementary_Table supplementary_TableFromRequest(ActionRequest request) {
		//ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		//Supplementary_Table supplementary_Table = new Supplementary_TableImpl();
		
		//FK data
		//TODO SPECIFIC
		//supplementary_Table.setLoan_Account_Id(ParamUtil.getLong(request, "loan_Account_Id"));
		
		//Data
		//TODO SPECIFIC
		//supplementary_Table.setStory_Text(ParamUtil.getString(request, "story_Text"));
		
		//Portal Identifying info
		//TODO UNCOMMENT
		//supplementary_Table.setCompany_Id(themeDisplay.getCompanyId());
		//supplementary_Table.setGroup_Id(themeDisplay.getScopeGroupId());
		//supplementary_Table.setUser_Id(themeDisplay.getUserId());

		//TODO UNCOMMENT
		//return loan;
	//}

	//TODO FIX
	/* *
	 * Creates a MoneyLent from a sent actionRequest object.
	 * 
	 * @param request - The request which contains relevant data to build MoneyLent object.
	 * @return - MoneyLent object which has been built from the request object.
	 */
	//TODO UNCOMMENT
	//public static MoneyLent moneyLentFromRequest(ActionRequest request) {
		//ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		//MoneyLent moneyLent = new MoneyLentImpl();
		
		//FK data
		//TODO SPECIFIC
		//moneyLent.setLoan_Account_Id(ParamUtil.getLong(request, "loan_Account_Id"));
		
		//Data
		//TODO SPECIFIC
		//moneyLent.setStory_Text(ParamUtil.getString(request, "story_Text"));
		
		//Portal Identifying info
		//TODO UNCOMMENT
		//moneyLent.setCompany_Id(themeDisplay.getCompanyId());
		//moneyLent.setGroup_Id(themeDisplay.getScopeGroupId());
		//moneyLent.setUser_Id(themeDisplay.getUserId());

		//TODO UNCOMMENT
		//return moneyLent;
	//}
	
	/**
	 * Creates a Story from a sent actionRequest object.
	 * 
	 * @param request - The request which contains relevant data to build Story object.
	 * @return - Story object which has been built from the request object.
	 */
	public static Story storyFromRequest(ActionRequest request) {
		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		Story story = new StoryImpl();
		
		//PK/FK data
		story.setStory_Id(ParamUtil.getLong(request, "Story_Id"));
		story.setAbacus_Borrower_Loan_Id(ParamUtil.getLong(request, "borrower_Loan_Id"));
		
		//Data
		story.setStory_Text(ParamUtil.getString(request, "story_Text"));
		story.setVideo_Url(ParamUtil.getString(request, "video_Url"));
		story.setIs_Good_Enough_For_Marketing(ParamUtil.getBoolean(request, "is_Good_Enough_For_Marketing"));
		story.setIs_Good_Enough_For_Story(ParamUtil.getBoolean(request, "is_Good_Enough_For_Story"));
		story.setStory_Type(ParamUtil.getString(request, "story_Type"));
		
		//Portal Identifying info
		story.setCompany_Id(themeDisplay.getCompanyId());
		story.setGroup_Id(themeDisplay.getScopeGroupId());
		story.setUser_Id(themeDisplay.getUserId());

		return story;
	}
}
