<%-- 
    Document   : AddCity
    Created on : Oct 6, 2018, 3:19:07 PM
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
        <%@include file="Header.jsp" %>
         <center>
        <h1>Add city Form</h1>
        <form action="AddCityServlet">
            <table>
                <tr><td> City Name:</td><td><input type="text" name="cityname" required></td><br>
                <tr><td> State:</td><td><input type="text" name="state" required></td><br>
           <tr><td> PinCode:</td><td><input type="number" name="pin" required></td><br>
           <tr><td>  Country:</td><td><select name="country" required><option>India</option><option>China</option><option>Pakistan</option><option>America</option></select></td><br>
          </table>
           <input type="checkbox" required>i agree with all the terms and condition<br>
            <input type="submit" value="Add city">
            
        </form>
        </center>
        
        <%@include file="Footer.jsp" %>
    </body>
</html>
