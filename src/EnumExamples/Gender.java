package EnumExamples;

public enum Gender {

    Male("John"),
    Female("Jane");

    private String name;

    private Gender(String name) {
        this.name = name;
    }

    public static Gender findByName(String name) {
        for (int i = 0; i < Gender.values().length; i++) {
            if (Gender.values()[i].name == name)
                return Gender.values()[i];
        }
        return  null;
    }
}
