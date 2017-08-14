package database.dao;

import database.entities.CitiesEntity;


public class CitiesDao extends DaoInterfaceImp<CitiesEntity, String> {
    public CitiesDao() {
        super(CitiesEntity.class);
    }


}
