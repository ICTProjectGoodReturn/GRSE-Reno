
<%@include file="/html/init.jsp"%>

<!-- Error/Success Messages -->
<liferay-ui:error key="tempbl-data-invalid-error" message="Invalid data found, fix errors before resubmitting." />
<liferay-ui:error key="tempbl-null-error" message="Error encounted, could not save borrower into system." />
<liferay-ui:error key="tempbl-borrower-name-error" message="Borrower Name provided is not valid." />
<liferay-ui:error key="tempbl-borrower-loan-id-error" message="Borrower loan ID is not valid." />
<liferay-ui:error key="tempbl-already-exists-error" message="Error, Borrower already exists within the system." />
<liferay-ui:success key="tempbl-data-add-success" message="Success! Borrower added to system successfully." />

<portlet:actionURL name="updateTempBl" var="updateTempBlUrl"/>

<aui:form action="<%= updateTempBlUrl.toString() %>" method="post">
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

		<liferay-ui:search-container-column-text name="Name" property="borrower_Name" />
		<liferay-ui:search-container-column-text name="Loan Id" property="borrower_Loan_Id" />
		<liferay-ui:search-container-column-jsp	path="/html/temp_bl/actions_tempbl.jsp" align="right" />
		
	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator />

</liferay-ui:search-container>