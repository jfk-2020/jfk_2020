package com.jfk.interfaces;

/**
 * @author William Arustamyan
 */

public class CallService {


    public void doCall(MessageService service) {
        String text = service.getText();
        System.out.println(text);
    }
}
