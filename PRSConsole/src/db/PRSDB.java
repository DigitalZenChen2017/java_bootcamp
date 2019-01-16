package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import business.User;

@SuppressWarnings("rawtypes")
public class PRSDB implements DAO {
	@Override
	public List getAll() throws SQLException {
		// TODO Auto-generated method stub
		List<User> users = new ArrayList<User>(); // declare ArrayList as List
		Connection conn = getConnection();
		Statement smt = conn.createStatement();
		ResultSet rs = smt.executeQuery("SELECT * FROM user");
		while (rs.next()) { // if Result Set next row/record exists, process each user
			// process stuffy
			int id = rs.getInt(1);
			String userName = rs.getString(2);
			String password = rs.getString(3);
			String firstName = rs.getString(4);
			String lastName = rs.getString(5);
			String phoneNumber = rs.getString(6);
			String email = rs.getString(7);

			// create instance of User object
			User u = new User(id, userName, password, firstName, lastName, phoneNumber, email);
			users.add(u);
		}
		rs.close();
		return users;
	}

	public boolean add(User u) throws SQLException {
		// TODO Auto-generated method stub
		boolean success = false;
		Connection connection = getConnection();
		String query = "INSERT into user" + "(userName, password, firstName, lastName, phoneNumber, email)" + "VALUES('"
				+ u.getUserName() + "','" + u.getPassword() + "','" + u.getFirstName() + "','" + u.getLastName() + "','"
				+ u.getPhoneNumber() + "','" + u.getEmail() + "')";
		Statement statement = connection.createStatement();
		int rowCount = statement.executeUpdate(query);

		if (rowCount > 0)
			success = true;
		return success;
	}

	@Override
	public boolean update(Object u) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean delete(User u) throws SQLException {
		// TODO Auto-generated method stub
		boolean success = false;
		Connection connection = getConnection();
		String query = "DELETE FROM user " + "WHERE id = ?";
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

	@Override
	public boolean add(Object u) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	public User get(int id) throws SQLException {
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

		String sql = "select * from user where id = ?"; // declare MySQL statement
		User u = null; // create User object for getting object from List

		try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) { 
				// parse the result set and create an instance of Stuffy
				id = rs.getInt(1);
				String userName = rs.getString(2);
				String password = rs.getString(3);
				String firstName = rs.getString(4);
				String lastName = rs.getString(5);
				String phoneNumber = rs.getString(6);
				String email = rs.getString(7);

				u = new User(id, userName, password, firstName, lastName, phoneNumber, email);
				return u;
			}
		} catch (SQLException se) {
			throw se;
		}
		return u;
	}

	@Override
	public boolean delete(Object u) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

}
