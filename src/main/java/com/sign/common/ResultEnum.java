package com.sign.common;

public enum ResultEnum implements CommonResult{
    SUCCESS(0000, "成功。"),

    NULL_PARAM_ERROR(1001,"参数不能为空。"),
    USER_ID_ERROR(1002,"身份证号已经存在。"),
    USER_ID_NOT_REPEAT_ERROR(1003,"两次身份证号不一致。"),

    UNKNOWN_ERROR(9999,"未知错误。"),
    PARAM_ERROR(9999,"未知错误。"),
    ;

    private Integer code;
    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    @Override
    public Integer getCode() {
        return code;
    }

    @Override
    public String getMsg() {
        return msg;
    }

    @Override
    public void setMsg(String msg) {
        this.msg = msg;
    }
}
