package com.starcor.demo.data.impl;

import com.starcor.demo.dao.UserMapper;
import com.starcor.demo.data.UserData;
import com.starcor.demo.dto.UserDto;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 用户数据访问类
 * </p>
 *
 * @author meijie.song
 * @date 2018/4/8
 **/
@Service
public class UserDataImpl implements UserData{
    @Resource
    private UserMapper userMapper;

    @Override
    public List<UserDto> list(UserDto userDto) {
        return null;
    }

    @Override
    public Integer insert(UserDto userDto) {
        return null;
    }

    @Override
    public Integer update(UserDto userDto) {
        return null;
    }

    @Override
    public Integer delete(Long userId) {
        return null;
    }
}
