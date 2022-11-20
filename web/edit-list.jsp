<%-- 
    Document   : edit-list
    Created on : Nov 4, 2021, 11:16:55 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<title>Chỉnh sửa hồ sơ</title>
<link href="images/icons8-vaccine-65.png" rel="icon">
<link href="bootstrap-icons/bootstrap-icons.css" rel="stylesheet">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">  
<div class="container rounded bg-white mt-5 mb-5">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">


    <form class="edit-list" action="updatecontroll" method="POST">
        <div class="d-flex justify-content-between align-items-center mb-3">
            <h4 class="text-right">Chỉnh sửa thông tin</h4>
        </div>  
        <div class="col-md-12">
            <label class="labels">ID</label>
            <input type="text" name="id" class="form-control" placeholder="" value="${L.getId()}" readonly>
        </div>
        <div class="col-md-12">
            <label class="labels">Ảnh</label>
            <input type="text" name="img" class="form-control" placeholder="" value="${L.getImg()}">
        </div>
        <div class="col-md-12">
            <label class="labels">Tên</label>
            <input type="text" name="fullname" class="form-control" placeholder="" value="${L.getFullname()}">
        </div>
        <div class="col-md-12">
            <label class="labels">Email</label>
            <input type="text" name="email" class="form-control" placeholder="" value="${L.getEmail()}">
        </div>
        <div class="col-md-12">
            <label class="labels">Tuổi</label>
            <input type="text" name="age" class="form-control" placeholder="" value="${L.getAge()}">
        </div>
        <div class="col-md-12">
            <label class="labels">Giới tính</label>
            <input type="text" name="gender" class="form-control" placeholder="" value="${L.getGender()}">
        </div>
        <div class="col-md-12">
            <label class="labels">Địa chỉ</label>
            <input type="text" name="address" class="form-control" placeholder="" value="${L.getAddress()}">
        </div>
        <div class="col-md-12">
            <label class="labels">Số điện thoại</label>
            <input type="text" name="phonenum" class="form-control" placeholder="" value="${L.getPhonenum()}">
        </div>
        <div class="col-md-12">
            <label class="labels">Cmnd/Cccd/Hc</label>
            <input type="text" name="cmnd" class="form-control" placeholder="" value="${L.getCmnd()}">
        </div>

        <input type="button" class="btn btn-primary profile-button" id="button" value="Thoát">
        <input type="submit" id="button" class="btn btn-primary profile-button" value="Lưu" >
    </form>
</div>


<style>

    .edit-list {
        margin-left: 30%;
        margin-right: 30%;
    }
    #button {
        margin-right: 5%;
        margin-top: 3%;
    }
</style>