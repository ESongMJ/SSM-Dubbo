package com.starcor.demo.controller;

import com.starcor.demo.service.UserService;
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
@RestController
public class UserController extends BaseController {
    @Resource
    private UserService userService;
}
