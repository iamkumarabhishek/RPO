<%-- 
    Document   : updt_cmp_prf
    Created on : Apr 24, 2017, 12:17:32 PM
    Author     : ABHISHEK
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="job_add.js"></script>
        <link href="add_job.css" rel="stylesheet" type="text/css" media="all">
        
        <title>JSP Page</title>
    </head>
    <body>
        <div id="headd">
            <h1 style="float:left;margin-left:10px;">Auto_Increment test</h1>
            <h1 style="float:right;margin-right:10px;"> Student Registration page</h1>
        </div>
        <hr>
        <br>
        <br>
        
        <div id=d_tble>
            <form name="deleteFrm" action="autoIncTest.jsp" method="POST">
                <table border="1" cellpadding="2">

                    <tbody style="background-color:#00abde;">
                        <tr>
                            <td>First Name : </td>
                            <td><input type="text" name="fname" value="" size="20" /></td>
                        </tr>
                        <tr>
                            <td>User Name : </td>
                            <td><input type="text" name="uname" value="" size="20" /></td>
                        </tr>
                        <tr>
                            <td>Password : </td>
                            <td><input type="text" name="pass" value="" size="20" /></td>
                        </tr>
                    </tbody>
                </table>
                <input type="submit" value="submit" name="submit" />
            </form>
        </div>
    </body>
</html>