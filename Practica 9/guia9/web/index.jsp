<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Expresiones JSP</title>
    </head>
    <body>
        <font size="4" face="verdana" color="#112244">
        <h2>Expresiones JSP</h2>
        <ul>
            <li>Hora actual <%= new java.util.Date() %></li>
            <li>Servidor: <%= application.getServerInfo() %></li>
        </ul>
        </font>
    </body>
</html>
