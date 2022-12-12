package me.whiteship.designpatterns._01_creational_patterns._06_structuralPatterns._02_after.security;

public interface UserDetailsService {
    UserDetails loadUser(String username);
}
