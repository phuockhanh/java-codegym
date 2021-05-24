import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet", urlPatterns = "/calculator")
public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String namePd = request.getParameter("name-pd");
        float listPrice = Float.parseFloat(request.getParameter("list-price"));
        float percent = Float.parseFloat(request.getParameter("percent"));
        PrintWriter writer = response.getWriter();
        float discount = listPrice * percent /100;
        writer.println("Name Product: "+namePd);
        writer.println("List Price: "+listPrice);
        writer.println("Percent : "+percent);
        writer.println("----------------------");
        writer.println("Discount Amount " + discount);
        writer.println("Discount Price " + (listPrice-discount));
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
