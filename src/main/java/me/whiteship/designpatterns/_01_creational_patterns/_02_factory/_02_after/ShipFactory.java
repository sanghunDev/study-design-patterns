package me.whiteship.designpatterns._01_creational_patterns._02_factory._02_after;

public interface ShipFactory {

    default Ship orderShip(String name, String email) {
        validate(name, email);
        prepareFor(name);
        Ship ship = createShip();
        sendEmailTo(email, ship);
        return ship;
    }

    Ship createShip();

    private void validate(String name, String email) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("배 이름을 지어주세요");
        }
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("이메일을 지어주세요");
        }
    }

    private void prepareFor(String name) {
        System.out.println("제작 준비중인 배  = " + name);
    }

    private void sendEmailTo(String email, Ship ship) {
        System.out.println("제작 요청한 배 " + ship.getName() + "를 완성 했습니다.");
    }
}
