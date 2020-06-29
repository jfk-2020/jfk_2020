package com.jfk.interfaces;

/**
 * @author William Arustamyan
 */

public class LoggedMenageService implements MessageService {

    private MessageService originalMessageService = new TextMessageService();

    @Override
    public String getText() {
        long before = System.currentTimeMillis();
        String text = originalMessageService.getText();
        System.out.println(System.currentTimeMillis() - before);
        return text;
    }
}
