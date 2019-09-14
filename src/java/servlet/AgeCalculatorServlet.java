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
       
         try{
        String age = request.getParameter("age");
        int ageNext = Integer.parseInt(age);
        int finalAge = ageNext+1;
        
        
        String nullError= "You must type your age.";
        String msg;
        String correctRe = "Your age next year is "+finalAge;
        
        log(age);
        
        request.setAttribute("age", age);
        request.setAttribute("ageNext", ageNext);
        request.setAttribute("nullError", nullError);
        request.setAttribute("finalAge", finalAge);
        
        request.setAttribute("msg", correctRe);
       
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                    .forward(request, response);
       
        if (age == null || age.equals("")) 
        {
            String error = "You must type your current age";
            request.setAttribute("msg", error);
            
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                    .forward(request, response);
            return;
        }
       
        
        }
         catch(NumberFormatException e)
        {
            String numberError = "Please, type number";
            request.setAttribute("msg", numberError);
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
            e.getMessage();
        }
    }
}