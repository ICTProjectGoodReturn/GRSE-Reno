
<%@include file="/html/init.jsp"%>

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

<liferay-ui:header title="Borrower Entries" />

<liferay-ui:search-container emptyResultsMessage="no-tempbls" delta="5">
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

		<liferay-ui:search-container-column-text name="borrower-name" property="borrower_Name" />
		<liferay-ui:search-container-column-text name="borrower-loan-id" property="borrower_Loan_Id" />
		<liferay-ui:search-container-column-jsp	path="/html/temp_bl/actions_tempbl.jsp" align="right" />
		
	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator />

</liferay-ui:search-container>
