package bd.dao.daoPerson;

import java.sql.SQLException;
import java.util.List;

public interface PersonDAO {
	//crud
	List<Person> getPeople() throws SQLException;
	Person getPersonByEmail(String email) throws SQLException;
	boolean insertPerson(Person person);
	boolean deletePersonByEmail(String email);
	boolean updatePerson(Person person);
}
