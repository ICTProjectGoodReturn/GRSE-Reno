package org.goodreturn.borrowers.portlet;

import java.util.List;

import org.goodreturn.model.TempBl;
import org.goodreturn.service.TempBlLocalServiceUtil;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;


/**
 * Validator class which validates the TempBl object attributes to be used
 * in different situations.
 * 
 * Provides specific errors when conditions are not met.
 * 
 * @author Kyle Pink
 */
public class TempBlValidator {
	
	/**
	 * Validates the tempBl object.
	 * 
	 * @param story - TempBl object to be validated.
	 * @param errors - List which allows errors to be collected and returned.
	 * @return boolean to indicate if the tempBl is valid.
	 */
	public static boolean validateTempBl(TempBl tempBl, List<String> errors) {
		boolean tempBlValid = true;
		
		//Checks for null.
		if(tempBl == null) {
			errors.add("tempbl-null-error");
			return false;
		}
		
		//Checks Name
		if (tempBl.getBorrower_Name() == null ||
			"".equals(tempBl.getBorrower_Name().trim())) {
			errors.add("tempbl-borrower-name-error");
			tempBlValid = false;
		}
		
		//Checks for borrower loan id.
		if(tempBl.getBorrower_Loan_Id() <= 0) {
			errors.add("tempbl-borrower-loan-id-error");
			tempBlValid = false;
		}
		
		//Checks if already exists within database.
		TempBl fromDB = null;
		try {
			fromDB = TempBlLocalServiceUtil.getTempBl(tempBl.getBorrower_Loan_Id());
		} catch (PortalException e) {
		} catch (SystemException e) {
		}
		if (fromDB != null) {
			errors.add("tempbl-already-exists-error");
			tempBlValid = false;
		}
		
		return tempBlValid;
	}
}
