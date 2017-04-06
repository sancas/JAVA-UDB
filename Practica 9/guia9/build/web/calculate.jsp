<%@ page language="java" %>
<%@ page import="java.lang.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculadora</title>
    </head>
    <body>
        <font size="4" face="verdana" color="#112244">
        <%
            String str = request.getParameter("r1");
            String str1 = request.getParameter("t1");
            String str2 = request.getParameter("t2");
            String final_output="";
            int num1 = 0;
            int num2 = 0;
            int num3 = 0;
            num1 = Integer.parseInt(str1);
            num2 = Integer.parseInt(str2);
            if (str.equals("sum"))
            {
                num3 = num1 + num2;
                final_output = "Suma";
            }
            if (str.equals("resta"))
            {
                num3 = num1 - num2;
                final_output = "Resta";
            }
            if (str.equals("mul"))
            {
                num3 = num1 * num2;
                final_output = "Multiplicacion";
            }
            if (str.equals("div"))
            {
                num3 = num1 / num2;
                final_output = "Division";
            }
        %>
        La funci&oacute;n Matem&aacute;tica seleccionada es: <%=final_output%>
        <br>
        <%
            Integer in = new Integer(num3);
            out.println("El resultado es: " + in.toString());
        %>
    </body>
</html>
