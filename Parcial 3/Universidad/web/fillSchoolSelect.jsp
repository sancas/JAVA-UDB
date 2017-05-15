<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<sql:setDataSource
    driver="com.mysql.jdbc.Driver"
    url="jdbc:mysql://localhost:3306/universidad"
    user="root"
    password=""
    var="dataSource"
    />
<sql:query var="school" dataSource="${dataSource}">
    SELECT * FROM school
</sql:query>
    <option value='0' required>Escuela...</option>
<c:forEach var="rs" items="${school.rows}">
    <option value='<c:out value="${rs.id}" />'><c:out value="${rs.name}" /></option>
</c:forEach>