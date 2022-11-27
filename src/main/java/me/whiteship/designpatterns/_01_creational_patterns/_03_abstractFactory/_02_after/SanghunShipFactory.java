package me.whiteship.designpatterns._01_creational_patterns._03_abstractFactory._02_after;

import me.whiteship.designpatterns._01_creational_patterns._02_factory._02_after.DefaultShipFactory;
import me.whiteship.designpatterns._01_creational_patterns._02_factory._02_after.SanghunShip;
import me.whiteship.designpatterns._01_creational_patterns._02_factory._02_after.Ship;

/**
 * 기능의 추가에도 실제 구현 로직이 변경되지 않는다
 */
public class SanghunShipFactory extends DefaultShipFactory {
    private ShipPartsFactory shipPartsFactory;

    public SanghunShipFactory(ShipPartsFactory shipPartsFactory) {
        this.shipPartsFactory = shipPartsFactory;
    }

    @Override
    public Ship createShip() {
        Ship ship = new SanghunShip();
        ship.setAnchor(shipPartsFactory.createAnchor());
        ship.setWheel(shipPartsFactory.createWheel());
        return ship;
    }
}
