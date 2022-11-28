package me.whiteship.designpatterns._01_creational_patterns._03_abstractFactory._03_java;

import me.whiteship.designpatterns._01_creational_patterns._02_factory._02_after.Ship;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FactoryBeanExample {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
        //실제로 config.xml 에 등록된 ShipFactory 타입이 아닌 Ship 타입으로 가져올 수 있음
        Ship sanghunShip = applicationContext.getBean("sanghunShip", Ship.class);
        System.out.println("sanghunShip.getName() = " + sanghunShip.getName());

    }
}
