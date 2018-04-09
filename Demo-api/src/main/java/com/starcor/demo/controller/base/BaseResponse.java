package com.starcor.demo.controller.base;

import lombok.Data;

import java.io.Serializable;

/**
 * @desc 响应基础对象
 * @author lj
 * @date 2017/8/4 17:48
 */
@Data
public class BaseResponse implements Serializable{
    private static final long serialVersionUID = 1L;

    public static final Integer DEBUG = 0;
    public static final Integer INFO = 1;
    public static final Integer WARNING = 2;
    public static final Integer ERROR = 3;
    public static final Integer FATAL = 4;

    private String code;
    private Integer level = INFO;
    private String message;
    private Object data;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
}
