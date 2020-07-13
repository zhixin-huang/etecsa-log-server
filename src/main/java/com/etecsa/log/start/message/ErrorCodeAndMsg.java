package com.etecsa.log.start.message;

public enum ErrorCodeAndMsg {

    SYSTEM_ERROR_CODE_MESSAGE("000000", "系统故障，请稍后重试或联系管理员"),
    PAGE_NO_ISNOT_NULL("500001", "当前页不能为空"),
    PAGE_SIZE_ISNOT_NULL("500002", "每页记录数不能为空"),
    SERVER_NAME_ERROR("500003","服务名称不能为空,且长度不能超过20"),
    SERVER_INSTANCE_ERROR("500004","服务名称不能为空,且长度不能超过20"),
    SERVER_METHOD_NOT_NULL("500005","调用方法名称不能为空"),
    OPERATOR_ID_ERROR("500006","操作人id不能为空,且长度不能超过64"),
    OPERATOR_NAME_ERROR("500007","操作人姓名不能为空,且长度不能超过20"),
    OPERATOR_TYPE_ERROR("500008","操作类型不能为空,且长度不能超过20"),
    OPERATOR_MOULD_ERROR("500009","操作模块不能为空,且长度不能超过20")
    ;

    private String code;
    private String msg;

    ErrorCodeAndMsg(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
