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

    public List<FlightEntity> getReady(Boolean ready){
        Session s = HibernateUtil.getSessionFactory().openSession();
        Query query;

        query = s.createQuery("FROM FlightEntity where ready=:ready");
        query.setParameter("ready", ready);
        List<FlightEntity> list = query.list();
        return list;
    }

    public void updateReady(int id, boolean ready){
        Session s = HibernateUtil.getSessionFactory().openSession();
        Query query;

        query = s.createQuery("FROM FlightEntity where id=:id");
        query.setParameter("id", id);
        List<FlightEntity> list = query.list();
        list.get(0).setReady(ready);
        this.update(list.get(0));
    }
}
