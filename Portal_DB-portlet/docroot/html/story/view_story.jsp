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
	
	//Prepares story type text.
	String storyTypeText = story.getStory_Type();
	if (storyTypeText != null && storyTypeText.length() > 1) {
		storyTypeText = storyTypeText.substring(0, 1).toUpperCase() + storyTypeText.substring(1);
	} else {
		storyTypeText = "Unknown";
	}
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
<liferay-ui:error key="no-such-story" message="no-such-story" />


<c:if test="<%=story!=null%>">

	<aui:panel>
		
		<h4>Video:</h4>
			<b>URL: </b><%=!(story.getVideo_Url() == null || ""
								.equals(story.getVideo_Url())) ? "<a href="
								+ story.getVideo_Url() + ">"+ story.getVideo_Url() +"</a>"
								: "none"%> <br />
			<b>Marketable approved: </b> <%=story.getIs_Good_Enough_For_Marketing()? "Yes" : "No"%> <br />
			<b>Publication acceptable: </b> <%=story.getIs_Good_Enough_For_Story()? "Yes" : "No"%> <br />
			<br />
			
	</aui:panel>
	<aui:panel>
		<h4>Story Text:</h4>
			<p><%=story.getStory_Text()%></p>
	</aui:panel>
	
</c:if>

