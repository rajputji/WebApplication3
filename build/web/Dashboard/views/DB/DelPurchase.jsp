<%@page import="com.inventory.dao.UserDao"%>
<jsp:useBean id="u" class="com.inventory.bean.User"></jsp:useBean>
<jsp:setProperty property="*" name="u"/>

<%
UserDao.deletepurchase(u);
response.sendRedirect("../ProductList.jsp");
%>