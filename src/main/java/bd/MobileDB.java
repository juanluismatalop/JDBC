package bd;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MobileDB {
	private Connection connection;
	public MobileDB() throws SQLException, IOException {
		connection = SetUpConnection.getInstance().getConnection();
	}
	public boolean insertMobile (Mobile mobile) throws SQLException {
		String sql = "INSERT INTO mobile VALUES ('" + mobile.getSerial() + "', '" + mobile.getModel() + "'," + mobile.getPrice() + ");";
		System.out.printf("SENTENCIA A EJECUTAR: %s%n",sql);
		Statement statement = connection.createStatement();
		int result = statement.executeUpdate(sql);
		return result != 0;
	}

	public boolean deleteMobile(String serial) throws SQLException {
		String sql = "DELETE FROM mobile WHERE serial = '" + serial + "';";
		System.out.printf("SENTENCIA A EJECUTAR: %s%n",sql);
		Statement statement = connection.createStatement();
		int result = statement.executeUpdate(sql);
		return result != 0;
	}

	public boolean updatePrice(double price, String serial) throws SQLException {
		String sql = "UPDATE mobile SET price = " + price + " WHERE serial = '" + serial + "';";
		System.out.printf("SENTENCIA A EJECUTAR: %s%n", sql);
		Statement statement = connection.createStatement();
		int result = statement.executeUpdate(sql);
		return result != 0;
	}

	public List<Mobile> getMobiles() throws SQLException {
		List<Mobile> mobiles = new ArrayList<>();
		String sql = "SELECT * FROM mobile;";
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(sql);
		while (resultSet.next()){
			String serial = resultSet.getString("serial");
			String model = resultSet.getString("model");
			double price = resultSet.getDouble("price");
			Mobile mobile = new Mobile(serial, model, price);
			mobiles.add(mobile);
		}
		return mobiles;
	}

	public Mobile getMobileBySerial(String serial) throws SQLException{
		String sql = "SELECT * FROM mobile WHERE serial = '" + serial + "';";
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(sql);
		Mobile mobile = null;
		while (resultSet.next()){
			String model = resultSet.getString("model");
			double price = resultSet.getDouble("price");
			mobile = new Mobile()
		}
	}
}
