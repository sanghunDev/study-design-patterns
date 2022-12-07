package me.whiteship.designpatterns._01_creational_patterns._05_prototype._03_java;

import java.util.ArrayList;
import java.util.List;

public class JavaCollectionExample {
    public static void main(String[] args) {
        Student sanghun = new Student("sanghun");
        Student bae = new Student("bae");

        List<Student> students = new ArrayList<>();
        students.add(sanghun);
        students.add(bae);
        System.out.println("students = " + students);

        //프로토 타입 패턴을 사용하는건 아니지만 , 실무에서 얕은 복사를 하는 경우 가장 많이 사용한다
        List<Student> clone = new ArrayList<>(students);
        System.out.println("clone = " + clone);
    }
}
