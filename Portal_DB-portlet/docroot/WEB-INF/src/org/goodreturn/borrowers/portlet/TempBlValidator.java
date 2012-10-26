package org.goodreturn.borrowers.portlet;

import java.util.List;

import org.goodreturn.model.TempBl;
import org.goodreturn.service.TempBlLocalServiceUtil;
import org.goodreturn.service.persistence.TempBlPK;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

public class TempBlValidator {
	
	public static boolean validateTempBl(TempBl tempBl, List<String> errors) {
		//TODO add error entries for each check.
		boolean tempBlValid = true;
		//Checks for null.
		if(tempBl == null) {
			errors.add("tempbl-null-error");
			tempBlValid = false;
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
			fromDB = 
					TempBlLocalServiceUtil.getTempBl(new TempBlPK(tempBl.getBorrower_Name(),
					tempBl.getBorrower_Loan_Id()));
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
