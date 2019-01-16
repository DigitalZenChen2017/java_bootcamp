package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import business.Stuffie;

public class StuffieDB implements DAO<Stuffie> {

	public Stuffie get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Stuffie> getAll() throws SQLException {
		List<Stuffie> stuffies = new ArrayList<Stuffie>(); // declare ArrayList as List
		Connection conn = getConnection();
		Statement smt = conn.createStatement();
		ResultSet rs = smt.executeQuery("SELECT * FROM stuffie");
		while (rs.next()) {
			// process stuffy;
			int id = rs.getInt(1);
			String type = rs.getString(2);
			String size = rs.getString(3);
			String color = rs.getString(4);
			Stuffie s = new Stuffie(id, type, size, color);
			stuffies.add(s);
		}
		rs.close();
		return stuffies;
	}

	@Override
	public boolean add(Stuffie s) throws SQLException {
		boolean success = false;
		Connection connection = getConnection();
		String query = "INSERT into stuffie" + "(type, color, size)" + "VALUES('" + s.getType() + "','" + s.getColor()
				+ "','" + s.getSize() + "')";

		Statement statement = connection.createStatement();
		int rowCount = statement.executeUpdate(query);

		if (rowCount > 0)
			success = true;
		return success;
	}

	@Override
	public boolean update(Stuffie s) throws SQLException {
		Connection connection = getConnection(); // create an instance of Connection object
		String query = "UPDATE stuffie SET " + " Type = '" + s.getType() + "', " + " Color ='" + s.getColor() + "', "
				+ "	Size = '" + s.getSize() + "' " + "WHERE ID = '" + s.getId() + "'";
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

	@Override
	public boolean delete(Stuffie s) throws SQLException {
		Connection connection = getConnection();
		String query = "DELETE FROM Stuffie WHERE ID = " + s.getId();
		Statement statement = connection.createStatement();
		int rowCount = statement.executeUpdate(query);
		boolean success = false;

		if (rowCount > 0)
			success = true;
		return success;
	}

	// method that connects to MySQL database
	private Connection getConnection() throws SQLException {
		String dbURL = "jdbc:mysql://localhost:3306/stuffie?allowPublicKeyRetrieval=true&useSSL=false";
		String username = "stuffie_user";
		String password = "sesame";
		Connection connection = DriverManager.getConnection(dbURL, username, password);
		return connection;

	}

	@Override
	public Stuffie get(String code) {
		// TODO Auto-generated method stub
		String sql = "select * from stuffy where id = ?";
		Stuffie s = null;
		
		try (Connection conn = getConnection();
			 PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				s = getStuffyFromResultSet(rs);
			}
		}
		catch (SQLException se) {
			throw se;
		}
		return s;
	}

}
