package com.starcor.demo.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 用户实体类
 * </p>
 *
 * @author meijie.song
 * @date 2018/3/9
 **/
@Data
public class UserDto implements Serializable {
    private String id;
    private String name;
    private String number;
    private String role;
}
