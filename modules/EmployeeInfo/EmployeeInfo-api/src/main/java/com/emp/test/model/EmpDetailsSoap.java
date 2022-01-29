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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.emp.test.service.http.EmpDetailsServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class EmpDetailsSoap implements Serializable {

	public static EmpDetailsSoap toSoapModel(EmpDetails model) {
		EmpDetailsSoap soapModel = new EmpDetailsSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setEmpId(model.getEmpId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setEmpName(model.getEmpName());
		soapModel.setPhoneNum(model.getPhoneNum());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());

		return soapModel;
	}

	public static EmpDetailsSoap[] toSoapModels(EmpDetails[] models) {
		EmpDetailsSoap[] soapModels = new EmpDetailsSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static EmpDetailsSoap[][] toSoapModels(EmpDetails[][] models) {
		EmpDetailsSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new EmpDetailsSoap[models.length][models[0].length];
		}
		else {
			soapModels = new EmpDetailsSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static EmpDetailsSoap[] toSoapModels(List<EmpDetails> models) {
		List<EmpDetailsSoap> soapModels = new ArrayList<EmpDetailsSoap>(
			models.size());

		for (EmpDetails model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new EmpDetailsSoap[soapModels.size()]);
	}

	public EmpDetailsSoap() {
	}

	public long getPrimaryKey() {
		return _empId;
	}

	public void setPrimaryKey(long pk) {
		setEmpId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getEmpId() {
		return _empId;
	}

	public void setEmpId(long empId) {
		_empId = empId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public String getEmpName() {
		return _empName;
	}

	public void setEmpName(String empName) {
		_empName = empName;
	}

	public long getPhoneNum() {
		return _phoneNum;
	}

	public void setPhoneNum(long phoneNum) {
		_phoneNum = phoneNum;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	private String _uuid;
	private long _empId;
	private long _groupId;
	private String _empName;
	private long _phoneNum;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;

}