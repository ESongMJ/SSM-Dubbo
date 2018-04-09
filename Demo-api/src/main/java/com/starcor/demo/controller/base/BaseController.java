package com.starcor.demo.controller.base;

import com.starcor.common.result.Result;
import lombok.extern.slf4j.Slf4j;
/**
 * @desc 基础控制器
 * @author lj
 * @date 2017/8/4 17:41
 */
@Slf4j
public class BaseController {

    /**
     * @param code
     * @param message
     * @param data
     * @return
     */
    public static BaseResponse view(String code,String message, Object data) {
        return view(code, Result.INFO, message, data);
    }

    public static BaseResponse view(String code,Integer level,String message, Object data) {
        BaseResponse baseResponse = new BaseResponse();

        baseResponse.setCode(code);
        baseResponse.setLevel(level);
        baseResponse.setMessage(message);
        baseResponse.setData(data);

        return baseResponse;
    }

}
