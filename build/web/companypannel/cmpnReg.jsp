<%-- 
    Document   : cmpnReg
    Created on : Apr 19, 2017, 3:30:41 PM
    Author     : ABHISHEK
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Company Registration</title>
    </head>
    <body>
        <h1 style="text-align:center; color:red">Registration Form</h1>
        <form name="myForm" action="cmpnRgs.jsp" method="POST">
            <table border="1" align="center">
                <tbody>
                    <tr>
                        <td>Company Name : </td>
                        <td><input type="text" name="c_name" value="" size="50" /></td>
                    </tr>
                    <tr>
                        <td>Password</td>
                        <td><input type="password" name="pwd" value="" size="20" /></td>
                    </tr>
                    <tr>
                        <td>email</td>
                        <td><input type="text" name="email" value="" size="50" /></td>
                    </tr>
                    <tr>
                        <td>Address</td>
                        <td><input type="text" name="adrs" value="" size="30" /></td>
                    </tr>
                    <tr>
                        <td>contact</td>
                        <td><input type="text" name="cnt" value="" size="20" /></td>
                    </tr>
                    <tr>
                        <td>user name</td>
                        <td><input type="text" name="uname" value="" size="20" /></td>
                    </tr>
                </tbody>
            </table>
            <center>
                <input type="submit" value="Submit" name="submit" />
                <input type="reset" value="Clear" name="reset" />
            </center>
        </form>
    </body>
</html>
