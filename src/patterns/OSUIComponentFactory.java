package patterns;

public class OSUIComponentFactory {

    public static UIComponentFactory create(String osName) {
        if (osName.equals("linux")) {
            return new LinuxUIComponentFactory();
        }
        if (osName.equals("windows")) {
            return new WindowsUIComponentFactory();
        }
        return null;
    }
}
