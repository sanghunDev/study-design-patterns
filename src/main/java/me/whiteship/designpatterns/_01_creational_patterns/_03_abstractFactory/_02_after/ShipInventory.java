package me.whiteship.designpatterns._01_creational_patterns._03_abstractFactory._02_after;


import me.whiteship.designpatterns._01_creational_patterns._02_factory._02_after.Ship;
import me.whiteship.designpatterns._01_creational_patterns._02_factory._02_after.ShipFactory;

public class ShipInventory {
    public static void main(String[] args) {
        //구현부에서 사용할 팩토리만 주입 시켜주면 됨
        ShipFactory shipFactory = new SanghunShipFactory(new SanghunShipPartsFactory());
        Ship ship = shipFactory.createShip();
        System.out.println(ship.getAnchor().getClass());
        System.out.println(ship.getWheel().getClass());
    }
}
