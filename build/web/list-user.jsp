

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<jsp:include page="content/header-admin.jsp"></jsp:include>

<%-- 
    Document   : list
    Created on : Nov 3, 2021, 9:29:57 AM
    Author     : Admin
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>

<body>
    <div class="container-xl">
        <div class="table-responsive">
            <div class="table-wrapper">
                <div class="table-title">
                    <div class="row">
                        <div class="col-sm-6">
                            <h2>Thông tin tất cả người dùng</h2>
                        </div>
                    </div>
                </div>
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
                            <th></th>
                            <th></th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="lis" items="${LIST}">

                            <tr>
                                <td><img src="${lis.getImg()}" width="50px" height="50px"></td>
                                <td>${lis.getFullname()}</td>
                                <td>${lis.getEmail()}</td>
                                <td>${lis.getAge()}</td>
                                <td>${lis.getGender()}</td>
                                <td>${lis.getAddress()}</td>
                                <td>${lis.getPhonenum()}</td>
                                <td>${lis.getCmnd()}</td>
                                <td>
                                    <a href="updatecontroll?sid=${lis.getId()}" class="edit" ><i class="material-icons" data-toggle="tooltip" title="Edit">&#xE254;</i></a>
                                </td>
                                <td>
                                    <a href="deletecontroll?sid=${lis.getId()}" class="delete"><i class="material-icons" data-toggle="tooltip" title="Delete">&#xE872;</i></a>
                                </td>
                            </tr> 
                        </c:forEach>
                    </tbody>
                </table>

                <!--                <div class="clearfix">
                                    <ul class="pagination">
                                        <li class="page-item disabled"><a href="#">Trước</a></li>
                <c:forEach begin="1" end="${endP}" var="u">
                <li class="page-item active"><a href="listuser?index=${u}" class="page-link">${u}</a></li>
                </c:forEach>
                <li class="page-item"><a href="#" class="page-link">Sau</a></li>
            </ul>
        </div>  -->
            </div>
        </div>        
    </div>




    <style>
        .container-xl{
            margin-top: 7%;

        }
        body {
            color: #566787;
            background: #f5f5f5;
            font-family: 'Varela Round', sans-serif;
            font-size: 12px;
            margin-left: 15%;
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
    <jsp:include page="content/colum-left-admin.jsp"></jsp:include>
