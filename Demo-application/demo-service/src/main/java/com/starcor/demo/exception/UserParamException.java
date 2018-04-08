package com.starcor.demo.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 用户参数异常类
 * </p>
 *
 * @author meijie.song
 * @date 2018/4/8
 **/
@Data
@EqualsAndHashCode(callSuper = true)
public class UserParamException extends Exception {
    private String errCode;

    public UserParamException(String msg, String errCode) {
        super(msg);
        this.errCode = errCode;
    }
}
