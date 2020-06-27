package EnumExamples;

public enum Seasons {

    Spring("Rainy"),
    Summer("Sunny"),
    Autumn("rainy and sunny"),
    Winter("Cold and snowy");

    private String character;

    private Seasons(String character) {
        this.character = character;
    }

    public static Seasons findByCharacter(String character) {
        for (int i = 0; i < Seasons.values().length; i++) {
            if (Seasons.values()[i].character == character) {
                return Seasons.values()[i];
            }
        }
        return null;
    }
}
