<%@page import="java.sql.*" %>
<!doctype html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7" lang=""> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8" lang=""> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9" lang=""> <![endif]-->
<!--[if gt IE 8]><!--> <html class="no-js" lang=""> <!--<![endif]-->
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <title></title>
        <meta name="description" content="">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="apple-touch-icon" href="apple-touch-icon.png">

        <link rel="stylesheet" href="css/bootstrap.min.css">
        <style>
            body {
                padding-top: 50px;
                padding-bottom: 20px;
            }
        </style>
        <link rel="stylesheet" href="css/bootstrap-theme.min.css">
        <link rel="stylesheet" href="css/main.css">
        <link rel="stylesheet" href="https://formden.com/static/cdn/font-awesome/4.4.0/css/font-awesome.min.css" />

        <script src="js/vendor/modernizr-2.8.3-respond-1.4.2.min.js"></script>
    </head>
    <body>
        <!--[if lt IE 8]>
            <p class="browserupgrade">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
        <![endif]-->
        <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
          <div class="container">
            <div class="navbar-header">
              <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
              </button>
              <a class="navbar-brand" href="#">Manejo de Empleados</a>
            </div>
            <div id="navbar" class="navbar-collapse collapse">
                <ul class="nav navbar-nav navbar-right">
                    <li><a href="index.jsp">Agregar Empleado</a></li>
                    <li class="active"><a href="#">Ver Empleados</a></li>
                </ul>
            </div><!--/.navbar-collapse -->
          </div>
        </nav>
        <!-- Main jumbotron for a primary marketing message or call to action -->
        <div class="jumbotron">
            <div class="container-fluid">
                <fieldset>
                    <!-- Page Name -->
                    <legend>Empleados</legend>
                    
                    <div class="table-responsive">
                        <table class="table table-striped">
                            <thead>
                                <tr>
                                    <th>#</th>
                                    <th>Nombre</th>
                                    <th>Apellido</th>
                                    <th>Telefono</th>
                                    <th>Direccion 1</th>
                                    <th>Direccion 2</th>
                                    <th>Estado</th>
                                    <th>Ciudad</th>
                                    <th>ZIP</th>
                                </tr>
                            </thead>
                            <tbody>
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
                                    <td><%=rs.getString("employee_num")%></td>
                                    <td><%=rs.getString("fname_txt")%></td>
                                    <td><%=rs.getString("lname_txt")%></td>
                                    <td><%=rs.getString("phone")%></td>
                                    <td><%=rs.getString("address1_txt")%></td>
                                    <td><%=rs.getString("address2_txt")%></td>
                                    <td><%=rs.getString("state")%></td>
                                    <td><%=rs.getString("city")%></td>
                                    <td><%=rs.getString("zip")%></td>
                                </tr>
                                <%
                                    }
                                %>
                            </tbody>
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
                    </div>
                </fieldset>
            </div>
        </div>

        <div class="container">
          <footer>
            <p>&copy; Cristian Sanchez - 2017</p>
          </footer>
        </div> <!-- /container -->        
        <script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
        <script>window.jQuery || document.write('<script src="js/vendor/jquery-1.11.2.min.js"><\/script>')</script>

        <script src="js/vendor/bootstrap.min.js"></script>

        <script src="js/main.js"></script>
    </body>
</html>
