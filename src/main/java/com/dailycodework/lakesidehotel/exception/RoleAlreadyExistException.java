package com.dailycodework.lakesidehotel.exception;

/**
 * @author Chandran Pillai
 */

public class RoleAlreadyExistException extends RuntimeException {
    public RoleAlreadyExistException(String message) {
        super(message);
    }
}
