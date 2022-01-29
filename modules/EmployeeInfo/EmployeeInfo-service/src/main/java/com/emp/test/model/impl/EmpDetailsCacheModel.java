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

package com.emp.test.model.impl;

import com.emp.test.model.EmpDetails;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing EmpDetails in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class EmpDetailsCacheModel
	implements CacheModel<EmpDetails>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof EmpDetailsCacheModel)) {
			return false;
		}

		EmpDetailsCacheModel empDetailsCacheModel =
			(EmpDetailsCacheModel)object;

		if (empId == empDetailsCacheModel.empId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, empId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", empId=");
		sb.append(empId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", empName=");
		sb.append(empName);
		sb.append(", phoneNum=");
		sb.append(phoneNum);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public EmpDetails toEntityModel() {
		EmpDetailsImpl empDetailsImpl = new EmpDetailsImpl();

		if (uuid == null) {
			empDetailsImpl.setUuid("");
		}
		else {
			empDetailsImpl.setUuid(uuid);
		}

		empDetailsImpl.setEmpId(empId);
		empDetailsImpl.setGroupId(groupId);

		if (empName == null) {
			empDetailsImpl.setEmpName("");
		}
		else {
			empDetailsImpl.setEmpName(empName);
		}

		empDetailsImpl.setPhoneNum(phoneNum);
		empDetailsImpl.setCompanyId(companyId);
		empDetailsImpl.setUserId(userId);

		if (userName == null) {
			empDetailsImpl.setUserName("");
		}
		else {
			empDetailsImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			empDetailsImpl.setCreateDate(null);
		}
		else {
			empDetailsImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			empDetailsImpl.setModifiedDate(null);
		}
		else {
			empDetailsImpl.setModifiedDate(new Date(modifiedDate));
		}

		empDetailsImpl.resetOriginalValues();

		return empDetailsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		empId = objectInput.readLong();

		groupId = objectInput.readLong();
		empName = objectInput.readUTF();

		phoneNum = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(empId);

		objectOutput.writeLong(groupId);

		if (empName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(empName);
		}

		objectOutput.writeLong(phoneNum);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
	}

	public String uuid;
	public long empId;
	public long groupId;
	public String empName;
	public long phoneNum;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;

}