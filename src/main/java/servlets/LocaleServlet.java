package servlets;

import beans.FlightBean;
import beans.JournalBean;
import database.dao.FlightDao;
import database.dao.JournalDao;
import javafx.beans.binding.IntegerBinding;
import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.jstl.core.Config;
import java.io.IOException;
import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;
import java.util.Map;


@WebServlet("/locale")
public class LocaleServlet extends HttpServlet {
    final static Logger logger = Logger.getLogger(LocaleServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String locale = req.getParameter("value");
        HttpSession session = req.getSession();

        if (locale.equals("ru")) {
            Config.set(req.getSession(), Config.FMT_LOCALE, new java.util.Locale("ru", "RU"));
            logger.info("User set locale ru");
        } else if (locale.equals("en")) {
            Config.set(req.getSession(), Config.FMT_LOCALE, new java.util.Locale("en"));
            logger.info("User set locale en");
        }
        String url = req.getHeader("referer");
        resp.sendRedirect(url);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("/jsp/errorPage.jsp");
    }


}
