package com.dailycodework.lakesidehotel.exception;

/**
 * @author Chandran Pillai
 */

public class UserAlreadyExistsException extends RuntimeException{
    public UserAlreadyExistsException(String message) {
        super(message);
    }
}
