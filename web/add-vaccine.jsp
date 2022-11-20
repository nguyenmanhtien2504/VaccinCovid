<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="content/header-admin.jsp"></jsp:include>

<jsp:include page="content/colum-left-admin.jsp"></jsp:include>
<jsp:useBean id="v" class="dao.DAO"></jsp:useBean>
    <div class="pagetitle">
        <h2>Chọn loại vaccine</h2>
        <nav>
            <ol class="breadcrumb">
                <li class="breadcrumb-item"><a href="home-admin-page.jsp">Trang chủ</a></li>
                <c:if test="${sessionScope.acc.isadmin == 1}">
                <li class="breadcrumb-item">Quản trị viên</li>
                </c:if>
                <c:if test="${sessionScope.acc.isuser == 1}">
                <li class="breadcrumb-item">Thông tin</li>
                </c:if>
            <li class="breadcrumb-item active">Chọn vaccine</li>
        </ol>
    </nav>
</div><!-- chọn vaccine Title -->
<jsp:include page="content/table-vaccine.jsp"></jsp:include>
    <div class="card-box">
        <form action="addvaccine" method="post">
            <h5 class="card-title">Chọn loại vaccine bạn muốn tiêm</h5>
            
        <input name="aid" value="${sessionScope.acc.id}" type="hidden">
        <c:forEach items="${v.allVaccin}" var="o">
            <div class="card-body">

                
                <!-- List group With Checkboxes and radios -->
                <ul class="list-group">
                    <li class="list-group-item">
                        <input name="mavaccin" class="form-check-input me-1" type="checkbox" value="${o.mavaccin}" aria-label="...">
                        ${o.vaccin}/ 
                        
                        <input value="${o.price}" type="text" name="price" readonly>
                    </li>
                    
                    <input type="submit" class="add-vaccine" value="Chọn" >
                </ul>
                

            </div>
        </c:forEach>
    </form>
</div>
<style>
    .pagetitle{
        margin-left: 20%;
        margin-top: 5%;
    }
    .card-box {
        margin-left: 25%;
        margin-top: 3%;
        margin-right: 5%;
        background-color: #d5dbfc;
        margin-bottom: 5%;
    }
    .add-vaccine{

        font-family: "Raleway", sans-serif;
        font-weight: 500;
        font-size: 16px;
        letter-spacing: 1px;
        display: inline-block;
        padding: 8px 28px;
        border-radius: 3px;
        transition: 0.5s;
        margin-top: 30px;
        color: #fff;
        background: #eb5d1e;

        text-align: center;
        margin-top: 10px;
    }
</style>
