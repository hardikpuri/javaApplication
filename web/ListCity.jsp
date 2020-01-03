<%-- 
    Document   : ListCity
    Created on : Oct 6, 2018, 3:41:33 PM
    Author     : user
--%>

<%@page import="App.CityDTO"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <%@include file="Header.jsp" %>
        <h1>City List</h1>
         <table border="1" width="50%" style='background-color:gold'>

            <tr>
                <th>ID</th>
                <th>CityName</th>
                <th>State</th>
                <th>PinCode</th>
                <th>Country</th>
                <th>Delete</th>
                <th> Edit</th>
            </tr>


            <%
                ArrayList al = (ArrayList) request.getAttribute("citylist");
                Iterator itr = al.iterator();
                System.out.println("8888");
                while (itr.hasNext()) {
                    CityDTO cdto = (CityDTO) itr.next();

            %>


            <tr>
                <td><%=cdto.getId()%></td>
                <td><%=cdto.getCityname()%></td>
                <td><%=cdto.getState()%></td>
                <td><%=cdto.getPin()%></td>
                <td><%=cdto.getCountry()%></td>
                 <td><a href="DeleteCityServelt?id=<%=cdto.getId()%>">Delete</a></td>
                 <td><a href="EditCityServelt?id=<%=cdto.getId()%>">Edit</a></td>
            </tr>

            <%    }
            %>


        </table>
            <%@include file="Footer.jsp" %>
    </body>
</html>
