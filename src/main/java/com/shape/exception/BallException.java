package com.shape.exception;

public class BallException extends Exception{
    public BallException() {
    }

    public BallException(String message) {
        super(message);
    }

    public BallException(String message, Throwable cause) {
        super(message, cause);
    }

    public BallException(Throwable cause) {
        super(cause);
    }

    public BallException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
