package org.apache.jsp.content;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Cổng tiêm chủng</title>\n");
      out.write("        <link href=\"images/icons8-vaccine-65.png\" rel=\"icon\">\n");
      out.write("        <link href=\"bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"bootstrap-icons/bootstrap-icons.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/styleuser.css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header id=\"header\" class=\"fixed-top d-flex align-items-center\">\n");
      out.write("            <div class=\"container d-flex align-items-center justify-content-between\">\n");
      out.write("\n");
      out.write("                <div class=\"logo\">\n");
      out.write("                    <h1 class=\"text-light\"><a href=\"welcome-page.jsp\"><span>Cổng thông tin tiêm chủng</span></a></h1>\n");
      out.write("                    <!-- Uncomment below if you prefer to use an image logo -->\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <nav id=\"navbar\" class=\"navbar\">\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a class=\"nav-link scrollto active\" href=\"#hero\">Trang chủ</a></li>\n");
      out.write("                        <li><a class=\"nav-link scrollto\" href=\"sign-up-page.jsp\">Đăng ký tài khoản</a></li>\n");
      out.write("                        <li><a class=\"nav-link scrollto\" href=\"table-vaccine.jsp\">Tra cứu</a></li>\n");
      out.write("                        <li><a class=\"getstarted scrollto\" href=\"login-page.jsp\">Đăng nhập</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                    <i class=\"bi bi-list mobile-nav-toggle\"></i>\n");
      out.write("                </nav><!-- .navbar -->\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </header><!-- End Header -->\n");
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
