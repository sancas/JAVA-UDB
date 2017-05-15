<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:if test="${pageContext.request.method=='POST'}">
    <c:remove var="username" scope="session"></c:remove>
    <c:remove var="isDirector" scope="session"></c:remove>
</c:if>