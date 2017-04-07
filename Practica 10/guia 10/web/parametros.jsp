<%@include file="taglibs.jsp" %>
<!DOCTYPE html>
<html>
<head>
	<title>Ejemplo de listado de parametros</title>
</head>
<body>
<font size=4 face="verdana" color=#112244>
<b>Valores enviados a esta pagina para cada parametro listado: </b>
<table border="2">
	<c:forEach var="current" items="${param}">
	<tr>
		<td>
			<b><c:out value="${current.key}" /></b>
		</td>
		<c:forEach var="aVal" items="${paramValues[current.key]}">
		<td>
			<c:out value="${aVal}" />
		</td>
		</c:forEach>
	</tr>
	</c:forEach>
</table>
</font>
</body>
</html>