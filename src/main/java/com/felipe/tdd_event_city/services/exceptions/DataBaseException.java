package com.felipe.tdd_event_city.services.exceptions;

public class DataBaseException extends RuntimeException {
    public DataBaseException(String msg) {
        super(msg);
    }
}
