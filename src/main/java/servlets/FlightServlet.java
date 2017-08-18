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
import java.util.ArrayList;

import java.util.List;


@WebServlet("/createFlight")
public class FlightServlet extends HttpServlet {
    final static Logger logger = Logger.getLogger(RegistrationServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("/jsp/errorPage.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String fromPlace = req.getParameter("fromPlace");
        String toPlace = req.getParameter("toPlace");
        String date = req.getParameter("date");

        List<String> errors = new ArrayList<>();

        // FlightDao flightDao = new FlightDao();


        if (fromPlace == null || fromPlace.isEmpty()) {
            errors.add("fromPlace_missing_error");
            logger.info("fromPlace missing error");
        }

        if (toPlace == null || toPlace.isEmpty()) {
            errors.add("toPlace_missing_error");
            logger.info("toPlace missing error");
        }

        if (date == null || date.isEmpty()) {
            errors.add("date_missing_error");
            logger.info("date missing error");
        }

        if (errors.size() == 0) {
            FlightBean bean = new FlightBean();
            bean.setFromPlace(fromPlace);
            bean.setToPlace(toPlace);
            bean.setDate(date);
            bean.setReady(false);
            registerFlight(bean);
            logger.info("Flight from " + fromPlace + " to " + toPlace + " " + date + " has registered");


            resp.sendRedirect("/jsp/adminMenu.jsp");
        } else {
//            for (int i = 0; i < errors.size(); i++) {
//                System.out.println(errors.get(i));
//            }
            req.getRequestDispatcher("/cities").forward(req, resp);
        }
    }


    public void registerFlight(FlightBean bean) {
        FlightDao dao = new FlightDao();
        dao.save(bean.toEntity());
    }

}
