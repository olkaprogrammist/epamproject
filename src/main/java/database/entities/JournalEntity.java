package database.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Olga on 13.08.2017.
 */
@Entity
@Table(name = "journal", schema = "airport")
public class JournalEntity {
    private int note;

    @Id
    @Column(name = "note", nullable = false)
    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

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
