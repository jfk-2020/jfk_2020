package patterns;

public class LoggableWebRequest implements Request {

    private Request request;

    public LoggableWebRequest(Request request) {
        this.request = request;
    }

    @Override
    public void makeRequest() {
        System.out.println("Start logging");
        this.request.makeRequest();
    }
}
