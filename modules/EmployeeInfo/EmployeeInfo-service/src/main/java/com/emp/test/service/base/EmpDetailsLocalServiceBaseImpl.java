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

package com.emp.test.service.base;

import com.emp.test.model.EmpDetails;
import com.emp.test.service.EmpDetailsLocalService;
import com.emp.test.service.EmpDetailsLocalServiceUtil;
import com.emp.test.service.persistence.EmpDetailsPersistence;

import com.liferay.exportimport.kernel.lar.ExportImportHelperUtil;
import com.liferay.exportimport.kernel.lar.ManifestSummary;
import com.liferay.exportimport.kernel.lar.PortletDataContext;
import com.liferay.exportimport.kernel.lar.StagedModelDataHandlerUtil;
import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DefaultActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalServiceImpl;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PortalUtil;

import java.io.Serializable;

import java.lang.reflect.Field;

import java.util.List;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the emp details local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.emp.test.service.impl.EmpDetailsLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.emp.test.service.impl.EmpDetailsLocalServiceImpl
 * @generated
 */
public abstract class EmpDetailsLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, EmpDetailsLocalService, IdentifiableOSGiService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>EmpDetailsLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>EmpDetailsLocalServiceUtil</code>.
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
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public EmpDetails addEmpDetails(EmpDetails empDetails) {
		empDetails.setNew(true);

		return empDetailsPersistence.update(empDetails);
	}

	/**
	 * Creates a new emp details with the primary key. Does not add the emp details to the database.
	 *
	 * @param empId the primary key for the new emp details
	 * @return the new emp details
	 */
	@Override
	@Transactional(enabled = false)
	public EmpDetails createEmpDetails(long empId) {
		return empDetailsPersistence.create(empId);
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
	@Indexable(type = IndexableType.DELETE)
	@Override
	public EmpDetails deleteEmpDetails(long empId) throws PortalException {
		return empDetailsPersistence.remove(empId);
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
	@Indexable(type = IndexableType.DELETE)
	@Override
	public EmpDetails deleteEmpDetails(EmpDetails empDetails) {
		return empDetailsPersistence.remove(empDetails);
	}

	@Override
	public <T> T dslQuery(DSLQuery dslQuery) {
		return empDetailsPersistence.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(DSLQuery dslQuery) {
		Long count = dslQuery(dslQuery);

		return count.intValue();
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(
			EmpDetails.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return empDetailsPersistence.findWithDynamicQuery(dynamicQuery);
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
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return empDetailsPersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
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
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return empDetailsPersistence.findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return empDetailsPersistence.countWithDynamicQuery(dynamicQuery);
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
		DynamicQuery dynamicQuery, Projection projection) {

		return empDetailsPersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public EmpDetails fetchEmpDetails(long empId) {
		return empDetailsPersistence.fetchByPrimaryKey(empId);
	}

	/**
	 * Returns the emp details matching the UUID and group.
	 *
	 * @param uuid the emp details's UUID
	 * @param groupId the primary key of the group
	 * @return the matching emp details, or <code>null</code> if a matching emp details could not be found
	 */
	@Override
	public EmpDetails fetchEmpDetailsByUuidAndGroupId(
		String uuid, long groupId) {

		return empDetailsPersistence.fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the emp details with the primary key.
	 *
	 * @param empId the primary key of the emp details
	 * @return the emp details
	 * @throws PortalException if a emp details with the primary key could not be found
	 */
	@Override
	public EmpDetails getEmpDetails(long empId) throws PortalException {
		return empDetailsPersistence.findByPrimaryKey(empId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(empDetailsLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(EmpDetails.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("empId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			empDetailsLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(EmpDetails.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName("empId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(empDetailsLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(EmpDetails.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("empId");
	}

	@Override
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		final PortletDataContext portletDataContext) {

		final ExportActionableDynamicQuery exportActionableDynamicQuery =
			new ExportActionableDynamicQuery() {

				@Override
				public long performCount() throws PortalException {
					ManifestSummary manifestSummary =
						portletDataContext.getManifestSummary();

					StagedModelType stagedModelType = getStagedModelType();

					long modelAdditionCount = super.performCount();

					manifestSummary.addModelAdditionCount(
						stagedModelType, modelAdditionCount);

					long modelDeletionCount =
						ExportImportHelperUtil.getModelDeletionCount(
							portletDataContext, stagedModelType);

					manifestSummary.addModelDeletionCount(
						stagedModelType, modelDeletionCount);

					return modelAdditionCount;
				}

			};

		initActionableDynamicQuery(exportActionableDynamicQuery);

		exportActionableDynamicQuery.setAddCriteriaMethod(
			new ActionableDynamicQuery.AddCriteriaMethod() {

				@Override
				public void addCriteria(DynamicQuery dynamicQuery) {
					portletDataContext.addDateRangeCriteria(
						dynamicQuery, "modifiedDate");
				}

			});

		exportActionableDynamicQuery.setCompanyId(
			portletDataContext.getCompanyId());

		exportActionableDynamicQuery.setPerformActionMethod(
			new ActionableDynamicQuery.PerformActionMethod<EmpDetails>() {

				@Override
				public void performAction(EmpDetails empDetails)
					throws PortalException {

					StagedModelDataHandlerUtil.exportStagedModel(
						portletDataContext, empDetails);
				}

			});
		exportActionableDynamicQuery.setStagedModelType(
			new StagedModelType(
				PortalUtil.getClassNameId(EmpDetails.class.getName())));

		return exportActionableDynamicQuery;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return empDetailsPersistence.create(((Long)primaryKeyObj).longValue());
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {

		return empDetailsLocalService.deleteEmpDetails(
			(EmpDetails)persistedModel);
	}

	@Override
	public BasePersistence<EmpDetails> getBasePersistence() {
		return empDetailsPersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return empDetailsPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns all the emp detailses matching the UUID and company.
	 *
	 * @param uuid the UUID of the emp detailses
	 * @param companyId the primary key of the company
	 * @return the matching emp detailses, or an empty list if no matches were found
	 */
	@Override
	public List<EmpDetails> getEmpDetailsesByUuidAndCompanyId(
		String uuid, long companyId) {

		return empDetailsPersistence.findByUuid_C(uuid, companyId);
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
	public List<EmpDetails> getEmpDetailsesByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<EmpDetails> orderByComparator) {

		return empDetailsPersistence.findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
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
	public EmpDetails getEmpDetailsByUuidAndGroupId(String uuid, long groupId)
		throws PortalException {

		return empDetailsPersistence.findByUUID_G(uuid, groupId);
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
	public List<EmpDetails> getEmpDetailses(int start, int end) {
		return empDetailsPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of emp detailses.
	 *
	 * @return the number of emp detailses
	 */
	@Override
	public int getEmpDetailsesCount() {
		return empDetailsPersistence.countAll();
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
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public EmpDetails updateEmpDetails(EmpDetails empDetails) {
		return empDetailsPersistence.update(empDetails);
	}

	@Deactivate
	protected void deactivate() {
		_setLocalServiceUtilService(null);
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			EmpDetailsLocalService.class, IdentifiableOSGiService.class,
			PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		empDetailsLocalService = (EmpDetailsLocalService)aopProxy;

		_setLocalServiceUtilService(empDetailsLocalService);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return EmpDetailsLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return EmpDetails.class;
	}

	protected String getModelClassName() {
		return EmpDetails.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = empDetailsPersistence.getDataSource();

			DB db = DBManagerUtil.getDB();

			sql = db.buildSQL(sql);
			sql = PortalUtil.transformSQL(sql);

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(
				dataSource, sql);

			sqlUpdate.update();
		}
		catch (Exception exception) {
			throw new SystemException(exception);
		}
	}

	private void _setLocalServiceUtilService(
		EmpDetailsLocalService empDetailsLocalService) {

		try {
			Field field = EmpDetailsLocalServiceUtil.class.getDeclaredField(
				"_service");

			field.setAccessible(true);

			field.set(null, empDetailsLocalService);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
		}
	}

	protected EmpDetailsLocalService empDetailsLocalService;

	@Reference
	protected EmpDetailsPersistence empDetailsPersistence;

	@Reference
	protected com.liferay.counter.kernel.service.CounterLocalService
		counterLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.ClassNameLocalService
		classNameLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.ResourceLocalService
		resourceLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.UserLocalService
		userLocalService;

	@Reference
	protected com.liferay.asset.kernel.service.AssetEntryLocalService
		assetEntryLocalService;

	@Reference
	protected com.liferay.asset.kernel.service.AssetTagLocalService
		assetTagLocalService;

}