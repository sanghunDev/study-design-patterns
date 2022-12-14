package me.whiteship.designpatterns._02_structural_patterns._06_adapter._02_after;

import me.whiteship.designpatterns._02_structural_patterns._06_adapter._02_after.security.LoginHandler;

public class App {
    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        LoginHandler loginHandler = new LoginHandler(accountService);
        String login = loginHandler.login("sanghun", "sanghun");
        System.out.println("login = " + login);
    }
}
