package org.goodreturn;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import com.liferay.portlet.login.action.CreateAccountAction;

public class ExtCreateAccountAction extends CreateAccountAction {
	
	@Override
	protected void addUser(ActionRequest actionRequest,
			ActionResponse actionResponse) throws Exception {
		
		// TODO
		// Add new behavior here.
		
		super.addUser(actionRequest, actionResponse);
	}

}
