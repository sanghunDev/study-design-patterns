package me.whiteship.designpatterns._01_creational_patterns._04_builder._03_java;

public class StringBuilderExample {
    public static void main(String[] args) {
        /**
         * StringBuilder 싱크로 나이즈드 키워드 미사용
         * StringBuffer 싱크로나이즈드 키워드 사용
         */
        StringBuilder stringBuilder = new StringBuilder();
        String result = stringBuilder.append("sanghun").append("ship").toString();
        System.out.println("result = " + result);
    }
}
