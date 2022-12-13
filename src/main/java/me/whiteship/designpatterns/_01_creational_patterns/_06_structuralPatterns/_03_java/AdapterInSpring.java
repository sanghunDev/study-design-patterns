package me.whiteship.designpatterns._01_creational_patterns._06_structuralPatterns._03_java;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.HandlerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;

public class AdapterInSpring {
    /**
     * Spring mvc HandlerAdapter 인터페이스
     * - 다양한 형태의 핸들러가 Spring mvc에 존재하며 각기 다른 형태로 처리하기 때문에 다양한 형태의 핸들러를 지원할 수 있도록 Spring 에서는 어댑터만 제공하는것이 아닌 어댑터용 인터페이스를 제공해준다
     *
     * 핸들러가 요청을 처리하는 방식에 따라 응답이 다양해진다
     * handle 메서드를 보면
     * (
     * HttpServletRequest var1, HttpServletResponse var2, Object var3
     * 를 파라미터로 받고 ModelAndView 를 반환한다
     * )
     *
     * handler : 요청을 처리하고 응답을 내보내는 것 - 컨트롤러등 다양한 형태로 존재함
     */
    DispatcherServlet dispatcherServlet = new DispatcherServlet();
    HandlerAdapter handlerAdapter = new RequestMappingHandlerAdapter();
}
