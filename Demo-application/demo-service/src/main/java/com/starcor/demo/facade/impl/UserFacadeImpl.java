package com.starcor.demo.facade.impl;

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
 * 用户接口实现类
 * </p>
 *
 * @author meijie.song
 * @date 2018/4/8
 **/
@Service("userFacade")
public class UserFacadeImpl extends BaseFacade implements UserFacade {
    @Resource
    private UserService userService;

    @Override
    public Result<Page<UserResult>> list(UserPageParam userpageParam) {
        Result<Page<UserResult>> result = new Result<>();
        Page<UserResult> page = userService.list(userpageParam);
        result.setData(page);
        return result;
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
