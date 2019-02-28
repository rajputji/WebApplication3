package org.apache.jsp.Dashboard.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;

public final class ProductList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


            public int nullIntconv(String str)
            {   
                int conv=0;
                if(str==null)
                {
                    str="0";
                }
                else if((str.trim()).equals("null"))
                {
                    str="0";
                }
                else if(str.equals(""))
                {
                    str="0";
                }
                try{
                    conv=Integer.parseInt(str);
                }
                catch(Exception e)
                {
                }
                return conv;
            }
            
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
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <title>Stock Management System</title>\n");
      out.write("        <!-- Tell the browser to be responsive to screen width -->\n");
      out.write("        <meta content=\"width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no\" name=\"viewport\">\n");
      out.write("        <!-- Bootstrap 3.3.6 -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"../../bootstrap/css/bootstrap.min.css\">\n");
      out.write("        <!-- Font Awesome -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.5.0/css/font-awesome.min.css\">\n");
      out.write("        <!-- Ionicons -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/ionicons/2.0.1/css/ionicons.min.css\">\n");
      out.write("        <!-- Theme style -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"../../dist/css/AdminLTE.min.css\">\n");
      out.write("    \n");
      out.write("        <link rel=\"stylesheet\" href=\"../../dist/css/skins/_all-skins.min.css\">\n");
      out.write("        <!-- iCheck -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"../../plugins/iCheck/flat/blue.css\">\n");
      out.write("        <!-- Morris chart -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"../../plugins/morris/morris.css\">\n");
      out.write("        <!-- jvectormap -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"../../plugins/jvectormap/jquery-jvectormap-1.2.2.css\">\n");
      out.write("        <!-- Date Picker -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"../../plugins/datepicker/datepicker3.css\">\n");
      out.write("        <!-- Daterange picker -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"../../plugins/daterangepicker/daterangepicker.css\">\n");
      out.write("        <!-- bootstrap wysihtml5 - text editor -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"../../plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"style.css\" type=\"text/css\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body class=\"hold-transition skin-blue sidebar-mini\">\n");
      out.write("        <div class=\"wrapper\">\n");
      out.write("\n");
      out.write("            <header class=\"main-header\">\n");
      out.write("                <!-- Logo -->\n");
      out.write("                <a href=\"../../main.jsp\" class=\"logo\">\n");
      out.write("                    <!-- mini logo for sidebar mini 50x50 pixels -->\n");
      out.write("                    <span class=\"logo-mini\"><b>A</b>PL</span>\n");
      out.write("                    <!-- logo for regular state and mobile devices -->\n");
      out.write("                    <span class=\"logo-lg\"><b>Admin</b>Panel</span>\n");
      out.write("                </a>\n");
      out.write("                <!-- Header Navbar: style can be found in header.less -->\n");
      out.write("                <nav class=\"navbar navbar-static-top\">\n");
      out.write("                    <!-- Sidebar toggle button-->\n");
      out.write("                    <a href=\"#\" class=\"sidebar-toggle\" data-toggle=\"offcanvas\" role=\"button\">\n");
      out.write("                        <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                    </a>\n");
      out.write("\n");
      out.write("                    <div class=\"navbar-custom-menu\">\n");
      out.write("                        <ul class=\"nav navbar-nav\">\n");
      out.write("                            <!-- Messages: style can be found in dropdown.less-->\n");
      out.write("                            <li class=\"dropdown messages-menu\">\n");
      out.write("                                <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\n");
      out.write("                                </a> \n");
      out.write("                            </li>\n");
      out.write("                            <!-- Notifications: style can be found in dropdown.less -->\n");
      out.write("                            <li class=\"dropdown notifications-menu\">\n");
      out.write("                                <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\n");
      out.write("                                </a>\n");
      out.write("\n");
      out.write("                            </li>\n");
      out.write("                            <!-- Tasks: style can be found in dropdown.less -->\n");
      out.write("\n");
      out.write("                            <!-- User Account: style can be found in dropdown.less -->\n");
      out.write("                            <li class=\"dropdown user user-menu\">\n");
      out.write("                                <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\n");
      out.write("                                    <img src=\"../../Image/logo.png\" class=\"user-image\" alt=\"User Image\">\n");
      out.write("                                    <span class=\"hidden-xs\">Grocery Shop</span>\n");
      out.write("                                </a>\n");
      out.write("                                <ul class=\"dropdown-menu\">\n");
      out.write("                                    <!-- User image -->\n");
      out.write("                                    <li class=\"user-header\">\n");
      out.write("                                        <img src=\"../../Image/logo.png\" class=\"img-circle\" alt=\"User Image\">\n");
      out.write("\n");
      out.write("                                        <p>\n");
      out.write("                                            <i style=\"font-size: 18px\">");
      out.print(session.getAttribute("userid"));
      out.write("</i><br>\n");
      out.write("                                           \n");
      out.write("                                        </p>\n");
      out.write("                                    </li>\n");
      out.write("\n");
      out.write("                                    <!-- Menu Footer-->\n");
      out.write("                                    <li class=\"user-footer\">\n");
      out.write("                                        <div class=\"pull-left\">\n");
      out.write("                                            <a href=\"#\" class=\"btn btn-default btn-flat\">Profile</a>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"pull-right\">\n");
      out.write("                                            <a href=\"../../logout.jsp\" class=\"btn btn-default btn-flat\">Sign out</a>\n");
      out.write("                                        </div>\n");
      out.write("                                    </li>\n");
      out.write("                                </ul>\n");
      out.write("                            </li>\n");
      out.write("                            <!-- Control Sidebar Toggle Button -->\n");
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </nav>\n");
      out.write("            </header>\n");
      out.write("            <!-- Left side column. contains the logo and sidebar -->\n");
      out.write("            <aside class=\"main-sidebar\">\n");
      out.write("                <!-- sidebar: style can be found in sidebar.less -->\n");
      out.write("                <section class=\"sidebar\">\n");
      out.write("                    <!-- Sidebar user panel -->\n");
      out.write("                    <div class=\"user-panel\">\n");
      out.write("                        <div class=\"pull-left image\">\n");
      out.write("                            <img src=\"../../Image/logo.png\" class=\"img-circle\" alt=\"User Image\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"pull-left info\">\n");
      out.write("                            <p>Grocery Shop</p>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- search form -->\n");
      out.write("                    <form action=\"#\" method=\"get\" class=\"sidebar-form\">\n");
      out.write("                        <div class=\"input-group\">\n");
      out.write("                            <input type=\"text\" name=\"q\" class=\"form-control\" placeholder=\"Search...\">\n");
      out.write("                            <span class=\"input-group-btn\">\n");
      out.write("                                <button type=\"submit\" name=\"search\" id=\"search-btn\" class=\"btn btn-flat\"><i class=\"fa fa-search\"></i>\n");
      out.write("                                </button>\n");
      out.write("                            </span>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                    <!-- /.search form -->\n");
      out.write("                    <!-- sidebar menu: : style can be found in sidebar.less -->\n");
      out.write("                    <ul class=\"sidebar-menu\">\n");
      out.write("                        <li class=\"header\">MAIN NAVIGATION</li>\n");
      out.write("                        <li class=\"treeview\">\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                                <i class=\"fa fa-shopping-basket\"></i> <span>Sales</span>\n");
      out.write("                                <span class=\"pull-right-container\">\n");
      out.write("                                    <i class=\"fa fa-angle-left pull-right\"></i>\n");
      out.write("                                </span>\n");
      out.write("                            </a>\n");
      out.write("                            <ul class=\"treeview-menu\">\n");
      out.write("                                <li class=\"active\"><a href=\"sales.jsp\"><i class=\"fa fa-circle-o\"></i> Product Sales</a></li>\n");
      out.write("                                <li><a href=\"#\"><i class=\"fa fa-circle-o\"></i> History</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"treeview\">\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                                <i class=\"fa fa-shopping-cart\"></i>\n");
      out.write("                                <span>Purchase</span>\n");
      out.write("                                <i class=\"fa fa-angle-left pull-right\"></i>                                                       \n");
      out.write("                                </span>\n");
      out.write("                            </a>\n");
      out.write("                            <ul class=\"treeview-menu\">\n");
      out.write("                                <li><a href=\"purchase.jsp\"><i class=\"fa fa-circle-o\"></i> Product Purchase</a></li>\n");
      out.write("                                <li><a href=\"ProductList.jsp\"><i class=\"fa fa-circle-o\"></i> Product List</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                        <li class=\"treeview\">\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                                <i class=\"fa fa-user\"></i>\n");
      out.write("                                <span>Membership</span>\n");
      out.write("                                <i class=\"fa fa-angle-left pull-right\"></i>                                                       \n");
      out.write("                                </span>\n");
      out.write("                            </a>\n");
      out.write("                            <ul class=\"treeview-menu\">\n");
      out.write("                                <li><a href=\"MemberShip.jsp\"><i class=\"fa fa-circle-o\"></i> Add New</a></li>\n");
      out.write("                                <li><a href=\"MemberList.jsp\"><i class=\"fa fa-circle-o\"></i> Membership Info</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                    </li><li class=\"treeview\">\n");
      out.write("                    <a href=\"#\">\n");
      out.write("                        <i class=\"fa fa-users\"></i>\n");
      out.write("                        <span>Staff</span>\n");
      out.write("                        <i class=\"fa fa-angle-left pull-right\"></i>                                                       \n");
      out.write("                        </span>\n");
      out.write("                    </a>\n");
      out.write("                    <ul class=\"treeview-menu\">\n");
      out.write("                        <li><a href=\"Staff.jsp\"><i class=\"fa fa-circle-o\"></i>Details Of Staff</a></li>\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"treeview\">\n");
      out.write("                    <a href=\"#\">\n");
      out.write("                        <i class=\"fa fa-users\"></i>\n");
      out.write("                        <span>Supplier</span>\n");
      out.write("                        <i class=\"fa fa-angle-left pull-right\"></i>                                                       \n");
      out.write("                        </span>\n");
      out.write("                    </a>\n");
      out.write("                    <ul class=\"treeview-menu\">\n");
      out.write("                        <li><a href=\"Dealership.jsp\"><i class=\"fa fa-circle-o\"></i>Details Of Supplier</a></li>\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("                </section>\n");
      out.write("                <!-- /.sidebar -->\n");
      out.write("            </aside>\n");
      out.write("\n");
      out.write("            <!-- Content Wrapper. Contains page content -->\n");
      out.write("            <div class=\"content-wrapper\">\n");
      out.write("                <!-- Content Header (Page header) -->\n");
      out.write("                <section class=\"content-header\">\n");
      out.write("                    <h1>\n");
      out.write("                        Dashboard\n");
      out.write("                        <small>Control panel</small>\n");
      out.write("                    </h1>\n");
      out.write("                    <ol class=\"breadcrumb\">\n");
      out.write("                        <li><a href=\"../../main.jsp\"><i class=\"fa fa-dashboard\"></i>Home</a></li>\n");
      out.write("\n");
      out.write("                    </ol>\n");
      out.write("                </section>\n");
      out.write("\n");
      out.write("        <!-- Main content -->\n");
      out.write("\n");
      out.write("        <!-- Small boxes (Stat box) -->\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <h2>Product List</h2>\n");
      out.write("            <p>Products Exits in the Store</p> \n");
      out.write("\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            ");
      out.write("\n");
      out.write("            ");

 
                Connection conn = null;
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory","root", "");
 
                ResultSet rsPagination = null;
                ResultSet rsRowCnt = null;
     
                PreparedStatement psPagination=null;
                PreparedStatement psRowCnt=null;
     
                int iShowRows=5;  // Number of records show on per page
                int iTotalSearchRecords=10;  // Number of pages index shown
     
                int iTotalRows=nullIntconv(request.getParameter("iTotalRows"));
                int iTotalPages=nullIntconv(request.getParameter("iTotalPages"));
                int iPageNo=nullIntconv(request.getParameter("iPageNo"));
                int cPageNo=nullIntconv(request.getParameter("cPageNo"));
     
                int iStartResultNo=0;
                int iEndResultNo=0;
     
                if(iPageNo==0)
                {
                    iPageNo=0;
                }
                else{
                    iPageNo=Math.abs((iPageNo-1)*iShowRows);
                }
     
 
     
                String sqlPagination="SELECT SQL_CALC_FOUND_ROWS * FROM purchase limit "+iPageNo+","+iShowRows+"";
 
                psPagination=conn.prepareStatement(sqlPagination);
                rsPagination=psPagination.executeQuery();
     
                //// this will count total number of rows
                 String sqlRowCnt="SELECT FOUND_ROWS() as cnt";
                 psRowCnt=conn.prepareStatement(sqlRowCnt);
                 rsRowCnt=psRowCnt.executeQuery();
      
                 if(rsRowCnt.next())
                  {
                     iTotalRows=rsRowCnt.getInt("cnt");
                  }
            
      out.write("\n");
      out.write("            <div class=\"panel panel-primary\" style=\"overflow: auto\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <legend><h2>Product Details</h2></legend>\n");
      out.write("\n");
      out.write("                    <table class=\"table table-hover\">\n");
      out.write("                        <thead>\n");
      out.write("                            <tr>\n");
      out.write("                                <th>Sl No.</th>\n");
      out.write("                                <th>Product_ID</th>\n");
      out.write("                                <th>Product Name</th>\n");
      out.write("                                <th>Category</th>\n");
      out.write("                                \n");
      out.write("                               \n");
      out.write("                                <th>Company Name</th>\n");
      out.write("                                <th>Quantity</th>\n");
      out.write("                                <th>Unit</th>\n");
      out.write("                                <th>Per-Unit-Price</th>\n");
      out.write("                               \n");
      out.write("                                <th>Action</th>\n");
      out.write("\n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        <tbody>\n");
      out.write("\n");
      out.write("                            ");

                                int a=1;
                        while(rsPagination.next())
                                    {
                            
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <td>");
 out.print(a); a++; 
      out.write("</td>\n");
      out.write("                                 <td>");
      out.print(rsPagination.getString("p_id"));
      out.write("</td>\n");
      out.write("                                 <td>");
      out.print(rsPagination.getString("p_name"));
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(rsPagination.getString("p_category"));
      out.write("</td>\n");
      out.write("                                \n");
      out.write("                                <td>");
      out.print(rsPagination.getString("p_company"));
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(rsPagination.getString("p_quantity"));
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(rsPagination.getString("p_unit"));
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(rsPagination.getString("p_price"));
      out.write("</td>\n");
      out.write("                               \n");
      out.write("                                <td>\n");
      out.write("                                    <a href=\"DB/EditPurchase.jsp?id=");
      out.print(rsPagination.getInt("id"));
      out.write("\" class=\"btn btn-success btn-sm btn-icon icon-left\" role=\"button\">\n");
      out.write("                                        <i class=\"entypo-pencil\"></i>\n");
      out.write("                                        Edit\n");
      out.write("                                    </a>\n");
      out.write("\n");
      out.write("                                    <a href=\"DB/DelPurchase.jsp?id=");
      out.print(rsPagination.getInt("id"));
      out.write("\"  class=\"btn btn-danger btn-sm btn-icon icon-left\" role=\"button\">\n");
      out.write("                                        <i class=\"entypo-cancel\"></i>\n");
      out.write("                                        Delete\n");
      out.write("                                    </a>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                        </c:forEach>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("\n");
      out.write("                            ");
 
}
                            
      out.write("\n");
      out.write("                            ");

                              //// calculate next record start record  and end record 
                                    try{
                                        if(iTotalRows<(iPageNo+iShowRows))
                                        {
                                            iEndResultNo=iTotalRows;
                                        }
                                        else
                                        {
                                            iEndResultNo=(iPageNo+iShowRows);
                                        }
            
                                        iStartResultNo=(iPageNo+1);
                                        iTotalPages=((int)(Math.ceil((double)iTotalRows/iShowRows)));
         
                                    }
                                    catch(Exception e)
                                    {
                                        e.printStackTrace();
                                    }
                            
      out.write("\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <ul class=\"pagination\">\n");
      out.write("\n");
      out.write("                            ");

                                    //// index of pages 
         
                                    int i=0;
                                    int cPage=0;
                                    if(iTotalRows!=0)
                                    {
                                    cPage=((int)(Math.ceil((double)iEndResultNo/(iTotalSearchRecords*iShowRows))));
         
                                    int prePageNo=(cPage*iTotalSearchRecords)-((iTotalSearchRecords-1)+iTotalSearchRecords);
                                    if((cPage*iTotalSearchRecords)-(iTotalSearchRecords)>0)
                                    {
                            
      out.write("\n");
      out.write("                            <li> <a href=\"ProductList.jsp?iPageNo=");
      out.print(prePageNo);
      out.write("&cPageNo=");
      out.print(prePageNo);
      out.write("\"> << Previous</a></li>\n");
      out.write("                                ");

                               }
         
                               for(i=((cPage*iTotalSearchRecords)-(iTotalSearchRecords-1));i<=(cPage*iTotalSearchRecords);i++)
                               {
                                 if(i==((iPageNo/iShowRows)+1))
                                 {
                                
      out.write("\n");
      out.write("                            <li> <a href=\"ProductList.jsp?iPageNo=");
      out.print(i);
      out.write("\"><b>");
      out.print(i);
      out.write("</b></a></li>\n");
      out.write("                                        ");

                                        }
                                        else if(i<=iTotalPages)
                                        {
                                        
      out.write("\n");
      out.write("                            <li> <a href=\"ProductList.jsp?iPageNo=");
      out.print(i);
      out.write('"');
      out.write('>');
      out.print(i);
      out.write("</a></li>\n");
      out.write("                                ");
 
                                }
                              }
                              if(iTotalPages>iTotalSearchRecords && i<iTotalPages)
                              {
                                
      out.write("\n");
      out.write("                            <li>  <a href=\"ProductList.jsp?iPageNo=");
      out.print(i);
      out.write("&cPageNo=");
      out.print(i);
      out.write("\"> >> Next</a> </li>\n");
      out.write("                                ");

                               }
                               }
                                
      out.write("\n");
      out.write("                            <div class=\"container-fluid\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-sm-8\" style=\"background-color:lavender;\"><b>Rows ");
      out.print(iStartResultNo);
      out.write(" - ");
      out.print(iEndResultNo);
      out.write("   Total Result  ");
      out.print(iTotalRows);
      out.write(" </b></div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                    <input type=\"text\" class=\"\" id=\"search\" placeholder=\"Search...\">\n");
      out.write("                    </tr>\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        </main>\n");
      out.write("\n");
      out.write("        <footer></footer>&nbsp;\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- ./col -->\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- /.content -->\n");
      out.write("</div>\n");
      out.write("<!-- /.content-wrapper -->\n");
      out.write("<footer class=\"main-footer\">\n");
      out.write("    <div class=\"pull-right hidden-xs\">\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write(" \n");
      out.write("</footer>\n");
      out.write("\n");
      out.write("<!-- Control Sidebar -->\n");
      out.write("<aside class=\"control-sidebar control-sidebar-dark\">\n");
      out.write("    <!-- Create the tabs -->\n");
      out.write("    <ul class=\"nav nav-tabs nav-justified control-sidebar-tabs\">\n");
      out.write("        <li><a href=\"#control-sidebar-home-tab\" data-toggle=\"tab\"><i class=\"fa fa-home\"></i></a></li>\n");
      out.write("        <li><a href=\"#control-sidebar-settings-tab\" data-toggle=\"tab\"><i class=\"fa fa-gears\"></i></a></li>\n");
      out.write("    </ul>\n");
      out.write("\n");
      out.write("</aside>\n");
      out.write("<!-- /.control-sidebar -->\n");
      out.write("<!-- Add the sidebar's background. This div must be placed\n");
      out.write("     immediately after the control sidebar -->\n");
      out.write("<div class=\"control-sidebar-bg\"></div>\n");
      out.write("</div>\n");
      out.write("<!-- ./wrapper -->\n");
      out.write("\n");
      out.write("<!-- jQuery 2.2.3 -->\n");
      out.write("<script src=\"../../plugins/jQuery/jquery-2.2.3.min.js\"></script>\n");
      out.write("<!-- jQuery UI 1.11.4 -->\n");
      out.write("<script src=\"https://code.jquery.com/ui/1.11.4/jquery-ui.min.js\"></script>\n");
      out.write("<!-- Resolve conflict in jQuery UI tooltip with Bootstrap tooltip -->\n");
      out.write("<script>\n");
      out.write("    $.widget.bridge('uibutton', $.ui.button);\n");
      out.write("</script>\n");
      out.write("<!-- Bootstrap 3.3.6 -->\n");
      out.write("<script src=\"../../bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("<!-- Morris.js charts -->\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/raphael/2.1.0/raphael-min.js\"></script>\n");
      out.write("<script src=\"../../plugins/morris/morris.min.js\"></script>\n");
      out.write("<!-- Sparkline -->\n");
      out.write("<script src=\"../../plugins/sparkline/jquery.sparkline.min.js\"></script>\n");
      out.write("<!-- jvectormap -->\n");
      out.write("<script src=\"../../plugins/jvectormap/jquery-jvectormap-1.2.2.min.js\"></script>\n");
      out.write("<script src=\"../../plugins/jvectormap/jquery-jvectormap-world-mill-en.js\"></script>\n");
      out.write("<!-- jQuery Knob Chart -->\n");
      out.write("<script src=\"../../plugins/knob/jquery.knob.js\"></script>\n");
      out.write("<!-- daterangepicker -->\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.11.2/moment.min.js\"></script>\n");
      out.write("<script src=\"../../plugins/daterangepicker/daterangepicker.js\"></script>\n");
      out.write("<!-- datepicker -->\n");
      out.write("<script src=\"../../plugins/datepicker/bootstrap-datepicker.js\"></script>\n");
      out.write("<!-- Bootstrap WYSIHTML5 -->\n");
      out.write("<script src=\"../../plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js\"></script>\n");
      out.write("<!-- Slimscroll -->\n");
      out.write("<script src=\"../../plugins/slimScroll/jquery.slimscroll.min.js\"></script>\n");
      out.write("<!-- FastClick -->\n");
      out.write("<script src=\"../../plugins/fastclick/fastclick.js\"></script>\n");
      out.write("<!-- AdminLTE App -->\n");
      out.write("<script src=\"../../dist/js/app.min.js\"></script>\n");
      out.write("<!-- AdminLTE dashboard demo (This is only for demo purposes) -->\n");
      out.write("<script src=\"../../dist/js/pages/dashboard.js\"></script>\n");
      out.write("<!-- AdminLTE for demo purposes -->\n");
      out.write("<script src=\"../../dist/js/demo.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>\n");

    try{
         if(psPagination!=null){
             psPagination.close();
         }
         if(rsPagination!=null){
             rsPagination.close();
         }
          
         if(psRowCnt!=null){
             psRowCnt.close();
         }
         if(rsRowCnt!=null){
             rsRowCnt.close();
         }
          
         if(conn!=null){
          conn.close();
         }
    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
    
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
