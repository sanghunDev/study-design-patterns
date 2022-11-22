package me.whiteship.designpatterns._01_creational_patterns._02_factory._02_after;

public class Client {

    public static void main(String[] args) {
        Ship sanghun = new SanghunShipFactory().orderShip("sanghun", "sanghun@mail.com");
        System.out.println("sanghun = " + sanghun);

        Ship blackship = new BlackShipFactory().orderShip("blackship", "blackship@mail.com");
        System.out.println("blackship = " + blackship);
    }
}
