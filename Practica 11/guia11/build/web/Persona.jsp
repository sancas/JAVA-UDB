<%-- 
    Document   : Persona
    Created on : Apr 27, 2017, 4:52:22 PM
    Author     : sanch
--%>
<jsp:useBean id="cientifico" scope="request" class="guia11.PersonaBean">
<jsp:setProperty name="cientifico" property="*" />
</jsp:useBean>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP:useBean</title>
    </head>
    <body>
        <h1>Uso jsp:useBean coordinado con parametros de la peticion</h1>
        <p>El cientifico es <jsp:getProperty name="cientifico" property="nombre" />. 
            Su edad es <jsp:getProperty name="cientifico" property="edad" />.</p>
        <p>A continuacion usamos getProperty, sin que haya una propiedad de clase Bean para soportar los metodos getTipo() y getEsJoven():</p>
        <ul>
            <li>Tipo:
                <jsp:getProperty name="cientifico" property="tipo"/>
            </li>
            <li>
                <jsp:getProperty name="cientifico" property="joven" />
            </li>
        </ul>
    </body>
</html>
