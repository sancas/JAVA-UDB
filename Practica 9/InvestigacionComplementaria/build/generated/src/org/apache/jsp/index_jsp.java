package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!doctype html>\n");
      out.write("<!--[if lt IE 7]>      <html class=\"no-js lt-ie9 lt-ie8 lt-ie7\" lang=\"\"> <![endif]-->\n");
      out.write("<!--[if IE 7]>         <html class=\"no-js lt-ie9 lt-ie8\" lang=\"\"> <![endif]-->\n");
      out.write("<!--[if IE 8]>         <html class=\"no-js lt-ie9\" lang=\"\"> <![endif]-->\n");
      out.write("<!--[if gt IE 8]><!--> <html class=\"no-js\" lang=\"\"> <!--<![endif]-->\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\n");
      out.write("        <title></title>\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"apple-touch-icon\" href=\"apple-touch-icon.png\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("        <style>\n");
      out.write("            body {\n");
      out.write("                padding-top: 50px;\n");
      out.write("                padding-bottom: 20px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap-theme.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/main.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://formden.com/static/cdn/font-awesome/4.4.0/css/font-awesome.min.css\" />\n");
      out.write("\n");
      out.write("        <script src=\"js/vendor/modernizr-2.8.3-respond-1.4.2.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!--[if lt IE 8]>\n");
      out.write("            <p class=\"browserupgrade\">You are using an <strong>outdated</strong> browser. Please <a href=\"http://browsehappy.com/\">upgrade your browser</a> to improve your experience.</p>\n");
      out.write("        <![endif]-->\n");
      out.write("        <nav class=\"navbar navbar-inverse navbar-fixed-top\" role=\"navigation\">\n");
      out.write("          <div class=\"container\">\n");
      out.write("            <div class=\"navbar-header\">\n");
      out.write("              <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\" aria-controls=\"navbar\">\n");
      out.write("                <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("              </button>\n");
      out.write("              <a class=\"navbar-brand\" href=\"#\">Manejo de Empleados</a>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"navbar\" class=\"navbar-collapse collapse\">\n");
      out.write("                <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                    <li class=\"active\"><a href=\"#\">Agregar Empleado</a></li>\n");
      out.write("                    <li><a href=\"empleados.jsp\">Ver Empleados</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div><!--/.navbar-collapse -->\n");
      out.write("          </div>\n");
      out.write("        </nav>\n");
      out.write("        <!-- Main jumbotron for a primary marketing message or call to action -->\n");
      out.write("        <div class=\"jumbotron\">\n");
      out.write("          <form class=\"container-fluid form-horizontal\" action=\"#\" method=\"POST\">\n");
      out.write("            <fieldset>\n");
      out.write("                <!-- Form Name -->\n");
      out.write("                <legend>Agregar Empleados</legend>\n");
      out.write("                \n");
      out.write("                <div id=\"output\">\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label class=\"col-md-4 control-label\" for=\"txtEmployeeNum\">Numero de Empleado:</label>\n");
      out.write("                    <div class=\"col-md-5\">\n");
      out.write("                        <div class=\"input-group input-group-lg\">\n");
      out.write("                            <span class=\"input-group-addon\"><i class=\"fa fa-key\"></i></span>\n");
      out.write("                            <input id=\"txtEmployeeNum\" name=\"txtEmployeeNum\" class=\"form-control\" placeholder=\"Digite el numero de empleado\" type=\"text\" required=\"\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label class=\"col-md-4 control-label\" for=\"txtName\">Nombre:</label>\n");
      out.write("                    <div class=\"col-md-5\">\n");
      out.write("                        <div class=\"input-group input-group-lg\">\n");
      out.write("                            <span class=\"input-group-addon\"><i class=\"fa fa-user\"></i></span>\n");
      out.write("                            <input id=\"txtName\" name=\"txtName\" class=\"form-control\" placeholder=\"Digite su nombre\" type=\"text\" required>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label class=\"col-md-4 control-label\" for=\"txtLastName\">Apellido:</label>\n");
      out.write("                    <div class=\"col-md-5\">\n");
      out.write("                        <div class=\"input-group input-group-lg\">\n");
      out.write("                            <span class=\"input-group-addon\"><i class=\"fa fa-user\"></i></span>\n");
      out.write("                            <input id=\"txtLastName\" name=\"txtLastName\" class=\"form-control\" placeholder=\"Digite su apellido\" type=\"text\" required>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label class=\"col-md-4 control-label\" for=\"txtTelephone\">Telefono:</label>\n");
      out.write("                    <div class=\"col-md-5\">\n");
      out.write("                        <div class=\"input-group input-group-lg\">\n");
      out.write("                            <span class=\"input-group-addon\"><i class=\"fa fa-phone\"></i></span>\n");
      out.write("                            <input id=\"txtTelephone\" name=\"txtTelephone\" class=\"form-control\" placeholder=\"Digite su telefono\" type=\"text\" required>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label class=\"col-md-4 control-label\" for=\"txtAddress1\">Dirección 1:</label>\n");
      out.write("                    <div class=\"col-md-5\">\n");
      out.write("                        <div class=\"input-group input-group-lg\">\n");
      out.write("                            <span class=\"input-group-addon\"><i class=\"fa fa-home\"></i></span>\n");
      out.write("                            <input id=\"txtAddress1\" name=\"txtAddress1\" class=\"form-control\" placeholder=\"Digite la dirección\" type=\"text\" required>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label class=\"col-md-4 control-label\" for=\"txtAddress2\">Direccion 2:</label>\n");
      out.write("                    <div class=\"col-md-5\">\n");
      out.write("                        <div class=\"input-group input-group-lg\">\n");
      out.write("                            <span class=\"input-group-addon\"><i class=\"fa fa-home\"></i></span>\n");
      out.write("                            <input id=\"txtAddress2\" name=\"txtAddress2\" class=\"form-control\" placeholder=\"Digite la dirección\" type=\"text\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label class=\"col-md-4 control-label\" for=\"txtState\">Estado:</label>\n");
      out.write("                    <div class=\"col-md-5\">\n");
      out.write("                        <div class=\"input-group input-group-lg\">\n");
      out.write("                            <span class=\"input-group-addon\"><i class=\"fa fa-building-o\"></i></span>\n");
      out.write("                            <input id=\"txtState\" name=\"txtState\" class=\"form-control\" placeholder=\"Digite su estado\" type=\"text\" required>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label class=\"col-md-4 control-label\" for=\"txtCity\">Ciudad:</label>\n");
      out.write("                    <div class=\"col-md-5\">\n");
      out.write("                        <div class=\"input-group input-group-lg\">\n");
      out.write("                            <span class=\"input-group-addon\"><i class=\"fa fa-building\"></i></span>\n");
      out.write("                            <input id=\"txtCity\" name=\"txtCity\" class=\"form-control\" placeholder=\"Digite su ciudad\" type=\"text\" required>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label class=\"col-md-4 control-label\" for=\"txtZip\">ZIP:</label>\n");
      out.write("                    <div class=\"col-md-5\">\n");
      out.write("                        <div class=\"input-group input-group-lg\">\n");
      out.write("                            <span class=\"input-group-addon\"><i class=\"fa fa-inbox\"></i></span>\n");
      out.write("                            <input id=\"txtZip\" name=\"txtZip\" class=\"form-control\" placeholder=\"Digite el codigo ZIP\" type=\"text\" required>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label class=\"col-md-4 control-label\" for=\"save\"></label>\n");
      out.write("                    <div class=\"col-md-5\">\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-success btn-lg btn-block outline\" onsubmit=\"return false;\">Guardar</button>\n");
      out.write("                        <br />\n");
      out.write("                        <button type=\"reset\" class=\"btn btn-warning btn-lg btn-block outline\">Limpiar</button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </fieldset>\n");
      out.write("          </form>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("          <footer>\n");
      out.write("            <p>&copy; Cristian Sanchez - 2017</p>\n");
      out.write("          </footer>\n");
      out.write("        </div> <!-- /container -->        \n");
      out.write("        <script src=\"//ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js\"></script>\n");
      out.write("        <script>window.jQuery || document.write('<script src=\"js/vendor/jquery-1.11.2.min.js\"><\\/script>')</script>\n");
      out.write("\n");
      out.write("        <script src=\"js/vendor/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("        <script src=\"js/main.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
