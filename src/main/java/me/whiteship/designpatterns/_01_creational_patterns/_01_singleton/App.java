package me.whiteship.designpatterns._01_creational_patterns._01_singleton;

import java.io.*;

public class App {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Settings instance = Settings.getInstance();
        Settings instance1 = null;

        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))){
            out.writeObject(instance);
        }

        try (ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))) {
            instance1 = (Settings) in.readObject();
        }

        System.out.println(instance == instance1);
    }
}
