package org.apache.jsp.companypannel;

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

public final class cmpnLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link href=\"layout/styles/company_dashboard.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\">\n");
      out.write("        <link href=\"layout/styles/DashboardTable.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\">\n");
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

    String name = request.getParameter("name");
    String pass = request.getParameter("pass");
    String cp_name = null;
    String cp_pass = null;
    String cp_email = null;
    String cp_adrs = null;
    String cnt = null;
    String user = null;
    boolean flag=false;
   
    String LOGIN_QUERY = "select * from cmpnReg where c_name = ? and password = ?";
                               
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
                ps.setString(1,name);
                ps.setString(2,pass);
            }
         System.out.println("connected");
        //execute query
            if(ps!=null){
                rs = ps.executeQuery();
            }
        //process the result
            if(rs!=null){
                if (rs.next()){
                    flag = true;
                    cp_name = rs.getString(1);
                    cp_pass = rs.getString(2);
                    cp_email = rs.getString(3);
                    cp_adrs = rs.getString(4);
                    cnt = rs.getString(5);
                    user = rs.getString(6);
                    
                    
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
      out.print( cp_name);
      out.write("</h1><br><br>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"headCon\">\n");
      out.write("                    \n");
      out.write("                    <div id=\"section_1\">\n");
      out.write("                        \n");
      out.write("                        <a href=\"add_job.jsp\"> <h1>ADD JOB HERE</h1></a>\n");
      out.write("                        <a href=\"updt_cmp_prf.jsp\"> <h1>update your profile</h1></a>\n");
      out.write("                        <a href=\"dwn_prf_vrf.jsp\"> <h1>Download Profile</h1></a>\n");
      out.write("                        <a href=\"del_prf.jsp\"> <h1>Delete Profile</h1></a>\n");
      out.write("                        <a href=\"Welcome.jsp\"> <h1>Logout</h1></a>\n");
      out.write("                        <a href=\"Welcome.jsp\"> <h1>Company Home Page</h1></a>\n");
      out.write("                        <a href=\"index.jsp\"> <h1>Website Home Page</h1></a>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div id=\"section_2\">\n");
      out.write("                        <h1>your credential are : </h1><br>\n");
      out.write("                        <div class=\"table-title\">\n");
      out.write("                            <h3>Data Table</h3>\n");
      out.write("                            </div>\n");
      out.write("                                <table class=\"table-fill\">\n");
      out.write("                            <thead>\n");
      out.write("                                <tr>\n");
      out.write("                                <th class=\"text-left\">COLUMN</th>\n");
      out.write("                                <th class=\"text-left\">CREDENTIALS</th>\n");
      out.write("                                </tr>\n");
      out.write("                            </thead>\n");
      out.write("                                <tbody class=\"table-hover\">\n");
      out.write("                                    <tr>\n");
      out.write("                                    <td class=\"text-left\">Company  name : </td>\n");
      out.write("                                    <td class=\"text-left\">");
      out.print( cp_name);
      out.write("</td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                    <td class=\"text-left\">User  name : </td>\n");
      out.write("                                    <td class=\"text-left\">");
      out.print( user);
      out.write("</td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                    <td class=\"text-left\">password : </td>\n");
      out.write("                                    <td class=\"text-left\">");
      out.print( cp_pass);
      out.write("</td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                    <td class=\"text-left\">address</td>\n");
      out.write("                                    <td class=\"text-left\">");
      out.print( cp_adrs);
      out.write("</td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                    <td class=\"text-left\">contact</td>\n");
      out.write("                                    <td class=\"text-left\">");
      out.print( cnt);
      out.write("</td>\n");
      out.write("                                    </tr>\n");
      out.write("        \n");
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
