package me.whiteship.designpatterns._01_creational_patterns._01_singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class App {
    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException {
        Settings instance = Settings.INSTANCE;
        Settings instance1 = null;

        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))){
            out.writeObject(instance);
        }

        try (ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))) {
            instance1 = (Settings) in.readObject();
        }

        System.out.println(instance == instance1);

        Settings instance2 = null;
        //ENUM 은 리플랙션으로 인스턴스 생성 불가(따라서 싱글톤을 깰 수 없게 되며 오류가 출력된다)
        Constructor<?>[] declaredConstructors = Settings.class.getDeclaredConstructors();
        for (Constructor constructor : declaredConstructors) {
            constructor.setAccessible(true);
            instance2 = (Settings) constructor.newInstance("INSTANCE");
        }

        System.out.println(instance == instance1);
        System.out.println(instance == instance2);
    }
}
