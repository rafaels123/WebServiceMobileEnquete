package com.mobileenquete.me.server.dao.exception;

public class DaoException extends RuntimeException{
    private static final long serialVersionUID = 2457552904697421443L;

    public DaoException(Throwable cause) {
        super(cause);
    }

    public DaoException(String message, Throwable cause) {
        super(message, cause);
    }

    public DaoException(String message) {
        super(message);
    }

    public DaoException() {
    }
}
