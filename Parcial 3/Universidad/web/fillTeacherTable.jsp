<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<sql:setDataSource
    driver="com.mysql.jdbc.Driver"
    url="jdbc:mysql://localhost:3306/universidad"
    user="root"
    password=""
    var="dataSource"
    />
<sql:query var="teachers" dataSource="${dataSource}">
    SELECT teacher.id, teacher.name, teacher.lastname, teacher.email, school.name as 'escuela' FROM teacher INNER JOIN school ON school.id = teacher.schoolID ORDER BY id ASC
</sql:query>
<c:forEach var="rs" items="${teachers.rows}">
    <tr>
        <td align="center">
            <a href='#' class="btn btn-default"><em class="fa fa-pencil"></em></a>
            <a href='#' class="btn btn-danger"><em class="fa fa-trash"></em></a>
        </td>
        <td class="hidden-xs"><c:out value="${rs.id}" /></td>
        <td><c:out value="${rs.name}" /></td>
        <td><c:out value="${rs.lastname}" /></td>
        <td><c:out value="${rs.email}" /></td>
        <td><c:out value="${rs.escuela}" /></td>
    </tr>
</c:forEach>