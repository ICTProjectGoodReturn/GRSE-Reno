package org.goodreturn.borrowers.portlet;

import java.util.List;

import org.goodreturn.model.TempBl;

public class TempBlValidator {
	
	public static boolean validateTempBl(TempBl tempBl, List<String> errors) {
		//TODO add error entries for each check.
		boolean tempBlValid = true;
		//Checks for null.
		if(tempBl == null) {
			tempBlValid = false;
		}
		
		//Checks Name
		if (tempBl.getBorrower_Name() == null ||
			"".equals(tempBl.getBorrower_Name().trim())) {
			tempBlValid = false;
		}
		
		//Checks for borrower loan id.
		if(tempBl.getBorrower_Loan_Id() <= 0) {
			tempBlValid = false;
		}
		
		return tempBlValid;
	}
}
