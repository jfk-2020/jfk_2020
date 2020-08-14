package solid.srp;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.SQLException;

public class UserService implements CrudService, GetSupported {

    private Driver driver;


    public UserService(Driver driver) {
        this.driver = driver;
    }

    public UserInstance create(String name, int age) throws SQLException {
        if (name.startsWith("%") || name.startsWith("9")) {
            return null;
        }
        if (age > 200 || age < 0) {
            return null;
        }
        Connection connection = driver.connect("sdsdsd", null);
        boolean execute = connection.createStatement().execute("INSERT INTO Users (name, age) VALUES (" + name + ", " + age + ")");
        if (execute) {
            return new UserInstance(name, age);
        }
        return null;
    }

    @Override
    public UserInstance get(int id) {
        return null;
    }
}
