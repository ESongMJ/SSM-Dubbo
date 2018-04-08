package com.starcor.demo.aspect;

import com.alibaba.fastjson.JSONObject;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * <p>
 * 服务层 日志切面
 * </p>
 *
 * @author meijie.song
 * @date 2018/4/8
 **/
@Aspect
@Component
public class LogAspect {

    /**
     *
     * @param joinPoint
     */
    @Before("execution(* com.starcor.demo.service.impl.*.*(..))")
    public void doLog(JoinPoint joinPoint){
        Object[] args=joinPoint.getArgs();
        MethodSignature methodSignature= (MethodSignature) joinPoint.getSignature();
        Method m=methodSignature.getMethod();
        Logger log= LoggerFactory.getLogger("RequestLogAspect$"+m.getDeclaringClass().getName()+":"+m.getName());
        //记录请求参数信息
        log.info("Parameters: "+ JSONObject.toJSONString(args));
    }
}
