package com.jfk.interfaces;

/**
 * @author William Arustamyan
 */

public class InterfaceApplication {


    public static void main(String[] args) {
        CallService service = new CallService();
        MessageService textMessageService = new TextMessageService();
        service.doCall(textMessageService);
    }
}
