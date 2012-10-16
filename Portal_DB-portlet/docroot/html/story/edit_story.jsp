<%--
/**
* TODO
*/
--%>
<%@include file="/html/init.jsp"%>

<!-- Data Definitions -->
<%
Story story = (Story) request.getAttribute("storyObject");
String redirect = ParamUtil.getString(request, "redirect");

//long resourcePrimKey = BeanParamUtil.getLong(slogan, request, "sloganId");
//int status = BeanParamUtil.getInteger(slogan, request, "status", WorkflowConstants.STATUS_DRAFT);

String storyTypeText = "Unknown Story Type";
	/*
	switch (story.getStory_Type()) {
	case 'f':
		storyTypeText = "final-story";
		break;
	case 'i':
		storyTypeText = "initial-story";
		break;
	}
	*/
%>

<!-- Link Definitions -->
<portlet:renderURL windowState="normal" var="backUrl">
	<portlet:param name="jspPage" value="/html/storyportlet/view.jsp" />
</portlet:renderURL>
<portlet:actionURL name="updateStory" var="updateStoryUrl">
	<portlet:param name="redirect" value="<%= redirect %>" />
</portlet:actionURL>
<portlet:renderURL var="cancelUrl">
	<portlet:param name="jspPage" value="/html/storyportlet/view.jsp" />
</portlet:renderURL>

<liferay-ui:header backURL="<%= backUrl %>"
	title='<%= (story == null) ? "New " + storyTypeText : storyTypeText + " for loan " + story.getLoan_Account_Id()%>'
/>

<aui:form action="<%=updateStoryUrl %>" method="post">
	
	<aui:fieldset>
		<aui:model-context bean="<%=story%>" model="<%= Story.class %>" />
		
		<c:if test="<%= story != null %>">
			<aui:workflow-status id="<%= String.valueOf(story.getStory_Id()) %>" status="<%= story.getStatus() %>" />
		</c:if>
		
		<aui:column>
			
			<liferay-ui:error key="fields-required" message="fields-required" />
			<liferay-ui:success key="story-saved-successfully" message="story-saved-successfully" />
			<liferay-ui:error key="story-fields-required" message="story-fields-required" />
			
			<!-- TODO Borrower information?? -->
			
			<aui:input name="story_Id" type="hidden" />
			
			<aui:input name="loan_Account_Id" type="hidden" />
			
			<aui:input label="Good enough for marketing?" name="is_Good_Enough_For_Marketing" first="true" autoFocus="true" />
			
			<aui:input label="Good enough for final story?" name="is_Good_Enough_For_Story" />
			
			<aui:input label="Video URL" name="video_Url" last="true" />
			
		</aui:column>
		
		<aui:column>
			<aui:field-wrapper label='<%=storyTypeText + " Text"%>'>
				<liferay-ui:input-editor name="story_Text" toolbarSet="liferay-article" initMethod="initEditor" width="200"  />
				<!--
				<script type="text/javascript">
					function <portlet:namespace />initEditor() { return "<%= UnicodeFormatter.toString(story == null ? StringPool.BLANK : story.getStory_Text()) %>"; }
				</script>
				-->
			</aui:field-wrapper>
		</aui:column>
		
		<aui:button-row>
			<aui:button type="submit" />
			<aui:button type="cancel" value="Cancel" onClick="<%=cancelUrl %>" />
		</aui:button-row>
		
	</aui:fieldset>

</aui:form>