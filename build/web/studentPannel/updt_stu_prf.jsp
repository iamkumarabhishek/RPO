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
                        <h1 style="float:left;margin-left:10px;">FlyHigh Job Recruiting Services</h1>
                        <h1 style="float:right;margin-right:10px;"> Update Profile Page</h1>
        </div>
        <hr>
        <br>
        <br>
        <a href="studentPannel.jsp"><h1 id="home">HOME</h1></a>
        <div id="tble">
            <form name="cntForm" action="update_stu.jsp" method="POST">
                <table  cellpadding="2">

                    <tbody style="background-color:#00abde;">
                        <tr>
                            <td>current User Name : </td>
                            <td><input type="text" name="old_uname" value="" size="20" placeholder="enter current user name" /></td>
                        </tr>
                        <tr>
                            <td>current Password : </td>
                            <td><input type="text" name="old_pass" value="" size="20" placeholder="enter current password" /></td>
                        </tr>
                        <tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr>
                        <tr>
                            <td>Student First Name : </td>
                            <td><input type="text" name="fname" value="" size="20" placeholder="enter student first name" /></td>
                        </tr>
                        <tr>
                            <td>Student Last Name : </td>
                            <td><input type="text" name="lname" value="" size="20" placeholder="enter student last name" /></td>
                        </tr>
                        <tr>
                            <td>email : </td>
                            <td><input type="text" name="email" value="" size="30" placeholder="enter email address" /></td>
                        </tr>
                        <tr>
                            <td>contact : </td>
                            <td><input type="text" name="contact" value="" size="15" placeholder="enter contact no" /></td>
                        </tr>
                        <tr>
                            <td>Date Of Birth : </td>
                            <td><input type="text" name="dob" value="" size="15" placeholder="DD-MON-YYYY"/></td>
                        </tr>
                        <tr>
                            <td>Gender : </td>
                            <td><input type="text" name="gender" value="" size="15" placeholder="male/female/other"/></td>
                        </tr>
                        <tr>
                            <td>User Name : </td>
                            <td><input type="text" name="uname" value="" size="20" placeholder="enter user name"/></td>
                        </tr>
                        <tr>
                            <td>Password : </td>
                            <td><input type="text" name="password" value="" size="20" placeholder="enter password"/></td>
                        </tr>
                        <tr>
                            <td>Address : </td>
                            <td><input type="text" name="address" value="" size="50" placeholder="enter address"/></td>
                        </tr>
                        <tr>
                            <td>City : </td>
                            <td><input type="text" name="city" value="" size="20" placeholder="enter city"/></td>
                        </tr>
                        <tr>
                            <td>State : </td>
                            <td><input type="text" name="state" value="" size="20" placeholder="enter state name" /></td>
                        </tr>
                        <tr>
                            <td>Country : </td>
                            <td><input type="text" name="country" value="" size="20" placeholder="enter country name"/></td>
                        </tr>
                    </tbody>
                </table>
                <input type="submit" value="Update" name="submit" />
            </form>
        </div>
        
       
    </body>
</html>
