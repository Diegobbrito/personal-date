package com.team3.personal_date.core.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class MeetExpiredException extends RuntimeException {
    public MeetExpiredException(String msg) {
        super(msg);
    }
}
