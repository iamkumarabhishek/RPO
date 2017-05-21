<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>



<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="layout/scripts/job_add.js"></script>
        <link href="layout/styles/add_job.css" rel="stylesheet" type="text/css" media="all">
        <link href="layout/styles/DashboardTable.css" rel="stylesheet" type="text/css" media="all">
        <title>JSP Page</title>
        <style>
            
            .post{
			padding: 10px;
			border: 1px solid #000;
			width: 50%;
			margin:auto;
		}
        </style>
    </head>
    <body>
        
<%
    //Connection con  =null;
    //Statement st = null;
    
    
    String j_plat = request.getParameter("j_plat");
    String j_loc = request.getParameter("j_loc");
    String j_vac = request.getParameter("j_vac");
    String j_website = request.getParameter("j_website");
    String j_apply = request.getParameter("j_apply");
    String j_type = request.getParameter("j_type");
    String j_sal = request.getParameter("j_sal");
    String j_cnt = request.getParameter("j_cnt");
    String jb_plat="java";
    String jb_loc = "chennai";
    String jb_vac = "6";
    String jb_website = "MavenSoft";
    String jb_apply = "22/06/2017";       
    String jb_type = "full time employee";       
    String jb_sal = "20,500";       
    String jb_cnt = "9865742541"; 
    
    
    Class.forName("oracle.jdbc.driver.OracleDriver");
    Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:SURAJ", "scott","tiger");
    Statement st = con.createStatement();
    String INSERT_QUERY = "insert into job_reg values('"+j_plat+"','"+j_loc+"','"+j_vac+"','"+j_website+"','"+j_apply+"','"+j_type+"','"+j_sal+"','"+j_cnt+"')";
    int i = st.executeUpdate(INSERT_QUERY);
    String SELECT_QUERY = "select * from job_reg where j_website = '"+j_website+"' and j_apply ='"+j_apply+"' and j_vac = '"+j_vac+"'";
    ResultSet rs = st.executeQuery(SELECT_QUERY);
    if(i>0 && rs!=null){
%>
    

        <Script language="javascript">
            alert("job added successfully");
        </script>
    <% } 
        while(rs.next())
        {
            jb_plat = rs.getString(1);
            jb_loc = rs.getString(2);
            jb_vac = rs.getString(3);
            jb_website = rs.getString(4);
            jb_apply = rs.getString(5);
            jb_type = rs.getString(6);
            jb_sal = rs.getString(7);
            jb_cnt = rs.getString(8);
            
       }
       
    %>
        <div id="headd">
            <h1 style="float:left;margin-left:10px;">FlyHigh Job Recruiting Services</h1>
            <h1 style="float:right;margin-right:10px;"> Vacancy Page</h1>
        </div> 
        <a href="../index.jsp" style="text-decoration: none;"><h2 style="color:white; padding:5px;background-color: black; border-radius: 5px;text-align: center;">Home</h2></a>
        <h2 style="color:white; padding:5px;background-color: black; border-radius: 5px; text-align: center;">Job Details Are Given Below </h2><br>
                
                <table class="table-fill">
                            <thead>
                                <tr>
                                <th class="text-left">COLUMN</th>
                                <th class="text-left">CREDENTIALS</th>
                                </tr>
                            </thead>
                                <tbody class="table-hover">
                                    <tr>
                                    <td class="text-left">job platform : </td>
                                    <td class="text-left"><%= jb_plat%></td>
                                    </tr>
                                    <tr>
                                    <td class="text-left">job_location : </td>
                                    <td class="text-left"><%= jb_loc%></td>
                                    </tr>
                                    <tr>
                                    <td class="text-left">job vacancy : </td>
                                    <td class="text-left"><%= jb_vac%></td>
                                    </tr>
                                    <tr>
                                    <td class="text-left">company website : </td>
                                    <td class="text-left"><%= jb_website%></td>
                                    </tr>
                                    <tr>
                                    <td class="text-left">last date of apply : </td>
                                    <td class="text-left"><%= jb_apply%></td>
                                    </tr>
                                    <tr>
                                    <td class="text-left">job type : </td>
                                    <td class="text-left"><%= jb_type%></td>
                                    </tr>
                                    <tr>
                                    <td class="text-left">salary : </td>
                                    <td class="text-left"><%= jb_sal%></td>
                                    </tr>
                                    <tr>
                                    <td class="text-left">helpline : </td>
                                    <td class="text-left"><%= jb_cnt%></td>
                                    </tr>
                                </tbody>
                            </table>
    <a href="../studentPannel/applyVrf.jsp" style="text-decoration: none; width:600px;margin-left:368px;float:left;text-align: center;"><h2 style="color:white; padding:5px;background-color: #009999; border-radius: 5px;text-align: center;">Apply Job</h2></a>
    
                
    