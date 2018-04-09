package com.starcor.demo.param;

import lombok.Data;

import java.io.Serializable;

/**
 * @desc 分页基础参数
 * @author lj
 * @date 2017/8/15 9:06
 */
@Data
public class PageParam implements Serializable{
    private static final long serialVersionUID = 1L;

    //当前页
    private Integer currentPage;
    //每页大小
    private Integer pageSize;
}
