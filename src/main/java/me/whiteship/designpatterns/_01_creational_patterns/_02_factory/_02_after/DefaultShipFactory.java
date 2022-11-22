package me.whiteship.designpatterns._01_creational_patterns._02_factory._02_after;

public abstract class DefaultShipFactory implements ShipFactory {
    @Override
    public void validate(String name, String email) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("배 이름을 지어주세요");
        }
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("이메일을 지어주세요");
        }
    }

    @Override
    public void prepareFor(String name) {
        System.out.println("제작 준비중인 배  = " + name);
    }

    @Override
    public void sendEmailTo(String email, Ship ship) {
        System.out.println("제작 요청한 배 " + ship.getName() + "를 완성 했습니다.");
    }
}
