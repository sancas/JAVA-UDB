<%@page import="com.university.encryption.EncriptadorPassword"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<% EncriptadorPassword encryp = new EncriptadorPassword("J@va3ncr1p73r");%>
<c:choose>
    <c:when test="${pageContext.request.method=='POST'}">
        <c:choose>
            <c:when test="${ empty param.institution or empty param.date or empty param.docente }">
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
                    <c:set var="password2" value="${param.firstname}.${param.lastname}" />
                    <sql:update dataSource="${dataSource}" var="insertVisit">
                        INSERT visit (institution, visitDate, teacherID) VALUES (?, ?, ?)
                        <fmt:parseDate value="${param.date}" pattern="yyyy-MM-dd" 
                          var="parsedDate" type="date" />
                        <sql:param value="${param.institution}" />
                        <sql:dateParam type="date" value="${parsedDate}" />
                        <sql:param value="${param.docente}" />
                    </sql:update>
                    <c:choose>
                        <c:when test="${insertVisit>=1}">
                            <div class="alert alert-success alert-dismissible col-md-offset-3 col-md-6" role="alert">
                                <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                                <strong>Exito!</strong> Ingresado correctamente.
                            </div>
                        </c:when>
                        <c:otherwise>
                            <div class="alert alert-danger alert-dismissible col-md-offset-3 col-md-6" role="alert">
                                <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                                <strong>Error!</strong> No se pudo iingresar los datos
                            </div>
                        </c:otherwise>
                    </c:choose>
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
    </c:when>
    <c:otherwise>
        <c:redirect url="index.jsp?error=La pagina que busca no existe"></c:redirect>
    </c:otherwise>
</c:choose>