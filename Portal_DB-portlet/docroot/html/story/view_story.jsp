<%--
/**
* View for final and initial Story objects which is apart of
* for BorrowerLoan objects. Should be used in conjunction.
*/
--%>
<%@include file="/html/init.jsp"%>

<!-- Data Definitions -->
<%
	Story story = (Story) request.getAttribute(WebKeys.STORY_ENTRY);
	String redirect = ParamUtil.getString(request, "redirect");

	//Retrieves story type text and attribute.
	String storyTypeText = "Unknown Story Type";
	String storyType = "";
	if (story != null) {
		storyType = story.getStory_Type();
		storyTypeText = storyType + "-story";
	}

	String actionButtonText = (story == null ? "add-new-" + storyType : "edit-" + storyType);
%>

<!-- Link Definitions -->
<portlet:renderURL var="addEditStoryUrl">
	<portlet:param name="jspPage" value="/html/story/edit_story.jsp" />
</portlet:renderURL>
<portlet:actionURL name="updateStory" var="updateStoryUrl">
	<portlet:param name="redirect" value="<%= redirect %>" />
</portlet:actionURL>
<portlet:renderURL windowState="normal" var="backURL">
	<portlet:param name="jspPage" value="/html/borrowersportlet/view.jsp" />
</portlet:renderURL>

<!-- Structure Definition -->
<liferay-ui:header title="Story Entry" backLabel="TODO" backURL="<%=backURL %>" />
<!-- TODO ERRORS/MESSAGES -->
<liferay-ui:error key="story-update-error" message="story-update-error" />
<liferay-ui:error key="story-add-error" message="story-add-error" />
<liferay-ui:error key="story-data-invalid-error" message="story-data-invalid-error" />
<liferay-ui:success key="story-update-success" message="story-update-success"/>
<liferay-ui:success key="story-add-success" message="story-add-success"/>


<c:if test="<%=story!=null%>">
	<aui:panel label="Story Text" >
		<aui:panel>
			<b>Marked as Marketing publication acceptable: </b><%=story.getIs_Good_Enough_For_Marketing()%>
			<b>Marked as Story publication acceptable: </b><%=story.getIs_Good_Enough_For_Story()%>
			
			Video URL: <%=!(story.getVideo_Url() == null || ""
								.equals(story.getVideo_Url())) ? "<a href="
								+ story.getVideo_Url() + ">video link</a>"
								: "none"%>
		</aui:panel>
		<aui:panel>
			<h2>Story Text:</h2>
			<p><%=story.getStory_Text()%></p>
		</aui:panel>
	</aui:panel>
	<aui:button type="cancel" value="Cancel" onClick="<%=redirect %>" />
</c:if>

