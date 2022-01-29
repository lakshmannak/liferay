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

package com.emp.test.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link EmpDetails}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EmpDetails
 * @generated
 */
public class EmpDetailsWrapper
	extends BaseModelWrapper<EmpDetails>
	implements EmpDetails, ModelWrapper<EmpDetails> {

	public EmpDetailsWrapper(EmpDetails empDetails) {
		super(empDetails);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("empId", getEmpId());
		attributes.put("groupId", getGroupId());
		attributes.put("empName", getEmpName());
		attributes.put("phoneNum", getPhoneNum());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long empId = (Long)attributes.get("empId");

		if (empId != null) {
			setEmpId(empId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		String empName = (String)attributes.get("empName");

		if (empName != null) {
			setEmpName(empName);
		}

		Long phoneNum = (Long)attributes.get("phoneNum");

		if (phoneNum != null) {
			setPhoneNum(phoneNum);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}
	}

	@Override
	public EmpDetails cloneWithOriginalValues() {
		return model.cloneWithOriginalValues();
	}

	/**
	 * Returns the company ID of this emp details.
	 *
	 * @return the company ID of this emp details
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this emp details.
	 *
	 * @return the create date of this emp details
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the emp ID of this emp details.
	 *
	 * @return the emp ID of this emp details
	 */
	@Override
	public long getEmpId() {
		return model.getEmpId();
	}

	/**
	 * Returns the emp name of this emp details.
	 *
	 * @return the emp name of this emp details
	 */
	@Override
	public String getEmpName() {
		return model.getEmpName();
	}

	/**
	 * Returns the group ID of this emp details.
	 *
	 * @return the group ID of this emp details
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this emp details.
	 *
	 * @return the modified date of this emp details
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the phone num of this emp details.
	 *
	 * @return the phone num of this emp details
	 */
	@Override
	public long getPhoneNum() {
		return model.getPhoneNum();
	}

	/**
	 * Returns the primary key of this emp details.
	 *
	 * @return the primary key of this emp details
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this emp details.
	 *
	 * @return the user ID of this emp details
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this emp details.
	 *
	 * @return the user name of this emp details
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this emp details.
	 *
	 * @return the user uuid of this emp details
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this emp details.
	 *
	 * @return the uuid of this emp details
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the company ID of this emp details.
	 *
	 * @param companyId the company ID of this emp details
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this emp details.
	 *
	 * @param createDate the create date of this emp details
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the emp ID of this emp details.
	 *
	 * @param empId the emp ID of this emp details
	 */
	@Override
	public void setEmpId(long empId) {
		model.setEmpId(empId);
	}

	/**
	 * Sets the emp name of this emp details.
	 *
	 * @param empName the emp name of this emp details
	 */
	@Override
	public void setEmpName(String empName) {
		model.setEmpName(empName);
	}

	/**
	 * Sets the group ID of this emp details.
	 *
	 * @param groupId the group ID of this emp details
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this emp details.
	 *
	 * @param modifiedDate the modified date of this emp details
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the phone num of this emp details.
	 *
	 * @param phoneNum the phone num of this emp details
	 */
	@Override
	public void setPhoneNum(long phoneNum) {
		model.setPhoneNum(phoneNum);
	}

	/**
	 * Sets the primary key of this emp details.
	 *
	 * @param primaryKey the primary key of this emp details
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this emp details.
	 *
	 * @param userId the user ID of this emp details
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this emp details.
	 *
	 * @param userName the user name of this emp details
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this emp details.
	 *
	 * @param userUuid the user uuid of this emp details
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this emp details.
	 *
	 * @param uuid the uuid of this emp details
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected EmpDetailsWrapper wrap(EmpDetails empDetails) {
		return new EmpDetailsWrapper(empDetails);
	}

}