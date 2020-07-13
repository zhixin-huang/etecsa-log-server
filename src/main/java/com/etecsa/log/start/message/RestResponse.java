package com.etecsa.log.start.message;

import lombok.Data;
import org.springframework.http.HttpStatus;

import java.io.Serializable;

/**
 * @author zhixin.huang
 * @date 2020/7/8 18:30
 */
@Data
public class RestResponse<T> implements Serializable {
    private static final long serialVersionUID = 1L;

    private String code;

    private String message;

    private T data;


    public RestResponse() {
    }

    public RestResponse(String code, String message) {
        this.code = code;
        this.message = message;
        this.data = null;
    }

    public RestResponse(String code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }


    public static <T> RestResponse<T> success(T data) {
        return new RestResponse<T>("200", HttpStatus.OK.name(), data);
    }


    public static <T> RestResponse<T> fail(ErrorCodeAndMsg errorCodeAndMsg) {
        return new RestResponse<T>(errorCodeAndMsg.getCode(), errorCodeAndMsg.getMsg());
    }
}
