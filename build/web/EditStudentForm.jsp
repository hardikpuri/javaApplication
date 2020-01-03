<%-- 
    Document   : EditStudentForm
    Created on : Oct 2, 2018, 1:34:31 PM
    Author     : user
--%>

<%@page import="App.CityDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Iterator"%>
<%@page import="App.CityDAO"%>
<%@page import="App.StudentDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body bgcolor="coral">
        <%
            StudentDTO sdto = (StudentDTO) request.getAttribute("studentdto");
        
        
        %>
        
        <center>
       <h1>EDIT User Form</h1>
       
        <form action="UpdateStudentServlet">
            <table>
            <tr><td>ID :</td><td> <input type="text" name="id" value="<%=sdto.getId()%>" ></td> 
            <tr><td> Name :</td><td> <input type="text" name="name" value="<%=sdto.getName()%>"> </td>
            <tr><td>Class :</td><td> <input type="text" name="cclass" value="<%=sdto.getCclass()%>"></td> 
            <tr><td>Section :</td> <td><input type="text" name="sec" value="<%=sdto.getSec()%>"> </td>
            <tr><td>Father Name:</td> <td><input type="text" name="fname" value="<%=sdto.getFname()%>"> </td>
            <tr><td> Mother Name:</td><td> <input type="text" name="mname" value="<%=sdto.getMname()%>"></td>
            <tr><td> Email:</td><td> <input type="text" name="email" value="<%=sdto.getEmail()%>"> </td>
            <tr><td>Mobile:</td><td> <input type="text" name="mobile" value="<%=sdto.getMob()%>"></td>
            <tr><td>Address:</td><td> <input type="text" name="add" value="<%=sdto.getAdd()%>"> </td>
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
                       </select> </td>
            <tr><td></td><td><input type="submit" value="Update STUDENT"></td> 
           </table>
        </form>
         </center>
            <%@include file="Footer.jsp" %>
      
    </body>
</html>
