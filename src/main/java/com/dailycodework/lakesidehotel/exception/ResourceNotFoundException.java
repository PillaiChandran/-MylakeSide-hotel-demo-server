package com.dailycodework.lakesidehotel.exception;

/**
 * @author Chandran Pillai
 */

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String message) {
        super(message);
    }
}
