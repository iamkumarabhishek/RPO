<%-- 
    Document   : rcvrPass
    Created on : Apr 21, 2017, 4:22:12 PM
    Author     : ABHISHEK
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*;"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Password Recovery</title>
    </head>
    <body>
        <%
            String uname = request.getParameter("userAgain");
            String newPass = request.getParameter("newPass");
            int i = 0;
            
                //register driver
                Class.forName("oracle.jdbc.driver.OracleDriver");
                //eshtablish connection
                Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:SURAJ","scott","tiger");
                //create statement
                Statement st = con.createStatement();
                //String QUERY = "update cmpnReg set password = '"+newPass+"' where u_name = '"+uname+"'";
                String QUERY = "update cmpnReg set password = '"+newPass+"' where u_name = '"+uname+"'";
                //execute query
                i = st.executeUpdate(QUERY);
                //process result
                if(i>0){     
                %>
                    <script language="javascript">
                        alert('password successfully changed');
                        window.location.href="Welcome.jsp";
                    </script>
                <%
                
            }
            else{
        %>
        <script language="javascript">
            alert('credential not matched, try again');
            window.location.href="frgtPWD.jsp";
        </script>
        <%
            }
        %>
    </body>
</html>
