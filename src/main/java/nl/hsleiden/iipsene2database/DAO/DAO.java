package nl.hsleiden.iipsene2database.DAO;

import java.util.List;

public interface DAO<T> {
    List<T> getAll();
    T get(Long id);
    T create(T t);
    void delete(T t);
}
