package ru.helloworld;

/**
 * Created by dmitry on 31.01.17.
 */
public class HelloWorldWithCommandLine {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println(args[0]);
        } else {
            System.out.println("Hello world!");
        }
    }
}
