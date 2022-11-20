package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_002dadmin_002dpage_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "content/header-admin.jsp", out, false);
      out.write('\n');
      out.write('\n');
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write('\n');
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "content/colum-left-admin.jsp", out, false);
      out.write('\n');
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
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc.isuser == 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("<div class=\"user-home\">\n");
        out.write("    <div class=\"user-img\">\n");
        out.write("        <img src=\"images/user-page.svg\" class=\"\" alt=\"\">\n");
        out.write("        <div>\n");
        out.write("            <a href=\"add-vaccine.jsp\" class=\"add\">Chọn vaccine</a>\n");
        out.write("        </div>\n");
        out.write("    </div>\n");
        out.write("</div>\n");
        out.write("\n");
        out.write("<style> \n");
        out.write("    .user-img img {\n");
        out.write("        width: 70%;\n");
        out.write("        height: 68%;\n");
        out.write("        margin-top: 5%;\n");
        out.write("        margin-left: 38%;\n");
        out.write("\n");
        out.write("    }\n");
        out.write("    .user-home {\n");
        out.write("        display: flex;\n");
        out.write("        text-align: center;\n");
        out.write("\n");
        out.write("    }\n");
        out.write("    .user-home .add {\n");
        out.write("        font-family: \"Raleway\", sans-serif;\n");
        out.write("        font-weight: 500;\n");
        out.write("        font-size: 16px;\n");
        out.write("        letter-spacing: 1px;\n");
        out.write("        display: inline-block;\n");
        out.write("        padding: 8px 28px;\n");
        out.write("        border-radius: 3px;\n");
        out.write("        transition: 0.5s;\n");
        out.write("        margin-top: 50px;\n");
        out.write("        color: #fff;\n");
        out.write("        background: #4154f1;\n");
        out.write("        margin-left: 37%;\n");
        out.write("    }\n");
        out.write("</style>\n");
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
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc.isadmin == 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("    <div class=\"admin-home\">\n");
        out.write("        <div class=\"admin-img\">\n");
        out.write("            <img src=\"images/admin-page.svg\" class=\"\" alt=\"\">\n");
        out.write("            <div>\n");
        out.write("                <a href=\"add-vaccine.jsp\" class=\"add\">Chọn vaccine</a>\n");
        out.write("            </div>\n");
        out.write("        </div>\n");
        out.write("    </div>\n");
        out.write("    <style> \n");
        out.write("        .admin-img img {\n");
        out.write("            width: 70%;\n");
        out.write("            height: 68%;\n");
        out.write("            margin-top: 5%;\n");
        out.write("            margin-left: 33%;\n");
        out.write("\n");
        out.write("        }\n");
        out.write("        .admin-home {\n");
        out.write("            display: flex;\n");
        out.write("            text-align: center;\n");
        out.write("\n");
        out.write("        }\n");
        out.write("        .admin-home .add {\n");
        out.write("            font-family: \"Raleway\", sans-serif;\n");
        out.write("            font-weight: 500;\n");
        out.write("            font-size: 16px;\n");
        out.write("            letter-spacing: 1px;\n");
        out.write("            display: inline-block;\n");
        out.write("            padding: 8px 28px;\n");
        out.write("            border-radius: 3px;\n");
        out.write("            transition: 0.5s;\n");
        out.write("            margin-top: 50px;\n");
        out.write("            color: #fff;\n");
        out.write("            background: #4154f1;\n");
        out.write("            margin-left: 45%;\n");
        out.write("        }\n");
        out.write("\n");
        out.write("    </style>\n");
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
}
