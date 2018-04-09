package com.starcor.demo.data;

import com.github.pagehelper.Page;
import com.starcor.demo.dto.UserDto;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * </p>
 *
 * @author meijie.song
 * @date 2018/4/8
 * @time 下午 3:20
 **/
public interface UserData {
    /**
     *
     * @param map
     * @return
     */
    Page<UserDto> list(Map<String,Object> map);

    /**
     *
     * @param userDto
     * @return
     */
    void insert(UserDto userDto);

    /**
     *
     * @param userDto
     * @return
     */
    void update(UserDto userDto);

    /**
     *
     * @param userId
     * @return
     */
    void delete(Long userId);
}
