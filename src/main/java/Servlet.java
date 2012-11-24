import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class Servlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        PrintWriter out = res.getWriter(); 
        out.println("<html><body>Test</body></html>");
    }
}

