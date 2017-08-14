package database.dao;

import database.entities.StaffEntity;


public class StaffDao extends DaoInterfaceImp<StaffEntity, String> {
    public StaffDao() {
        super(StaffEntity.class);
    }


}
