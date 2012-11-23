@Servlet(urlMappings={"/test"})
public class Servlet {
    @GET
    public void handleGet(HttpServletRequest req, HttpServletResponse res) {
        PrintWriter out = res.getWriter(); 
        out.println("<html><body>Test</body></html>");
    }
}

