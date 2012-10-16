package org.goodreturn.borrowers.portlet;

import java.util.Collections;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.RenderRequest;

import org.goodreturn.model.Borrower;
import org.goodreturn.model.Story;
import org.goodreturn.model.Supplementary_Table;
import org.goodreturn.model.impl.BorrowerImpl;
import org.goodreturn.model.impl.StoryImpl;
import org.goodreturn.service.BorrowerLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
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
	//	Render Phase Methods (called from rendering phase)
	//
	/**
	 * Retrieves all borrowers for specific MFI. Designed to be called from rendering phase. 
	 * 
	 * @param request Render requested which has access from the render phase.
	 * @return List of Borrower objects for specific MFI.
	 */
	public static List<Borrower> getBorrowers(RenderRequest request) {
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
	 * Retrieves all Supplementary_Table loans for specific Borrower. Designed to be called from rendering phase. 
	 * 
	 * @param request Render request which has access from the render phase.
	 * @return List of Supplementary_Table objects for specific Borrower
	 */
	//TODO FIX Supplementary_Table to Loan and narrowed down from Borrower
	public static List<Supplementary_Table> getSupplementary_Tables(RenderRequest request) {
		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		long groupId = themeDisplay.getScopeGroupId();
		
		List<Supplementary_Table> tempResults;

		try {
			//TODO uncomment/fix and remove throw.
			//tempResults = Supplementary_TableLocalServiceUtil.getAllSupplementary_Tables(groupId);
			throw new SystemException("not implemented");
		}

		catch (SystemException se) {
			tempResults = Collections.EMPTY_LIST;
		}

		return tempResults;
	}
	
	//TODO need to think more about this one as data would be accubus based data
	//TODO NOT SURE IF IT WILL BE CALLED MoneyLent
	/* *
	 * Retrieves all MoneyLent for specific Loan. Designed to be called from rendering phase. 
	 * 
	 * @param request Render request which has access from the render phase.
	 * @return List of MoneyLent objects for specific Loan.
	 */
	//TODO uncomment and fix for accubus access.
	/*
	public static List<MoneyLent> getMoneyLent(RenderRequest request) {
		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		long groupId = themeDisplay.getScopeGroupId();
		
		List<MoneyLent> tempResults;

		try {
			//TODO uncomment/fix and remove throw.
			//tempResults = DonationLocalServiceUtil.getAllSupplementary_Tables(groupId);
			throw new SystemException("not implemented");
		}

		catch (SystemException se) {
			tempResults = Collections.EMPTY_LIST;
		}

		return tempResults;
	}
	*/
	
	/**
	 * Retrieves InitialStory for specific Borrower. Designed to be called from rendering phase. 
	 * 
	 * @param request Render request which has access from the render phase.
	 * @return Story object which represents the InitialStory for specific Loan. Returns null if not existent.
	 */
	public static Story getInitialStory(RenderRequest request) {
		//TODO FIX
		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		long groupId = themeDisplay.getScopeGroupId();
		
		Story tempResult;

		try {
			//TODO uncomment/fix and remove throw.
			//tempResult = StoryLocalServiceUtil.getInitialStory(loanId);
			throw new SystemException("not implemented");
		} catch (SystemException se) {
			tempResult = null;
		}

		return tempResult;
	}
	
	/**
	 * Retrieves FinalStory for specific Borrower. Designed to be called from rendering phase. 
	 * 
	 * @param request Render request which has access from the render phase.
	 * @return Story object which represents the FinalStory for specific Loan. Returns null if not existent.
	 */
	public static Story getFinalStory(RenderRequest request) {
		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		long groupId = themeDisplay.getScopeGroupId();
		
		Story tempResult;

		try {
			//TODO uncomment/fix and remove throw.
			//tempResults = StoryLocalServiceUtil.getFinalStory(loanId);
			throw new SystemException("not implemented");
		} catch (SystemException se) {
			tempResult = null;
		}

		return tempResult;
	}

	//
	//	Action Phase Methods (called from action phase)
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
		
		//FK data
		story.setLoan_Account_Id(ParamUtil.getLong(request, "loan_Account_Id"));
		story.setStory_Id(ParamUtil.getLong(request, "Story_Id"));
		
		//Data
		story.setStory_Text(ParamUtil.getString(request, "story_Text"));
		story.setVideo_Url(ParamUtil.getString(request, "video_Url"));
		story.setIs_Good_Enough_For_Marketing(ParamUtil.getBoolean(request, "is_Good_Enough_For_Marketing"));
		story.setIs_Good_Enough_For_Story(ParamUtil.getBoolean(request, "is_Good_Enough_For_Story"));
		//TODO Add Story Type
		//story.set(ParamUtil.getString(request, ""));
		
		//Portal Identifying info
		story.setCompany_Id(themeDisplay.getCompanyId());
		story.setGroup_Id(themeDisplay.getScopeGroupId());
		story.setUser_Id(themeDisplay.getUserId());

		return story;
	}
	
	
	
	
}
