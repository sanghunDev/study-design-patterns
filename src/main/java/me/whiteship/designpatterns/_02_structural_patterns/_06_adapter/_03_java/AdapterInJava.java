package me.whiteship.designpatterns._02_structural_patterns._06_adapter._03_java;

import java.io.*;
import java.util.*;

public class AdapterInJava {
    public static void main(String[] args) {

        //string을 넘기지만 InputStream 타입으로 변환됨
        try (InputStream is = new FileInputStream("input.txt");
             //InputStream 타입을 넘기지만 InputStreamReader 으로 변환됨
             InputStreamReader isr = new InputStreamReader(is);
             BufferedReader reader = new BufferedReader(isr)) {
            while (reader.ready()) {
                System.out.println(reader.readLine());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
