package com.gmail.zavsek_o2;
class WrongPasswordException extends Exception {
    public WrongPasswordException(String message) {
        super(message);
    }
}