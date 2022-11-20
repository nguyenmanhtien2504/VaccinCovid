<%-- 
    Document   : login-page
    Created on : Oct 23, 2021, 10:43:46 PM
    Author     : Admin
--%>

<%@page import="model.CookieUtils"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <link href="images/icons8-vaccine-65.png" rel="icon">
        <!-- link login-page -->
        <link rel="stylesheet" href="fonts/material-icon/css/material-design-iconic-font.min.css">
        <link rel="stylesheet" href="css/styleform.css">

    </head>
    <body>
        <%
            String userName = CookieUtils.get("cookuser", request);
            String password = CookieUtils.get("cookpass", request);
            String rememberVal = CookieUtils.get("cookrem", request);
        %>
        <div class="main">
            <section class="sign-in">
                <div class="container">
                    <div class="signin-content">
                        <div class="signin-image">
                            <figure><img src="images/loginpage.svg" alt="sing up image"></figure>
                            <a href="sign-up-page.jsp" class="signup-image-link">Tôi chưa có tài khoản đăng nhập</a>
                        </div>

                        <div class="signin-form">
                            <h2 class="form-title">Đăng nhập</h2>
                            <p class="text-danger">${messi}</p>
                            <p class="text-danger">${mess}</p>
                            <form action="login" method="POST" class="register-form" id="login-form">
                                <div class="form-group">
                                    <label for="your_name"><i class="zmdi zmdi-account material-icons-name"></i></label>
                                    <input type="text" name="your_name" id="your_name" value="<%=userName%>" placeholder="Tên đăng nhập/Email"/>
                                </div>
                                <div class="form-group">
                                    <label for="your_pass"><i class="zmdi zmdi-lock"></i></label>
                                    <input type="password" name="your_pass" id="your_pass" value="<%=password%>" placeholder="Mật khẩu"/>
                                </div>
                                <div class="form-group">
                                    <input type="checkbox" value="1"<%= "1".equals(rememberVal.trim()) ? "checked=\"checked\"" : ""%>
                                           name="remember" id="remember-me" class="agree-term" />
                                    <label for="remember-me" class="label-agree-term"><span><span></span></span>Lưu mật khẩu</label>
                                </div>
                                <div class="form-group form-button">
                                    <input type="submit" name="signin" id="signin" class="form-submit" value="Đăng nhập"/>
                                </div>
                            </form>

                        </div>
                    </div>
                </div>
            </section>
        </div>

    </body>
</html>
