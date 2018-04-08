package com.starcor.demo.dao;

import com.starcor.demo.model.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *     User DAO Mapper
 * </p>
 *
 * @author meijie.song
 * @date 2018/3/9
 * @time 下午 3:05
 **/
public interface UserMapper {
    /**
     * 插入用户
     *
     * @param user
     * @return
     */
    Integer insert(@Param("user") User user);

    /**
     * 查询用户列表
     *
     * @param user
     * @return
     */
    List<User> list(@Param("user") User user);

    /**
     * 更新用户
     *
     * @param user
     * @return
     */
    Integer update(@Param("user") User user);

    /**
     * 删除用户
     *
     * @param userId
     * @return
     */
    Integer delete(@Param("userId") Long userId);
}
