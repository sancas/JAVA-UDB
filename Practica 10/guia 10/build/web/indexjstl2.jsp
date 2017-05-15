<%-- 
    Document   : indexjstl2
    Created on : 04-06-2017, 06:32:53 PM
    Author     : Usuario
--%>
<%@include file="taglibs.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <br> <c:out value="1+2+3" />
        <br> <c:out value="${1+2+3}" />
    </body>
</html>
