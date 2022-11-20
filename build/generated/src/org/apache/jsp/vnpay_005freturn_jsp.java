package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.vnpay.common.Config;
import java.util.Iterator;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Map;
import java.util.HashMap;

public final class vnpay_005freturn_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("        <title>VNPAY RESPONSE</title>\n");
      out.write("        <!-- Bootstrap core CSS -->\n");
      out.write("        <link href=\"/vnpay_jsp/assets/bootstrap.min.css\" rel=\"stylesheet\"/>\n");
      out.write("        <!-- Custom styles for this template -->\n");
      out.write("        <link href=\"/vnpay_jsp/assets/jumbotron-narrow.css\" rel=\"stylesheet\"> \n");
      out.write("        <script src=\"/vnpay_jsp/assets/jquery-1.11.3.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            //Begin process return from VNPAY
            Map fields = new HashMap();
            for (Enumeration params = request.getParameterNames(); params.hasMoreElements();) {
                String fieldName = (String) params.nextElement();
                String fieldValue = request.getParameter(fieldName);
                if ((fieldValue != null) && (fieldValue.length() > 0)) {
                    fields.put(fieldName, fieldValue);
                }
            }

            String vnp_SecureHash = request.getParameter("vnp_SecureHash");
            if (fields.containsKey("vnp_SecureHashType")) {
                fields.remove("vnp_SecureHashType");
            }
            if (fields.containsKey("vnp_SecureHash")) {
                fields.remove("vnp_SecureHash");
            }
            String signValue = Config.hashAllFields(fields);

        
      out.write("\n");
      out.write("        <!--Begin display -->\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"header clearfix\">\n");
      out.write("                <h3 class=\"text-muted\">VNPAY RESPONSE</h3>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"table-responsive\">\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label >Mã đơn hàng:</label>\n");
      out.write("                    <label>");
      out.print(request.getParameter("vnp_TxnRef"));
      out.write("</label>\n");
      out.write("                </div>    \n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label >Số tiền:</label>\n");
      out.write("                    <label>");
      out.print(request.getParameter("vnp_Amount"));
      out.write("</label>\n");
      out.write("                </div>  \n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label >Nội dung thanh toán:</label>\n");
      out.write("                    <label>");
      out.print(request.getParameter("vnp_OrderInfo"));
      out.write("</label>\n");
      out.write("                </div> \n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label >Mã phản hồi (vnp_ResponseCode):</label>\n");
      out.write("                    <label>");
      out.print(request.getParameter("vnp_ResponseCode"));
      out.write("</label>\n");
      out.write("                </div> \n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label >Mã GD Tại VNPAY:</label>\n");
      out.write("                    <label>");
      out.print(request.getParameter("vnp_TransactionNo"));
      out.write("</label>\n");
      out.write("                </div> \n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label >Mã Ngân hàng:</label>\n");
      out.write("                    <label>");
      out.print(request.getParameter("vnp_BankCode"));
      out.write("</label>\n");
      out.write("                </div> \n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label >Thời gian thanh toán:</label>\n");
      out.write("                    <label>");
      out.print(request.getParameter("vnp_PayDate"));
      out.write("</label>\n");
      out.write("                </div> \n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label >Kết quả:</label>\n");
      out.write("                    <label>\n");
      out.write("                        ");

                            if (signValue.equals(vnp_SecureHash)) {
                                if ("00".equals(request.getParameter("vnp_ResponseCode"))) {
                                    out.print("GD Thanh cong");
                                } else {
                                    out.print("GD Khong thanh cong");
                                }

                            } else {
                                out.print("GD Thanh cong");
                            }
                        
      out.write("</label>\n");
      out.write("                        </div>\n");
      out.write("                        <a href=\"home-admin-page.jsp\" class=\"form-group2\"> Trang chủ</a>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("            <p>\n");
      out.write("                &nbsp;\n");
      out.write("            </p>\n");
      out.write("            <footer class=\"footer\">\n");
      out.write("                <p>&copy; VNPAY 2015</p>\n");
      out.write("            </footer>\n");
      out.write("        </div>  \n");
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
