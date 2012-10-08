package com.liferay.portlet.login.action;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.liferay.portal.AddressCityException;
import com.liferay.portal.AddressStreetException;
import com.liferay.portal.AddressTypeException;
import com.liferay.portal.AddressZipException;
import com.liferay.portal.CompanyMaxUsersException;
import com.liferay.portal.ContactFirstNameException;
import com.liferay.portal.ContactFullNameException;
import com.liferay.portal.ContactLastNameException;
import com.liferay.portal.ContactTitleException;
import com.liferay.portal.DuplicateUserEmailAddressException;
import com.liferay.portal.DuplicateUserScreenNameException;
import com.liferay.portal.EmailAddressException;
import com.liferay.portal.GroupFriendlyURLException;
import com.liferay.portal.HeardAboutUsException;
import com.liferay.portal.NoSuchCountryException;
import com.liferay.portal.NoSuchLayoutException;
import com.liferay.portal.NoSuchListTypeException;
import com.liferay.portal.NoSuchOrganizationException;
import com.liferay.portal.NoSuchRegionException;
import com.liferay.portal.NoSuchUserException;
import com.liferay.portal.OrganizationParentException;
import com.liferay.portal.PhoneNumberException;
import com.liferay.portal.RequiredFieldException;
import com.liferay.portal.RequiredUserException;
import com.liferay.portal.ReservedUserEmailAddressException;
import com.liferay.portal.ReservedUserScreenNameException;
import com.liferay.portal.TermsOfUseException;
import com.liferay.portal.UserEmailAddressException;
import com.liferay.portal.UserIdException;
import com.liferay.portal.UserPasswordException;
import com.liferay.portal.UserScreenNameException;
import com.liferay.portal.UserSmsException;
import com.liferay.portal.WebsiteURLException;
import com.liferay.portal.kernel.captcha.CaptchaMaxChallengesException;
import com.liferay.portal.kernel.captcha.CaptchaTextException;
import com.liferay.portal.kernel.captcha.CaptchaUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.util.Constants;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.model.Company;
import com.liferay.portal.model.Layout;
import com.liferay.portal.model.Role;
import com.liferay.portal.model.User;
import com.liferay.portal.security.auth.PrincipalException;
import com.liferay.portal.service.CountryServiceUtil;
import com.liferay.portal.service.LayoutLocalServiceUtil;
import com.liferay.portal.service.RoleLocalServiceUtil;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portal.util.PropsValues;
import com.liferay.portal.util.WebKeys;

public class CreateAccountAction extends OldCreateAccountAction {
	
	private static Log log = LogFactoryUtil.getLog(OldCreateAccountAction.class);
	
	@Override
	protected void addUser(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		
		//Retrieves data from user input.
		String emailAddress = ParamUtil.getString(actionRequest, "emailAddress");
		String title = ParamUtil.getString(actionRequest, "title");
		String addressType = ParamUtil.getString(actionRequest, "addressType");
		String address1 = ParamUtil.getString(actionRequest, "address1");
		String address2 = ParamUtil.getString(actionRequest, "address2");
		String suburbCity = ParamUtil.getString(actionRequest, "suburbCity");
		String stateRegion = ParamUtil.getString(actionRequest, "stateRegion");
		String country = ParamUtil.getString(actionRequest, "country");
		String postcodeZip = ParamUtil.getString(actionRequest, "postcodeZip");
		String heardAboutUs = ParamUtil.getString(actionRequest, "heardAboutUs");
		String heardAboutUsOther = ParamUtil.getString(actionRequest, "heardAboutUsOther");
		
		boolean recieveRepaymentEmails = ParamUtil.getBoolean(actionRequest, "recieveRepaymentEmails");
	    boolean recieveInfoEmails = ParamUtil.getBoolean(actionRequest, "recieveInfoEmails");
		boolean appearAnonymous = ParamUtil.getBoolean(actionRequest, "appearAnonymous");
		boolean termsAgreed = ParamUtil.getBoolean(actionRequest, "termsAgreed");

		//TEST Printout TODO REMOVE
		System.out.println("************************** Printing fields *************************");
		System.out.println("title " + title);
		System.out.println("addressType " + addressType);
		System.out.println("address1 " + address1);
		System.out.println("address2 " + address2);
		System.out.println("suburbCity " + suburbCity);
		System.out.println("stateRegion " + stateRegion);
		System.out.println("country " + country);
		System.out.println("postcodeZip " + postcodeZip);
		System.out.println("heardAboutUs " + heardAboutUs);
		System.out.println("heardAboutUsOther " + heardAboutUsOther);
		System.out.println("recieveRepaymentEmails " + recieveRepaymentEmails);
		System.out.println("recieveInfoEmails " + recieveInfoEmails);
		System.out.println("appearAnonymous " + appearAnonymous);
		System.out.println("termsAgreed " + termsAgreed);
		System.out.println("************************** Printing fields *************************");

		// Checks custom fields, throws exceptions if invalid.
		//Title
		if (!title.equals("Mr") && !title.equals("Mrs") && !title.equals("Ms")) {
			throw new ContactTitleException("Invalid title provided.");
		}
		
		//AddressType
		if (!addressType.equals("Business") && !addressType.equals("Home") &&
				!addressType.equals("Office Address") && !addressType.equals("PO Box")) {
			throw new AddressTypeException("Invalid address type provided.");
		}
		
		//Country, throws exception if no country exists.
		CountryServiceUtil.getCountryByName(country);
		
		
		//Postcode/zip
		if (postcodeZip.trim().equals("")) {
			throw new AddressZipException("Postcode/zip code must be provided.");
		}
		
		//HeardAboutUs
		if (heardAboutUs.equalsIgnoreCase("Please Select")) {
			throw new HeardAboutUsException("Must specify method of hearing about goodreturn.org.");
		} else if (heardAboutUs.equalsIgnoreCase("Other")) {
			//Ensures other field is valid.
			if (heardAboutUsOther.trim().equals("")) {
				throw new HeardAboutUsException("Must specify method of hearing about goodreturn.org.");
			} else {
				heardAboutUs = heardAboutUsOther;
			}
		}
		
		//termsAgreed
		if (!termsAgreed) {
			throw new TermsOfUseException();
		}
		
		//Adds liferay user or throws exception.
		super.addUser(actionRequest, actionResponse);
		
		//Retrieves LR data needed.
		//HttpServletRequest request = PortalUtil.getHttpServletRequest(actionRequest);
		//HttpSession session = request.getSession();
		Company company = ((ThemeDisplay)actionRequest.getAttribute(WebKeys.THEME_DISPLAY)).getCompany();
		
		//Adds the 'Public Lender' role to the user.
		User user = UserLocalServiceUtil.getUserByEmailAddress(company.getCompanyId(), emailAddress);
		Role publicLenderRole = RoleLocalServiceUtil.getRole(company.getCompanyId(), "Public Lender");
		RoleLocalServiceUtil.addUserRoles(user.getPrimaryKey(), new long[]{publicLenderRole.getRoleId()});

		//Add the secondary data to the user tables.
		//TODO
		
	}
	
	
	/*
	 * Note: exactly the same apart from the added exceptions for custom error messages.
	 * 	     Taken from version 6.1.1 ce ga2
	 * 
	 * (non-Javadoc)
	 * @see com.liferay.portlet.login.action.CreateAccountAction#processAction(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.portlet.PortletConfig, javax.portlet.ActionRequest, javax.portlet.ActionResponse)
	 */
	@Override
	public void processAction(
			ActionMapping mapping, ActionForm form, PortletConfig portletConfig,
			ActionRequest actionRequest, ActionResponse actionResponse)
		throws Exception {
				
		ThemeDisplay themeDisplay = (ThemeDisplay)actionRequest.getAttribute(
			WebKeys.THEME_DISPLAY);

		Company company = themeDisplay.getCompany();

		if (!company.isStrangers()) {
			throw new PrincipalException();
		}

		String cmd = ParamUtil.getString(actionRequest, Constants.CMD);

		try {
			if (cmd.equals(Constants.ADD)) {
				if (PropsValues.CAPTCHA_CHECK_PORTAL_CREATE_ACCOUNT) {
					CaptchaUtil.check(actionRequest);
				}

				addUser(actionRequest, actionResponse);
			}
			else if (cmd.equals(Constants.RESET)) {
				resetUser(actionRequest, actionResponse);
			}
			else if (cmd.equals(Constants.UPDATE)) {
				updateIncompleteUser(actionRequest, actionResponse);
			}
		}
		catch (Exception e) {
			if (e instanceof DuplicateUserEmailAddressException ||
				e instanceof DuplicateUserScreenNameException) {

				String emailAddress = ParamUtil.getString(
					actionRequest, "emailAddress");

				try {
					User user = UserLocalServiceUtil.getUserByEmailAddress(
						themeDisplay.getCompanyId(), emailAddress);

					if (user.getStatus() !=
							WorkflowConstants.STATUS_INCOMPLETE) {

						SessionErrors.add(actionRequest, e.getClass(), e);
					}
					else {
						setForward(
							actionRequest, "portlet.login.update_account");
					}
				}
				catch (NoSuchUserException nsue) {
					SessionErrors.add(actionRequest, e.getClass(), e);
				}
			}
			else if (e instanceof AddressCityException ||
					 e instanceof AddressStreetException ||
					 e instanceof AddressZipException ||
					 e instanceof CaptchaMaxChallengesException ||
					 e instanceof CaptchaTextException ||
					 e instanceof CompanyMaxUsersException ||
					 e instanceof ContactFirstNameException ||
					 e instanceof ContactFullNameException ||
					 e instanceof ContactLastNameException ||
					 e instanceof EmailAddressException ||
					 e instanceof GroupFriendlyURLException ||
					 e instanceof NoSuchCountryException ||
					 e instanceof NoSuchListTypeException ||
					 e instanceof NoSuchOrganizationException ||
					 e instanceof NoSuchRegionException ||
					 e instanceof OrganizationParentException ||
					 e instanceof PhoneNumberException ||
					 e instanceof RequiredFieldException ||
					 e instanceof RequiredUserException ||
					 e instanceof ReservedUserEmailAddressException ||
					 e instanceof ReservedUserScreenNameException ||
					 e instanceof TermsOfUseException ||
					 e instanceof UserEmailAddressException ||
					 e instanceof UserIdException ||
					 e instanceof UserPasswordException ||
					 e instanceof UserScreenNameException ||
					 e instanceof UserSmsException ||
					 e instanceof WebsiteURLException ||
					 //Custom exceptions handled
					 e instanceof AddressTypeException ||
					 e instanceof ContactTitleException ||
					 e instanceof HeardAboutUsException
					 ) {

				SessionErrors.add(actionRequest, e.getClass(), e);
			}
			else {
				throw e;
			}
		}

		if (Validator.isNull(PropsValues.COMPANY_SECURITY_STRANGERS_URL)) {
			return;
		}

		try {
			Layout layout = LayoutLocalServiceUtil.getFriendlyURLLayout(
				themeDisplay.getScopeGroupId(), false,
				PropsValues.COMPANY_SECURITY_STRANGERS_URL);

			String redirect = PortalUtil.getLayoutURL(layout, themeDisplay);

			sendRedirect(actionRequest, actionResponse, redirect);
		}
		catch (NoSuchLayoutException nsle) {
		}
	}

}
