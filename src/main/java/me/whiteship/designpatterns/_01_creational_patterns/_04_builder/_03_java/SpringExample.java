package me.whiteship.designpatterns._01_creational_patterns._04_builder._03_java;

import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

public class SpringExample {
    public static void main(String[] args) {
        //newInstance() 를 사용해서 중복 프로퍼티를 제거 가능
        UriComponents components = UriComponentsBuilder.newInstance()
                .scheme("http")
                .host("www.sanghun.com")
                .path("java api")
                .build()
                .encode();

        System.out.println("components = " + components);
    }
}
