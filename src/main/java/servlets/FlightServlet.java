package servlets;



import database.dao.CitiesDao;
import database.dao.UserDao;
import database.entities.CitiesEntity;
import database.entities.UserEntity;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Created by Olga on 21.07.2017.
 */
public class FlightServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        StringBuilder sb = new StringBuilder();
        response.setContentType("text/html; charset=UTF-8");

//        UserDao userDao = new UserDao();
 //       UserEntity userEntity = new UserEntity();
//        userEntity.setLogin("olka");
//        userEntity.setPassword("kek");
//        userEntity.setRole("admin");




//        System.out.println(userDao.save(userEntity));
//
//        List currentUsers = userDao.getAll();

 //       System.out.println("currentUser " + currentUsers.size());
        PrintWriter out = response.getWriter();

        out.println(sb.toString());
        out.close();
        response.setStatus(HttpServletResponse.SC_OK);

    }
}
