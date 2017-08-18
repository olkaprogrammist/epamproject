package servlets;


import database.dao.CitiesDao;
import database.dao.StaffDao;
import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/staff")
public class StaffServlet extends HttpServlet {
    final static Logger logger = Logger.getLogger(CitiesServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("/jsp/errorPage.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        StaffDao staffDao = new StaffDao();
        List list = staffDao.getAll();
        req.setAttribute("list", list);
        req.setAttribute("flight_id", req.getParameter("flight_id"));

    //    List newList = staffDao.getStaffByRole("стюард");
    //    System.out.println("newList size:" + newList.size());

        req.getRequestDispatcher("/jsp/crewSelection.jsp").forward(req, resp);}
}
