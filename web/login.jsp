<%-- 
    Document   : updt_cmp_prf
    Created on : Apr 24, 2017, 12:17:32 PM
    Author     : ABHISHEK
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="studentPannel/job_add.js"></script>
        <link href="studentPannel/add_job.css" rel="stylesheet" type="text/css" media="all">
        <style>
            #box2{
                
                height:150px;
                width:98.5%;
                
                border-radius: 5px;
                margin-top: 100px;
                
            }
            
            #box4 a{
                text-decoration: none;
            }
            #box4 h2{
                
                padding:10px;
                text-align: center;
                border:2px solid #FF7575;
                color:#620020;
                background-color: #c6e3ff;
                
            }
        </style>
        <title>JSP Page</title>
    </head>
    <body style="background-image: url(studentPannel/loginImage1.jpg);">
        <div id="headd">
            <h1 style="float:left;margin-left:10px;">FLyHigh Job Recruiting Services</h1>
            <h1 style="float:right;margin-right:10px;"> Login Profile Page</h1>
        </div>
        <hr>
        <br>
        <br>
        <a href="studentPannel/studentPannel.jsp"><h1 id="home">HOME</h1></a>
        
            <div id="box2">
                <div id="box4" style="float:left;margin-left: 400px;">
                    <a href="studentPannel/studentPannel.jsp"><h2 style="border-radius: 15px 15px 0px 0px;">Login As Student</h2></a>
                    <a href="studentPannel/stu_register.jsp"><h2 style="border-radius: 0px 0px 15px 15px;">Need An Account?</h2></a>
                </div>
                <div id="box4" style="float:right;margin-right: 400px;">
                    <a href="companypannel/Welcome.jsp"><h2 style="border-radius: 15px 15px 0px 0px;">Login As Company</h2></a>
                    <a href="companypannel/cmpnReg.jsp"><h2 style="border-radius: 0px 0px 15px 15px;">Need An Account?</h2></a>
                </div>
            </div>
            <div id="box3" style="width:300px;margin-left: 500px; ">
                <div id="box4">
                    <a href="#"><h2 style="background-color: #c6e3ff;border-radius: 15px 15px 15px 15px;">Login As Admin</h2></a>
                </div>
            </div>
     </body>
</html>