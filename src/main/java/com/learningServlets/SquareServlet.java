package com.learningServlets;

import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

public class SquareServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
//        HttpSession session = req.getSession();
        int k = 0;

        Cookie[] cookies = req.getCookies();

        for(Cookie c : cookies){
            if(c.getName().equals("k")){
                k = Integer.parseInt(c.getValue());
            }
        }

        PrintWriter out = res.getWriter();
        out.println("sq called: " + k*k);
    }
}