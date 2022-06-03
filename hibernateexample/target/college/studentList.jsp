<%@page import="javax.swing.text.StyledEditorKit.ForegroundAction"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.database.DatabaseOperator" %>
<%@ page import="com.login.User" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Welecome Admin: </h2>
Current Logged in User: 
<%

   String username =  (String) session.getAttribute("username"); 
   if(username == null || username.equals("") || username.isEmpty()){
	   response.sendRedirect("login.jsp?msg=invalidSession");
   }
   
   List<User> users  = DatabaseOperator.getUsersList();
   for(User user: users){
%>
<div style = "display:table-row;width:100%;height:30px; background:#3A464B;color: #FFFFFF;"> 
  <label > <%= user.getUsername() %> &nbsp;&nbsp;</label>  
  <label><%= user.getCreatedOn() %> </label>
</div>
<%    } %>
</body>
</html>