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
              <a class="navbar-brand" href="#">Manejo de Empleados con JSTL</a>
            </div>
            <div id="navbar" class="navbar-collapse collapse">
                <ul class="nav navbar-nav navbar-right">
                    <li class="active"><a href="#">Agregar Empleado</a></li>
                    <li><a href="empleados.jsp">Ver Empleados</a></li>
                </ul>
            </div><!--/.navbar-collapse -->
          </div>
        </nav>
        <!-- Main jumbotron for a primary marketing message or call to action -->
        <div class="jumbotron">
          <form id="Formulario" class="container-fluid form-horizontal" action="#" method="POST">
            <fieldset>
                <!-- Form Name -->
                <legend>Agregar Empleados</legend>
                
                <div id="output">
                </div>

                <div class="form-group">
                    <label class="col-md-4 control-label" for="txtEmployeeNum">Numero de Empleado:</label>
                    <div class="col-md-5">
                        <div class="input-group input-group-lg">
                            <span class="input-group-addon"><i class="fa fa-key"></i></span>
                            <input id="txtEmployeeNum" name="txtEmployeeNum" class="form-control" placeholder="Digite el numero de empleado" type="text" required="">
                        </div>
                    </div>
                </div>

                <div class="form-group">
                    <label class="col-md-4 control-label" for="txtName">Nombre:</label>
                    <div class="col-md-5">
                        <div class="input-group input-group-lg">
                            <span class="input-group-addon"><i class="fa fa-user"></i></span>
                            <input id="txtName" name="txtName" class="form-control" placeholder="Digite su nombre" type="text" required>
                        </div>
                    </div>
                </div>

                <div class="form-group">
                    <label class="col-md-4 control-label" for="txtLastName">Apellido:</label>
                    <div class="col-md-5">
                        <div class="input-group input-group-lg">
                            <span class="input-group-addon"><i class="fa fa-user"></i></span>
                            <input id="txtLastName" name="txtLastName" class="form-control" placeholder="Digite su apellido" type="text" required>
                        </div>
                    </div>
                </div>

                <div class="form-group">
                    <label class="col-md-4 control-label" for="txtTelephone">Telefono:</label>
                    <div class="col-md-5">
                        <div class="input-group input-group-lg">
                            <span class="input-group-addon"><i class="fa fa-phone"></i></span>
                            <input id="txtTelephone" name="txtTelephone" class="form-control" placeholder="Digite su telefono" type="text" required>
                        </div>
                    </div>
                </div>

                <div class="form-group">
                    <label class="col-md-4 control-label" for="txtAddress1">Dirección 1:</label>
                    <div class="col-md-5">
                        <div class="input-group input-group-lg">
                            <span class="input-group-addon"><i class="fa fa-home"></i></span>
                            <input id="txtAddress1" name="txtAddress1" class="form-control" placeholder="Digite la dirección" type="text" required>
                        </div>
                    </div>
                </div>

                <div class="form-group">
                    <label class="col-md-4 control-label" for="txtAddress2">Direccion 2:</label>
                    <div class="col-md-5">
                        <div class="input-group input-group-lg">
                            <span class="input-group-addon"><i class="fa fa-home"></i></span>
                            <input id="txtAddress2" name="txtAddress2" class="form-control" placeholder="Digite la dirección" type="text">
                        </div>
                    </div>
                </div>

                <div class="form-group">
                    <label class="col-md-4 control-label" for="txtState">Estado:</label>
                    <div class="col-md-5">
                        <div class="input-group input-group-lg">
                            <span class="input-group-addon"><i class="fa fa-building-o"></i></span>
                            <input id="txtState" name="txtState" class="form-control" placeholder="Digite su estado" type="text" required>
                        </div>
                    </div>
                </div>

                <div class="form-group">
                    <label class="col-md-4 control-label" for="txtCity">Ciudad:</label>
                    <div class="col-md-5">
                        <div class="input-group input-group-lg">
                            <span class="input-group-addon"><i class="fa fa-building"></i></span>
                            <input id="txtCity" name="txtCity" class="form-control" placeholder="Digite su ciudad" type="text" required>
                        </div>
                    </div>
                </div>

                <div class="form-group">
                    <label class="col-md-4 control-label" for="txtZip">ZIP:</label>
                    <div class="col-md-5">
                        <div class="input-group input-group-lg">
                            <span class="input-group-addon"><i class="fa fa-inbox"></i></span>
                            <input id="txtZip" name="txtZip" class="form-control" placeholder="Digite el codigo ZIP" type="text" required>
                        </div>
                    </div>
                </div>

                <div class="form-group">
                    <label class="col-md-4 control-label" for="save"></label>
                    <div class="col-md-5">
                        <button type="submit" class="btn btn-success btn-lg btn-block outline" onsubmit="return false;">Guardar</button>
                        <br />
                        <button type="reset" class="btn btn-warning btn-lg btn-block outline">Limpiar</button>
                    </div>
                </div>
            </fieldset>
          </form>
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
