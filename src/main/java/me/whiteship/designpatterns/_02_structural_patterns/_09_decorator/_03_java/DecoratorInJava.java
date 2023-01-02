package me.whiteship.designpatterns._02_structural_patterns._09_decorator._03_java;

import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponseWrapper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DecoratorInJava {
    public static void main(String[] args) {
        // Collections 가 제공하는 데코레이터 메소드
        ArrayList list = new ArrayList();
        list.add(new Book());

        // 타입 검사
        List books = Collections.checkedList(list, Book.class);

        list.add(new Item());
        books.add(new Item());  //cast 에러 발생

        //불변 객체로 만들어준다 (일종의 Wrapper)
        List unmodifiableList = Collections.unmodifiableList(list);
        unmodifiableList.add(new Book());

        // 서블릿 요청 또는 응답 Wrapper
        HttpServletRequestWrapper requestWrapper;
        HttpServletResponseWrapper responseWrapper;
    }

    private static class Book {

    }

    private static class Item {

    }
}
