package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class about_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Contact Us</title>\n");
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
      out.write("        <link rel=\"stylesheet\" href=\"css/reset.css\" type=\"text/css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/font-awesome/css/font-awesome.min.css\">\n");
      out.write("        <!-- responsive devices styles -->\n");
      out.write("        <link rel=\"stylesheet\" media=\"screen\" href=\"css/responsive-leyouts.css\" type=\"text/css\" />\n");
      out.write("        <!-- style switcher -->\n");
      out.write("        <link rel = \"stylesheet\" media = \"screen\" href = \"js/style-switcher/color-switcher.css\" />\n");
      out.write("        <!-- sticky menu -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"js/sticky-menu/core.css\">\n");
      out.write("        <!-- REVOLUTION SLIDER -->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"js/revolutionslider/css/fullwidth.css\" media=\"screen\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"js/revolutionslider/rs-plugin/css/settings.css\" media=\"screen\" />\n");
      out.write("        <!-- jquery jcarousel -->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"js/jcarousel/skin.css\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"js/jcarousel/skin2.css\" />\n");
      out.write("        <!-- faqs -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"js/accordion/accordion.css\" type=\"text/css\" media=\"all\">\n");
      out.write("        <!-- tabs css -->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"js/tabs/tabs.css\" />\n");
      out.write("        <!-- testimonials -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"js/testimonials/fadeeffect.css\" type=\"text/css\" media=\"all\">\n");
      out.write("        <!-- fancyBox -->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"js/portfolio/source/jquery.fancybox.css\" media=\"screen\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"studentPannel/stpanel.css\" />\n");
      out.write("        <style>\n");
      out.write("            #bodyy{\n");
      out.write("                color:#009999;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!-- HEADER -->\n");
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
      out.write("                                    <li class=\"empty\"><a href=\"\"><i class=\"icon-envelope\"></i> FlyHigh.com</a></li>\n");
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
      out.write("                            <div class=\"one_fourth\"><a href=\"index.jsp\" id=\"logo\"></a></div>\n");
      out.write("                                <!-- Menu -->\n");
      out.write("                                <div class=\"three_fourth last\">\n");
      out.write("                                    <nav id=\"access\" class=\"access\" role=\"navigation\">\n");
      out.write("                                        <div id=\"menu\" class=\"menu\">\n");
      out.write("                                            <ul id=\"tiny\">\n");
      out.write("                                                <li><a href=\"index.jsp\" >HOME</a></li>\n");
      out.write("                                                <li><a href=\"companypannel/job_reg.jsp\">Vacancy</a></li>\n");
      out.write("                                                <li><a href=\"companypannel/Welcome.jsp\" >Company Zone</a></li>\n");
      out.write("                                                <li><a href=\"studentPannel/studentPannel.jsp\">Student Zone</a></li>\n");
      out.write("                                                <li><a href=\"login.jsp\" >Login </a>\n");
      out.write("                                                <li><a href=\"contact.jsp\" >Contact Us</a></li>\n");
      out.write("                                                <li><a href=\"about.jsp\" >About Us</a></li>\n");
      out.write("                                            </ul>\n");
      out.write("                                        </div>\n");
      out.write("                                    </nav>\n");
      out.write("                                    <!-- end nav menu -->\n");
      out.write("                                </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </header>\n");
      out.write("            <div id=\"headpane\">\n");
      out.write("                <h1 style=\"float:left; margin-left: 50px;\">About Us Panel</h1>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"bodyCp\">\n");
      out.write("                <img src=\"studentPannel/st_image.jpg\" height=\"100%\" width=\"100%\">\n");
      out.write("            </div>\n");
      out.write("        \n");
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
