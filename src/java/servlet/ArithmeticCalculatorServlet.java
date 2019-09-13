package servlet;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 784564
 */
//@WebServlet(name = "ArithmeticCalculatorServlet", urlPatterns = {"/ArithmeticCalculatorServlet"})
public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String first = request.getParameter("first");
        String second = request.getParameter("second");
        
        int firstVal = Integer.parseInt(first);
        int secondVal = Integer.parseInt(second);
        
        int result = firstVal + secondVal;
        String correctMsg = "your age next year will be ";
      
        log(first);
        request.setAttribute("first", first);
        request.setAttribute("second", second);
        request.setAttribute("firstVal", firstVal);
        request.setAttribute("secondVal", secondVal);
        request.setAttribute("result", result);
         if (first == null || first.equals("")||second == null || second.equals("")) {
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp.jsp")
                    .forward(request, response);
            return;
        }
         
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        
         
    }

   


}
