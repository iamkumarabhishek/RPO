<%-- 
    Document   : frgt
    Created on : Apr 21, 2017, 2:46:48 PM
    Author     : ABHISHEK
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*;"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Recover Password</title>
    </head>
    <body>
        <h1>Recover Password</h1>
        <%
            String c_name = request.getParameter("c_name");
            String uname = request.getParameter("u_name");
            String cnt = request.getParameter("cnt");
            int i =0;
            
            //register driver
            Class.forName("oracle.jdbc.driver.OracleDriver");
            //eshtablish connection
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:SURAJ","scott","tiger");
            //create statement
            Statement st = con.createStatement();
            String QUERY = "select count(*) from cmpnReg where c_name = '"+c_name+"' and u_name = '"+uname+"' and contact = '"+cnt+"'";
            //execute query
            ResultSet rs = st.executeQuery(QUERY);
            //process the result
            while(rs.next()){
                i = rs.getInt(1);
            }
            if(i>0){
        %>
        <script language="javascript">
            alert('click to proceed');
            window.location.href="frgtPWD.jsp";
        </script>
        
        <%
            }
            else{
            
        %>
            <script language="javascript">
                alert('unsuccessful matches, try again or sign up new');
                window.location.href="forgot.jsp";
            </script>
         <%
             }
         %>
    </body>
</html>
