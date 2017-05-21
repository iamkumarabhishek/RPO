

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Job Adding Page</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="layout/scripts/job_add.js"></script>
        <link href="layout/styles/add_job.css" rel="stylesheet" type="text/css" media="all">
        
        
    </head>
    <body>
                    <div id="headd">
                        <h1 style="float:left;margin-left:10px;">FlyHigh Job Recruiting Services</h1>
                        <h1 style="float:right;margin-right:10px;"> Add Job Page</h1>
                    </div><hr><br><br>
                    <a href="Welcome.jsp"><h1 id="home">HOME</h1></a>
                    <center>
                            <div id="btn-box">    
                                <form method="post" action="add_job_save.jsp">
                                    <br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;platform : <input type="text" name="j_plat" placeholder="enter job platform" ><br><hr>
                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;location : <input type="text" name="j_loc" placeholder="enter job location"><br><hr>
                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;vacancy : <input type="text" name="j_vac" placeholder="no of vaccant post"><br><hr>
                                    company website : <input type="text" name="j_website" placeholder="enter website"><br><hr>
                                    last date for apply : <input type="text" name="j_apply" placeholder="last date for apply form"><br><hr>
                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;job type : <input type="text" name="j_type" placeholder="internship/full time employee"><br><hr>
                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;salary : <input type="text" name="j_sal" placeholder="ammount in rupees"><br><hr>
                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;contact : <input type="text" name="j_cnt" placeholder="enter 10 digit mob no"><br><hr>
                                    <input type="submit" name="submit" value="Submit">
                                </form>
                            </div>
                        </center>
    </body>
</html>