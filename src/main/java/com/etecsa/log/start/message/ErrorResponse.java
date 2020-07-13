package com.etecsa.log.start.message;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@SuppressWarnings("deprecation")
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ErrorResponse<T> implements Serializable {

    private static final long serialVersionUID = -4505655308965878999L;

    /**
     * 请求成功返回码为：0000
     */
    private static final String SUCCESS_CODE = "0000";
    /**
     * 返回数据
     */
    private T data;
    /**
     * 返回码
     */
    private String code;
    /**
     * 返回描述
     */
    private String msg;

    public ErrorResponse() {
        this.code = SUCCESS_CODE;
        this.msg = "请求成功";
    }

    public ErrorResponse(String code, String msg) {
        this();
        this.code = code;
        this.msg = msg;
    }

    public ErrorResponse(String code, String msg, T data) {
        this();
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public ErrorResponse(T data) {
        this();
        this.data = data;
    }
}
