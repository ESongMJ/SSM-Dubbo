package com.starcor.demo.dao;

import com.github.pagehelper.Page;
import com.starcor.demo.model.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

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
    void insert(User user);

    /**
     * 查询用户列表
     *
     * @param map
     * @return
     */
    Page<User> list(Map<String,Object> map);

    /**
     * 更新用户
     *
     * @param user
     * @return
     */
    void update(User user);

    /**
     * 删除用户
     *
     * @param id
     * @return
     */
    void delete(Long id);
}
