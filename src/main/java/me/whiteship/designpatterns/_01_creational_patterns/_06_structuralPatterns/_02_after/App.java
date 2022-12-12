package me.whiteship.designpatterns._01_creational_patterns._06_structuralPatterns._02_after;

import me.whiteship.designpatterns._01_creational_patterns._06_structuralPatterns._02_after.security.LoginHandler;

public class App {
    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        LoginHandler loginHandler = new LoginHandler(accountService);
        String login = loginHandler.login("sanghun", "sanghun");
        System.out.println("login = " + login);
    }
}
