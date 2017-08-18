package servlets;

import database.dao.UserDao;
import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    final static Logger logger = Logger.getLogger(LoginServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("/jsp/errorPage.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserDao dao = new UserDao();
        String login = req.getParameter("login");
        String password = req.getParameter("password");

        if (login == null || password == null) {
            resp.sendRedirect("/jsp/errorPage.jsp");
            return;
        }


        if (dao.isUserCorrect(login, password)) {
            req.getSession().setAttribute("userLogin", login);
            String displayedLogin = (login.length() < 8) ? login : login.substring(0, 7) + "..";
            req.getSession().setAttribute("displayedLogin", displayedLogin);


            logger.info("User " + login + " log in ");
            req.getSession().setAttribute("role", dao.getRole(login));
            if(dao.getRole(login).equals("dispatcher")){

                resp.sendRedirect("/jsp/dispMenu.jsp");
            } else {
                resp.sendRedirect("jsp/adminMenu.jsp");
            }

        } else {
            req.setAttribute("errorMessage", "Error");
            req.getRequestDispatcher("/jsp/loginPage.jsp").forward(req, resp);
        }
    }
}
