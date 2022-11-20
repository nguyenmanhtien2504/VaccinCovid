

<%--<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="content/header-admin.jsp"></jsp:include>

<jsp:include page="content/home-page.jsp"></jsp:include>
<jsp:include page="content/colum-left-admin.jsp"></jsp:include>--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="content/header-admin.jsp"></jsp:include>

<c:if test="${sessionScope.acc.isuser == 1}">
<div class="user-home">
    <div class="user-img">
        <img src="images/user-page.svg" class="" alt="">
        <div>
            <a href="add-vaccine.jsp" class="add">Chọn vaccine</a>
        </div>
    </div>
</div>

<style> 
    .user-img img {
        width: 70%;
        height: 68%;
        margin-top: 5%;
        margin-left: 38%;

    }
    .user-home {
        display: flex;
        text-align: center;

    }
    .user-home .add {
        font-family: "Raleway", sans-serif;
        font-weight: 500;
        font-size: 16px;
        letter-spacing: 1px;
        display: inline-block;
        padding: 8px 28px;
        border-radius: 3px;
        transition: 0.5s;
        margin-top: 50px;
        color: #fff;
        background: #4154f1;
        margin-left: 37%;
    }
</style>
</c:if>
<c:if test="${sessionScope.acc.isadmin == 1}">
    <div class="admin-home">
        <div class="admin-img">
            <img src="images/admin-page.svg" class="" alt="">
            <div>
                <a href="add-vaccine.jsp" class="add">Chọn vaccine</a>
            </div>
        </div>
    </div>
    <style> 
        .admin-img img {
            width: 70%;
            height: 68%;
            margin-top: 5%;
            margin-left: 33%;

        }
        .admin-home {
            display: flex;
            text-align: center;

        }
        .admin-home .add {
            font-family: "Raleway", sans-serif;
            font-weight: 500;
            font-size: 16px;
            letter-spacing: 1px;
            display: inline-block;
            padding: 8px 28px;
            border-radius: 3px;
            transition: 0.5s;
            margin-top: 50px;
            color: #fff;
            background: #4154f1;
            margin-left: 45%;
        }

    </style>
</c:if>
<jsp:include page="content/colum-left-admin.jsp"></jsp:include>
