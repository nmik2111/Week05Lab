package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author naeun
 */
public class HomeServlet extends HttpServlet {

    /*
    shows welcome message(home.jsp) to user including their username
    home.jsp also shows Logout hyperlink makes a get request to take the user back to URL login and displys
    message saying "You have successfully logged out."
    */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

}
