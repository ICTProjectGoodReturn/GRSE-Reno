
<%@include file="/html/init.jsp"%>

<%
//Retrieves data needed.
long borrowerLoanId = ParamUtil.getLong(request, WebKeys.ATTR_TEMPBL_LOAN_ID);
String borrowerLoanIdString = String.valueOf(borrowerLoanId);

Story initialStory = ActionUtil.getStoryByType(borrowerLoanId, "initial");
Story finalStory = ActionUtil.getStoryByType(borrowerLoanId, "final");
TempBl borrower = ActionUtil.getTempBl(renderRequest);
%>

<liferay-ui:header title="Borrower" />


<liferay-ui:search-container emptyResultsMessage="no-loan" delta="5">
	<liferay-ui:search-container-results>
	<%
    //Sets results.
    List<TempBl> borrowerCol = new ArrayList<TempBl>();
	if (borrower!= null) {
		borrowerCol.add(borrower);
		total = 1;
	} else {
		total = 0;
	}
    

    pageContext.setAttribute("results", borrowerCol);
    pageContext.setAttribute("total", total);
    %>
	</liferay-ui:search-container-results>

	<liferay-ui:search-container-row
		className="org.goodreturn.model.TempBl"
		keyProperty="borrower_Name" modelVar="tempBl">

		<liferay-ui:search-container-column-text name="Name" property="borrower_Name" />
		<liferay-ui:search-container-column-text name="Loan Id" property="borrower_Loan_Id" />
		
	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator />

</liferay-ui:search-container>


<liferay-ui:header title="Story Entries" />

<liferay-ui:search-container emptyResultsMessage="No Stories Currently Exist." delta="5">
	<liferay-ui:search-container-results>
	<%
	//Retrieves stories to display.
    List<Story> tempResults = new ArrayList<Story>();
    
    //Adds results.
    if (initialStory != null) {
    	tempResults.add(initialStory);
    }
    if (finalStory != null) {
    	tempResults.add(finalStory);
    }
    
    //Sets results.
    results = ListUtil.subList(tempResults, searchContainer.getStart(), searchContainer.getEnd());
    total = tempResults.size();

    pageContext.setAttribute("results", results);
    pageContext.setAttribute("total", total);
    %>
	</liferay-ui:search-container-results>

	<liferay-ui:search-container-row
		className="org.goodreturn.model.Story"
		keyProperty="story_Id" modelVar="story">

		<liferay-ui:search-container-column-text name="borrower-loan-id" property="abacus_Borrower_Loan_Id" />
		<liferay-ui:search-container-column-text name="story-id" property="story_Id" />
		<liferay-ui:search-container-column-text name="type" property="story_Type" />
		<liferay-ui:search-container-column-text name="video-url" property="video_Url" href="video_Url" />
		<liferay-ui:search-container-column-text name="marketable" property="is_Good_Enough_For_Marketing" />
		<liferay-ui:search-container-column-text name="publicable" property="is_Good_Enough_For_Story" />
		<liferay-ui:search-container-column-jsp	path="/html/story/actions_story.jsp" align="right" />
		
	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator />

</liferay-ui:search-container>


<aui:button-row>
	<c:if test="<%=initialStory==null%>">
		<portlet:renderURL var="createInitialStoryUrl">
			<portlet:param name="jspPage" value="/html/story/edit_story.jsp"/>
			<portlet:param name="<%=WebKeys.ATTR_BORROWER_LOAN_ID%>" value="<%=borrowerLoanIdString%>"/>
			<portlet:param name="<%=WebKeys.ATTR_STORY_TYPE %>" value="initial"/>
		</portlet:renderURL>
		<aui:button value="Create Initial Story" href="<%=createInitialStoryUrl.toString()%>" />
	</c:if>
	<c:if test="<%=finalStory==null%>">
		<portlet:renderURL var="createFinalStoryUrl">
			<portlet:param name="jspPage" value="/html/story/edit_story.jsp"/>
			<portlet:param name="<%=WebKeys.ATTR_BORROWER_LOAN_ID%>" value="<%=borrowerLoanIdString%>"/>
			<portlet:param name="<%=WebKeys.ATTR_STORY_TYPE %>" value="final"/>
		</portlet:renderURL>
		<aui:button value="Create Final Story" href="<%=createFinalStoryUrl.toString()%>" />
	</c:if>
</aui:button-row>