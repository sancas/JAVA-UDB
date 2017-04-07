<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<!DOCTYPE html>
<html>
<head>
	<title>Lista Empleados</title>
</head>
<body>
<font size=4 face="verdana" color=#112244>
<sql:setDataSource
	driver="com.mysql.jdbc.Driver"
	url="jdbc:mysql://localhost:3306/db_employees"
	user="root"
	password=""
	var="dataSource"
/>
<sql:query var="Employees" dataSource="${dataSource}">
SELECT * FROM employees
</sql:query>
<table border=1>
	<tr>
		<th>Number</th>
		<th>Last Name</th>
		<th>First Name</th>
	</tr>
	<c:forEach var="row" items="${Employees.rows}">
	<tr>
		<td><c:out value="${row.employee_num}" /></td>
		<td><c:out value="${row.lname_txt}" /></td>
		<td><c:out value="${row.fname_txt}" /></td>
	</tr>
	</c:forEach>
</table>
</body>
</html>