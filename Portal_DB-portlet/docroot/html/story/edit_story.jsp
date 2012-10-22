<%--
/**
* Edit for final and initial Story objects which is apart of
* for BorrowerLoan objects. Should be used in conjunction.
*/
--%>
<%@page import="org.goodreturn.service.StoryLocalServiceUtil"%>
<%@include file="/html/init.jsp"%>

<!-- Data Definitions -->
<%
	//Retrieves story and other sent data.
	Story story = (Story) request.getAttribute(WebKeys.STORY_ENTRY);
	if (story == null) {
		story = ActionUtil.getEditableStory(renderRequest);
	}
	String redirect = ParamUtil.getString(request, "redirect");

	long resourcePrimKey = BeanParamUtil.getLong(story, request, "story_Id");
	int status = BeanParamUtil.getInteger(story, request, "status",
			WorkflowConstants.STATUS_DRAFT);

	//Retrieves story type text and attribute.
	String storyTypeText;
	String storyType;
	if (story == null) {
		storyType = ParamUtil.getString(request, "story_Type");
		storyTypeText = storyType + "-story";
	} else {
		storyType = story.getStory_Type();
		storyTypeText = storyType + "-story";
	}
%>

<!-- Link Definitions -->
<portlet:renderURL windowState="normal" var="backUrl">
	<portlet:param name="jspPage" value="/html/storyportlet/view_story.jsp" />
</portlet:renderURL>
<portlet:actionURL name="updateStory" var="updateStoryUrl">
	<portlet:param name="redirect" value="<%=redirect%>" />
</portlet:actionURL>
<portlet:renderURL var="cancelUrl">
	<portlet:param name="jspPage" value="/html/borrowersportlet/view.jsp" />
</portlet:renderURL>

<liferay-ui:header backURL="<%=backUrl%>"
	title='<%=(story.getStory_Id() == 0) ? "New " + storyType + " story"
					: storyType + " story for loan "
							+ story.getBorrower_Loan_Id()%>'
/>

<aui:form action="<%=updateStoryUrl.toString()%>" method="post">
	
	<aui:fieldset>
		<aui:model-context bean="<%=story%>" model="<%=Story.class%>" />
		
		<c:if test="<%=(story != null && story.getStory_Id() > 0)%>">
			<aui:workflow-status id="<%=String.valueOf(story.getStory_Id())%>" status="<%=story.getStatus()%>" />
		</c:if>
	
		<!-- TODO -->
		<liferay-ui:error key="story-update-error" message="story-update-error" />
		<liferay-ui:error key="story-add-error" message="story-add-error" />
		<liferay-ui:error key="story-data-invalid-error" message="story-data-invalid-error" />
		<liferay-ui:success key="story-update-success" message="story-update-success"/>
		<liferay-ui:success key="story-add-success" message="story-add-success"/>

		<!-- TODO Borrower information?? -->
		
		<aui:input name="story_Id" type="text" />
		
		<aui:input name="borrower_Loan_Id" type="text" />
		
		<aui:input name="story_Type" value="<%=storyType%>" type="text" />
		
		<aui:input label="Good enough for marketing?" name="is_Good_Enough_For_Marketing" first="true" autoFocus="true" />
		
		<aui:input label="Good enough for final story?" name="is_Good_Enough_For_Story" />
		
		<aui:input label="Video URL" name="video_Url" last="true" />
		
		<aui:field-wrapper label='<%=storyTypeText + " Text"%>'>
			<liferay-ui:input-editor name="story_Text" toolbarSet="liferay-article" initMethod="initEditor" width="200"  />
			<script type="text/javascript">
				function <portlet:namespace />initEditor() { return "<%=UnicodeFormatter
								.toString(story == null ? StringPool.BLANK
										: story.getStory_Text())%>"; }
			</script>
		</aui:field-wrapper>
		
		<aui:button-row>
			<aui:button type="submit" />
			<aui:button type="cancel" value="Cancel" onClick="<%=backUrl%>" />
		</aui:button-row>
		
	</aui:fieldset>

</aui:form>