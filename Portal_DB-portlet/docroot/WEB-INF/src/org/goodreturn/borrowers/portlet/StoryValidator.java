package org.goodreturn.borrowers.portlet;

import java.util.List;

import org.goodreturn.model.Story;

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
	public static boolean validateStory(Story story, List errors) {
		return true;
	}
}
