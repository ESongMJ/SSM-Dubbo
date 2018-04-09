package com.starcor.demo;

import com.github.pagehelper.Page;
import com.starcor.common.result.Result;
import com.starcor.demo.facade.UserFacade;
import com.starcor.demo.param.UserPageParam;
import com.starcor.demo.result.UserResult;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * <p>
 * 服务消费者启动类
 * </p>
 *
 * @author meijie.song
 * @date 2018/4/9
 **/
public class DemoAPI {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("dubbo-demo-consumer.xml");
        System.out.println(context.getDisplayName() + ": here");
        context.start();
        System.out.println("服务已经注册...");
        UserFacade userFacade = context.getBean(UserFacade.class);
        UserPageParam userPageParam = new UserPageParam();
        userPageParam.setPageSize(10);
        userPageParam.setCurrentPage(1);
        Result<Page<UserResult>> resultPage = userFacade.list(userPageParam);
        System.out.println(resultPage.toString());
    }
}
