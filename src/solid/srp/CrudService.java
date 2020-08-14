package solid.srp;

import java.sql.SQLException;

public interface CrudService {

    UserInstance create(String name, int age) throws SQLException;

}
