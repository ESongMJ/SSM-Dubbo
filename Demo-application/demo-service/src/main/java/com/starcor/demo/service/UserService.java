package com.starcor.demo.service;

import com.github.pagehelper.Page;
import com.starcor.demo.param.UserPageParam;
import com.starcor.demo.param.UserParam;
import com.starcor.demo.result.UserResult;

import java.util.List;

/**
 * <p>
 * </p>
 *
 * @author meijie.song
 * @date 2018/4/8
 * @time 下午 3:18
 **/
public interface UserService {
    /**
     *
     * @param userPageParam
     * @return
     */
    Page<UserResult> list(UserPageParam userPageParam);

    /**
     *
     * @param userParam
     * @return
     */
    void insert(UserParam userParam);

    /**
     *
     * @param userParam
     * @return
     */
    void update(UserParam userParam);

    /**
     *
     * @param userId
     * @return
     */
    void delete(Long userId);
}
