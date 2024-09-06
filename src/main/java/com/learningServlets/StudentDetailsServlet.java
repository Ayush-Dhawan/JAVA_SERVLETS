package com.learningServlets;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class StudentDetailsServlet extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        String name = req.getParameter("name");
        int roll_number = Integer.parseInt(req.getParameter("roll_number"));

        PrintWriter out = res.getWriter();
        out.println("<h1>" + name + "</h1>");

    }
}
