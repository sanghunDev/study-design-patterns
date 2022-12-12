package me.whiteship.designpatterns._01_creational_patterns._06_structuralPatterns._02_after;

import me.whiteship.designpatterns._01_creational_patterns._06_structuralPatterns._02_after.security.LoginHandler;
import me.whiteship.designpatterns._01_creational_patterns._06_structuralPatterns._02_after.security.UserDetailsService;

public class App {
    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        UserDetailsService userDetailsService = new AccountUserDetailsService(accountService);
        LoginHandler loginHandler = new LoginHandler(userDetailsService);
        String login = loginHandler.login("sanghun", "sanghun");
        System.out.println("login = " + login);
    }
}
