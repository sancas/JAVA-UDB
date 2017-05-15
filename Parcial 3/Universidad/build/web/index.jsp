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

        <link rel="stylesheet" href="css/bootstrap.min.css">
        <!-- Codigo CSS -->
        <style>
            body {
                padding-top: 50px;
                padding-bottom: 20px;
            }
        </style>
        <link rel="stylesheet" href="css/bootstrap-theme.min.css">
        <link rel="stylesheet" href="css/main.css">

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
                <h1>Bienvenido docente!</h1>
                <p>En esta pagina se podra enterar de las visitas futuras que tiene. Logeese por favor.</p>
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
