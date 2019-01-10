package com.tinz.ys.token;

public class TokenException extends RuntimeException{

    private static final long serialVersionUID = 1L;

    public TokenException() {
        super("token is invalid.");
    }

    public TokenException(String message, Throwable cause,
                          boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public TokenException(String message, Throwable cause) {
        super(message, cause);
    }

    public TokenException(String message) {
        super(message);
    }

    public TokenException(Throwable cause) {
        super(cause);
    }
}
