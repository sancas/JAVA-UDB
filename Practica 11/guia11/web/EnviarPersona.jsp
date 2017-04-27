<%-- 
    Document   : EnviarPersona
    Created on : Apr 27, 2017, 4:49:02 PM
    Author     : sanch
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form name="persona" action="Persona.jsp" method="POST">
            Ingrese su nombre: <input type="text" name="nombre" value="" /><br />
            Ingrese su edad: <input type="text" name="edad" value="" /><br />
            <input type="submit" value="Enviar" />
        </form>
    </body>
</html>
