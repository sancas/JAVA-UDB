<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    if (request.getParameter("txtEmployeeNum") != null && !request.getParameter("txtEmployeeNum").equals(""))
    {
        try
            {
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_employees", "root", "");
                String str = "INSERT INTO employees(employee_num, fname_txt, lname_txt, address1_txt, address2_txt, city, state, zip, phone) "
                        + "VALUES (" + request.getParameter("txtEmployeeNum") +" , '"
                        + request.getParameter("txtName") + "', '" + request.getParameter("txtLastName") + "', '"
                        + request.getParameter("txtAddress1") + "', '" + request.getParameter("txtAddress2") + "', '"
                        + request.getParameter("txtCity") + "', '" + request.getParameter("txtState") + "', '"
                        + request.getParameter("txtZip") + "', '" + request.getParameter("txtTelephone") + "')";
                PreparedStatement preparedStmt = con.prepareStatement(str);
                preparedStmt.execute();
                con.close();
                %>
                <div class="alert alert-success alert-dismissible col-md-offset-3 col-md-6" role="alert">
                    <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <strong>Exito!</strong> Empleado agregado satisfactoriamente.
                </div>
                <%
            } catch (Exception ex)
            {
%>
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
                            <p><% out.print(ex.toString());%></p>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-default" data-dismiss="modal">Cerrar</button>
                        </div>
                    </div>
                  </div>
                </div>
<%
            }
    }
    else
    {
%>
<div class="alert alert-danger alert-dismissible col-md-offset-3 col-md-6" role="alert">
    <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>
    <strong>Error!</strong> El Numero de empleado no puede estar vacio.
</div>
<% } %>