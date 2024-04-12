package bd.dao.daoPerson;

import bd.SetUpConnection;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PersonDAOImp1 implements PersonDAO{
	private final Connection connection;

	private Statement statement;

	private PreparedStatement preparedStatement;

	public PersonDAOImp1() throws SQLException, IOException {
		connection = SetUpConnection.getInstance().getConnection();
	}

	@Override
	public List<Person> getPeople() throws SQLException {
		List<Person> people = new ArrayList<>();
		String sql = "SELECT * FROM PERSON;";
		statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(sql);
		Person person = null;
		while (resultSet.next()) {
			String email = resultSet.getString("email");
			String name = resultSet.getString("name");
			String code = resultSet.getString("code");
			person = new Person(email, name, code);
			people.add(person);
		}
		return people;
	}

	@Override
	public Person getPersonByEmail(String email) throws SQLException {
		String sql = "SELECT * FROM PERSON WHERE email = '" + email + "';";
		statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(sql);
		Person person = null;
		return person;
	}

	@Override
	public boolean insertPerson(Person person) {
		return false;
	}

	@Override
	public boolean deletePersonByEmail(String email) {
		return false;
	}

	@Override
	public boolean updatePerson(Person person) {
		return false;
	}
}
