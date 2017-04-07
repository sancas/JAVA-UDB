<%@include file="taglibs.jsp" %>
<font size=4 face="verdana" color=#112244>
<c:set var="variableDePagina" scope="page">
	Esta informacion se guarda en la pagina
</c:set>
<c:set var="variableDeSesion" scope="session">
	Esta informacion se guarda en la sesion
</c:set>
<c:set var="variableDeAplicacion" scope="application">
	Esta informacion se guarda en la aplicacion
</c:set>
<br>${variableDePagina}
<br>${variableDeSesion}
<br>${variableDeAplicacion}