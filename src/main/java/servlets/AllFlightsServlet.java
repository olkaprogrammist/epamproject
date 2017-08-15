package servlets;


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
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType ("text/html; charset=UTF-8");

        FlightDao flightDao = new FlightDao();
        List note = flightDao.getAll();
        req.setAttribute("note", note);
        for(int i = 0; i < note.size();i++){
            System.out.println(note.get(i));
        }

        req.getRequestDispatcher("/jsp/adminFlights.jsp").forward(req, resp);

    }
}
