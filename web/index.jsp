<%-- 
    Document   : index
    Created on : Sep 29, 2018, 11:51:17 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<style>
    form{
        overflow: auto;
        font-variant: small-caps;
        padding: 10px;
    }
    label,
ul {
  border: 1px solid #cecfd5;
  border-radius: 6px;
}
label {
  color: #0087cc;
  cursor: pointer;
  display: inline-block;
  font-size: 18px;
  padding: 5px 9px;
  transition: all .15s ease;
}
label:hover {
  color: #ff7b29;
}
input:checked + label {
  box-shadow: inset 0 1px 2px rgba(0, 0, 0, 0.15);
  color: #9799a7;
}
nav {
  max-height: 0;
  overflow: hidden;
  transition: all .15s ease;
}
input:checked ~ nav {
  max-height: 500px;
}
ul {
  list-style: none;
  margin: 8px 0 0 0;
  width: 100px;
}
li {
  border-bottom: 1px solid #cecfd5;
}
li:last-child {
  border-bottom: 0;
}
</style>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body style="color:white">
        
        <center>
            
        <%@include file="Header.jsp" %>
       
        <h1>Welcome </h1>
            <br><br>

      
        <form action="LoginServlet" style=" color:black;height:60%;width:20%;background-color:whitesmoke;opacity: .9" >
            <h2>Login</h2>   
            <table>
                <tr><td>User Name :  </td><td><input type="text" name="username" required></td></tr>
                <tr><td>Password : </td><td><input type="password" name="pwd" required></td></tr>
                <tr><td></td><td><input type="submit" value="login"><a href="NewUser.jsp"><input type="submit" value="New USer"></a></td></tr>
                     
            </table>
        </form>
        </center>
    <input type="checkbox" id="toggle">
<label for="toggle">&#9776;</label>
<nav>
  <ul>
    <li><a href="#">Home</a></li>
    <li><a href="#">About</a></li>
    <li><a href="#">Services</a></li>
    <li><a href="#">Contact</a></li>
  </ul>
</nav>
        <br>        
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>

        <%@include file="Footer.jsp" %>
    </body>
</html>
