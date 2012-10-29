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

	<!-- Download links. -->
	<portlet:resourceURL var="downloadAllCsv">
		<portlet:param name="downloadCsv" value="true" />
		<portlet:param name="approvedOnly" value="false" />
	</portlet:resourceURL>
	
	<portlet:resourceURL var="downloadApprovedCsv">
		<portlet:param name="downloadCsv" value="true" />
		<portlet:param name="approvedOnly" value="true" />
	</portlet:resourceURL>
	
	<aui:form>
		<aui:button-row>
			<aui:button value="Export All Stories" onClick="<%=downloadAllCsv%>" />
			<aui:button value="Export Workflow Approved Stories" onClick="<%=downloadApprovedCsv%>" />
		</aui:button-row>
	</aui:form>

</c:if>