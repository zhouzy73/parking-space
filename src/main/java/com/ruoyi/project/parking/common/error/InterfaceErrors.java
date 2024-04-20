package com.ruoyi.project.parking.common.error;

public enum InterfaceErrors implements ServiceErrors {

    SYSTEM_ERROR("10001", "系统错误"),
    PARAM_ILLEGAL("10002", "提交参数不合法"),
    ;

    private String code;

    private String message;

    private InterfaceErrors(String code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
