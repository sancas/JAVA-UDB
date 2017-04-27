<%-- 
    Document   : Bean1
    Created on : Apr 27, 2017, 4:18:41 PM
    Author     : sanch
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String nom_cli = "John";
    String ape_cli = "Chambers";
    String dir_cli = "Cisco";
%>
<jsp:useBean id="cli_bean" class="guia11.ClienteBean" />
<jsp:setProperty name="cli_bean" property="nomb_cli" value="<%=nom_cli%>" />
<jsp:setProperty name="cli_bean" property="ape_cli" value="<%=ape_cli%>" />
<jsp:setProperty name="cli_bean" property="dir_cli" value="<%=dir_cli%>" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            out.println("<h3>Nombre: " + cli_bean.getNomb_cli() + "<br>");
            out.println("<h3>Apellido: " + cli_bean.getApe_cli() + "<br>");
            out.println("<h3>Direccion: " + cli_bean.getDir_cli() + "<br>");
        %>
    </body>
</html>
