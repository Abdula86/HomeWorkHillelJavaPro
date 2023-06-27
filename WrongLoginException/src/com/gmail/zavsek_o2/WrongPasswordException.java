package com.gmail.zavsek_o2;
public class WrongPasswordException extends Exception {
    public WrongPasswordException(String message) {
        super(message);
    }
}