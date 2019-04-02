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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\r\n");
      out.write("        <meta name=\"description\" content=\"Admin Panel\" />\r\n");
      out.write("        <meta name=\"author\" content=\"\" />\r\n");
      out.write("\r\n");
      out.write("        <link rel=\"icon\" href=\"assets/images/favicon.ico\">\r\n");
      out.write("\r\n");
      out.write("        <title>Login</title>\r\n");
      out.write("\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/js/jquery-ui/css/no-theme/jquery-ui-1.10.3.custom.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/font-icons/entypo/css/entypo.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"//fonts.googleapis.com/css?family=Noto+Sans:400,700,400italic\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/bootstrap.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/core.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/theme.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/forms.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/custom.css\">\r\n");
      out.write("\r\n");
      out.write("        <script src=\"assets/js/jquery-1.11.3.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <!--[if lt IE 9]><script src=\"assets/js/ie8-responsive-file-warning.js\"></script><![endif]-->\r\n");
      out.write("\r\n");
      out.write("        <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("        <!--[if lt IE 9]>\r\n");
      out.write("                <script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\r\n");
      out.write("                <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\r\n");
      out.write("        <![endif]-->\r\n");
      out.write("<!-- Compiled and minified CSS -->\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <body class=\" page-body login-page login-form-fall\" data-url=\"http://neon.dev\" style=\"background-color: #021014;\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- This is needed when you send requests via Ajax-->\r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("            var baseurl = '';\r\n");
      out.write("        </script>\r\n");
      out.write("        <br/>\r\n");
      out.write("        <div style=\"\">\r\n");
      out.write("            <center>\r\n");
      out.write("                <h1 style=\"color:white;margin-top:100px;font-size:500%;\">Grocery Shop</h1>\r\n");
      out.write("            </center>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"login-container\">\r\n");
      out.write("\r\n");
      out.write("<!--            <div class=\"login-header login-caret\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"login-content\">\r\n");
      out.write("\r\n");
      out.write("                    <a href=\"#\" class=\"logo\">\r\n");
      out.write("                        <img src=\"Image/logo.png\" width=\"170\" height=\"150\" alt=\"\" class=\"img-circle\" >  id=\"form_login\"                    </a>\r\n");
      out.write("\r\n");
      out.write("                    <p class=\"description\">Dear user, log in to access!</p>\r\n");
      out.write("\r\n");
      out.write("                     progress bar indicator \r\n");
      out.write("                    <div class=\"login-progressbar-indicator\">\r\n");
      out.write("                        <h3>43%</h3>\r\n");
      out.write("                        <span>logging in...</span>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div>-->\r\n");
      out.write("\r\n");
      out.write("<!--            <div class=\"login-progressbar\">\r\n");
      out.write("              \r\n");
      out.write("            </div>-->\r\n");
      out.write("\r\n");
      out.write("            <div class=\"login-form\" style=\"margin-top:100px;background-color:rgba(0,0,0,0.3);width:400px;margin-left: 470px;\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"login-content\">\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"form-login-error\">\r\n");
      out.write("                        <h3>Invalid login</h3>\r\n");
      out.write("                        <p>Enter correct login username and password.</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <form action=\"login2.jsp\" method=\"post\" role=\"form\" id=\"\"> <!!id=\"form_login\"> \r\n");
      out.write("\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"input-group\">\r\n");
      out.write("                                <div class=\"input-group-addon\">\r\n");
      out.write("                                    <i class=\"entypo-user\"></i>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                <input type=\"userid\" class=\"form-control\" name=\"name\" id=\"userid\" placeholder=\"Enter User Id...\" autocomplete=\"off\" />\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"input-group\">\r\n");
      out.write("                                <div class=\"input-group-addon\">\r\n");
      out.write("                                    <i class=\"entypo-key\"></i>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                <input type=\"password\" class=\"form-control\" name=\"password\" id=\"password\" placeholder=\"Password\" autocomplete=\"off\" />\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-primary btn-block btn-login\">\r\n");
      out.write("                                <i class=\"entypo-login\"></i>\r\n");
      out.write("                                Login In\r\n");
      out.write("\r\n");
      out.write("                            </button>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        <!-- \r\n");
      out.write("                        \r\n");
      out.write("                        You can also use other social network buttons\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                        \r\n");
      out.write("                                <button type=\"button\" class=\"btn btn-default btn-lg btn-block btn-icon icon-left twitter-button\">\r\n");
      out.write("                                        Login with Twitter\r\n");
      out.write("                                        <i class=\"entypo-twitter\"></i>\r\n");
      out.write("                                </button>\r\n");
      out.write("                                \r\n");
      out.write("                        </div>\r\n");
      out.write("                        \r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                        \r\n");
      out.write("                                <button type=\"button\" class=\"btn btn-default btn-lg btn-block btn-icon icon-left google-button\">\r\n");
      out.write("                                        Login with Google+\r\n");
      out.write("                                        <i class=\"entypo-gplus\"></i>\r\n");
      out.write("                                </button>\r\n");
      out.write("                                \r\n");
      out.write("                        </div> -->\r\n");
      out.write("\r\n");
      out.write("                    </form>\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- Bottom scripts (common) -->\r\n");
      out.write("        <script src=\"assets/js/gsap/TweenMax.min.js\"></script>\r\n");
      out.write("        <script src=\"assets/js/jquery-ui/js/jquery-ui-1.10.3.minimal.min.js\"></script>\r\n");
      out.write("        <script src=\"assets/js/bootstrap.js\"></script>\r\n");
      out.write("        <script src=\"assets/js/joinable.js\"></script>\r\n");
      out.write("        <script src=\"assets/js/resizeable.js\"></script>\r\n");
      out.write("        <script src=\"assets/js/sabuj-api.js\"></script>\r\n");
      out.write("        <script src=\"assets/js/jquery.validate.min.js\"></script>\r\n");
      out.write("        <script src=\"assets/js/neon-login.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- JavaScripts initializations and stuff -->\r\n");
      out.write("        <script src=\"assets/js/custom.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- Demo Settings -->\r\n");
      out.write("        <script src=\"assets/js/neon-demo.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>");
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
