package org.apache.jsp.companypannel;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;;

public final class rcvrPass_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Password Recovery</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            String newPass = request.getParameter("newPass");
            String cnfPass = request.getParameter("cnfPass");
            String uname = request.getParameter("userAgain");
            int i = 0;
            //if(newPass.equals(cnfPass)){
            
           
                
                //register driver
                Class.forName("oracle.jdbc.driver.OracleDriver");
                //eshtablish connection
                Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:SURAJ","scott","tiger");
                //create statement
                Statement st = con.createStatement();
                //String QUERY = "update cmpnReg set password = '"+newPass+"' where u_name = '"+uname+"'";
                String QUERY = "update cmpnReg set password = '123456' where u_name = 'braj_soft'";
                //execute query
                i = st.executeUpdate(QUERY);
                //process result
                if(i>0){     
                
      out.write("\n");
      out.write("                    <script language=\"javascript\">\n");
      out.write("                        alert('password successfully changed');\n");
      out.write("                        window.location.href=\"Welcome.jsp\";\n");
      out.write("                    </script>\n");
      out.write("                ");

                
            }
            else{
        
      out.write("\n");
      out.write("        <script language=\"javascript\">\n");
      out.write("            alert('credential not matched, try again');\n");
      out.write("            window.location.href=\"frgtPWD.jsp\";\n");
      out.write("        </script>\n");
      out.write("        ");

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
