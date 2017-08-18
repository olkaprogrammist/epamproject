package beans;

import database.entities.FlightEntity;
import database.entities.JournalEntity;
import database.entities.UserEntity;

import java.security.MessageDigest;
import java.security.SecureRandom;
import java.sql.Timestamp;
import java.util.Locale;

/**
 * Created by Olga on 14.08.2017.
 */
public class JournalBean {

    private int flightId;
    private int staffId;

    public JournalBean() {
    }

    public int getFlightId(){return flightId;}

    public void setFlightId(int flightId){this.flightId = flightId;}

    public int getStaffId(){return  staffId;}

    public void setStaffId(int staffId){this.staffId = staffId;}

    public JournalEntity toEntity() {
        JournalEntity entity = new JournalEntity();
        entity.setFlightId(flightId);
        entity.setStaffId(staffId);
        return entity;
    }
}
