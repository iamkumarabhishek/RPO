/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.flyhigh.cpannel;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ABHISHEK
 */
public class ServletTest3 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletTest3</title>");  
            out.println("<style>");
            out.println("\n" +
"            @import url(http://fonts.googleapis.com/css?family=Roboto:400,500,700,300,100);\n" +
"\n" +
"body {\n" +
"  background-color: #3e94ec;\n" +
"  font-family: \"Roboto\", helvetica, arial, sans-serif;\n" +
"  font-size: 16px;\n" +
"  font-weight: 400;\n" +
"  text-rendering: optimizeLegibility;\n" +
"}\n" +
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
            out.println("</style>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServletTest3 at " + request.getContextPath() + "</h1>");
            out.println("<div class='table-title'>\n" +
"        <h3>Data Table</h3>\n" +
"        </div>\n" +
"        <table class='table-fill'>\n" +
"        <thead>\n" +
"        <tr>\n" +
"        <th class='text-left'>COLUMN</th>\n" +
"        <th class='text-left'>CREDENTIALS</th>\n" +
"        </tr>\n" +
"        </thead>\n" +
"        <tbody class='table-hover'>\n" +
"        <tr>\n" +
"        <td class='text-left'>Company  name : </td>\n" +
"        <td class='text-left'><%= cp_name%></td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"        <td class='text-left'>User  name : </td>\n" +
"        <td class='text-left'><%= user%></td>\n" +
"        </tr>\n" +
"        \n" +
"        \n" +
"        </tbody>\n" +
"        </table>\n" +
"  \n" +
"\n" +
"  </body>");
            
            out.println("</html>");
            
        }
    }

}
