<%-- 
    Document   : AddStudent
    Created on : Oct 1, 2018, 11:14:28 AM
    Author     : user
--%>

<%@page import="App.CityDTO"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="App.CityDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body style="color: white">
       
                    <%@include file="Header.jsp" %>

          <% 
           
            if(session!=null) 
            {
          %>
       <center>
            <form action="AddStudentServlet" style=" color:black;height:60%;width:20%;background-color:whitesmoke;opacity: .9">
        <h1>Add Student</h1>
                <table>
             <tr><td>Student Name:</td><td><input type="text" name="name" required></td>
              <tr><td>Class:</td><td><input type="number" name="cclass" required></td>
              <tr><td>Section:</td><td><input type="text" name="sec" required></td>
              <tr><td>Father's name:</td><td><input type="text" name="fname" required></td>
              <tr><td>Mother's name:</td><td><input type="text" name="mname" required></td>
              <tr><td>Email:</td><td><input type="email" name="email" required></td>
               <tr><td>Mobile:</td><td><input type="number" name="mob" required></td>
               <tr><td>Address:</td><td><input type="text" name="add" required></td>     
               <tr><td>City:</td><td><select name="c">
                           <% CityDAO cdao=new CityDAO();
                             ArrayList al=cdao.getCity();
                             Iterator itr = al.iterator();
                              while (itr.hasNext()) {
                              CityDTO cdto = (CityDTO) itr.next();

                           %>
                           <option><%=cdto.getCityname()%></option>
                           <%}
                           
                           
                           %>
                       </select>
              <tr><td></td><td><input type="submit" value="Submit" style="background-color:greenyellow" required></td>   
          </table>
       </form>
                         </center>
         <%
             }
else
            response.sendRedirect("index.jsp");

         %>
    
                           <%@include file="Footer.jsp" %>      
</body>
    
</html>
