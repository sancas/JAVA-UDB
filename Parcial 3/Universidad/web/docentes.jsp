<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
        <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.4.0/css/font-awesome.min.css" rel='stylesheet' type='text/css'>
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <!-- Codigo CSS -->
        <style>
            body {
                padding-top: 50px;
                padding-bottom: 20px;
            }

            .panel-table .panel-body{
                padding:0;
            }

            .panel-table .panel-body .table-bordered{
                border-style: none;
                margin:0;
            }

            .panel-table .panel-body .table-bordered > thead > tr > th:first-of-type {
                text-align:center;
                width: 100px;
            }

            .panel-table .panel-body .table-bordered > thead > tr > th:last-of-type,
            .panel-table .panel-body .table-bordered > tbody > tr > td:last-of-type {
                border-right: 0px;
            }

            .panel-table .panel-body .table-bordered > thead > tr > th:first-of-type,
            .panel-table .panel-body .table-bordered > tbody > tr > td:first-of-type {
                border-left: 0px;
            }

            .panel-table .panel-body .table-bordered > tbody > tr:first-of-type > td{
                border-bottom: 0px;
            }

            .panel-table .panel-body .table-bordered > thead > tr:first-of-type > th{
                border-top: 0px;
            }

            .panel-table .panel-footer .pagination{
                margin:0; 
            }

            /*
            used to vertically center elements, may need modification if you're not using default sizes.
            */
            .panel-table .panel-footer .col{
                line-height: 34px;
                height: 34px;
            }

            .panel-table .panel-heading .col h3{
                line-height: 30px;
                height: 30px;
            }

            .panel-table .panel-body .table-bordered > tbody > tr > td{
                line-height: 34px;
            }

            /* Credit to bootsnipp.com for the css for the color graph */
            .colorgraph {
                height: 5px;
                border-top: 0;
                background: #c4e17f;
                border-radius: 5px;
                background-image: -webkit-linear-gradient(left, #c4e17f, #c4e17f 12.5%, #f7fdca 12.5%, #f7fdca 25%, #fecf71 25%, #fecf71 37.5%, #f0776c 37.5%, #f0776c 50%, #db9dbe 50%, #db9dbe 62.5%, #c49cde 62.5%, #c49cde 75%, #669ae1 75%, #669ae1 87.5%, #62c2e4 87.5%, #62c2e4);
                background-image: -moz-linear-gradient(left, #c4e17f, #c4e17f 12.5%, #f7fdca 12.5%, #f7fdca 25%, #fecf71 25%, #fecf71 37.5%, #f0776c 37.5%, #f0776c 50%, #db9dbe 50%, #db9dbe 62.5%, #c49cde 62.5%, #c49cde 75%, #669ae1 75%, #669ae1 87.5%, #62c2e4 87.5%, #62c2e4);
                background-image: -o-linear-gradient(left, #c4e17f, #c4e17f 12.5%, #f7fdca 12.5%, #f7fdca 25%, #fecf71 25%, #fecf71 37.5%, #f0776c 37.5%, #f0776c 50%, #db9dbe 50%, #db9dbe 62.5%, #c49cde 62.5%, #c49cde 75%, #669ae1 75%, #669ae1 87.5%, #62c2e4 87.5%, #62c2e4);
                background-image: linear-gradient(to right, #c4e17f, #c4e17f 12.5%, #f7fdca 12.5%, #f7fdca 25%, #fecf71 25%, #fecf71 37.5%, #f0776c 37.5%, #f0776c 50%, #db9dbe 50%, #db9dbe 62.5%, #c49cde 62.5%, #c49cde 75%, #669ae1 75%, #669ae1 87.5%, #62c2e4 87.5%, #62c2e4);
            }
        </style>
        <link rel="stylesheet" href="css/bootstrap-theme.min.css">
        <link rel="stylesheet" href="css/main.css">

        <script src="js/vendor/modernizr-2.8.3-respond-1.4.2.min.js"></script>
    </head>
    <c:if test="${username == null || isDirector == false}"><c:redirect url="index.jsp?error=La pagina que busca no existe"></c:redirect></c:if>
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
                            <a class="navbar-brand" href="#">Visita universitaria</a>
                        </div>
                        <div id="navbar" class="navbar-collapse collapse">
                            <ul id="navbar-nav" class="nav navbar-nav" <c:if test="${username==null}">hidden</c:if>>
                            <li><a href="visitas.jsp">Ver visitas</a></li>
                            <li><a <c:if test="${isDirector == false || isDirector == null}">style="display: none;"</c:if> id="only-directors" href="docentes.jsp">Docentes</a></li>
                        </ul>
                        <form id="loginForm" class="navbar-form navbar-right" role="form" <c:if test="${username!=null}">hidden</c:if>>
                            <div class="form-group">
                                <input name="username" type="text" placeholder="Username" class="form-control" value="">
                            </div>
                            <div class="form-group">
                                <input name="password" type="password" placeholder="Password" class="form-control">
                            </div>
                            <button type="submit" class="btn btn-success">Sign in</button>
                        </form>
                        <ul id="navbar-right" class="nav navbar-nav navbar-right" <c:if test="${username==null}">hidden</c:if>>
                            <li class="dropdown">
                                <a id="only-users-username" href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false"><span class="caret"></span></a>
                                <ul class="dropdown-menu">
                                    <li><a href="myaccount.jsp">Mi cuenta</a></li>
                                    <li role="separator" class="divider"></li>
                                    <li><a href="#" onclick="logout();">Log out</a></li>
                                </ul>
                            </li>
                        </ul>
                        <div id="loginMsg"></div>
                    </div><!--/.navbar-collapse -->
                </div>
            </nav>
        <c:if test="${param.error != null}">
            <div class="alert alert-danger alert-dismissible col-md-offset-3 col-md-6" role="alert">
                <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <strong>Error!</strong> <c:out value="${param.error}"/>
            </div>  
        </c:if>

        <!-- Main jumbotron for a primary marketing message or call to action -->
        <div class="jumbotron">
            <div class="container">
                <div class="row">
                    <h1>Docentes</h1>
                    <p>Aqui podra administrar a todos sus docentes.</p>
                    
                    <div id="teacherOptionMsg"></div>

                    <div class="col-md-10 col-md-offset-1">

                        <div class="panel panel-default panel-table">
                            <div class="panel-heading">
                                <div class="row">
                                    <div class="col col-xs-6">
                                        <h3 class="panel-title">Docentes</h3>
                                    </div>
                                    <div class="col col-xs-6 text-right">
                                        <button type="button" class="btn btn-sm btn-primary btn-create" data-toggle="modal" data-target="#AddTeacher">Agregar Docente</button>
                                    </div>
                                    <!-- Modal -->
                                    <div class="modal fade" id="AddTeacher" tabindex="-1" role="dialog" aria-labelledby="AddTeacher" aria-hidden="true">
                                        <div class="modal-dialog modal-lg" role="document">
                                            <div class="modal-content">
                                                <form id='addTeacher' role='form'>
                                                    <div class="modal-header">
                                                        <h5 class="modal-title" id="exampleModalLabel">Agregar Docente</h5>
                                                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                                            <span aria-hidden="true">&times;</span>
                                                        </button>
                                                    </div>
                                                    <div class="modal-body">
                                                        <div class="row">
                                                            <div class="col-xs-12 col-sm-8 col-md-6 col-sm-offset-2 col-md-offset-3">
                                                                <h2>Agregar Docente</h2>
                                                                <hr class="colorgraph">
                                                                <div class="row">
                                                                    <div class="col-xs-12 col-sm-6 col-md-6">
                                                                        <div class="form-group">
                                                                            <input type="text" name="firstname" id="firstname" class="form-control input-lg" placeholder="Nombre" tabindex="1" required>
                                                                        </div>
                                                                    </div>
                                                                    <div class="col-xs-12 col-sm-6 col-md-6">
                                                                        <div class="form-group">
                                                                            <input type="text" name="lastname" id="lastname" class="form-control input-lg" placeholder="Apellido" tabindex="2" required>
                                                                        </div>
                                                                    </div>
                                                                </div>
                                                                <div class="form-group">
                                                                    <select name='escuela' id="escuela" class="form-control input-lg" placeholder="Seleccione una escuela" tabindex="3" required>
                                                                        <%@include file="fillSchoolSelect.jsp" %>
                                                                    </select>
                                                                </div>
                                                                <div class="form-group">
                                                                    <input type="email" name="email" id="email" class="form-control input-lg" placeholder="Email Address" tabindex="4" required>
                                                                </div>
                                                                <hr class="colorgraph">
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <div class="modal-footer">
                                                        <button type="button" id='cerrarInsertarTeacher' class="btn btn-secondary" data-dismiss="modal">Cerrar</button>
                                                        <button type="submit" class="btn btn-primary">Aceptar</button>
                                                    </div>
                                                </form>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="panel-body">
                                <table class="table table-striped table-bordered table-list">
                                    <thead>
                                        <tr>
                                            <th><em class="fa fa-cog"></em></th>
                                            <th class="hidden-xs">ID</th>       
                                            <th>Nombre</th>
                                            <th>Apellido</th>
                                            <th>Email</th>
                                            <th>Escuela</th>
                                        </tr> 
                                    </thead>
                                    <tbody>
                                        <%@include file="fillTeacherTable.jsp" %>
                                    </tbody>
                                </table>

                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <div class="container">
            <hr>

            <footer>
                <p>&copy; Visita Universitaria 2017</p>
            </footer>
        </div> <!-- /container -->
        <script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
        <script>window.jQuery || document.write('<script src="js/vendor/jquery-1.11.2.min.js"><\/script>')</script>

        <script src="js/vendor/bootstrap.min.js"></script>
        <script src="js/main.js"></script>
        <c:if test="${username!=null}">
            <script>
                                        var logged = true;
                                        var isDirector = <c:out value="${isDirector}"></c:out>;
                                        var username = '<c:out value="${username}"></c:out>';
                                        $(document).ready(function () {
                                            habilitarControlesUsuarios();
                                        });
                </script>
        </c:if>
    </body>
</html>
