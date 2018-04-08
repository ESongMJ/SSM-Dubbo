package com.starcor.demo.enums;

import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * </p>
 *
 * @author meijie.song
 * @date 2018/4/8
 * @time 下午 3:44
 **/
public enum ResponseCode {
    SUCCESS("成功", "0"),
    FAILED("失败", "1"),
    ERROR("错误", "2");
    @Getter
    @Setter
    private String msg;
    @Getter
    @Setter
    private String code;

    ResponseCode(String msg, String code) {
        this.msg = msg;
        this.code = code;
    }
}
