<%-- 
    Document   : forgot
    Created on : Apr 21, 2017, 10:45:00 AM
    Author     : ABHISHEK
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*;"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="job_add.js"></script>
        <link href="add_job.css" rel="stylesheet" type="text/css" media="all">
        <title>Forgot Password</title>
        
    </head>
    <body>
        <div id="headd">
            <h1 style="float:left;margin-left:10px;">FlyHigh Job Recruiting Services</h1>
            <h1 style="float:right;margin-right:10px;"> Password Recovery Page</h1>
        </div>
        <hr>
        <br>
        <br>
        
        
        <div id=d_tble>
            <form name="frgtForm" action="frgtPwd.jsp">
                <table border="1">
                    <tbody style="background-color:#00abde; border:1px solid black;border-radius: 5px;">
                        <tr>
                            <td>First name: </td>
                            <td><input type="text" name="fname" value="" size="20" /></td>
                        </tr>
                        <tr>
                            <td>Last Name</td>
                            <td><input type="text" name="lname" value="" size="20" /></td>
                        </tr>
                        <tr>
                            <td>User Name :</td>
                            <td><input type="text" name="uname" value="" size="20" /></td>
                        </tr>
                    </tbody>
                </table>
                <input type="submit" value="Submit" name="submit" />
            </form>
        </div>
    </body>
</html>
