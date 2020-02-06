package kr.re.kitri.kitribook.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* kr.re.kitri.kitribook.service.*.*(..))")
    public void logBefore(JoinPoint joinPoint ){
        String clsName =joinPoint.getSignature().getDeclaringTypeName();
        String methodName = joinPoint.getSignature().getName();
        System.out.println(clsName +"." + methodName+"메서드에서 AOP 로그를 남긴다." );

    }


}
