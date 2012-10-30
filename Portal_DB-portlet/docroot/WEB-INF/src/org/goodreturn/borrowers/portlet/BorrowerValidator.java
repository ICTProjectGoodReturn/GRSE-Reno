package org.goodreturn.borrowers.portlet;

import java.util.List;

import org.goodreturn.model.Borrower;

/**
 * Validator class which validates the Borrower object attributes to be used
 * in different situations.
 * 
 * Provides specific errors when conditions are not met.
 * 
 * @author Kyle Pink
 */
public class BorrowerValidator {

	/**
	 * Validates the Borrower object.
	 * 
	 * @param borrower - Borrower object to be validated.
	 * @param errors - List which allows errors to be collected and returned.
	 * @return boolean to indicate if the borrower is valid.
	 */
	public static boolean validateBorrower(Borrower borrower, List<String> errors) {
		//TODO
		return true;
	}
}
