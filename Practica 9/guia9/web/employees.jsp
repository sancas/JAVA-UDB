<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista Empleados</title>
    </head>
    <body>
        <font size="4" face="verdana" color="#112244">
        <%@ page import="java.sql.*" %>
        <table border="1">
            <tr>
                <th>Last Name</th>
                <th>First Name</th>
            </tr>
            <%
                Connection conn = null;
                Statement st = null;
                ResultSet rs = null;
                String strConn = "jdbc:mysql://localhost:3306/db_employees";
                try {
                    Class.forName("com.mysql.jdbc.Driver").newInstance();
                    conn = DriverManager.getConnection(strConn, "root", "");
                    st = conn.createStatement();
                    rs = st.executeQuery("select * from employees");
                    while (rs.next()) {
            %>
            <tr>
                <td><%=rs.getString("lname_txt")%></td>
                <td><%=rs.getString("fname_txt")%></td>
            </tr>
            <%
                }
            %>
        </table>
            <%
                } catch (Exception ex) {
                    out.print(ex.toString());
                } finally {
                    if (rs != null) rs.close();
                    if (st != null) st.close();
                    if (conn != null) conn.close();
                }
            %>
    </body>
</html>
