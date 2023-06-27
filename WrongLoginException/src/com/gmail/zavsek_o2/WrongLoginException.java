package com.gmail.zavsek_o2;

class WrongLoginException extends Exception {
    public WrongLoginException(String message) {
        super(message);
    }
}