<%--
/**
* Jsp page which allows for initialisation for other pages, allows
* specific imports to occur in a standard and easy way. Helps to 
* declutter pages which depend on these imports.
* 
* 
* Date: 12/10/2010
* Author: Kyle Pink
*/
--%>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/util" prefix="liferay-util" %>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>

<%@ page import="com.liferay.portal.kernel.util.StringPool" %>
<%@ page import="com.liferay.portal.kernel.util.UnicodeFormatter" %>
<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ page import="com.liferay.portal.kernel.util.ListUtil" %>
<%@ page import="com.liferay.portal.kernel.bean.BeanParamUtil" %>
<%@ page import="com.liferay.portal.kernel.workflow.WorkflowConstants" %>

<%@ page import="java.util.List" %>

<%@ page import="org.goodreturn.model.Story" %>
<%@ page import="org.goodreturn.model.TempBl" %>
<%@ page import="org.goodreturn.borrowers.util.WebKeys" %>
<%@ page import="org.goodreturn.borrowers.util.ActionUtil" %>

<portlet:defineObjects />

<liferay-theme:defineObjects />