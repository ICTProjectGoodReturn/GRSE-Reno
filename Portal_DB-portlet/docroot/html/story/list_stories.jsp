
<%@include file="/html/init.jsp"%>

<%
//Retrieves data needed.
long tempBlLoanId = ParamUtil.getLong(renderRequest, WebKeys.ATTR_TEMPBL_LOAN_ID);
String tempBlLoanBorrowerName = ParamUtil.getString(renderRequest, WebKeys.ATTR_TEMPBL_BORROWER_NAME);

List<Story> stories = ActionUtil.getAllStoriesByLoan(renderRequest);
TempBl borrower = ActionUtil.getTempBl(renderRequest);

//Sets if both types already exist.
boolean initialStoryExists = false;
boolean finalStoryExists = false;

for(Story story : stories) {
	if ("initial".equals(story.getStory_Type())) {
		initialStoryExists = true;
	} else if ("final".equals(story.getStory_Type())) {
		finalStoryExists = true;
	}
}
%>

<portlet:renderURL  var="backUrl" >
	<portlet:param name="jspPage" value="/html/temp_bl/view_tempbl.jsp"/>
</portlet:renderURL>
<liferay-ui:header title="Loan" backURL="backURl" />

<liferay-ui:error key="borrower-no-mfi-group" message="Borrower data inaccessible, not in a required MFI Group" />

<liferay-ui:search-container emptyResultsMessage="No Loan" delta="5">
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

		<liferay-ui:search-container-column-text name="Borrower Name" property="borrower_Name" />
		<liferay-ui:search-container-column-text name="Loan Id" property="borrower_Loan_Id" />
		
	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator />

</liferay-ui:search-container>


<liferay-ui:header title="Story Entries" />
<liferay-ui:success key="story-add-success" message="Success! Story has successfully been added to system."/>
<liferay-ui:error key="story-add-error" message="Errors encountered, story could not be added." />
<liferay-ui:error key="story-no-mfi-group" message="Story data inaccessible, not in a required MFI Group" />


<liferay-ui:search-container emptyResultsMessage="No Stories Currently Exist." delta="5">
	<liferay-ui:search-container-results>
	<%
    //Sets results.
    results = ListUtil.subList(stories, searchContainer.getStart(), searchContainer.getEnd());
    total = stories.size();

    pageContext.setAttribute("results", results);
    pageContext.setAttribute("total", total);
    %>
	</liferay-ui:search-container-results>

	<liferay-ui:search-container-row
		className="org.goodreturn.model.Story"
		keyProperty="story_Id" modelVar="story">

		<liferay-ui:search-container-column-text name="Borrower Loan ID" property="abacus_Borrower_Loan_Id" />
		<liferay-ui:search-container-column-text name="Story ID" property="story_Id" />
		<liferay-ui:search-container-column-text name="Story Type" property="story_Type" />
		<liferay-ui:search-container-column-text name="Video URL" property="video_Url" href="video_Url" />
		<liferay-ui:search-container-column-text name="Ok for Marketing" property="is_Good_Enough_For_Marketing" />
		<liferay-ui:search-container-column-text name="Ok for Publishing" property="is_Good_Enough_For_Story" />
		
	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator />

</liferay-ui:search-container>


<aui:button-row>

	<c:if test="<%=!initialStoryExists%>">
		<portlet:renderURL var="createInitialStoryUrl">
			<portlet:param name="jspPage" value="/html/story/edit_story.jsp"/>
			<portlet:param name="<%=WebKeys.ATTR_TEMPBL_LOAN_ID%>" value="<%=String.valueOf(tempBlLoanId)%>"/>
			<portlet:param name="<%=WebKeys.ATTR_TEMPBL_BORROWER_NAME%>" value="<%=tempBlLoanBorrowerName%>"/>
			<portlet:param name="<%=WebKeys.ATTR_BORROWER_LOAN_ID%>" value="<%=String.valueOf(tempBlLoanId)%>"/>
			<portlet:param name="<%=WebKeys.ATTR_STORY_TYPE %>" value="initial"/>
		</portlet:renderURL>
		<aui:button value="Create Initial Story" href="<%=createInitialStoryUrl.toString()%>" />
	</c:if>
	
	<c:if test="<%=!finalStoryExists%>">
		<portlet:renderURL var="createFinalStoryUrl">
			<portlet:param name="jspPage" value="/html/story/edit_story.jsp"/>
			<portlet:param name="<%=WebKeys.ATTR_TEMPBL_LOAN_ID%>" value="<%=String.valueOf(tempBlLoanId)%>"/>
			<portlet:param name="<%=WebKeys.ATTR_TEMPBL_BORROWER_NAME%>" value="<%=tempBlLoanBorrowerName%>"/>
			<portlet:param name="<%=WebKeys.ATTR_BORROWER_LOAN_ID%>" value="<%=String.valueOf(tempBlLoanId)%>"/>
			<portlet:param name="<%=WebKeys.ATTR_STORY_TYPE %>" value="final"/>
		</portlet:renderURL>
		<aui:button value="Create Final Story" href="<%=createFinalStoryUrl.toString()%>" />
	</c:if>
</aui:button-row>


