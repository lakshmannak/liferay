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

package com.emp.test.service.persistence;

import com.emp.test.exception.NoSuchEmpDetailsException;
import com.emp.test.model.EmpDetails;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the emp details service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EmpDetailsUtil
 * @generated
 */
@ProviderType
public interface EmpDetailsPersistence extends BasePersistence<EmpDetails> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link EmpDetailsUtil} to access the emp details persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the emp detailses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching emp detailses
	 */
	public java.util.List<EmpDetails> findByUuid(String uuid);

	/**
	 * Returns a range of all the emp detailses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EmpDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of emp detailses
	 * @param end the upper bound of the range of emp detailses (not inclusive)
	 * @return the range of matching emp detailses
	 */
	public java.util.List<EmpDetails> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the emp detailses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EmpDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of emp detailses
	 * @param end the upper bound of the range of emp detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching emp detailses
	 */
	public java.util.List<EmpDetails> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EmpDetails>
			orderByComparator);

	/**
	 * Returns an ordered range of all the emp detailses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EmpDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of emp detailses
	 * @param end the upper bound of the range of emp detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching emp detailses
	 */
	public java.util.List<EmpDetails> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EmpDetails>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first emp details in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching emp details
	 * @throws NoSuchEmpDetailsException if a matching emp details could not be found
	 */
	public EmpDetails findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<EmpDetails>
				orderByComparator)
		throws NoSuchEmpDetailsException;

	/**
	 * Returns the first emp details in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching emp details, or <code>null</code> if a matching emp details could not be found
	 */
	public EmpDetails fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<EmpDetails>
			orderByComparator);

	/**
	 * Returns the last emp details in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching emp details
	 * @throws NoSuchEmpDetailsException if a matching emp details could not be found
	 */
	public EmpDetails findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<EmpDetails>
				orderByComparator)
		throws NoSuchEmpDetailsException;

	/**
	 * Returns the last emp details in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching emp details, or <code>null</code> if a matching emp details could not be found
	 */
	public EmpDetails fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<EmpDetails>
			orderByComparator);

	/**
	 * Returns the emp detailses before and after the current emp details in the ordered set where uuid = &#63;.
	 *
	 * @param empId the primary key of the current emp details
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next emp details
	 * @throws NoSuchEmpDetailsException if a emp details with the primary key could not be found
	 */
	public EmpDetails[] findByUuid_PrevAndNext(
			long empId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<EmpDetails>
				orderByComparator)
		throws NoSuchEmpDetailsException;

	/**
	 * Removes all the emp detailses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of emp detailses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching emp detailses
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the emp details where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchEmpDetailsException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching emp details
	 * @throws NoSuchEmpDetailsException if a matching emp details could not be found
	 */
	public EmpDetails findByUUID_G(String uuid, long groupId)
		throws NoSuchEmpDetailsException;

	/**
	 * Returns the emp details where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching emp details, or <code>null</code> if a matching emp details could not be found
	 */
	public EmpDetails fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the emp details where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching emp details, or <code>null</code> if a matching emp details could not be found
	 */
	public EmpDetails fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the emp details where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the emp details that was removed
	 */
	public EmpDetails removeByUUID_G(String uuid, long groupId)
		throws NoSuchEmpDetailsException;

	/**
	 * Returns the number of emp detailses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching emp detailses
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the emp detailses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching emp detailses
	 */
	public java.util.List<EmpDetails> findByUuid_C(String uuid, long companyId);

	/**
	 * Returns a range of all the emp detailses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EmpDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of emp detailses
	 * @param end the upper bound of the range of emp detailses (not inclusive)
	 * @return the range of matching emp detailses
	 */
	public java.util.List<EmpDetails> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the emp detailses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EmpDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of emp detailses
	 * @param end the upper bound of the range of emp detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching emp detailses
	 */
	public java.util.List<EmpDetails> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EmpDetails>
			orderByComparator);

	/**
	 * Returns an ordered range of all the emp detailses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EmpDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of emp detailses
	 * @param end the upper bound of the range of emp detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching emp detailses
	 */
	public java.util.List<EmpDetails> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EmpDetails>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first emp details in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching emp details
	 * @throws NoSuchEmpDetailsException if a matching emp details could not be found
	 */
	public EmpDetails findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<EmpDetails>
				orderByComparator)
		throws NoSuchEmpDetailsException;

	/**
	 * Returns the first emp details in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching emp details, or <code>null</code> if a matching emp details could not be found
	 */
	public EmpDetails fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<EmpDetails>
			orderByComparator);

	/**
	 * Returns the last emp details in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching emp details
	 * @throws NoSuchEmpDetailsException if a matching emp details could not be found
	 */
	public EmpDetails findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<EmpDetails>
				orderByComparator)
		throws NoSuchEmpDetailsException;

	/**
	 * Returns the last emp details in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching emp details, or <code>null</code> if a matching emp details could not be found
	 */
	public EmpDetails fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<EmpDetails>
			orderByComparator);

	/**
	 * Returns the emp detailses before and after the current emp details in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param empId the primary key of the current emp details
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next emp details
	 * @throws NoSuchEmpDetailsException if a emp details with the primary key could not be found
	 */
	public EmpDetails[] findByUuid_C_PrevAndNext(
			long empId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<EmpDetails>
				orderByComparator)
		throws NoSuchEmpDetailsException;

	/**
	 * Removes all the emp detailses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of emp detailses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching emp detailses
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Caches the emp details in the entity cache if it is enabled.
	 *
	 * @param empDetails the emp details
	 */
	public void cacheResult(EmpDetails empDetails);

	/**
	 * Caches the emp detailses in the entity cache if it is enabled.
	 *
	 * @param empDetailses the emp detailses
	 */
	public void cacheResult(java.util.List<EmpDetails> empDetailses);

	/**
	 * Creates a new emp details with the primary key. Does not add the emp details to the database.
	 *
	 * @param empId the primary key for the new emp details
	 * @return the new emp details
	 */
	public EmpDetails create(long empId);

	/**
	 * Removes the emp details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param empId the primary key of the emp details
	 * @return the emp details that was removed
	 * @throws NoSuchEmpDetailsException if a emp details with the primary key could not be found
	 */
	public EmpDetails remove(long empId) throws NoSuchEmpDetailsException;

	public EmpDetails updateImpl(EmpDetails empDetails);

	/**
	 * Returns the emp details with the primary key or throws a <code>NoSuchEmpDetailsException</code> if it could not be found.
	 *
	 * @param empId the primary key of the emp details
	 * @return the emp details
	 * @throws NoSuchEmpDetailsException if a emp details with the primary key could not be found
	 */
	public EmpDetails findByPrimaryKey(long empId)
		throws NoSuchEmpDetailsException;

	/**
	 * Returns the emp details with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param empId the primary key of the emp details
	 * @return the emp details, or <code>null</code> if a emp details with the primary key could not be found
	 */
	public EmpDetails fetchByPrimaryKey(long empId);

	/**
	 * Returns all the emp detailses.
	 *
	 * @return the emp detailses
	 */
	public java.util.List<EmpDetails> findAll();

	/**
	 * Returns a range of all the emp detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EmpDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of emp detailses
	 * @param end the upper bound of the range of emp detailses (not inclusive)
	 * @return the range of emp detailses
	 */
	public java.util.List<EmpDetails> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the emp detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EmpDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of emp detailses
	 * @param end the upper bound of the range of emp detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of emp detailses
	 */
	public java.util.List<EmpDetails> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EmpDetails>
			orderByComparator);

	/**
	 * Returns an ordered range of all the emp detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EmpDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of emp detailses
	 * @param end the upper bound of the range of emp detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of emp detailses
	 */
	public java.util.List<EmpDetails> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EmpDetails>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the emp detailses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of emp detailses.
	 *
	 * @return the number of emp detailses
	 */
	public int countAll();

}