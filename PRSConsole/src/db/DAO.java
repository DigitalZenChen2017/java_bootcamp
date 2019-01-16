package db;

import java.sql.SQLException;
import java.util.List;
import business.User;

public interface DAO<User> { // interfaces that implemented in apps with CRUD functions
    List<User> getAll() throws SQLException;
    User get(int id) throws SQLException;
    boolean add(User u) throws SQLException;
    boolean update(User u) throws SQLException;
    boolean delete(User u) throws SQLException;
}