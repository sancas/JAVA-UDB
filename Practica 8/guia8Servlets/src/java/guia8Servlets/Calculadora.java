/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author sanch
 */
@WebServlet(name = "Calculadora", urlPatterns = {"/Calculadora"})
public class Calculadora extends HttpServlet {

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
        String str = request.getParameter("r1");
        String str1 = request.getParameter("t1");
        String str2 = request.getParameter("t2");
        String final_output="";
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        num1 = Integer.parseInt(str1);
        num2 = Integer.parseInt(str2);
        if (str.equals("sum"))
        {
            num3 = num1 + num2;
            final_output = "Suma";
        }
        if (str.equals("resta"))
        {
            num3 = num1 - num2;
            final_output = "Resta";
        }
        if (str.equals("mul"))
        {
            num3 = num1 * num2;
            final_output = "Multiplicacion";
        }
        if (str.equals("div"))
        {
            num3 = num1 / num2;
            final_output = "Division";
        }
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Calculadora</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<p>");
            out.println("La operacion matematica seleccionada es: ");
            out.println(final_output);
            out.println("</p>");
            out.println("<p>");
            out.println("El resultado es: " + num3);
            out.println("</p>");
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
