package solid.srp;

import patterns.DatabaseDriverFactory;

import java.sql.SQLException;

public class App {


    public static void main(String[] args) throws SQLException {
        UserService service = new UserService(DatabaseDriverFactory.createDriver("oracle"));
        UserInstance user = service.create("test", 23);
    }
}
