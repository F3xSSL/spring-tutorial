package ru.helloworld;

/**
 * Created by dmitry on 31.01.17.
 */
public class HelloWorldMessageProvider implements MessageProvider {
    @Override
    public String getMessage() {
        return "Hello World";
    }
}
