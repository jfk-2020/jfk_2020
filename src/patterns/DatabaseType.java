package patterns;

public enum DatabaseType {

    oracle, postgres, mysql;


    public static DatabaseType findType(String name) {
        for (int i = 0; i < values().length; i++) {
            if (values()[i].name().equalsIgnoreCase(name)) {
                return values()[i];
            }
        }
        return null;
    }

}
