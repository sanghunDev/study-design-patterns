package me.whiteship.designpatterns._01_creational_patterns._03_abstractFactory._02_after;

public class SanghunShipPartsProFactory implements ShipPartsFactory {

    @Override
    public Anchor createAnchor() {
        return new SanghunAnchorPro();
    }

    @Override
    public Wheel createWheel() {
        return new SanghunWheelPro();
    }
}
