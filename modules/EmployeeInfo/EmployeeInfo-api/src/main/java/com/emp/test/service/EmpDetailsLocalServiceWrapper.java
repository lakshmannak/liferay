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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EmpDetailsLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see EmpDetailsLocalService
 * @generated
 */
public class EmpDetailsLocalServiceWrapper
	implements EmpDetailsLocalService, ServiceWrapper<EmpDetailsLocalService> {

	public EmpDetailsLocalServiceWrapper(
		EmpDetailsLocalService empDetailsLocalService) {

		_empDetailsLocalService = empDetailsLocalService;
	}

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
	@Override
	public com.emp.test.model.EmpDetails addEmpDetails(
		com.emp.test.model.EmpDetails empDetails) {

		return _empDetailsLocalService.addEmpDetails(empDetails);
	}

	/**
	 * Creates a new emp details with the primary key. Does not add the emp details to the database.
	 *
	 * @param empId the primary key for the new emp details
	 * @return the new emp details
	 */
	@Override
	public com.emp.test.model.EmpDetails createEmpDetails(long empId) {
		return _empDetailsLocalService.createEmpDetails(empId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _empDetailsLocalService.createPersistedModel(primaryKeyObj);
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
	@Override
	public com.emp.test.model.EmpDetails deleteEmpDetails(
		com.emp.test.model.EmpDetails empDetails) {

		return _empDetailsLocalService.deleteEmpDetails(empDetails);
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
	@Override
	public com.emp.test.model.EmpDetails deleteEmpDetails(long empId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _empDetailsLocalService.deleteEmpDetails(empId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _empDetailsLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _empDetailsLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _empDetailsLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _empDetailsLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _empDetailsLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _empDetailsLocalService.dynamicQuery(dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _empDetailsLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _empDetailsLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _empDetailsLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.emp.test.model.EmpDetails fetchEmpDetails(long empId) {
		return _empDetailsLocalService.fetchEmpDetails(empId);
	}

	/**
	 * Returns the emp details matching the UUID and group.
	 *
	 * @param uuid the emp details's UUID
	 * @param groupId the primary key of the group
	 * @return the matching emp details, or <code>null</code> if a matching emp details could not be found
	 */
	@Override
	public com.emp.test.model.EmpDetails fetchEmpDetailsByUuidAndGroupId(
		String uuid, long groupId) {

		return _empDetailsLocalService.fetchEmpDetailsByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _empDetailsLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the emp details with the primary key.
	 *
	 * @param empId the primary key of the emp details
	 * @return the emp details
	 * @throws PortalException if a emp details with the primary key could not be found
	 */
	@Override
	public com.emp.test.model.EmpDetails getEmpDetails(long empId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _empDetailsLocalService.getEmpDetails(empId);
	}

	/**
	 * Returns the emp details matching the UUID and group.
	 *
	 * @param uuid the emp details's UUID
	 * @param groupId the primary key of the group
	 * @return the matching emp details
	 * @throws PortalException if a matching emp details could not be found
	 */
	@Override
	public com.emp.test.model.EmpDetails getEmpDetailsByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _empDetailsLocalService.getEmpDetailsByUuidAndGroupId(
			uuid, groupId);
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
	@Override
	public java.util.List<com.emp.test.model.EmpDetails> getEmpDetailses(
		int start, int end) {

		return _empDetailsLocalService.getEmpDetailses(start, end);
	}

	/**
	 * Returns all the emp detailses matching the UUID and company.
	 *
	 * @param uuid the UUID of the emp detailses
	 * @param companyId the primary key of the company
	 * @return the matching emp detailses, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.emp.test.model.EmpDetails>
		getEmpDetailsesByUuidAndCompanyId(String uuid, long companyId) {

		return _empDetailsLocalService.getEmpDetailsesByUuidAndCompanyId(
			uuid, companyId);
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
	@Override
	public java.util.List<com.emp.test.model.EmpDetails>
		getEmpDetailsesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.emp.test.model.EmpDetails> orderByComparator) {

		return _empDetailsLocalService.getEmpDetailsesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of emp detailses.
	 *
	 * @return the number of emp detailses
	 */
	@Override
	public int getEmpDetailsesCount() {
		return _empDetailsLocalService.getEmpDetailsesCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _empDetailsLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _empDetailsLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _empDetailsLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _empDetailsLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public com.emp.test.model.EmpDetails updateEmpDetails(
		com.emp.test.model.EmpDetails empDetails) {

		return _empDetailsLocalService.updateEmpDetails(empDetails);
	}

	@Override
	public EmpDetailsLocalService getWrappedService() {
		return _empDetailsLocalService;
	}

	@Override
	public void setWrappedService(
		EmpDetailsLocalService empDetailsLocalService) {

		_empDetailsLocalService = empDetailsLocalService;
	}

	private EmpDetailsLocalService _empDetailsLocalService;

}