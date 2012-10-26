<%@include file="/html/init.jsp" %>

<%
ResultRow row = (ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
TempBl myTempBl = (TempBl) row.getObject();
long groupId = themeDisplay.getLayout().getGroupId();
String primKey = String.valueOf(myTempBl.getBorrower_Loan_Id());
%>

<liferay-ui:icon-menu>
	
	<portlet:renderURL var="viewStoriesUrl">
		<portlet:param name="<%=WebKeys.ATTR_TEMBL_LOAN_ID%>" value="<%= primKey %>" />
		<portlet:param name="jspPage" value="/html/story/list_stories.jsp" />
	</portlet:renderURL>
	<liferay-ui:icon message="View Stories"  url="<%= viewStoriesUrl.toString() %>" />
	
	<portlet:actionURL name="deleteTempBl" var="deleteURL">
		<portlet:param name="<%=WebKeys.ATTR_TEMBL_LOAN_ID%>" value="<%= primKey %>" />
	</portlet:actionURL>
	<liferay-ui:icon-delete url="<%=deleteURL.toString()%>" />
	
</liferay-ui:icon-menu>