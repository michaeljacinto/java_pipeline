package com.mycompany.app;

/**
 * Hello world!
 */
public class App {

    // private final String message = "PASSWORD1"; // 3) Fails on test stage
    // Fails
    // private final String password = "Hello World!"; // 2) Fails on analysis stage

    private final String message = "Hello World!"; // Good

    // public final String password = "Hello World!"; // Security Issue

    public App() {
    }

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
        // Sysdsatem.out.println(new App().getMessage()); // 1) Fails on build stage 1 bug, 3 code smells
    }

    private final String getMessage() {
        // return password; // 2) Fails on analysis stage
        return message;
    }

}
