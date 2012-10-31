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
	
	//Retrieves story data.
	Story story = (Story) request.getAttribute(WebKeys.STORY_ENTRY);
	if (story == null) {
		story = ActionUtil.getEditableStory(renderRequest);
	}

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

<!-- Link Definition -->
<portlet:actionURL name="updateStory" var="updateStoryUrl" />

<liferay-ui:header title='<%="Edit Story for Loan "	+ story.getAbacus_Borrower_Loan_Id()%>' />

<!-- Error and Success messages -->
<liferay-ui:error key="story-update-error" message="Errors encountered, story could not be updated." />
<liferay-ui:error key="story-data-invalid-error" message="Story data is invalid, check story input for problems." />
<liferay-ui:error key="story-null-error" message="Story data could not loaded for save." />
<liferay-ui:error key="story-type-error" message="Story type provided is not valid." />
<liferay-ui:error key="story-text-error" message="Story text provided is too long, please shorten." />
<liferay-ui:error key="story-loan-id-error" message="Story's loan ID is not valid." />
<liferay-ui:error key="story-vid-url-error" message="URL for story is not a valid URL address." />
<liferay-ui:success key="story-update-success" message="Success! Story has been updated."/>

<c:if test="<%=story!=null %>">
	<aui:form action="<%=updateStoryUrl.toString()%>" method="post">
		
		<aui:fieldset>
			<aui:model-context bean="<%=story%>" model="<%=Story.class%>" />
			
			<aui:workflow-status id="<%=String.valueOf(story.getStory_Id())%>" status="<%=story.getStatus()%>" />
			
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
			
			<aui:button type="submit" value="Save Edit" />
			
		</aui:fieldset>
	
	</aui:form>
</c:if>