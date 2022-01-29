create table liferay_EmpDetails (
	uuid_ VARCHAR(75) null,
	empId LONG not null primary key,
	groupId LONG,
	empName VARCHAR(75) null,
	phoneNum LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null
);