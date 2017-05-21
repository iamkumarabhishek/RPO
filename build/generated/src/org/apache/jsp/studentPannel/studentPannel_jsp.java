package org.apache.jsp.studentPannel;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class studentPannel_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Student Pannel</title>\n");
      out.write("        \n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"keywords\" content=\"\" />\n");
      out.write("        <meta name=\"description\" content=\"\"/>\n");
      out.write("        <!-- Favicon -->\n");
      out.write("        <link rel=\"shortcut icon\" href=\"images/favicon.png\">\n");
      out.write("        <!-- this styles only adds some repairs on idevices  -->\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\n");
      out.write("        <!-- Google fonts - witch you want to use - (rest you can just remove) -->\n");
      out.write("        <link rel='stylesheet' href='http://fonts.googleapis.com/css?family=Open+Sans:400,800,700italic,700,600italic,600,400italic,300italic,300|Roboto:100,300,400,500,700&amp;subset=latin,latin-ext' type='text/css' />\n");
      out.write("\n");
      out.write("        <!-- ######### CSS STYLES ######### -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"../css/reset.css\" type=\"text/css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"../css/style.css\" type=\"text/css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"../css/font-awesome/css/font-awesome.min.css\">\n");
      out.write("        <!-- responsive devices styles -->\n");
      out.write("        <link rel=\"stylesheet\" media=\"screen\" href=\"../css/responsive-leyouts.css\" type=\"text/css\" />\n");
      out.write("        <!-- style switcher -->\n");
      out.write("        <link rel = \"stylesheet\" media = \"screen\" href = \"../js/style-switcher/color-switcher.css\" />\n");
      out.write("        <!-- sticky menu -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"../js/sticky-menu/core.css\">\n");
      out.write("        <!-- REVOLUTION SLIDER -->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../js/revolutionslider/css/fullwidth.css\" media=\"screen\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../js/revolutionslider/rs-plugin/css/settings.css\" media=\"screen\" />\n");
      out.write("        <!-- jquery jcarousel -->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../js/jcarousel/skin.css\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../js/jcarousel/skin2.css\" />\n");
      out.write("        <!-- faqs -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"../js/accordion/accordion.css\" type=\"text/css\" media=\"all\">\n");
      out.write("        <!-- tabs css -->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../js/tabs/tabs.css\" />\n");
      out.write("        <!-- testimonials -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"../js/testimonials/fadeeffect.css\" type=\"text/css\" media=\"all\">\n");
      out.write("        <!-- fancyBox -->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../js/portfolio/source/jquery.fancybox.css\" media=\"screen\" />\n");
      out.write("        \n");
      out.write("        <!-- AfterHeading -->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"stpanel.css\" />\n");
      out.write("        <script src=\"../layout/scripts/job_add.js\"></script>\n");
      out.write("        <link href=\"../layout/styles/add_job.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("            <!-- HEADER -->\n");
      out.write("            <header id=\"header\">\n");
      out.write("                <!-- Top header bar -->\n");
      out.write("                <div id=\"topHeader\">\n");
      out.write("                    <div class=\"wrapper\">\n");
      out.write("                        <div class=\"top_contact_info\">\n");
      out.write("                            <div class=\"container\">\n");
      out.write("                                <ul class=\"tci_list_left\">\n");
      out.write("                                    <li><a href=\"job_reg.jsp\"><i class=\"icon-male\"></i> Vacancy</a></li>\n");
      out.write("                                    <li>|</li>\n");
      out.write("                                    <li><a href=\"companypannel/Welcome.jsp\"><i class=\"icon-suitcase\"></i> Company Zone</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                                <ul class=\"tci_list\">\n");
      out.write("                                    <li class=\"empty\"><i class=\"icon-phone-sign\"></i> +91 7598433417</li>\n");
      out.write("                                    <li class=\"empty\"><a href=\"\"><i class=\"icon-envelope\"></i> SquareFour.com</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- end top contact info -->\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"trueHeader\">\n");
      out.write("                    <div class=\"wrapper\">\n");
      out.write("                        <div class=\"container\">\n");
      out.write("                            <!-- Logo -->\n");
      out.write("                            <div class=\"one_fourth\"><a href=\"../index.jsp\" id=\"logo\"></a></div>\n");
      out.write("                                <!-- Menu -->\n");
      out.write("                                <div class=\"three_fourth last\">\n");
      out.write("                                    <nav id=\"access\" class=\"access\" role=\"navigation\">\n");
      out.write("                                        <div id=\"menu\" class=\"menu\">\n");
      out.write("                                            <ul id=\"tiny\">\n");
      out.write("                                                <li><a href=\"../index.jsp\" >HOME</a></li>\n");
      out.write("                                                <li><a href=\"../companypannel/job_reg.jsp\">Vacancy</a></li>\n");
      out.write("                                                <li><a href=\"../companypannel/Welcome.jsp\" >Company Zone</a></li>\n");
      out.write("                                                <li><a href=\"#\">Student Zone</a></li>\n");
      out.write("                                                <li><a href=\"../login.jsp\" >Login </a>\n");
      out.write("                                                <li><a href=\"../contact.jsp\" >Contact Us</a></li>\n");
      out.write("                                                <li><a href=\"../about.jsp\" >About Us</a></li>\n");
      out.write("                                            </ul>\n");
      out.write("                                        </div>\n");
      out.write("                                    </nav>\n");
      out.write("                                    <!-- end nav menu -->\n");
      out.write("                                </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </header>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("        <div id=\"headpane\">\n");
      out.write("            <h1 style=\"float:left; margin-left: 50px;\">Student Pannel</h1>\n");
      out.write("            <a href=\"frgtPass.jsp\"><h4 style=\"float:right; margin-right:20px; color:red; background-color: white; border-radius: 5px;padding:5px;\">Forgot Password</h4></a>\n");
      out.write("            <a href=\"stu_register.jsp\"><h4 style=\"float:right; margin-right:20px; color:green; background-color: white; border-radius: 5px;padding:5px;\">sign up</h4></a>   \n");
      out.write("        </div>\n");
      out.write("         \n");
      out.write("        <div id=\"heading\">\n");
      out.write("            \n");
      out.write("            <div id=\"login_window\">\n");
      out.write("                <div id=\"tablebar\" style=\"float:right; background-color:#DADADA; margin-right:10px;\">\n");
      out.write("                    <div id=\"del_tble\">\n");
      out.write("                        <form name=\"stuLoginFrm\" action=\"stuLogin.jsp\" method=\"POST\">\n");
      out.write("                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;User Name : <input type=\"text\" name=\"uname\" value=\"\" placeholder=\"enter name\" size=\"20\" />\n");
      out.write("                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Password : <input type=\"text\" name=\"pass\" value=\"\" placeholder=\"enter password\" size=\"20\" />\n");
      out.write("                            <input type=\"submit\" value=\"Login\" name=\"submit\" />\n");
      out.write("                        </form>\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <img src=\"st_image2.jpg\" height=\"100%\" width=\"100%\">\n");
      out.write("        </div>\n");
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
