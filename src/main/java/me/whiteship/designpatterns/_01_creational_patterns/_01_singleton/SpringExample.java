package me.whiteship.designpatterns._01_creational_patterns._01_singleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringExample {
    public static void main(String[] args) {
        /**
         * 싱글톤 스코프
         * 아래와 같이 작성하면 항상 같은 인스턴스가 반환된다
         * 싱글톤 패턴이랑은 다르며 싱글톤 패턴이 쓰인것은 아니다
         * ApplicationContext 내부에서 인스턴스를 유일하게 관리해준다
         * 실제로 업무시 유일한 객체가 필요할때 많이 사용한다
         */
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        String hello = applicationContext.getBean("hello", String.class);
        String hello2 = applicationContext.getBean("hello", String.class);
        System.out.println(hello == hello2);
    }
}
