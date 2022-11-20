package org.apache.jsp.content;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_002dadmin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
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
      out.write("        ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        <!-- Favicons -->\n");
      out.write("        <link href=\"images/icons8-vaccine-65.png\" rel=\"icon\">\n");
      out.write("        <link href=\"bootstrap-icons/bootstrap-icons.css\" rel=\"stylesheet\">\n");
      out.write("        <!-- Google Fonts -->\n");
      out.write("        <link href=\"https://fonts.gstatic.com\" rel=\"preconnect\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Nunito:300,300i,400,400i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i\" rel=\"stylesheet\">\n");
      out.write("        <!-- Vendor CSS Files -->\n");
      out.write("        <link href=\"bootstrap/css/bootstrap.min.admin.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"bootstrap/bootstrap-icons/bootstrap-icons.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <link href=\"css/styleadmin.css\" rel=\"stylesheet\">  \n");
      out.write("\n");
      out.write("        <!-- Vendor JS Files -->\n");
      out.write("        <script src=\"bootstrap/js/bootstrap.bundle.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Template Main JS File -->\n");
      out.write("        <script src=\"js/main.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!-- ======= Header ======= -->\n");
      out.write("        <header id=\"header\" class=\"header fixed-top d-flex align-items-center\">\n");
      out.write("\n");
      out.write("            <div class=\"d-flex align-items-center justify-content-between\">\n");
      out.write("                <a href=\"home-admin-page.jsp\" class=\"logo d-flex align-items-center\">\n");
      out.write("                    <img src=\"\" alt=\"\">\n");
      out.write("                    <span class=\"d-none d-lg-block\">Cổng tiêm chủng</span>\n");
      out.write("                </a>\n");
      out.write("                <i class=\"bi bi-list toggle-sidebar-btn\"></i>\n");
      out.write("            </div><!-- End Logo -->\n");
      out.write("            <div class=\"search-bar\">\n");
      out.write("                <form class=\"search-form d-flex align-items-center\" method=\"POST\" action=\"searchcontroll?index=1\">\n");
      out.write("                    <input type=\"text\" name=\"serch\" placeholder=\"Search\" title=\"Enter search keyword\">\n");
      out.write("                    <button type=\"submit\" title=\"Search\"><i class=\"bi bi-search\"></i></button>\n");
      out.write("                </form>\n");
      out.write("            </div><!-- End Search Bar -->\n");
      out.write("            <nav class=\"header-nav ms-auto\">\n");
      out.write("                <ul class=\"d-flex align-items-center\">\n");
      out.write("\n");
      out.write("                    <li class=\"nav-item d-block d-lg-none\">\n");
      out.write("                        <a class=\"nav-link nav-icon search-bar-toggle \" href=\"#\">\n");
      out.write("\n");
      out.write("                        </a>\n");
      out.write("                    </li><!-- End Search Icon-->\n");
      out.write("                    <li class=\"nav-item dropdown pe-3\">\n");
      out.write("\n");
      out.write("                        <a class=\"nav-link nav-profile d-flex align-items-center pe-0\" href=\"#\" data-bs-toggle=\"dropdown\">\n");
      out.write("                            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc.img}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" alt=\"Profile\" class=\"rounded-circle\">\n");
      out.write("                            <span class=\"d-none d-md-block dropdown-toggle ps-2\"></span>\n");
      out.write("                        </a>\n");
      out.write("                            <!-- End Profile Iamge Icon -->\n");
      out.write("\n");
      out.write("                        <ul class=\"dropdown-menu dropdown-menu-end dropdown-menu-arrow profile\">\n");
      out.write("                            ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            <li>\n");
      out.write("                                <hr class=\"dropdown-divider\">\n");
      out.write("                            </li>\n");
      out.write("                            \n");
      out.write("                            <li>\n");
      out.write("\n");
      out.write("                                <a class=\"dropdown-item d-flex align-items-center\" href=\"profile-user.jsp\">\n");
      out.write("                                    <i class=\"bi bi-person\"></i>\n");
      out.write("\n");
      out.write("                                    <span>Hồ sơ</span>\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <hr class=\"dropdown-divider\">\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a class=\"dropdown-item d-flex align-items-center\" href=\"logout\">\n");
      out.write("                                    <i class=\"bi bi-box-arrow-right\"></i>\n");
      out.write("                                    <span>Thoát</span>\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("\n");
      out.write("                        </ul><!-- End Profile Dropdown Items -->\n");
      out.write("                    </li><!-- End Profile Nav -->\n");
      out.write("\n");
      out.write("                </ul>\n");
      out.write("            </nav><!-- End Icons Navigation -->\n");
      out.write("\n");
      out.write("        </header><!-- End Header -->\n");
      out.write("    </body>\n");
      out.write("    <style>\n");
      out.write("        /*--------------------------------------------------------------\n");
      out.write("# Header\n");
      out.write("--------------------------------------------------------------*/\n");
      out.write(".logo {\n");
      out.write("  line-height: 1;\n");
      out.write("}\n");
      out.write("@media (min-width: 1200px) {\n");
      out.write("  .logo {\n");
      out.write("    width: 280px;\n");
      out.write("  }\n");
      out.write("}\n");
      out.write(".logo img {\n");
      out.write("  max-height: 26px;\n");
      out.write("  margin-right: 6px;\n");
      out.write("}\n");
      out.write(".logo span {\n");
      out.write("  font-size: 26px;\n");
      out.write("  font-weight: 700;\n");
      out.write("  color: #012970;\n");
      out.write("  font-family: \"Nunito\", sans-serif;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".header {\n");
      out.write("  transition: all 0.5s;\n");
      out.write("  z-index: 997;\n");
      out.write("  height: 60px;\n");
      out.write("  box-shadow: 0px 2px 20px rgba(1, 41, 112, 0.1);\n");
      out.write("  background-color: #fff;\n");
      out.write("  padding-left: 20px;\n");
      out.write("  /* Toggle Sidebar Button */\n");
      out.write("  /* Search Bar */\n");
      out.write("}\n");
      out.write(".header .toggle-sidebar-btn {\n");
      out.write("  font-size: 32px;\n");
      out.write("  padding-left: 10px;\n");
      out.write("  cursor: pointer;\n");
      out.write("  color: #012970;\n");
      out.write("}\n");
      out.write(".header .search-bar {\n");
      out.write("  min-width: 360px;\n");
      out.write("  padding: 0 20px;\n");
      out.write("}\n");
      out.write("@media (max-width: 1199px) {\n");
      out.write("  .header .search-bar {\n");
      out.write("    position: fixed;\n");
      out.write("    top: 50px;\n");
      out.write("    left: 0;\n");
      out.write("    right: 0;\n");
      out.write("    padding: 20px;\n");
      out.write("    box-shadow: 0px 0px 15px 0px rgba(1, 41, 112, 0.1);\n");
      out.write("    background: white;\n");
      out.write("    z-index: 9999;\n");
      out.write("    transition: 0.3s;\n");
      out.write("    visibility: hidden;\n");
      out.write("    opacity: 0;\n");
      out.write("  }\n");
      out.write("  .header .search-bar-show {\n");
      out.write("    top: 60px;\n");
      out.write("    visibility: visible;\n");
      out.write("    opacity: 1;\n");
      out.write("  }\n");
      out.write("}\n");
      out.write(".header .search-form {\n");
      out.write("  width: 100%;\n");
      out.write("}\n");
      out.write(".header .search-form input {\n");
      out.write("  border: 0;\n");
      out.write("  font-size: 14px;\n");
      out.write("  color: #012970;\n");
      out.write("  border: 1px solid rgba(1, 41, 112, 0.2);\n");
      out.write("  padding: 7px 38px 7px 8px;\n");
      out.write("  border-radius: 3px;\n");
      out.write("  transition: 0.3s;\n");
      out.write("  width: 100%;\n");
      out.write("}\n");
      out.write(".header .search-form input:focus, .header .search-form input:hover {\n");
      out.write("  outline: none;\n");
      out.write("  box-shadow: 0 0 10px 0 rgba(1, 41, 112, 0.15);\n");
      out.write("  border: 1px solid rgba(1, 41, 112, 0.3);\n");
      out.write("}\n");
      out.write(".header .search-form button {\n");
      out.write("  border: 0;\n");
      out.write("  padding: 0;\n");
      out.write("  margin-left: -30px;\n");
      out.write("  background: none;\n");
      out.write("}\n");
      out.write(".header .search-form button i {\n");
      out.write("  color: #012970;\n");
      out.write("}\n");
      out.write("    </style>\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc.isadmin == 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("        <title>Quản trị viên </title>\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc.isuser == 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("        <title>Cổng tiêm chủng </title>\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(null);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                <li class=\"dropdown-header\">\n");
        out.write("                                    <h6><a href=\"profile-user.jsp\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc.fullname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</a></h6>\n");
        out.write("                                    ");
        if (_jspx_meth_c_if_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                    ");
        if (_jspx_meth_c_if_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                </li>\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_c_if_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_2);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc.isadmin == 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                    <span>Admin</span>\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_if_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
    return false;
  }

  private boolean _jspx_meth_c_if_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_4.setPageContext(_jspx_page_context);
    _jspx_th_c_if_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_2);
    _jspx_th_c_if_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc.isuser == 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
    if (_jspx_eval_c_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                    <span>User</span>\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_if_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
    return false;
  }
}
