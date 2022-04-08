package aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 4/6/2022
 * @Time at 10:59 PM
 */

@Aspect
@Component
public class HelloServiceAspect {

    @Before("execution(* service.HelloService.hello(..))")
    public void before() {
        System.out.println("A");
    }

    @After("execution(* service.HelloService.hello(..))")
    public void after() {
        System.out.println("B");
    }

    @AfterReturning("execution(* service.HelloService.hello(..))")
    public void afterReturning() {
        System.out.println("C");
    }

    @AfterThrowing("execution(* service.HelloService.hello(..))")
    public void afterThrowing() {

    }

    @Around("execution(* service.HelloService.hello(..))")
    public Object around(ProceedingJoinPoint joinPoint) {
        System.out.println("A");
        Object result = null;
        try {
            result = joinPoint.proceed(new Object[]{"Bill"});
            System.out.println("B");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return result;
    }
}
