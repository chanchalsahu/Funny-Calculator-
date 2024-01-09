package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title> My JSP Page </title>\n");
      out.write("<style type=\"text/css\">\n");
      out.write("\n");
      out.write("body {\n");
      out.write("  font-size: 40px;\n");
      out.write("  text-align:center;\n");
      out.write("  background: linear-gradient(to right,  #2b40ff,#07121a);\n");
      out.write("}\n");
      out.write("\n");
      out.write("h1,h3{\n");
      out.write("color: white;\n");
      out.write("margin:15px;\n");
      out.write("}\n");
      out.write("input, button {\n");
      out.write("  font-size:40px;\n");
      out.write("  color: white;\n");
      out.write("  border-radius: 5%;\n");
      out.write("  background-color: black;\n");
      out.write("  border: 2px solid white;\n");
      out.write("}\n");
      out.write("\n");
      out.write("img{\n");
      out.write("width: 20%;\n");
      out.write("height:20%;\n");
      out.write("margin-top: 20px;\n");
      out.write("}\n");
      out.write("img:hover{\n");
      out.write("  -ms-transform: scale(1.1); /* IE 9 */\n");
      out.write("  -webkit-transform: scale(1.1); /* Safari 3-8 */\n");
      out.write("   transform: scale(1.1); \n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <img alt=\"\" src=\"\\images\\hello.gif\">\n");
      out.write("    <h1> Joke, Of the Day !</h1>\n");
      out.write("    <h1> 🤣 = ");
      out.print( request.getParameter("joke"));
      out.write("</h3>\n");
      out.write("\n");
      out.write("    \n");
      out.write("    <form action=\"MyServlet\" method=\"Post\">\n");
      out.write("    <input name=\"num1\" placeholder=\"First Number\"></input>\n");
      out.write("    <input name=\"num2\" placeholder=\"Second Number\"> </input>\n");
      out.write("    <button name=\"bt1\" value=\"1\"> + </button>\n");
      out.write("    <button name=\"bt1\" value=\"2\"> - </button>\n");
      out.write("    <button name=\"bt1\" value=\"3\"> * </button>\n");
      out.write("    <button name=\"bt1\" value=\"4\"> / </button>\n");
      out.write("</form>\n");
      out.write("    <h1> Ans=");
      out.print(request.getParameter("ans"));
      out.write(" </h1>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
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
