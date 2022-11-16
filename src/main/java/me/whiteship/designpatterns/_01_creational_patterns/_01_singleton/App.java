package me.whiteship.designpatterns._01_creational_patterns._01_singleton;

public class App {
    public static void main(String[] args) {
        Settings instance = Settings.getInstance();
        System.out.println(instance == Settings.getInstance());
    }
}
