/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import DAO.CoffeeBarDAO;
import DAO.CustomerDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.CoffeBar;
import models.Customer;

/**
 *
 * @author hoa
 */
@WebServlet(name = "Customer_view", urlPatterns = {"/Customer_view"})
public class Customer_view extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Customer_view</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Customer_view at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
//        processRequest(request, response);
        List<Customer> c = new ArrayList<>();
        CustomerDAO cusDAO = new CustomerDAO();
        try {
            c = cusDAO.select_CustomerDAO_By_ID_Or_ALL("");
        } catch (SQLException ex) {
            Logger.getLogger(CoffeBar_Select.class.getName()).log(Level.SEVERE, null, ex);
        }
        request.setAttribute("list_cus", c);
        request.getRequestDispatcher("Customer_view.jsp").forward(request, response);
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
//        processRequest(request, response);
        String id = request.getParameter("id");
        String name = request.getParameter("fullName");
        String Addr = request.getParameter("Addr");
        String Mobile = request.getParameter("Mobile");
        String Note = request.getParameter("Note");
        CustomerDAO cusDAO = new CustomerDAO();
        try {
            cusDAO.Insert_CustomerDAO(id, Addr, Mobile, Note, name);
        } catch (SQLException ex) {
            Logger.getLogger(Customer_view.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.doGet(request, response);
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
