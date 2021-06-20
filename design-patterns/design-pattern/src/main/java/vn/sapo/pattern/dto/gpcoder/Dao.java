package vn.sapo.pattern.dto.gpcoder;

import java.util.List;
import java.util.Optional;

/**
 * Data Access Object
 */
public interface Dao<T> {

    List<T> getAll();

    Optional<T> get(int id);

    void save(T t);

    void update(T t);

    void delete(T t);

}
