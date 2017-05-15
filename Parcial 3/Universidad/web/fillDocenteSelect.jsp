<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<sql:setDataSource
    driver="com.mysql.jdbc.Driver"
    url="jdbc:mysql://localhost:3306/universidad"
    user="root"
    password=""
    var="dataSource"
    />
<sql:query var="teacher" dataSource="${dataSource}">
    SELECT * FROM teacher WHERE schoolID = ?
    <sql:param value="${param.escuela}" />
</sql:query>
<c:forEach var="rs" items="${teacher.rows}">
    <option value='<c:out value="${rs.id}" />'><c:out value="${rs.name}" /></option>
</c:forEach>