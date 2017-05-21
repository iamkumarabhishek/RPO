package org.apache.jsp.companypannel;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class cmpnRgs_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Hello World!</h1>\n");
      out.write("\n");
      out.write("        ");

            
            
            Connection con = null;
            Statement st = null;
            int result = 0;
           /* String name = request.getParameter("c_name");
            String pass = request.getParameter("pwd");
            String email = request.getParameter("email");
            String adrs = request.getParameter("adrs");
            String cnt = request.getParameter("cnt");
            */
           
            try{
                
            //register driver
            Class.forName("oracle.jdbc.driver.OracleDriver");
            //establish connection
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost","scott","tiger");
            //create connection
            if(con!=null){
                st = con.createStatement();
            }
            int i = st.executeUpdate("insert into cmpnReg(c_name) values('whatsup')");
            //set input param
           /* ps.setString(1,name);
            ps.setString(2,pass);
            ps.setString(3,email);
            ps.setString(4,adrs);
            ps.setString(5,cnt);
            
            //execute query
            if(ps!=null){
                result = ps.executeUpdate();
            }*/
            if(i>0){
                
                
            
        
      out.write("\n");
      out.write("            <Script language=\"javascript\">\n");
      out.write("                 alert(\"registered successfully\");\n");
      out.write("                window.location.href=\"Welcome.jsp\";\n");
      out.write("            </script>\n");
      out.write("        ");

            }
            else{
            
        
      out.write("\n");
      out.write("            <Script language=\"javascript\">\n");
      out.write("                alert(\"registered not done\");\n");
      out.write("                window.location.href=\"cmpnReg.jsp\";\n");
      out.write("               \n");
      out.write("            </script>\n");
      out.write("        ");

            }
}
catch(Exception e){
    e.printStackTrace();
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
