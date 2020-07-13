package com.etecsa.log.start.message;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
@Slf4j
public class ExceptionHandler {

	@org.springframework.web.bind.annotation.ExceptionHandler(SystemException.class)
    @ResponseBody
    public <T> ErrorResponse<T> handleSystemException(HttpServletRequest request, SystemException ex) {
		ErrorResponse<T> response;
        log.error("systemException code:{},msg:{}",ex.getResponse().getCode(),ex.getResponse().getMsg());
        response = new ErrorResponse<T>(ex.getResponse().getCode(),ex.getResponse().getMsg());
        return response;
    }

    @org.springframework.web.bind.annotation.ExceptionHandler(Exception.class)
    @ResponseBody
    public <T> ErrorResponse<T> handleException(HttpServletRequest request, Exception ex) {
    	ErrorResponse<T> response;
        log.error("exception code:{},error:{}",ex.getMessage());
        response = new ErrorResponse<T>(ErrorCodeAndMsg.SYSTEM_ERROR_CODE_MESSAGE.getCode(), ErrorCodeAndMsg.SYSTEM_ERROR_CODE_MESSAGE.getMsg()+"["+ex.getMessage()+"]") ;
        return response;
    }
}
