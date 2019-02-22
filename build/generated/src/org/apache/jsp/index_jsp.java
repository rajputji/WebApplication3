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

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\n");
      out.write("        <meta name=\"description\" content=\"Admin Panel\" />\n");
      out.write("        <meta name=\"author\" content=\"\" />\n");
      out.write("\n");
      out.write("        <link rel=\"icon\" href=\"assets/images/favicon.ico\">\n");
      out.write("\n");
      out.write("        <title>Login</title>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/js/jquery-ui/css/no-theme/jquery-ui-1.10.3.custom.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/font-icons/entypo/css/entypo.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"//fonts.googleapis.com/css?family=Noto+Sans:400,700,400italic\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/bootstrap.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/core.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/theme.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/forms.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/custom.css\">\n");
      out.write("\n");
      out.write("        <script src=\"assets/js/jquery-1.11.3.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!--[if lt IE 9]><script src=\"assets/js/ie8-responsive-file-warning.js\"></script><![endif]-->\n");
      out.write("\n");
      out.write("        <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("                <script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\n");
      out.write("                <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\n");
      out.write("        <![endif]-->\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body class=\"page-body login-page login-form-fall\" data-url=\"http://neon.dev\">\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- This is needed when you send requests via Ajax-->\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            var baseurl = '';\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("        <div class=\"login-container\">\n");
      out.write("\n");
      out.write("            <div class=\"login-header login-caret\">\n");
      out.write("\n");
      out.write("                <div class=\"login-content\">\n");
      out.write("\n");
      out.write("                    <a href=\"#\" class=\"logo\">\n");
      out.write("                        <img src=\"Image/logo.png\" width=\"170\" height=\"150\" alt=\"\" class=\"img-circle\" > <!-- id=\"form_login\"-->                    </a>\n");
      out.write("\n");
      out.write("                    <p class=\"description\">Dear user, log in to access!</p>\n");
      out.write("\n");
      out.write("                    <!-- progress bar indicator -->\n");
      out.write("                    <div class=\"login-progressbar-indicator\">\n");
      out.write("                        <h3>43%</h3>\n");
      out.write("                        <span>logging in...</span>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"login-progressbar\">\n");
      out.write("                <div></div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"login-form\">\n");
      out.write("\n");
      out.write("                <div class=\"login-content\">\n");
      out.write("\n");
      out.write("                    <div class=\"form-login-error\">\n");
      out.write("                        <h3>Invalid login</h3>\n");
      out.write("                        <p>Enter correct login username and password.</p>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <form action=\"login2.jsp\" method=\"post\" role=\"form\" id=\"\"> <!!id=\"form_login\"> \n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("\n");
      out.write("                            <div class=\"input-group\">\n");
      out.write("                                <div class=\"input-group-addon\">\n");
      out.write("                                    <i class=\"entypo-user\"></i>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <input type=\"userid\" class=\"form-control\" name=\"name\" id=\"userid\" placeholder=\"Enter User Id...\" autocomplete=\"off\" />\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("\n");
      out.write("                            <div class=\"input-group\">\n");
      out.write("                                <div class=\"input-group-addon\">\n");
      out.write("                                    <i class=\"entypo-key\"></i>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <input type=\"password\" class=\"form-control\" name=\"password\" id=\"password\" placeholder=\"Password\" autocomplete=\"off\" />\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-primary btn-block btn-login\">\n");
      out.write("                                <i class=\"entypo-login\"></i>\n");
      out.write("                                Login In\n");
      out.write("\n");
      out.write("                            </button>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <!-- \n");
      out.write("                        \n");
      out.write("                        You can also use other social network buttons\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                        \n");
      out.write("                                <button type=\"button\" class=\"btn btn-default btn-lg btn-block btn-icon icon-left twitter-button\">\n");
      out.write("                                        Login with Twitter\n");
      out.write("                                        <i class=\"entypo-twitter\"></i>\n");
      out.write("                                </button>\n");
      out.write("                                \n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                        \n");
      out.write("                                <button type=\"button\" class=\"btn btn-default btn-lg btn-block btn-icon icon-left google-button\">\n");
      out.write("                                        Login with Google+\n");
      out.write("                                        <i class=\"entypo-gplus\"></i>\n");
      out.write("                                </button>\n");
      out.write("                                \n");
      out.write("                        </div> -->\n");
      out.write("\n");
      out.write("                    </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"login-bottom-links\">\n");
      out.write("\n");
      out.write("                     \n");
      out.write("\n");
      out.write("                        <br />\n");
      out.write("\n");
      out.write("                        <a href=\"#\">ToS</a>  - <a href=\"#\">Privacy Policy</a>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Bottom scripts (common) -->\n");
      out.write("        <script src=\"assets/js/gsap/TweenMax.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/jquery-ui/js/jquery-ui-1.10.3.minimal.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/bootstrap.js\"></script>\n");
      out.write("        <script src=\"assets/js/joinable.js\"></script>\n");
      out.write("        <script src=\"assets/js/resizeable.js\"></script>\n");
      out.write("        <script src=\"assets/js/sabuj-api.js\"></script>\n");
      out.write("        <script src=\"assets/js/jquery.validate.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/neon-login.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- JavaScripts initializations and stuff -->\n");
      out.write("        <script src=\"assets/js/custom.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Demo Settings -->\n");
      out.write("        <script src=\"assets/js/neon-demo.js\"></script>\n");
      out.write("\n");
      out.write("    </body>\n");
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
