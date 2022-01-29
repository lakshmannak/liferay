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

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;liferay_EmpDetails&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see EmpDetails
 * @generated
 */
public class EmpDetailsTable extends BaseTable<EmpDetailsTable> {

	public static final EmpDetailsTable INSTANCE = new EmpDetailsTable();

	public final Column<EmpDetailsTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<EmpDetailsTable, Long> empId = createColumn(
		"empId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<EmpDetailsTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<EmpDetailsTable, String> empName = createColumn(
		"empName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<EmpDetailsTable, Long> phoneNum = createColumn(
		"phoneNum", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<EmpDetailsTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<EmpDetailsTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<EmpDetailsTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<EmpDetailsTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<EmpDetailsTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);

	private EmpDetailsTable() {
		super("liferay_EmpDetails", EmpDetailsTable::new);
	}

}