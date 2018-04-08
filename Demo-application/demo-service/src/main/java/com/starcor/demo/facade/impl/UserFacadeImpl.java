package com.starcor.demo.facade.impl;

import com.starcor.demo.facade.UserFacade;
import com.starcor.demo.param.UserParam;
import com.starcor.demo.result.UserResult;
import com.starcor.demo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

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
