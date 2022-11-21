package me.whiteship.designpatterns._01_creational_patterns._02_factory._01_before;

public class Client {

    public static void main(String[] args) {
        Client client = new Client();

        Ship sanghun = ShipFactory.orderShip("sanghun", "sanghun@mail.com");
        System.out.println("sanghun = " + sanghun);

        Ship blackship = ShipFactory.orderShip("blackship", "blackship@mail.com");
        System.out.println("blackship = " + blackship);
    }
}
