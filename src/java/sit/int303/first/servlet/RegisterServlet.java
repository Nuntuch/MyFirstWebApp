/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int303.first.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.UserTransaction;
import sit.int303.first.jpa.model.Register;
import sit.int303.first.jpa.model.controller.RegisterJpaController;
import sit.int303.first.jpa.model.controller.exceptions.RollbackFailureException;

/**
 *
 * @author INT303
 */
public class RegisterServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @PersistenceUnit(unitName = "MyFirstWebAppPU")
    EntityManagerFactory emf;

    @Resource
    UserTransaction utx;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        
//        String email = request.getParameter("email");
//        String password = request.getParameter("password");
//        
//        
//        getServletContext().getRequestDispatcher("/RegsisterForm.jsp").forward(request, response);
//        
////        response.setContentType("text/html;charset=UTF-8");
////        try (PrintWriter out = response.getWriter()) {
////            /* TODO output your page here. You may use following sample code. */
////            out.println("<!DOCTYPE html>");
////            out.println("<html>");
////            out.println("<head>");
////            out.println("<title>Servlet RegisterServlet</title>");            
////            out.println("</head>");
////            out.println("<body>");
////            out.println("<h1>Servlet RegisterServlet at " + request.getContextPath() + "</h1>");
////            out.println("</body>");
////            out.println("</html>");
////        }
//    }

        String email = request.getParameter("email");
        String password = request.getParameter("password");

        if (email != null && email.length() > 0
                && password != null && password.length() > 0) {
            password = cryptWithMD5(password).substring(0, 24);
//            CustomerJpaController customerJpaCtrl = new CustomerJpaController(utx, emf);
//            Customer c = customerJpaCtrl.findCustomer(Integer.valueOf(userName));
           
             Register register = new Register(email, password);
            RegisterJpaController regJpaCtrl = new RegisterJpaController(utx, emf);
            try {
                regJpaCtrl.create(register);
            } catch (RollbackFailureException ex) {
                Logger.getLogger(RegisterServlet.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                Logger.getLogger(RegisterServlet.class.getName()).log(Level.SEVERE, null, ex);
            }


        }
         request.setAttribute("message", "555555");
            getServletContext().getRequestDispatcher("/RegisterForm.jsp").forward(request, response);

//            Register register = new Register(email, password);
//            RegisterJpaController regJpaCtrl = new RegisterJpaController(utx, emf);
//            try {
//                regJpaCtrl.create(register);
//            } catch (RollbackFailureException ex) {
//                Logger.getLogger(RegisterServlet.class.getName()).log(Level.SEVERE, null, ex);
//            } catch (Exception ex) {
//                Logger.getLogger(RegisterServlet.class.getName()).log(Level.SEVERE, null, ex);
//            }
//         getServletContext().getRequestDispatcher("ActivateUser").forward(request, response);
//        getServletContext().getRequestDispatcher("ActivateUser").forward(request, response);
    }

    public static String cryptWithMD5(String pass) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] passBytes = pass.getBytes();
            md.reset();
            byte[] digested = md.digest(passBytes);
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < digested.length; i++) {
                sb.append(Integer.toHexString(0xff & digested[i]));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException ex) {
            System.out.println(ex);
        }
        return null;
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
