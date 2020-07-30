package enumeration;

public enum  Gender {

    MALE (25,"Armenia", "caucasian"),
    FEMALE(50 , "China" , "mongoloid") ;

    private final int age ;
    private final String country ;
    private final String race;

    Gender (int age , String country , String race){
        this.age = age;
        this.country = country;
        this.race = race;
    }

    public int getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }

    public String getRace() {
        return race;
    }
    public static Gender findByAge (int age){
        for (int i = 0; i <Gender.values().length ; i++) {
           if (Gender.values()[i].age == age){
               return Gender.values()[i];
           }
        }
        return null;
    }
    public static Gender findByCountry (String country){
        for (int i = 0; i <Gender.values().length ; i++) {
            if (Gender.values()[i].country==country){
                return Gender.values()[i];
            }
        }
        return null;
    }
    public static Gender findByRace (String race){
        for (int i = 0; i <Gender.values().length ; i++) {
            if (Gender.values()[i].race == race){
                return Gender.values()[i];
            }
        }
        return null;
    }


    @Override
    public String toString() {
        return "Gender{" +
                "age=" + age +
                ", country='" + country + '\'' +
                ", race='" + race + '\'' +
                '}';
    }
}

