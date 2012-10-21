
<%@include file="/html/init.jsp"%>

<portlet:renderURL var="addStoryUrl" >
	<portlet:param name="jspPage" value="/html/story/edit_story.jsp" />
	<portlet:param name="<%=WebKeys.ATTR_STORY_TYPE %>" value="initial" />
</portlet:renderURL>

<aui:button value="Go!" onClick="<%=addStoryUrl.toString()%>"/>