package servlets;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Timer;

public class ServletLog extends HttpServlet {
    String name = "";
    @Override
    public void init(ServletConfig config) throws ServletException{
        Timer timer = new Timer();
        ScheduledTask task = new ScheduledTask(this.name);
        timer.scheduleAtFixedRate(task, 0, 1000);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
        System.out.println("Servlet Log do post");
        String string = request.getParameter("fname");
        System.out.println(string);
        this.name = string;
        //this.destroy();
        this.init();
        //String name1 = getInitParameter("name");
/*        ServletContext servletContext = getServletContext();
        servletContext.setAttribute("name", string);*/
        //PrintWriter out = new PrintWriter("The value is changed");
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }

}