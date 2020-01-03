<%-- 
    Document   : valid
    Created on : Sep 30, 2018, 1:14:48 AM
    Author     : user
--%>

<%@page import="App.UserDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
    <body style="color: white">
       
        <style>
li {
display : inline-block;
background : lightblue;
padding:10px;
border-width:2px 10px 15px;
border-color:black;
border-style:double;
font-variant: small-caps;
}
</style>
     
        <%      
            UserDTO udto=(UserDTO) session.getAttribute("userinfo");
            String fname=(String)udto.getFirstname();
            String lname=(String)udto.getLastname();
%>
     <center>
         
          <%@include file="Header.jsp" %>


          <h1 style="background-color: whitesmoke;height: 30%;width: 30%;opacity: .7;color: black">welcome <% out.print(fname+" ");
                         out.println(lname); %>
         </h1>
        <div align="right">
            <a href="UserInfoServlet"><input type="submit" value="Account"></a>
        </div>
        
     </center>
     <ul>
      
             
         <li><a href="AddStudent.jsp">Add Student</a></li>
         <li><a href="StudentListServlet">Student list</a></li>
         <li><a href="AddCity.jsp">Add City</a></li>
         <li><a href="CityListServlet">City List</a></li>
        
     </ul>
     <section>for more details <details open><summary>more</summary>
                 <p>
                     hiaegfbhwegbfqhgbfiuvhqjvbuiq
                 </p>
             </details></section>
                 
    <br><br><br>
    <%@include file="Footer.jsp" %>
    </body>
</html>
