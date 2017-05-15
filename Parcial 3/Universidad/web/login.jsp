<%@page import="com.university.encryption.EncriptadorPassword"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<% EncriptadorPassword encryp = new EncriptadorPassword("J@va3ncr1p73r"); %>
<c:if test="${pageContext.request.method=='POST'}">
    <c:choose>
        <c:when test="${ empty param.username or empty param.password }">
            <div class="alert alert-danger alert-dismissible col-md-offset-3 col-md-6" role="alert">
                <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <strong>Error!</strong> No debe dejar ningun campo vacio.
            </div>
        </c:when>
        <c:otherwise>
            <c:catch var="exception">
                <sql:setDataSource
                    driver="com.mysql.jdbc.Driver"
                    url="jdbc:mysql://localhost:3306/universidad"
                    user="root"
                    password=""
                    var="dataSource"
                    />
                <sql:query dataSource="${dataSource}" var="selectQ">
                    <c:set var="password2" value="${param.password}" />
                    select count(*) as kount from user
                    where username='${param.username}'
                    and password='<%=encryp.encrypt((String)pageContext.getAttribute("password2"))%>'
                </sql:query>
                <c:forEach items="${selectQ.rows}" var="r">
                    <c:choose>
                        <c:when test="${r.kount gt 0}">
                            <c:set scope="session"
                                   var="username"
                                   value="${param.username}"/>
                            <sql:query dataSource="${dataSource}" var="selectDirector">
                                select isDirector from teacher
                                where userID = (select id from user where username = '${param.username}')
                            </sql:query>
                            <c:forEach items="${selectDirector.rows}" var="d">
                                <script>
                                    var logged = true;
                                    var isDirector = <c:out value="${d.isDirector}"></c:out>;
                                    var username = '<c:out value="${param.username}"></c:out>';
                                </script>
                                <c:set scope="session"
                                       var="isDirector"
                                       value="${d.isDirector}"/>
                            </c:forEach>
                            <div class="alert alert-success alert-dismissible col-md-offset-3 col-md-6" role="alert">
                                <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                                <strong>Exito!</strong> Logeado satisfactoriamente.
                            </div>
                        </c:when>
                        <c:otherwise>
                            <div class="alert alert-danger alert-dismissible col-md-offset-3 col-md-6" role="alert">
                                <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                                <strong>Error!</strong> Username/Password no coinciden.
                            </div>
                        </c:otherwise>
                    </c:choose>
                </c:forEach>
            </c:catch>
            <c:if test="${exception!=null}">
                <div class="alert alert-danger alert-dismissible fade in col-md-offset-3 col-md-6" role="alert"> 
                    <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">×</span></button>
                    <h4>Ocurrio una excepción!</h4>
                    <p>Vuelva a intentarlo o bien reporte el error al administrador del sistema</p>
                    <p> <button type="button" class="btn btn-danger" data-toggle="modal" data-target="#Excepcion">Excepci&oacute;n</button> </p>
                </div>
                <div class="modal fade bs-example-modal-lg" id="Excepcion" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel">
                    <div class="modal-dialog modal-lg" role="document">
                        <div class="modal-content">
                            <div class="modal-header">
                                <button type="button" class="close" data-dismiss="modal">&times;</button>
                                <h4 class="modal-title">Excepci&oacute;n generada</h4>
                            </div>
                            <div class="modal-body">
                                <p><c:out value="${exception}"/></p>
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-default" data-dismiss="modal">Cerrar</button>
                            </div>
                        </div>
                    </div>
                </div>
            </c:if>
        </c:otherwise>
    </c:choose>
</c:if>