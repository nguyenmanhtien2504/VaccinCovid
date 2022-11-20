/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.DAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.UserInfo;

/**
 *
 * @author Admin
 */
@WebServlet(name = "SearchControll", urlPatterns = {"/searchcontroll"})
public class SearchControll extends HttpServlet {

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
        request.setCharacterEncoding("UTF-8");
        try {
            String txt = request.getParameter("serch");
            int index =Integer.parseInt(request.getParameter("index"));
            DAO dao = new DAO();
            int count = dao.count(txt);
            int size = 5;
            int endPage = count/size;
            if(count % size !=0){
                endPage++;
            }
//            List<UserInfo> list = dao.search();
            List<UserInfo> list = dao.searchName(txt, index);
            List<UserInfo> listE = dao.searchEmail(txt, index);
            List<UserInfo> listA = dao.searchAge(txt, index);
            List<UserInfo> listAd = dao.searchAddress(txt, index);
            List<UserInfo> listP = dao.searchPhone(txt, index);
            request.setAttribute("endPage", endPage);
            request.setAttribute("listS", list);
            request.setAttribute("listE", listE);
            request.setAttribute("listA", listA);
            request.setAttribute("listAD", listAd);
            request.setAttribute("listP", listP);
            request.setAttribute("txtS", txt);
            request.getRequestDispatcher("Search-Result-Page.jsp").forward(request, response);
        } catch (Exception e) {
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
