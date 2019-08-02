package servlets;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Servlet extends HttpServlet {
    private String responseTemplate =
            "<html>\n" +
                    "<body>\n" +
                    "<h2>Hello from Simple Servlet</h2>\n" +
                    "</body>\n" +
                    "</html>";
    @Override
    public void init() throws ServletException {
        print();
    }
    protected void doGet(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {

    }

    protected void doPost(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {
        String text = request.getParameter("fnanme");
    }

    public void process(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {
        response.getWriter();
    }

    public void print() {
        while (true) {
            try {
                Thread.sleep(1000);
                System.out.println("hello world ");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
/*        while (true) {
            try {
                Thread.sleep(1000);
                System.out.println("hello world " + System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }*/
    }
