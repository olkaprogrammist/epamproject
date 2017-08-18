package database.dao;

import database.entities.FlightEntity;
import database.entities.StaffEntity;
import database.util.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.List;


public class StaffDao extends DaoInterfaceImp<StaffEntity, String> {
    public StaffDao() {
        super(StaffEntity.class);
    }

    public List<StaffEntity> getStaffByRole(String position){
        Session s = HibernateUtil.getSessionFactory().openSession();
        Query query;
        query = s.createQuery("FROM StaffEntity where position=:position");
        query.setParameter("position", position);
        List<StaffEntity> list = query.list();

        return list;
    }

    public List<StaffEntity> getStaffById(int staff_id){
        Session s = HibernateUtil.getSessionFactory().openSession();
        Query query;
        query = s.createQuery("FROM StaffEntity where id=:staff_id");
        query.setParameter("staff_id", staff_id);
        List<StaffEntity> list = query.list();
        return list;
    }

}
