package com.dailycodework.lakesidehotel.exception;

/**
 * @author Chandran Pillai
 */

public class InternalServerException extends RuntimeException {
    public InternalServerException(String message) {
        super(message);
    }
}
