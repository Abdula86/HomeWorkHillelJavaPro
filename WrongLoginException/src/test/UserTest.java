package test;

import com.gmail.zavsek_o2.User;
import com.gmail.zavsek_o2.WrongLoginException;
import com.gmail.zavsek_o2.WrongPasswordException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class UserTest {

    @Test
    void testValidUser() {
        assertDoesNotThrow(() -> new User("johnsmith", "Password123", "Password123"));
    }

    @Test
    void testInvalidLogin() {
        assertThrows(WrongLoginException.class, () -> new User("invalid login", "Password123", "Password123"));
    }

    @Test
    void testInvalidPassword() {
        assertThrows(WrongPasswordException.class, () -> new User("johnsmith", "password", "password"));
    }

    @Test
    void testPasswordMismatch() {
        assertThrows(WrongPasswordException.class, () -> new User("johnsmith", "Password123", "Password456"));
    }

    @Test
    void testNullLogin() {
        assertThrows(WrongLoginException.class, () -> new User(null, "Password123", "Password123"));
    }

    @Test
    void testLongLogin() {
        assertThrows(WrongLoginException.class, () -> new User("thisisalongloginstring", "Password123", "Password123"));
    }

    @Test
    void testNullPassword() {
        assertThrows(WrongPasswordException.class, () -> new User("johnsmith", null, "Password123"));
    }

    @Test
    void testLongPassword() {
        assertThrows(WrongPasswordException.class, () -> new User("johnsmith", "Password12345678901234567890", "Password12345678901234567890"));
    }

    @Test
    void testShortPassword() {
        assertThrows(WrongPasswordException.class, () -> new User("johnsmith", "Pass1", "Pass1"));
    }

    @Test
    void testNullConfirmationPassword() {
        assertThrows(WrongPasswordException.class, () -> new User("johnsmith", "Password123", null));
    }
}

