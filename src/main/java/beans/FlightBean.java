package beans;

import database.entities.FlightEntity;
import database.entities.UserEntity;

import java.security.MessageDigest;
import java.security.SecureRandom;
import java.sql.Timestamp;
import java.util.Locale;

/**
 * Created by Olga on 14.08.2017.
 */
public class FlightBean {

    private String fromPlace;
    private String toPlace;
    private String date;
    private Boolean ready;

    public FlightBean() {
    }

    public String getToPlace() {
        return toPlace;
    }

    public void setToPlace(String toPlace) {
        this.toPlace = toPlace;
    }

    public String getFromPlace(){return fromPlace;}

    public void setFromPlace(String fromPlace){this.fromPlace = fromPlace;}

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Boolean getReady(){return ready;}

    public void setReady(Boolean ready){this.ready = ready;}


    public FlightEntity toEntity() {
        FlightEntity entity = new FlightEntity();
        entity.setFromPlace(fromPlace);
        entity.setToPlace(toPlace);
        entity.setDate(date);
        entity.setReady(ready);
        return entity;
    }
}
