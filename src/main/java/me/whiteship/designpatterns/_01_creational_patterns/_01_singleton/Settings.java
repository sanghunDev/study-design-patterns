package me.whiteship.designpatterns._01_creational_patterns._01_singleton;

public class Settings {

    // 더블 체킹을 위해 volatile 사용
    private static volatile Settings instance;

    // 외부에서 new 키워드를 사용하지 못하게 기본 생성자에 private 설정
    private Settings() {

    }

    // 정적 팩토리 메서드 생성
    public static Settings getInstance() {
        if (instance == null) {
            /**
             * if 와 synchronized 로 두번 체크해서 멀티 쓰레드에서 안정하게 사용 가능하다
             * 인스턴스가 없는 경우를 먼저 검증하고 synchronized 를 사용하기 때문에 해당 키워드가 실행될 확률이 적어진다
             *
             **/

            synchronized (Settings.class) {
                if (instance == null) {
                    instance = new Settings();
                }
            }
        }
        return instance;
    }
}
