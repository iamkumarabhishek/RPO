package org.apache.jsp.studentPannel;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;;

public final class autoIncTest_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("         <script src=\"layout/scripts/job_add.js\"></script>\n");
      out.write("        <link href=\"layout/styles/add_job.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\">\n");
      out.write("        <link href=\"layout/styles/DashboardTable.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("            \n");
      out.write("            .post{\n");
      out.write("\t\t\tpadding: 10px;\n");
      out.write("\t\t\tborder: 1px solid #000;\n");
      out.write("\t\t\twidth: 50%;\n");
      out.write("\t\t\tmargin:auto;\n");
      out.write("\t\t}\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        ");

             int i = 0;
            String fname = request.getParameter("fname");
            String uname = request.getParameter("uname");
            String pass = request.getParameter("pass");
            int id=0;
        String frstNm = null;
        String usrNm = null;
        String password = null;
            
            
            String INSERT_QUERY = "insert into candidate(FirstName, UserName, password) values(FirstName = '"+fname+"', UserName = '"+uname+"',  password='"+pass+"')";
            //String UPDATE_QUERY = "update cmpnReg set c_name = 'surajSoft',password='verani',email='suraj@suraj.com',adrs ='patna',contact='90909090',u_name='tbrej' where u_name ='tbrj' and password ='erani'";
           String selectQuery = "select * from candidate";
        
            
                
            //register Driver
            Class.forName("com.mysql.jdbc.Driver");
            //Class.forName("oracle.jdbc.driver.OracleDriver");
            //establish connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","pass");
            //Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:SURAJ","scott","tiger");
            //create connection
            
                Statement st = con.createStatement();
                                //update test3 set name = 'abhishek', pass = 'varsi' where name = 'abhishek' and pass='kumar';
            int  result = st.executeUpdate(INSERT_QUERY);
            ResultSet rs = st.executeQuery(selectQuery);
            if(result >0){
                
        
      out.write("\n");
      out.write("        <script language =\"javascript\">\n");
      out.write("            alert('register applied successfully');\n");
      out.write("            \n");
      out.write("        </script>\n");
      out.write("        ");

           
        }
else if(i==0){
        
      out.write("\n");
      out.write("        <script language =\"javascript\">\n");
      out.write("            alert('invalid credential, check again');\n");
      out.write("            window.location.href=\"autoInc.jsp\";\n");
      out.write("        </script>\n");
      out.write("        ");

            }
        
      out.write("\n");
      out.write("        \n");
      out.write("        ");
 
        

        while(rs.next())
        {
            id = rs.getInt(1);
            frstNm = rs.getString(2);
            usrNm = rs.getString(3);
            password = rs.getString(4);
            
       
       
        
      out.write("\n");
      out.write("            <table class=\"table-fill\">\n");
      out.write("                            <thead>\n");
      out.write("                                <tr>\n");
      out.write("                                <th class=\"text-left\">COLUMN</th>\n");
      out.write("                                <th class=\"text-left\">CREDENTIALS</th>\n");
      out.write("                                </tr>\n");
      out.write("                            </thead>\n");
      out.write("                                <tbody class=\"table-hover\">\n");
      out.write("                                    <tr>\n");
      out.write("                                    <td class=\"text-left\">ID : </td>\n");
      out.write("                                    <td class=\"text-left\">");
      out.print( id);
      out.write("</td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                    <td class=\"text-left\">FirstName : </td>\n");
      out.write("                                    <td class=\"text-left\">");
      out.print( frstNm);
      out.write("</td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                    <td class=\"text-left\">UserName : </td>\n");
      out.write("                                    <td class=\"text-left\">");
      out.print( usrNm);
      out.write("</td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                    <td class=\"text-left\">password : </td>\n");
      out.write("                                    <td class=\"text-left\">");
      out.print( password);
      out.write("</td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    \n");
      out.write("                                </tbody>\n");
      out.write("                            </table>\n");
      out.write("                        <br><hr><br>\n");
      out.write("                        ");

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
