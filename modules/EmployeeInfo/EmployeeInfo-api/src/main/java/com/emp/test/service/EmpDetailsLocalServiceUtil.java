/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
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

package com.emp.test.service;

import com.emp.test.model.EmpDetails;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for EmpDetails. This utility wraps
 * <code>com.emp.test.service.impl.EmpDetailsLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see EmpDetailsLocalService
 * @generated
 */
public class EmpDetailsLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.emp.test.service.impl.EmpDetailsLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the emp details to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EmpDetailsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param empDetails the emp details
	 * @return the emp details that was added
	 */
	public static EmpDetails addEmpDetails(EmpDetails empDetails) {
		return getService().addEmpDetails(empDetails);
	}

	/**
	 * Creates a new emp details with the primary key. Does not add the emp details to the database.
	 *
	 * @param empId the primary key for the new emp details
	 * @return the new emp details
	 */
	public static EmpDetails createEmpDetails(long empId) {
		return getService().createEmpDetails(empId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel createPersistedModel(
			Serializable primaryKeyObj)
		throws PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the emp details from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EmpDetailsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param empDetails the emp details
	 * @return the emp details that was removed
	 */
	public static EmpDetails deleteEmpDetails(EmpDetails empDetails) {
		return getService().deleteEmpDetails(empDetails);
	}

	/**
	 * Deletes the emp details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EmpDetailsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param empId the primary key of the emp details
	 * @return the emp details that was removed
	 * @throws PortalException if a emp details with the primary key could not be found
	 */
	public static EmpDetails deleteEmpDetails(long empId)
		throws PortalException {

		return getService().deleteEmpDetails(empId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static <T> T dslQuery(DSLQuery dslQuery) {
		return getService().dslQuery(dslQuery);
	}

	public static int dslQueryCount(DSLQuery dslQuery) {
		return getService().dslQueryCount(dslQuery);
	}

	public static DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.emp.test.model.impl.EmpDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.emp.test.model.impl.EmpDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static EmpDetails fetchEmpDetails(long empId) {
		return getService().fetchEmpDetails(empId);
	}

	/**
	 * Returns the emp details matching the UUID and group.
	 *
	 * @param uuid the emp details's UUID
	 * @param groupId the primary key of the group
	 * @return the matching emp details, or <code>null</code> if a matching emp details could not be found
	 */
	public static EmpDetails fetchEmpDetailsByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchEmpDetailsByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the emp details with the primary key.
	 *
	 * @param empId the primary key of the emp details
	 * @return the emp details
	 * @throws PortalException if a emp details with the primary key could not be found
	 */
	public static EmpDetails getEmpDetails(long empId) throws PortalException {
		return getService().getEmpDetails(empId);
	}

	/**
	 * Returns the emp details matching the UUID and group.
	 *
	 * @param uuid the emp details's UUID
	 * @param groupId the primary key of the group
	 * @return the matching emp details
	 * @throws PortalException if a matching emp details could not be found
	 */
	public static EmpDetails getEmpDetailsByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getEmpDetailsByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the emp detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.emp.test.model.impl.EmpDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of emp detailses
	 * @param end the upper bound of the range of emp detailses (not inclusive)
	 * @return the range of emp detailses
	 */
	public static List<EmpDetails> getEmpDetailses(int start, int end) {
		return getService().getEmpDetailses(start, end);
	}

	/**
	 * Returns all the emp detailses matching the UUID and company.
	 *
	 * @param uuid the UUID of the emp detailses
	 * @param companyId the primary key of the company
	 * @return the matching emp detailses, or an empty list if no matches were found
	 */
	public static List<EmpDetails> getEmpDetailsesByUuidAndCompanyId(
		String uuid, long companyId) {

		return getService().getEmpDetailsesByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of emp detailses matching the UUID and company.
	 *
	 * @param uuid the UUID of the emp detailses
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of emp detailses
	 * @param end the upper bound of the range of emp detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching emp detailses, or an empty list if no matches were found
	 */
	public static List<EmpDetails> getEmpDetailsesByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<EmpDetails> orderByComparator) {

		return getService().getEmpDetailsesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of emp detailses.
	 *
	 * @return the number of emp detailses
	 */
	public static int getEmpDetailsesCount() {
		return getService().getEmpDetailsesCount();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the emp details in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EmpDetailsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param empDetails the emp details
	 * @return the emp details that was updated
	 */
	public static EmpDetails updateEmpDetails(EmpDetails empDetails) {
		return getService().updateEmpDetails(empDetails);
	}

	public static EmpDetailsLocalService getService() {
		return _service;
	}

	private static volatile EmpDetailsLocalService _service;

}