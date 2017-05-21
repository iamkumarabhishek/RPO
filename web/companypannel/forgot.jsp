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
        <script src="layout/scripts/job_add.js"></script>
        <link href="layout/styles/add_job.css" rel="stylesheet" type="text/css" media="all">
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
        
        <div id=del_tble>
            <form name="frgtForm" action="frgt.jsp">
                <table border="1">
                    <tbody style="background-color:#00abde; border:1px solid black;border-radius: 5px;">
                        <tr>
                            <td>Company name: </td>
                            <td><input type="text" name="c_name" value="" size="20" /></td>
                        </tr>
                        <tr>
                            <td>User Name</td>
                            <td><input type="text" name="u_name" value="" size="20" /></td>
                        </tr>
                        <tr>
                            <td>contact :</td>
                            <td><input type="text" name="cnt" value="" size="20" /></td>
                        </tr>
                    </tbody>
                </table>
                <input type="submit" value="Submit" name="submit" />
            </form>
        </div>
    </body>
</html>
