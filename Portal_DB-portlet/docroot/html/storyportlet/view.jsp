<%--
/**
* TODO
*
*
*/
--%>
<%@include file="/html/init.jsp"%>


<!-- Link Definitions -->
<portlet:renderURL var="addEditFinalStoryUrl">
	<portlet:param name="jspPage" value="/html/finalstoryportlet/add.jsp" />
</portlet:renderURL>

<!-- Data Definitions -->
<%
	Story story = (Story) request.getAttribute("StoryObject");
	String actionButtonText = (story== null?"add-new-final-story":"edit-final-story");
	String storyTypeText = "Unknown Story Type";
	
	/*switch (story.getStory_Type()) {
	case 'f':
		storyTypeText = "final-story";
		break;
	case 'i':
		storyTypeText = "initial-story";
		break;
	}*/
%>

<c:if test="<%=story != null%>">
	<!-- TODO REPLACE story id with loan id for now -->
	<h1><%="Final Story for loan " + story.getLoan_Account_Id()%></h1>
	
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
			<%=story.getStory_Text()%>
		</aui:panel>
	</aui:panel>
</c:if>

<aui:button value="<%=actionButtonText%>" onClick="<%=addEditFinalStoryUrl.toString()%>" />
