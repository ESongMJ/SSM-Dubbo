package com.starcor.demo.data.impl;

import com.github.pagehelper.Page;
import com.starcor.demo.dao.UserMapper;
import com.starcor.demo.data.UserData;
import com.starcor.demo.dto.UserDto;
import com.starcor.demo.model.User;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * <p>
 * 用户数据访问类
 * </p>
 *
 * @author meijie.song
 * @date 2018/4/8
 **/
@Service
public class UserDataImpl implements UserData {
    @Resource
    private UserMapper userMapper;

    @Override
    public Page<UserDto> list(Map<String,Object> map) {
        Page<User> userPage = userMapper.list(map);
        List<User> userList = userPage.getResult();
        List<UserDto> dtoList = userList.stream().map(user -> {
            UserDto userDto = new UserDto();
            BeanUtils.copyProperties(user, userDto);
            return userDto;
        }).collect(Collectors.toList());
        Page<UserDto> dtoPage = new Page<>();
        BeanUtils.copyProperties(userPage, dtoPage);
        dtoPage.addAll(dtoList);
        return dtoPage;
    }

    @Override
    public void insert(UserDto userDto) {

    }

    @Override
    public void update(UserDto userDto) {

    }

    @Override
    public void delete(Long userId) {

    }
}
