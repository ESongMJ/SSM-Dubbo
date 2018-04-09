package com.starcor.demo.param;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * </p>
 *
 * @author meijie.song
 * @date 2018/3/12
 * @time 下午 2:49
 **/
@Data
public class UserPageParam extends PageParam implements Serializable{
    private String id;
    private String name;
    private String number;
    private String role;
}
