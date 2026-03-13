package tiho.boss;

public interface IRepository<T> {
    void save(T entity);
    T findById(int id);
    void delete(int id);
}