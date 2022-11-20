/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbcontext;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ly Quynh Tran
 */
public class ConnectDB implements DatabaseInfor{
    private static ConnectDB instance;

    public ConnectDB() {
    }

    public Connection openConnection() throws Exception {
        Class.forName(driverName);
        Connection con = DriverManager.getConnection(url, user, pass);
        return con;

    }

    //Get instance of dbms only one time
    public static ConnectDB getInstance() {
        if (instance == null) {
            instance = new ConnectDB();
        }
        return instance;
    }
    public void closeConnection(Connection con, PreparedStatement ps, ResultSet rs){
        try {
            con.close();
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConnectDB.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
   
   public void closeConnection(Connection con, PreparedStatement ps){
        try {
            con.close();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConnectDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
