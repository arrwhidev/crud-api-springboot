package com.arrwhi.crudapi.web.response;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

/**
 * Created by arran on 12/02/17.
 */
public class ResponseHelper {
    public static <T> HttpEntity OK(T response) {
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    public static HttpEntity NO_CONTENT() {
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    public static HttpEntity BAD_REQUEST() {
        return new ResponseEntity(HttpStatus.BAD_REQUEST);
    }

    public static HttpEntity NOT_FOUND() {
        return new ResponseEntity(HttpStatus.NOT_FOUND);
    }
}
