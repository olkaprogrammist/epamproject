package servlets;


import beans.FlightBean;
import beans.JournalBean;
import database.dao.FlightDao;
import database.dao.JournalDao;
import database.dao.StaffDao;
import database.entities.JournalEntity;
import database.entities.StaffEntity;
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

@WebServlet("/crew")
public class CrewServlet extends HttpServlet {
    final static Logger logger = Logger.getLogger(AllFlightsServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("/jsp/errorPage.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        JournalDao journalDao = new JournalDao();
        StaffDao staffDao = new StaffDao();
        Map<String, String[]> params = req.getParameterMap();
        List<String> errors = new ArrayList<>();

        int flightId = Integer.parseInt(params.get("list_id")[0]);
        List<JournalEntity> journalEntityList = journalDao.getListWithId(flightId);
        List<StaffEntity> firstPilotList = new ArrayList<>();
        List<StaffEntity> secondPilotList = new ArrayList<>();
        List<StaffEntity> operatorList = new ArrayList<>();
        List<StaffEntity> navigatorList = new ArrayList<>();
        List<StaffEntity> steward1List = new ArrayList<>();
        List<StaffEntity> steward2List = new ArrayList<>();
        List<StaffEntity> steward3List = new ArrayList<>();

        firstPilotList = staffDao.getStaffById(journalEntityList.get(0).getStaffId());
        secondPilotList = staffDao.getStaffById(journalEntityList.get(1).getStaffId());
        operatorList = staffDao.getStaffById(journalEntityList.get(2).getStaffId());
        navigatorList = staffDao.getStaffById(journalEntityList.get(3).getStaffId());
        steward1List = staffDao.getStaffById(journalEntityList.get(4).getStaffId());
        steward2List = staffDao.getStaffById(journalEntityList.get(5).getStaffId());
        steward3List = staffDao.getStaffById(journalEntityList.get(6).getStaffId());

        req.setAttribute("firstPilotList", firstPilotList);
        req.setAttribute("secondPilotList", secondPilotList);
        req.setAttribute("operatorList", operatorList);
        req.setAttribute("navigatorList", navigatorList);
        req.setAttribute("steward1List", steward1List);
        req.setAttribute("steward2List", steward2List);
        req.setAttribute("steward3List", steward3List);
        req.setAttribute("journalEntityList", journalEntityList);


        req.getRequestDispatcher("/jsp/showCrew.jsp").forward(req, resp);


    }
}
