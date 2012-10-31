
<%@include file="/html/init.jsp"%>

<!-- Error/Success Messages -->
<liferay-ui:error key="tempbl-data-invalid-error" message="Invalid data found, fix errors before resubmitting." />
<liferay-ui:error key="tempbl-null-error" message="Error encountered, could not save borrower's loan into system." />
<liferay-ui:error key="tempbl-borrower-name-error" message="Borrower Name provided is not valid." />
<liferay-ui:error key="tempbl-borrower-loan-id-error" message="Borrower's loan ID is not valid." />
<liferay-ui:error key="tempbl-already-exists-error" message="Error, borrower's loan already exists within the system." />
<liferay-ui:error key="borrower-no-mfi-group" message="Borrower creation denied, not in a required MFI Group" />
<liferay-ui:success key="tempbl-data-add-success" message="Success! Borrower's loan added to system successfully." />

<portlet:actionURL name="addTempBl" var="addTempBlUrl"/>

<aui:form action="<%= addTempBlUrl.toString() %>" method="post">
	<aui:fieldset>
		<aui:input label="Borrower Loan ID:" name="borrower_Loan_Id" size="45" />
		<aui:input label="Borrower Name:" name="borrower_Name" size="45" />
		<aui:button-row>
			<aui:button value="Create Entry" type="submit" />
		</aui:button-row>
	</aui:fieldset>
</aui:form>

<br />
<br />
<br />

<liferay-ui:header title="Loan Entries" />
<liferay-ui:error key="borrower-no-mfi-group" message="Borrower data inaccessible, not in a required MFI Group" />


<liferay-ui:search-container emptyResultsMessage="No Loans Currently Exist." delta="5">
	<liferay-ui:search-container-results>
	<%
    List<TempBl> tempResults = ActionUtil.getTempBls(renderRequest);

    results = ListUtil.subList(tempResults, searchContainer.getStart(), searchContainer.getEnd());
    total = tempResults.size();

    pageContext.setAttribute("results", results);
    pageContext.setAttribute("total", total);
    %>
	</liferay-ui:search-container-results>

	<liferay-ui:search-container-row
		className="org.goodreturn.model.TempBl"
		keyProperty="borrower_Name" modelVar="tempBl">

		<liferay-ui:search-container-column-text name="Borrower Name" property="borrower_Name" />
		<liferay-ui:search-container-column-text name="Loan ID" property="borrower_Loan_Id" />
		<liferay-ui:search-container-column-jsp	path="/html/temp_bl/actions_tempbl.jsp" align="right" />
		
	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator />

</liferay-ui:search-container>
