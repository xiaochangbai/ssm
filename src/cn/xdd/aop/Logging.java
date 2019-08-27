package cn.xdd.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author xchb
 * @version 1.0
 * @ClassName Logging
 * @description 切面
 * @createTime 2019年08月27日 21:38
 */
@Component
@Aspect
public class Logging {
    /**
     * 配置后置通知
     */
    //配置切入点
    @AfterReturning("execution(* cn.xdd.service.impl.*.*(..))")
    public void beforLogging(){
        System.err.println("日志："+new Date());
    }

    /**
     * 配置环绕通知
     * @param joinPoint 切入点对象
     */
    @Around("execution(* cn.xdd.service.impl.*.*(..))")
    public Object aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        long start=System.currentTimeMillis();  //切入点方法执行前
        Object object=joinPoint.proceed();   //切入点方法执行
        long end=System.currentTimeMillis();  //切入点方法执行后
        System.out.println("耗时:"+(end-start)+"毫秒");
        return object;
    }


}
