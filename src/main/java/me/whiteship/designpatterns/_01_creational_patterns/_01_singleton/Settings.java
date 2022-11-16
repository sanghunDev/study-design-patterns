package me.whiteship.designpatterns._01_creational_patterns._01_singleton;

public class Settings {

    // 이른 초기화 (스레드 세이프 하다)
    private static final Settings INSTANCE = new Settings();

    // 외부에서 new 키워드를 사용하지 못하게 기본 생성자에 private 설정
    private Settings() {
    }

    // 정적 팩토리 메서드 생성
    public static Settings getInstance() {
        return INSTANCE;
    }
}
