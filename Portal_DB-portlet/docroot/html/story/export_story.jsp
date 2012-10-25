<%--
/**
* TODO
*/
--%>

<%@include file="/html/init.jsp"%>

<portlet:defineObjects />

Export final stories to excel spreadsheet.

<portlet:resourceURL var="downloadCsv">
	<portlet:param name="downloadCsv" value="true" />
</portlet:resourceURL>

<aui:form>
    <aui:button name="Export" value="Export" onClick="<%=downloadCsv %>" />
</aui:form>