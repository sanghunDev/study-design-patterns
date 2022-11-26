package me.whiteship.designpatterns._01_creational_patterns._03_abstractFactory._01_before;

import me.whiteship.designpatterns._01_creational_patterns._02_factory._02_after.DefaultShipFactory;
import me.whiteship.designpatterns._01_creational_patterns._02_factory._02_after.SanghunShip;
import me.whiteship.designpatterns._01_creational_patterns._02_factory._02_after.Ship;

public class SanghunShipFactory extends DefaultShipFactory {

    @Override
    public Ship createShip() {
        Ship ship = new SanghunShip();
        ship.setAnchor(new SanghunAnchor());
        ship.setWheel(new SanghunWheel());
        return ship;
    }
}
