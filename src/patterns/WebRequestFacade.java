package patterns;

public class WebRequestFacade implements Request{
    private Request request = new WebRequest();

    @Override
    public void makeRequest() {
        request.makeRequest();
    }

//    @Override
    public void testRequest() {
        throw new UnsupportedOperationException();
    }
}
