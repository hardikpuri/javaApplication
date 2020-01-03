<%-- 
    Document   : NewUser
    Created on : Sep 30, 2018, 12:09:52 AM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <center>
        <%@include file="Header.jsp" %>
      <h1>Welcome NewUser</h1>
      <form action="NewUserServlet">
          <table>
              <tr><td>First Name:</td><td><input type="text" name="fname" required></td>
              <tr><td>Last Name:</td><td><input type="text" name="lname" required></td>
              <tr><td>User Name:</td><td><input type="text" name="uname" required></td>
              <tr><td>Password:</td><td><input type="password" name="pwd" required></td>
              <tr><td>mobile:</td><td><input type="number" name="mob" required></td>
              <tr><td>Email:</td><td><input type="email" name="email" required></td>
              <tr><td></td><td><input type="submit" value="Submit" required></td>   
          </table>
         </form>   
        </center>
        <%@include file="Footer.jsp" %>
    </body>
</html>
