package me.whiteship.designpatterns._01_creational_patterns._06_structuralPatterns._03_java;

import java.util.*;

public class AdapterInJava {
    public static void main(String[] args) {
        //배열을 넘기지만 리스트로 반환됨
        List<String> strings = Arrays.asList("1", "2", "3");// 배열을 리스트로 바꿀때 사용하는 방법인 Arrays.asList

        /**
         * strings 어댑티
         * Collections.enumeration 어댑터
         * Enumeration 타겟 인터페이스
         */
        Enumeration<String> enumeration = Collections.enumeration(strings);

    }
}
