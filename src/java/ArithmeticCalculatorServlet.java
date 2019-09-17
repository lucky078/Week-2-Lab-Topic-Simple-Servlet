/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javafx.scene.control.Alert;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 749300
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("result", "---");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        double finum = 0,senum = 0;
        double result = 0;
        try {
            finum = Double.parseDouble(request.getParameter("fnum"));
            senum = Double.parseDouble(request.getParameter("snum"));
        } catch (NumberFormatException | NullPointerException e) {
            request.setAttribute("result", "invalid ");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        }

        if (request.getParameter("add") != null) {

            result = finum + senum;
        }
        if (request.getParameter("sub") != null) {

            result = finum - senum;
        }
        if (request.getParameter("mul") != null) {

            result = finum * senum;
        }
        if (request.getParameter("mol") != null) {

            result = finum % senum;
        }
        request.setAttribute("result", result);
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);

    }
}
