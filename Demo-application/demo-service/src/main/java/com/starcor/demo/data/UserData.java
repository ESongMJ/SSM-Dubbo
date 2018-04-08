package com.starcor.demo.data;

import com.starcor.demo.dto.UserDto;

import java.util.List;

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
     * @param userDto
     * @return
     */
    List<UserDto> list(UserDto userDto);

    /**
     *
     * @param userDto
     * @return
     */
    Integer insert(UserDto userDto);

    /**
     *
     * @param userDto
     * @return
     */
    Integer update(UserDto userDto);

    /**
     *
     * @param userId
     * @return
     */
    Integer delete(Long userId);
}
