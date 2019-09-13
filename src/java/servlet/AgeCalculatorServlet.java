package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AgeCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                .forward(request, response);
    }

     @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 
        String age = request.getParameter("age");
        int ageNext = Integer.parseInt(age);
        int finalAge = ageNext+1;
        String correctMsg = "your age next year will be ";
        String wrongMsg = "You must type your age.";
        
        log(age);
        
        request.setAttribute("age", age);
        request.setAttribute("correctMsg", correctMsg);
        request.setAttribute("finalAge", finalAge);
        
       
        if (age == null || age.equals("")) {
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                    .forward(request, response);
            return;
        }
       
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
        
    }
}