package database.dao;

import database.entities.FlightEntity;

/**
 * Created by Olga on 13.08.2017.
 */
public class FlightDao extends DaoInterfaceImp<FlightEntity, String> {
    public FlightDao() {
        super(FlightEntity.class);
    }
}
