/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

package Controller;

import DAO.DaoReview;
import Model.Account;
import Model.Review;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 *
 * @author kienb
 */
public class addReview extends HttpServlet {
   
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession();
        Account a = (Account) session.getAttribute("acc");
        if(a == null){
            response.sendRedirect("login.jsp");
            return;
        }
        int accountID = Integer.parseInt(a.getId());
        String contentReview = request.getParameter("contentReview");
        int productID = Integer.parseInt(request.getParameter("productID"));
        DaoReview dao = new DaoReview();
        dao.insertReview(accountID, productID, contentReview);
        Review newReview = new Review();
        newReview = dao.getNewReview(accountID, productID);
        PrintWriter out = response.getWriter();

        
            out.println(" <div class=\"media mt-3 mb-4\">\r\n"
            		+ "              <img class=\"d-flex mr-3 z-depth-1\" src=\"https://mdbootstrap.com/img/Photos/Others/placeholder1.jpg\"\r\n"
            		+ "                width=\"62\" alt=\"Generic placeholder image\">\r\n"
            		+ "              <div class=\"media-body\">\r\n"
            		+ "                <div class=\"d-flex justify-content-between\">\r\n"
            		+ "                  <p class=\"mt-1 mb-2\">\r\n"
            		+ "                    <strong>"+a.getUsername()+"</strong>\r\n"
            		+ "                    <span>� </span><span>"+newReview.getDate_review()+"</span>\r\n"
            		+ "                  </p>\r\n"
            		+ "                </div>\r\n"
            		+ "                <p class=\"mb-0\">"+newReview.getContent()+"</p>\r\n"
            		+ "              </div>\r\n"
            		+ "            </div>\r\n"
            		+ "            <hr>    ");
    } 

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
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
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
