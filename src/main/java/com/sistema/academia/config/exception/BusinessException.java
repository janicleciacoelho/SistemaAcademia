package com.sistema.academia.config.exception;

/**
 * Exceção de negócio personalizada usada pela aplicação.
 */
public class BusinessException extends RuntimeException {

    public BusinessException(String message) {
        super(message);
    }

    public BusinessException(String message, Throwable cause) {
        super(message, cause);
    }
}

