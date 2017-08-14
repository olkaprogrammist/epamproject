package database.dao;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Olga on 13.08.2017.
 */
public interface DaoInterface<T, PK extends Serializable> {
    T getById(PK id);

    List<T> getAll();
    PK save(T entity);

    void update(T entity);

    void deleteById(PK id);


}
