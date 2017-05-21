<%-- 
    Document   : updt_cmp_prf
    Created on : Apr 24, 2017, 12:17:32 PM
    Author     : ABHISHEK
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="layout/scripts/job_add.js"></script>
        <link href="layout/styles/add_job.css" rel="stylesheet" type="text/css" media="all">
        
        <title>JSP Page</title>
    </head>
    <body>
        <div id="headd">
                        <h1 style="float:left;margin-left:10px;">FlyHigh Job Recruiting Services</h1>
                        <h1 style="float:right;margin-right:10px;"> Add Job Page</h1>
        </div>
        <hr>
        <br>
        <br>
        <a href="Welcome.jsp"><h1 id="home">HOME</h1></a>
        <div id="tble">
            <form name="cntForm" action="update_cmp.jsp" method="POST">
                <table  cellpadding="2">

                    <tbody style="background-color:#00abde;">
                        <tr>
                            <td>current User Name : </td>
                            <td><input type="text" name="old_uname" value="" size="50" /></td>
                        </tr>
                        <tr>
                            <td>current Password : </td>
                            <td><input type="text" name="old_pass" value="" size="50" /></td>
                        </tr>
                        <tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr>
                        <tr>
                            <td>Company Name : </td>
                            <td><input type="text" name="c_name" value="" size="50" /></td>
                        </tr>
                        <tr>
                            <td>User Name : </td>
                            <td><input type="text" name="u_name" value="" size="20" /></td>
                        </tr>
                        <tr>
                            <td>Password : </td>
                            <td><input type="text" name="pass" value="" size="20" /></td>
                        </tr>
                        <tr>
                            <td>email : </td>
                            <td><input type="text" name="email" value="" size="50" /></td>
                        </tr>
                        <tr>
                            <td>Address : </td>
                            <td><input type="text" name="adr" value="" size="50" /></td>
                        </tr>
                        <tr>
                            <td>contact : </td>
                            <td><input type="text" name="adr" value="" size="15" /></td>
                        </tr>
                    </tbody>
                </table>
                <input type="submit" value="Update" name="submit" />
            </form>
        </div>
        
       
    </body>
</html>
