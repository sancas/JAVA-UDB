<%@include file="taglibs.jsp" %>
<font size=4 face="verdana" color=#112244>
<c:catch var="error01">
	<%=Integer.parseInt(request.getParameter("parametro")) %>
</c:catch>
<c:if test="${not empty error01}">
	Se produjo un error: ${error01}
</c:if>
<br />
<form>
	<input type="hidden" name="parametro" value="prueba" />
	<input type="submit" value="Enviar 'prueba'" />
</form>
<form>
	<input type="hidden" name="parametro" value="1234" />
	<input type="submit" value="Enviar '1234'" />
</form>
<form>
	<input type="submit" value="No enviar parametro" />
</form>