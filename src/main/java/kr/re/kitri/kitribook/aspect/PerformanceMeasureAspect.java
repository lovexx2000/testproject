package kr.re.kitri.kitribook.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.net.http.HttpRequest;

@Aspect
@Component
@Order(1000)
public class PerformanceMeasureAspect {

    @Around("execution(* kr.re.kitri.kitribook.controller.*.*(..))")
    public Object measureMethodRunningTime(ProceedingJoinPoint joinPoint) throws Throwable {
        String clsName =joinPoint.getSignature().getDeclaringTypeName();
        String methodName = joinPoint.getSignature().getName();


        long startTime =System.currentTimeMillis();

        //실제로 메서드를 수행한다
        Object targetMethod =joinPoint.proceed();
        long endTime = System.currentTimeMillis();

        long estimatedTime = endTime - startTime;
        System.out.println(clsName + " . " + methodName + "메서드의 실행시간은 " + estimatedTime +"밀리초 입니다.");;
        return targetMethod;
    }
}
