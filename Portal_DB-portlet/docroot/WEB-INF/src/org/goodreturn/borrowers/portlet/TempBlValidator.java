package org.goodreturn.borrowers.portlet;

import org.goodreturn.model.TempBl;

public class TempBlValidator {
	
	public static boolean validateTempBl(TempBl tempBl) {
		//TODO add error entries for each check.
		//Checks for null.
		if(tempBl == null) {
			return false;
		}
		
		//Checks Name
		if (tempBl.getBorrower_Name() == null ||
			"".equals(tempBl.getBorrower_Name().trim())) {
			return false;
		}
		
		if(tempBl.getBorrower_Loan_Id() <= 0) {
			return false;
		}
		
		//All valid
		return true;
	}
}
