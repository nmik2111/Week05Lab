package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.User;

/**
 *
 * @author naeun
 */
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //displays login form(login.jsp) and messages
        //responsible for logging out, parameter "logout" exitsts -> invalidate the session and display message
        
        getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        /*processes the submission form from login.jsp
        1. validates user name and password is not empty
        2. passes user name and password parameters to the login() method of a service class called AccountService
        3. if login() returns non-null value, store the username in serrion variable and redirect(NO FORWARD) the user to home url
        4. if authentication parameters are invalid, display appropriate error message, keeping textboxes filled in with
            what user had previously entered and forward user to login.jsp*/
        
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        if (username == null || username.equals("") || password == null || password.equals("")) {
            User user = new User(username, password);
            request.setAttribute("user", user);
            getServletContext().getRequestDispatcher("/WEB-INF/home.jsp").forward(request, response);
        } else {
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
        }
    }
}