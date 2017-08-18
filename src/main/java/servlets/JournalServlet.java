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


@WebServlet("/journal")
public class JournalServlet extends HttpServlet {
    final static Logger logger = Logger.getLogger(RegistrationServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("/jsp/errorPage.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Map<String,String[]> params = req.getParameterMap();
        List<String> errors = new ArrayList<>();
        for(Map.Entry<String, String[]> entry : params.entrySet()){
            System.out.println(entry.getKey() + ": " + Arrays.toString(entry.getValue()));
        }


        if (params.get("staff_id").length == 7 && params.get("flight_id").length == 1){
            for (int i = 0; i < 7; i++){
                JournalBean journalBean = new JournalBean();
                journalBean.setFlightId(Integer.parseInt(params.get("flight_id")[0]));
                journalBean.setStaffId(Integer.parseInt(params.get("staff_id")[i]));
                registerJournal(journalBean);
            }
        } else {
            errors.add("data_missing_error");
            req.setAttribute("errors", errors);
            resp.sendRedirect("/jsp/crewSelection.jsp");
            logger.info("data missing error");
        }

        resp.sendRedirect("/jsp/dispMenu.jsp");

    }

    public void registerJournal(JournalBean bean) {
        JournalDao dao = new JournalDao();
        dao.save(bean.toEntity());
    }
}
