package me.whiteship.designpatterns._01_creational_patterns._03_abstractFactory._02_after;

/**
 * 추상 팩토리
 */
public interface ShipPartsFactory {

    Anchor createAnchor();

    Wheel createWheel();
}
