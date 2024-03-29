package org.goodreturn.story;

import java.io.Serializable;
import java.util.Locale;
import java.util.Map;

import org.goodreturn.model.Story;
import org.goodreturn.service.StoryLocalServiceUtil;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.workflow.BaseWorkflowHandler;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.service.ServiceContext;

public class StoryWorkflowHandler extends BaseWorkflowHandler {
	
	public static final String CLASS_NAME = Story.class.getName();
	
	@Override
	public String getClassName() {
		return CLASS_NAME;
	}

	@Override
	public String getType(Locale locale) {
		return LanguageUtil.get(locale, "model.resource." + CLASS_NAME);
	}

	@Override
	public Object updateStatus(int status, Map<String, Serializable> workflowContext)
	    throws PortalException, SystemException {
		
	    long userId = GetterUtil.getLong(workflowContext.get(WorkflowConstants.CONTEXT_USER_ID));
	    
	    long resourcePrimKey = GetterUtil.getLong(workflowContext.get(WorkflowConstants.CONTEXT_ENTRY_CLASS_PK));
	    
	    ServiceContext serviceContext = (ServiceContext) workflowContext.get("serviceContext");
	                               
	    return StoryLocalServiceUtil.updateStatus(userId, resourcePrimKey, status, serviceContext);
	}
}
