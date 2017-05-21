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
            
            String fname = request.getParameter("fname");
            String lname = request.getParameter("lname");
            String email = request.getParameter("email");
            String contact = request.getParameter("contact");
            String dob = request.getParameter("dob");
            String gender = request.getParameter("gender");
            String uname = request.getParameter("uname");
            String password = request.getParameter("password");
            String address = request.getParameter("address");
            String city = request.getParameter("city");
            String state = request.getParameter("state");
            String country = request.getParameter("country");
            
            
            
            String UPDATE_QUERY = "update studentReg set fname = '"+fname+"',lname = '"+lname+"',email='"+email+"',contact='"+contact+"',dob ='"+dob+"',gender='"+gender+"',uname='"+uname+"', password='"+password+"',address='"+address+"',city='"+city+"', state='"+state+"',country='"+country+"' where uname ='"+old_uname+"' and password ='"+old_pass+"'";
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
            window.location.href="studentPannel.jsp";
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
