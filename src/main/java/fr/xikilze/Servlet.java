package fr.xikilze;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class Servlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        PrintWriter out = res.getWriter(); 
        out.println("<html><body><h1>It works</h1></body></html>");
    }
}

