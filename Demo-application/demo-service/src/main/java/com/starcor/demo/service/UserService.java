package com.starcor.demo.service;

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
     * @param userParam
     * @return
     */
    List<UserResult> list(UserParam userParam);

    /**
     *
     * @param userParam
     * @return
     */
    Integer insert(UserParam userParam);

    /**
     *
     * @param userParam
     * @return
     */
    Integer update(UserParam userParam);

    /**
     *
     * @param userId
     * @return
     */
    Integer delete(Long userId);
}
