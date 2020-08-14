package solid.srp;

public class UserInstance {

    private int id;
    private String name;
    private int age;

    public UserInstance(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }
}
