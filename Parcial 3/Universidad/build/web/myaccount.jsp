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
        <link rel="stylesheet" href="css/bootstrap-theme.min.css">
        <link rel="stylesheet" href="css/main.css">
        <style>
            #leftPanel{
                background-color:#0079ac;
                color:#fff;
                text-align: center;
            }

            #rightPanel{
                min-height:415px;
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

        <script src="js/vendor/modernizr-2.8.3-respond-1.4.2.min.js"></script>
    </head>
    <c:if test="${username == null}"><c:redirect url="index.jsp?error=La pagina que busca no existe"></c:redirect></c:if>
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

        <!-- Main jumbotron for a primary marketing message or call to action -->
        <div class="container">
            <br />
            <br />
            <br />
            <div id="editProfileMsg">
                </div>
            <div class="row" id="main">
                <div class="col-md-4 well" id="leftPanel" style="background-color: #0079ac;">
                    <div class="row">
                        <div class="col-md-12">
                            <div>
                                <img src="http://lorempixel.com/200/200/abstract/1/" alt="Texto Alternativo" class="img-circle img-thumbnail">
                                <h2><c:out value="${username}" /></h2>
                                <p>¡Bienvenido profesor! <c:if test="${isDirector}">Usted es director de escuela</c:if></p>
                                <div class="btn-group">
                                    <button type="button" class="btn btn-warning">
                                        Social</button>
                                    <button type="button" class="btn btn-warning dropdown-toggle" data-toggle="dropdown">
                                        <span class="caret"></span><span class="sr-only">Social</span>
                                    </button>
                                    <ul class="dropdown-menu" role="menu">
                                        <li><a href="#">Twitter</a></li>
                                        <li><a href="#">Google +</a></li>
                                        <li><a href="#">Facebook</a></li>
                                        <li class="divider"></li>
                                        <li><a href="#">Github</a></li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-md-8 well" id="rightPanel">
                    <div class="row">
                        <div class="col-md-12">
                            <form id="editProfileForm" role="form">
                                <h2>Edita tu perfil.<small>Nunca fue tan facil</small></h2>
                                <hr class="colorgraph">
                                <div class="row">
                                    <div class="col-xs-12 col-sm-6 col-md-6">
                                        <div class="form-group">
                                            <input type="text" name="first_name" id="first_name" class="form-control input-lg" placeholder="First Name" tabindex="1">
                                        </div>
                                    </div>
                                    <div class="col-xs-12 col-sm-6 col-md-6">
                                        <div class="form-group">
                                            <input type="text" name="last_name" id="last_name" class="form-control input-lg" placeholder="Last Name" tabindex="2">
                                        </div>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <input type="email" name="email" id="email" class="form-control input-lg" placeholder="Email Address" tabindex="4">
                                </div>
                                <div class="row">
                                    <div class="col-xs-12 col-sm-6 col-md-6">
                                        <div class="form-group">
                                            <input type="username" name="username" id="username" class="form-control input-lg" placeholder="Username" tabindex="5" value="<c:out value='${username}' />" required readonly>
                                        </div>
                                    </div>
                                    <div class="col-xs-12 col-sm-6 col-md-6">
                                        <div class="form-group">
                                            <input type="password" name="password" id="password_confirmation" class="form-control input-lg" placeholder="Password" tabindex="6">
                                        </div>
                                    </div>
                                </div>
                                <hr class="colorgraph">
                                <div class="row">
                                    <div class="col-xs-12 col-md-6"></div>
                                    <div class="col-xs-12 col-md-6"><button type="submit" class="btn btn-success btn-block btn-lg">Guardar</button></div>
                                </div>
                            </form>
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
