<%-- 
    Document   : add_job_save
    Created on : May 7, 2017, 3:33:03 PM
    Author     : ABHISHEK
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import= "java.sql.*;"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        String j_plat = request.getParameter("j_plat");
        String j_loc = request.getParameter("j_loc");
        String j_vac = request.getParameter("j_vac");
        String j_website = request.getParameter("j_website");
        String j_apply = request.getParameter("j_apply");
        String j_type = request.getParameter("j_type");
        String j_sal = request.getParameter("j_sal");
        String j_cnt = request.getParameter("j_cnt");
        int i=0;
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:SURAJ", "scott","tiger");
        Statement st = con.createStatement();
        String INSERT_QUERY = "insert into job_reg values('"+j_plat+"','"+j_loc+"','"+j_vac+"','"+j_website+"','"+j_apply+"','"+j_type+"','"+j_sal+"','"+j_cnt+"')";
       
            i = st.executeUpdate(INSERT_QUERY);
        
        if(i>0){
    %>
        <Script language="javascript">
            alert("job added successfully");
            window.location.href="job_reg.jsp";
        </script>
    <%
            }
    %>
    </body>
</html>
