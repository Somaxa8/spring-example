package com.example.demo.config.exception;

public class NotFoundException extends RuntimeException {
    public NotFoundException() {
    }

    public NotFoundException(String s) {
        super(s);
    }
}
