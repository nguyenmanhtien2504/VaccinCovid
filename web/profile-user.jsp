<%-- 
    Document   : profile-user 
    Created on : Oct 28, 2021, 10:01:25 PM
    Author     : Admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<c:if test="${sessionScope.acc.isadmin == 1}">
    <title>Hồ sơ - Quản trị viên</title>
</c:if>
<c:if test="${sessionScope.acc.isuser == 1}">
    <title> Hồ sơ - Của bạn</title>
</c:if>
<jsp:include page="content/header-admin.jsp"></jsp:include>
<jsp:include page="content/colum-left-admin.jsp"></jsp:include>
<jsp:useBean id="va" class="dao.DAO"></jsp:useBean>
    <main id="main" class="main">

        <div class="pagetitle">
            <h1>Hồ sơ cá nhân</h1>
            <nav>
                <ol class="breadcrumb">
                    <li class="breadcrumb-item"><a href="home-admin-page.jsp">Trang chủ</a></li>
                    <c:if test="${sessionScope.acc.isadmin == 1}">
                    <li class="breadcrumb-item">Quản trị viên</li>
                    </c:if>
                    <c:if test="${sessionScope.acc.isuser == 1}">
                    <li class="breadcrumb-item">User</li>
                    </c:if>
                <li class="breadcrumb-item active">Hồ sơ</li>
            </ol>
        </nav>
    </div><!-- End Page Title -->

    <section class="section profile">
        <div class="row">
            <div class="col-xl-4">

                <div class="card">
                    <div class="card-body profile-card pt-4 d-flex flex-column align-items-center">

                        <img src="${acc.img}" alt="Profile" class="rounded-circle">
                        <h2>${sessionScope.acc.fullname}</h2>
                        <c:if test="${sessionScope.acc.isadmin == 1}">
                            <span>Admin</span>
                        </c:if>
                        <c:if test="${sessionScope.acc.isuser == 1}">
                            <span>User</span>
                        </c:if>
                        <div class="social-links mt-2">
                            <a href="#" class="twitter"><i class="bi bi-twitter"></i></a>
                            <a href="#" class="facebook"><i class="bi bi-facebook"></i></a>
                            <a href="#" class="instagram"><i class="bi bi-instagram"></i></a>
                            <a href="#" class="linkedin"><i class="bi bi-linkedin"></i></a>
                        </div>
                    </div>
                </div>

            </div>

            <div class="col-xl-8">

                <div class="card">
                    <div class="card-body pt-3">
                        <!-- Bordered Tabs -->
                        <ul class="nav nav-tabs nav-tabs-bordered">

                            <li class="nav-item">
                                <button class="nav-link active" data-bs-toggle="tab" data-bs-target="#profile-overview">Thông tin</button>
                            </li>

                            <li class="nav-item">
                                <button class="nav-link" data-bs-toggle="tab" data-bs-target="#profile-edit">Chỉnh sửa hồ sơ</button>
                            </li>
                            <li class="nav-item">
                                <button class="nav-link" data-bs-toggle="tab" data-bs-target="#profile-change-password">Thay đổi tên đăng nhập và mật khẩu</button>
                            </li>


                        </ul>
                        <div class="tab-content pt-2">

                            <div class="tab-pane fade show active profile-overview" id="profile-overview">


                                <h5 class="card-title"></h5>
                                <p class="text-danger">${MES}</p>
                                <p class="text-danger">${mess}</p>
                                <p class="text-danger">${me}</p>
                                <div class="row mb-3">
                                    <div class="col-md-8 col-lg-9">
                                        <input name="id" type="hidden" class="form-control" id="id" value="${sessionScope.acc.id}">
                                    </div>
                                </div>
                                <div class="row">
                                    <label class="col-lg-3 col-md-4 label " >Tên đăng nhập </label>
                                    <div class="col-lg-9 col-md-8">${sessionScope.acc.username}</div>
                                </div>

                                <div class="row">
                                    <label class="col-lg-3 col-md-4 label " >Họ và Tên</label>
                                    <div class="col-lg-9 col-md-8">${sessionScope.acc.fullname}</div>
                                </div>

                                <div class="row">
                                    <label class="col-lg-3 col-md-4 label " >Mật khẩu</label>
                                    <div class="col-lg-9 col-md-8">${sessionScope.acc.passwword}</div>
                                </div>

                                <div class="row">
                                    <label class="col-lg-3 col-md-4 label " >Địa chỉ email</label>
                                    <div class="col-lg-9 col-md-8">${sessionScope.acc.email}</div>
                                </div>

                                <div class="row">
                                    <label class="col-lg-3 col-md-4 label " >Tuổi </label>
                                    <div class="col-lg-9 col-md-8">${sessionScope.acc.age}</div>
                                </div>

                                <div class="row">
                                    <label class="col-lg-3 col-md-4 label " >Giới tính </label>
                                    <div class="col-lg-9 col-md-8">${sessionScope.acc.gender}</div>
                                </div>

                                <div class="row">
                                    <label class="col-lg-3 col-md-4 label " >Số CMND/CCCD/HC</label>
                                    <div class="col-lg-9 col-md-8">${sessionScope.acc.cmnd}</div>
                                </div>
                                <div class="row">
                                    <label class="col-lg-3 col-md-4 label " >Số điện thoại</label>
                                    <div class="col-lg-9 col-md-8">${sessionScope.acc.phonenum}</div>
                                </div>
                                <div class="row">
                                    <label class="col-lg-3 col-md-4 label " >Địa chỉ</label>
                                    <div class="col-lg-9 col-md-8">${sessionScope.acc.address}</div>
                                </div>
                                <div class="row">
                                    <label class="col-lg-3 col-md-4 label " >Vaccine</label>
                                    <div class="col-lg-9 col-md-8">${sessionScope.acc.mavaccin}</div>
                                </div>
                            </div> <!--Show thông tin cá nhân end -->

                            <div class="tab-pane fade profile-edit pt-3" id="profile-edit">

                                <!-- Profile Edit Form --><!-- Form chỉnh sửa thông tin -->
                                <form action="update" method="post">
                                    <div class="row mb-3">
                                        <div class="col-md-8 col-lg-9">
                                            <input name="id" type="hidden" class="form-control" id="id" value="${sessionScope.acc.id}">
                                        </div>
                                    </div>
                                    <div class="row mb-3">
                                        <label for="profileImage" class="col-md-4 col-lg-3 col-form-label">Ảnh đại diện</label>
                                        <div class="col-md-8 col-lg-9">
                                            <img src="${sessionScope.acc.img}" alt="Profile">
                                            <!--                                            <div class="pt-2">
                                                                                            <a href="#" class="btn btn-primary btn-sm" title="Upload new profile image"><i class="bi bi-upload"></i></a>
                                                                                            <a href="#" class="btn btn-danger btn-sm" title="Remove my profile image"><i class="bi bi-trash"></i></a>
                                                                                        </div>-->
                                            <div class="col-md-8 col-lg-9">
                                                <input name="img" class="form-control" id="img" value="${sessionScope.acc.img}">
                                            </div>
                                        </div>
                                    </div>

                                    <div class="row mb-3">
                                        <label for="fullname" class="col-md-4 col-lg-3 col-form-label">Họ và Tên</label>
                                        <div class="col-md-8 col-lg-9">
                                            <input name="fullname" class="form-control" id="fullname" value="${sessionScope.acc.fullname}">
                                        </div>
                                    </div>
                                    <div class="row mb-3">
                                        <label for="email" class="col-md-4 col-lg-3 col-form-label">Địa chỉ email</label>
                                        <div class="col-md-8 col-lg-9">
                                            <input name="email" type="email" class="form-control" id="email" value="${sessionScope.acc.email}">
                                        </div>
                                    </div>

                                    <div class="row mb-3">
                                        <label for="age" class="col-md-4 col-lg-3 col-form-label">Tuổi</label>
                                        <div class="col-md-8 col-lg-9">
                                            <input name="age" type="text" class="form-control" id="age" value="${sessionScope.acc.age}">
                                        </div>
                                    </div>

                                    <div class="row mb-3">
                                        <label for="gender" class="col-md-4 col-lg-3 col-form-label">Giới tính</label>
                                        <div class="col-md-8 col-lg-9">
                                            <select class="form-control"  id="gender" name="gender">
                                                <option  >${sessionScope.acc.gender}</option>
                                                <option >Nam</option>
                                                <option >Nữ</option>
                                                <option >Khác</option>
                                            </select>
                                        </div>
                                    </div>

                                    <div class="row mb-3">
                                        <label for="Phone" class="col-md-4 col-lg-3 col-form-label">Số điện thoại</label>
                                        <div class="col-md-8 col-lg-9">
                                            <input name="phonenum" type="text" class="form-control" id="phonenum" value="${sessionScope.acc.phonenum}">
                                        </div>
                                    </div>

                                    <div class="row mb-3">
                                        <label for="cmnd" class="col-md-4 col-lg-3 col-form-label">Số CMND/CCCD/HC</label>
                                        <div class="col-md-8 col-lg-9">
                                            <input name="cmnd" type="text" class="form-control" id="cmnd" value="${sessionScope.acc.cmnd}">
                                        </div>
                                    </div>

                                    <div class="row mb-3">
                                        <label for="address" class="col-md-4 col-lg-3 col-form-label">Địa chỉ</label>
                                        <div class="col-md-8 col-lg-9">
                                            <input name="address" type="text" class="form-control" id="address" value="${sessionScope.acc.address}">
                                        </div>
                                        <div class="text-center">
                                            <button type="submit" class="btn btn-primary">Lưu thay đổi</button>
                                        </div>

                                </form><!-- End Profile Edit Form --><!-- end chỉn sửa thông tin -->

                            </div>

                            <div class="tab-pane fade pt-3" id="profile-settings">


                            </div>
                        </div>
                        <div class="tab-pane fade pt-3" id="profile-change-password">
                            <form action="updatepass" method="POST">
                                <div class="row mb-3">
                                    <div class="col-md-8 col-lg-9">
                                        <input name="id" type="hidden" class="form-control" id="id" value="${sessionScope.acc.id}">
                                    </div>
                                </div>
                                <div class="row mb-3">
                                    <label for="username" class="col-md-4 col-lg-3 col-form-label">Tên đăng nhập</label>
                                    <div class="col-md-8 col-lg-9">
                                        <input name="username" type="text" class="form-control" id="username" value="${sessionScope.acc.username}">
                                    </div>
                                </div>
                                <div class="row mb-3">
                                    <label for="ollpassword" class="col-md-4 col-lg-3 col-form-label">Mật khẩu hiện tại</label>
                                    <div class="col-md-8 col-lg-9">
                                        <input name="ollpassword" type="text" class="form-control" id="ollpassword" value="${sessionScope.acc.passwword}">
                                    </div>
                                </div>
                                <div class="row mb-3">
                                    <label for="password" class="col-md-4 col-lg-3 col-form-label">Mật khẩu mới</label>
                                    <div class="col-md-8 col-lg-9">
                                        <input name="password" type="text" class="form-control" id="password" >
                                    </div>
                                </div>
                                <div class="row mb-3">
                                    <label for="password" class="col-md-4 col-lg-3 col-form-label">Nhập lại mật khẩu</label>
                                    <div class="col-md-8 col-lg-9">
                                        <input name="renewpassword" type="text" class="form-control" id="renewpassword" >
                                    </div>
                                </div>
                                <div class="text-center">
                                    <button type="submit" class="btn btn-primary">Thay đổi</button>
                                </div>
                            </form> 

                        </div>

                    </div><!-- End Bordered Tabs -->

                </div>
            </div>

        </div>
        </div>
    </section>

</main><!-- End #main -->