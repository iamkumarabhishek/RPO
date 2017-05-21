package org.apache.jsp.studentPannel;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class autoInc_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <script src=\"job_add.js\"></script>\n");
      out.write("        <link href=\"add_job.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\">\n");
      out.write("        \n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"headd\">\n");
      out.write("            <h1 style=\"float:left;margin-left:10px;\">Auto_Increment test</h1>\n");
      out.write("            <h1 style=\"float:right;margin-right:10px;\"> Student Registration page</h1>\n");
      out.write("        </div>\n");
      out.write("        <hr>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        \n");
      out.write("        <div id=d_tble>\n");
      out.write("            <form name=\"deleteFrm\" action=\"autoIncTest.jsp\" method=\"POST\">\n");
      out.write("                <table border=\"1\" cellpadding=\"2\">\n");
      out.write("\n");
      out.write("                    <tbody style=\"background-color:#00abde;\">\n");
      out.write("                        <tr>\n");
      out.write("                            <td>First Name : </td>\n");
      out.write("                            <td><input type=\"text\" name=\"fname\" value=\"\" size=\"20\" /></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>User Name : </td>\n");
      out.write("                            <td><input type=\"text\" name=\"uname\" value=\"\" size=\"20\" /></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Password : </td>\n");
      out.write("                            <td><input type=\"text\" name=\"pass\" value=\"\" size=\"20\" /></td>\n");
      out.write("                        </tr>\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("                <input type=\"submit\" value=\"submit\" name=\"submit\" />\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
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
