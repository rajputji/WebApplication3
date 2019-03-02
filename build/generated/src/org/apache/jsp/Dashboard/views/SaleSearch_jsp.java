package org.apache.jsp.Dashboard.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class SaleSearch_jsp extends org.apache.jasper.runtime.HttpJspBase
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


    if ((session.getAttribute("userid") == null) || (session.getAttribute("userid") == "")) {
        response.sendRedirect("index.jsp");

      out.write('\n');
      out.write('\n');
} else {


      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" href=\"../../plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        ");
  
        String s=request.getParameter("val");
        String p_id,p_name,p_category,p_company,p_quantity,p_unit,p_price;
        int id;
        if(s==null || s.trim().equals("")){
        //out.print("Please enter AccountID");  
        }else{
        //int id=Integer.parseInt(s);
        //out.print(id);  
        try{  
        Class.forName("com.mysql.jdbc.Driver");  
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory","root","");  
        PreparedStatement ps=con.prepareStatement("select * from product where p_id=?");  
        //ps.setInt(1,id);
        ps.setString(1, s);
        ResultSet rs=ps.executeQuery();  
        while(rs.next()){ 
        p_id=rs.getString(2);
        p_name=rs.getString(3);
        p_category=rs.getString(4);
        p_company=rs.getString(5);
        p_quantity=rs.getString(6);
        p_unit=rs.getString(7);
        p_price=rs.getString(8);
        
      out.write("\n");
      out.write("        <div class=\"\">\n");
      out.write("            \n");
      out.write("            <div class=\"container\">\n");
      out.write("                <form class=\"form-inline\" action=\"DB/InsertSale2.jsp\">\n");
      out.write("                    <label><h1>Sales</h1></label>\n");
      out.write("                    <table>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"customer id\">Code :</label><br>\n");
      out.write("                                    <input type=\"text\" name=\"code\" value=\"");
 out.print(p_id);
      out.write("\" class=\"form-control\" id=\"customer id\" placeholder=\"Enter Tag Number\">\n");
      out.write("                                </div><br>\n");
      out.write("                            </td>\n");
      out.write("                            <td>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"customer id\">Category :</label><br>\n");
      out.write("                                    <input type=\"text\" name=\"category\" value=\"");
 out.print(p_name);
      out.write("\" class=\"form-control\" id=\"customer id\" >\n");
      out.write("                                </div><br>\n");
      out.write("                            </td>\n");
      out.write("\n");
      out.write("                            <td>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"customer id\">Product Name: </label><br>\n");
      out.write("                                    <input type=\"text\" name=\"product_name\" value=\"");
 out.print(p_category);
      out.write("\" class=\"form-control\" id=\"customer id\" placeholder=\"Enter Product Name\">\n");
      out.write("                                </div><br>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                              <td>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"customer id\">Company:</label><br>\n");
      out.write("                                    <input type=\"text\" name=\"quantity\" value=\"");
 out.print(p_company);
      out.write("\" class=\"form-control\" id=\"customer id\" placeholder=\"Enter Quantity\">\n");
      out.write("                                </div><br>\n");
      out.write("                            </td>\n");
      out.write("                            <td>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"customer id\">Quantity:</label><br>\n");
      out.write("                                    <input type=\"text\" name=\"quantity\" value=\"");
 out.print(p_quantity);
      out.write("\" class=\"form-control\" id=\"customer id\" placeholder=\"Enter Quantity\">\n");
      out.write("                                </div><br>\n");
      out.write("                            </td>\n");
      out.write("                            <td>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"customer id\">Unit:</label><br>\n");
      out.write("                                    <input type=\"text\" name=\"unit\" value=\"");
 out.print(p_unit);
      out.write("\" class=\"form-control\" id=\"customer id\" >\n");
      out.write("                                </div><br>\n");
      out.write("                            </td>\n");
      out.write("                            <td>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"customer id\">Per Unit Price: </label><br>\n");
      out.write("                                    <input type=\"text\" name=\"per_unit_price\" value=\"");
 out.print(p_price);
      out.write("\" class=\"form-control\" id=\"customer id\" placeholder=\"Enter  per unit price\">\n");
      out.write("                                </div><br>\n");
      out.write("                            </td>\n");
      out.write("\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"customer id\">Total Price: </label><br>\n");
      out.write("                                    <input type=\"text\" name=\"total_price\" class=\"form-control\" id=\"customer id\" placeholder=\"Enter Total Price\">\n");
      out.write("                                </div><br>\n");
      out.write("                            </td>\n");
      out.write("                            <td>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"customer id\">Date: </label><br>\n");
      out.write("                                    <input type=\"date\" name=\"date\" class=\"form-control\">\n");
      out.write("                                </div>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>\n");
      out.write("                                <div class=\"btn\">\n");
      out.write("                                    <button class=\"btn btn-vimeo\">Add Product</button>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        </tr>\n");
      out.write("                    </table>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("     \n");
      out.write("        \n");
      out.write("        ");
 
        }
        con.close();  
        }catch(Exception e){e.printStackTrace();}  
        }  
        
      out.write("  \n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");

    }

      out.write('\n');
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
