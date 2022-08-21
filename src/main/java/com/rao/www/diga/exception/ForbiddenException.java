package com.rao.www.diga.exception;

/**
 * @author Rao QingLong
 * 自定义权限异常
 */
public class ForbiddenException extends RuntimeException {
    public ForbiddenException(String message) {
        super(message);
    }
}