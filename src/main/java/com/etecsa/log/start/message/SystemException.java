package com.etecsa.log.start.message;

public class SystemException extends RuntimeException{

	private static final long serialVersionUID = -6370612186038915645L;

    private final ErrorCodeAndMsg response;

    public SystemException(ErrorCodeAndMsg response) {
        this.response = response;
    }
    public ErrorCodeAndMsg getResponse() {
        return response;
    }
}
