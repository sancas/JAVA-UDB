<%@include file="taglibs.jsp" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Conten-Type" content="text/html"; charset="UTF-8">
	<title>JSP Page</title>
</head>
<body>
<font size=4 face="verdana" color=#112244>
<h1>Empleado Ingresado!</h1>
<br> Nombre: <c:out value="${param.nombre}" />
<br> Apellido1: <c:out value="${param.apellido1}" />
<br> Apellido2: <c:out value="${param.apellido2}" />
</body>
</html>