package com.starcor.demo.service.impl;

import com.github.pagehelper.Page;
import com.starcor.demo.data.UserData;
import com.starcor.demo.dto.UserDto;
import com.starcor.demo.param.UserPageParam;
import com.starcor.demo.param.UserParam;
import com.starcor.demo.result.UserResult;
import com.starcor.demo.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

/**
 * <p>
 * 用户服务类
 * </p>
 *
 * @author meijie.song
 * @date 2018/4/8
 **/
@Service
public class UserServiceImpl extends BaseService implements UserService {
    @Resource
    private UserData userData;

    @Override
    public Page<UserResult> list(UserPageParam userPageParam) {
        Page<UserDto> dtoPage = userData.list(pageParamToMap(userPageParam));
        List<UserDto> listDto = dtoPage.getResult();
        List<UserResult> listResult = listDto.stream().map(userDto -> {
            UserResult userResult = new UserResult();
            BeanUtils.copyProperties(userDto, userResult);
            return userResult;
        }).collect(Collectors.toList());
        Page<UserResult> resultPage = new Page<>();
        BeanUtils.copyProperties(dtoPage, resultPage);
        resultPage.addAll(listResult);
        return resultPage;
    }

    @Override
    public void insert(UserParam userParam) {

    }

    @Override
    public void update(UserParam userParam) {

    }

    @Override
    public void delete(Long userId) {

    }
}
