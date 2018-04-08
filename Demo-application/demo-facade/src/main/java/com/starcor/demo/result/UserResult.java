package com.starcor.demo.result;

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
public class UserResult implements Serializable{
    private String id;
    private String name;
    private String number;
    private String role;
}
