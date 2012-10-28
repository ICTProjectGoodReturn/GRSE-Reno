<%--
/**
* Simple single portlet page which allows and starts the story exporting process.
* Portlet is to be displayed within the Control Panel.
*
* Components of this page are restricted to specific user roles.
*/
--%>
<%@include file="/html/init.jsp"%>


<portlet:defineObjects />
<c:if test="<%=StoryExporterUsersControlPanelEntry.hasExportPermissions(permissionChecker, renderRequest)%>">
Export stories to Comma Separated Values (CSV) file.
<br />
<br />
<br />

	<!-- TODO OTHER OPTIONS -->
	<portlet:resourceURL var="downloadCsv">
		<portlet:param name="downloadCsv" value="true" />
	</portlet:resourceURL>
	<aui:form>
		<!--<aui:input name="approvedOnly" label="Approved Stories Only" type="checkbox" /> -->

		<aui:button name="Export" value="Export to CSV" onClick="<%=downloadCsv%>" />
	</aui:form>

</c:if>