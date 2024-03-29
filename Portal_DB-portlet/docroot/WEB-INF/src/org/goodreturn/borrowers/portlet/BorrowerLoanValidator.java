package org.goodreturn.borrowers.portlet;

import java.util.List;

import org.goodreturn.model.BorrowerLoan;

/**
 * Validator class which validates the BorrowerLoan object in numerous situations typically
 * before adding the object to the database.
 * 
 * Provides specific errors when conditions are not met.
 * 
 * @author Kyle Pink
 */
public class BorrowerLoanValidator {

	/**
	 * Validates the BorrowerLoan object.
	 * 
	 * @param borrerLoan - BorrowerLoan object to be validated.
	 * @param errors - List which allows errors to be collected and returned.
	 * @return boolean to indicate if the borrerLoan is valid.
	 */
	public static boolean validateBorrowerLoan(BorrowerLoan borrowerLoan, List<String> errors) {
		//TODO
		return true;
	}
}
