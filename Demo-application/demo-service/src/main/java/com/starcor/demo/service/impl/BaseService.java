package com.starcor.demo.service.impl;

import com.github.pagehelper.Page;
import com.starcor.admin.util.BeanMapUtils;
import com.starcor.common.page.PageSet;
import com.starcor.demo.param.PageParam;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 基础服务类
 * </p>
 *
 * @author meijie.song
 * @date 2018/4/9
 **/
public class BaseService {
    /**
     * 分页条件封装成map
     *
     * @param pageParam
     * @return
     */
    public static final Map<String, Object> pageParamToMap(PageParam pageParam) {

        Map<String, Object> paramter = BeanMapUtils.toMap(pageParam);

        Integer pageSize = pageParam.getPageSize();
        Integer currentPage = pageParam.getCurrentPage();

        if (null == pageSize || pageSize < 1) {
            pageSize = 10;
        }
        if (null == currentPage || currentPage < 1) {
            currentPage = 1;
        }
        paramter.put("pageSize", pageSize);
        paramter.put("pageNum", currentPage);
        return paramter;
    }

    /**
     * 分页结果封装
     * @param data 列表数据
     * @param page
     * @param <T>
     * @return
     */
    public static final <T> PageSet<T> getPageResult(List<T> data, Page page){
        PageSet<T> pageSet=new PageSet<>((int)page.getTotal(),page.getPageNum(),page.getPageSize());
        Integer index=page.getPageSize()*(page.getPageNum()-1);
        //列表数据设置index
        for (T obj: data) {
            BeanWrapper bean=new BeanWrapperImpl(obj);
            if(bean.isWritableProperty("index")){
                bean.setPropertyValue("index",++index);
            }
        }
        pageSet.setPageData(data);
        return pageSet;
    }
}
