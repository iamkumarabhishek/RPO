<%@page import="java.sql.*;"%>
<%
    String fname=request.getParameter("fname");
    String lname=request.getParameter("lname");
    String email=request.getParameter("email");
    String mobile=request.getParameter("mobile");
    String dob=request.getParameter("dob");
    String gender=request.getParameter("gender");
    String uname=request.getParameter("uname");
    String password=request.getParameter("password");
    String adrs=request.getParameter("adrs");
    String city=request.getParameter("city");
    String state = request.getParameter("state");
    String nation=request.getParameter("nation");
    
    
    
    
    Class.forName("oracle.jdbc.driver.OracleDriver");
    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:SURAJ","scott","tiger");
        Statement st=con.createStatement();
    int i=st.executeUpdate("insert into studentReg(fname,lname,email,contact,dob,gender,uname,password,address,city,state,country)values('"+fname+"','"+lname+"','"+email+"','"+mobile+"','"+dob+"','"+gender+"','"+uname+"','"+password+"','"+adrs+"','"+city+"','"+state+"','"+nation+"')");
    if(i>0)
    {%>
    <script lanuage="javascript">
        alert("Registred Successfully");
        window.location.href="studentPannel.jsp";
    </script>
    <%
        
    }
    else
    {
       %>
           
        <script lanuage="javascript">
            alert( "UnSuccessfully");
            window.location.href="stu_register.jsp";
        </script>   
           
        <%

    }
    %>