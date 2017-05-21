package org.apache.jsp.companypannel;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cmplgn_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Company Login</title>\n");
      out.write("<link rel=\"stylesheet\" href=\"global.css\"/>\n");
      out.write("<link rel=\"stylesheet\" href=\"login.css\">\n");
      out.write("<script type=\"text/javascript\" src=\"jquery-1.2.6.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("function slideSwitch() {\n");
      out.write("    var $active = $('#slideshow IMG.active');\n");
      out.write("    if ( $active.length == 0 ) $active = $('#slideshow IMG:last');\n");
      out.write("    var $next =  $active.next().length ? $active.next()\n");
      out.write("        : $('#slideshow IMG:first');\n");
      out.write("    $active.addClass('last-active');\n");
      out.write("    $next.css({opacity: 0.0})\n");
      out.write("        .addClass('active')\n");
      out.write("        .animate({opacity: 1.0}, 2000, function() {\n");
      out.write("            $active.removeClass('active last-active');\n");
      out.write("        });\n");
      out.write("}\n");
      out.write("$(function() {\n");
      out.write("    setInterval( \"slideSwitch()\", 5000 );\n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div id=\"slideshow\">\n");
      out.write("<img class=\"active\" src=\"cmplgn2.jpg\"/>\n");
      out.write("<img src=\"cmplgn9.jpg\"/>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("<div id=\"loginform\">\n");
      out.write("  <form method=\"POST\" action=\"stexmlgnp.jsp\">\n");
      out.write("    <table align=\"center\" style=\"margin-top:-45%; border:hidden;padding:1% 3%; color:#FFFFFF; border-collapse:inherit;\">\n");
      out.write("      <tr>\n");
      out.write("          <td align=\"center\"><h1 style=\"margin-top: 5px; font-size: 40px; font-family:sans-serif;color: black;\">COMPANY LOGIN</h1></td>\n");
      out.write("      </tr>\n");
      out.write("       <tr>\n");
      out.write("          <td align=\"center\" style=\"background-color: #4768AC; \"><h3 style=\"margin-top: 5px; font-size: 16px; font-family:sans-serif; \">SIGN IN TO START YOUR SESSION</h1></td>\n");
      out.write("      </tr>\n");
      out.write("     \n");
      out.write("      <tr>\n");
      out.write("          <td><input type=\"text\" name=\"user\" placeholder=\"USER NAME\" required=\"\" ></td>\n");
      out.write("      </tr>\n");
      out.write("      <tr>\n");
      out.write("          <td><input type=\"password\" name=\"pass\" placeholder=\"PASSWORD\" required=\"\" ></td>\n");
      out.write("      </tr>\n");
      out.write("      <tr>\n");
      out.write("        <td align=\"right\"><input type=\"submit\" name=\"submit\" value=\"LOGIN\" style=\"font-size:20px;\" ></td>\n");
      out.write("      </tr>\n");
      out.write("     \n");
      out.write("    </table>\n");
      out.write("  </form>\n");
      out.write("</div>\n");
      out.write("</body>\n");
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
