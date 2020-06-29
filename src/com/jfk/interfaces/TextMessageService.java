package com.jfk.interfaces;

/**
 * @author William Arustamyan
 */

public class TextMessageService implements MessageService {

    public String getText() {
        return "Text message service";
    }

    public String getTextLogged() {
        long before = System.currentTimeMillis();
        String text = getText();
        System.out.println(System.currentTimeMillis() - before);
        return text;
    }
}
