<%-- 
    Document   : del_acn
    Created on : Apr 28, 2017, 4:02:28 PM
    Author     : ABHISHEK
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*;"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <%
             int i = 0;
            String uname = request.getParameter("uname");
            String pass = request.getParameter("pass");
            
            String VERIFY_QUERY = "select count(*) from studentReg where uname = '"+uname+"' and password='"+pass+"'";
            //String UPDATE_QUERY = "update cmpnReg set c_name = 'surajSoft',password='verani',email='suraj@suraj.com',adrs ='patna',contact='90909090',u_name='tbrej' where u_name ='tbrj' and password ='erani'";
           
            
                
            //register driver
            Class.forName("oracle.jdbc.driver.OracleDriver");
            //establish connection
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:SURAJ","scott","tiger");
            //create connection
            
                Statement st = con.createStatement();
                                //update test3 set name = 'abhishek', pass = 'varsi' where name = 'abhishek' and pass='kumar';
            ResultSet rs = st.executeQuery(VERIFY_QUERY);
            while(rs.next()){
                i = rs.getInt(1);
            }
            if(i>0){
        %>
        <script language ="javascript">
            alert('job applied successfully');
            window.location.href="studentPannel.jsp";
        </script>
        <%
            }
            else if(i==0){
        %>
        <script language ="javascript">
            alert('invalid credential, check again');
            window.location.href="studentPannel.jsp";
        </script>
        <%
            }
        %>
    </body>
</html>
