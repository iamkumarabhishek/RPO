
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.util.Scanner"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="layout/styles/company_dashboard.css" rel="stylesheet" type="text/css" media="all">
        <link href="layout/styles/DashboardTable.css" rel="stylesheet" type="text/css" media="all">
        <title>JSP Page</title>
        
    </head>
    <body>
        



                
                
<%
    String name = request.getParameter("name");
    String pass = request.getParameter("pass");
    String cp_name = null;
    String cp_pass = null;
    String cp_email = null;
    String cp_adrs = null;
    String cnt = null;
    String user = null;
    boolean flag=false;
   
    String LOGIN_QUERY = "select * from cmpnReg where c_name = ? and password = ?";
                               
    Connection con = null;
    Statement st = null;
    Scanner sc = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    int result=0;
    
    try{
        //register Driver
            Class.forName("oracle.jdbc.driver.OracleDriver");
        //eshtablish connection
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:SURAJ", "scott","tiger");
                
        
        //create prepared statement
            if(con!=null)
                ps = con.prepareStatement(LOGIN_QUERY);
        //set values to query param
            if(ps!=null){
                ps.setString(1,name);
                ps.setString(2,pass);
            }
         System.out.println("connected");
        //execute query
            if(ps!=null){
                rs = ps.executeQuery();
            }
        //process the result
            if(rs!=null){
                if (rs.next()){
                    flag = true;
                    cp_name = rs.getString(1);
                    cp_pass = rs.getString(2);
                    cp_email = rs.getString(3);
                    cp_adrs = rs.getString(4);
                    cnt = rs.getString(5);
                    user = rs.getString(6);
                    
                    
                }
            }
            if(flag==true){
    %>
                <script>
                    alert("successful");
                </script>
                <div id = "head">
                    <h1 style="float:left">Fly High Job Recruitment Solution</h1>
                    <h1 style="float:right;"> welcome <%= cp_name%></h1><br><br>
                </div>
                <div id="headCon">
                    
                    <div id="section_1">
                        
                        <a href="add_job.jsp"> <h1>ADD JOB HERE</h1></a>
                        <a href="updt_cmp_prf.jsp"> <h1>update your profile</h1></a>
                        <a href="dwn_prf_vrf.jsp"> <h1>Download Profile</h1></a>
                        <a href="del_prf.jsp"> <h1>Delete Profile</h1></a>
                        <a href="Welcome.jsp"> <h1>Logout</h1></a>
                        <a href="Welcome.jsp"> <h1>Company Home Page</h1></a>
                        <a href="index.jsp"> <h1>Website Home Page</h1></a>
                    </div>
                    
                    <div id="section_2">
                       <h2 style="text-align: center; background-color: #4E658E; color:white; border-radius: 5px;">Your Credential Are : </h2>
                        <table class="table-fill">
                            <thead>
                                <tr>
                                <th class="text-left">COLUMN</th>
                                <th class="text-left">CREDENTIALS</th>
                                </tr>
                            </thead>
                                <tbody class="table-hover">
                                    <tr>
                                    <td class="text-left">Company  name : </td>
                                    <td class="text-left"><%= cp_name%></td>
                                    </tr>
                                    <tr>
                                    <td class="text-left">User  name : </td>
                                    <td class="text-left"><%= user%></td>
                                    </tr>
                                    <tr>
                                    <td class="text-left">password : </td>
                                    <td class="text-left"><%= cp_pass%></td>
                                    </tr>
                                    <tr>
                                    <td class="text-left">address</td>
                                    <td class="text-left"><%= cp_adrs%></td>
                                    </tr>
                                    <tr>
                                    <td class="text-left">contact</td>
                                    <td class="text-left"><%= cnt%></td>
                                    </tr>
                                </tbody>
                            </table>
                    </div>
                </div>
                
            
    <%
            }
            else{
                %>
                    <script>
                        alert("login UnSuccessful, sign up or try again");
                        document.location.href="Welcome.jsp";
                    </script>
                <%
            }
    }//try
    catch(Exception e){
        e.printStackTrace();
    }
    finally{
        try{
            if(rs!=null){
                rs.close();
            }
        }
        catch(SQLException se){
            se.printStackTrace();
        }
        
        try{
            if(ps!=null){
                ps.close();
            }
        }
        catch(SQLException se){
            se.printStackTrace();
        }
        try{
            if(con!=null){
                con.close();
            }
        }
        catch(SQLException se){
            se.printStackTrace();
        }
    }//finally
%>

 </body>
</html>