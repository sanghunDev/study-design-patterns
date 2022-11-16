package me.whiteship.designpatterns._01_creational_patterns._01_singleton;

public class Settings {

    private static Settings instance;

    // 외부에서 new 키워드를 사용하지 못하게 기본 생성자에 private 설정
    private Settings() {
    }

    // 정적 팩토리 메서드 생성
    public static synchronized Settings getInstance() {
        if (instance != null) {
            instance = new Settings();
        }
        return instance;
    }
}
