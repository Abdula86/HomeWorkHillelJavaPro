package com.gmail.zavsek_o2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void testValidUser() {
        assertDoesNotThrow(() -> new User("jack", "Password123", "Password123"));
    }

    @Test
    void testInvalidLogin() {
        assertThrows(WrongLoginException.class, () -> new User("invalid login", "Password123", "Password123"));
    }

    @Test
    void testInvalidPassword() {
        assertThrows(WrongPasswordException.class, () -> new User("jack", "password", "password"));
    }

    @Test
    void testPasswordMismatch() {
        assertThrows(WrongPasswordException.class, () -> new User("jack", "Password123", "Password456"));
    }
}
