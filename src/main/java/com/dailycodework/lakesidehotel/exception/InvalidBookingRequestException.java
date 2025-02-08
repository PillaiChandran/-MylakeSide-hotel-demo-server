package com.dailycodework.lakesidehotel.exception;

/**
 * @author Chandran Pillai
 */

public class InvalidBookingRequestException extends RuntimeException {
    public InvalidBookingRequestException(String message) {
        super(message);
    }
}
