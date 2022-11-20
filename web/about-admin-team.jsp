<%-- 
    Document   : about-admin-team
    Created on : Nov 5, 2021, 12:10:38 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<title>About admin team</title>

<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.3.1/css/bootstrap.min.css">

<jsp:include page="content/header-admin.jsp"></jsp:include>

<div class="container mx-auto col-md-10 mt-100">
    <div class="about">
        <h1>Đội ngũ admin</h1>
    </div>
    <div class="pagetitle">
        <nav>
            <ol class="breadcrumb">
                <li class="breadcrumb-item"><a href="home-admin-page.jsp">Trang chủ</a></li>
                <li class="breadcrumb-item">Đội ngũ admin</li>
            </ol>
        </nav>
    </div>
    <div class="row" style="justify-content: center">
        <div class="card col-md-3 mt-100">
            <div class="card-content">
                <div class="card-body p-0">
                    <div class="profile"> <img src="images/dat.jpg"> </div>
                    <div class="card-title"> Quang Đạt<br> <small>Front-end developer</small> </div>
                    <div class="card-subtitle">
                        <p> <small class="text-muted">  </small> </p>
                    </div>
                </div>
            </div>
        </div>
        <div class="card col-md-3 mt-100">
            <div class="card-content">
                <div class="card-body p-0">
                    <div class="profile"> <img src="images/tan.jpg"> </div>
                    <div class="card-title"> Lê Tân<br> <small>Back-end developer</small> </div>
                    <div class="card-subtitle">
                        <p> <small class="text-muted">  </small> </p>
                    </div>
                </div>
            </div>
        </div>
        <div class="card col-md-3 mt-100">
            <div class="card-content">
                <div class="card-body p-0">
                    <div class="profile"> <img src="images/thanh.jpg"> </div>
                    <div class="card-title"> Đình Thanh<br> <small>Designer</small> </div>
                    <div class="card-subtitle">
                        <p> <small class="text-muted">  </small> </p>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="row" style="justify-content: center">
        <div class="card col-md-3 mt-100">
            <div class="card-content">
                <div class="card-body p-0">
                    <div class="profile"> <img src="images/tien.jpg"> </div>
                    <div class="card-title"> Mạnh Tiến<br> <small>Back-end developer</small> </div>
                    <div class="card-subtitle">
                        <p> <small class="text-muted">  </small> </p>
                    </div>
                </div>
            </div>
        </div>
        <div class="card col-md-3 mt-100">
            <div class="card-content">
                <div class="card-body p-0">
                    <div class="profile"> <img src="images/nhan.png"> </div>
                    <div class="card-title"> Tài Nhân<br> <small>Tester</small> </div>
                    <div class="card-subtitle">
                        <p> <small class="text-muted">  </small> </p>
                    </div>
                </div>
            </div>
        </div>
    </div>

</div>                            


<style>
    .breadcrumb{
        background-color: #fff;
    }
    .about h1{
        text-align: center;
        padding-top: 10px;
    }

    .row{
        padding-bottom: 30px;
    }
    body {
        background: #94b2c6;

    }

    .container {
        background-color: white;
        text-align: center;
        border-radius: 20px;
        box-shadow: 0 20px 40px rgba(0, 0, 0, .2);



    }

    .title {
        font-size: 25px;
        font-weight: 100
    }

    .icon {
        position: relative;
        bottom: 11px
    }

    .mt-100 {
        margin-top: 100px
    }

    .profile img {
        width: 68px;
        height: 68px;
        border-radius: 50%
    }

    .card {
        border-radius: 15px;
        margin-left: 30px;
        margin-right: 30px;
        box-shadow: 0 10px 20px rgba(0, 0, 0, .2)
    }

    .card-body {
        position: relative;
        bottom: 35px
    }

    .btn {
        margin-top: 36px;
        margin-bottom: 45px;
        background-color: #AB47BC;
        border: none;
        color: #fff
    }

    .btn:hover {
        -webkit-transform: scale(1.05);
        -ms-transform: scale(1.05);
        transform: scale(1.05);
        color: #fff
    }
</style>
