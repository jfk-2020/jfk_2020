package databaseoperations;

import java.sql.*;

public class JDBCExampleApp {

    public static void main(String[] args) throws SQLException {


        Driver myDriver = new com.mysql.jdbc.Driver();
        DriverManager.registerDriver(myDriver);

        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root", "123");
        Statement statement = conn.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from actor");
        while (resultSet.next()) {
            String first_name = resultSet.getString("first_name");
            String last_name = resultSet.getString("last_name");
            System.out.println("First Name : " + first_name);
            System.out.println("Last Name : " + last_name);
        }

        resultSet.close();

    }

}
