package database.dao;

import database.entities.FlightEntity;
import database.entities.JournalEntity;
import database.util.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.List;

public class JournalDao extends DaoInterfaceImp<JournalEntity, String> {
    public JournalDao() {
        super(JournalEntity.class);
    }

    public List<JournalEntity> getListWithId(int flight_id){
        Session s = HibernateUtil.getSessionFactory().openSession();
        Query query;

        query = s.createQuery("FROM JournalEntity where flightId=:flight_id");
        query.setParameter("flight_id", flight_id);
        List<JournalEntity> list = query.list();
        return list;
    }


}
