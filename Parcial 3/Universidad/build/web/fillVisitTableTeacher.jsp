<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<sql:setDataSource
    driver="com.mysql.jdbc.Driver"
    url="jdbc:mysql://localhost:3306/universidad"
    user="root"
    password=""
    var="dataSource"
    />
<sql:query var="visit" dataSource="${dataSource}">
    SELECT institution, visitDate FROM visit WHERE teacherID = (SELECT id FROM teacher WHERE userID = (SELECT id FROM user WHERE username = ?)) ORDER BY visitDate ASC
    <sql:param value="${username}" />
</sql:query>
<c:forEach var="rs" items="${visit.rows}">
    <tr>
        <td><c:out value="${rs.institution}" /></td>
        <td><c:out value="${rs.visitDate}" /></td>
    </tr>
</c:forEach>