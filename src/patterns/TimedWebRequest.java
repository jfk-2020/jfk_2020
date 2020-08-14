package patterns;

public class TimedWebRequest implements Request {

    private Request request;

    public TimedWebRequest(Request request) {
        this.request = request;
    }

    @Override
    public void makeRequest() {
        System.out.println("Write Request time");
        this.request.makeRequest();
    }
}
