

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<div class="uni-cart">
    <div id="wrapper-container" class="site-wrapper-container">
        <div id="main-content" class="site-main-content">
            <div class="site-content-area">

                <div class="uni-banner-default uni-background-1">
                    <div class="container">
                        <!-- Page title -->
                        <div class="page-title">
                            <div class="page-title-inner">
                                <h1>Đơn hàng của bạn!</h1>
                            </div>
                        </div>

                    </div>
                </div>

                <main id="main" class="site-main">
                    <div class="uni-cart-body">
                        <div id="post" class="container">
                            <div class="entry-content">
                                <div class="woocommerce">
                                    <form class="woocommerce-cart-form" method="post">
                                        <table class="woocommerce-cart-form__contents table shop_table_responsive">
                                            <thead>
                                                <tr>
                                                    <th class="product-remove"></th>
                                                    <th class="product-name">Loại Vaccine</th>
                                                    <th class="product-price">Giá</th>
                                                    <th class="product-quantity">Số lượng</th>
                                                    <th class="product-subtotal">Tổng cộng</th>
                                                </tr>
                                            </thead>

                                            <tbody>

                                                <tr class="woocommerce-cart-form__cart-item cart_item">
                                                    <td class="product-remove">
                                                        <a href="#" class="remove"><i class="fa fa-times-circle" aria-hidden="true"></i></a>
                                                    </td>
                                                    <td class="product-name">
                                                        <span class="product-thumbnail">
                                                            <a href="#">
                                                                <img src="images/shop/img-4.png" alt="" class="attachment-shop_thumbnail size-shop_thumbnail wp-post-image img-responsive">
                                                            </a>
                                                        </span>
                                                        <a href="#">Redufluxes</a>
                                                    </td>
                                                    <td class="product-price">
                                                        <span class="woocommerce-Price-amount amount">
                                                            <span class="woocommerce-Price-currencySymbol">$</span>
                                                            26.00
                                                        </span>
                                                    </td>
                                                    <td class="product-quantity">
                                                        <div class="quantity">
                                                            <input type="number" class="qty" min="0"  value="1">
                                                        </div>
                                                    </td>
                                                    <td class="product-subtotal">
                                                        <div class="woocommerce-Price-amount amount">
                                                            <span class="woocommerce-Price-currencySymbol">$</span>
                                                            26.00
                                                        </div>
                                                    </td>
                                                </tr>

                                                <tr class="woocommerce-cart-form__cart-item cart_item">
                                                    <td class="product-remove">
                                                        <a href="#" class="remove"><i class="fa fa-times-circle" aria-hidden="true"></i></a>
                                                    </td>
                                                    <td class="product-name">
                                                        <span class="product-thumbnail">
                                                            <a href="#">
                                                                <img src="images/shop/img.png" alt="" class="attachment-shop_thumbnail size-shop_thumbnail wp-post-image img-responsive">
                                                            </a>
                                                        </span>
                                                        <a href="#">Sperm Plus</a>
                                                    </td>
                                                    <td class="product-price">
                                                        <span class="woocommerce-Price-amount amount">
                                                            <span class="woocommerce-Price-currencySymbol">$</span>
                                                            26.00
                                                        </span>
                                                    </td>
                                                    <td class="product-quantity">
                                                        <div class="quantity">
                                                            <input type="number" class="qty" min="0" value="1">
                                                        </div>
                                                    </td>
                                                    <td class="product-subtotal">
                                                        <div class="woocommerce-Price-amount amount">
                                                            <span class="woocommerce-Price-currencySymbol">$</span>
                                                            26.00
                                                        </div>
                                                    </td>
                                                </tr>
                                            </tbody>

                                            <tfoot>
                                                <tr>
                                                    <td class="actions" colspan="5">
                                                        <div class="coupon">

                                                        </div>
                                                        <a href="add-vaccine.jsp">
                                                        <input type="submit" class="button" name="update_cart" value="Cập nhập đơn hàng">
                                                        </a>
                                                    </td>
                                                </tr>
                                            </tfoot>
                                        </table>
                                    </form>

                                    <div class="cart-collaterals">
                                        <div class="row">
                                            <div class="col-md-6">
                                                <div class="cart_totals">
                                                    <h2>Cart totals</h2>
                                                    <table class="shop_table shop_table_responsive">
                                                        <tbody><tr class="cart-subtotal">
                                                                <th>Subtotal</th>
                                                                <td><span class="woocommerce-Price-amount amount"><span class="woocommerce-Price-currencySymbol">£</span>15.00</span></td>
                                                            </tr>
                                                            <tr class="order-total">
                                                                <th>Total</th>
                                                                <td><strong><span class="woocommerce-Price-amount amount"><span class="woocommerce-Price-currencySymbol">£</span>15.00</span></strong> </td>
                                                            </tr>
                                                        </tbody>
                                                    </table>

                                                    <div class="wc-proceed-to-checkout">
                                                        <a href="#" class="checkout-button button alt wc-forward">Tiến hành thanh toán</a>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </main>

            </div>
        </div>

    </div>