package org.apache.jsp.studentPannel;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;

public final class stuLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"company_dashboard.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\">\n");
      out.write("        <link href=\"DashboardTable.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                \n");
      out.write("                \n");

    String uname = request.getParameter("uname");
    String pass = request.getParameter("pass");
    String fname = null;
    String lname = null;
    String email = null;
    String contact = null;
    String dob = null;
    String gender = null;
    String username = null;
    String password = null;
    String adrs = null;
    String city = null;
    String state = null;
    String country = null;
    boolean flag=false;
   
    String LOGIN_QUERY = "select * from studentReg where uname = ? and password = ?";
                               
    Connection con = null;
    Statement st = null;
    Scanner sc = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    int result=0;
    
    try{
        //register Driver
            Class.forName("oracle.jdbc.driver.OracleDriver");
        //eshtablish connection
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:SURAJ", "scott","tiger");
                
        
        //create prepared statement
            if(con!=null)
                ps = con.prepareStatement(LOGIN_QUERY);
        //set values to query param
            if(ps!=null){
                ps.setString(1,uname);
                ps.setString(2,pass);
            }
         
        //execute query
            if(ps!=null){
                rs = ps.executeQuery();
            }
        //process the result
            if(rs!=null){
                if (rs.next()){
                    flag = true;
                    fname = rs.getString(1);
                    lname = rs.getString(2);
                    email = rs.getString(3);
                    contact = rs.getString(4);
                    dob = rs.getString(5);
                    gender = rs.getString(6);
                    username = rs.getString(7);
                    password = rs.getString(8);
                    adrs = rs.getString(9);
                    city = rs.getString(10);
                    state = rs.getString(11);
                    country = rs.getString(12);    
                }
            }
            if(flag==true){
    
      out.write("\n");
      out.write("                <script>\n");
      out.write("                    alert(\"successful\");\n");
      out.write("                </script>\n");
      out.write("                <div id = \"head\">\n");
      out.write("                    <h1 style=\"float:left\">Fly High Job Recruitment Solution</h1>\n");
      out.write("                    <h1 style=\"float:right;\"> welcome ");
      out.print( fname);
      out.write("&nbsp;");
      out.print( lname);
      out.write("</h1><br><br>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"headCon\">\n");
      out.write("                    \n");
      out.write("                    <div id=\"section_1\">\n");
      out.write("                        \n");
      out.write("                        <a href=\"../companypannel/job_reg.jsp\"> <h1>SHOW JOB HERE</h1></a>\n");
      out.write("                        <a href=\"updt_stu_prf.jsp\"> <h1>update your profile</h1></a>\n");
      out.write("                        <a href=\"dwn_stu_prf.jsp\"> <h1>Download Profile</h1></a>\n");
      out.write("                        <a href=\"del_stu_prf.jsp\"> <h1>Delete Profile</h1></a>\n");
      out.write("                        <a href=\"studentPannel.jsp\"> <h1>Logout</h1></a>\n");
      out.write("                        <a href=\"studentPannel.jsp\"> <h1>Company Home Page</h1></a>\n");
      out.write("                        <a href=\"../index.jsp\"> <h1>Website Home Page</h1></a>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div id=\"section_2\">\n");
      out.write("                       <h2 style=\"text-align: center; background-color: #4E658E; color:white; border-radius: 5px;\">Your Credential Are : </h2>\n");
      out.write("                        <table class=\"table-fill\">\n");
      out.write("                            <thead>\n");
      out.write("                                <tr>\n");
      out.write("                                <th class=\"text-left\">COLUMN</th>\n");
      out.write("                                <th class=\"text-left\">CREDENTIALS</th>\n");
      out.write("                                </tr>\n");
      out.write("                            </thead>\n");
      out.write("                                <tbody class=\"table-hover\">\n");
      out.write("                                    <tr>\n");
      out.write("                                    <td class=\"text-left\">First  name : </td>\n");
      out.write("                                    <td class=\"text-left\">");
      out.print( fname);
      out.write("</td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                    <td class=\"text-left\">Last  name : </td>\n");
      out.write("                                    <td class=\"text-left\">");
      out.print( lname);
      out.write("</td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                    <td class=\"text-left\">Email : </td>\n");
      out.write("                                    <td class=\"text-left\">");
      out.print( email);
      out.write("</td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                    <td class=\"text-left\">contact</td>\n");
      out.write("                                    <td class=\"text-left\">");
      out.print( contact);
      out.write("</td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                    <td class=\"text-left\">Date Of Birth</td>\n");
      out.write("                                    <td class=\"text-left\">");
      out.print( dob);
      out.write("</td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                    <td class=\"text-left\">Gender</td>\n");
      out.write("                                    <td class=\"text-left\">");
      out.print( gender);
      out.write("</td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                    <td class=\"text-left\">User Name</td>\n");
      out.write("                                    <td class=\"text-left\">");
      out.print( username);
      out.write("</td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                    <td class=\"text-left\">Password</td>\n");
      out.write("                                    <td class=\"text-left\">");
      out.print( password);
      out.write("</td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                    <td class=\"text-left\">Address</td>\n");
      out.write("                                    <td class=\"text-left\">");
      out.print( adrs);
      out.write("</td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                    <td class=\"text-left\">City</td>\n");
      out.write("                                    <td class=\"text-left\">");
      out.print( city);
      out.write("</td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                    <td class=\"text-left\">State</td>\n");
      out.write("                                    <td class=\"text-left\">");
      out.print( state);
      out.write("</td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                    <td class=\"text-left\">Country</td>\n");
      out.write("                                    <td class=\"text-left\">");
      out.print( country);
      out.write("</td>\n");
      out.write("                                    </tr>\n");
      out.write("                                </tbody>\n");
      out.write("                            </table>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("            \n");
      out.write("    ");

            }
            else{
                
      out.write("\n");
      out.write("                    <script>\n");
      out.write("                        alert(\"login UnSuccessful, sign up or try again\");\n");
      out.write("                        document.location.href=\"Welcome.jsp\";\n");
      out.write("                    </script>\n");
      out.write("                ");

            }
    }//try
    catch(Exception e){
        e.printStackTrace();
    }
    finally{
        try{
            if(rs!=null){
                rs.close();
            }
        }
        catch(SQLException se){
            se.printStackTrace();
        }
        
        try{
            if(ps!=null){
                ps.close();
            }
        }
        catch(SQLException se){
            se.printStackTrace();
        }
        try{
            if(con!=null){
                con.close();
            }
        }
        catch(SQLException se){
            se.printStackTrace();
        }
    }//finally

      out.write("\n");
      out.write("\n");
      out.write(" </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
