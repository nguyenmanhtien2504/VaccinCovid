/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Admin
 */
public class CookieUtils {
      public static Cookie add(String name, String value, int hour, HttpServletResponse response) {
        Cookie cookie = new Cookie(name, value);
        cookie.setMaxAge(60 * 60 * hour);
        cookie.setPath("/");
        response.addCookie(cookie);
        return cookie;
    }
    
    public static String get(String name, HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();
            for (Cookie cookie : cookies) {
                if (cookie.getName().equalsIgnoreCase(name)) {
            return cookie.getValue();
                }
            }
        return "";
    }
}
