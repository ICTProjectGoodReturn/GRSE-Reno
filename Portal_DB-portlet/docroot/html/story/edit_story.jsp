<%--
/**
* Edit for final and initial Story objects which is apart of
* for BorrowerLoan objects. Should be used in conjunction.
*/
--%>
<%@include file="/html/init.jsp"%>

<!-- Data Definitions -->
<%
	//Gets loan data.
	long tempBlLoanId = ParamUtil.getLong(renderRequest, WebKeys.ATTR_TEMPBL_LOAN_ID);
	String tempBlLoanBorrowerName = ParamUtil.getString(renderRequest, WebKeys.ATTR_TEMPBL_BORROWER_NAME);
	boolean workflowInterface = ParamUtil.getBoolean(renderRequest, WebKeys.WORKFLOW_INTERFACE);
	
	//Retrieves story data.
	Story story = (Story) request.getAttribute(WebKeys.STORY_ENTRY);
	if (story == null) {
		story = ActionUtil.getEditableStory(renderRequest);
	}
	String redirect = ParamUtil.getString(request, "redirect");

	//Prepares story type text.
	String storyTypeText = story.getStory_Type();
	if (storyTypeText != null && storyTypeText.length() > 1) {
		storyTypeText = storyTypeText.substring(0, 1).toUpperCase() + storyTypeText.substring(1);
	} else {
		storyTypeText = "Unknown";
	}

	long resourcePrimKey = BeanParamUtil.getLong(story, request, "story_Id");
	int status = BeanParamUtil.getInteger(story, request, "status", WorkflowConstants.STATUS_DRAFT);
%>

<!-- Link Definitions -->
<portlet:renderURL windowState="normal" var="backUrl">
	<portlet:param name="jspPage" value="/html/story/list_stories.jsp" />
	<portlet:param name="<%=WebKeys.ATTR_TEMPBL_LOAN_ID%>" value="<%=String.valueOf(tempBlLoanId)%>"/>
	<portlet:param name="<%=WebKeys.ATTR_TEMPBL_BORROWER_NAME%>" value="<%=tempBlLoanBorrowerName%>"/>
</portlet:renderURL>
<portlet:actionURL name="updateStory" var="updateStoryUrl">
	<portlet:param name="jspPage" value="/html/story/list_stories.jsp"/>
	<portlet:param name="<%=WebKeys.ATTR_TEMPBL_LOAN_ID%>" value="<%=String.valueOf(tempBlLoanId)%>"/>
	<portlet:param name="<%=WebKeys.ATTR_TEMPBL_BORROWER_NAME%>" value="<%=tempBlLoanBorrowerName%>"/>
	<portlet:param name="<%=WebKeys.WORKFLOW_INTERFACE %>" value="<%=String.valueOf(workflowInterface) %>"/>
</portlet:actionURL>

<c:choose>
	<c:when test="<%=workflowInterface%>">
		<liferay-ui:header title='<%=(story.getStory_Id() == 0) ? "New " + storyTypeText + " Story"
							: storyTypeText + " Story for Loan "
									+ story.getAbacus_Borrower_Loan_Id()%>'
		/>
	</c:when>
	<c:otherwise>
		<liferay-ui:header backURL="<%=backUrl%>"
			title='<%=(story.getStory_Id() == 0) ? "New " + storyTypeText + " Story"
							: storyTypeText + " Story for Loan "
									+ story.getAbacus_Borrower_Loan_Id()%>'
		/>
	</c:otherwise>
</c:choose>

<!-- Error and Success messages -->
<liferay-ui:error key="story-update-error" message="Errors encountered, story could not be updated." />
<liferay-ui:error key="story-add-error" message="Errors encountered, story could not be added." />
<liferay-ui:error key="story-data-invalid-error" message="Story data is invalid, check story input for problems." />
<liferay-ui:error key="story-null-error" message="Story data could not loaded for save." />
<liferay-ui:error key="story-type-error" message="Story type provided is not valid." />
<liferay-ui:error key="story-text-error" message="Story text provided is too long, please shorten." />
<liferay-ui:error key="story-loan-id-error" message="Story loan id is not valid." />
<liferay-ui:error key="story-vid-url-error" message="URL for story is not a valid URL address." />
<liferay-ui:error key="no-mfi-group" message="Story data inaccessible, not in required MFI Group" />
<liferay-ui:success key="story-update-success" message="Success! Story has been updated."/>

<c:if test="<%=story!=null %>">
	<aui:form action="<%=updateStoryUrl.toString()%>" method="post">
		
		<aui:fieldset>
			<aui:model-context bean="<%=story%>" model="<%=Story.class%>" />
			
			<c:if test="<%=(story != null && story.getStory_Id() > 0)%>">
				<aui:workflow-status id="<%=String.valueOf(story.getStory_Id())%>" status="<%=story.getStatus()%>" />
			</c:if>
		
	
			<!-- TODO Borrower information?? -->
			
			<aui:input name="story_Id" type="hidden" />
			
			<aui:input name="abacus_Borrower_Loan_Id" type="hidden" />
			
			<aui:input name="story_Type" type="hidden" />
			
			<aui:input label="Video good enough for marketing?" name="is_Good_Enough_For_Marketing" first="true" autoFocus="true" />
			
			<aui:input label="Video good enough for story?" name="is_Good_Enough_For_Story" />
			
			<aui:input label="Video URL" name="video_Url" last="true" />
			
			<aui:field-wrapper label='<%=storyTypeText + " Story Text:"%>'>
				<liferay-ui:input-editor name="story_Text" toolbarSet="liferay-article" initMethod="initEditor" width="200"  />
				<script type="text/javascript">
					function <portlet:namespace />initEditor() { return "<%=UnicodeFormatter
									.toString(story == null ? StringPool.BLANK
											: story.getStory_Text())%>"; }
				</script>
			</aui:field-wrapper>
			
			<aui:button-row>
				<aui:button type="submit" />
				<c:if test="<%=!workflowInterface%>">
					<aui:button type="cancel" value="Cancel" onClick="<%=backUrl.toString()%>" />
				</c:if>
			</aui:button-row>
			
		</aui:fieldset>
	
	</aui:form>
</c:if>