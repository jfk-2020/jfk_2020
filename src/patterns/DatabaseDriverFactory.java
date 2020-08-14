package patterns;


import java.sql.Driver;
import java.util.EnumMap;
import java.util.Map;

public class DatabaseDriverFactory {

    private static final Map<DatabaseType, Driver> driverMap;
    static {
        driverMap = new EnumMap<>(DatabaseType.class);
//        try {
////            driverMap.put(DatabaseType.oracle, (Driver) Class.forName("oracle").newInstance());
////            driverMap.put(DatabaseType.mysql, (Driver) Class.forName("com.mysql.jdbc.Driver").newInstance());
////            driverMap.put(DatabaseType.postgres, (Driver) Class.forName("postgres").newInstance());
//        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
//            e.printStackTrace();
//        }
    }

    public static Driver createDriver(String type) {
        DatabaseType databaseType = DatabaseType.findType(type);
        if (databaseType == null) {
            return null;
        }
        return driverMap.get(databaseType);
    }
}
