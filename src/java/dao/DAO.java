/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import dbcontext.ConnectDB;
//import dbcontext.DBUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.LoginL;
import model.UserInfo;
import model.Vaccin;

/**
 *
 * @author karik
 */
public class DAO {

    private Connection conn = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;

    //Đăng nhập
    public UserInfo checkLogin(UserInfo userInfo) {
        String query = "select tblLogin.id, username, password, isuser,isadmin, fullname, email, age, gender, address, phonenum, cmnd, img, mavaccin\n"
                + "from tblLogin inner join tblUserInfo\n"
                + "on tblLogin.id = tblUserInfo.id\n"
                + "where username= ? and password= ?";
        try {
            conn = new ConnectDB().openConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, userInfo.getUsername());
            ps.setString(2, userInfo.getPasswword());
            rs = ps.executeQuery();
            while (rs.next()) {
                return new UserInfo(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getInt(8),
                        rs.getString(9),
                        rs.getString(10),
                        rs.getString(11),
                        rs.getString(12),
                        rs.getString(13),
                        rs.getInt(14));
            }
        } catch (Exception e) {
        }
        return null;
    }
    public LoginL login (LoginL login){
        String query = "select * from tblLogin where username = ? and password = ?";
        
        try {
            conn = new ConnectDB().openConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, login.getUsername());
            ps.setString(2, login.getPasswword());
            rs = ps.executeQuery();
            while (rs.next()){
                return new LoginL(rs.getInt(1), 
                        rs.getString(2), 
                        rs.getString(3), 
                        rs.getInt(4), 
                        rs.getInt(5));
            }
        } catch (Exception e) {
        }
        return null;
        
    }

    // kiểm tra tên đăng nhập
    public LoginL checkLoginExits(String username) {
        String query = "SELECT * FROM tblLogin \n"
                + "WHERE username = ?";
        try {
            conn = new ConnectDB().openConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, username);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new LoginL(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5));
            }
        } catch (Exception e) {
        }
        return null;
    }

    // đăng ký
    public void singup(UserInfo userinfo) {
        String query = "insert into tblLogin\n"
                + "values(?,?,1,0)"
                + "insert into [dbo].[tblUserInfo]"
                + "([fullname],[email],[age],[gender],[address],[phonenum],cmnd,[img])\n"
                + "values (?,?,?,?,?,?,?,?)";
        try {
            conn = new ConnectDB().openConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, userinfo.getUsername());
            ps.setString(2, userinfo.getPasswword());
            ps.setString(3, userinfo.getFullname());
            ps.setString(4, userinfo.getEmail());
            ps.setInt(5, userinfo.getAge());
            ps.setString(6, userinfo.getGender());
            ps.setString(7, userinfo.getAddress());
            ps.setString(8, userinfo.getPhonenum());
            ps.setString(9, userinfo.getCmnd());
            ps.setString(10, userinfo.getImg());
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
//danh sách người dùng

    public List<UserInfo> getAllUser() {
        List<UserInfo> ls = new ArrayList<>();
        String query = "select tblLogin.id, username, password, isuser, isadmin, "
                + "fullname, email, age, gender,address,phonenum, cmnd,img, mavaccin \n"
                + "from tblLogin inner join tblUserInfo\n"
                + "on tblLogin.id = tblUserInfo.id";
        try {
            conn = new ConnectDB().openConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                ls.add(new UserInfo(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getInt(8),
                        rs.getString(9),
                        rs.getString(10),
                        rs.getString(11),
                        rs.getString(12),
                        rs.getString(13),
                        rs.getInt(14)));
            }
        } catch (Exception e) {
        }
        return ls;
    }
// thông tin

    public UserInfo getUserById(int id) {
        String query = "select tblLogin.id, username, password, isuser, isadmin,\n"
                + "fullname, email, age, gender,address, phonenum, cmnd,\n"
                + "img, mavaccin\n"
                + "from tblLogin inner join tblUserInfo\n"
                + "on tblLogin.id = tblUserInfo.id\n"
                + "where tblLogin.id = ?";
        try {
            conn = new ConnectDB().openConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new UserInfo(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getInt(8),
                        rs.getString(9),
                        rs.getString(10),
                        rs.getString(11),
                        rs.getString(12),
                        rs.getString(13),
                        rs.getInt(14));
            }
        } catch (Exception e) {
        }
        return null;
    }
//cập nhập thông tin của rất cả người dùng
    public void UpdateLogin (LoginL lo){
        String query = "update tblLogin set password= ? where id = ?";
        try {
            conn = new ConnectDB().openConnection();
            ps = conn.prepareStatement(query);
//            ps.setString(1, l.getUsername());
            ps.setString(1, lo.getPasswword());
            ps.setInt(2, lo.getId());
            ps.executeUpdate();

        } catch (Exception e) {
        }
    }
//Cập nhập acc

    public void updateAcc(UserInfo u) {
        String query = "update tblLogin set username = ?, password= ?, isuser = ?, isadmin = ? where id = ?";
        try {
            conn = new ConnectDB().openConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, u.getUsername());
            ps.setString(2, u.getPasswword());
            ps.setInt(3, u.getIsuser());
            ps.setInt(4, u.getIsadmin());
            ps.setInt(5, u.getId());
            ps.executeUpdate();

        } catch (Exception e) {
        }
    }
// cập nhập profile cá nhân và thông tin list

    public void updateInfo(UserInfo u) {
        String query = "update tblUserInfo set img = ?, fullname = ?, email = ?, age = ?, gender = ?, \n"
                + " phonenum = ?, cmnd = ?, address = ? where id = ?";
        try {
            conn = new ConnectDB().openConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, u.getImg());
            ps.setString(2, u.getFullname());
            ps.setString(3, u.getEmail());
            ps.setInt(4, u.getAge());
            ps.setString(5, u.getGender());
            ps.setString(6, u.getPhonenum());
            ps.setString(7, u.getCmnd());
            ps.setString(8, u.getAddress());
            ps.setInt(9, u.getId());
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
// xóa tài khoản

    public void deleteUser(int id) {
        String query = "delete from tblUserInfo where id = ?;\n"
                + "delete from tblLogin where id = ?;";
        try {
            conn = new ConnectDB().openConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            ps.setInt(2, id);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

// Chọn vaccin muốn tiêm
    public void updateVaccin(int mavaccin, int id) {
        String query = "update tblUserInfo set mavaccin = ? where id = ?";
        try {
            conn = new ConnectDB().openConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, mavaccin);
            ps.setInt(2, id);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    // danh sách vaccin
    public List<Vaccin> getAllVaccin() {
        List<Vaccin> vc = new ArrayList<>();
        String query = "select * from tblVaccin";
        try {
            conn = new ConnectDB().openConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                vc.add(new Vaccin(rs.getInt(1), 
                        rs.getString(2), 
                        rs.getString(3)));
            }
        } catch (Exception e) {
        }
        return vc;
    }

    // Tìm kiếm
    //
    public int count(String txt) {
        String query = "select count(*) from tblUserInfo where fullname like ?";
        try {
            conn = new ConnectDB().openConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, "%" + txt + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
        }
        return 0;
    }

    //tìm theo tên
    public List<UserInfo> searchName(String txt, int index) {
        List<UserInfo> list = new ArrayList<>();
        String query = "select * from\n"
                + "(select ROW_NUMBER() over (order by id asc) as r, *\n"
                + "from tblUserInfo where fullname like ?) as x\n"
                + "where r between ? * 5 - 4 and ? *5";
        try {
            conn = new ConnectDB().openConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, "%" + txt + "%");
            ps.setInt(2, index);
            ps.setInt(3, index);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new UserInfo(rs.getInt("id"),
                        rs.getString("fullname"),
                        rs.getString("email"),
                        rs.getInt("age"),
                        rs.getString("gender"),
                        rs.getString("address"),
                        rs.getString("phonenum"),
                        rs.getString("cmnd"),
                        rs.getString("img")));

            }
        } catch (Exception e) {
        }
        return list;
    }

    //Tìm theo email
    public List<UserInfo> searchEmail(String txt, int index) {
        List<UserInfo> list = new ArrayList<>();
        String query = "select * from\n"
                + "(select ROW_NUMBER() over (order by id asc) as r, *\n"
                + "from tblUserInfo where email like ?) as x\n"
                + "where r between ? * 5 - 4 and ? *5";
        try {
            conn = new ConnectDB().openConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, "%" + txt + "%");
            ps.setInt(2, index);
            ps.setInt(3, index);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new UserInfo(rs.getInt("id"),
                        rs.getString("fullname"),
                        rs.getString("email"),
                        rs.getInt("age"),
                        rs.getString("gender"),
                        rs.getString("address"),
                        rs.getString("phonenum"),
                        rs.getString("cmnd"),
                        rs.getString("img")));

            }
        } catch (Exception e) {
        }
        return list;
    }

    //tìm theo tuổi
    public List<UserInfo> searchAge(String txt, int index) {
        List<UserInfo> list = new ArrayList<>();
        String query = "select * from\n"
                + "(select ROW_NUMBER() over (order by id asc) as r, *\n"
                + "from tblUserInfo where age like ?) as x\n"
                + "where r between ? * 5 - 4 and ? *5";
        try {
            conn = new ConnectDB().openConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, "%" + txt + "%");
            ps.setInt(2, index);
            ps.setInt(3, index);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new UserInfo(rs.getInt("id"),
                        rs.getString("fullname"),
                        rs.getString("email"),
                        rs.getInt("age"),
                        rs.getString("gender"),
                        rs.getString("address"),
                        rs.getString("phonenum"),
                        rs.getString("cmnd"),
                        rs.getString("img")));

            }
        } catch (Exception e) {
        }
        return list;
    }

    //tìm theo địa chỉ
    public List<UserInfo> searchAddress(String txt, int index) {
        List<UserInfo> list = new ArrayList<>();
        String query = "select * from\n"
                + "(select ROW_NUMBER() over (order by id asc) as r, *\n"
                + "from tblUserInfo where address like ?) as x\n"
                + "where r between ? * 5 - 4 and ? *5";
        try {
            conn = new ConnectDB().openConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, "%" + txt + "%");
            ps.setInt(2, index);
            ps.setInt(3, index);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new UserInfo(rs.getInt("id"),
                        rs.getString("fullname"),
                        rs.getString("email"),
                        rs.getInt("age"),
                        rs.getString("gender"),
                        rs.getString("address"),
                        rs.getString("phonenum"),
                        rs.getString("cmnd"),
                        rs.getString("img")));

            }
        } catch (Exception e) {
        }
        return list;
    }

    //tìm theo số điện thoại
    public List<UserInfo> searchPhone(String txt, int index) {
        List<UserInfo> list = new ArrayList<>();
        String query = "select * from\n"
                + "(select ROW_NUMBER() over (order by id asc) as r, *\n"
                + "from tblUserInfo where phonenum like ?) as x\n"
                + "where r between ? * 5 - 4 and ? *5";
        try {
            conn = new ConnectDB().openConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, "%" + txt + "%");
            ps.setInt(2, index);
            ps.setInt(3, index);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new UserInfo(rs.getInt("id"),
                        rs.getString("fullname"),
                        rs.getString("email"),
                        rs.getInt("age"),
                        rs.getString("gender"),
                        rs.getString("address"),
                        rs.getString("phonenum"),
                        rs.getString("cmnd"),
                        rs.getString("img")));

            }
        } catch (Exception e) {
        }
        return list;
    }

    //số lượng người dùng
    public int getTotalUser() {
        String query = "select count(*) from tblUserInfo";
        try {
            conn = new ConnectDB().openConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
        }
        return 0;
    }

    //danh sach nguoi dung
    public List<UserInfo> PagingUser(int index) {
        List<UserInfo> ls = new ArrayList<>();
        String query = "select * from tblUserInfo order by id offset ? \n"
                + "rows fetch next 10 rows only";
        try {
            conn = new ConnectDB().openConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, (index - 1) * 10);
            rs = ps.executeQuery();
            while (rs.next()) {
                ls.add(new UserInfo(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getInt(10)));
            }
        } catch (Exception e) {
        }
        return ls;
    }

    //get Vaccine theo id
//    public Vaccin getVaccin(int mavaccin) {
//        String query = "select tblUserInfo.mavaccin, vaccin from tblVaccin inner join tblUserInfo \n"
//                + "on tblUserInfo.mavaccin = tblVaccin.mavaccin where tblUserInfo.mavaccin = ?";
//        try {
//            conn = new ConnectDB().openConnection();
//            ps = conn.prepareStatement(query);
//            ps.setInt(1, mavaccin);
//            rs = ps.executeQuery();
//            while (rs.next()) {
//                return new Vaccin(rs.getInt(1), rs.getString(2));
//            }
//        } catch (Exception e) {
//        }
//        return null;
//
//    }
    public Vaccin getVaccin(int id) {
        String query = "select tblUserInfo.mavaccin, vaccin from tblVaccin inner join tblUserInfo \n"
                + "on tblUserInfo.mavaccin = tblVaccin.mavaccin where tblUserInfo.id = ?";
        try {
            conn = new ConnectDB().openConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Vaccin(rs.getInt(1), rs.getString(2));
            }
        } catch (Exception e) {
        }
        return null;

    }


    public static void main(String[] args) {
        DAO dao = new DAO();
        List<Vaccin> list = dao.getAllVaccin();
//        for (Vaccin o : list) {
//            System.out.println(o);
//        }
//Vaccin vaccin = dao.getVaccin(2);
//        UserInfo userFinded = dao.getUserById(1);
        System.out.println(list);
    }
}


