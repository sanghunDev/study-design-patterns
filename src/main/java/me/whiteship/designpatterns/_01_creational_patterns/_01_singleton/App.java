package me.whiteship.designpatterns._01_creational_patterns._01_singleton;

public class App {
    public static void main(String[] args) {
        Settings settings = new Settings();
        Settings setting1 = new Settings();
        System.out.println(settings != setting1);
    }
}
