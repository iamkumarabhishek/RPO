package org.apache.jsp.companypannel;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class job_005freg_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <script src=\"layout/scripts/job_add.js\"></script>\n");
      out.write("        <link href=\"layout/styles/add_job.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\">\n");
      out.write("        <link href=\"layout/styles/DashboardTable.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("            \n");
      out.write("            .post{\n");
      out.write("\t\t\tpadding: 10px;\n");
      out.write("\t\t\tborder: 1px solid #000;\n");
      out.write("\t\t\twidth: 50%;\n");
      out.write("\t\t\tmargin:auto;\n");
      out.write("\t\t}\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"headd\">\n");
      out.write("            <h1 style=\"float:left;margin-left:10px;\">FlyHigh Job Recruiting Services</h1>\n");
      out.write("            <h1 style=\"float:right;margin-right:10px;\"> Vacancy Page</h1>\n");
      out.write("        </div> \n");
      out.write("        <a href=\"../index.jsp\" style=\"text-decoration: none;\"><h2 style=\"color:white; padding:5px;background-color: black; border-radius: 5px;text-align: center;\">Home</h2></a>\n");
      out.write("        <h2 style=\"color:white; padding:5px;background-color: black; border-radius: 5px; text-align: center;\">Job Details Are Given Below </h2><br>\n");
      out.write("\n");
      out.write("    ");
 
        String jb_plat=null;
        String jb_loc = null;
        String jb_vac = null;
        String jb_website = null;
        String jb_apply = null;       
        String jb_type = null;       
        String jb_sal = null;       
        String jb_cnt = null;
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:SURAJ", "scott","tiger");
        Statement st = con.createStatement();
        String selectQuery = "select * from job_reg";
        ResultSet rs = st.executeQuery(selectQuery);

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
            
       
       
    
      out.write("\n");
      out.write("        \n");
      out.write("                \n");
      out.write("                <table class=\"table-fill\">\n");
      out.write("                            <thead>\n");
      out.write("                                <tr>\n");
      out.write("                                <th class=\"text-left\">COLUMN</th>\n");
      out.write("                                <th class=\"text-left\">CREDENTIALS</th>\n");
      out.write("                                </tr>\n");
      out.write("                            </thead>\n");
      out.write("                                <tbody class=\"table-hover\">\n");
      out.write("                                    <tr>\n");
      out.write("                                    <td class=\"text-left\">job platform : </td>\n");
      out.write("                                    <td class=\"text-left\">");
      out.print( jb_plat);
      out.write("</td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                    <td class=\"text-left\">job_location : </td>\n");
      out.write("                                    <td class=\"text-left\">");
      out.print( jb_loc);
      out.write("</td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                    <td class=\"text-left\">job vacancy : </td>\n");
      out.write("                                    <td class=\"text-left\">");
      out.print( jb_vac);
      out.write("</td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                    <td class=\"text-left\">company website : </td>\n");
      out.write("                                    <td class=\"text-left\">");
      out.print( jb_website);
      out.write("</td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                    <td class=\"text-left\">last date of apply : </td>\n");
      out.write("                                    <td class=\"text-left\">");
      out.print( jb_apply);
      out.write("</td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                    <td class=\"text-left\">job type : </td>\n");
      out.write("                                    <td class=\"text-left\">");
      out.print( jb_type);
      out.write("</td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                    <td class=\"text-left\">salary : </td>\n");
      out.write("                                    <td class=\"text-left\">");
      out.print( jb_sal);
      out.write("</td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                    <td class=\"text-left\">help-line : </td>\n");
      out.write("                                    <td class=\"text-left\">");
      out.print( jb_cnt);
      out.write("</td>\n");
      out.write("                                    </tr>\n");
      out.write("                                </tbody>\n");
      out.write("                            </table>\n");
      out.write("                        <br><hr><br>\n");
      out.write("                        ");

                            }
                        
      out.write("\n");
      out.write("    <a href=\"../studentPannel/applyVrf.jsp\" style=\"text-decoration: none; width:600px;margin-left:368px;float:left;text-align: center;\"><h2 style=\"color:white; padding:5px;background-color: #009999; border-radius: 5px;text-align: center;\">Apply Job</h2></a>\n");
      out.write("    \n");
      out.write("                \n");
      out.write("    ");
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
