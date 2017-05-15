<%-- 
    Document   : LenguajeFavorito
    Created on : Apr 27, 2017, 4:41:56 PM
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
        <h1>Pagina de prueba del uso de beans</h1>
        <form method="post" action="Bean2.jsp">
            Se envia el formulario al servicio cuyo fichero es beans.jsp
            <p>Por favor, ingrese su nombre: <input type="text" name="nombre">
            <br> ¿Cual es tu lenguaje de programacion favorito?
            <select name="lenguaje">
                <option value="JAVA">JAVA</option>
                <option value="C++">C++</option>
                <option value="C#">C#</option>
                <option value="PHP">PHP</option>
                <option value="Perl">Perl</option>
            </select>
            </p>
            <input type="submit" value="Enviar">
        </form>
    </body>
</html>
