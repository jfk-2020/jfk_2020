package com.jfk.enumerations;

/**
 * @author William Arustamyan
 */

public final class EnumExample {

    private String name;
    private int ordinal;

    public static final EnumExample ARM = new EnumExample("ARM", 0);
    public static final EnumExample RUS = new EnumExample("RUS", 1);
    public static final EnumExample USA = new EnumExample("USA", 2);


    protected EnumExample(String name, int ordinal) {
        this.name = name;
        this.ordinal = ordinal;
    }

    public String name() {
        return this.name;
    }

    public int ordinal() {
        return this.ordinal;
    }
}
