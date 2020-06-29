package com.jfk.interfaces;

/**
 * @author William Arustamyan
 */

public class RequestApplication {


    public static void main(String[] args) {


        AmazonRequester amazonRequester = new AmazonRequester();
        AmazonRequest request = new AmazonRequestVersion2();

        amazonRequester.makeRequest(request);
    }
}
