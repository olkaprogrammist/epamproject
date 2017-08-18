package database.util;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import servlets.AllFlightsServlet;

public class HibernateUtil {
    private static final SessionFactory sessionFactory;
    final static Logger logger = Logger.getLogger(HibernateUtil.class);
    static {
        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            logger.error("Problems with Hibernate",ex);
            throw new ExceptionInInitializerError(ex);

        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
