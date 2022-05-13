/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.fatec.java.web.calculator.servlets;

import static com.fatec.java.web.calculator.entities.Calculator.*;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "CalculatorServlet", urlPatterns = {"/"})
public class CalculatorServlet extends HttpServlet {
            
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Calculator</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Calculator</h1>");
            out.println("<form>");
            out.println("Number 1: <input type='text' name='txtNumber1'><br>");
            out.println("Number 2: <input type='text' name='txtNumber2'><br><br>");
            out.println("<input type='submit' name='btnCalculate' value='Sum'><br>");
            out.println("<input type='submit' name='btnCalculate' value='Subtract'><br>");
            out.println("<input type='submit' name='btnCalculate' value='Divide'><br>");
            out.println("<input type='submit' name='btnCalculate' value='Multiply'><br>");
            
            String strNumber1 = request.getParameter("txtNumber1");
            String strNumber2 = request.getParameter("txtNumber2");
            
            if(strNumber1 != null && strNumber1.length() > 0 && strNumber2 != null && strNumber2.length() > 0){
                Double number1 = Double.valueOf(strNumber1);
                Double number2 = Double.valueOf(strNumber2);
                Double result = 0.0;
                String operation = request.getParameter("btnCalculate");
                switch(operation){
                    case "Sum":
                        result = getSum(number1, number2);
                        break;
                    case "Subtract":
                        result = getSubtraction(number1, number2);
                        break;
                    case "Divide":
                        result = getDivision(number1, number2);
                        break;
                    case "Multiply":
                        result = getMultiplication(number1, number2);
                        break;
                }
                out.println(String.format("<h4>Result: %.2f</h4>", result));
            }
            out.println("</form>");
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
