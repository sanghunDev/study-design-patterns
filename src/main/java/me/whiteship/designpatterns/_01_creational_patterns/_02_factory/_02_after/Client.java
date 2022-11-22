package me.whiteship.designpatterns._01_creational_patterns._02_factory._02_after;

public class Client {

    public static void main(String[] args) {
        Client client = new Client();
        //새로운 배를 제작한다면 호출부만 추가됨
        client.print(new SanghunShipFactory(), "sanghun", "sanghun@mail.com");
        client.print(new BlackShipFactory(), "blackship", "blackship@mail.com");
    }

    // 해당 부분을 클래스로 따로 빼낸다면 DI
    private void print(ShipFactory shipFactory, String name, String email) {
        System.out.println(shipFactory.orderShip(name, email));
    }
}
