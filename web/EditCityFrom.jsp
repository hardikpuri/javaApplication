<%-- 
    Document   : EditCityFrom
    Created on : Oct 6, 2018, 4:17:06 PM
    Author     : user
--%>

<%@page import="App.CityDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body bgcolor='coral'>
        <%@include file="Header.jsp" %>
            <%
            CityDTO cdto = (CityDTO) request.getAttribute("citydto");
        
        
        %>
        
        
       <h1>EDIT City Form</h1>
    <center>
        <form action="UpdateCityServlet">
            <table>
            <tr><td>ID : </td><td><input type="text" readonly name="id" value="<%=cdto.getId()%>"></td>
            <tr><td>City Name :</td><td> <input type="text" name="cityname" value="<%=cdto.getCityname()%>"></td> 
            <tr><td> State:</td><td> <input type="text" name="state" value="<%=cdto.getState()%>"> </td>
            <tr><td> Pincode :</td><td> <input type="text" name="pin" value="<%=cdto.getPin()%>"></td> 
            <tr><td>Country :</td><td> <input type="text" name="country" value="<%=cdto.getCountry()%>"></td> 
            <tr><td></td><td> <input type="submit" value="Update USER"> <br></td>
            </table>
                    </form>
            
    </center>
            <%@include file="Footer.jsp" %>
    </body>
</html>
