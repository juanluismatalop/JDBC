import bd.SetUpConnection;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

public class Main {
	public static void main(String[] args) {
		try (Connection connection1 = SetUpConnection;
		Connection connection2 = SetUpConnection;
		Connection connection3 = SetUpConnection;){
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
