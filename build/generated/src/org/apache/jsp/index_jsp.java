package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/Header.jsp");
    _jspx_dependants.add("/Footer.jsp");
  }

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
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <center>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body bgcolor=\"rgb(255,0,5,)\">\n");
      out.write("        <h1>Welcome !!!!!!!!!!!!!!!!!!!!!</h1>\n");
      out.write("   </body>\n");
      out.write("</html>");
      out.write("\n");
      out.write("    \n");
      out.write("        <h1>Welcome </h1>\n");
      out.write("        <h2>Login</h2>\n");
      out.write("        <p style=height:100;width:100;background-color:white>\n");
      out.write("        <form action=\"LoginServlet\">\n");
      out.write("            <table>\n");
      out.write("                <tr><td>User Name   </td><td><input type=\"text\" name=\"username\" required></td></tr>\n");
      out.write("                <tr><td>Password </td><td><input type=\"password\" name=\"pwd\" required></td></tr>\n");
      out.write("                <tr><td></td><td><input type=\"submit\" value=\"login\"><a href=\"NewUser.jsp\"><input type=\"submit\" value=\"New USer\"></a></td></tr>\n");
      out.write("                     \n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("            \n");
      out.write("        </center>\n");
      out.write("        ");
      out.write("\n");
      out.write("<br><br><br><br><br><br><br><br><br><br><br><br><br>\n");
      out.write("FOR MORE QUERIES CONTACT ON :<br>\n");
      out.write("hardikpuri508@gmail.com <br>\n");
      out.write("    \n");
      out.write("OR<br>\n");
      out.write("8827688461\n");
      out.write("<div align=\"right\">\n");
      out.write("<a href=\"index.jsp\"><input type=\"submit\" value=\"Logout\"></a>\n");
      out.write("</div>");
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
