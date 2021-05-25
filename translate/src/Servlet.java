import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "Servlet",urlPatterns = "/translate")
public class Servlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String,String> map = new HashMap<>();
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");
        map.put("banana","Chuối");
        map.put("apple","Táo");
        map.put("blackberry","Dâu đen");
        map.put("pineapple","Dứa");
        String text = request.getParameter("text");
        PrintWriter writer = response.getWriter();
        if(map.containsKey(text)){
            writer.println(map.get(text));
        }
        else{
            writer.println("Not Found");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
