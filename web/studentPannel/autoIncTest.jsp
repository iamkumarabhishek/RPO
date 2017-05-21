<%-- 
    Document   : del_acn
    Created on : Apr 28, 2017, 4:02:28 PM
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
             int i = 0;
            String fname = request.getParameter("fname");
            String uname = request.getParameter("uname");
            String pass = request.getParameter("pass");
            int id=0;
        String frstNm = null;
        String usrNm = null;
        String password = null;
            
            
            String INSERT_QUERY = "insert into candidate(FirstName, UserName, password) values(FirstName = '"+fname+"', UserName = '"+uname+"',  password='"+pass+"')";
            //String UPDATE_QUERY = "update cmpnReg set c_name = 'surajSoft',password='verani',email='suraj@suraj.com',adrs ='patna',contact='90909090',u_name='tbrej' where u_name ='tbrj' and password ='erani'";
           String selectQuery = "select * from candidate";
        
            
                
            //register Driver
            Class.forName("com.mysql.jdbc.Driver");
            //Class.forName("oracle.jdbc.driver.OracleDriver");
            //establish connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","pass");
            //Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:SURAJ","scott","tiger");
            //create connection
            
                Statement st = con.createStatement();
                                //update test3 set name = 'abhishek', pass = 'varsi' where name = 'abhishek' and pass='kumar';
            int  result = st.executeUpdate(INSERT_QUERY);
            ResultSet rs = st.executeQuery(selectQuery);
            if(result >0){
                
        %>
        <script language ="javascript">
            alert('register applied successfully');
            
        </script>
        <%
           
        }
else if(i==0){
        %>
        <script language ="javascript">
            alert('invalid credential, check again');
            window.location.href="autoInc.jsp";
        </script>
        <%
            }
        %>
        
        <% 
        

        while(rs.next())
        {
            id = rs.getInt(1);
            frstNm = rs.getString(2);
            usrNm = rs.getString(3);
            password = rs.getString(4);
            
       
       
        %>
            <table class="table-fill">
                            <thead>
                                <tr>
                                <th class="text-left">COLUMN</th>
                                <th class="text-left">CREDENTIALS</th>
                                </tr>
                            </thead>
                                <tbody class="table-hover">
                                    <tr>
                                    <td class="text-left">ID : </td>
                                    <td class="text-left"><%= id%></td>
                                    </tr>
                                    <tr>
                                    <td class="text-left">FirstName : </td>
                                    <td class="text-left"><%= frstNm%></td>
                                    </tr>
                                    <tr>
                                    <td class="text-left">UserName : </td>
                                    <td class="text-left"><%= usrNm%></td>
                                    </tr>
                                    <tr>
                                    <td class="text-left">password : </td>
                                    <td class="text-left"><%= password%></td>
                                    </tr>
                                    
                                </tbody>
                            </table>
                        <br><hr><br>
                        <%
                            }
                        
                    
            %>
    </body>
</html>
