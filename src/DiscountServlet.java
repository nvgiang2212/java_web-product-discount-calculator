import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountServlet", urlPatterns = "/display-discount")
public class DiscountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name_product = request.getParameter("nameProduct");
        double list_price = Double.parseDouble(request.getParameter("price"));
        double discount_percent = Double.parseDouble(request.getParameter("discount"));

        double discount_amount = list_price * discount_percent * 0.01;
        double discount_price = list_price - discount_amount;

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h3>Product Description: " + name_product + "</h3>");
        writer.println("<h3>Price: $" + list_price + "</h3>");
        writer.println("<h3>Discount Percent: " + discount_percent + "%</h3>");
        writer.println("<h3>Discount Amount: $" + discount_amount + "</h3>");
        writer.println("<h3>Discount Price: $" + discount_price + "</h3>");
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
