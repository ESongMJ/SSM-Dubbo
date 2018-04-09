package com.starcor.demo.enums;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @desc 访问响应枚举
 * @author lj
 * @date 2017/8/7 14:25
 */
public enum CommonCode {

    HAND_SUCCESS("0", "SUCCESS"),
    INTERNAL_ERROR("1509100001", "程序内部错误"),
    PARAM_ERROR("1509100002", "参数异常"),
    URL_NOT_EXISTS("1509100003", "URL不存在"),
    AUTH_ERROR("1509100004", "未认证用户"),
    RPC_SERVICE_ERROR("1509100005", "服务繁忙，请稍后再试"),
    BIND_INFO_ERROR("1509100006", "用户绑定信息异常"),;

    private CommonCode(String code, String message) {
        this.code = code;
        this.message = message;
    }
    @Getter
    @Setter
    private String code;
    @Getter
    @Setter
    private String message;
}
