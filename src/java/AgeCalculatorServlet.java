/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 749300
 */
public class AgeCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            int Age1 = Integer.parseInt(request.getParameter("age"));
            if (Age1 < 0) {
                request.setAttribute("mAge", "You must give your current age");
                getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                        .forward(request, response);
            }

            request.setAttribute("mAge", "Your age next birthday will be " + ++Age1);
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                    .forward(request, response);
        } catch (NumberFormatException | NullPointerException e) {
            request.setAttribute("mAge", "You must give your current age");
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                    .forward(request, response);

        }
    }

}
