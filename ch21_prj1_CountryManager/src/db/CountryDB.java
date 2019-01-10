package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CountryDB {
	// list all countries

	public List<String> getCountries() throws SQLException {
		// declare ArrayList as a String
		List<String> countries = new ArrayList<String>();
		Connection conn = getConnection(); // create Connection object that calls the getConnection method
		Statement smt = conn.createStatement(); // Declares smt variable as SQL statement
		ResultSet rs = smt.executeQuery("SELECT * FROM country");
		while (rs.next()) {
			// process each record
			int id = rs.getInt(1);
			String name = rs.getString(2);
			String record = id + " " + name;
			System.out.println(record);
			countries.add(record);
		}
		rs.close(); // release resources
		return countries;
	}

	// add record to Country database
	public boolean addCountry(String country) throws SQLException {
		boolean success = false;
		Connection conn = getConnection(); // create Connection object that calls the getConnection method
		String query = "INSERT into Country(Name)" + "VALUES('" + country + "')";
		Statement statement = conn.createStatement();
		int rowCount = statement.executeUpdate(query);

		if (rowCount > 0) {
			success = true;
		}
		return success;
	}

	// delete record from Country database
	public boolean deleteCountry(int id) throws SQLException {
		boolean success = false;
		Connection connection = getConnection();
		String query = "DELETE FROM Country WHERE ID = " + id;
		Statement statement = connection.createStatement();
		int rowCount = statement.executeUpdate(query);

		if (rowCount > 0)
			success = true;
		return success;
	}

	// method that connects to MySQL database - return type Connection
	private Connection getConnection() throws SQLException {
		String dbURL = "jdbc:mysql://localhost:3306/country?allowPublicKeyRetrieval=true&useSSL=false";
		String username = "country_user";
		String password = "sesame";
		Connection connection = DriverManager.getConnection(dbURL, username, password);
		return connection;
	}
}
