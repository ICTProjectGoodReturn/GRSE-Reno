<%@include file="/html/init.jsp" %>

<%
ResultRow row = (ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
TempBl myTempBl = (TempBl) row.getObject();
long groupId = themeDisplay.getLayout().getGroupId();
%>

<liferay-ui:icon-menu>
	
	<portlet:renderURL var="viewStoriesUrl">
		<portlet:param name="<%=WebKeys.ATTR_TEMPBL_LOAN_ID%>" value="<%=String.valueOf(myTempBl.getBorrower_Loan_Id())%>" />
		<portlet:param name="<%=WebKeys.ATTR_TEMPBL_BORROWER_NAME%>" value="<%= myTempBl.getBorrower_Name()%>" />
		<portlet:param name="jspPage" value="/html/story/list_stories.jsp" />
	</portlet:renderURL>
	<liferay-ui:icon message="View Stories"  url="<%= viewStoriesUrl.toString() %>" />
	
</liferay-ui:icon-menu>