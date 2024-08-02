package spotbugs.aot.test.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class SpotBugsAotAspect {

    @Around("@annotation(startAnnotation)")
    public Object startAnnotation(ProceedingJoinPoint joinPoint, StartAnnotation startAnnotation) throws Throwable {
        return joinPoint.proceed();
    }

    @Around("@annotation(endAnnotation)")
    public Object endAnnotation(ProceedingJoinPoint joinPoint, StartAnnotation endAnnotation) throws Throwable {
        return joinPoint.proceed();
    }
}
