package com.example.demo.config.exception;

public class BadRequestException extends RuntimeException {
    public BadRequestException() {
    }

    public BadRequestException(String s) {
        super(s);
    }
}
