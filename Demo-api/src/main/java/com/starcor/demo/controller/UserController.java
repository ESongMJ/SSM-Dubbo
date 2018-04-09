package com.starcor.demo.controller;

import com.github.pagehelper.Page;
import com.starcor.common.result.Result;
import com.starcor.demo.controller.base.BaseController;
import com.starcor.demo.controller.base.BaseResponse;
import com.starcor.demo.enums.CommonCode;
import com.starcor.demo.enums.ResponseCode;
import com.starcor.demo.param.UserPageParam;
import com.starcor.demo.result.UserResult;
import com.starcor.demo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 * 用户控制器
 * </p>
 *
 * @author meijie.song
 * @date 2018/4/8
 **/
@Controller
@RequestMapping("/user")
public class UserController extends BaseController{
    @Resource
    private UserService userService;

    @RequestMapping("/page")
    @ResponseBody
    public BaseResponse userPage(UserPageParam userPageParam) {
        Result<Page<UserResult>> userResult = userService.list(userPageParam);
        if (CommonCode.HAND_SUCCESS.getCode().equals(userResult.getCode())) {
            return view(ResponseCode.SUCCESS.getCode(),ResponseCode.SUCCESS.getMsg(),userResult.getData());
        }
        return view(ResponseCode.FAILED.getCode(),ResponseCode.FAILED.getMsg(),null);
    }
}
