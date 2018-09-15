/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int303.first.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sit.int303.first.model.SimpleCalculator;

/**
 *
 * @author INT303
 */
public class VerySimpleCalculatorServlet extends HttpServlet {

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
            
            try {
                
                String Strx = request.getParameter("x");
                String Stry = request.getParameter("y");
                String Operator = request.getParameter("operator");

                System.out.println("x"+Strx);
                System.out.println("y"+Stry);
                System.out.println("Oper"+Operator);
                
//                 double x = Double.parseDouble(Strx);
//                double y = Double.parseDouble(Stry);
                if (" ".equals(Operator)) {
                    Operator = "+";
                }
                int x = Integer.parseInt(Strx);
                int y = Integer.parseInt(Stry);
                SimpleCalculator sc = new SimpleCalculator();
                sc.setX(x);
                sc.setY(y);
                sc.setOperator(Operator);
                request.setAttribute("calculator", sc);
                getServletContext().getRequestDispatcher("/SimpleCalculatorView.jsp").forward(request, response);
                double ans = 0;
                
                
                if (!(" ".equals(Operator) || "-".equals(Operator) || "*".equals(Operator) || "/".equals(Operator))) {

                    out.println("<!DOCTYPE html>");
                    out.println("<html>");
                    out.println("<head>");
                    out.println("<title>Servlet VerySimpleCalculatorServlet</title>");
                    out.println("</head>");
                    out.println("<body>");
                    out.println("<h1>Servlet VerySimpleCalculatorServlet at " + request.getContextPath() + "</h1>");
                    out.println("<h1> Operator Error!!! </h1>");
                    out.println("</body>");
                    out.println("</html>");

                } else {
//                    switch (Operator) {
//                        case " ":
//                            ans = x + y;
//                            break;
//                        
//                        case "-":
//                            ans = x - y;
//                            break;
//                        case "*":
//                            ans = x * y;
//                            break;
//                        case "/":
//                            ans = x / y;
//                            break;
//
//                    }
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Servlet VerySimpleCalculatorServlet</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>Servlet VerySimpleCalculatorServlet at " + request.getContextPath() + "</h1>");
//                    out.println("<h1> X = " + x + " " + Operator + " Y = " + y + " = " + ans + "</h1>");
//                    out.println(String.format("<h1> X = %.2f %s Y = %.2f = %.2f</h1>", x, Operator, y, ans));
                out.print("<h1 style='color:red'>");
                out.print(sc.toString());
                out.print("</h1>");
                //%d = int %f foalt,double %s = String %c = char %b = boolean %.2f = XXX.XX %.3f = XXX.XXX 
                out.println("</body>");
                out.println("</html>");

                }
            } catch (Exception e) {
                
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Servlet VerySimpleCalculatorServlet</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>Servlet VerySimpleCalculatorServlet at " + request.getContextPath() + "</h1>");
                out.println("<h2>Input Error</h2>");
                out.println("</body>");
                out.println("</html>");
                
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
