package org.goodreturn.borrowers.portlet;

import java.util.List;

import org.goodreturn.model.Story;

import com.liferay.portal.kernel.util.Validator;

/**
 * Validator class which validates the Story object in numerous situations.
 * 
 * @author Kyle Pink
 */
public class StoryValidator {

	/**
	 * Validates the story object.
	 * 
	 * @param story - Story object to be validated.
	 * @param errors - List which allows errors to be collected and returned.
	 * @return boolean to indicate if the story is valid.
	 */
	public static boolean validateStory(Story story, List<String> errors) {
		//TODO add error entries for each of the errors.
		//null check
		if (story == null) {
			return false;
		}

		//Valid story types.
		if (!(story.getStory_Type().equals("initial") || story.getStory_Type().equals("final"))) {
			return false;
		}

		//non null borrower_loan_Id
		if (story.getAbacus_Borrower_Loan_Id() <= 0) {
			return false;
		}

		//URL
		//Only validates for URL if videoUrl exists.
		if (!story.getVideo_Url().equals("")) {
			//If pointless white space remove it.
			if (story.getVideo_Url().trim().equals("")) {
				story.setVideo_Url("");
				
			} else if (!Validator.isUrl(story.getVideo_Url())) {
				return false;
			}
		}
		
		return true;
	}
}
