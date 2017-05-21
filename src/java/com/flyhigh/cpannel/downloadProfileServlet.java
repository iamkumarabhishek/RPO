/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.flyhigh.cpannel;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ABHISHEK
 */
public class downloadProfileServlet extends HttpServlet {
 
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            PrintWriter pw = response.getWriter();
            pw.println("<!DOCTYPE html>");
            pw.println("<html>");
            pw.println("<head>");
            pw.println("<style>");
            pw.println("\n" +
"            @import url(http://fonts.googleapis.com/css?family=Roboto:400,500,700,300,100);\n" +
"\n" +
"body {\n" +
"  background-color: #3e94ec;\n" +
"  font-family: \"Roboto\", helvetica, arial, sans-serif;\n" +
"  font-size: 16px;\n" +
"  font-weight: 400;\n" +
"  text-rendering: optimizeLegibility;\n" +
"}#letter{padding:50px;}\n" +
"\n" +
"div.table-title {\n" +
"   display: block;\n" +
"  margin: auto;\n" +
"  max-width: 600px;\n" +
"  padding:5px;\n" +
"  width: 100%;\n" +
"}\n" +
"\n" +
".table-title h3 {\n" +
"   color: #fafafa;\n" +
"   font-size: 30px;\n" +
"   font-weight: 400;\n" +
"   font-style:normal;\n" +
"   font-family: \"Roboto\", helvetica, arial, sans-serif;\n" +
"   text-shadow: -1px -1px 1px rgba(0, 0, 0, 0.1);\n" +
"   text-transform:uppercase;\n" +
"}\n" +
"\n" +
"\n" +
"/*** Table Styles **/\n" +
"\n" +
".table-fill {\n" +
"  background: white;\n" +
"  border-radius:3px;\n" +
"  border-collapse: collapse;\n" +
"  height: 320px;\n" +
"  margin: auto;\n" +
"  max-width: 600px;\n" +
"  padding:5px;\n" +
"  width: 100%;\n" +
"  box-shadow: 0 5px 10px rgba(0, 0, 0, 0.1);\n" +
"  animation: float 5s infinite;\n" +
"}\n" +
" \n" +
"th {\n" +
"  color:#D5DDE5;;\n" +
"  background:#1b1e24;\n" +
"  border-bottom:4px solid #9ea7af;\n" +
"  border-right: 1px solid #343a45;\n" +
"  font-size:23px;\n" +
"  font-weight: 100;\n" +
"  padding:24px;\n" +
"  text-align:left;\n" +
"  text-shadow: 0 1px 1px rgba(0, 0, 0, 0.1);\n" +
"  vertical-align:middle;\n" +
"}\n" +
"\n" +
"th:first-child {\n" +
"  border-top-left-radius:3px;\n" +
"}\n" +
" \n" +
"th:last-child {\n" +
"  border-top-right-radius:3px;\n" +
"  border-right:none;\n" +
"}\n" +
"  \n" +
"tr {\n" +
"  border-top: 1px solid #C1C3D1;\n" +
"  border-bottom-: 1px solid #C1C3D1;\n" +
"  color:#666B85;\n" +
"  font-size:16px;\n" +
"  font-weight:normal;\n" +
"  text-shadow: 0 1px 1px rgba(256, 256, 256, 0.1);\n" +
"}\n" +
" \n" +
"tr:hover td {\n" +
"  background:#4E5066;\n" +
"  color:#FFFFFF;\n" +
"  border-top: 1px solid #22262e;\n" +
"  border-bottom: 1px solid #22262e;\n" +
"}\n" +
" \n" +
"tr:first-child {\n" +
"  border-top:none;\n" +
"}\n" +
"\n" +
"tr:last-child {\n" +
"  border-bottom:none;\n" +
"}\n" +
" \n" +
"tr:nth-child(odd) td {\n" +
"  background:#EBEBEB;\n" +
"}\n" +
" \n" +
"tr:nth-child(odd):hover td {\n" +
"  background:#4E5066;\n" +
"}\n" +
"\n" +
"tr:last-child td:first-child {\n" +
"  border-bottom-left-radius:3px;\n" +
"}\n" +
" \n" +
"tr:last-child td:last-child {\n" +
"  border-bottom-right-radius:3px;\n" +
"}\n" +
" \n" +
"td {\n" +
"  background:#FFFFFF;\n" +
"  padding:20px;\n" +
"  text-align:left;\n" +
"  vertical-align:middle;\n" +
"  font-weight:300;\n" +
"  font-size:18px;\n" +
"  text-shadow: -1px -1px 1px rgba(0, 0, 0, 0.1);\n" +
"  border-right: 1px solid #C1C3D1;\n" +
"}\n" +
"\n" +
"td:last-child {\n" +
"  border-right: 0px;\n" +
"}\n" +
"\n" +
"th.text-left {\n" +
"  text-align: left;\n" +
"}\n" +
"\n" +
"th.text-center {\n" +
"  text-align: center;\n" +
"}\n" +
"\n" +
"th.text-right {\n" +
"  text-align: right;\n" +
"}\n" +
"\n" +
"td.text-left {\n" +
"  text-align: left;\n" +
"}\n" +
"\n" +
"td.text-center {\n" +
"  text-align: center;\n" +
"}\n" +
"\n" +
"td.text-right {\n" +
"  text-align: right;\n" +
"}");
            pw.println("</style>");
            pw.println("<title>Servlet ServletTest3</title>");            
            pw.println("</head>");
            pw.println("<body style='background-color:#009999;'>");
            response.setContentType("application/msword");
            //response.setContentType("application/pdf");
            //response.setContentType("application/x-pdf");
            //response.setContentType("text/html;charset=UTF-8");
            //response.setContentType("type/xml");
            
            String name = request.getParameter("uname");
            String password = request.getParameter("pass");
            //register driver
            Class.forName("oracle.jdbc.driver.OracleDriver");
            //eshtablish connection
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:SURAJ", "scott", "tiger");
            //create conneciotn
            st = con.createStatement();
            //make query
            String query = "select * from cmpnReg where u_name = '"+name+"' and password = '"+password+"'";
            //execute query
            boolean flag = false;
            rs = st.executeQuery(query);
            //process result
            String cp_name = null;
            String cp_pass = null;
            String email = null;
            String adrs = null;
            String cnt = null;
            String cp_uname = null;
            
            //int ct = 0;
            
            while(rs.next()){
                flag = true;
                //ct = rs.getInt(1);
                cp_name = rs.getString(1);
                cp_pass = rs.getString(2);
                email = rs.getString(3);
                adrs = rs.getString(4);
                cnt = rs.getString(5);
                cp_uname = rs.getString(6);
            }
            
                if(flag == true){
                    pw.println("<div id='letter'>");
                    pw.println("<h2>Hello,&nbsp; "+cp_name+"</h2><br>");
                    pw.println("<h3>Sir,</h3>");
                    pw.println("<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; We are very happy that you are now a part of FlyHigh Recruitment \n" +
                                "                Services. We are assuming that you are feeling very comfortable to be a part of our organisation.\n" +
                                "            </p><br>");
                    pw.println("<h2>Your profile as follows:-</h2><br>");
                    pw.println("<table class='table-fill'>\n" +
"                            <thead>\n" +
"                                <tr>\n" +
"                                <th class='text-left'>COLUMN</th>\n" +
"                                <th class='text-left'>CREDENTIALS</th>\n" +
"                                </tr>\n" +
"                            </thead>\n" +
"                                <tbody class='table-hover'>\n" +
"                                    <tr>\n" +
"                                    <td class='text-left'>Company  name : </td>\n" +
"                                    <td class='text-left'>"+cp_name+"</td>\n" +
"                                    </tr>\n" +
"                                    <tr>\n" +
"                                    <td class='text-left'>User  name : </td>\n" +
"                                    <td class='text-left'>"+cp_uname+"</td>\n" +
"                                    </tr>\n" +
"                                    <tr>\n" +
"                                    <td class='text-left'>password : </td>\n" +
"                                    <td class='text-left'>"+cp_pass+"</td>\n" +
"                                    </tr>\n" +
"                                    <tr>\n" +
"                                    <td class='text-left'>email : </td>\n" +
"                                    <td class='text-left'>"+email+"</td>\n" +
"                                    </tr>\n" +
"                                    <tr>\n" +
"                                    <td class='text-left'>address</td>\n" +
"                                    <td class='text-left'>"+adrs+"</td>\n" +
"                                    </tr>\n" +
"                                    <tr>\n" +
"                                    <td class='text-left'>contact</td>\n" +
"                                    <td class='text-left'>"+cnt+"</td>\n" +
"                                    </tr>\n" +
"                                </tbody>\n" +
"                            </table>");
                    
                    
                    pw.println("<p>Please make sure that you are saved this document as you may need for your basic profile changes in future. \n" +
                                "                This document is also notify that now your company is registered with FlyHigh Recruitment Services.\n" +
                                "            </p><br>");
                    pw.println("<h2>Feel free for any query on 7598433417.</h2>");
                    pw.println("<h3>Thanks and Regards</h3>");
                    pw.println("<h3>FlyHigh Recruitment Services</h3>");
                    pw.println("</div>");
                        
                }
                    pw.println("</body>");
                    pw.println("</html>");  
        } 
        catch (SQLException | ClassNotFoundException ex) 
        {
            ex.printStackTrace();
        } 
        finally {
            try {
                if(rs!=null)
                    rs.close();
            } 
            catch (SQLException ex) {
                ex.printStackTrace();
            }
            try {
                if(con!=null)
                    con.close();
            } 
            catch (SQLException ex) {
                ex.printStackTrace();
            }
            try {
                if(st!=null)
                    st.close();
            } 
            catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        
    }
}
        