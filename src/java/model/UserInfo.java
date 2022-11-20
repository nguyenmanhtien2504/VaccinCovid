/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.logging.Logger;

/**
 *
 * @author karik
 */
public class UserInfo  {

    private int id;
    private String username;
    private String passwword;
    private int isuser;
    private int isadmin;
    private String fullname;
    private String email;
    private int age;
    private String gender;
    private String address;
    private String phonenum;
    private String cmnd;
//    private String BHYT;
    private String img;
    private int mavaccin;

    public UserInfo() {
    }
    public UserInfo(int Id) {
        this.id=Id;
    }
    
    public UserInfo(String username, String password) {
        this.username = username;
        this.passwword = password;
    }
    public UserInfo(int id, String username, String password) {
        this.id=id;
        this.username = username;
        this.passwword = password;
    }

    
    // sign up
    public UserInfo(String username, String passwword, String fullname, String email, int age, String gender, String cmnd, String phonenum, String address, String img) {
        this.username = username;
        this.passwword = passwword;
        this.fullname = fullname;
        this.email = email;
        this.age = age;
        this.gender = gender;
        this.phonenum = phonenum;
        this.address = address;
        this.cmnd = cmnd;
        this.img = img;
    }
    // get by id
    public UserInfo(int id, String fullname, String email, int age, String gender, String address, String phonenum, String cmnd, String img, int mavaccin) {
        this.id = id;
        this.fullname = fullname;
        this.email = email;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phonenum = phonenum;
        this.cmnd = cmnd;
        this.img = img;
        this.mavaccin = mavaccin;

    }
    // get all user
    public UserInfo(int id, String username, String passwword, int isuser, int isadmin, String fullname, String email, int age, String gender, String address, String phonenum, String cmnd, String img, int mavaccin) {
        this.id = id;
        this.username = username;
        this.passwword = passwword;
        this.isuser = isuser;
        this.isadmin = isadmin;
        this.fullname = fullname;
        this.email = email;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phonenum = phonenum;
        this.cmnd = cmnd;
        this.img = img;

    }
    // update profile
    public UserInfo(int id, String img, String fullname, String email, int age, String gender, String phonenum, String cmnd, String address) {
        this.id = id;
        this.img = img;
        this.fullname = fullname;
        this.email = email;
        this.age = age;
        this.gender = gender;
        this.phonenum = phonenum;
        this.cmnd = cmnd;
        this.address = address;
    }
    // update user
    public UserInfo(String username, String password, int isuser, int isadmin, int id) {
        this.username = username;
        this.passwword = password;
        this.isuser = isuser;
        this.isadmin = isadmin;
        this.id = id;
    }
    public UserInfo(String img,String fullname, String email, int age, String gender, String address, String phonenum, String cmnd, int mavacin,int id) {
        this.img = img;
        this.fullname = fullname;
        this.email = email;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phonenum = phonenum;
        this.cmnd = cmnd;
        this.mavaccin = mavacin;
        this.id = id;
    }

    public UserInfo( String username, String passwword, int isuser, int isadmin ,String fullname, String email, int age, String gender, String address, String phonenum, String cmnd, String img, int mavaccin, int id) {
        
        this.username = username;
        this.passwword = passwword;
        this.isuser = isuser;
        this.isadmin = isadmin;
        this.id = id;
        this.fullname = fullname;
        this.email = email;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phonenum = phonenum;
        this.cmnd = cmnd;
        this.img = img;
        this.mavaccin = mavaccin;
        this.id = id;
    }
    // list tìm kím
    public UserInfo(int id, String fullname, String email, int age, String gender, String address, String phonenum, String cmnd, String img) {
        this.id = id;
        this.fullname = fullname;
        this.email = email;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phonenum = phonenum;
        this.cmnd = cmnd;
        this.img = img;

    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswword() {
        return passwword;
    }

    public void setPasswword(String passwword) {
        this.passwword = passwword;
    }

    public int getIsuser() {
        return isuser;
    }

    public void setIsuser(int isuser) {
        this.isuser = isuser;
    }

    public int getIsadmin() {
        return isadmin;
    }

    public void setIsadmin(int isadmin) {
        this.isadmin = isadmin;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }



    public int getMavaccin() {
        return mavaccin;
    }

    public void setMavaccin(int mavaccin) {
        this.mavaccin = mavaccin;
    }

    @Override
    public String toString() {
        return "UserInfo{" + "id=" + id + ", username=" + username + ", passwword=" + passwword + ", isuser=" + isuser + ", isadmin=" + isadmin + ", fullname=" + fullname + ", email=" + email + ", age=" + age + ", gender=" + gender + ", address=" + address + ", phonenum=" + phonenum + ", cmnd=" + cmnd + ", img=" + img + ", mavaccin=" + mavaccin + '}';
    }

}
