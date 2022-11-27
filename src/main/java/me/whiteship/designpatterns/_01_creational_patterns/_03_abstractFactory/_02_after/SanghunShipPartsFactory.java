package me.whiteship.designpatterns._01_creational_patterns._03_abstractFactory._02_after;

import me.whiteship.designpatterns._01_creational_patterns._03_abstractFactory._01_before.SanghunAnchor;
import me.whiteship.designpatterns._01_creational_patterns._03_abstractFactory._01_before.SanghunWheel;

public class SanghunShipPartsFactory implements ShipPartsFactory{
    @Override
    public Anchor createAnchor() {
        return new SanghunAnchor();
    }

    @Override
    public Wheel createWheel() {
        return new SanghunWheel();
    }
}
