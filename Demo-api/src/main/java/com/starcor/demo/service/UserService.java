package com.starcor.demo.service;

import com.github.pagehelper.Page;
import com.starcor.common.result.Result;
import com.starcor.demo.param.UserPageParam;
import com.starcor.demo.param.UserParam;
import com.starcor.demo.result.UserResult;

/**
 * <p>
 * </p>
 *
 * @author meijie.song
 * @date 2018/4/8
 * @time 下午 6:07
 **/
public interface UserService {

    /**
     * @param userpageParam
     * @return
     */
    Result<Page<UserResult>> list(UserPageParam userpageParam);

    /**
     * @param userParam
     * @return
     */
    Result<Void> insert(UserParam userParam);

    /**
     * @param userParam
     * @return
     */
    Result<Void> update(UserParam userParam);

    /**
     * @param userId
     * @return
     */
    Result<Void> delete(Long userId);
}
