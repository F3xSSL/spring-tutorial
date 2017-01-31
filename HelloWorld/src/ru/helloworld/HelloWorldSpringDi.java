package ru.helloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dmitry on 31.01.17.
 */
public class HelloWorldSpringDi {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("file:resource/META-INF/spring/app-context.xml");
        MessageRenderer mr = ctx.getBean("renderer", MessageRenderer.class);
        mr.render();
    }
}
