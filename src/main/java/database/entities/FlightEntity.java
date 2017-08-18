package database.entities;

import com.sun.org.apache.xpath.internal.operations.Bool;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by Olga on 13.08.2017.
 */
@Entity
@Table(name = "flight", schema = "airport")
public class FlightEntity {
    private int id;
    private String fromPlace;
    private String toPlace;
    private String date;
    private Boolean ready;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "from_place", nullable = false, length = 45)
    public String getFromPlace() {
        return fromPlace;
    }

    public void setFromPlace(String fromPlace) {
        this.fromPlace = fromPlace;
    }

    @Basic
    @Column(name = "to_place", nullable = false, length = 45)
    public String getToPlace() {
        return toPlace;
    }

    public void setToPlace(String toPlace) {
        this.toPlace = toPlace;
    }

    @Basic
    @Column(name = "date", nullable = false)
    public String getDate() { return date;}

    public void setDate(String date) {
        this.date = date;
    }

    @Basic
    @Column(name = "ready", nullable = false)
    public Boolean getReady() {
        return ready;
    }

    public void setReady(Boolean ready) {
        this.ready = ready;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FlightEntity that = (FlightEntity) o;

        if (id != that.id) return false;
        if (fromPlace != null ? !fromPlace.equals(that.fromPlace) : that.fromPlace != null) return false;
        if (toPlace != null ? !toPlace.equals(that.toPlace) : that.toPlace != null) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;
        if (ready != null ? !ready.equals(that.ready) : that.ready != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (fromPlace != null ? fromPlace.hashCode() : 0);
        result = 31 * result + (toPlace != null ? toPlace.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (ready != null ? ready.hashCode() : 0);
        return result;
    }
}
