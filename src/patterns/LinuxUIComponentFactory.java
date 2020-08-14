package patterns;

public class LinuxUIComponentFactory implements UIComponentFactory {
    @Override
    public Button createButton() {
        return new LinuxButton();
    }
}
