package com.rd.batch.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author
 * @create 2020-09-09-14:44
 */
@Aspect
@Component
public class ServiceLogAspect {

    private  static  final Logger log = LoggerFactory.getLogger("ServiceLogAspect.class");



    @Around("execution(* com.rd.batch.service.impl..*.*(..)))")
    public  Object recordTimelog(ProceedingJoinPoint joinPoint) throws Throwable {
        log.info("========= 开始执行 {}.{} ===========",joinPoint.getTarget().getClass(),joinPoint.getSignature().getName());

        //记录开始时间
        long begin = System.currentTimeMillis();

        //执行目标service
        Object result =joinPoint.proceed();

        //记录结束时间
        long end = System.currentTimeMillis();
        long takeTime = end - begin;

        if(takeTime > 3000){
            log.error("=======执行结束：耗时：{} 毫秒=======",takeTime);
        }else if (takeTime > 2000){
            log.warn("=======执行结束：耗时：{} 毫秒=======",takeTime);
        }else{
            log.info("========= 执行结束，耗时：{} 毫秒 =========", takeTime);
        }

        return  result;
    }
}
