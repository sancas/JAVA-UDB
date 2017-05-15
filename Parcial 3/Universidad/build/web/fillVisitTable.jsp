<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<sql:setDataSource
    driver="com.mysql.jdbc.Driver"
    url="jdbc:mysql://localhost:3306/universidad"
    user="root"
    password=""
    var="dataSource"
    />
<sql:query var="visit" dataSource="${dataSource}">
    SELECT school.name as 'escuela', teacher.name as 'teacher', visit.institution, visit.visitDate FROM visit INNER JOIN teacher ON visit.teacherID = teacher.id INNER JOIN school ON teacher.schoolID = school.id ORDER BY escuela ASC
</sql:query>
<c:forEach var="rs" items="${visit.rows}">
    <tr>
        <td align="center">
            <a href='#' class="btn btn-default"><em class="fa fa-pencil"></em></a>
            <a href='#' class="btn btn-danger"><em class="fa fa-trash"></em></a>
        </td>
        <td><c:out value="${rs.escuela}" /></td>
        <td><c:out value="${rs.teacher}" /></td>
        <td><c:out value="${rs.institution}" /></td>
        <td><c:out value="${rs.visitDate}" /></td>
    </tr>
</c:forEach>