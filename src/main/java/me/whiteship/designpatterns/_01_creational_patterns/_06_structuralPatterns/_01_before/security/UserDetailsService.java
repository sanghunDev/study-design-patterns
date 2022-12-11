package me.whiteship.designpatterns._01_creational_patterns._06_structuralPatterns._01_before.security;

public interface UserDetailsService {
    UserDetails loadUser(String username);
}
