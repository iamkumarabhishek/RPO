package org.apache.jsp.companypannel;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class tableTest_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("            @import url(http://fonts.googleapis.com/css?family=Roboto:400,500,700,300,100);\n");
      out.write("\n");
      out.write("body {\n");
      out.write("  background-color: #3e94ec;\n");
      out.write("  font-family: \"Roboto\", helvetica, arial, sans-serif;\n");
      out.write("  font-size: 16px;\n");
      out.write("  font-weight: 400;\n");
      out.write("  text-rendering: optimizeLegibility;\n");
      out.write("}\n");
      out.write("\n");
      out.write("div.table-title {\n");
      out.write("   display: block;\n");
      out.write("  margin: auto;\n");
      out.write("  max-width: 600px;\n");
      out.write("  padding:5px;\n");
      out.write("  width: 100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".table-title h3 {\n");
      out.write("   color: #fafafa;\n");
      out.write("   font-size: 30px;\n");
      out.write("   font-weight: 400;\n");
      out.write("   font-style:normal;\n");
      out.write("   font-family: \"Roboto\", helvetica, arial, sans-serif;\n");
      out.write("   text-shadow: -1px -1px 1px rgba(0, 0, 0, 0.1);\n");
      out.write("   text-transform:uppercase;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("/*** Table Styles **/\n");
      out.write("\n");
      out.write(".table-fill {\n");
      out.write("  background: white;\n");
      out.write("  border-radius:3px;\n");
      out.write("  border-collapse: collapse;\n");
      out.write("  height: 320px;\n");
      out.write("  margin: auto;\n");
      out.write("  max-width: 600px;\n");
      out.write("  padding:5px;\n");
      out.write("  width: 100%;\n");
      out.write("  box-shadow: 0 5px 10px rgba(0, 0, 0, 0.1);\n");
      out.write("  animation: float 5s infinite;\n");
      out.write("}\n");
      out.write(" \n");
      out.write("th {\n");
      out.write("  color:#D5DDE5;;\n");
      out.write("  background:#1b1e24;\n");
      out.write("  border-bottom:4px solid #9ea7af;\n");
      out.write("  border-right: 1px solid #343a45;\n");
      out.write("  font-size:23px;\n");
      out.write("  font-weight: 100;\n");
      out.write("  padding:24px;\n");
      out.write("  text-align:left;\n");
      out.write("  text-shadow: 0 1px 1px rgba(0, 0, 0, 0.1);\n");
      out.write("  vertical-align:middle;\n");
      out.write("}\n");
      out.write("\n");
      out.write("th:first-child {\n");
      out.write("  border-top-left-radius:3px;\n");
      out.write("}\n");
      out.write(" \n");
      out.write("th:last-child {\n");
      out.write("  border-top-right-radius:3px;\n");
      out.write("  border-right:none;\n");
      out.write("}\n");
      out.write("  \n");
      out.write("tr {\n");
      out.write("  border-top: 1px solid #C1C3D1;\n");
      out.write("  border-bottom-: 1px solid #C1C3D1;\n");
      out.write("  color:#666B85;\n");
      out.write("  font-size:16px;\n");
      out.write("  font-weight:normal;\n");
      out.write("  text-shadow: 0 1px 1px rgba(256, 256, 256, 0.1);\n");
      out.write("}\n");
      out.write(" \n");
      out.write("tr:hover td {\n");
      out.write("  background:#4E5066;\n");
      out.write("  color:#FFFFFF;\n");
      out.write("  border-top: 1px solid #22262e;\n");
      out.write("  border-bottom: 1px solid #22262e;\n");
      out.write("}\n");
      out.write(" \n");
      out.write("tr:first-child {\n");
      out.write("  border-top:none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("tr:last-child {\n");
      out.write("  border-bottom:none;\n");
      out.write("}\n");
      out.write(" \n");
      out.write("tr:nth-child(odd) td {\n");
      out.write("  background:#EBEBEB;\n");
      out.write("}\n");
      out.write(" \n");
      out.write("tr:nth-child(odd):hover td {\n");
      out.write("  background:#4E5066;\n");
      out.write("}\n");
      out.write("\n");
      out.write("tr:last-child td:first-child {\n");
      out.write("  border-bottom-left-radius:3px;\n");
      out.write("}\n");
      out.write(" \n");
      out.write("tr:last-child td:last-child {\n");
      out.write("  border-bottom-right-radius:3px;\n");
      out.write("}\n");
      out.write(" \n");
      out.write("td {\n");
      out.write("  background:#FFFFFF;\n");
      out.write("  padding:20px;\n");
      out.write("  text-align:left;\n");
      out.write("  vertical-align:middle;\n");
      out.write("  font-weight:300;\n");
      out.write("  font-size:18px;\n");
      out.write("  text-shadow: -1px -1px 1px rgba(0, 0, 0, 0.1);\n");
      out.write("  border-right: 1px solid #C1C3D1;\n");
      out.write("}\n");
      out.write("\n");
      out.write("td:last-child {\n");
      out.write("  border-right: 0px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("th.text-left {\n");
      out.write("  text-align: left;\n");
      out.write("}\n");
      out.write("\n");
      out.write("th.text-center {\n");
      out.write("  text-align: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write("th.text-right {\n");
      out.write("  text-align: right;\n");
      out.write("}\n");
      out.write("\n");
      out.write("td.text-left {\n");
      out.write("  text-align: left;\n");
      out.write("}\n");
      out.write("\n");
      out.write("td.text-center {\n");
      out.write("  text-align: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write("td.text-right {\n");
      out.write("  text-align: right;\n");
      out.write("}\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Hello World!</h1>\n");
      out.write("        \n");
      out.write("        <div class=\"table-title\">\n");
      out.write("        <h3>Data Table</h3>\n");
      out.write("        </div>\n");
      out.write("        <table class=\"table-fill\">\n");
      out.write("        <thead>\n");
      out.write("        <tr>\n");
      out.write("        <th class=\"text-left\">Month</th>\n");
      out.write("        <th class=\"text-left\">Sales</th>\n");
      out.write("        </tr>\n");
      out.write("        </thead>\n");
      out.write("        <tbody class=\"table-hover\">\n");
      out.write("        <tr>\n");
      out.write("        <td class=\"text-left\">January</td>\n");
      out.write("        <td class=\"text-left\">$ 50,000.00</td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("        <td class=\"text-left\">February</td>\n");
      out.write("        <td class=\"text-left\">$ 10,000.00</td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("        <td class=\"text-left\">March</td>\n");
      out.write("        <td class=\"text-left\">$ 85,000.00</td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("        <td class=\"text-left\">April</td>\n");
      out.write("        <td class=\"text-left\">$ 56,000.00</td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("        <td class=\"text-left\">May</td>\n");
      out.write("        <td class=\"text-left\">$ 98,000.00</td>\n");
      out.write("        </tr>\n");
      out.write("        </tbody>\n");
      out.write("        </table>\n");
      out.write("  \n");
      out.write("\n");
      out.write("  </body>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
