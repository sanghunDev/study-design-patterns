package me.whiteship.designpatterns._01_creational_patterns._06_structuralPatterns._02_after;

import me.whiteship.designpatterns._01_creational_patterns._06_structuralPatterns._02_after.security.UserDetails;
import me.whiteship.designpatterns._01_creational_patterns._06_structuralPatterns._02_after.security.UserDetailsService;

public class AccountUserDetailsService implements UserDetailsService {
    AccountService accountService;

    public AccountUserDetailsService(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public UserDetails loadUser(String username) {
        Account account = accountService.findAccountByUsername(username);
        return new AccountUserDetails(account);
    }
}
