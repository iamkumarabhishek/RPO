<%-- 
    Document   : update_cmp
    Created on : Apr 24, 2017, 1:17:48 PM
    Author     : ABHISHEK
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*;"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
         <%
             int i = 0;
            String old_uname = request.getParameter("old_uname");
            String old_pass = request.getParameter("old_pass");
            String name = request.getParameter("c_name");
            String uname = request.getParameter("u_name");
            String pass = request.getParameter("pass");
            String email = request.getParameter("email");
            String adrs = request.getParameter("adr");
            String cnt = request.getParameter("cnt");
            String UPDATE_QUERY = "update cmpnReg set c_name = '"+name+"',password='"+pass+"',email='"+email+"',adrs ='"+adrs+"',contact='"+cnt+"',u_name='"+uname+"' where u_name ='"+old_uname+"' and password ='"+old_pass+"'";
            //String UPDATE_QUERY = "update cmpnReg set c_name = 'surajSoft',password='verani',email='suraj@suraj.com',adrs ='patna',contact='90909090',u_name='tbrej' where u_name ='tbrj' and password ='erani'";
           
            
                
            //register driver
            Class.forName("oracle.jdbc.driver.OracleDriver");
            //establish connection
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:SURAJ","scott","tiger");
            //create connection
            
                Statement st = con.createStatement();
                                //update test3 set name = 'abhishek', pass = 'varsi' where name = 'abhishek' and pass='kumar';
            i = st.executeUpdate(UPDATE_QUERY);     
            if(i>0){
        %>
        <script language ="javascript">
            alert('update successfull');
            window.location.href="Welcome.jsp";
        </script>
        <%
            }
            else if(i==0){
        %>
        <script language ="javascript">
            alert('update UnSuccessfull, check again');
        </script>
        <%
            }
        %>
    </body>
</html>
