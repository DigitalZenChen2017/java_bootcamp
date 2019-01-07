package db;

import java.sql.SQLException;
import java.util.List;

public interface DAO<Stuffie> { // interfaces that implemented in apps with CRUD functions
    Stuffie get(String code);
    List<Stuffie> getAll() throws SQLException;
    boolean add(Stuffie t) throws SQLException;
    boolean update(Stuffie t) throws SQLException;
    boolean delete(Stuffie t) throws SQLException;
}