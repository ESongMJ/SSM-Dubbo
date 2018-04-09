package com.starcor.demo.service.impl;

import com.github.pagehelper.Page;
import com.starcor.common.result.Result;
import com.starcor.demo.facade.UserFacade;
import com.starcor.demo.param.UserPageParam;
import com.starcor.demo.param.UserParam;
import com.starcor.demo.result.UserResult;
import com.starcor.demo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 * 用户服务实现类
 * </p>
 *
 * @author meijie.song
 * @date 2018/4/8
 **/
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserFacade userFacade;


    @Override
    public Result<Page<UserResult>> list(UserPageParam userpageParam) {
        return userFacade.list(userpageParam);
    }

    @Override
    public Result<Void> insert(UserParam userParam) {
        return null;
    }

    @Override
    public Result<Void> update(UserParam userParam) {
        return null;
    }

    @Override
    public Result<Void> delete(Long userId) {
        return null;
    }
}
