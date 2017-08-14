package servlets;

import beans.RegistrationBean;
import database.dao.UserDao;
import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@WebServlet("/registration")
public class RegistrationServlet extends HttpServlet {
    final static Logger logger = Logger.getLogger(RegistrationServlet.class);
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("/jsp/error_page.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String password = req.getParameter("password");
        String role = req.getParameter("role");


        String regexLogin = "^[a-zA-Z0-9_-]{3,15}$";
        String regexPassword = "^[a-zA-Z0-9_-]{5,45}$";

        List<String> errors = new ArrayList<>();

        UserDao usersDao = new UserDao();

        // Проверка логина
        if (login == null || login.isEmpty()) {
            errors.add("login_missing_error");
            logger.info("login missing error");
        } else if (!checkWithRegExp(login, regexLogin)) {
            errors.add("login_not_valid_error");
            logger.info("login " + login + " not valid");
        } else if (usersDao.isLoginExist(login)) {
            errors.add("login_already_used_error");
            logger.info("login " + login + " already used");
        }

        // Проверка пароля
        if (password == null || password.isEmpty()) {
            errors.add("password_missing_error");
            logger.info("password missing error");
        }else if(!checkWithRegExp(password, regexPassword)){
            errors.add("password_not_valid_error");
            logger.info("password " + password + " not valid");
        }

        // Проверка роли
        if (role == null || role.isEmpty()) {
            errors.add("role_missing_error");
            logger.info("role missing error");
        }

        if (errors.size()==0) {
            RegistrationBean bean = new RegistrationBean();
            bean.setLogin(login);
            bean.setPassword(password);
            bean.setRole(role);
            registerUser(bean);
            logger.info("User " + login + " has registered");
            resp.sendRedirect("/jsp/registration_success.jsp");
        } else {
            req.setAttribute("current_login",login);
//            for (String s : errors) {
//                resp.addCookie(new Cookie(s,""));
//            }
            req.getRequestDispatcher("/jsp/registrationPage.jsp").forward(req, resp);
        }
    }

    public void registerUser(RegistrationBean bean) {
        UserDao dao = new UserDao();
        dao.save(bean.toEntity());
    }

    public boolean checkWithRegExp(String str, String regex) {
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(str);
        return m.matches();
    }
}
