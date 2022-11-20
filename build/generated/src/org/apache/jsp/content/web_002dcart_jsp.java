package org.apache.jsp.content;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class web_002dcart_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<div class=\"uni-cart\">\n");
      out.write("    <div id=\"wrapper-container\" class=\"site-wrapper-container\">\n");
      out.write("        <div id=\"main-content\" class=\"site-main-content\">\n");
      out.write("            <div class=\"site-content-area\">\n");
      out.write("\n");
      out.write("                <div class=\"uni-banner-default uni-background-1\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <!-- Page title -->\n");
      out.write("                        <div class=\"page-title\">\n");
      out.write("                            <div class=\"page-title-inner\">\n");
      out.write("                                <h1>Đơn hàng của bạn!</h1>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <main id=\"main\" class=\"site-main\">\n");
      out.write("                    <div class=\"uni-cart-body\">\n");
      out.write("                        <div id=\"post\" class=\"container\">\n");
      out.write("                            <div class=\"entry-content\">\n");
      out.write("                                <div class=\"woocommerce\">\n");
      out.write("                                    <form class=\"woocommerce-cart-form\" method=\"post\">\n");
      out.write("                                        <table class=\"woocommerce-cart-form__contents table shop_table_responsive\">\n");
      out.write("                                            <thead>\n");
      out.write("                                                <tr>\n");
      out.write("                                                    <th class=\"product-remove\"></th>\n");
      out.write("                                                    <th class=\"product-name\">Loại Vaccine</th>\n");
      out.write("                                                    <th class=\"product-price\">Giá</th>\n");
      out.write("                                                    <th class=\"product-quantity\">Số lượng</th>\n");
      out.write("                                                    <th class=\"product-subtotal\">Tổng cộng</th>\n");
      out.write("                                                </tr>\n");
      out.write("                                            </thead>\n");
      out.write("\n");
      out.write("                                            <tbody>\n");
      out.write("\n");
      out.write("                                                <tr class=\"woocommerce-cart-form__cart-item cart_item\">\n");
      out.write("                                                    <td class=\"product-remove\">\n");
      out.write("                                                        <a href=\"#\" class=\"remove\"><i class=\"fa fa-times-circle\" aria-hidden=\"true\"></i></a>\n");
      out.write("                                                    </td>\n");
      out.write("                                                    <td class=\"product-name\">\n");
      out.write("                                                        <span class=\"product-thumbnail\">\n");
      out.write("                                                            <a href=\"#\">\n");
      out.write("                                                                <img src=\"images/shop/img-4.png\" alt=\"\" class=\"attachment-shop_thumbnail size-shop_thumbnail wp-post-image img-responsive\">\n");
      out.write("                                                            </a>\n");
      out.write("                                                        </span>\n");
      out.write("                                                        <a href=\"#\">Redufluxes</a>\n");
      out.write("                                                    </td>\n");
      out.write("                                                    <td class=\"product-price\">\n");
      out.write("                                                        <span class=\"woocommerce-Price-amount amount\">\n");
      out.write("                                                            <span class=\"woocommerce-Price-currencySymbol\">$</span>\n");
      out.write("                                                            26.00\n");
      out.write("                                                        </span>\n");
      out.write("                                                    </td>\n");
      out.write("                                                    <td class=\"product-quantity\">\n");
      out.write("                                                        <div class=\"quantity\">\n");
      out.write("                                                            <input type=\"number\" class=\"qty\" min=\"0\"  value=\"1\">\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </td>\n");
      out.write("                                                    <td class=\"product-subtotal\">\n");
      out.write("                                                        <div class=\"woocommerce-Price-amount amount\">\n");
      out.write("                                                            <span class=\"woocommerce-Price-currencySymbol\">$</span>\n");
      out.write("                                                            26.00\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </td>\n");
      out.write("                                                </tr>\n");
      out.write("\n");
      out.write("                                                <tr class=\"woocommerce-cart-form__cart-item cart_item\">\n");
      out.write("                                                    <td class=\"product-remove\">\n");
      out.write("                                                        <a href=\"#\" class=\"remove\"><i class=\"fa fa-times-circle\" aria-hidden=\"true\"></i></a>\n");
      out.write("                                                    </td>\n");
      out.write("                                                    <td class=\"product-name\">\n");
      out.write("                                                        <span class=\"product-thumbnail\">\n");
      out.write("                                                            <a href=\"#\">\n");
      out.write("                                                                <img src=\"images/shop/img.png\" alt=\"\" class=\"attachment-shop_thumbnail size-shop_thumbnail wp-post-image img-responsive\">\n");
      out.write("                                                            </a>\n");
      out.write("                                                        </span>\n");
      out.write("                                                        <a href=\"#\">Sperm Plus</a>\n");
      out.write("                                                    </td>\n");
      out.write("                                                    <td class=\"product-price\">\n");
      out.write("                                                        <span class=\"woocommerce-Price-amount amount\">\n");
      out.write("                                                            <span class=\"woocommerce-Price-currencySymbol\">$</span>\n");
      out.write("                                                            26.00\n");
      out.write("                                                        </span>\n");
      out.write("                                                    </td>\n");
      out.write("                                                    <td class=\"product-quantity\">\n");
      out.write("                                                        <div class=\"quantity\">\n");
      out.write("                                                            <input type=\"number\" class=\"qty\" min=\"0\" value=\"1\">\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </td>\n");
      out.write("                                                    <td class=\"product-subtotal\">\n");
      out.write("                                                        <div class=\"woocommerce-Price-amount amount\">\n");
      out.write("                                                            <span class=\"woocommerce-Price-currencySymbol\">$</span>\n");
      out.write("                                                            26.00\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </td>\n");
      out.write("                                                </tr>\n");
      out.write("                                            </tbody>\n");
      out.write("\n");
      out.write("                                            <tfoot>\n");
      out.write("                                                <tr>\n");
      out.write("                                                    <td class=\"actions\" colspan=\"5\">\n");
      out.write("                                                        <div class=\"coupon\">\n");
      out.write("\n");
      out.write("                                                        </div>\n");
      out.write("                                                        <input type=\"submit\" class=\"button\" name=\"update_cart\" value=\"Cập nhập đơn hàng\">\n");
      out.write("                                                    </td>\n");
      out.write("                                                </tr>\n");
      out.write("                                            </tfoot>\n");
      out.write("                                        </table>\n");
      out.write("                                    </form>\n");
      out.write("\n");
      out.write("                                    <div class=\"cart-collaterals\">\n");
      out.write("                                        <div class=\"row\">\n");
      out.write("                                            <div class=\"col-md-6\">\n");
      out.write("                                                <div class=\"cart_totals\">\n");
      out.write("                                                    <h2>Cart totals</h2>\n");
      out.write("                                                    <table class=\"shop_table shop_table_responsive\">\n");
      out.write("                                                        <tbody><tr class=\"cart-subtotal\">\n");
      out.write("                                                                <th>Subtotal</th>\n");
      out.write("                                                                <td><span class=\"woocommerce-Price-amount amount\"><span class=\"woocommerce-Price-currencySymbol\">£</span>15.00</span></td>\n");
      out.write("                                                            </tr>\n");
      out.write("                                                            <tr class=\"order-total\">\n");
      out.write("                                                                <th>Total</th>\n");
      out.write("                                                                <td><strong><span class=\"woocommerce-Price-amount amount\"><span class=\"woocommerce-Price-currencySymbol\">£</span>15.00</span></strong> </td>\n");
      out.write("                                                            </tr>\n");
      out.write("                                                        </tbody>\n");
      out.write("                                                    </table>\n");
      out.write("\n");
      out.write("                                                    <div class=\"wc-proceed-to-checkout\">\n");
      out.write("                                                        <a href=\"#\" class=\"checkout-button button alt wc-forward\">Tiến hành thanh toán</a>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </main>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </div>");
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
