<%-- 
    Document   : colum-left-admin
    Created on : Oct 28, 2021, 9:59:51 PM
    Author     : Admin
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!-- ======= Sidebar ======= -->
<aside id="sidebar" class="sidebar">

    <ul class="sidebar-nav" id="sidebar-nav">

        <li class="nav-item">
            <a class="nav-link " href="home-admin-page.jsp">
                <i class="bi bi-grid"></i>
                <span>Trang chủ</span>
            </a>
        </li><!-- kết thúc trang chủ Nav -->
        <c:if test="${sessionScope.acc.isadmin == 1}">
            <li class="nav-item">
                <a class="nav-link collapsed" data-bs-target="#components-nav" data-bs-toggle="collapse" href="#">
                    <i class="bi bi-menu-button-wide"></i><span>Quyền quản trị viên</span><i class="bi bi-chevron-down ms-auto"></i>
                </a>
                <ul id="components-nav" class="nav-content collapse " data-bs-parent="#sidebar-nav">
                    <li>
                        <a href="load">
                            <i class="bi bi-circle"></i><span>Thông tin người dùng</span>
                        </a>
                    </li>
                    <li>

                        <a href="show">
                            <i class="bi bi-circle"></i><span>Danh sách tài khoản</span>
                        </a>
                    </li>

                </ul>
            </li><!-- End Components Nav -->
        </c:if>
        <li class="nav-heading">Pages</li>

        <li class="nav-item">
            <a class="nav-link collapsed" href="profile-user.jsp">
                <i class="bi bi-person"></i>
                <span>Hồ sơ</span>
            </a>
        </li><!-- End Profile Page Nav -->

        <li class="nav-item">
            <a class="nav-link collapsed" href="about-admin-team.jsp">
                <i class="bi bi-person"></i>
                <span>Team Admin</span>
            </a>
        </li><!-- End Profile Page Nav -->

    </ul>



</aside><!-- End Sidebar-->