<%--
/**
* TODO
*/
--%>

<%@include file="/html/init.jsp"%>

<portlet:defineObjects />
<!-- TODO HEADER AND THEN OTHER OPTIONS -->
Export final stories to excel spreadsheet.


<portlet:resourceURL var="downloadCsv">
	<portlet:param name="downloadCsv" value="true" />
</portlet:resourceURL>

<aui:form>
    <aui:button name="Export" value="Export" onClick="<%=downloadCsv %>" />
</aui:form>