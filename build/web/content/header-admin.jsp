
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <c:if test="${sessionScope.acc.isadmin == 1}">
        <title>Quản trị viên </title>
        </c:if>
        <c:if test="${sessionScope.acc.isuser == 1}">
        <title>Cổng tiêm chủng </title>
        </c:if>
        <!-- Favicons -->
        <link href="images/icons8-vaccine-65.png" rel="icon">
        <link href="bootstrap-icons/bootstrap-icons.css" rel="stylesheet">
        <!-- Google Fonts -->
        <link href="https://fonts.gstatic.com" rel="preconnect">
        <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Nunito:300,300i,400,400i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i" rel="stylesheet">
        <!-- Vendor CSS Files -->
        <link href="bootstrap/css/bootstrap.min.admin.css" rel="stylesheet">
        <link href="bootstrap/bootstrap-icons/bootstrap-icons.css" rel="stylesheet">

        <link href="css/styleadmin.css" rel="stylesheet">  

        <!-- Vendor JS Files -->
        <script src="bootstrap/js/bootstrap.bundle.js"></script>

        <!-- Template Main JS File -->
        <script src="js/main.js"></script>


    </head>
    <body>
        <!-- ======= Header ======= -->
        <header id="header" class="header fixed-top d-flex align-items-center">

            <div class="d-flex align-items-center justify-content-between">
                <a href="home-admin-page.jsp" class="logo d-flex align-items-center">
                    <img src="" alt="">
                    <span class="d-none d-lg-block">Cổng tiêm chủng</span>
                </a>
                <i class="bi bi-list toggle-sidebar-btn"></i>
            </div><!-- End Logo -->
            <div class="search-bar">
                <form class="search-form d-flex align-items-center" method="POST" action="searchcontroll?index=1">
                    <input type="text" name="serch" placeholder="Search" title="Enter search keyword">
                    <button type="submit" title="Search"><i class="bi bi-search"></i></button>
                </form>
            </div><!-- End Search Bar -->
            <nav class="header-nav ms-auto">
                <ul class="d-flex align-items-center">

                    <li class="nav-item d-block d-lg-none">
                        <a class="nav-link nav-icon search-bar-toggle " href="#">

                        </a>
                    </li><!-- End Search Icon-->
                    <li class="nav-item dropdown pe-3">

                        <a class="nav-link nav-profile d-flex align-items-center pe-0" href="#" data-bs-toggle="dropdown">
                            <img src="${sessionScope.acc.img}" alt="Profile" class="rounded-circle">
                            <span class="d-none d-md-block dropdown-toggle ps-2"></span>
                        </a>
                            <!-- End Profile Iamge Icon -->

                        <ul class="dropdown-menu dropdown-menu-end dropdown-menu-arrow profile">
                            <c:if test="${sessionScope.acc != null}">
                                <li class="dropdown-header">
                                    <h6><a href="profile-user.jsp">${sessionScope.acc.fullname}</a></h6>
                                    <c:if test="${sessionScope.acc.isadmin == 1}">
                                    <span>Admin</span>
                                    </c:if>
                                    <c:if test="${sessionScope.acc.isuser == 1}">
                                    <span>User</span>
                                    </c:if>
                                </li>
                            </c:if>
                            <li>
                                <hr class="dropdown-divider">
                            </li>
                            
                            <li>

                                <a class="dropdown-item d-flex align-items-center" href="profile-user.jsp">
                                    <i class="bi bi-person"></i>

                                    <span>Hồ sơ</span>
                                </a>
                            </li>
                            <li>
                                <hr class="dropdown-divider">
                            </li>
                            <li>
                                <a class="dropdown-item d-flex align-items-center" href="logout">
                                    <i class="bi bi-box-arrow-right"></i>
                                    <span>Thoát</span>
                                </a>
                            </li>

                        </ul><!-- End Profile Dropdown Items -->
                    </li><!-- End Profile Nav -->

                </ul>
            </nav><!-- End Icons Navigation -->

        </header><!-- End Header -->
    </body>
    <style>
        /*--------------------------------------------------------------
# Header
--------------------------------------------------------------*/
.logo {
  line-height: 1;
}
@media (min-width: 1200px) {
  .logo {
    width: 280px;
  }
}
.logo img {
  max-height: 26px;
  margin-right: 6px;
}
.logo span {
  font-size: 26px;
  font-weight: 700;
  color: #012970;
  font-family: "Nunito", sans-serif;
}

.header {
  transition: all 0.5s;
  z-index: 997;
  height: 60px;
  box-shadow: 0px 2px 20px rgba(1, 41, 112, 0.1);
  background-color: #fff;
  padding-left: 20px;
  /* Toggle Sidebar Button */
  /* Search Bar */
}
.header .toggle-sidebar-btn {
  font-size: 32px;
  padding-left: 10px;
  cursor: pointer;
  color: #012970;
}
.header .search-bar {
  min-width: 360px;
  padding: 0 20px;
}
@media (max-width: 1199px) {
  .header .search-bar {
    position: fixed;
    top: 50px;
    left: 0;
    right: 0;
    padding: 20px;
    box-shadow: 0px 0px 15px 0px rgba(1, 41, 112, 0.1);
    background: white;
    z-index: 9999;
    transition: 0.3s;
    visibility: hidden;
    opacity: 0;
  }
  .header .search-bar-show {
    top: 60px;
    visibility: visible;
    opacity: 1;
  }
}
.header .search-form {
  width: 100%;
}
.header .search-form input {
  border: 0;
  font-size: 14px;
  color: #012970;
  border: 1px solid rgba(1, 41, 112, 0.2);
  padding: 7px 38px 7px 8px;
  border-radius: 3px;
  transition: 0.3s;
  width: 100%;
}
.header .search-form input:focus, .header .search-form input:hover {
  outline: none;
  box-shadow: 0 0 10px 0 rgba(1, 41, 112, 0.15);
  border: 1px solid rgba(1, 41, 112, 0.3);
}
.header .search-form button {
  border: 0;
  padding: 0;
  margin-left: -30px;
  background: none;
}
.header .search-form button i {
  color: #012970;
}
    </style>
</html>
