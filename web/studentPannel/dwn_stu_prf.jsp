<%-- 
    Document   : dwn_stu_vrf
    Created on : Apr 24, 2017, 1:57:32 PM
    Author     : ABHISHEK
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="job_add.js"></script>
        <link href="add_job.css" rel="stylesheet" type="text/css" media="all">
        
        <title>JSP Page</title>
    </head>
    <body>
        <div id="headd">
            <h1 style="float:left;margin-left:10px;">FlyHigh Job Recruiting Services</h1>
            <h1 style="float:right;margin-right:10px;"> DownLoad Profile Page</h1>
        </div>
        <hr>
        <br>
        <br>
        <a href="studentPannel.jsp"><h1 id="home">HOME</h1></a>
        <div id="d_tble">
            <form action="../dwnldStuPrf" method="GET">
                <table border="1" cellpadding="2">

                    <tbody style="background-color:#00abde; border:1px solid black;border-radius: 5px;">
                        <tr>
                            <td>current User Name : </td>
                            <td><input type="text" name="uname" value="" size="20" /></td>
                        </tr>
                        <tr>
                            <td>current Password : </td>
                            <td><input type="text" name="pass" value="" size="20" /></td>
                        </tr>
                    </tbody>
                </table>
                <input type="submit" value="Download" name="submit" />
            </form>
        </div>
    </body>
</html>
