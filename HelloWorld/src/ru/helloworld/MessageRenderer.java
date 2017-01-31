package ru.helloworld;

/**
 * Created by dmitry on 31.01.17.
 */
public interface MessageRenderer {
    void render();
    void setMessageProvider(MessageProvider provider);
    MessageProvider getMessageProvider();
}
