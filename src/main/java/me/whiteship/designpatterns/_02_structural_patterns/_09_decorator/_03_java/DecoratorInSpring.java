package me.whiteship.designpatterns._02_structural_patterns._09_decorator._03_java;

import org.springframework.beans.factory.xml.BeanDefinitionDecorator;
import org.springframework.http.server.reactive.ServerHttpRequestDecorator;
import org.springframework.http.server.reactive.ServerHttpResponseDecorator;

public class DecoratorInSpring {
    public static void main(String[] args) {
        // 빈 설정 데코레이터 (직접 사용할 일이 거의 없음, spring 인프라에 가까운 bean)
        BeanDefinitionDecorator decorator;

        // 웹플럭스 HTTP 요청 / 응답 데코레이터 ServerHttpRequest,Response 를 커스터마이징 가능하게 해준다
        ServerHttpRequestDecorator httpRequestDecorator;
        ServerHttpResponseDecorator httpResponseDecorator;
    }

}
