package database.dao;

import database.entities.FlightEntity;
import database.entities.UserEntity;
import database.util.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.List;

/**
 * Created by Olga on 13.08.2017.
 */
public class FlightDao extends DaoInterfaceImp<FlightEntity, String> {
    public FlightDao() {
        super(FlightEntity.class);
    }

    public Boolean getReady(Boolean ready){
        Session s = HibernateUtil.getSessionFactory().openSession();
        Query query;

        query = s.createQuery("FROM FlightEntity where ready=:ready");
        query.setParameter("ready", ready);

        List<FlightEntity> list = query.list();
        if (list.size() != 0) {
            return list.get(0).getReady();
        } else return false;
    }
}
