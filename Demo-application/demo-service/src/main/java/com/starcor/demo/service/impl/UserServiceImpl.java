package com.starcor.demo.service.impl;

import com.starcor.demo.data.UserData;
import com.starcor.demo.param.UserParam;
import com.starcor.demo.result.UserResult;
import com.starcor.demo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 用户服务类
 * </p>
 *
 * @author meijie.song
 * @date 2018/4/8
 **/
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserData userData;

    @Override
    public List<UserResult> list(UserParam userParam) {
        return null;
    }

    @Override
    public Integer insert(UserParam userParam) {
        return null;
    }

    @Override
    public Integer update(UserParam userParam) {
        return null;
    }

    @Override
    public Integer delete(Long userId) {
        return null;
    }
}