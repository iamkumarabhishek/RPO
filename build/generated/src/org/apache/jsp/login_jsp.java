package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <script src=\"studentPannel/job_add.js\"></script>\n");
      out.write("        <link href=\"studentPannel/add_job.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\">\n");
      out.write("        <style>\n");
      out.write("            #box2{\n");
      out.write("                \n");
      out.write("                height:150px;\n");
      out.write("                width:98.5%;\n");
      out.write("                background-color: #009999;\n");
      out.write("                border-radius: 5px;\n");
      out.write("                margin-top: 100px;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            #box4 a{\n");
      out.write("                text-decoration: none;\n");
      out.write("            }\n");
      out.write("            #box4 h2{\n");
      out.write("                \n");
      out.write("                padding:10px;\n");
      out.write("                text-align: center;\n");
      out.write("                border:2px solid #FF7575;\n");
      out.write("                color:#620020;\n");
      out.write("                background-color: #c6e3ff;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-image: url(studentPannel/loginImage.jpg);\">\n");
      out.write("        <div id=\"headd\">\n");
      out.write("            <h1 style=\"float:left;margin-left:10px;\">SquareFour Job Recruiting Services</h1>\n");
      out.write("            <h1 style=\"float:right;margin-right:10px;\"> Login Profile Page</h1>\n");
      out.write("        </div>\n");
      out.write("        <hr>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <a href=\"studentPannel/studentPannel.jsp\"><h1 id=\"home\">HOME</h1></a>\n");
      out.write("        \n");
      out.write("            <div id=\"box2\">\n");
      out.write("                <div id=\"box4\" style=\"float:left;margin-left: 400px;\">\n");
      out.write("                    <a href=\"studentPannel/studentPannel.jsp\"><h2 style=\"border-radius: 15px 15px 0px 0px;\">Login As Student</h2></a>\n");
      out.write("                    <a href=\"studentPannel/stu_register.jsp\"><h2 style=\"border-radius: 0px 0px 15px 15px;\">Need An Account?</h2></a>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"box4\" style=\"float:right;margin-right: 400px;\">\n");
      out.write("                    <a href=\"companypannel/Welcome.jsp\"><h2 style=\"border-radius: 15px 15px 0px 0px;\">Login As Company</h2></a>\n");
      out.write("                    <a href=\"companypannel/cmpnReg.jsp\"><h2 style=\"border-radius: 0px 0px 15px 15px;\">Need An Account?</h2></a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"box3\" style=\"width:300px;margin-left: 500px; \">\n");
      out.write("                <div id=\"box4\">\n");
      out.write("                    <a href=\"#\"><h2 style=\"background-color: #c6e3ff;border-radius: 15px 15px 15px 15px;\">Login As Admin</h2></a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("     </body>\n");
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
