/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**f
 *
 * @author karik
 */
public class LoginL  {
    private int  id;
    private String username;
    private String passwword;
    private int isuser;
    private int isadmin;

    public LoginL(int id, String username, String passwword, int isuser, int isadmin) {
        this.id = id;
        this.username = username;
        this.passwword = passwword;
        this.isuser = isuser;
        this.isadmin = isadmin;
    }
    public LoginL(String username, String password){
        this.username=username;
        this.passwword=password;
    }
     public LoginL(int id, String password){
        this.id = id;
        this.passwword = password;
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

    @Override
    public String toString() {
        return "LoginL{" + "id=" + id + ", username=" + username + ", passwword=" + passwword + ", isuser=" + isuser + ", isadmin=" + isadmin + '}';
    }
    
    
}
