package servlets;


import beans.FlightBean;
import database.dao.FlightDao;
import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/flightList")
public class AllFlightsServlet extends HttpServlet {
    final static Logger logger = Logger.getLogger(AllFlightsServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("/jsp/errorPage.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        FlightDao flightDao = new FlightDao();
        List note = flightDao.getReady(false);
        req.setAttribute("note", note);

        List newList = flightDao.getReady(true);

        req.setAttribute("newList", newList);
        System.out.println(req.getSession().getAttribute("role"));

        if (req.getSession().getAttribute("role").equals("admin")) {
            req.getRequestDispatcher("/jsp/adminFlights.jsp").forward(req, resp);
        } else {
            req.getRequestDispatcher("/jsp/dispFlights.jsp").forward(req, resp);
        }



    }
}
