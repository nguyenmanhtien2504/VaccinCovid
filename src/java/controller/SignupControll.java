/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.DAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.LoginL;
import model.UserInfo;

/**
 *
 * @author Admin
 */
@WebServlet(name = "SignupControll", urlPatterns = {"/signup"})
public class SignupControll extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("utf-8");
        String user = request.getParameter("username");
        String pass = request.getParameter("pass");
        String re_pass = request.getParameter("repass");
        String fn = request.getParameter("fullname");
        String em = request.getParameter("email");
        int ag = Integer.parseInt(request.getParameter("age"));
        String gt = request.getParameter("gender");
        String cm = request.getParameter("cmnd");
//        String bh = request.getParameter("bhyt");
        String dt = request.getParameter("phone");
        String dc = request.getParameter("address");
        String ing = request.getParameter("image");
        UserInfo userInfo = new UserInfo(user, pass, fn, em, ag, gt, cm, dt, dc, ing);
        DAO dao = new DAO();
        if (!pass.equals(re_pass)) {
            request.setAttribute("mess", "Pass k giống");
            request.getRequestDispatcher("sign-up-page.jsp").forward(request, response);
        } else {
            LoginL lo = dao.checkLoginExits(user);
            if (lo == null) {
                // dc signup
                dao.singup(userInfo);
                request.setAttribute("messi", "sign up thành công");
                request.getRequestDispatcher("login-page.jsp").forward(request, response);
            } else {
                request.setAttribute("mes", "user bị trùng");
                request.getRequestDispatcher("sign-up-page.jsp").forward(request, response);
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
