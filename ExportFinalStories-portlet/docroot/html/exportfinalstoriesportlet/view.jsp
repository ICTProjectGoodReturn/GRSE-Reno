<%--
/**
* TODO
*/
--%>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>

<portlet:defineObjects />

Export final stories to excel spreadsheet.

<portlet:resourceURL var="downloadxls">
	<portlet:param name="download" value="true" />
</portlet:resourceURL>

<aui:form>
    <aui:button name="Export" value="Export" onClick="<%=downloadxls %>" />
</aui:form>