package servlets;


import database.dao.CitiesDao;
import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/cities")
public class CitiesServlet extends HttpServlet {
    final static Logger logger = Logger.getLogger(CitiesServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("/jsp/errorPage.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType ("text/html; charset=UTF-8");

        CitiesDao citiesDao = new CitiesDao();
        List cities = citiesDao.getAll();
        req.setAttribute("cities", cities);
        req.getRequestDispatcher("/jsp/createFlight.jsp").forward(req, resp);

    }
}
