package me.whiteship.designpatterns._01_creational_patterns._02_factory._02_after;

public class BlackShipFactory extends DefaultShipFactory {
    @Override
    public Ship createShip() {
        return new BlackShip();
    }
}
