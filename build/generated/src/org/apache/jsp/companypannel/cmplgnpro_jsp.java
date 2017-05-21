package org.apache.jsp.companypannel;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;;

public final class cmplgnpro_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write('\n');

        String cmpuser=request.getParameter("cmpuser");
        String pass=request.getParameter("pass");
         Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rpo", "root", "pass");
            PreparedStatement ps = conn.prepareStatement("Select * from companyreg where cmpuser=? and pass=?");
            ps.setString(1, cmpuser);
            ps.setString(2, pass);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) 
                {
          

    String amt=rs.getString("amt");
    session.setAttribute("amt", amt);
    String cmpnm=rs.getString("cmpnm");
    session.setAttribute("cmpnm", cmpnm);
    String cmpem=rs.getString("cmpem");
    session.setAttribute("cmpem", cmpem);
    String cno=rs.getString("cno");
    session.setAttribute("cno", cno);
    String cmpadd=rs.getString("cmpadd");
    session.setAttribute("cmpadd", cmpadd);
    session.setAttribute("cmpuser", cmpuser);
    session.setAttribute("pass", pass);
    
         response.sendRedirect("../../index.jsp");
          
          }
            
             
else
    { 
      out.write("\n");
      out.write("           \n");
      out.write("        <script lanuage=\"javascript\">\n");
      out.write("        alert( \"UnSuccessfully\");\n");
      out.write("        window.location.href=\"cmplgn.jsp\";\n");
      out.write("        </script>   \n");
      out.write("           \n");
      out.write("        ");
 }
    
      out.write("\n");
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
