package db;

import java.sql.SQLException;
import java.util.List;

public interface DAO<User> { // interfaces that implemented in apps with CRUD functions
    User get(int id) throws SQLException;
    List<User> getAll() throws SQLException;
    boolean add(User u) throws SQLException;
    boolean update(User u) throws SQLException;
    boolean delete(int id) throws SQLException;
}