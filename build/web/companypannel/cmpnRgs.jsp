<%-- 
    Document   : cmpnRgs
    Created on : Apr 19, 2017, 3:35:42 PM
    Author     : ABHISHEK
--%>

<%@page import="java.sql.*"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>

        <%
            
            
            //Connection con = null;
            //Statement st = null;
            int i = 0;
            String name = request.getParameter("c_name");
            String pass = request.getParameter("pwd");
            String email = request.getParameter("email");
            String adrs = request.getParameter("adrs");
            String cnt = request.getParameter("cnt");
            String uname = request.getParameter("uname");
            
           
            
                
            //register driver
            Class.forName("oracle.jdbc.driver.OracleDriver");
            //establish connection
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:SURAJ","scott","tiger");
            //create connection
            
                Statement st = con.createStatement();
            
            i = st.executeUpdate("insert into cmpnReg VALUES ('"+name+"','"+pass+"','"+email+"','"+adrs+"','"+cnt+"','"+uname+"')");
            //i = st.executeUpdate("insert into cmpnReg ('');
            //set input param
           /* ps.setString(1,name);
            ps.setString(2,pass);
            ps.setString(3,email);
            ps.setString(4,adrs);
            ps.setString(5,cnt);
            
            //execute query
            if(ps!=null){
                result = ps.executeUpdate();
            }*/
            if(i>0){
                
                
            
        %>
            <Script language="javascript">
                 alert("registered successfully");
                window.location.href="Welcome.jsp";
            </script>
        <%
            }
            else{
            
        %>
            <Script language="javascript">
                alert("registered not done");
                window.location.href="cmpnReg.jsp";
               
            </script>
        <%
            }

        %>
    </body>
</html>
