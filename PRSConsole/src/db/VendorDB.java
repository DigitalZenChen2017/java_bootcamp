package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import business.Vendor;

@SuppressWarnings("rawtypes")
public class VendorDB implements VendorDAO {
	@SuppressWarnings("unchecked")
	@Override
	public List getAll() throws SQLException {
		// TODO Auto-generated method stub
		List<Vendor> vendors = new ArrayList<Vendor>(); // declare ArrayList as List
		Connection conn = getConnection();
//		Statement smt = conn.createStatement();
		String query = "SELECT * FROM vendor";
		PreparedStatement ps = conn.prepareStatement(query);
//		ResultSet rs = ps.executeQuery("SELECT * FROM user");
		ResultSet rs = ps.executeQuery();
		while (rs.next()) { // if Result Set next row/record exists, process each user
			// process stuffy
			int id = rs.getInt(1);
			String code = rs.getString(2);
			String name = rs.getString(3);
			String address = rs.getString(4);
			String city = rs.getString(5);
			String state = rs.getString(6);
			String zip = rs.getString(7);
			String phone = rs.getString(7);
			String email = rs.getString(8);

			// create instance of Vendor object
			Vendor v = new Vendor(id, code, name, address, city, state, zip, phone, email);
			vendors.add(v);
		}
		rs.close();
		return vendors;
	}

	public boolean add(Vendor v) throws SQLException {
		// TODO Auto-generated method stub
		boolean success = false;
		Connection connection = getConnection();
		String query = "INSERT into vendor" + "(code, name, address, city, state, zip, phoneNumber, email)" + "VALUES('"
				+ v.getCode() + "','" + v.getName() + "','" + v.getAddress() + "','" + v.getCity() + "','"
				+ v.getState() + "','" + v.getZip() + "','" + v.getPhone() + "','" + v.getEmail() + ")";
		Statement statement = connection.createStatement();
		int rowCount = statement.executeUpdate(query);

		if (rowCount > 0)
			success = true;
		return success;
	}

	public boolean update(Vendor v) throws SQLException {
		// TODO Auto-generated method stub
		Connection connection = getConnection(); // create an instance of Connection object
		String query = "UPDATE vendor SET " + " Code = '" + v.getCode() + "', " + " Name ='" + v.getName()
				+ " Address ='" + v.getAddress() + " City ='" + v.getCity() + " State ='" + v.getState() + " Zip ='"
				+ v.getZip() + " PhoneNumber ='" + v.getPhone() + " Email ='" + v.getEmail() + "WHERE ID = '"
				+ v.getId() + "'";
//		String query = "UPDATE stuffie SET " 
//					   + "	Type = ?, "
//					   + "  Color = ?, "
//					   + "  Size = ? "
//					   + "WHERE ID = ?";
//		PreparedStatement ps = connection.prepareStatement(query);
//		ps.setString(1, s.getType());
//		ps.setString(2, s.getColor());
//		ps.setString(3, s.getSize());
//		int rowCount = ps.executeUpdate();
		Statement statement = connection.createStatement(); // creates statement from String query to send to MySQL
		int rowCount = statement.executeUpdate(query);

		boolean success = false;

		if (rowCount > 0)
			success = true;
		return success;
	}

	public boolean delete(int id) throws SQLException {
		// TODO Auto-generated method stub
		boolean success = false;
		Connection connection = getConnection();
		String query = "DELETE FROM vendor WHERE ID = " + id;
		Statement statement = connection.createStatement();
		int rowCount = statement.executeUpdate(query);

		if (rowCount > 0)
			success = true;
		return success;

	}

	// method that connects to MySQL database
	private Connection getConnection() throws SQLException {
		String dbURL = "jdbc:mysql://localhost:3306/prs?allowPublicKeyRetrieval=true&useSSL=false";
		String username = "prs_user";
		String password = "default123";
		Connection connection = DriverManager.getConnection(dbURL, username, password);
		return connection;
	}

	public Vendor get(int id) throws SQLException {
		// TODO Auto-generated method stub
//		List<User> users = new ArrayList<User>(); // declare ArrayList as List
//		Connection conn = getConnection();
//		Statement smt = conn.createStatement();
//		ResultSet rs = smt.executeQuery("SELECT * FROM user");
//		while (rs.next()) { // if Result Set next row/record exists, process each user
//			// process stuffy
//			int id = rs.getInt(1);
//			String userName = rs.getString(2);
//			String password = rs.getString(3);
//			String firstName = rs.getString(4);
//			String lastName = rs.getString(5);
//			String phoneNumber = rs.getString(6);
//			String email = rs.getString(7);
//
//			// create instance of User object
//			User u = new User(id, userName, password, firstName, lastName, phoneNumber, email);
//			users.add(u);
//		}
//		rs.close();
//		return users;

		String sql = "select * from vendor where id = ?"; // declare MySQL statement
		Vendor v = null; // create Vendor object for getting object from List

		try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				// parse the result set and create an instance of Stuffy
				id = rs.getInt(1);
				String code = rs.getString(2);
				String name = rs.getString(3);
				String address = rs.getString(4);
				String city = rs.getString(5);
				String state = rs.getString(6);
				String zip = rs.getString(7);
				String phone = rs.getString(7);
				String email = rs.getString(8);

				v = new Vendor(id, code, name, address, city, state, zip, phone, email);
				return v;
			}
		} catch (SQLException se) {
			throw se;
		}
		return v;
	}
}
