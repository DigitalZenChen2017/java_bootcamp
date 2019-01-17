package db;

import java.sql.SQLException;
import java.util.List;

import business.Vendor;

public interface VendorDAO { // interfaces that implemented in apps with CRUD functions
    Vendor get(int id) throws SQLException;
    List<Vendor> getAll() throws SQLException;
    boolean add(Vendor v) throws SQLException;
    boolean update(Vendor v) throws SQLException;
    boolean delete(int id) throws SQLException;
}