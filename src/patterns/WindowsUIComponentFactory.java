package patterns;

public class WindowsUIComponentFactory implements UIComponentFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
