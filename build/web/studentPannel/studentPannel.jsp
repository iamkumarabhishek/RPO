<%-- 
    Document   : studentPannel
    Created on : Apr 29, 2017, 2:02:36 PM
    Author     : ABHISHEK
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student Pannel</title>
        
        <meta charset="utf-8">
        <meta name="keywords" content="" />
        <meta name="description" content=""/>
        <!-- Favicon -->
        <link rel="shortcut icon" href="images/favicon.png">
        <!-- this styles only adds some repairs on idevices  -->
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
        <!-- Google fonts - witch you want to use - (rest you can just remove) -->
        <link rel='stylesheet' href='http://fonts.googleapis.com/css?family=Open+Sans:400,800,700italic,700,600italic,600,400italic,300italic,300|Roboto:100,300,400,500,700&amp;subset=latin,latin-ext' type='text/css' />

        <!-- ######### CSS STYLES ######### -->
        <link rel="stylesheet" href="../css/reset.css" type="text/css" />
        <link rel="stylesheet" href="../css/style.css" type="text/css" />
        <link rel="stylesheet" href="../css/font-awesome/css/font-awesome.min.css">
        <!-- responsive devices styles -->
        <link rel="stylesheet" media="screen" href="../css/responsive-leyouts.css" type="text/css" />
        <!-- style switcher -->
        <link rel = "stylesheet" media = "screen" href = "../js/style-switcher/color-switcher.css" />
        <!-- sticky menu -->
        <link rel="stylesheet" href="../js/sticky-menu/core.css">
        <!-- REVOLUTION SLIDER -->
        <link rel="stylesheet" type="text/css" href="../js/revolutionslider/css/fullwidth.css" media="screen" />
        <link rel="stylesheet" type="text/css" href="../js/revolutionslider/rs-plugin/css/settings.css" media="screen" />
        <!-- jquery jcarousel -->
        <link rel="stylesheet" type="text/css" href="../js/jcarousel/skin.css" />
        <link rel="stylesheet" type="text/css" href="../js/jcarousel/skin2.css" />
        <!-- faqs -->
        <link rel="stylesheet" href="../js/accordion/accordion.css" type="text/css" media="all">
        <!-- tabs css -->
        <link rel="stylesheet" type="text/css" href="../js/tabs/tabs.css" />
        <!-- testimonials -->
        <link rel="stylesheet" href="../js/testimonials/fadeeffect.css" type="text/css" media="all">
        <!-- fancyBox -->
        <link rel="stylesheet" type="text/css" href="../js/portfolio/source/jquery.fancybox.css" media="screen" />
        
        <!-- AfterHeading -->
        <link rel="stylesheet" type="text/css" href="stpanel.css" />
        <script src="../layout/scripts/job_add.js"></script>
        <link href="../layout/styles/add_job.css" rel="stylesheet" type="text/css" media="all">
    </head>
    <body>
        
            <!-- HEADER -->
            <header id="header">
                <!-- Top header bar -->
                <div id="topHeader">
                    <div class="wrapper">
                        <div class="top_contact_info">
                            <div class="container">
                                <ul class="tci_list_left">
                                    <li><a href="job_reg.jsp"><i class="icon-male"></i> Vacancy</a></li>
                                    <li>|</li>
                                    <li><a href="companypannel/Welcome.jsp"><i class="icon-suitcase"></i> Company Zone</a></li>
                                </ul>
                                <ul class="tci_list">
                                    <li class="empty"><i class="icon-phone-sign"></i> +91 7598433417</li>
                                    <li class="empty"><a href=""><i class="icon-envelope"></i> SquareFour.com</a></li>
                                </ul>
                            </div>
                        </div>
                        <!-- end top contact info -->
                    </div>
                </div>
                <div id="trueHeader">
                    <div class="wrapper">
                        <div class="container">
                            <!-- Logo -->
                            <div class="one_fourth"><a href="../index.jsp" id="log"></a></div>
                                <!-- Menu -->
                                <div class="three_fourth last">
                                    <nav id="access" class="access" role="navigation">
                                        <div id="menu" class="menu">
                                            <ul id="tiny">
                                                <li><a href="../index.jsp" >HOME</a></li>
                                                <li><a href="../companypannel/job_reg.jsp">Vacancy</a></li>
                                                <li><a href="../companypannel/Welcome.jsp" >Company Zone</a></li>
                                                <li><a href="#">Student Zone</a></li>
                                                <li><a href="../login.jsp" >Login </a>
                                                <li><a href="../contact.jsp" >Contact Us</a></li>
                                                <li><a href="../about.jsp" >About Us</a></li>
                                            </ul>
                                        </div>
                                    </nav>
                                    <!-- end nav menu -->
                                </div>
                        </div>
                    </div>
                </div>
            </header>
    
    
        <div id="headpane">
            <h1 style="float:left; margin-left: 50px;">Student Pannel</h1>
            <a href="frgtPass.jsp"><h4 style="float:right; margin-right:20px; color:red; background-color: white; border-radius: 5px;padding:5px;">Forgot Password</h4></a>
            <a href="stu_register.jsp"><h4 style="float:right; margin-right:20px; color:green; background-color: white; border-radius: 5px;padding:5px;">sign up</h4></a>   
        </div>
         
        <div id="heading">
            
            <div id="login_window">
                <div id="tablebar" style="float:right; background-color:#DADADA; margin-right:10px;">
                    <div id="del_tble">
                        <form name="stuLoginFrm" action="stuLogin.jsp" method="POST">
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;User Name : <input type="text" name="uname" value="" placeholder="enter name" size="20" />
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Password : <input type="text" name="pass" value="" placeholder="enter password" size="20" />
                            <input type="submit" value="Login" name="submit" />
                        </form>
                        
                    </div>
                </div>
            </div>
            <img src="st_image2.jpg" height="100%" width="100%">
        </div>
    </body>
</html>
