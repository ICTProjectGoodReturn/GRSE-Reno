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

package org.GoodReturn.service;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.io.unsync.UnsyncByteArrayInputStream;
import com.liferay.portal.kernel.io.unsync.UnsyncByteArrayOutputStream;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ClassLoaderObjectInputStream;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.BaseModel;

import org.GoodReturn.model.BorrowerClp;
import org.GoodReturn.model.Gift_CertificateClp;
import org.GoodReturn.model.LenderClp;
import org.GoodReturn.model.PersonClp;
import org.GoodReturn.model.StoryClp;
import org.GoodReturn.model.Supplementary_TableClp;
import org.GoodReturn.model.TeamClp;
import org.GoodReturn.model.TeamLenderClp;
import org.GoodReturn.model.TeamLenderLoanClp;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.lang.reflect.Method;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Brian Wing Shun Chan
 */
public class ClpSerializer {
	public static String getServletContextName() {
		if (Validator.isNotNull(_servletContextName)) {
			return _servletContextName;
		}

		synchronized (ClpSerializer.class) {
			if (Validator.isNotNull(_servletContextName)) {
				return _servletContextName;
			}

			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Class<?> portletPropsClass = classLoader.loadClass(
						"com.liferay.util.portlet.PortletProps");

				Method getMethod = portletPropsClass.getMethod("get",
						new Class<?>[] { String.class });

				String portletPropsServletContextName = (String)getMethod.invoke(null,
						"Portal_DB-portlet-deployment-context");

				if (Validator.isNotNull(portletPropsServletContextName)) {
					_servletContextName = portletPropsServletContextName;
				}
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info(
						"Unable to locate deployment context from portlet properties");
				}
			}

			if (Validator.isNull(_servletContextName)) {
				try {
					String propsUtilServletContextName = PropsUtil.get(
							"Portal_DB-portlet-deployment-context");

					if (Validator.isNotNull(propsUtilServletContextName)) {
						_servletContextName = propsUtilServletContextName;
					}
				}
				catch (Throwable t) {
					if (_log.isInfoEnabled()) {
						_log.info(
							"Unable to locate deployment context from portal properties");
					}
				}
			}

			if (Validator.isNull(_servletContextName)) {
				_servletContextName = "Portal_DB-portlet";
			}

			return _servletContextName;
		}
	}

	public static Object translateInput(BaseModel<?> oldModel) {
		Class<?> oldModelClass = oldModel.getClass();

		String oldModelClassName = oldModelClass.getName();

		if (oldModelClassName.equals(BorrowerClp.class.getName())) {
			return translateInputBorrower(oldModel);
		}

		if (oldModelClassName.equals(Gift_CertificateClp.class.getName())) {
			return translateInputGift_Certificate(oldModel);
		}

		if (oldModelClassName.equals(LenderClp.class.getName())) {
			return translateInputLender(oldModel);
		}

		if (oldModelClassName.equals(PersonClp.class.getName())) {
			return translateInputPerson(oldModel);
		}

		if (oldModelClassName.equals(StoryClp.class.getName())) {
			return translateInputStory(oldModel);
		}

		if (oldModelClassName.equals(Supplementary_TableClp.class.getName())) {
			return translateInputSupplementary_Table(oldModel);
		}

		if (oldModelClassName.equals(TeamClp.class.getName())) {
			return translateInputTeam(oldModel);
		}

		if (oldModelClassName.equals(TeamLenderClp.class.getName())) {
			return translateInputTeamLender(oldModel);
		}

		if (oldModelClassName.equals(TeamLenderLoanClp.class.getName())) {
			return translateInputTeamLenderLoan(oldModel);
		}

		return oldModel;
	}

	public static Object translateInput(List<Object> oldList) {
		List<Object> newList = new ArrayList<Object>(oldList.size());

		for (int i = 0; i < oldList.size(); i++) {
			Object curObj = oldList.get(i);

			newList.add(translateInput(curObj));
		}

		return newList;
	}

	public static Object translateInputBorrower(BaseModel<?> oldModel) {
		BorrowerClp oldClpModel = (BorrowerClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getBorrowerRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputGift_Certificate(BaseModel<?> oldModel) {
		Gift_CertificateClp oldClpModel = (Gift_CertificateClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getGift_CertificateRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputLender(BaseModel<?> oldModel) {
		LenderClp oldClpModel = (LenderClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getLenderRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputPerson(BaseModel<?> oldModel) {
		PersonClp oldClpModel = (PersonClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getPersonRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputStory(BaseModel<?> oldModel) {
		StoryClp oldClpModel = (StoryClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getStoryRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputSupplementary_Table(
		BaseModel<?> oldModel) {
		Supplementary_TableClp oldClpModel = (Supplementary_TableClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getSupplementary_TableRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputTeam(BaseModel<?> oldModel) {
		TeamClp oldClpModel = (TeamClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getTeamRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputTeamLender(BaseModel<?> oldModel) {
		TeamLenderClp oldClpModel = (TeamLenderClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getTeamLenderRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputTeamLenderLoan(BaseModel<?> oldModel) {
		TeamLenderLoanClp oldClpModel = (TeamLenderLoanClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getTeamLenderLoanRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInput(Object obj) {
		if (obj instanceof BaseModel<?>) {
			return translateInput((BaseModel<?>)obj);
		}
		else if (obj instanceof List<?>) {
			return translateInput((List<Object>)obj);
		}
		else {
			return obj;
		}
	}

	public static Object translateOutput(BaseModel<?> oldModel) {
		Class<?> oldModelClass = oldModel.getClass();

		String oldModelClassName = oldModelClass.getName();

		if (oldModelClassName.equals("org.GoodReturn.model.impl.BorrowerImpl")) {
			return translateOutputBorrower(oldModel);
		}

		if (oldModelClassName.equals(
					"org.GoodReturn.model.impl.Gift_CertificateImpl")) {
			return translateOutputGift_Certificate(oldModel);
		}

		if (oldModelClassName.equals("org.GoodReturn.model.impl.LenderImpl")) {
			return translateOutputLender(oldModel);
		}

		if (oldModelClassName.equals("org.GoodReturn.model.impl.PersonImpl")) {
			return translateOutputPerson(oldModel);
		}

		if (oldModelClassName.equals("org.GoodReturn.model.impl.StoryImpl")) {
			return translateOutputStory(oldModel);
		}

		if (oldModelClassName.equals(
					"org.GoodReturn.model.impl.Supplementary_TableImpl")) {
			return translateOutputSupplementary_Table(oldModel);
		}

		if (oldModelClassName.equals("org.GoodReturn.model.impl.TeamImpl")) {
			return translateOutputTeam(oldModel);
		}

		if (oldModelClassName.equals("org.GoodReturn.model.impl.TeamLenderImpl")) {
			return translateOutputTeamLender(oldModel);
		}

		if (oldModelClassName.equals(
					"org.GoodReturn.model.impl.TeamLenderLoanImpl")) {
			return translateOutputTeamLenderLoan(oldModel);
		}

		return oldModel;
	}

	public static Object translateOutput(List<Object> oldList) {
		List<Object> newList = new ArrayList<Object>(oldList.size());

		for (int i = 0; i < oldList.size(); i++) {
			Object curObj = oldList.get(i);

			newList.add(translateOutput(curObj));
		}

		return newList;
	}

	public static Object translateOutput(Object obj) {
		if (obj instanceof BaseModel<?>) {
			return translateOutput((BaseModel<?>)obj);
		}
		else if (obj instanceof List<?>) {
			return translateOutput((List<Object>)obj);
		}
		else {
			return obj;
		}
	}

	public static Throwable translateThrowable(Throwable throwable) {
		if (_useReflectionToTranslateThrowable) {
			try {
				UnsyncByteArrayOutputStream unsyncByteArrayOutputStream = new UnsyncByteArrayOutputStream();
				ObjectOutputStream objectOutputStream = new ObjectOutputStream(unsyncByteArrayOutputStream);

				objectOutputStream.writeObject(throwable);

				objectOutputStream.flush();
				objectOutputStream.close();

				UnsyncByteArrayInputStream unsyncByteArrayInputStream = new UnsyncByteArrayInputStream(unsyncByteArrayOutputStream.unsafeGetByteArray(),
						0, unsyncByteArrayOutputStream.size());

				Thread currentThread = Thread.currentThread();

				ClassLoader contextClassLoader = currentThread.getContextClassLoader();

				ObjectInputStream objectInputStream = new ClassLoaderObjectInputStream(unsyncByteArrayInputStream,
						contextClassLoader);

				throwable = (Throwable)objectInputStream.readObject();

				objectInputStream.close();

				return throwable;
			}
			catch (SecurityException se) {
				if (_log.isInfoEnabled()) {
					_log.info("Do not use reflection to translate throwable");
				}

				_useReflectionToTranslateThrowable = false;
			}
			catch (Throwable throwable2) {
				_log.error(throwable2, throwable2);

				return throwable2;
			}
		}

		Class<?> clazz = throwable.getClass();

		String className = clazz.getName();

		if (className.equals(PortalException.class.getName())) {
			return new PortalException();
		}

		if (className.equals(SystemException.class.getName())) {
			return new SystemException();
		}

		if (className.equals("org.GoodReturn.NoSuchBorrowerException")) {
			return new org.GoodReturn.NoSuchBorrowerException();
		}

		if (className.equals("org.GoodReturn.NoSuchGift_CertificateException")) {
			return new org.GoodReturn.NoSuchGift_CertificateException();
		}

		if (className.equals("org.GoodReturn.NoSuchLenderException")) {
			return new org.GoodReturn.NoSuchLenderException();
		}

		if (className.equals("org.GoodReturn.NoSuchPersonException")) {
			return new org.GoodReturn.NoSuchPersonException();
		}

		if (className.equals("org.GoodReturn.NoSuchStoryException")) {
			return new org.GoodReturn.NoSuchStoryException();
		}

		if (className.equals(
					"org.GoodReturn.NoSuchSupplementary_TableException")) {
			return new org.GoodReturn.NoSuchSupplementary_TableException();
		}

		if (className.equals("org.GoodReturn.NoSuchTeamException")) {
			return new org.GoodReturn.NoSuchTeamException();
		}

		if (className.equals("org.GoodReturn.NoSuchTeamLenderException")) {
			return new org.GoodReturn.NoSuchTeamLenderException();
		}

		if (className.equals("org.GoodReturn.NoSuchTeamLenderLoanException")) {
			return new org.GoodReturn.NoSuchTeamLenderLoanException();
		}

		return throwable;
	}

	public static Object translateOutputBorrower(BaseModel<?> oldModel) {
		BorrowerClp newModel = new BorrowerClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setBorrowerRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputGift_Certificate(BaseModel<?> oldModel) {
		Gift_CertificateClp newModel = new Gift_CertificateClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setGift_CertificateRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputLender(BaseModel<?> oldModel) {
		LenderClp newModel = new LenderClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setLenderRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputPerson(BaseModel<?> oldModel) {
		PersonClp newModel = new PersonClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setPersonRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputStory(BaseModel<?> oldModel) {
		StoryClp newModel = new StoryClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setStoryRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputSupplementary_Table(
		BaseModel<?> oldModel) {
		Supplementary_TableClp newModel = new Supplementary_TableClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setSupplementary_TableRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputTeam(BaseModel<?> oldModel) {
		TeamClp newModel = new TeamClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setTeamRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputTeamLender(BaseModel<?> oldModel) {
		TeamLenderClp newModel = new TeamLenderClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setTeamLenderRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputTeamLenderLoan(BaseModel<?> oldModel) {
		TeamLenderLoanClp newModel = new TeamLenderLoanClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setTeamLenderLoanRemoteModel(oldModel);

		return newModel;
	}

	private static Log _log = LogFactoryUtil.getLog(ClpSerializer.class);
	private static String _servletContextName;
	private static boolean _useReflectionToTranslateThrowable = true;
}