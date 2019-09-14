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
       
         try{
        String first = request.getParameter("first");
        int firstVal = Integer.parseInt(first);
        
        String second = request.getParameter("second");
        int secondVal = Integer.parseInt(second);
        
        String result;
        
        int number;
        
        log(first);
        
        request.setAttribute("first", first);
        request.setAttribute("firstVal", firstVal);
        request.setAttribute("second", second);
        request.setAttribute("secondVal", secondVal);

         if (first == null || first.equals("") || second == null || second.equals("")) 
        {
            String error = "You must type each of values";
            request.setAttribute("result", error);
            
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                    .forward(request, response);
            return;
        }
         
         
         
        if(request.getParameter("button").equals("+"))
        {
            number = firstVal + secondVal;
            request.setAttribute("result", number);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                    .forward(request, response);
        }
        else if(request.getParameter("button").equals("-"))
        {
            number = firstVal - secondVal;
            request.setAttribute("result", number);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                    .forward(request, response);
        }
        else if(request.getParameter("button").equals("*"))
        {
            number = firstVal * secondVal;
            request.setAttribute("result", number);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                    .forward(request, response);
        }
        else
        {
            number = firstVal % secondVal;
           request.setAttribute("result", number);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                    .forward(request, response);
            
        }
         
        
       
        }
         catch(NumberFormatException e)
        {
            String numberError = "Please, type number";
            request.setAttribute("result", numberError);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            e.getMessage();
        }
    }
}
   



