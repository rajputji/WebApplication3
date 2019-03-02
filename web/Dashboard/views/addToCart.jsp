<%-- 
    Document   : addToCart
    Created on : 2 Mar, 2019, 5:41:56 PM
    Author     : SHWETA AGARWAL
--%>

<%@page import="java.util.*"%>
<%@page import="com.stock.*"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            ArrayList cart;
            if(session.getAttribute("c")==null)
            {
                cart = new ArrayList();
            }
            else
            {
                cart = (ArrayList)session.getAttribute("c");
            }
           SaleItem item = new SaleItem();
            item.setP_id(request.getParameter("p_id"));
            item.setP_quantity(Integer.parseInt(request.getParameter("p_quantity")));
            cart.add(item);
            
            session.setAttribute("c",cart);
            
            response.sendRedirect("sales.jsp");
        %>
    </body>
</html>
