package com.etecsa.log.start.message;

public enum ErrorCodeAndMsg {

    SYSTEM_ERROR_CODE_MESSAGE("000000", "系统故障，请稍后重试或联系管理员"),
    PAGE_NO_ISNOT_NULL("600001", "当前页不能为空"),
    PAGE_SIZE_ISNOT_NULL("600002", "每页记录数不能为空"),
    STARTTIME_ISAFTER_ENDTIME("600003", "开始时间不能大于结束时间"),
    TOPICID_ISNOT_NULL("600011", "主题id必须填写"),
    TOPICTYPE_ISNOT_NULL("600012", "主题类型必须填写"),
    FROMID_ISNOT_NULL("600013", "评价人id必须填写"),
    FROMNAME_ISNOT_NULL("600014", "评价人名称必须填写"),
    EVALUATETYPE_ISNOT_NULL("600015", "评价类型必须填写"),
    PARENTID_ISNOT_NULL("600016", "父类评价id必须填写"),
    EVALUATE_CONTENT_LENGTH("600017", "评价内容长度不得超过200个字"),
    EVALUATE_IMAGE_LENGTH("600018", "评价图片不得超过5张"),
    RULE_ANONYMOUS_ISNOT_NULL("600019", "评价规则是否匿名必须填写"),
    RULE_REPLY_ISNOT_NULL("600020", "评价规则是否允许回复必须填写"),
    RULE_LOW_EVALUATE_ISNOT_NULL("600021", "评价规则是否展示低评价必须填写"),
    RULE_EVALUATE_SCORE_ISNOT_NULL("600022", "评价规则低评价级别必须填写"),
    NOT_ALLOW_REPLY("600023", "该评论不允许回复"),
    NOT_ALLOW_ANONYMOUS("600024", "该评论不允许匿名"),
    EVALUATE_SCORE_ISNOT_NULL("600025", "评分必须填写"),
    RULE_ISNOT_EXIST("600101", "评价规则不存在"),
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
