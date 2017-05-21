
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
        <link href="company_dashboard.css" rel="stylesheet" type="text/css" media="all">
        <link href="DashboardTable.css" rel="stylesheet" type="text/css" media="all">
        <title>JSP Page</title>
        
    </head>
    <body>
        



                
                
<%
    String uname = request.getParameter("uname");
    String pass = request.getParameter("pass");
    String fname = null;
    String lname = null;
    String email = null;
    String contact = null;
    String dob = null;
    String gender = null;
    String username = null;
    String password = null;
    String adrs = null;
    String city = null;
    String state = null;
    String country = null;
    boolean flag=false;
   
    String LOGIN_QUERY = "select * from studentReg where uname = ? and password = ?";
                               
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
                ps.setString(1,uname);
                ps.setString(2,pass);
            }
         
        //execute query
            if(ps!=null){
                rs = ps.executeQuery();
            }
        //process the result
            if(rs!=null){
                if (rs.next()){
                    flag = true;
                    fname = rs.getString(1);
                    lname = rs.getString(2);
                    email = rs.getString(3);
                    contact = rs.getString(4);
                    dob = rs.getString(5);
                    gender = rs.getString(6);
                    username = rs.getString(7);
                    password = rs.getString(8);
                    adrs = rs.getString(9);
                    city = rs.getString(10);
                    state = rs.getString(11);
                    country = rs.getString(12);    
                }
            }
            if(flag==true){
    %>
                <script>
                    alert("successful");
                </script>
                <div id = "head">
                    <h1 style="float:left; margin-left:5px;">Fly High Job Recruitment Solution</h1>
                    <h1 style="float:right; margin-right:10px; text-decoration: underline;"> Welcome, <%= fname%>&nbsp;<%= lname%></h1><br><br>
                </div>
                <div id="headCon">
                    
                    <div id="section_1">
                        
                        <a href="../companypannel/job_reg.jsp"> <h1>SHOW JOB HERE</h1></a>
                        <a href="updt_stu_prf.jsp"> <h1>update your profile</h1></a>
                        <a href="dwn_stu_prf.jsp"> <h1>Download Profile</h1></a>
                        <a href="del_stu_prf.jsp"> <h1>Delete Profile</h1></a>
                        <a href="studentPannel.jsp"> <h1>Logout</h1></a>
                        <a href="studentPannel.jsp"> <h1>Student Home Page</h1></a>
                        <a href="../index.jsp"> <h1>Website Home Page</h1></a>
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
                                    <td class="text-left">First  name : </td>
                                    <td class="text-left"><%= fname%></td>
                                    </tr>
                                    <tr>
                                    <td class="text-left">Last  name : </td>
                                    <td class="text-left"><%= lname%></td>
                                    </tr>
                                    <tr>
                                    <td class="text-left">Email : </td>
                                    <td class="text-left"><%= email%></td>
                                    </tr>
                                    <tr>
                                    <td class="text-left">contact</td>
                                    <td class="text-left"><%= contact%></td>
                                    </tr>
                                    <tr>
                                    <td class="text-left">Date Of Birth</td>
                                    <td class="text-left"><%= dob%></td>
                                    </tr>
                                    <tr>
                                    <td class="text-left">Gender</td>
                                    <td class="text-left"><%= gender%></td>
                                    </tr>
                                    <tr>
                                    <td class="text-left">User Name</td>
                                    <td class="text-left"><%= username%></td>
                                    </tr>
                                    <tr>
                                    <td class="text-left">Password</td>
                                    <td class="text-left"><%= password%></td>
                                    </tr>
                                    <tr>
                                    <td class="text-left">Address</td>
                                    <td class="text-left"><%= adrs%></td>
                                    </tr>
                                    <tr>
                                    <td class="text-left">City</td>
                                    <td class="text-left"><%= city%></td>
                                    </tr>
                                    <tr>
                                    <td class="text-left">State</td>
                                    <td class="text-left"><%= state%></td>
                                    </tr>
                                    <tr>
                                    <td class="text-left">Country</td>
                                    <td class="text-left"><%= country%></td>
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
                        document.location.href="studentPannel.jsp";
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