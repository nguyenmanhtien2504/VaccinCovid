<%-- 
    Document   : Search-Result-Page
    Created on : Nov 6, 2021, 11:00:23 AM
    Author     : Admin
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="content/header-admin.jsp"></jsp:include>
    <!DOCTYPE html>
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="css/style.css">
    <div class="pagetitle">
        <h2>Chọn loại vaccine</h2>
        <nav>
            <ol class="breadcrumb">
                <li class="breadcrumb-item"><a href="home-admin-page.jsp">Trang chủ</a></li>
                <li class="breadcrumb-item active">Tìm kiếm người dùng</li>
            </ol>
        </nav>
    </div>
    <body>
        <table class="table table-striped table-hover">
            <thead>
                <tr>
                    <th></th>
                    <th>Tên</th>
                    <th>Email</th>
                    <th>Tuổi</th>
                    <th>Giới tính </th>
                    <th>Địa chỉ </th>
                    <th>Số điện thoại</th>
                    <th>Cmnd/Cccd/Hc</th>
                </tr>
            </thead>
            <tbody>
                <!-- Tìm theo tên-->   
            <c:forEach items="${listS}" var="S" >
                <tr>
                    <td><img src="${S.getImg()}" width="50px" height="50px"></td>
                    <td>${S.getFullname()}</td>
                    <td>${S.getEmail()}</td>
                    <td>${S.getAge()}</td>
                    <td>${S.getGender()}</td>
                    <td>${S.getAddress()}</td>
                    <td>${S.getPhonenum()}</td>
                    <td>${S.getCmnd()}</td>
                </tr> 
            </c:forEach>
            <!-- Tìm theo email-->   
            <c:forEach items="${listE}" var="E" >
<!--                <tr>
                    <td><img src="${E.getImg()}" width="50px" height="50px"></td>
                    <td>${E.getFullname()}</td>
                    <td>${E.getEmail()}</td>
                    <td>${E.getAge()}</td>
                    <td>${E.getGender()}</td>
                    <td>${E.getAddress()}</td>
                    <td>${E.getPhonenum()}</td>
                    <td>${E.getCmnd()}</td>
                </tr> -->
            </c:forEach>
            <!-- Tìm theo age-->   
            <c:forEach items="${listA}" var="A" >
                <tr>
                    <td><img src="${A.getImg()}" width="50px" height="50px"></td>
                    <td>${A.getFullname()}</td>
                    <td>${A.getEmail()}</td>
                    <td>${A.getAge()}</td>
                    <td>${A.getGender()}</td>
                    <td>${A.getAddress()}</td>
                    <td>${A.getPhonenum()}</td>
                    <td>${A.getCmnd()}</td>
                </tr> 
            </c:forEach>
            <!-- Tìm theo địa chỉ-->  
            <c:forEach items="${listAD}" var="Ad" >
                <tr>
                    <td><img src="${Ad.getImg()}" width="50px" height="50px"></td>
                    <td>${Ad.getFullname()}</td>
                    <td>${Ad.getEmail()}</td>
                    <td>${Ad.getAge()}</td>
                    <td>${Ad.getGender()}</td>
                    <td>${Ad.getAddress()}</td>
                    <td>${Ad.getPhonenum()}</td>
                    <td>${Ad.getCmnd()}</td>
                </tr> 
            </c:forEach>
            <!-- Tìm theo số điện thoại-->  
            <c:forEach items="${listP}" var="po" >
                <tr>
                    <td><img src="${po.getImg()}" width="50px" height="50px"></td>
                    <td>${po.getFullname()}</td>
                    <td>${po.getEmail()}</td>
                    <td>${po.getAge()}</td>
                    <td>${po.getGender()}</td>
                    <td>${po.getAddress()}</td>
                    <td>${po.getPhonenum()}</td>
                    <td>${po.getCmnd()}</td>
                </tr> 
            </c:forEach>
        </tbody>
    </table>
    <div class="paging">
        <ul class="pagination">
            <c:forEach begin="1" end="${endPage}" var="i">
                <li class="page-item" >
                    <a class="page-item active" href="searchcontroll?index=${i}&serch=${txtS}" class="page-link">${i}</a>
                </li>
            </c:forEach>
        </ul>
    </div>
</body>
<style>
    .table table-striped table-hover{
         margin-right: 5%;
    }
    .paging{
/*        margin-left: 30%;*/
        margin-right: 50%;
    }
    .pagetitle {
        margin-top: 5%;
        margin-left: 2%;
        margin-right: 3%;
    }
    .container-xl{
        margin-top: 4%;
    }
    body {
        color: #566787;
        background: #f5f5f5;
        font-family: 'Varela Round', sans-serif;
        font-size: 15px;

    }
    .table-responsive {
        margin: 10px 0;
    }
    .table-wrapper {
        background: #fff;
        padding: 20px 25px;
        border-radius: 3px;
        min-width: 1000px;
        box-shadow: 0 1px 1px rgba(0,0,0,.05);

    }
    .table-title {
        padding-bottom: 15px;
        background: #012970;
        color: #fff;
        padding: 16px 30px;
        min-width: 100%;
        margin: -20px -25px 10px;
        border-radius: 3px 3px 0 0;
    }
    .table-title h2 {
        margin: 5px 0 0;
        font-size: 25px;
    }
    .table-title .btn-group {
        float: right;
    }

    table.table tr th, table.table tr td {
        border-color: #e9e9e9;
        padding: 12px 15px;
        vertical-align: middle;
    }
    table.table tr th:first-child {
        width: 60px;
    }
    table.table tr th:last-child {
        width: 100px;
    }
    table.table-striped tbody tr:nth-of-type(odd) {
        background-color: #fcfcfc;
    }
    table.table-striped.table-hover tbody tr:hover {
        background: #f5f5f5;
    }
    table.table th i {
        font-size: 13px;
        margin: 0 5px;
        cursor: pointer;
    }
    table.table td:last-child i {
        opacity: 0.9;
        font-size: 22px;
        margin: 0 5px;
    }
    table.table td a {
        font-weight: bold;
        color: #566787;
        display: inline-block;
        text-decoration: none;
        outline: none !important;
    }
    table.table td a:hover {
        color: #2196F3;
    }
    table.table td a.edit {
        color: #FFC107;
    }
    table.table td a.delete {
        color: #F44336;
    }
    table.table td i {
        font-size: 19px;
    }
    table.table .avatar {
        border-radius: 50%;
        vertical-align: middle;
        margin-right: 10px;
    }
    .pagination {
        float: right;
        margin: 0 0 5px;
    }
    .pagination li a {
        border: none;
        font-size: 13px;
        min-width: 30px;
        min-height: 30px;
        color: #999;
        margin: 0 2px;
        line-height: 30px;
        border-radius: 2px !important;
        text-align: center;
        padding: 0 6px;
    }
    .pagination li a:hover {
        color: #666;
    }
    .pagination li.active a, .pagination li.active a.page-link {
        background: #03A9F4;
    }
    .pagination li.active a:hover {
        background: #0397d6;
    }
    .pagination li.disabled i {
        color: #ccc;
    }
    .pagination li i {
        font-size: 16px;
        padding-top: 6px
    }
    .hint-text {
        float: left;
        margin-top: 10px;
        font-size: 13px;
    } 
</style>

