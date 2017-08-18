package database.entities;

import javax.persistence.*;

/**
 * Created by Olga on 13.08.2017.
 */
@Entity
@Table(name = "journal", schema = "airport")
public class JournalEntity {
    private int note;
    private int flightId;
    private int staffId;

    @Id
    @Column(name = "note", nullable = false)
    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    @Basic
    @Column(name = "flight_id", nullable = false)
    public int getFlightId(){return flightId;}

    public void setFlightId(int flightId){this.flightId = flightId;}

    @Basic
    @Column(name = "staff_id", nullable = false)
    public int getStaffId(){return staffId;}

    public void setStaffId(int staffId){this.staffId = staffId;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        JournalEntity that = (JournalEntity) o;

        if (note != that.note) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return note;
    }
}
