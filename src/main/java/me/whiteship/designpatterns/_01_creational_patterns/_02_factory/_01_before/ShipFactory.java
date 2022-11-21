package me.whiteship.designpatterns._01_creational_patterns._02_factory._01_before;

public class ShipFactory {

    public static Ship orderShip(String name, String email) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("배 이름을 지어주세요");
        }
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("이메일을 지어주세요");
        }

        prepareFor(name);

        Ship ship = new Ship();
        ship.setName(name);

        if (name.equalsIgnoreCase("sanghun")) {
            ship.setLogo("\uD83D\uDEE5️");
        } else if (name.equalsIgnoreCase("blackship")) {
            ship.setLogo("⚓");
        }

        if (name.equalsIgnoreCase("sanghun")) {
            ship.setColor("sangHun");
        } else if (name.equalsIgnoreCase("blackship")) {
            ship.setColor("blackship");
        }

        sendEmailTo(email, ship);

        return ship;
    }

    private static void prepareFor(String name) {
        System.out.println("제작 준비중인 배  = " + name);
    }

    private static void sendEmailTo(String email, Ship ship) {
        System.out.println("제작 요청한 배 " + ship.getName() + "를 완성 했습니다.");
    }
}
