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
import java.io.IOException;
import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;
import java.util.Map;


@WebServlet("/cancel")
public class CancelServlet extends HttpServlet {
    final static Logger logger = Logger.getLogger(CancelServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("/jsp/errorPage.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        FlightBean bean = new FlightBean();

        Map<String, String[]> params = req.getParameterMap();


        int id = Integer.parseInt(params.get("flight_id")[0]);


        bean.setReady(false);
        registerFlight(id);
        logger.info("Flight  has update");
        resp.sendRedirect("/jsp/adminMenu.jsp");

    }

    public void registerFlight(int id) {
        FlightDao dao = new FlightDao();
        dao.updateReady(id,false);
    }
}
