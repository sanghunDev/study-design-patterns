package me.whiteship.designpatterns._01_creational_patterns._06_structuralPatterns._02_after;

import me.whiteship.designpatterns._01_creational_patterns._06_structuralPatterns._02_after.security.UserDetails;

public class AccountUserDetails implements UserDetails {

    private Account account;

    public AccountUserDetails(Account account) {
        this.account = account;
    }

    @Override
    public String getUsername() {
        return account.getName();
    }

    @Override
    public String getPassword() {
        return account.getPassword();
    }
}
