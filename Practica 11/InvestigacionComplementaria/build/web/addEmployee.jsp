<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<sql:setDataSource
	driver="com.mysql.jdbc.Driver"
	url="jdbc:mysql://localhost:3306/db_employees"
	user="root"
	password=""
	var="dataSource"
/>
<c:if test="${pageContext.request.method=='POST'}">
    <c:choose>
        <c:when test="${ empty param.txtEmployeeNum or empty param.txtName or empty param.txtLastName
          or empty param.txtAddress1 or empty param.txtCity or empty param.txtState or empty param.txtZip
          or empty param.txtTelephone}">
            <div class="alert alert-danger alert-dismissible col-md-offset-3 col-md-6" role="alert">
                <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <strong>Error!</strong> No debe dejar ningun campo vacio.
            </div>
        </c:when>
        <c:otherwise>
            <c:catch var="exception">
                <sql:update dataSource="${dataSource}" var="updatedTable">
                    INSERT INTO employees(employee_num, fname_txt, lname_txt, address1_txt, address2_txt, city, state, zip, phone) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)
                    <sql:param value="${param.txtEmployeeNum}" />
                    <sql:param value="${param.txtName}" />
                    <sql:param value="${param.txtLastName}" />
                    <sql:param value="${param.txtAddress1}" />
                    <sql:param value="${param.txtAddress2}" />
                    <sql:param value="${param.txtCity}" />
                    <sql:param value="${param.txtState}" />
                    <sql:param value="${param.txtZip}" />
                    <sql:param value="${param.txtTelephone}" />
                </sql:update>
                <c:if test="${updatedTable>=1}">
                    <div class="alert alert-success alert-dismissible col-md-offset-3 col-md-6" role="alert">
                        <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                        <strong>Exito!</strong> Empleado agregado satisfactoriamente.
                    </div>
                </c:if>
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