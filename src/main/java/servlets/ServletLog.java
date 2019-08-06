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
    ScheduledTask task;

    @Override
    public void init(ServletConfig config) throws ServletException{
        Timer timer = new Timer();
        task = new ScheduledTask();
        timer.scheduleAtFixedRate(task, 0, 1000);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
        String string = request.getParameter("fname");
        task.setText(string);
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }

}