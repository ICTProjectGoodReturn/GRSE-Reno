
<%@include file="/html/init.jsp"%>

<portlet:renderURL var="addStoryUrl" >
	<portlet:param name="jspPage" value="/html/story/edit_story.jsp" />
</portlet:renderURL>

<aui:button value="Go!" onClick="<%=addStoryUrl.toString()%>"/>