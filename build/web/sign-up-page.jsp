<%-- 
    Document   : sign-up-page
    Created on : Oct 23, 2021, 10:50:42 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sign up</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <link href="images/icons8-vaccine-65.png" rel="icon">
        <!-- link login-page -->
        <link rel="stylesheet" href="fonts/material-icon/css/material-design-iconic-font.min.css">
        <link rel="stylesheet" href="css/styleform.css">
    </head>
    <body>

        <div class="main">
            <!-- Sign up form -->
            <section class="signup">
                <div class="container">
                    <div class="signup-content">
                        <div class="signup-form">
                            <h2 class="form-title">Đăng ký tài khoản</h2>
                            <form action="signup" method="POST" class="register-form" id="register-form">
                                
                                <p class="text-danger">${mes}</p>
                                <div class="form-group">
                                    <label for="name"><i class="zmdi zmdi-account material-icons-name"></i></label>
                                    <input type="text" name="username" id="username" placeholder="Tên đăng nhập"/>
                                </div>
                                <!--                                <div class="form-group">
                                                                    <label for="email"><i class="zmdi zmdi-email"></i></label>
                                                                    <input type="email" name="email" id="email" placeholder="Địa chỉ Email"/>
                                                                </div>-->
                                <div class="form-group">
                                    <label for="pass"><i class="zmdi zmdi-lock"></i></label>
                                    <input type="password" name="pass" id="pass" placeholder="Mật khẩu"/>
                                </div>

                                <p class="text-danger">${mess}</p>

                                <div class="form-group">
                                    <label for="re-pass"><i class="zmdi zmdi-lock-outline"></i></label>
                                    <input type="password" name="repass" id="re_pass" placeholder="Nhập lại mật khẩu"/>
                                </div>
                                <div class="form-group">    
                                    Họ và Tên    <input type="text" name="fullname" id="fullname" placeholder="Nguyễn Văn A"/>
                                </div>
                                <div class="form-group">
                                    Địa chỉ Email    <input type="email" name="email" id="email" placeholder="nguyenvana@gmail.com"/>
                                </div>
                                <div class="form-group">
                                    Tuổi    <input type="text" name="age" id="age" /> 
                                </div>
                                <div class="form-group">

                                    Giới tính    
                                    <select  id="gender" name="gender">
                                        <option  ></option>
                                        <option >Nam</option>
                                        <option >Nữ</option>
                                        <option >Khác</option>
                                    </select>
                                </div>
                                <div class="form-group">
                                    Số CMND/CCCD/HC   <input type="text" name="cmnd" id="cmnd" placeholder="Số CMND/CCCD/HC"/>
                                </div>
                                <!--                        <div class="form-group">
                                                            Mã BHYT    <input type="text" name="bhyt" id="bhyt" placeholder="Mã BHYT"/>
                                                        </div>-->
                                <div class="form-group">
                                    Số điện thoại    <input type="text" name="phone" id="phone" placeholder="Số điện thoại" />
                                </div>
                                <div class="form-group">
                                    Địa chỉ    <input type="text" name="address" id="address"  placeholder="số nhà,phường/xã,quận/huyện,tỉnh/tp"/>
                                </div>
                                <div class="form-group">
                                    Hình ảnh    <input type="text" name="image" id="image"  aria-label="Sizing example input" 
                                                       aria-describedby="inputGroup-sizing-default" placeholder="Link google photos or facebook"/>
                                </div>
                                <div class="form-group">
                                    <input type="checkbox" name="agree-term" id="agree-term" class="agree-term" />
                                    <label for="agree-term" class="label-agree-term"><span><span></span></span>Tôi đồng ý với các tuyên bố trên </label>
                                </div>

                                <div class="form-group form-button">
                                    <input type="submit" name="signup" id="signup" class="form-submit" value="Đăng ký"/>
                                </div>
                            </form>
                        </div>
                        <div class="signup-image">

                            <figure><img src="images/signupnpage.svg" alt="sing up image">
                                <img src="images/confim.svg" alt="sing up image"></figure>
                            <a href="login-page.jsp" class="signup-image-link">Tôi đã có tài khoản</a>
                        </div>
                        <!--                        <div class="signup-image">
                                                    <figure><img src="images/confim.svg" alt="sing up image"></figure>  
                                                </div>-->
                    </div>
                </div>
            </section>
        </div>

    </body>
</html>
