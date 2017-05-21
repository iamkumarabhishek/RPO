package org.apache.jsp.testFinal;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class add_005fjob_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Job Adding Page</title>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <script src=\"job_add.js\"></script>\n");
      out.write("        <link href=\"add_job.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\">\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"headd\">\n");
      out.write("            <h1 style=\"float:left;margin-left:10px;\">FlyHigh Job Recruiting Services</h1>\n");
      out.write("            <h1 style=\"float:right;margin-right:10px;\"> Add Job Page</h1>\n");
      out.write("        </div><hr><br><br>\n");
      out.write("        <a href=\"Welcome.jsp\"><h1 id=\"home\">HOME</h1></a>\n");
      out.write("            <center>\n");
      out.write("                <div id=\"btn-box\">    \n");
      out.write("                    <form method=\"POST\" action =\" add_job_save.jsp\" name=\"cntForm\" >\n");
      out.write("                        <br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;platform : <input type=\"text\" name=\"j_plat\" placeholder=\"enter job platform\" ><br><hr>\n");
      out.write("                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;location : <input type=\"text\" name=\"j_loc\" placeholder=\"enter job location\"><br><hr>\n");
      out.write("                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;vacancy : <input type=\"text\" name=\"j_vac\" placeholder=\"no of vaccant post\"><br><hr>\n");
      out.write("                        company website : <input type=\"text\" name=\"j_website\" placeholder=\"enter website\"><br><hr>\n");
      out.write("                        last date for apply : <input type=\"text\" name=\"j_apply\" placeholder=\"last date for apply form\"><br><hr>\n");
      out.write("                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;job type : <input type=\"text\" name=\"j_type\" placeholder=\"internship/full time employee\"><br><hr>\n");
      out.write("                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;salary : <input type=\"text\" name=\"j_sal\" placeholder=\"ammount in rupees\"><br><hr>\n");
      out.write("                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;contact : <input type=\"text\" name=\"j_cnt\" placeholder=\"enter 10 digit mob no\"><br><hr>\n");
      out.write("                        <input type=\"submit\" name=\"submit\" value=\"Submit\">\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </center>\n");
      out.write("    \n");
      out.write("               \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    </body>\n");
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
