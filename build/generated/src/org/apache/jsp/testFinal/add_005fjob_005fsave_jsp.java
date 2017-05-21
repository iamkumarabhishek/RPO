package org.apache.jsp.testFinal;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;;

public final class add_005fjob_005fsave_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

        String j_plat = request.getParameter("j_plat");
        String j_loc = request.getParameter("j_loc");
        String j_vac = request.getParameter("j_vac");
        String j_website = request.getParameter("j_website");
        String j_apply = request.getParameter("j_apply");
        String j_type = request.getParameter("j_type");
        String j_sal = request.getParameter("j_sal");
        String j_cnt = request.getParameter("j_cnt");
        int i=0;
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:SURAJ", "scott","tiger");
        Statement st = con.createStatement();
        String INSERT_QUERY = "insert into job_reg values('"+j_plat+"','"+j_loc+"','"+j_vac+"','"+j_website+"','"+j_apply+"','"+j_type+"','"+j_sal+"','"+j_cnt+"')";
        if(j_plat!="null"){
            i = st.executeUpdate(INSERT_QUERY);
        }
        if(i>0){
    
      out.write("\n");
      out.write("        <Script language=\"javascript\">\n");
      out.write("            alert(\"job added successfully\");\n");
      out.write("            window.location.href=\"job_reg.jsp\";\n");
      out.write("        </script>\n");
      out.write("    ");

            }
    
      out.write("\n");
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
