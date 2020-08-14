package patterns;

import java.sql.Driver;

public class AppPattern {


    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

//        Driver oracle = DatabaseDriverFactory.createDriver("oracle");
//
//        String os = "windows";
//        UIComponentFactory uiComponentFactory = OSUIComponentFactory.create(os);
//
//        Button button = uiComponentFactory.createButton();
//        System.out.println(button);
        Request request = new LoggableWebRequest(new TimedWebRequest(new WebRequest()));
        request.makeRequest();

        Request logg = new WebRequestProxy();


    }
}
