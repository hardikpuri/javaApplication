<%-- 
    Document   : StudentList
    Created on : Oct 1, 2018, 9:51:46 PM
    Author     : user
--%>

<%@page import="App.StudentDTO"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body style="color: white">
    <center>
        <%@include file="Header.jsp" %>
        
       
        <table border="1" width="100%" style="background-color:whitesmoke;color: black;opacity: .9 ">
            <h1 style="background-color: whitesmoke;color: black;opacity: .6;height: 30%;width: 30%">Student List</h1>
     
            <b>
        
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Class</th>
                <th>Section</th>
                <th>FatherName</th>
                <th>MotherName</th>
                <th>Email</th>
                <th>Mobile</th>
                <th>Address</th>
                <th>City</th>
                <th>Delete</th>
                <th>Edit</th>
            </tr>
    </b>

            <%
                ArrayList al = (ArrayList) request.getAttribute("studentlist");
                Iterator itr = al.iterator();

                while (itr.hasNext()) {
                    StudentDTO sdto = (StudentDTO) itr.next();

            %>

           
            <tr>
                <td><i><%=sdto.getId()%></i></td>
                <td> <i><%=sdto.getName()%></td>
                <td> <i><%=sdto.getCclass()%></td>
                <td> <i><%=sdto.getSec()%></td>
                <td> <i><%=sdto.getFname()%></td>
                <td> <i><%=sdto.getMname()%></td>
                <td> <i><%=sdto.getEmail()%></td>
                <td> <i><%=sdto.getMob()%></td>
                <td> <i><%=sdto.getAdd()%></td>
                <td> <i><%=sdto.getCity()%></td>
                <td> <i><a href="DeleteStudentServelt?id=<%=sdto.getId()%>"><input type='submit' value="Delete" style="background-color: red"></a></td>
                 <td> <i><a href="EditStudentServelt?id=<%=sdto.getId()%>"><input type='submit' value='Edit'  style="background-color:greenyellow"></a></td>
            </tr>
          
            <%    }
            %>


        </table>

        
        
        
        
        
        
        
        
        
        
        </center>
            <%@include file="Footer.jsp" %>
    </body>
</html>
