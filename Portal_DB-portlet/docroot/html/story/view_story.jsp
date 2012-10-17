<%--
/**
* View for final and initial Story objects which is apart of
* for LoanAccount objects. Should be used in conjunction with
* BorrowersPortlet.viewInitialStory() and BorrowersPortlet.viewFinalStory(). 
*/
--%>
<%@include file="/html/init.jsp"%>

<!-- Data Definitions -->
<%
	Story story = (Story) request.getAttribute(WebKeys.STORY_OBJECT);

	//Retrieves story type text and attribute.
	String storyTypeText = "Unknown Story Type";
	String storyType = "";
	if (story != null) {
		storyType = story.getStory_Type();
		storyTypeText = storyType + "-story";
	}

	String actionButtonText = (story == null ? "add-new-" + storyType
			: "edit-" + storyType);
%>

<!-- Link Definitions -->
<portlet:renderURL var="addEditFinalStoryUrl">
	<portlet:param name="jspPage" value="/html/story/edit_story.jsp" />
</portlet:renderURL>

<!-- Structure Definition -->
<liferay-ui:error key="" message="" />
<c:if test="<%=story!=null%>">
	<liferay-ui:header title='<%=storyType + " Story for loan " + story.getLoan_Account_Id()%>'
	backLabel="TODO" backURL="" />
	
	<aui:panel label="Story Text" >
		<aui:panel>
			<b>Marketing Acceptable: </b><%=story.getIs_Good_Enough_For_Marketing()%>
			<b>Final Story Acceptable: </b><%=story.getIs_Good_Enough_For_Story()%>
			
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
</c:if>

<aui:button value="<%=actionButtonText%>" onClick="<%=addEditFinalStoryUrl.toString()%>" />
