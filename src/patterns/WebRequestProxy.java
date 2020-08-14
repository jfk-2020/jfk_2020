package patterns;

public class WebRequestProxy implements Request {

    private Request request = new WebRequest();

    @Override
    public void makeRequest() {
        System.out.println("Add additional functionality");
        request.makeRequest();
    }
}
