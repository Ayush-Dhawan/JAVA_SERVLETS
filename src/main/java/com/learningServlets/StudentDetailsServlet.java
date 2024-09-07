package com.learningServlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

public class StudentDetailsServlet extends HttpServlet{
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        String name = req.getParameter("name");
        int roll_number = Integer.parseInt(req.getParameter("roll_number"));

//        PrintWriter out = res.getWriter();
//        out.println(roll_number);
//        req.setAttribute("k", roll_number);
//
//        RequestDispatcher rd = req.getRequestDispatcher("sq");
//        rd.forward(req, res);
//        HttpSession session = req.getSession();
//        session.setAttribute("k", roll_number);
        Cookie cookie = new Cookie("k", roll_number + "");
        res.addCookie(cookie);
        res.sendRedirect("sq") ;
    }
}