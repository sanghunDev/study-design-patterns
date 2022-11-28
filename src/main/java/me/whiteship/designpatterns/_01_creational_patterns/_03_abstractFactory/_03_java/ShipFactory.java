package me.whiteship.designpatterns._01_creational_patterns._03_abstractFactory._03_java;

import me.whiteship.designpatterns._01_creational_patterns._02_factory._02_after.SanghunShip;
import me.whiteship.designpatterns._01_creational_patterns._02_factory._02_after.Ship;
import org.springframework.beans.factory.FactoryBean;

/**
 * spring 에서 제공하는 FactoryBean (추상 팩토리 인터페이스)
 * Bean Object를 만들때 단순히 new를 해서 만드는게 아닌 복잡한 과정을 거쳐서 만들어 빈으로 등록해야 하는 경우 사용한다
 */
public class ShipFactory implements FactoryBean<Ship> {
    //Ship 이라는 Object 자체가 빈으로 등록됨
    @Override
    public Ship getObject() throws Exception {
        Ship ship = new SanghunShip();
        ship.setName("sanghunShip");
        return ship;
    }

    @Override
    public Class<?> getObjectType() {
        return Ship.class;
    }
}
