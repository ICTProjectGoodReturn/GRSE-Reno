<%--
/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
--%>

<%@ include file="/html/portlet/login/init.jsp" %>
<%@ page import="com.liferay.portal.AddressTypeException" %>
<%@ page import="com.liferay.portal.ContactTitleException" %>
<%@ page import="com.liferay.portal.HeardAboutUsException" %>

<%
String redirect = ParamUtil.getString(request, "redirect");

String openId = ParamUtil.getString(request, "openId");

PasswordPolicy passwordPolicy = PasswordPolicyLocalServiceUtil.getDefaultPasswordPolicy(company.getCompanyId());

Calendar birthday = CalendarFactoryUtil.getCalendar();

birthday.set(Calendar.MONTH, Calendar.JANUARY);
birthday.set(Calendar.DATE, 1);
birthday.set(Calendar.YEAR, 1970);

boolean male = ParamUtil.getBoolean(request, "male", true);

//Retrives all countries
List<Country> countries = CountryServiceUtil.getCountries();
%>


<!-- Custom JavaScript -->
<!-- NOTE: INTENDED TO SHOW SPECIFY OTHER WHEN OTHER IS SELECTED.
<script type="text/javascript">
	//var element = document.getElementById('<portlet:namespace />' + '#heardAboutUs');
	//console.log(element);
	
	AUI().ready(function(A) {
	   	//Obtains form elements
	   	var heardAboutUsList = A.one('#heardAboutUs');
	   	var heardAboutUsInput = A.one('#heardAboutUsOther');
	   	
	   	//Obtains selected items.
	   	heardAboutUsList.on("change", function() {
	    	var selectedValue = heardAboutUsList.options[heardAboutUsList.selectedIndex].value;
	    	
	    	//If item is other display other, else hide.
	    	if (selectedValue === "Other") {
	    		heardAboutUsInput.type = "text";
	    	} else {
	    		heardAboutUsInput.type = "hidden";
	    	}
	   	});
	});
</script>
 -->
<portlet:actionURL var="createAccoutURL">
	<portlet:param name="saveLastPath" value="0" />
	<portlet:param name="struts_action" value="/login/create_account" />
</portlet:actionURL>

<aui:form action="<%= createAccoutURL %>" method="post" name="fm">
	<aui:input name="<%= Constants.CMD %>" type="hidden" value="<%= Constants.ADD %>" />
	<aui:input name="redirect" type="hidden" value="<%= redirect %>" />
	<aui:input name="openId" type="hidden" value="<%= openId %>" />

	<liferay-ui:error exception="<%= AddressCityException.class %>" message="please-enter-a-valid-city" />
	<liferay-ui:error exception="<%= AddressStreetException.class %>" message="please-enter-a-valid-street" />
	<liferay-ui:error exception="<%= AddressZipException.class %>" message="please-enter-a-valid-postal-code" />
	<liferay-ui:error exception="<%= CaptchaMaxChallengesException.class %>" message="maximum-number-of-captcha-attempts-exceeded" />
	<liferay-ui:error exception="<%= CaptchaTextException.class %>" message="text-verification-failed" />
	<liferay-ui:error exception="<%= CompanyMaxUsersException.class %>" message="unable-to-create-user-account-because-the-maximum-number-of-users-has-been-reached" />
	<liferay-ui:error exception="<%= ContactFirstNameException.class %>" message="please-enter-a-valid-first-name" />
	<liferay-ui:error exception="<%= ContactFullNameException.class %>" message="please-enter-a-valid-first-middle-and-last-name" />
	<liferay-ui:error exception="<%= ContactLastNameException.class %>" message="please-enter-a-valid-last-name" />
	<liferay-ui:error exception="<%= DuplicateUserEmailAddressException.class %>" message="the-email-address-you-requested-is-already-taken" />
	<liferay-ui:error exception="<%= DuplicateUserIdException.class %>" message="the-user-id-you-requested-is-already-taken" />
	<liferay-ui:error exception="<%= DuplicateUserScreenNameException.class %>" message="the-screen-name-you-requested-is-already-taken" />
	<liferay-ui:error exception="<%= EmailAddressException.class %>" message="please-enter-a-valid-email-address" />

	<liferay-ui:error exception="<%= GroupFriendlyURLException.class %>">

		<%
		GroupFriendlyURLException gfurle = (GroupFriendlyURLException)errorException;
		%>

		<c:if test="<%= gfurle.getType() == GroupFriendlyURLException.DUPLICATE %>">
			<liferay-ui:message key="the-screen-name-you-requested-is-associated-with-an-existing-friendly-url" />
		</c:if>
	</liferay-ui:error>

	<liferay-ui:error exception="<%= NoSuchCountryException.class %>" message="please-select-a-country" />
	<liferay-ui:error exception="<%= NoSuchListTypeException.class %>" message="please-select-a-type" />
	<liferay-ui:error exception="<%= NoSuchRegionException.class %>" message="please-select-a-region" />
	<liferay-ui:error exception="<%= PhoneNumberException.class %>" message="please-enter-a-valid-phone-number" />
	<liferay-ui:error exception="<%= RequiredFieldException.class %>" message="please-fill-out-all-required-fields" />
	<liferay-ui:error exception="<%= ReservedUserEmailAddressException.class %>" message="the-email-address-you-requested-is-reserved" />
	<liferay-ui:error exception="<%= ReservedUserIdException.class %>" message="the-user-id-you-requested-is-reserved" />
	<liferay-ui:error exception="<%= ReservedUserScreenNameException.class %>" message="the-screen-name-you-requested-is-reserved" />
	<liferay-ui:error exception="<%= TermsOfUseException.class %>" message="you-must-agree-to-the-terms-of-use" />
	<liferay-ui:error exception="<%= UserEmailAddressException.class %>" message="please-enter-a-valid-email-address" />
	<liferay-ui:error exception="<%= UserIdException.class %>" message="please-enter-a-valid-user-id" />

	<liferay-ui:error exception="<%= UserPasswordException.class %>">

		<%
		UserPasswordException upe = (UserPasswordException)errorException;
		%>

		<c:if test="<%= upe.getType() == UserPasswordException.PASSWORD_CONTAINS_TRIVIAL_WORDS %>">
			<liferay-ui:message key="that-password-uses-common-words-please-enter-in-a-password-that-is-harder-to-guess-i-e-contains-a-mix-of-numbers-and-letters" />
		</c:if>

		<c:if test="<%= upe.getType() == UserPasswordException.PASSWORD_INVALID %>">
			<liferay-ui:message key="that-password-is-invalid-please-enter-in-a-different-password" />
		</c:if>

		<c:if test="<%= upe.getType() == UserPasswordException.PASSWORD_LENGTH %>">
			<%= LanguageUtil.format(pageContext, "that-password-is-too-short-or-too-long-please-make-sure-your-password-is-between-x-and-512-characters", String.valueOf(passwordPolicy.getMinLength()), false) %>
		</c:if>

		<c:if test="<%= upe.getType() == UserPasswordException.PASSWORD_TOO_TRIVIAL %>">
			<liferay-ui:message key="that-password-is-too-trivial" />
		</c:if>

		<c:if test="<%= upe.getType() == UserPasswordException.PASSWORDS_DO_NOT_MATCH %>">
			<liferay-ui:message key="the-passwords-you-entered-do-not-match-each-other-please-re-enter-your-password" />
		</c:if>
	</liferay-ui:error>

	<liferay-ui:error exception="<%= UserScreenNameException.class %>" message="please-enter-a-valid-screen-name" />
	<liferay-ui:error exception="<%= WebsiteURLException.class %>" message="please-enter-a-valid-url" />
	
	<!-- Custom error exception messages -->
	<liferay-ui:error exception="<%= ContactTitleException.class %>" message="Please select your preffered Title" />
	<liferay-ui:error exception="<%= AddressTypeException.class %>" message="Please select an Address Type" />
	<liferay-ui:error exception="<%= HeardAboutUsException.class %>" message="Please indicate how you heard about us" />
	
	<!-- End custom error exception messages -->
	

	<c:if test='<%= SessionMessages.contains(request, "missingOpenIdUserInformation") %>'>
		<div class="portlet-msg-info">
			<liferay-ui:message key="you-have-successfully-authenticated-please-provide-the-following-required-information-to-access-the-portal" />
		</div>
	</c:if>

	<aui:model-context model="<%= Contact.class %>" />

	<aui:fieldset>
		<aui:input model="<%= User.class %>" name="firstName" />

		<aui:input model="<%= User.class %>" name="middleName" />

		<aui:input model="<%= User.class %>" name="lastName">
			<c:if test="<%= PrefsPropsUtil.getBoolean(company.getCompanyId(), PropsKeys.USERS_LAST_NAME_REQUIRED, PropsValues.USERS_LAST_NAME_REQUIRED) %>">
				<aui:validator name="required" />
			</c:if>
		</aui:input>

		<c:if test="<%= !PrefsPropsUtil.getBoolean(company.getCompanyId(), PropsKeys.USERS_SCREEN_NAME_ALWAYS_AUTOGENERATE) %>">
			<aui:input model="<%= User.class %>" name="screenName" />
		</c:if>

		<aui:input model="<%= User.class %>" name="emailAddress">
			<c:if test="<%= PrefsPropsUtil.getBoolean(company.getCompanyId(), PropsKeys.USERS_EMAIL_ADDRESS_REQUIRED, PropsValues.USERS_EMAIL_ADDRESS_REQUIRED) %>">
				<aui:validator name="required" />
			</c:if>
		</aui:input>

		<c:if test="<%= PropsValues.LOGIN_CREATE_ACCOUNT_ALLOW_CUSTOM_PASSWORD %>">
			<aui:input label="password" name="password1" size="30" type="password" value="" />

			<aui:input label="enter-again" name="password2" size="30" type="password" value="">
				<aui:validator name="equalTo">
					'#<portlet:namespace />password1'
				</aui:validator>
			</aui:input>
		</c:if>

		<c:choose>
			<c:when test="<%= PrefsPropsUtil.getBoolean(company.getCompanyId(), PropsKeys.FIELD_ENABLE_COM_LIFERAY_PORTAL_MODEL_CONTACT_BIRTHDAY) %>">
				<aui:input name="birthday" value="<%= birthday %>" />
			</c:when>
			<c:otherwise>
				<aui:input name="birthdayMonth" type="hidden" value="<%= Calendar.JANUARY %>" />
				<aui:input name="birthdayDay" type="hidden" value="1" />
				<aui:input name="birthdayYear" type="hidden" value="1970" />
			</c:otherwise>
		</c:choose>

		<c:if test="<%= PrefsPropsUtil.getBoolean(company.getCompanyId(), PropsKeys.FIELD_ENABLE_COM_LIFERAY_PORTAL_MODEL_CONTACT_MALE) %>">
			<aui:select label="gender" name="male">
				<aui:option label="male" value="1" />
				<aui:option label="female" selected="<%= !male %>" value="0" />
			</aui:select>
		</c:if>

		<c:if test="<%= PropsValues.CAPTCHA_CHECK_PORTAL_CREATE_ACCOUNT %>">
			<portlet:actionURL var="captchaURL" windowState="<%= LiferayWindowState.EXCLUSIVE.toString() %>">
				<portlet:param name="struts_action" value="/login/captcha" />
			</portlet:actionURL>

			<liferay-ui:captcha url="<%= captchaURL %>" />
		</c:if>
	
		<!-- Added fields -->
	
		<aui:select name="title" label="Title" >
			<aui:option value="Please Select" label="Please Select" />
			<aui:option value="Mr" label="Mr" />
			<aui:option value="Mrs" label="Mrs" />
			<aui:option value="Ms" label="Ms" />
		</aui:select>
		
		<aui:select name="addressType" label="Address Type">
			<aui:option value="Please select" label="Please select" />
			<aui:option value="Business" label="Business" />
			<aui:option value="Home" label="Home" />
			<aui:option value="Office Address" label="Office Address" />
			<aui:option value="PO Box" label="PO Box" />
		</aui:select>
		
		<aui:input name="address1" label="Address Line 1" type="text" />
		
		<aui:input name="address2" label="Address Line 2" type="text" />
		
		<aui:input name="suburbCity" label="Suburb/City" type="text" />
		
		<aui:input name="stateRegion" label="State/Region" type="text" />
		
		<aui:select name="country" label="Country">
			<aui:option value="Please Select" label="Please Select" />
			<%
			for (Country currentCountry : countries) { %>
				<aui:option value="<%=currentCountry.getName()%>" label="<%=currentCountry.getName()%>" />
			<%
			}%>
		</aui:select>
		<aui:input name="postcodeZip" label="Postcode/Zip code" type="text">
			<aui:validator name="required" />
		</aui:input>
		
	
		<aui:select id="heardAboutUs" name="heardAboutUs" label="How did you hear about us?">
			<aui:option value="Please Select" label="Please Select" />
			<aui:option value="Accenture" label="Accenture" />
			<aui:option value="Advertising" label="Advertising" />
			<aui:option value="Deloitte" label="Deloitte" />
			<aui:option value="Facebook" label="Facebook" />
			<aui:option value="Gift Certificate" label="Gift Certificate" />
			<aui:option value="Google / Search Engine" label="Google / Search Engine" />
			<aui:option value="ME Bank" label="ME Bank" />
			<aui:option value="My Employer" label="My Employer" />
			<aui:option value="Origin" label="Origin" />
			<aui:option value="Westpac" label="Westpac" />
			<aui:option value="Word of Mouth / Friend" label="Word of Mouth / Friend" />
			<aui:option value="Other" label="Other" />
		</aui:select>
		
		
		<aui:input id="heardAboutUsOther" name="heardAboutUsOther" label="Specify?" type="hidden" />
		
	    <aui:input name="recieveRepaymentEmails" label="I wish to receive loan repayment emails from Good Return" type="checkbox" value="false" />
	    
	    <aui:input name="recieveInfoEmails" label="I would like to receive information about Good Return events in my area" type="checkbox" value="false" />
	    
		<aui:input name="appearAnonymous" label="I wish to appear as anonymous on the Good Return website" type="checkbox" value="false" />
		
		<aui:input name="termsAgreed" label="I have read and agree to the Terms of Use and Privacy Policy" type="checkbox" value="false" />
		
		<!-- Added fields end -->
		
	</aui:fieldset>
	

	<aui:button-row>
		<aui:button type="submit" />
	</aui:button-row>
</aui:form>

<liferay-util:include page="/html/portlet/login/navigation.jsp" />

<c:if test="<%= windowState.equals(WindowState.MAXIMIZED) %>">
	<aui:script>
		Liferay.Util.focusFormField(document.<portlet:namespace />fm.<portlet:namespace />firstName);
	</aui:script>
</c:if>