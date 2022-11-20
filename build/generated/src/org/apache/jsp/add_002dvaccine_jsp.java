package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class add_002dvaccine_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "content/header-admin.jsp", out, false);
      out.write('\n');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "content/colum-left-admin.jsp", out, false);
      out.write('\n');
      dao.DAO v = null;
      synchronized (_jspx_page_context) {
        v = (dao.DAO) _jspx_page_context.getAttribute("v", PageContext.PAGE_SCOPE);
        if (v == null){
          v = new dao.DAO();
          _jspx_page_context.setAttribute("v", v, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("    <div class=\"pagetitle\">\n");
      out.write("        <h2>Chọn loại vaccine</h2>\n");
      out.write("        <nav>\n");
      out.write("            <ol class=\"breadcrumb\">\n");
      out.write("                <li class=\"breadcrumb-item\"><a href=\"home-admin-page.jsp\">Trang chủ</a></li>\n");
      out.write("                ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            <li class=\"breadcrumb-item active\">Chọn vaccine</li>\n");
      out.write("        </ol>\n");
      out.write("    </nav>\n");
      out.write("</div><!-- chọn vaccine Title -->\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "content/table-vaccine.jsp", out, false);
      out.write("\n");
      out.write("    <div class=\"card-box\">\n");
      out.write("        <form action=\"addvacfdlll\n");
      out.write("              \n");
      out.write("              á;sldkcine\" method=\"post\">\n");
      out.write("            <h5 class=\"card-title\">Chọn loại vaccine bạn muốn tiêm</h5>\n");
      out.write("            \n");
      out.write("        <input name=\"aid\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"hidden\">\n");
      out.write("        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    </form>\n");
      out.write("</div>\n");
      out.write("<style>\n");
      out.write("    .pagetitle{\n");
      out.write("        margin-left: 20%;\n");
      out.write("        margin-top: 5%;\n");
      out.write("    }\n");
      out.write("    .card-box {\n");
      out.write("        margin-left: 25%;\n");
      out.write("        margin-top: 3%;\n");
      out.write("        margin-right: 5%;\n");
      out.write("        background-color: #d5dbfc;\n");
      out.write("        margin-bottom: 5%;\n");
      out.write("    }\n");
      out.write("    .add-vaccine{\n");
      out.write("\n");
      out.write("        font-family: \"Raleway\", sans-serif;\n");
      out.write("        font-weight: 500;\n");
      out.write("        font-size: 16px;\n");
      out.write("        letter-spacing: 1px;\n");
      out.write("        display: inline-block;\n");
      out.write("        padding: 8px 28px;\n");
      out.write("        border-radius: 3px;\n");
      out.write("        transition: 0.5s;\n");
      out.write("        margin-top: 30px;\n");
      out.write("        color: #fff;\n");
      out.write("        background: #eb5d1e;\n");
      out.write("\n");
      out.write("        text-align: center;\n");
      out.write("        margin-top: 10px;\n");
      out.write("    }\n");
      out.write("</style>\n");
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
        out.write("                <li class=\"breadcrumb-item\">Quản trị viên</li>\n");
        out.write("                ");
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
        out.write("                <li class=\"breadcrumb-item\">Thông tin</li>\n");
        out.write("                ");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${v.allVaccin}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("o");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("            <div class=\"card-body\">\n");
          out.write("\n");
          out.write("                \n");
          out.write("                <!-- List group With Checkboxes and radios -->\n");
          out.write("                <ul class=\"list-group\">\n");
          out.write("                    <li class=\"list-group-item\">\n");
          out.write("                        <input name=\"mavaccin\" class=\"form-check-input me-1\" type=\"checkbox\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.mavaccin}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" aria-label=\"...\">\n");
          out.write("                        ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.vaccin}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("/ \n");
          out.write("                        \n");
          out.write("                        <input value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" type=\"text\" name=\"price\" readonly>\n");
          out.write("                    </li>\n");
          out.write("\n");
          out.write("                </ul>\n");
          out.write("                <input type=\"submit\" class=\"add-vaccine\" value=\"Chọn\" >\n");
          out.write("\n");
          out.write("            </div>\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
