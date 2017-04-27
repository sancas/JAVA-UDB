<%-- 
    Document   : BeanSencillo
    Created on : Apr 27, 2017, 4:15:25 PM
    Author     : sanch
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Accion jsp:Bean</title>
    </head>
    <body>
        <jsp:useBean id="fecha" scope="page" class="java.util.Date" />
        <%=fecha%>
    </body>
</html>
